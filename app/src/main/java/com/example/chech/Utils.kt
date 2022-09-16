package com.example.checkinout

import com.example.chech.Employee
import com.example.chech.Permission
import java.time.LocalDate


    fun hasPermission(employee:Employee, date: LocalDate, permissions: List<Permission>): Boolean {
        val permission = permissions.firstOrNull{it.date==date && it.employee==employee}
        return (permission!=null)
    }
