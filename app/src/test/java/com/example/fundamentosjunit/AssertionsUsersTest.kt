package com.example.fundamentosjunit

import org.junit.After
import org.junit.AfterClass
import org.junit.Assert.*
import org.junit.Before
import org.junit.BeforeClass

import org.junit.Test

class AssertionsUsersTest {


    private lateinit var bot: User // = User("8bit",1,false)
     // = User("Juan",18,true)

    companion object{
        private lateinit var juan:User

        @BeforeClass @JvmStatic
        fun setUpCommon(){
            juan = User("Juan",18,true)
        }

        @AfterClass @JvmStatic
        fun tearDownCommon(){
            juan = User()
        }
    }
    @Before
    fun setUp(){
        bot = User("8bit",1,false)
    }

    @After
    fun tearDown(){
        bot = User()
    }

    @Test
    fun checkHumanTest() {
        val assertions = Assertions()
        assertFalse(assertions.checkHuman(bot))
        assertTrue(assertions.checkHuman(juan))
    }

    @Test
    fun checkNotNullUserTest(){
        val assertions = Assertions()
        assertNotNull(assertions.checkHuman(bot))
    }

    @Test
    fun checkNotSameUsersTest(){
        assertNotSame(bot,juan)
    }

    @Test
    fun checkSameUsersTest(){
        val copiJuan = juan
        assertSame(copiJuan,juan)
    }
}