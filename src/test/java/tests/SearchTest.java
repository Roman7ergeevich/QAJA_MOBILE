package tests;

import lib.CoreTestCase;
import lib.ui.pages.factory.OnboardingPageFactory;
import lib.ui.pages.factory.SearchPageFactory;
import lib.ui.pages.factory.StartPageFactory;
import lib.ui.pages.interfaces.IOnboardingPageObject;
import lib.ui.pages.interfaces.ISearchPageObject;
import lib.ui.pages.interfaces.IStartPageObject;
import org.junit.Test;

public class SearchTest extends CoreTestCase {

    @Test
    public void testSearch() {
        IOnboardingPageObject onboardingPage = OnboardingPageFactory.get(this.driver);
        IStartPageObject startPage = StartPageFactory.get(this.driver);
        ISearchPageObject searchPage = SearchPageFactory.get(this.driver);

        // Поиск информации о планетах и объектах солнечной системы
        onboardingPage.skipOnboarding();
        startPage.initSearch();
        searchPage.findByText("Sun"); // Поиск информации о Солнце
        searchPage.selectByText("Star at the center of the Solar System");
        driver.navigate().back();

        startPage.initSearch();
        searchPage.findByText("Mercury"); // Поиск информации о Меркурии
        searchPage.selectByText("Smallest and closest planet to the sun");
        driver.navigate().back();

        startPage.initSearch();
        searchPage.findByText("Venus"); // Поиск информации о Венере
        searchPage.selectByText("Planet second - closest to the Sun");
        driver.navigate().back();

        startPage.initSearch();
        searchPage.findByText("Earth"); // Поиск информации о Земле
        searchPage.selectByText("Third planet from the Sun");
        driver.navigate().back();

        startPage.initSearch();
        searchPage.findByText("Mars");  // Поиск информации о Марсе
        searchPage.selectByText("Fourth planet from the Sun");
        driver.navigate().back();

        startPage.initSearch();
        searchPage.findByText("Asteroid belt");  // Поиск информации о поясе астеройдов
        searchPage.selectByText("The circumstellar disk (accumulation of matter) in an orbit around  Sun between those of Mars and Jupiter");
        driver.navigate().back();

        startPage.initSearch();
        searchPage.findByText("Ceres");  // Поиск информации о Церере
        searchPage.selectByText("Dwarf planet and largest asteroid of the main asteroid belt");
        driver.navigate().back();

        startPage.initSearch();
        searchPage.findByText("Jupiter");  // Поиск информации о Юпитере
        searchPage.selectByText("Fifth planet from the Sun and largest planet in the Solar System");
        driver.navigate().back();

        startPage.initSearch();
        searchPage.findByText("Saturn");  // Поиск информации о Сатурне
        searchPage.selectByText("Sixth planet from the Sun and the second-largest planet in the Solar System, after Jupiter");
        driver.navigate().back();

        startPage.initSearch();
        searchPage.findByText("Uranus");  // Поиск информации о Уране
        searchPage.selectByText("Seventh planet from the Sun");
        driver.navigate().back();

        startPage.initSearch();
        searchPage.findByText("Neptune");  // Поиск информации о Нептуне
        searchPage.selectByText("Eighth and farthest planet from the Sun in the Solar System");
        driver.navigate().back();

    }
}
