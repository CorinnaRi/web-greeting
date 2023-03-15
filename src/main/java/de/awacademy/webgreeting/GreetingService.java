package de.awacademy.webgreeting;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class GreetingService {

    private HashMap<String, Integer> namen = new HashMap();

    public String getHello(String lang, String name)
    {
        if(!namen.containsKey(name))
        {
            namen.put(name, 1);
        }
        else {
            namen.put(name, namen.get(name)+1);
        }

        String output = switch (lang) {
            case ("de") -> "Guten Tag, " + name + "! Dies ist dein " + namen.get(name) + ". Gruß.";
            case ("es") -> "¡Hola, " + name + "! Dies ist dein " + namen.get(name) + ". Gruß.";
            default -> "Hello, " + name + ". This is your " + namen.get(name) + ". greeting.";
        };
        return output;
    }

}
