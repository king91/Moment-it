package kr.co.sleeptime.momentit.data

import io.reactivex.Single
import kr.co.sleeptime.momentit.domain.repository.DiaryRepository
import kr.co.sleeptime.momentit.entity.Diary
import org.threeten.bp.LocalDate

class DiaryDataRepository : DiaryRepository {
    override fun createDiary(localDate: LocalDate): Single<Diary> {
        return Single.error(NotImplementedError())
    }
}