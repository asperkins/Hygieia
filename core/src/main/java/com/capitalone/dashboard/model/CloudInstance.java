package com.capitalone.dashboard.model;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Represents an EC2 instance from AWS
 */
@Document(collection = "cloud_instance")
public class CloudInstance {
    @Indexed
    private String instanceId;
    private ObjectId collectorItemId;
    private String instanceType;
    private String imageId;
    private long imageExpirationDate;
    private boolean imageApproved;
    private String instanceOwner;
    private boolean isMonitored;
    private String privateDns;
    private String privateIp;
    private String publicDns;
    private String publicIp;
    private String subnetId;
    private String virtualNetworkId;
    private int age;
    private boolean isEncrypted;
    private String status;
    private boolean isStopped;
    private boolean isTagged;
    private double cpuUtilization;
    private Date timestamp;
    private List<String> securityGroups = new ArrayList<>();
    private Map<String, String> tags = new HashMap<>();
    private double networkIn;
    private double networkOut;
    private double diskRead;
    private double diskWrite;
    private String rootDeviceName;


    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isEncrypted() {
        return isEncrypted;
    }

    public void setEncrypted(boolean isEncrypted) {
        this.isEncrypted = isEncrypted;
    }

    public boolean isStopped() {
        return isStopped;
    }

    public void setStopped(boolean isStopped) {
        this.isStopped = isStopped;
    }

    public boolean isTagged() {
        return isTagged;
    }

    public void setTagged(boolean isTagged) {
        this.isTagged = isTagged;
    }

    public double getCpuUtilization() {
        return cpuUtilization;
    }

    public void setCpuUtilization(double cpuUtilization) {
        this.cpuUtilization = cpuUtilization;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public boolean isMonitored() {
        return isMonitored;
    }

    public void setMonitored(boolean isMonitored) {
        this.isMonitored = isMonitored;
    }

    public String getPrivateDns() {
        return privateDns;
    }

    public void setPrivateDns(String privateDns) {
        this.privateDns = privateDns;
    }

    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public String getPublicDns() {
        return publicDns;
    }

    public void setPublicDns(String publicDns) {
        this.publicDns = publicDns;
    }

    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public String getVirtualNetworkId() {
        return virtualNetworkId;
    }

    public void setVirtualNetworkId(String virtualNetworkId) {
        this.virtualNetworkId = virtualNetworkId;
    }

    public List<String> getSecurityGroups() {
        return securityGroups;
    }

    public void addSecurityGroups(String securityGroupName) {
        this.securityGroups.add(securityGroupName);
    }

    public String getRootDeviceName() {
        return rootDeviceName;
    }

    public void setRootDeviceName(String rootDeviceName) {
        this.rootDeviceName = rootDeviceName;
    }

    public double getNetworkIn() {
        return networkIn;
    }

    public void setNetworkIn(double networkIn) {
        this.networkIn = networkIn;
    }

    public double getNetworkOut() {
        return networkOut;
    }

    public void setNetworkOut(double networkOut) {
        this.networkOut = networkOut;
    }

    public double getDiskRead() {
        return diskRead;
    }

    public void setDiskRead(double diskRead) {
        this.diskRead = diskRead;
    }

    public double getDiskWrite() {
        return diskWrite;
    }

    public void setDiskWrite(double diskWrite) {
        this.diskWrite = diskWrite;
    }

    public long getImageExpirationDate() {
        return imageExpirationDate;
    }

    public void setImageExpirationDate(long imageExpirationDate) {
        this.imageExpirationDate = imageExpirationDate;
    }

    public boolean isImageApproved() {
        return imageApproved;
    }

    public void setImageApproved(boolean imageApproved) {
        this.imageApproved = imageApproved;
    }

    public String getInstanceOwner() {
        return instanceOwner;
    }

    public void setInstanceOwner(String instanceOwner) {
        this.instanceOwner = instanceOwner;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Map<String, String> getTags() {
        return tags;
    }

    public ObjectId getCollectorItemId() {
        return collectorItemId;
    }

    public void setCollectorItemId(ObjectId collectorItemId) {
        this.collectorItemId = collectorItemId;
    }
}