
public class Main {

    public static void main(String[] args) {

        Teacher drReyes    = new Teacher("Dr. Reyes",    "Data Structures",     85_000);
        Teacher msSantos   = new Teacher("Ms. Santos",   "Algorithms",          72_000);
        Teacher mrBautista = new Teacher("Mr. Bautista", "Networking",          68_000);
        Teacher drLim      = new Teacher("Dr. Lim",      "Engineering Dean",   110_000);
        Teacher profGarcia = new Teacher("Prof. Garcia", "Management",          75_000);


        Student juan    = new Student("Juan dela Cruz", "2024-CS-001", 45_000);
        Student maria   = new Student("Maria Flores",   "2024-CS-002", 45_000);
        Student carlos  = new Student("Carlos Ramos",   "2024-IT-001", 42_000);
        Student ana     = new Student("Ana Mercado",    "2024-BM-001", 40_000);
        Student rico    = new Student("Rico Navarro",   "2024-BUS-001",38_000);


        Department cs = new Department("Department of Computer Science");
        cs.add(drReyes);
        cs.add(msSantos);
        cs.add(juan);
        cs.add(maria);

        Department it = new Department("Department of Information Technology");
        it.add(mrBautista);
        it.add(carlos);

        Department mgmt = new Department("Department of Management");
        mgmt.add(profGarcia);
        mgmt.add(ana);


        College engineering = new College("College of Engineering");
        engineering.add(cs);
        engineering.add(it);
        engineering.add(drLim);       

        College business = new College("College of Business");
        business.add(mgmt);
        business.add(rico);           


        College university = new College("New Era University");
        university.add(engineering);
        university.add(business);


        System.out.println("=".repeat(50));
        System.out.println("         NEW ERA UNIVERSITY — DETAILS");
        System.out.println("=".repeat(50));
        university.displayDetails("");


        System.out.println("\n" + "=".repeat(50));
        System.out.println("         STUDENT COUNT SUMMARY");
        System.out.println("=".repeat(50));
        System.out.printf("University total     : %d students%n",
                university.getStudentCount());
        System.out.printf("College of Eng.      : %d students%n",
                engineering.getStudentCount());
        System.out.printf("  Dept. CS           : %d students%n",
                cs.getStudentCount());
        System.out.printf("  Dept. IT           : %d students%n",
                it.getStudentCount());
        System.out.printf("College of Business  : %d students%n",
                business.getStudentCount());
        System.out.printf("  Dept. Management   : %d students%n",
                mgmt.getStudentCount());


        System.out.println("\n" + "=".repeat(50));
        System.out.println("         BUDGET SUMMARY");
        System.out.println("=".repeat(50));
        System.out.printf("University budget    : PHP %,.2f%n",
                university.getBudget());
        System.out.printf("College of Eng.      : PHP %,.2f%n",
                engineering.getBudget());
        System.out.printf("  Dept. CS           : PHP %,.2f%n",
                cs.getBudget());
        System.out.printf("  Dept. IT           : PHP %,.2f%n",
                it.getBudget());
        System.out.printf("College of Business  : PHP %,.2f%n",
                business.getBudget());
        System.out.printf("  Dept. Management   : PHP %,.2f%n",
                mgmt.getBudget());


        System.out.println("\n" + "=".repeat(50));
        System.out.println("         INDIVIDUAL UNIT DETAILS");
        System.out.println("=".repeat(50));
        drReyes.displayDetails("  ");
        System.out.printf("  Budget contribution : PHP %,.2f%n%n", drReyes.getBudget());
        juan.displayDetails("  ");
        System.out.printf("  Budget contribution : PHP %,.2f%n",   juan.getBudget());
    }
}