package ru.ibs.maven.pages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 *
 * Страница заполнения полей для создания командировки
 */
public class CreateBusinessTripPage extends BasePage {

    @FindBy(xpath = "//h1[@class = 'logo logo-text']")
    private WebElement title;

    @FindBy(xpath = "//option[text() = 'Выберите подразделение']")
    private WebElement choseDepartment;

    @FindBy(xpath = "//option[text() = 'Администрация']")
    private WebElement department;

    @FindBy(xpath = "//a[text() = 'Открыть список']")
    private WebElement openListCompanies;

    @FindBy(xpath = "//span[text() = 'Укажите организацию']")
    private WebElement listCompanies;

    @FindBy(xpath = "//div[text() = '(Яндекс)Призрачная Организация Охотников']")
    private WebElement company;

    @FindBy(name = "crm_business_trip[departureCity]")
    private WebElement depCity;

    @FindBy(name = "crm_business_trip[arrivalCity]")
    private WebElement arrCity;

    @FindBy(xpath = "//input[starts-with(@name, 'date_selector_crm_business_trip_departureDatePlan') and @placeholder = 'Укажите дату']")
    private WebElement dateDeparture;

    @FindBy(xpath = "//input[starts-with(@name, 'date_selector_crm_business_trip_returnDatePlan') and @placeholder = 'Укажите дату']")
    private WebElement dateArrival;

    @FindBy(xpath = "//label[text() = 'Заказ билетов']")
    private WebElement bookingTicket;

    @FindBy(xpath = "//button[@type = 'submit' and @class = 'btn btn-success action-button']")
    private WebElement saveAndClose;

    @FindBy(xpath = "//span[text() = 'Список командируемых сотрудников не может быть пустым']")
    private WebElement errorList;


    /**
     * Проверка открытия страницы
     *
     * @return CreateBusinessTripPage - т.е. остаемся на этой странице
     */

    public CreateBusinessTripPage checkOpenCreateBusinessTripPage() {
        wait.until(ExpectedConditions.visibilityOf(title));
        wait.until(ExpectedConditions.attributeContains(title, "class", "logo logo-text"));
        return this;
    }

    /**
     * Функция выбора подразделения
     */

    public CreateBusinessTripPage choseDepartment() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        choseDepartment.click();
        department.click();
        return this;
    }

    /**
     * Функция выбора организации
     */

    public CreateBusinessTripPage choseCompany() {
        openListCompanies.click();
        listCompanies.click();
        company.click();
        return this;
    }

    /**
     * Функция бронирования билетов
     */

    public CreateBusinessTripPage bookingTicket (){
        bookingTicket.click();
        return this;
    }

    /**
     * Функция выбора города отправления
     */

    public CreateBusinessTripPage choseDepartCity (String city){
        depCity.click();
        depCity.clear();
        depCity.sendKeys(city);
        Assert.assertEquals("Не верен пункт отправления", city, depCity.getAttribute("value"));
        return this;
    }

    /**
     * Функция выбора города прибытия
     */

    public CreateBusinessTripPage choseArriveCity (String city){
       arrCity.click();
       arrCity.sendKeys(city);
       Assert.assertEquals("Не верен пункт прибытия", city, arrCity.getAttribute("value"));
       return this;
    }

    /**
     * Функция даты отъезда
     */

    public CreateBusinessTripPage choseDepartDate (String date){
       dateDeparture.sendKeys(date);
       dateDeparture.submit();
       Assert.assertEquals("Не верна дата отправления", date, dateDeparture.getAttribute("value"));
       return this;
    }

    /**
     * Функция даты приезда
     */

    public CreateBusinessTripPage choseArriveDate (String date){
        dateArrival.sendKeys(date);
        dateArrival.submit();
        Assert.assertEquals("Не верна дата прибытия", date, dateArrival.getAttribute("value"));
        return this;
    }

    /**
     * Функция для нажатия Сохранить и закрыть
     */

    public CreateBusinessTripPage saveAndClose (){
        saveAndClose.submit();
        Assert.assertTrue("Отсутствует сообщение о списке командируемых", errorList.isDisplayed());
        return this;
    }
}
