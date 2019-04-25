import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.BatchInfo;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.Eyes;
;


public class TestTeamCity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Eyes eyes = new Eyes();
		
		eyes.setApiKey(System.getenv("APPLITOOLS_API_KEY"));
		
		WebDriver driver = new ChromeDriver();
		BatchInfo batch = new BatchInfo(System.getenv("APPLITOOLS_BATCH_NAME"));
		batch.setId(System.getenv("APPLITOOLS_BATCH_ID"));

		System.out.println(System.getenv("APPLITOOLS_BATCH_ID"));
		eyes.setBatch(batch);
		eyes.open(driver, "Jenkins", "JenkinsTest", new RectangleSize(800, 600));
		driver.get("https://applitools.com/helloworld");
		eyes.checkWindow();
		eyes.close(false);
		driver.quit();

	}

}
