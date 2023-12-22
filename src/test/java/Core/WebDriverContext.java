package Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverContext {
    private static String browser;
    private static WebDriver _webDriver;

    public static void initWebDriver() {
        _webDriver = new ChromeDriver();
        // _webDriver = new EdgeDriver();
    }

    public static WebDriver getWebDriver() throws Exception {

        if (_webDriver == null) {
            throw new Exception();
        }

        return _webDriver;
    }
}
