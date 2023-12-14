/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.actividadjenkins;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Darkadi
 */
public class ActividadjenkinsTest {
    
    public ActividadjenkinsTest() {
    }

        @Test
        public void testDia_laboralLunes() {
        String dia = "Lunes";
        boolean expResult = true;
        boolean result = Actividadjenkins.dia_laboral(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
        @Test
        public void testDia_laboralMartes() {
        String dia = "Martes";
        boolean expResult = true;
        boolean result = Actividadjenkins.dia_laboral(dia);
        assertEquals(expResult, result);
       
         
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
        @Test
        public void testDia_laboralMiercoles() {
        String dia = "Miercoles";
        boolean expResult = true;
        boolean result = Actividadjenkins.dia_laboral(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
        @Test
        public void testDia_laboralJueves() {
        String dia = "Jueves";
        boolean expResult = true;
        boolean result = Actividadjenkins.dia_laboral(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
        @Test
        public void testDia_laboralViernes() {
        String dia = "Viernes";
        boolean expResult = true;
        boolean result = Actividadjenkins.dia_laboral(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
        @Test
        public void testDia_laboralSabado() {
        String dia = "Sabado";
        boolean expResult = false;
        boolean result = Actividadjenkins.dia_laboral(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
        @Test
        public void testDia_laboralDomingo() {
        String dia = "Domingo";
        boolean expResult = false;
        boolean result = Actividadjenkins.dia_laboral(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
