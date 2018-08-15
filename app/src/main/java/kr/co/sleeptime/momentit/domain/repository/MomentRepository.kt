package kr.co.sleeptime.momentit.domain.repository

import io.reactivex.Single
import kr.co.sleeptime.momentit.entity.Diary
import kr.co.sleeptime.momentit.entity.Moment

interface MomentRepository {
    fun createMoment(diary: Diary, feeling: Int, memo: String?): Single<Moment>
}