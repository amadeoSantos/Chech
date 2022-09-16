package com.example.chech

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.DayOfWeek
import java.time.LocalDate
import java.time.LocalTime

@RequiresApi(Build.VERSION_CODES.O)
fun main(){

    val employee=Employee(1,"Amadeo Santos Vargas",
        AcademicLevel.BACHELOR,"SAVA980331HOCNRM08",
        LocalDate.parse("2010-09-01"),"001")

  val period=Period(LocalDate.parse("2022-09-01"),LocalDate.parse("2022-09-15"), "Primera Quincena")

   val schedule=Schedule.Builder(employee,period)
        .addOne(Schedule.Detail(DayOfWeek.MONDAY, LocalTime.of(8,0),LocalTime.of(14,0)))
       .addOne(Schedule.Detail(DayOfWeek.TUESDAY, LocalTime.of(8,0),LocalTime.of(14,0)))
        .addOne(Schedule.Detail(DayOfWeek.THURSDAY, LocalTime.of(8,0), LocalTime.of(14,0))).build()

    val checkInOut = listOf(
        CheckInOut(LocalDate.parse("2022-09-05"),employee, LocalTime.of(8,8),LocalTime.of(14,0)),
        CheckInOut(LocalDate.parse("2022-09-08"),employee, LocalTime.of(8,10),LocalTime.of(14,0)),
        CheckInOut(LocalDate.parse("2022-09-12"),employee, LocalTime.of(8,15),LocalTime.of(14,0)),
        CheckInOut(LocalDate.parse("2022-09-13"),employee, LocalTime.of(8,0),LocalTime.of(14,0)),


    )
    val permission= listOf(
        Permission(employee,LocalDate.parse("2022-09-06"), "Enfermedad")
    )

    val invident=Incident(employee,schedule,checkInOut, permission,LocalDate.parse("2022-09-01"),LocalDate.parse("2022-09-15") )



    println("Empleado ${employee.fullName}  ")
    println("Años de antiguedad  :::::${employee.getSeniority()} años")
    println("Genero ${employee.getGenre()}")
    println("Retardos ${invident.getRetardant()}")
    println("Ausencias ${invident.getAbsences()} ")

    }
