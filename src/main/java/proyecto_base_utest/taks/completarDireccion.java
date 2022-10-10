package proyecto_base_utest.taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import proyecto_base_utest.model.UtestDatos;
import proyecto_base_utest.userinterface.CompleteUserInformation;
import proyecto_base_utest.userinterface.Next_Direction_Page;

import java.util.List;
import static proyecto_base_utest.userinterface.Next_Direction_Page.*;

public class completarDireccion implements Task {

    private List<UtestDatos> datos;

    public completarDireccion(List<UtestDatos> datos) {this.datos = datos;
    }

    public static completarDireccion Thepage(List<UtestDatos> datos) {
return Tasks.instrumented(completarDireccion.class, datos);


    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Enter.theValue(datos.get(0).getStrCiudad()).into(CITY),
            Hit.the(Keys.ARROW_DOWN).into(CITY),
            Hit.the(Keys.ENTER).into(CITY),
            Enter.theValue(datos.get(0).getStrPostalCode()).into(POSTAL_CODE),
            Click.on(COUTENER),
            Enter.theValue(datos.get(0).getStrCountry()).into(COUNTRY).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
            Click.on(BUTTON_DEVICES));


    }
}
