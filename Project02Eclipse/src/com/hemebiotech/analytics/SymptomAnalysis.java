package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *  class SymptomAnalysis
 * -------------------------
 * Process symptoms
 *
 */

public class SymptomAnalysis {

    /**
     * Constructor
     * IN : List of Strings
     */

    public SymptomAnalysis() {
    }

    ;

    /**
     * Method CountNumberOfSymptom ()
     *
     * @return Map<String, Integer> TableOfSymptoms : Symptoms names and number of symptoms associated.
     */

    public Map<String, Integer> CountNumberOfSymptom(List<String> l_symptoms) {
        List<String> l_Symptoms = l_symptoms;
        Map<String, Integer> TableOfSymptoms = new TreeMap<String, Integer>();

        l_Symptoms.forEach(name -> {
            TableOfSymptoms.computeIfPresent(name,(key,val) -> val + 1);
            TableOfSymptoms.putIfAbsent(name,1);
        });

        return TableOfSymptoms;
    }
}

