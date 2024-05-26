package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        List<Integer> aList = Arrays.asList(1, 2, 4, 3, 7, 8);
        List<Person> sList = Arrays.asList(
                new Person("mudit", "dehradun", 33),
                new Person("vivaan", "gurugram", 7),
                new Person("nitya", "gurgaon", 3),
                new Person("anamika", "bhopal", 32));


        Map<Character, List<Person>> characterListMap = sList.stream().collect(Collectors.groupingBy(s -> s.getName().charAt(0)));



/*
Collectors

Implementations of Collector that implement various useful reduction operations, such as accumulating
elements into collections, summarizing elements according to various criteria, etc.

The following are examples of using the predefined collectors to perform common mutable reduction tasks:

 Accumulate names into a List
 List<String> list = people. stream()   .map(Person::getName)   .collect(Collectors. toList());

 Accumulate names into a TreeSet
 Set<String> set = people. stream()   .map(Person::getName)   .collect(Collectors. toCollection(TreeSet::new));

 Convert elements to strings and concatenate them, separated by commas
 String joined = things. stream()   .map(Object::toString)   .collect(Collectors. joining(", "));

 Compute sum of salaries of employee
 int total = employees. stream()   .collect(Collectors. summingInt(Employee::getSalary));

 Group employees by department
 Map<Department, List<Employee>> byDept = employees. stream()   .collect(Collectors. groupingBy(Employee::getDepartment));

 Compute sum of salaries by department
 Map<Department, Integer> totalByDept = employees. stream()   .collect(Collectors. groupingBy(Employee::getDepartment, Collectors. summingInt(Employee::getSalary)));

 Partition students into passing and failing
 Map<Boolean, List<Student>> passingFailing = students. stream()   .collect(Collectors. partitioningBy(s -> s. getGrade() >= PASS_THRESHOLD));

  */
    }


    public static List<String> filter(List<String> set) {

        return set.stream()
                .filter(Main::startsWithV)
                .map(String::toUpperCase)
                //    .peek(System.out::println)
                .collect(Collectors.toList());
    }

    private static boolean startsWithV(String p) {
        return p.startsWith("v");
    }

    public List<String> optional(List<String> set) {

        List<String> list = new ArrayList<>();
        set.stream()
                .filter(p -> startsWithV(p))
                .findFirst()
                .ifPresentOrElse(list::add,
                        () -> list.add("NA"));
        return list;

    }


}