/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medarbejder;

/**
 *
 * @author Tweny
 */
public class Medarbejder {
    private String navn;
    private String afdeling;

    public Medarbejder(String navn, String afdeling) {
        this.navn = navn;
        this.afdeling = afdeling;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getAfdeling() {
        return afdeling;
    }

    public void setAfdeling(String afdeling) {
        this.afdeling = afdeling;
    }
    
    
    
    
}
