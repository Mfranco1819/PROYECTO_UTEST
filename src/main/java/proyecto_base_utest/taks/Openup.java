package proyecto_base_utest.taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import proyecto_base_utest.userinterface.UtestPage;

public class Openup implements Task {

private UtestPage utestPage;

    public static Openup ThePage() {
        return Tasks.instrumented(Openup.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(utestPage),
                Click.on(UtestPage.JOIN));

    }
}
