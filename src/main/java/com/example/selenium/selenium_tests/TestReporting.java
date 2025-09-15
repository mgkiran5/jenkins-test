package com.example.selenium.selenium_tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestReporting {

	private static ExtentReports extent;

    public static ExtentReports getInstance() {
        if (extent == null) {
            String reportPath = System.getProperty("user.dir") + "/test-output/ExtentReport.html";
            ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
            spark.config().setDocumentTitle("Automation Test Report");
            spark.config().setReportName("Selenium + TestNG Report");

            extent = new ExtentReports();
            extent.attachReporter(spark);

            // Add system info if needed
            extent.setSystemInfo("OS", System.getProperty("os.name"));
            extent.setSystemInfo("Project", "My Jenkins Project");
            extent.setSystemInfo("Tester", "QA Engineer");
        }
        return extent;
    }
	
}
