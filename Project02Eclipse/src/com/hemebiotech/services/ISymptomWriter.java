package com.hemebiotech.services;

import java.util.Map;

/**
 * Interface ISymptomWriter
 * -------------------------
 * Anything that will write out symptom data
 * The important part is, the return value from the operation, is boolean
 *
 */

public interface ISymptomWriter {
    /**
     *
     * @return a boolean set to true is all Symptoms obtained from a data source have been write out
     * if a problem occurs return false.
     */
    boolean PrintOutSymptoms (Map<String,Integer> l_allSymptomsCount);

}
