package com.example.prototype;

import java.util.Arrays;

public class PrototypeApp {
    public static void main(String[] args) {
        // Create original Netflix plans
        NetflixPlan basicPlan = new NetflixPlan("Basic", Arrays.asList("Watch in SD", "1 Screen"));
        NetflixPlan premiumPlan = new NetflixPlan("Premium", Arrays.asList("Watch in 4K", "4 Screens", "Downloadable content"));

        // Add the plans to the registry
        PlanRegistry registry = new PlanRegistry();
        registry.addPlan("Basic", basicPlan);
        registry.addPlan("Premium", premiumPlan);

        // Clone the premium plan from the registry
        NetflixPlan clonedPlan = (NetflixPlan) registry.getPlan("Premium");

        // Display original and cloned plans
        System.out.println("Original Plan: " + premiumPlan);
        System.out.println("Cloned Plan: " + clonedPlan);

        // Modify cloned plan features
        clonedPlan.getFeatures().add("Exclusive content");

        // Display the plans after modification
        System.out.println("After modifying the cloned plan's features:");
        System.out.println("Original Plan: " + premiumPlan);
        System.out.println("Cloned Plan: " + clonedPlan);
    }
}
