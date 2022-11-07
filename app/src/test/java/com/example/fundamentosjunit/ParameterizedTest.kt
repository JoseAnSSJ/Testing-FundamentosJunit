package com.example.fundamentosjunit

import junit.framework.TestCase.assertEquals
import org.junit.AfterClass
import org.junit.BeforeClass
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(value = Parameterized::class )
class ParameterizedTest(val currentValue: Boolean, val currentUser: User) {

    @get:Rule
    val locationTestRule = LocationTestRule()



    companion object{
        var assertion: Assertions? = null

        @BeforeClass @JvmStatic
        fun setUpCommon(){
            assertion = Assertions()

        }

        @AfterClass @JvmStatic
        fun tearCommon(){
            assertion = null

        }

        @Parameterized.Parameters @JvmStatic
        fun getUsersEs() = arrayOf(
            arrayOf(false, User("Pedro", 12)),
            arrayOf(true, User("Clara", 18)),
            arrayOf(true, User("bits", 1, false)),
            arrayOf(true, User("Juan", 34)))
    }/*        fun getUsersUS() = arrayOf(
            arrayOf(false, User("Pedro", 12)),
            arrayOf(true, User("Clara", 34)),
            arrayOf(true, User("bits", 1, false)),
            arrayOf(true, User("Juan", 34)))
    }*/

    @Test
    fun isAdultTest() {
        //assertEquals(currentValue, assertion?.isAdult(currentUser))
        assertEquals(currentValue, locationTestRule.assertions!!.isAdult(currentUser))
    }

}