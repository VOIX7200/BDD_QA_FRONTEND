package ExtentDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportDemo {
	static ExtentReports report;
	static ExtentReports extentRP;

//	public static void main(String[] args) {
		
//}
	
//public static ExtentReports getReport(String basePath) {
	public static ExtentReports getReport() {
	  
	System.out.println("Code executing inside Extent Reports");
	if(extentRP==null) {
		extentRP = new ExtentReports();
		System.out.println("Code checking if extentRP == null" + extentRP);
		//ExtentSparkReporter sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/basePath");
		//ExtentSparkReporter sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"\\ExtentFolder\\");
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(".//ExtentFolder//");
		sparkReporter.config().setReportName("Demo Func Testing");
		sparkReporter.config().setDocumentTitle("Automation Reports");
		sparkReporter.config().setTheme(Theme.DARK);
		sparkReporter.config().setEncoding("utf-8");
		extentRP.attachReporter(sparkReporter);
	System.out.println("Code execution about exit from Extent Reports");
		
	}
	return extentRP;
	
}

}
