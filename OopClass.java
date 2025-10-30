public class OopClass {
    public static void main(String[] args) {
        // Tạo một đối tượng OopClass trước
        OopClass outer = new OopClass();

        // Sau đó dùng nó để tạo đối tượng Student
        OopClass.Student s1 = outer.new Student("Duy", 20);

        // Gọi phương thức
        s1.displayInfo();
    }

    public class Student {
        String name;
        int age;

        public Student(String ten, int tuoi) {
            name = ten;
            age = tuoi;
        }

        public void displayInfo() {
            System.out.println("Tên: " + name + ", Tuổi: " + age);
        }
    }
}
