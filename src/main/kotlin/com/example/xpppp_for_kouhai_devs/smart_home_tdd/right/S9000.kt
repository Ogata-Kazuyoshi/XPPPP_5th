package com.example.xpppp_for_kouhai_devs.smart_home_tdd.right
//スイッチS9000のクラスを宣言し、実装してください。
//S9000クラスはアキラくんの家に必要なインターフェースを継承してください。
class S9000SwitchImpl :Switch{
    override var countTurnOn: Int
        get() = TODO("Not yet implemented")
        set(value) {}


    override fun isON(): Boolean {
        return true
    }
}