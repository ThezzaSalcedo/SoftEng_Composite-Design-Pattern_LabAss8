import java.util.ArrayList;
import java.util.List;

public class College implements EducationalUnit {

    private String name;
    private List<EducationalUnit> units = new ArrayList<>();

    public College(String name) {
        this.name = name;
    }

    public void add(EducationalUnit unit) {
        units.add(unit);
    }

    public void remove(EducationalUnit unit) {
        units.remove(unit);
    }

    public List<EducationalUnit> getChildren() {
        return List.copyOf(units);
    }

    @Override
    public void displayDetails(String indent) {
        System.out.println(indent + "╔══════════════════════════════════════");
        System.out.println(indent + "║  College  : " + name);
        System.out.printf( "%s║  Students : %d%n",      indent, getStudentCount());
        System.out.printf( "%s║  Budget   : PHP %.2f%n", indent, getBudget());
        System.out.println(indent + "╠══════════════════════════════════════");
        for (EducationalUnit unit : units) {
            unit.displayDetails(indent + "║  ");
        }
        System.out.println(indent + "╚══════════════════════════════════════");
    }

    @Override
    public int getStudentCount() {
        return units.stream()
                    .mapToInt(EducationalUnit::getStudentCount)
                    .sum();
    }

    @Override
    public double getBudget() {
        return units.stream()
                    .mapToDouble(EducationalUnit::getBudget)
                    .sum();
    }

    public String getName() { return name; }
}