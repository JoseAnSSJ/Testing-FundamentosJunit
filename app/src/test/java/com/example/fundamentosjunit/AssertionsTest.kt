package com.example.fundamentosjunit

import org.junit.Assert.*
import org.junit.Test
import kotlin.random.Random

class AssertionsTest{
    @Test
    fun getArrayTest(){
        val assertions = Assertions()
        val array = arrayOf(24,13)
        assertArrayEquals(array, assertions.getLuckyNumbers())
    }

    @Test
    fun getNameTest(){
        val assertions = Assertions()
        val name = "Jose"
        val otherName = "Ads"
        assertEquals(name,assertions.getName())
        assertNotEquals(otherName,assertions.getName())
    }

    @Test
    fun getHumanTest(){
        val assertions = Assertions()
        val bot = User("8bit",1,false)
        val juan = User("Juan",18,true)
        assertFalse(assertions.checkHuman(bot))
        assertTrue(assertions.checkHuman(juan))

    }

    @Test
    fun checkNullUserTest(){
        val user = null
        assertNull(user)
        val assertions = Assertions()
        assertNull(assertions.checkHuman(user))
    }

    @Test
    fun checkNotNullUserTest(){
        val bot = User("8bit",1,false)
        val assertions = Assertions()
        assertNotNull(assertions.checkHuman(bot))
    }

    @Test
    fun checkNotSameUsersTest(){
        val bot = User("8bit",1,false)
        val juan = User("Juan",18,true)
        assertNotSame(bot,juan)
    }

    @Test
    fun checkSameUsersTest(){
        val bot = User("8bit",1,false)
        val juan = User("8bit",1,false)
        val copiJuan = juan
        assertSame(copiJuan,juan)
    }

    @Test(timeout = 1000)
    fun getCitiesTest(){
        val cities = arrayOf("mexico", "peru", "argentina")
        Thread.sleep(Random.nextLong(200,1100))
        assertEquals(3,cities.size)
    }
}