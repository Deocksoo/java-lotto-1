package view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputView {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static int inputPurchaseAmount() {
        try {
            System.out.println("구입금액을 입력해주세요.");
            String purchasedAmount = SCANNER.nextLine().trim();
            return Integer.parseInt(purchasedAmount);
        } catch (NumberFormatException e) {
            System.out.println("정수만 입력할 수 있습니다.");
            return inputPurchaseAmount();
        }
    }

    public static List<Integer> inputWinningNumbers() {
        try {
            System.out.println("지난 주 당첨 번호를 입력해주세요.");
            return Arrays.stream(SCANNER.nextLine().split(",\\s*"))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
        } catch (NumberFormatException e) {
            System.out.println("정수만 입력할 수 있습니다.");
            return inputWinningNumbers();
        }
    }

    public static int inputBonusNumber() {
        try {
            System.out.println("보너스 볼을 입력해주세요.");
            String bonusNumber = SCANNER.nextLine().trim();
            return Integer.parseInt(bonusNumber);
        } catch (NumberFormatException e) {
            System.out.println("정수만 입력할 수 있습니다.");
            return inputBonusNumber();
        }
    }

    public static int inputNumber() {
        try {
            System.out.println("수동으로 구매할 로또 수를 입력해주세요.");
            String number = SCANNER.nextLine().trim();
            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            System.out.println("정수만 입력할 수 있습니다.");
            return inputNumber();
        }
    }

    public static List<Integer> getManualNumbers() {
        try {
            return Arrays.stream(SCANNER.nextLine().split(",\\s*"))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
        } catch (NumberFormatException e) {
            System.out.println("정수만 입력할 수 있습니다.");
            return inputWinningNumbers();
        }
    }

    public static void printMessage(String s) {
        System.out.println(s);
    }
}
