# Template Method

# 사전적 의미
step pattern  

알고리즘의 구조를 메소드에 정의 하고 하위 클래스에서 알고리즘 구조의 변경없이 알고리즘을 재정의 하는 패턴  

# 사용 시기
- 사용하려는 알고리즘이 **일정한 프로세스**가 있다.
    - 여러 단계로 나눌 수 있다.
- 구현하려는 알고리즘이 **변경 가능성**이 있다.

# 적용 순서
1. 알고리즘을 여러 단계로 나눈다.
2. 나눠진 알고리즘의 단계를 메소드로 선언한다.
3. 알고리즘을 수행할 템플릿 메소드를 만든다.
4. 하위 클래스에서 나눠진 메소드들을 구현한다.

# 예제
- 신작 게임의 접속을 구현해주세요
  - requestConnection(String str) : String
- 유저가 게임 접속시 다음을 고려해야 합니다.
  - 보안 과정 : 보안 관련 부분을 처리합니다.
    - doSecurity(String string) : String
  - 인증 과정 : user name과 password가 일치하는지 확인합니다.
    - authentication(String id, String password) : boolean
  - 권한 과정 : 접속자가 유료 회원인지 무료회원인지 게임 마스터인지 확인합니다.
    - authorization(String userName) : int
  - 접속 과정 : 접속자에게 커넥션을 정보로 넘겨줍니다.
    - connection(String info) : String

접속 과정이 단계별로 나눠져있으며 메소드로 선언되어있다.