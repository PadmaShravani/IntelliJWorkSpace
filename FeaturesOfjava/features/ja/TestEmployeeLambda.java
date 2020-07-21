package features.ja;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestEmployeeLambda {
    public static void main(String args[]){

        List<Employee> emp = new ArrayList<Employee>();
        emp.add(new Employee(10,"abc",20000d));
        emp.add(new Employee(20,"xyz",30000d));
        emp.add(new Employee(30,"def",40000d));
        List<Employee> sortedList = emp.stream().sorted((e1,e2)->e1.getEname().compareTo(e2.getEname())).collect(Collectors.toList());
        sortedList.stream().forEach(i->System.out.println(i));
        Predicate<Employee> employeePredicate = employee -> employee.getSalary().equals(30000d);
        System.out.println(emp.stream().anyMatch(employeePredicate));
        System.out.println(emp.stream().allMatch(employeePredicate));
        List<Employee> filteredList =  emp.stream().filter(employeePredicate).collect(Collectors.toList());
        filteredList.stream().forEach(i->System.out.println(i));

    }
}