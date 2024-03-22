package com.example.xpppp_for_kouhai_devs.smart_home_tdd

import com.example.xpppp_for_kouhai_devs.smart_home_tdd.right.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue

class SmartHomeTest {
    //ここにテストを記述してください。
    //必要なTestDoubleは自分たちで設定しましょう。
    //TestDoubleを作るのにmockkなどの便利なライブラリがありますが今回は使用しないでください。
    @Test
    fun `bulbWarningがtrueの時、システムを起動するとD9000に「電球を交換してください」と表示する`(){
        //arrange
        val bulb = B9000BulbImpl()
        val switch = S9000SwitchImpl()
        val spyDisplay = SpyD9000Display()
        val smartHome = AkiraHouse(bulb, switch, spyDisplay)
        smartHome.bulbWarning = true

        //when
        smartHome.run()

        //then
        assertTrue(spyDisplay.displayBulbWarning_iscalled )
    }
}