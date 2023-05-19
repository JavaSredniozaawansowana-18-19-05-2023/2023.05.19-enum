package pl.szkolenia.comarch.wyliczeniowy;

public class App {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.position = Position.HIGH;

        if(employee.position == Position.HIGH) {
            //???
        }

        Console console = Console.PS5;
        System.out.println(console.getBrand());
        console.setBrand("abc");
    }
}
