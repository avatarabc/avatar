package com.example.demo.view

import com.example.demo.model.WeeklyReport
import javafx.beans.property.ReadOnlyObjectWrapper
import tornadofx.*
import java.math.BigDecimal
import java.time.DayOfWeek




class DayOfWeekView : View() {
    override val root = vbox {
        tableview {
            for (dayOfWeek in DayOfWeek.values()) {
                column<WeeklyReport, BigDecimal>(dayOfWeek.toString()) {
                    ReadOnlyObjectWrapper(it.value.getTotal(dayOfWeek))
                }
            }
        }
    }


}