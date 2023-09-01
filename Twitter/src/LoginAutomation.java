import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class LoginAutomation {
    public static void main (String[] args) {

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.get("https://twitter.com/");
            driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div[1]/div[1]/div/div[3]/div[5]/a/div")).click();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[5]/label/div/div[2]/div/input"));
            WebElement username = driver.findElement(By.xpath("//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[5]/label/div/div[2]/div/input"));
            username.sendKeys("rfebriansyah01");
            driver.findElement(By.xpath("//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[6]/div")).click();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div/div[3]/div/label/div/div[2]/div[1]/input"));
            WebElement password = driver.findElement(By.xpath("//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div/div[3]/div/label/div/div[2]/div[1]/input"));
            password.sendKeys("Binarian");
            driver.findElement(By.xpath("//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div/div/div")).click();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/header/div/div/div/div[1]/div[3]/a/div")).click();
            driver.findElement(By.xpath("//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div/div[3]/div[2]/div[1]/div/div/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div/div/div/div/label/div[1]/div/div/div/div/div/div[2]/div/div/div/div"));
            WebElement postTweet = driver.findElement(By.xpath("//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div/div[3]/div[2]/div[1]/div/div/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div/div/div/div/label/div[1]/div/div/div/div/div/div[2]/div/div/div/div"));
            postTweet.sendKeys("testing tweet4");
            driver.findElement(By.xpath("//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div/div[3]/div[2]/div[1]/div/div/div/div[2]/div[2]/div/div/div[2]/div[4]/div/span/span")).click();
            driver.findElement(By.xpath("//*[@id=\"layers\"]/div[3]/div/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div/div[1]/div/div")).click();
            driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/header/div/div/div/div[2]/div/div/div/div/div[2]/div/div[2]/div/div/div[4]/div")).click();
            driver.findElement(By.xpath("//*[@id=\"layers\"]/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/a[2]/div[1]/div/span")).click();
            driver.findElement(By.xpath("//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div[2]/div[1]/div\n")).click();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.quit();



        }
        }