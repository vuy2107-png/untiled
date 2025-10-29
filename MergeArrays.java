public class MergeArrays {
    public static void main(String[] args) {
        String[] students = {"Vũ", "Ngọc", "Duy", "Huy", "Tuấn", "Anh"};
        String[] teachers = {"Nguyễn", "Bá", "Tuấn", "Anh"};

        String[] classes = new String[students.length + teachers.length];

        // Sao chép mảng students
        for (int i = 0;i < students.length; i++) {
            classes[i] = students[i];
        }
        for (int i = 0;i < teachers.length; i++) {
            classes[students.length + i] = teachers[i];
        }
        System.out.println("Mảng classes sau khi gộp:");
        for (int i = 0; i < classes.length; i++) {
            System.out.print(classes[i] + "\t");
        }
    }
}
