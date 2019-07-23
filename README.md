# **커플 공유 가계부**

##  **기능**
> **회원가입**
* 어떻게?
    1. 카카오톡 로그인 연동
    2. 공유하려는 사용자에게 카카오톡 초대 보내기
> **로그인**

* 어떻게?
    1. 카카오톡 로그인 버튼을 누른다.
> **문자 메시지의 카드 사용내역을 읽어서 DB에 저장한다.**
* 어떻게?
    1. 문자메시지의 특정 단어를 읽는다 
    <br>ex) 지출, 금액, 사용내역, 카드 번호
    2. 해당 사용 금액을 DB에 저장한다. (승인한 카드 번호일 경우)
    3. 지출 내역에 대한 알림을 다른 사람에게 전송한다(승인했을 경우)
> **가계부에 금액 표시**
* 어떻게?
    1. DB에서 공유 가계부 사용자에 대한 지출 및 입금 ? 내역을 불러온다. (임금 내역은 힘들듯)
    2. 불러온 정보를 가계부에 보여준다.
> **지출 내역을 등록한다**
* 어떻게?
    1. 사용자로부터 아래의 정보를 입력 받는다.
    <br> 금액, 결제 수단 (카드 현금), 내용, 날짜, 메모
    2. 입력 받은 정보를 DB에 등록한다.
> **가계부를 공유한다**
* 어떻게?
    1. 공유하려는 사용자에게 카카오톡으로 공유 코드를 전송한다
    2. 사용자는 캘린더 공유 받기에서 공유 받은 리스트를 누르고 공유 코드를 입력한다.
    3. 공유가 이루어진다.
> **메인 화면에 가계부 표시**
* 어떻게? 
    1. 가계부 리스트에서 메인에 표시할 가계부 선택한다.
    2. 메인 화면에 표시한다.
> **가계부 리스트 표시**
* 어떻게? 
    1. 가계부 리스트를 카드뷰 형태로 표시한다.