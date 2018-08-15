package kr.co.sleeptime.momentit.entity

import org.threeten.bp.LocalDateTime

/**
 * @property feeling 0 ~ 10, use 1, 3, 5, 7, 9
 */
data class Moment(
        val feeling: Int,
        val location: Any? = null,
        val time: LocalDateTime,
        val memo: String? = null
)