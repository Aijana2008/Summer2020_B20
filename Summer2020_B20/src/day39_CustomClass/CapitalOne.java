package day39_CustomClass;
import java.util.ArrayList;
import java.util.Arrays;
public class CapitalOne {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();
        Employee employee6 = new Employee();
        employee1.setEmployeeInfo("Djuro Palica",'M',"123456678","Nocni cuvar",19000);
        employee2.setEmployeeInfo("Mile Kokoska",'M',"987654332","Kriminalac",98000);
        employee3.setEmployeeInfo("Ramazan", 'M', "342151342", "SDET", 150000);
        employee4.setEmployeeInfo("Musa", 'M', "123456789", "SDET", 135000);
        employee5.setEmployeeInfo("Trump", 'M' , "010467985", "president", 10);
        employee6.setEmployeeInfo("Mica Trofrtaljka",'F',"696969698","Prostitutka",200);
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.addAll( Arrays.asList(employee1,employee2,employee3,employee4,employee5,employee6) );
        double max = Integer.MIN_VALUE;
        String name = "";
        for (Employee each : employeeList){
            double eachSolary = each.salary;
            if (eachSolary > max){
                max = eachSolary;
                name = each.name;
            }
        }
        System.out.println("Maximum Salary: "+max);
        System.out.println("Name: "+name);
        System.out.println("=================================================================================");
        // employeeList.removeIf( p -> p.salary < 150000 );
        // employeeList.removeIf(each -> each.jobTitle.equals("SDET"));
        // employeeList.removeIf(each -> each.name.toLowerCase().contains("m"));
        employeeList.removeIf(each -> each.name.charAt(0) == 'R');
        for (Employee each : employeeList){
            // each.getEmployeeInfo();
            System.out.println(each.name+" : "+each.salary);
        }




    }
}
