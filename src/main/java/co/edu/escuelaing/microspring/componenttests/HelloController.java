package co.edu.escuelaing.microspring.componenttests;

import co.edu.escuelaing.microspring.RequestMapping;

/**
 *
 * @author Juan.Ortiz
 */
public class HelloController {
    @RequestMapping("/hello")
    public static String greetings(){
        return "Greetings from SpringBoot";
    }
    @RequestMapping("/pi")
    public static String theValueOfPi(){
        return "PI: "+Math.PI;
    }
    
}
