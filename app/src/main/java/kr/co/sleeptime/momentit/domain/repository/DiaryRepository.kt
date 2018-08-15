package kr.co.sleeptime.momentit.domain.repository

import io.reactivex.Single
import kr.co.sleeptime.momentit.entity.Diary
import org.threeten.bp.LocalDate

interface DiaryRepository {
    fun createDiary(localDate: LocalDate): Single<Diary>
}