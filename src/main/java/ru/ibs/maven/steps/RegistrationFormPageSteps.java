package ru.ibs.maven.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.bg.И;
import ru.ibs.maven.manager.PageManager;



public class RegistrationFormPageSteps {

    private final  PageManager pageManage= PageManager.getPageManager();

    @И("^Заполняем поля$")
    public void fillFields(DataTable mapFieldsAndValue) {
        mapFieldsAndValue.asMap(String.class, String.class).forEach((key, value) ->
                pageManage.getRegistrationFormPage().fillField((String) key, (String) value));

    }

    @И("^Переходим в раздел Командировки$")
    public void clickBtnEnter(){
        pageManage.getRegistrationFormPage().clickBtnEnter();
    }
}
