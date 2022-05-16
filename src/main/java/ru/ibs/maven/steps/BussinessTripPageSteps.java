package ru.ibs.maven.steps;

import io.cucumber.java.bg.И;
import ru.ibs.maven.manager.PageManager;

public class BussinessTripPageSteps {
    private final PageManager pageManage= PageManager.getPageManager();

    @И("^Проверка  открытия страницы$")
    public void checkOpenBusinessTripPage(){
        pageManage.getOpenBusinessTripPage().checkOpenBusinessTripPage();
    }
    @И("^Клик по кнопке Создать командировку$")
    public void selectCreateBusinessTrip(){
        pageManage.getOpenBusinessTripPage().selectCreateBusinessTrip();
    }
}
