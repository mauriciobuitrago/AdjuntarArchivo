package Tasks;

import UI.Prueba;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import java.io.File;

public class prueba2task implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
       File file = new File("C:\\Users\\QV-4534\\Documents\\Libreria Robot\\RetoDemoQa\\Prueba.txt");
        String path = file.getAbsolutePath();

        actor.attemptsTo(Scroll.to(Prueba.FORM));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Click.on(Prueba.FORM));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Click.on(Prueba.SELECT_FORM));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Scroll.to(Prueba.BTN_UPLOAD));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //  actor.attemptsTo(Click.on(Prueba.BTN_PUBLICIDAD));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Enter.keyValues(path).into(Prueba.BTN_UPLOAD));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }
    public static prueba2task diligenciar2(){

        return Tasks.instrumented(prueba2task.class);
    }

}
