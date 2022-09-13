package com.example.data_binding_10747

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlin.random.Random

object FakeRepository {
    private val fruitNames: List<String> = listOf(
        "apel", "mangga", "pisang", "Anggur", "Stroberi",
        "jambu", "raspberi", "Bambu", "Kiwi", "pir"
    )

    private val  _currentRandomFruitName = MutableLiveData<String>()
    val currentRandomFruitName: LiveData<String>
    get() = _currentRandomFruitName

    init {
        _currentRandomFruitName.value = fruitNames.first()
    }

    fun getRandomfruitName(): String{
        val random = Random.nextInt(fruitNames.size)
        return fruitNames[random]
    }

    fun changeCurrentRandomFruitName(){
        _currentRandomFruitName.value = getRandomfruitName()
    }
}