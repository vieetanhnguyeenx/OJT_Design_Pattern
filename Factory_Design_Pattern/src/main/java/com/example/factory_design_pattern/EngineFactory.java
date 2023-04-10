package com.example.factory_design_pattern;

public class EngineFactory {
    public Engine getEngine(String engineType) {
        if (engineType == null || engineType.trim().isEmpty()) {
            return null;
        }
        if (engineType.trim().equalsIgnoreCase("VNEngine")) {
            return new VNEngine();
        } else if (engineType.trim().equalsIgnoreCase("CNEngine")) {
            return new CNEngine();
        } else if (engineType.trim().equalsIgnoreCase("LAEngine")) {
            return new LAEngine();
        }
        return null;
    }
}
