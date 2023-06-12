import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int targetNumber = 42; // 設定された数
        int maxAttempts = 5; // 最大試行回数
        int attempts = 0; // 現在の試行回数

        Scanner scanner = new Scanner(System.in);

        System.out.println("数当てゲームを開始します！2桁の正の整数を予想して入力してください。");

        while (attempts < maxAttempts) {
            System.out.print("予想した数を入力してください: ");
            int guess = scanner.nextInt();

            if (guess == targetNumber) {
                System.out.println("当たり！");
                break;
            } else {
                attempts++;
                if (guess > targetNumber) {
                    System.out.println("入力した数は設定された数より大きいです。");
                } else {
                    System.out.println("入力した数は設定された数より小さいです。");
                }

                int difference = Math.abs(guess - targetNumber);
                if (difference >= 20) {
                    System.out.println("20以上差があります。");
                }
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("ゲームオーバー！正解は " + targetNumber + " でした。");
        }

        scanner.close();
    }
}

