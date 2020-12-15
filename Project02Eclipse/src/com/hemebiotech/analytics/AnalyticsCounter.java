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

    static final public String symptomsFilePathIn = "Project02Eclipse/symptoms.txt";
    static final public String symptomsFilePathOut = "result.out";

    public static void main(String args[]) throws Exception {

        // Declaration

        ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile(symptomsFilePathIn);
        SymptomAnalysis symptomAnalysis = new SymptomAnalysis();
        WriteSymptomAnalysisToOutput writeSymptomAnalysisToOutput = new WriteSymptomAnalysisToOutput();

        //Read,process and write

        writeSymptomAnalysisToOutput.PrintOutSymptoms(symptomAnalysis.CountNumberOfSymptom(readSymptomDataFromFile.GetSymptoms()),symptomsFilePathOut);

	}
}
