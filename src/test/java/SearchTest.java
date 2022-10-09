import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTest {
    private final String HOME_PAGE_URL = "http://hh.ru/";

    private final By ADVANCED_SETTING = By.xpath(".//span[@class = 'bloko-icon bloko-icon_filters-24 bloko-icon_initial-action bloko-icon_highlighted-default bloko-icon_24']");
    private final By PROFROLES = By.xpath(".//button[@data-qa='resumesearch__profroles-switcher']");
    private final By PROFROLES_INPUT = By.xpath(".//input[@data-qa='bloko-tree-selector-popup-search']");
    private final By PROFROLES_SUBMIT_BUTTON = By.xpath(".//button[@data-qa='bloko-tree-selector-popup-submit']");
    private final By IT_PROFS = By.xpath(".//span[@data-qa='bloko-tree-selector-toogle-node bloko-tree-selector-toogle-node-category-11']");
    private final By TESTER_PROFROLE = By.xpath(".//span[@data-qa='bloko-tree-selector-item-text bloko-tree-selector-item-text-124']");
    private final By VACANCYSEARCH = By.xpath(".//input[@data-qa='vacancysearch__keywords-input']");
    private final By ADVANCED_SEARCH_SUBMIT_BUTTON = By.xpath(".//button[@data-qa='advanced-search-submit-button']");


    @Test
    public void searchQAVacancy() {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(HOME_PAGE_URL);

        WebElement advancedSettingsButton = driver.findElement(ADVANCED_SETTING);
        advancedSettingsButton.click();

        WebElement profroles = driver.findElement(PROFROLES);
        profroles.click();

        WebElement itProfsList = driver.findElement(IT_PROFS);
        itProfsList.click();

        WebElement testerProfRole = driver.findElement(TESTER_PROFROLE);
        testerProfRole.click();

        WebElement profRolesSubmitButton = driver.findElement(PROFROLES_SUBMIT_BUTTON);
        profRolesSubmitButton.click();

        WebElement vacancySearchField = driver.findElement(VACANCYSEARCH);
        vacancySearchField.click();
        vacancySearchField.sendKeys("QA Lead");

        WebElement advancedSearchSubmitButton = driver.findElement(ADVANCED_SEARCH_SUBMIT_BUTTON);
        advancedSearchSubmitButton.click();

        //WebElement profRolesInput = driver.findElement(PROFROLES_INPUT);
        //profRolesInput.click();
        //profRolesInput.sendKeys("Тес");

        //Select select = new Select(driver.findElement(By.cssSelector()))




    }
    //private final By SEARCH_INPUT_FIELD = By.id("a11y-search-input");
    //
    //WebElement searchField = driver.findElement(SEARCH_INPUT_FIELD);
    //searchField.sendKeys("QA Lead");

}
