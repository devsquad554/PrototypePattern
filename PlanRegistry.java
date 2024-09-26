package com.example.prototype;

import java.util.HashMap;
import java.util.Map;

public class PlanRegistry {
    private Map<String, SubscriptionPlan> registry = new HashMap<>();

    public void addPlan(String planName, SubscriptionPlan plan) {
        registry.put(planName, plan);
    }

    public SubscriptionPlan getPlan(String planName) {
        SubscriptionPlan plan = registry.get(planName);
        return plan != null ? plan.clone() : null;
    }
}
