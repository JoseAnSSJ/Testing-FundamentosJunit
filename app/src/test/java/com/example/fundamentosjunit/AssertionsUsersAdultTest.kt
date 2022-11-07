package com.example.fundamentosjunit

import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule

import org.junit.Test

class AssertionsUsersAdultTest {

    private lateinit var bot: User
    private lateinit var juan: User

    @get:Rule val locationTestRule = LocationTestRule()


    val assertions = Assertions()

    @Before
    fun setUp(){
        bot = User("8bit",1,false)
        juan = User("Juan",18,true)
    }

    @After
    fun tearDown(){
        bot = User()
        juan = User()
    }

    @Test
    fun isAdultTest() {
        /*assertions.setLocation("MEX")
        assertTrue(assertions.isAdult(juan))*/
        assertTrue(locationTestRule.assertions!!.isAdult(juan))
    }
}