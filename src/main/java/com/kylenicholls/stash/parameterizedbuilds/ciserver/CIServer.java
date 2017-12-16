package com.kylenicholls.stash.parameterizedbuilds.ciserver;

import com.google.common.collect.ImmutableMap;
import com.kylenicholls.stash.parameterizedbuilds.item.Server;

import java.util.HashMap;
import java.util.Map;

public abstract class CIServer {

    Server server;
    Jenkins jenkins;

    String JENKINS_SETTINGS;
    static final String SERVER = "server";
    static final String ERRORS = "errors";
    static final String TESTMESSAGE = "testMessage";

    public abstract Map<String, Object> postSettings(boolean clearSettings);

    public Map<String, Object> testSettings() {
        Map<String, Object> testMessageMap = new HashMap<>();
        testMessageMap.put(TESTMESSAGE, testConnection());
        return renderMap(testMessageMap);
    }

    public ImmutableMap<String, Object> renderMap(){
        return renderMap(new HashMap<>());
    }

    public abstract ImmutableMap<String, Object> renderMap(Map<String, Object> renderOptions);

    private String testConnection(){
        return jenkins.testConnection(server);
    }
}
