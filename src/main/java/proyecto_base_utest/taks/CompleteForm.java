package proyecto_base_utest.taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import proyecto_base_utest.model.UtestDatos;
import proyecto_base_utest.userinterface.CompleteUserInformation;

import java.util.List;

public class CompleteForm implements Task {

private List<UtestDatos> datos;

    public CompleteForm(List<UtestDatos> datos) {
        this.datos = datos;
    }

    public static CompleteForm Onthepage(List<UtestDatos> datos) {
return Tasks.instrumented(CompleteForm.class, datos);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datos.get(0).getStrName()).into(CompleteUserInformation.First_NAME),
                Enter.theValue(datos.get(0).getStrLasname()).into(CompleteUserInformation.Last_NAME),
                Enter.theValue(datos.get(0).getStrEmail()).into(CompleteUserInformation.EMAIL_ADDRESS),
                SelectFromOptions.byVisibleText(datos.get(0).getStrMontOfBirthday()).from(CompleteUserInformation.MONTH_OF_BIRTH),
                SelectFromOptions.byVisibleText(datos.get(0).getStrDayOfBirthday()).from(CompleteUserInformation.DAY_OF_BIRTH),
                SelectFromOptions.byVisibleText(datos.get(0).getStrYearOfBithday()).from(CompleteUserInformation.YEAR_OF_BIRTH),
                Click.on(CompleteUserInformation.botton_location));





    }
}
