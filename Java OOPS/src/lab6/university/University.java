package lab6.university;

public class University {
    String universityName;
    String location;
    public University(String universityName, String location) {
        this.universityName = universityName;
        this.location = location;
    }
    class Department {
        String deptName;
        String hodName;
        public Department(String deptName, String hodName) {
            this.deptName = deptName;
            this.hodName = hodName;
        }
        public void displayDetails() {
            System.out.println("University Name: " + universityName);
            System.out.println("Location: " + location);
            System.out.println("Department Name: " + deptName);
            System.out.println("HOD Name: " + hodName);
        }
    }
    public static void main(String[] args) {
        University u = new University("KIIT University", "Bhubaneswar");
        University.Department d = u.new Department("CSE", "Dr. Sharma");        
        d.displayDetails();
    }
}
