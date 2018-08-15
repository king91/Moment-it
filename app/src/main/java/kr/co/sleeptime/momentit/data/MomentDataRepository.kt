package kr.co.sleeptime.momentit.data

import io.reactivex.Single
import kr.co.sleeptime.momentit.domain.repository.MomentRepository
import kr.co.sleeptime.momentit.entity.Diary
import kr.co.sleeptime.momentit.entity.Moment

class MomentDataRepository:MomentRepository {
    override fun createMoment(diary: Diary, feeling: Int, memo: String?): Single<Moment> {
        return Single.error(NotImplementedError())
    }
}