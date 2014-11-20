/*
 * Copyright 2014 Open Networking Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onlab.onos.net.resource;

import java.util.Set;

import org.onlab.onos.net.Link;
import org.onlab.onos.net.intent.IntentId;

/**
 * Manages link resources.
 */
public interface LinkResourceStore {
    /**
     * Returns free resources for given link.
     *
     * @param link a target link
     * @return free resources for given link
     */
    Set<ResourceAllocation> getFreeResources(Link link);

    /**
     * Allocates resources.
     *
     * @param allocations resources to be allocated
     */
    void allocateResources(LinkResourceAllocations allocations);

    /**
     * Releases resources.
     *
     * @param allocations resources to be released
     */
    LinkResourceEvent releaseResources(LinkResourceAllocations allocations);

    /**
     * Returns resources allocated for an Intent.
     *
     * @param intentId the target Intent's ID
     * @return allocated resources
     */
    LinkResourceAllocations getAllocations(IntentId intentId);

    /**
     * Returns resources allocated for a link.
     *
     * @param link the target link
     * @return allocated resources
     */
    Iterable<LinkResourceAllocations> getAllocations(Link link);

    /**
     * Returns all allocated resources.
     *
     * @return allocated resources
     */
    Iterable<LinkResourceAllocations> getAllocations();
}
