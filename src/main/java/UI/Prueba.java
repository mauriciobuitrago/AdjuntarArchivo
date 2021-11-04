package UI;

import net.serenitybdd.screenplay.targets.Target;

public class Prueba {
    public static final Target FORM = Target.the("")
            .locatedBy("//*[@id='app']/div/div/div[2]/div/div[2]/div/div[1]");

    public static final Target SELECT_FORM = Target.the("")
            .locatedBy("//span[text()='Practice Form']");

    public static final Target BTN_UPLOAD = Target.the("")
            .locatedBy("//*[@id='uploadPicture']");

    public static final Target BTN_CLIC_UPLOAD = Target.the("subir foto")
            .locatedBy("//*[text()='Select picture']");


}
