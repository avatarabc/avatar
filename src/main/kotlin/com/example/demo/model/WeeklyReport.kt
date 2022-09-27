package com.example.demo.model

import java.math.BigDecimal
import java.time.DayOfWeek
import java.time.LocalDate

abstract class WeeklyReport(val startDate: LocalDate) {
    abstract fun getTotal(dayOfWeek: DayOfWeek): BigDecimal
}