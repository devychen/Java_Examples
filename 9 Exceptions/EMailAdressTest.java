/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author saile
 */
public class EMailAdressTest {

    public EMailAdressTest() {
    }

    @Test
    public void test1() {
        EMailAdress adress = null;
        try {
            adress = new EMailAdress("saile@sfs.uni-tuebingen.de");

        } catch (IllegalEmailException e) {
            fail(e.getMessage());
        }

        assertEquals("saile", adress.getName());
        assertEquals("sfs.uni-tuebingen.de", adress.getHost());
    }

    @Test
    public void test2() {
        EMailAdress adress = null;
        try {
            adress = new EMailAdress("sail@sfs.uni-tuebingen.de");
            fail("This should not happen.");

        } catch (IllegalEmailException e) {
            System.err.println("Found incorrect email address");
        }
    }
}
