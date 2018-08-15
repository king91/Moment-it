package kr.co.sleeptime.momentit.domain.usecase

import io.reactivex.Single

abstract class UseCase<PARAM, RESULT> {
    abstract fun run(params: PARAM): Single<RESULT>
}
