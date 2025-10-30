import java.util.Random;

public class StopWatchTest {
    public static void main(String[] args) {
        // Tạo mảng 100,000 phần tử ngẫu nhiên
        int[] arr = new int[100000];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1000000);
        }

        // Tạo đồng hồ
        StopWatch stopwatch = new StopWatch();

        // Bắt đầu đo thời gian
        stopwatch.start();

        // Gọi hàm selection sort
        selectionSort(arr);

        // Dừng đo
        stopwatch.stop();

        // In ra kết quả
        System.out.println("Thời gian sắp xếp 100,000 phần tử (ms): " + stopwatch.getElapsedTime());
    }

    // Thuật toán Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Hoán đổi
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}

// ==============================
// LỚP STOPWATCH
// ==============================
class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
}
