package ru.samsung.itacademy.mdev.simplecalctemplate

import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class CalculatorTest {
    private var calculator:Calculator? = null
    @Before
    fun setUp(){
        calculator = Calculator()
    }

    @Test
    fun addition(){
        Assert.assertEquals(3, calculator!!.add(1, 2).toLong())
        Assert.assertEquals(11, calculator!!.add(9, 2).toLong())
        Assert.assertEquals(4, calculator!!.add(1, 3).toLong())
        Assert.assertEquals(2, calculator!!.add(1, 1).toLong())
        Assert.assertEquals(7, calculator!!.add(5, 2).toLong())
        Assert.assertEquals(2, calculator!!.add(0, 2).toLong())
        Assert.assertEquals(5, calculator!!.add(5, 0).toLong())
    }

    @Test
    fun subtraction(){
        Assert.assertEquals(-1, calculator!!.subtract(1, 2).toLong())
        Assert.assertEquals(7, calculator!!.subtract(9, 2).toLong())
        Assert.assertEquals(-2, calculator!!.subtract(1, 3).toLong())
        Assert.assertEquals(0, calculator!!.subtract(1, 1).toLong())
        Assert.assertEquals(3, calculator!!.subtract(5, 2).toLong())
        Assert.assertEquals(-2, calculator!!.subtract(0, 2).toLong())
        Assert.assertEquals(5, calculator!!.subtract(5, 0).toLong())
    }

    @Test
    fun multiplication(){
        Assert.assertEquals(2, calculator!!.multiply(1, 2).toLong())
        Assert.assertEquals(18, calculator!!.multiply(9, 2).toLong())
        Assert.assertEquals(3, calculator!!.multiply(1, 3).toLong())
        Assert.assertEquals(1, calculator!!.multiply(1, 1).toLong())
        Assert.assertEquals(10, calculator!!.multiply(5, 2).toLong())
        Assert.assertEquals(0, calculator!!.multiply(0, 2).toLong())
        Assert.assertEquals(0, calculator!!.multiply(5, 0).toLong())
    }

    @Test
    fun division(){
        Assert.assertEquals(0, calculator!!.divide(1, 2).toLong())
        Assert.assertEquals(4, calculator!!.divide(9, 2).toLong())
        Assert.assertEquals(0, calculator!!.divide(1, 3).toLong())
        Assert.assertEquals(1, calculator!!.divide(1, 1).toLong())
        Assert.assertEquals(2, calculator!!.divide(5, 2).toLong())
        Assert.assertEquals(0, calculator!!.divide(0, 2).toLong())
        Assert.assertEquals(0, calculator!!.divide(5, 0).toLong())
    }

    @After
    fun tearDown(){
        calculator = null
    }
}