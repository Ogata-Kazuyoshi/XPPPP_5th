package com.example.xpppp_for_kouhai_devs.smart_home_tdd.right

//ヒント
//DIPの講義で使用したCarのコードを参考にしましょう。
//wrongフォルダに良くない例としてスマートホームのサンプルコードを示してあります。
//サンプルコード（wrongフォルダ内）を良くみてDIPに則った形に書き直してください。
//まずは必要なインターフェースを実装しましょう
//次にアキラくんの家（class AkiraHouse)を宣言し実装しましょう
//アキラくんの家はSmartHomeのインターフェースを継承する形で定義してください。
//アキラくんの家は依存関係を注入できるようにコンストラクターの引数を設定しましょう。

interface Bulb {
    fun turnOn()
    fun turnOff()
}

interface Switch {
    var countTurnOn : Int
    fun isON():Boolean
}

interface Display {
    fun displayBulbWarning()
}

class AkiraHouse(val bulb:Bulb, val switch:Switch, val display: Display):SmartHome {

    var bulbWarning = false
    override fun run(){
        lighting()
    }
    //ここから下は各部屋の照明を管理するメソッド
    private fun lighting(){
        if (bulbWarning) {
            display.displayBulbWarning()
        }

        if(switch.isON()){
            bulb.turnOn()
        }else{
            bulb.turnOff()
        }
    }
}