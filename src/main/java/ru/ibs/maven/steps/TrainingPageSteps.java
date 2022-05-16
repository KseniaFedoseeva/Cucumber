package ru.ibs.maven.steps;

import io.cucumber.java.bg.И;
import ru.ibs.maven.manager.PageManager;

public class TrainingPageSteps {
    private final  PageManager pageManage= PageManager.getPageManager();

    @И("^Выбираем раздел Расходы$")
    public void selectCostsBlock(){
        pageManage.getGoToBusinessTripPage().selectCostsBlock();
    }

    @И("^Переходим в раздел формирования Командировок$")
    public void openBusinessTripPage(){
        pageManage.getGoToBusinessTripPage().openBusinessTripPage();
    }
}
