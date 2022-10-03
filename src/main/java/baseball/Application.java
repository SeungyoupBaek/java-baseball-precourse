package baseball;

import baseball.controller.GameController;

public class Application {
    public static void main(String[] args) {
        try {
            GameController.gameStart();
        } catch (IllegalArgumentException e) {
            System.out.println("잘못된 입력입니다.");
            System.out.println("게임 종료");
        }
    }
}
