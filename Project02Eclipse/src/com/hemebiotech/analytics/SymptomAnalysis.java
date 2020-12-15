package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 *  class SymptomAnalysis
 * -------------------------
 * Process symptoms
 *
 */

public class SymptomAnalysis {

    // Constructor
    public SymptomAnalysis() {
    };

    /**
     * Method CountNumberOfSymptom ()
     *
     * @return Map<String, Integer> TableOfSymptoms : Symptoms names and number of symptoms associated.
     */

    public Map<String, Integer> CountNumberOfSymptom(List<String> symptoms) {
        Map<String, Integer> symptomsMap = new TreeMap<String, Integer>();

        symptoms.forEach(name -> {
           symptomsMap.putIfAbsent(name, (int) symptoms.stream().filter(t -> t.equals(name)).count());
        });

        return symptomsMap;
    }
}

