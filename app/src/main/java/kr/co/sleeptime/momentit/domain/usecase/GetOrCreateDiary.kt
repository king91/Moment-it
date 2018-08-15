package kr.co.sleeptime.momentit.domain.usecase

import io.reactivex.Single
import kr.co.sleeptime.momentit.domain.repository.DiaryRepository
import kr.co.sleeptime.momentit.entity.Diary
import org.threeten.bp.LocalDate

class GetOrCreateDiary(private val diaryRepository: DiaryRepository) : UseCase<GetOrCreateDiary.CreateDiaryParams, Diary>() {

    override fun run(params: CreateDiaryParams): Single<Diary> {
        return diaryRepository.createDiary(params.localDate)
    }

    data class CreateDiaryParams(
            val localDate: LocalDate
    )
}