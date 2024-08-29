package bt14;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortingStudent {
    public static List<Student> students = new ArrayList<Student>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            Student s = new Student();
            s.inputData(sc);
            students.add(s);
        }
        System.out.println("selection sort");
        selectionSort(students);
        System.out.println("insertion sort");
        insertionSort(students);
        System.out.println("bubble sort");
        bubbleSort(students);
    }

    public static void selectionSort(List<Student> students) {
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = 0; j < students.size() - i - 1; j++) {
                if (students.get(i).getScore() > students.get(j).getScore()) {
                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
        }
        for (Student student : students) {
            student.displayData();
        }
    }

    public static void insertionSort(List<Student> students) {
        for (int i = 0; i < students.size() - 1; i++) {
            Student currentElement = students.get(i);
            int k;
            for (k = i - 1; k >= 0 && students.get(k).getScore() < currentElement.getScore(); k--) {
                students.set(k + 1, students.get(k));
            }
            students.set(k + 1, currentElement);
        }
        for (Student student : students) {
            student.displayData();
        }
    }

    public static void bubbleSort(List<Student> students) {
        for (int i = 0; i < students.size() - 1; i++) {
            if (students.get(i).getScore() < students.get(i + 1).getScore()) {
                Student temp = students.get(i);
                students.set(i, students.get(i + 1));
                students.set(i + 1, temp);
            }
        }
        for (Student student : students) {
            student.displayData();
        }
    }
}
