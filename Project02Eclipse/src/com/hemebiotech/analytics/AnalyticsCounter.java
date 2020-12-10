package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Main class AnalyticsCounter
 * -------------------------
 * Read , Process and write out symptoms
 * IN : File Symptoms.txt (cf symptomsFilePathIn)
 * OUT : result.txt (cf symptomsFilePathOut)
 */


public class AnalyticsCounter {

    public static void main(String args[]) throws Exception {

        /**
         *
         * @param symptomsFilePathIn & symptomsFilePathOut a full or partial path to file with symptom strings in it, one per line
         */

        final String symptomsFilePathIn = "Project02Eclipse/symptoms.txt";
        final String symptomsFilePathOut = "result.out";

        List<String> l_allSymptoms = new ArrayList<String>();
        Map<String,Integer> l_allSymptomsCount = new TreeMap<String,Integer>();

        ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile(symptomsFilePathIn);
        SymptomAnalysis symptomAnalysis = new SymptomAnalysis();
        WriteSymptomAnalysisToOutput writeSymptomAnalysisToOutput = new WriteSymptomAnalysisToOutput();

        /**
         *
         * Read Symptom from file
         */

        l_allSymptoms = readSymptomDataFromFile.GetSymptoms();

        /**
         *
         * Symptoms processing
         */


        l_allSymptomsCount = symptomAnalysis.CountNumberOfSymptom(l_allSymptoms);

        /**
         *
         * Write Symptoms out
         */

        writeSymptomAnalysisToOutput.PrintOutSymptoms(l_allSymptomsCount,symptomsFilePathOut);

	}
}
