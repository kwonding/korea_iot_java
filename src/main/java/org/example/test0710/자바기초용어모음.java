package org.example.test0710;

public class 자바기초용어모음 {
}

/*
접근제한자
: 클래스, 변수, 메서드의 접근 범위 제어

- public: 다 접근 가능
- protected: 동일한 패키지 내, 다른 패키지의 클래스는 상속받을때만
- default: 동일한 패키지
- private: 해당 클래스 내

static
: 클래스의 모든 인스턴스들 공유 가능
- static 변수:
- static 메서드:

final
: 상수, 변하지 않음

- final 변수: 재할당 불가
- final 메서드: 오버라이딩 안됨
- final 클래스: 상속 안됨

super VS this
this : 클래스 내 필드와 생성자의 구분을 위해서 사용
super : 부모 클래스에서 상속받은 메서드, 생성자등을 자식클래스에서 사용할 때 작성

abstract
: 추상클래스, 완성되지않은 클래스, 다른 클래스를 상속받아야지만 완성됨
반드시 하나 이상의 추상 메서드를 포함

abstract 클래스: abstract class 클래스명 {}
abstract 메서드: abstract 반환타입 메서드명 (매개변수); - 구현부 없이 ; 으로 마무리

interface VS abstract class
- interface: 규칙(규약), 다중 상속 가능
- abstract class: 다중 상속 안됨

extends VS implements
- extends: abstract class를 상속 할 때 사용
- implements: interface 구현 할 때 사용

try-catch-finally
- try: 예외가 발생할 수 있는 코드 작성
- catch: 발생할 수 있는 예외 타입작성, 해당 예외가 발생했을 경우 {} 실행
- finally: 예외 발생 여부와 상관없이 항상 {} 실행
 */