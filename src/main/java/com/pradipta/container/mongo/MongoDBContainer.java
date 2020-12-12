package com.pradipta.container.mongo;

import org.testcontainers.containers.GenericContainer;

import javax.validation.constraints.NotNull;

public class MongoDBContainer extends GenericContainer<MongoDBContainer> {
    public static final int MONGODB_DEFAULT_PORT = 27017;
    public static final String DEFAULT_IMAGE_AND_TAG = "mongo:3.2.4";

    public MongoDBContainer() {
        this(DEFAULT_IMAGE_AND_TAG);
    }

//    public void start() {
//        this.start();
//    }

    public MongoDBContainer(String image) {
        super(image);
        addExposedPort(MONGODB_DEFAULT_PORT);
    }

    @NotNull
    public Integer getPort() {
        return getMappedPort(MONGODB_DEFAULT_PORT);
    }

    @NotNull
    public String getConnectionString() {
        return "mongodb://" + this.getContainerIpAddress() + ":" + this.getFirstMappedPort();
    }
}
