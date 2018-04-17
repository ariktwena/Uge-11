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
public class Afdelingsleder extends Medarbejder{
    
    private int regNr;

    public Afdelingsleder(String navn, String afdeling, int regNr) {
        
        super(navn, afdeling);
        this.regNr = regNr;
    }
    
    
    
    
}
