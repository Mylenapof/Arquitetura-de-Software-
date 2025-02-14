
public class InterfaceSegregationViolation {
    public static void main(String[] args) {
        MultiFunctionPrinter multiPrinter = new MultiFunctionPrinter();
        multiPrinter.print();
        multiPrinter.scan();
        multiPrinter.fax();

        System.out.println("\nUsing Simple Printer:");
        SimplePrinter simplePrinter = new SimplePrinter();
        simplePrinter.print();
    }
}


interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

interface Fax {
    void fax();
}


class MultiFunctionPrinter implements Printer, Scanner, Fax {
    public void print() {
        System.out.println("Printing...");
    }

    public void scan() {
        System.out.println("Scanning...");
    }

    public void fax() {
        System.out.println("Faxing...");
    }
}


class SimplePrinter implements Printer {
    public void print() {
        System.out.println("Printing...");
    }
}