public class StudentInfoTest {
    public static void main(String[] args) {
        StudentInfo student = new StudentInfo(); // Tạo đối tượng mặc định
        student.display(); // In ra giá trị mặc định

        // Gọi các phương thức public để thay đổi giá trị
        student.setName("Duy");
        student.setClasses("C07");

        // In lại để kiểm tra
        student.display();
    }
}

// ===============================
// LỚP STUDENTINFO
// ===============================
class StudentInfo {
    // Thuộc tính private
    private String name = "John";
    private String classes = "C02";

    // Constructor không tham số
    public StudentInfo() {
    }

    // Setter cho name
    public void setName(String name) {
        this.name = name;
    }

    // Setter cho classes
    public void setClasses(String classes) {
        this.classes = classes;
    }

    // Phương thức hiển thị thông tin
    public void display() {
        System.out.println("Name: " + name + ", Class: " + classes);
    }
}
