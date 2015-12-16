package io.cattle.platform.configitem.context.data.metadata.common;

import java.util.List;

public class DefaultMetaData {
    String version;
    List<ContainerMetaData> containers;
    List<ServiceMetaData> services;
    List<StackMetaData> stacks;
    List<HostMetaData> hosts;
    HostMetaData host;

    public DefaultMetaData(String version, List<ContainerMetaData> containers, List<ServiceMetaData> services,
            List<StackMetaData> stacks, List<HostMetaData> hosts, HostMetaData host) {
        super();
        this.version = version;
        this.containers = containers;
        this.services = services;
        this.stacks = stacks;
        this.hosts = hosts;
        this.host = host;
    }

    public List<ContainerMetaData> getContainers() {
        return containers;
    }

    public void setContainers(List<ContainerMetaData> containers) {
        this.containers = containers;
    }

    public List<ServiceMetaData> getServices() {
        return services;
    }

    public void setServices(List<ServiceMetaData> services) {
        this.services = services;
    }

    public List<StackMetaData> getStacks() {
        return stacks;
    }

    public void setStacks(List<StackMetaData> stacks) {
        this.stacks = stacks;
    }

    public List<HostMetaData> getHosts() {
        return hosts;
    }

    public void setHosts(List<HostMetaData> hosts) {
        this.hosts = hosts;
    }

    public HostMetaData getHost() {
        return host;
    }

    public void setHost(HostMetaData host) {
        this.host = host;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
