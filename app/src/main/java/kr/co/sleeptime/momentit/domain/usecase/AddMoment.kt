package kr.co.sleeptime.momentit.domain.usecase

import io.reactivex.Single
import kr.co.sleeptime.momentit.domain.repository.MomentRepository
import kr.co.sleeptime.momentit.entity.Moment
import org.threeten.bp.LocalDateTime

/**
 * load Diary (if not create diary)
 * create Moment in Diary
 */
class AddMoment(private val getOrCreateDiary: GetOrCreateDiary, private val momentRepository: MomentRepository) : UseCase<AddMoment.AddMomentParams, Moment>() {

    override fun run(params: AddMomentParams): Single<Moment> {
        val nowDateTime = LocalDateTime.now()
        val createDiaryParams = GetOrCreateDiary.CreateDiaryParams(nowDateTime.toLocalDate())

        return getOrCreateDiary.run(createDiaryParams)
                .flatMap {
                    momentRepository.createMoment(it, params.feeling, params.memo)
                }
    }

    data class AddMomentParams(
            val feeling: Int,
            val memo: String?
    )
}