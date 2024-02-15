package racingcar.controller

import racingcar.model.Car
import racingcar.model.findWinnerNames
import racingcar.model.move
import racingcar.view.inputCarName
import racingcar.view.inputTryCnt
import racingcar.view.printRunMenu
import racingcar.view.printWinners


fun run() {
    val carNames = inputCarName().split(",").map { it.trim() }
    val count = inputTryCnt()
    var cars = mutableListOf<Car>()
    for (carName in carNames) {
        cars.add(Car(carName))
    }

    printRunMenu()
    for (i in 1..count) move(cars)

    val winners = findWinnerNames(cars)
    printWinners(winners)
}