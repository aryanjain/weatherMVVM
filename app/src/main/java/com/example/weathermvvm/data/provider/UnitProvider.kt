package com.example.weathermvvm.data.provider


import com.example.weathermvvm.internals.UnitSystem

interface UnitProvider {
    fun getUnitSystem(): UnitSystem
}