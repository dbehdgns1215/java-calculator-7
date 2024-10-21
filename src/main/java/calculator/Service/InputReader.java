package calculator.Service;

import calculator.DTO.StringCalculatorDTO;
import camp.nextstep.edu.missionutils.Console;

public class InputReader {

    // 입력을 받아 DTO로 반환하는 메서드
    public StringCalculatorDTO read() {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String input = Console.readLine();      // 사용자로부터 입력 받기

        if (input.isEmpty()) {
            input = " ";                        // 빈 문자열(\n) 입력시에는 " " 를 반환
        }

        Console.close();                        // 입력 후 콘솛 객체 제거
        return new StringCalculatorDTO(input);  // 입력값을 DTO로 감싸서 반환
    }
}
