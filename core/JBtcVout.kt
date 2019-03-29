package core

import java.math.BigInteger

/**
 * Created by Administrator on 2018/10/26.
 */
open class JBtcVout(var hash: String?,
                    var value: BigInteger,
                    var n: Int,
                    var coinBase: Boolean) {
    constructor():this(null, BigInteger.valueOf(0), 0, false)
}