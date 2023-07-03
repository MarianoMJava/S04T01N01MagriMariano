package cat.itacademy.barcelonactiva.Magri.Mariano.s04.t01.n01.S04T01N01MagriMariano.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldControllers {

    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(value = "nombre", defaultValue = "UNKNOWN") String nombre) {
        return "Hola, " + nombre + ". Estás ejecutando un proyecto Maven";
    }

    @GetMapping("/HelloWorld2/{nombre2}")
    public String saluda2(@PathVariable(value = "nombre2", required = false) String nombre2) {
        if (nombre2 == null) {
            return "Hola. Estás ejecutando un proyecto Maven";
        } else {
            return "Hola, " + nombre2 + ". Estás ejecutando un proyecto Maven";
        }
    }
}