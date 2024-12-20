import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите количество стенок искомых обьемов!");
        Scanner scanner = new Scanner(System.in);
        int numCount = scanner.nextInt();
        int[] height = new int[numCount];
        System.out.println("Введите разные высоты согласно их колличества: - " + numCount);
        for (int i = 0; i < numCount; i++) {
            height[i] = scanner.nextInt();
        }
        System.out.println("---------------");
        System.out.println(Arrays.toString(height));
        maxArea(height);
    }

    private static void maxArea(int[] heights) {
        int maxArea = 0;
        for (int l = 0, r = heights.length - 1; l < r;) {
            maxArea = Math.max(maxArea, (r - l) * Math.min(heights[r], heights[l]));
            if (heights[l] < heights[r]){
                l++;
            } else {
                r--;
            }
        }
        System.out.println(maxArea);
    }
}