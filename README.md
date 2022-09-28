# 숫자 야구 게임

## 진행 방법

* 숫자 야구 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

---

## 프로그래밍 요구사항

- 자바 코드 컨벤션을 지키면서 프로그래밍한다.
- indent(인덴트, 들여쓰기) depth를 2가 넘지 않도록 구현한다. 1까지만 허용한다.
    - 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
    - 힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메소드)를 분리하면 된다.
- 자바 8에 추가된 stream api를 사용하지 않고 구현해야 한다. 단, 람다는 사용 가능하다.
- else 예약어를 쓰지 않는다.
    - 힌트: if 조건절에서 값을 return하는 방식으로 구현하면 else를 사용하지 않아도 된다.
    - else를 쓰지 말라고 하니 switch/case로 구현하는 경우가 있는데 switch/case도 허용하지 않는다.
- 함수(또는 메소드)의 길이가 10라인을 넘어가지 않도록 구현한다.
    - 함수(또는 메소드)가 한 가지 일만 잘 하도록 구현한다.
- 도메인 로직에 단위 테스트를 구현해야 한다. 단, UI(System.out, System.in, Scanner) 로직은 제외
    - 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 분리해 구현한다.
    - 힌트는 MVC 패턴 기반으로 구현한 후 View, Controller를 제외한 Model에 대한 단위 테스트를 추가하는 것에 집중한다.

---

## 과제 진행 요구사항

- 기능을 구현하기 전에 docs/README.md 파일에 구현할 기능 목록을 정리해 추가한다.
- git의 commit 단위는 앞 단계에서 docs/README.md 파일에 정리한 기능 목록 단위 또는 의미있는 단위로 Commit
  한다.
- 모든 테스트가 통과되는지 확인(`gradle clean test`)하고 자바 8로 실행하는지 확인한다.

---

## 기능 요구사항

- 기본적으로 1 ~ 9까지 서로 다른 수로 입 3자리의 수를 맞추는 게임이다.
- 힌트
    - `스트라이크`
        - 같은 수가 **같은** 자리에 있으면
    - `볼`
        - 같은 수가 **다른** 자리에 있으면
    - `낫싱`
        - 같은 수가 전혀 없으면
- 숫자 야구게임에서 상대방의 역할을 컴퓨터가 한다.
- 컴퓨터는 1에서 9까지 서로 다른 임의의 수 3개를 선택한다.
- 게임 플레이어는 컴퓨터가 생각하고 있는 3개의 숫자를 입력하고, 컴퓨터는 입력한 숫자에 대한 결과를 출력한다.
- 이 같은 과정을 반복해 컴퓨터가 선택한 3개의 숫자를 모두 맞히면 게임이 종료된다.
- 게임을 종료한 후 게임을 다시 시작하거나 완전히 종료할 수 있다.
- 사용자가 잘못된 값을 입력할 경우 `IllegalArgumentException`을 발생시킨 후 애플리케이션은 종료되어야 한다.

---

## 기능 목록

### 입력

- [ ] 사용자가 입력한 값이 숫자가 아닌 경우 예외를 발생한다.
- [ ] 사용자가 입력한 값이 1~9까지 양의 정수가 아니라면 예외를 발생한다.
- [ ] 사용자가 입력한 값이 3자리가 아닌 경우 예외를 발생한다.
- [ ] 사용자가 입력한 값에 중복된 숫자가 존재하는 경우 예외를 발생한다.
- [ ] 게임 종료 여부를 입력할 때 사용자가 입력한 값이 유효하지 않을 경우 예외를 발생한다.

### 기능

- [ ] 사용자가 입력한 값을 한자리씩 파싱한다.
- [ ] 같은 수가 같은 자리에 있으면 스트라이크, 다른 자리에 있으면 볼, 같은 수가 전혀 없으면 낫싱 힌트를 반환한다.
- [ ] 게임 종료 여부를 판단한다.
- [ ] 게임을 시작하면 상대방의 수가 생성된다.

### 예외

- [ ] 사용자가 잘못된 값을 입력할 경우 `IllegalArgumentException`을 발생한다.