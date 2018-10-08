import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer();
    }

    @Test
    public void hasToner() {
        assertEquals(1000, printer.getToner());
    }

    @Test
    public void hasPaper() {
        assertEquals(500, printer.getPaper());
    }

    @Test
    public void canPrint() {
        assertEquals("Print Sucessful!", printer.print(2,1));
    }

    @Test
    public void printUsesTonerAndPaper() {
        printer.print(5, 10);
        assertEquals(450, printer.getPaper());
        assertEquals(950, printer.getToner());
    }

    @Test
    public void cantPrintNoPaper() {
        assertEquals("The printer does not have enough paper!", printer.print(100,6));
    }

    @Test
    public void cantPrintNoInk() {
        printer.setToner(100);
        assertEquals("The printer does not have enough ink!", printer.print(100, 2));
    }

    @Test
    public void canRefillPaper() {
        printer.refillPaper();
        assertEquals(500, printer.getPaper());
    }

    @Test
    public void canRefillToner() {
        printer.refillToner();
        assertEquals(1000, printer.getToner());
    }
}

