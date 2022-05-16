package ru.ibs.maven.steps;

import io.cucumber.java.bg.И;
import ru.ibs.maven.manager.PageManager;

public class CreateBussinessTripPageSteps {
    private final PageManager pageManage= PageManager.getPageManager();
    @И("^Выбираем подразделение$")
    public void choseDepartment(){
        pageManage.getOpenCreateBusinessTripPage().choseDepartment();
    }
    @И("^Функция выбора организации$")
    public void choseCompany(){
        pageManage.getOpenCreateBusinessTripPage().choseCompany();
    }
    @И("^Бронируем билет$")
    public void bookingTicket(){
        pageManage.getOpenCreateBusinessTripPage().bookingTicket();
    }
    @И("^Выбираем пункт отправления$")
    public void choseDepartCity (String value){
        pageManage.getOpenCreateBusinessTripPage().choseDepartCity(value);
    }
    @И("^Выбираем пункт прибытия$")
    public void choseArriveCity(String value){
        pageManage.getOpenCreateBusinessTripPage().choseArriveCity(value);
    }
    @И("^Выбираем дату отправления$")
    public void choseDepartDate(String value){
        pageManage.getOpenCreateBusinessTripPage().choseDepartDate(value);
    }
    @И("^Выбираем дату прибытия$")
    public void choseArriveDate(String value){
        pageManage.getOpenCreateBusinessTripPage().choseArriveDate(value);
    }
    @И("^Нажимаем 'Сохранить и закрыть' и проверяем сообщение о необходимости дозаполнить поля$")
    public void saveAndClose(){
        pageManage.getOpenCreateBusinessTripPage().saveAndClose();
    }

}
