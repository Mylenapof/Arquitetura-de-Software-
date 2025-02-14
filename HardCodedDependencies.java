
public class HardCodedDependencies {
    public static void main(String[] args) {
        ReportFormat pdfReport = new PDFReport();
        Report report = new Report(pdfReport);
        report.generate();
    }
}


interface ReportFormat {
    void generateReport();
}


class PDFReport implements ReportFormat {
    public void generateReport() {
        System.out.println("Generating PDF Report...");
    }
}


class CSVReport implements ReportFormat {
    public void generateReport() {
        System.out.println("Generating CSV Report...");
    }
}


class Report {
    private ReportFormat reportFormat;

    public Report(ReportFormat reportFormat) {
        this.reportFormat = reportFormat;
    }

    public void generate() {
        reportFormat.generateReport();
    }
}