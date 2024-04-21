/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saile
 */
public class EMailAdress {

    private String emailAdress;
    private int atPos = -1;

    public EMailAdress(String aEmailAdress) throws IllegalEmailException {
        atPos = aEmailAdress.indexOf("@");
        if (atPos == -1) {
            throw new IllegalEmailException();
        }

        emailAdress = aEmailAdress;
    }

    public String getHost() {
        return (emailAdress.substring(atPos + 1));
    }

    public String getName() {
        return emailAdress.substring(0, atPos);
    }
}
