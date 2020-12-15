package com.hemebiotech.analytics;

/**
 * Main class AnalyticsCounter
 * -------------------------
 * Read , Process and write out symptoms
 * IN : File Symptoms.txt (cf symptomsFilePathIn)
 * OUT : result.txt (cf symptomsFilePathOut)
 */


public class AnalyticsCounter {

    static final public String symptomsFilePathIn = System.getProperty("user.dir") + "/" + "symptoms.txt";
    static final public String symptomsFilePathOut = System.getProperty("user.dir") + "/" + "result.out";

    public static void main(String args[]) throws Exception {

        // Declaration
        ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile(symptomsFilePathIn);
        SymptomAnalysis symptomAnalysis = new SymptomAnalysis();
        WriteSymptomAnalysisToOutput writeSymptomAnalysisToOutput = new WriteSymptomAnalysisToOutput();

        //Read,process and write

        writeSymptomAnalysisToOutput.PrintOutSymptoms(symptomAnalysis.CountNumberOfSymptom(readSymptomDataFromFile.GetSymptoms()),symptomsFilePathOut);

	}
}
