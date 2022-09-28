package baseball.service;

import static baseball.util.StringUtils.parseInt;

import baseball.domain.Number;
import camp.nextstep.edu.missionutils.Console;

public class CallBackImpl implements CallBack<String> {

    @Override
    public String call() {
        System.out.print("숫자를 입력해주세요 : ");
        String readLine = Console.readLine();

        Number number = new Number(parseInt(readLine));
        System.out.println("number = " + number);

        return "data";
    }

}
