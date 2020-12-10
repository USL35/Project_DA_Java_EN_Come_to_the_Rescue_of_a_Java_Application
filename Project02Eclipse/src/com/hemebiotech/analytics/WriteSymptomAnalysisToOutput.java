package com.hemebiotech.analytics;

import com.hemebiotech.services.ISymptomWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 *  class WriteSymptomAnalysisToOutput
 * -------------------------
 * write out symptoms
 *
 */

public class WriteSymptomAnalysisToOutput implements ISymptomWriter {

    /**
     *
     * Constructor
     * IN : l_allSymptomsCount is a Map<String,Integer> that contains Symptoms Name / Number of Symptoms counted
     */
    public WriteSymptomAnalysisToOutput() { };

    @Override
    /**
     *
     * Default print out to terminal
     * @return a boolean set to true is all Symptoms obtained from a data source have been write out
     * if a problem occurs return false.
     */

    public boolean PrintOutSymptoms(Map<String,Integer> l_allSymptomsCount) {

        Map<String,Integer> l_Symptoms = l_allSymptomsCount;

        Map<String,Integer> l_SymptomsOrdered = new TreeMap<String,Integer>();
        l_SymptomsOrdered.putAll(l_Symptoms);
        for(Map.Entry symptom : l_SymptomsOrdered.entrySet())
        {
            System.out.println(symptom.getKey() + ":"+ symptom.getValue());
        }
        return true;
    }
    /**
     *
     * Print out to file FilePath
     * @return a boolean set to true is all Symptoms obtained from a data source have been write out
     * if a problem occurs return false.
     */

    public boolean PrintOutSymptoms(Map<String,Integer> l_allSymptomsCount,String FilePath)  {

        Map<String,Integer> l_Symptoms = l_allSymptomsCount;
        String filePath = FilePath;

        try (FileWriter writer = new FileWriter(FilePath)){

            for (Map.Entry symptom : l_Symptoms.entrySet()) {
                writer.write(symptom.getKey() + ":" + symptom.getValue() + "\n");
            }

            return true;

        }   catch (NullPointerException e) {
            System.out.println("error : path is null");
            return false;

        }   catch (IOException e) {
            System.out.println("error : write issue ");
            e.printStackTrace();
            return false;

        }
    }
}
