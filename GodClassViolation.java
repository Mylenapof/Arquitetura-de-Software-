
public class GodClassViolation {
    public static void main(String[] args) {
        Application app = new Application(
                new Authenticator(),
                new DashboardLoader(),
                new PaymentProcessor(),
                new ReportGenerator()
        );
        app.run();
    }
}

class Application {
    private Authenticator authenticator;
    private DashboardLoader dashboardLoader;
    private PaymentProcessor paymentProcessor;
    private ReportGenerator reportGenerator;

    public Application(Authenticator authenticator, DashboardLoader dashboardLoader, PaymentProcessor paymentProcessor, ReportGenerator reportGenerator) {
        this.authenticator = authenticator;
        this.dashboardLoader = dashboardLoader;
        this.paymentProcessor = paymentProcessor;
        this.reportGenerator = reportGenerator;
    }

    public void run() {
        System.out.println("Running application...");
        authenticator.authenticateUser();
        dashboardLoader.loadDashboard();
        paymentProcessor.processPayments();
        reportGenerator.generateReports();
    }
}

class Authenticator {
    public void authenticateUser() {
        System.out.println("Authenticating user...");
    }
}

class DashboardLoader {
    public void loadDashboard() {
        System.out.println("Loading dashboard...");
    }
}

class PaymentProcessor {
    public void processPayments() {
        System.out.println("Processing payments...");
    }
}

class ReportGenerator {
    public void generateReports() {
        System.out.println("Generating reports...");
    }
}