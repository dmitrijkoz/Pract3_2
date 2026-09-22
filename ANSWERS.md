# Ответы на вопросы

## 1. Пример примитивного типа

В программе используется примитивный тип int.

Например:
private int NumGears;

## 2. Где происходит конкатенация строк

Конкатенация строк происходит в методе printDescription()
класса Bike при использовании оператора +.

Пример:

"This bike has " + this.handleBars
+ " handlebars on a "
+ this.frame
+ " frame with "
+ this.NumGears
+ " gears."

## 3. Имена созданных объектов

bike1
bike2
bike3
bike4

## 4. Количество конструкторов

Bike:
2 конструктора.

MountainBike:
2 конструктора.

RoadBike:
3 конструктора.

## 5. Наследование

Bike — суперкласс.

MountainBike — подкласс Bike.

RoadBike — подкласс Bike.

## 6. Стандартные значения

Стандартный MountainBike:

handleBars = Bull Horn
frame = Hardtail
tyres = Maxxis
seatType = dropper
numGears = 27
suspension = RockShox XC32
type = Pro
frameSize = 19

Стандартный RoadBike:

handleBars = drop
frame = racing
tyres = tread less
seatType = razor
numGears = 19
tyreWidth = 20
postHeight = 22