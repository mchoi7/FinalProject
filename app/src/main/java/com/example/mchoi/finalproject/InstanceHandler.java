package com.example.mchoi.finalproject;

import java.util.ArrayList;

/**
 * Created by mchoi on 5/24/2016.
 */
public class InstanceHandler {
    ArrayList<Instance> instanceList;

    public InstanceHandler() {
        instanceList = new ArrayList<>();
    }

    public void addInstance(Instance instance) {
        instanceList.add(instance);
    }

    public void removeInstance(Instance instance) {
        instanceList.remove(instance);
    }
}
