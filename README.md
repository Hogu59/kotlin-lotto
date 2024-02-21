# kotlin-lotto

## 기능 요구사항

로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.  
로또 1장의 가격은 1000원이다.

## 기능 목록

- [x] 로또 번호 한개를 저장한다: LotteryNumber
    - 1 이상 45 이하의 숫자여야 한다.
    - 당첨번호와 중복되지 않은 보너스 번호를 생성할 수 있다. (팩토리 메서드로 객체 생성)

- [x] 로또 번호 6개만을 저장한다: Lottery
    - 중복된 번호가 없어야 한다.
    - Int 타입 리스트를 가지고 Lottery 를 생성하는 팩토리 메서드를 구현한다.

- [x] 금액을 저장한다: Money
    - Money 간의 사칙 연산과 나머지 연산을 구현한다.
    - Money 간의 대소 비교 기능을 구현한다.

- [x] 로또 여러 장을 저장한다: Lotteries

- [x] 금액을 받아서 로또 구매 수량을 알려준다: LotterySeller
    - 거스름돈이 있다면 거슬러 주어야 한다.
    - 1,000 원 이하의 금액은 에러 메시지를 띄운다.
    - 100,000원 초과로 구매시 예외를 던진다. (국내 로또 구매 기준)

- [x] 로또 당첨 통계를 상수화 하는 enum class: WinningRank
- [x] 로또 번호를 랜덤으로 생성해준다. LotteryGenerator

- [x] 로또 번호와 당첨 번호, 보너스 번호를 비교하여 당첨 결과를 알려준다: LotteryRankEvaluator
    - 로또와 당첨번호가 일치하는 숫자의 갯수를 알려준다.
    - 로또에 보너스번호가 있는지 여부를 알려준다.

- [x] 당첨된 등수(WinningRank)와 그 갯수(Int)를 저장한다. WinningResult

- [ ] 로또들에 대해 당첨 번호와 보너스 번호를 비교하여 최종 당첨 결과를 구한다: LotteryResultEvaluator
    - Lottery 의 개수만큼 LotteryRankEvaluator 의 evaluate 메서드를 실행한다.
    - WinningResult(Map<개수, WinningRank>) 를 리턴한다.

- [ ] 구입 금액을 입력받는다: InputView
- [ ] 지난 주 로또의 당첨 번호와 보너스 번호를 입력받는다.

- [ ] 구매한 로또 장 수를 출력한다: OutputView
- [ ] 구매한 로또의 번호들을 출력한다.
- [ ] 당첨 통계를 출력한다.
