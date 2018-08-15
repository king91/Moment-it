package kr.co.sleeptime.momentit.di

import kr.co.sleeptime.momentit.data.DiaryDataRepository
import kr.co.sleeptime.momentit.data.MomentDataRepository
import kr.co.sleeptime.momentit.domain.repository.DiaryRepository
import kr.co.sleeptime.momentit.domain.repository.MomentRepository
import kr.co.sleeptime.momentit.domain.usecase.AddMoment
import kr.co.sleeptime.momentit.domain.usecase.GetOrCreateDiary
import org.koin.dsl.module.Module
import org.koin.dsl.module.applicationContext

object MyModules {

    private val myModule: Module = applicationContext {

        bean { AddMoment(get(), get()) }
        bean { GetOrCreateDiary(get()) }
        bean { DiaryDataRepository() as DiaryRepository }
        bean { MomentDataRepository() as MomentRepository }
    }

    val modules: List<Module> get() = listOf(myModule)
}
