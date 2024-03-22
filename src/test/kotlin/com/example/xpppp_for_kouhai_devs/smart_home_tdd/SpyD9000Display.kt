package com.example.xpppp_for_kouhai_devs.smart_home_tdd

import com.example.xpppp_for_kouhai_devs.smart_home_tdd.right.Display

class SpyD9000Display:Display {
    var displayBulbWarning_iscalled = false
    override fun displayBulbWarning() {
        displayBulbWarning_iscalled = true
    }
}