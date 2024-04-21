/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author saile
 */
class IllegalEmailException extends Exception {

    public IllegalEmailException() {
        super("Wrong email adress");
    }

    public IllegalEmailException(String aMessage) {
        super(aMessage);
    }

}
