package org.onlab.onos.net.resource;

import org.onlab.onos.net.Link;

/**
 * Representation of allocated link resources.
 */
public interface LinkResourceAllocations extends LinkResourceRequest {
    /**
     * Returns allocated resource for the given link.
     *
     * @param link the target link
     * @return allocated resource for the link
     */
    ResourceAllocation getResourceAllocation(Link link);
}
