package core

import java.math.BigInteger

/**
 * Created by Administrator on 2018/10/30.
 */
open class JSmcBaseTransactionSignParams(var btSeed: JBtSeed? = null,
                                    var password: String? = null,
                                    var priKey: String? = null,
                                    var txType: Int,
                                    var txVersion: Int,
                                    var validHeight: Int = 0,
                                    var fees: BigInteger = BigInteger.valueOf(0)): JTransactionSignParams() {
    constructor():this(null, null, null, 0, 0, 0, BigInteger.valueOf(0))
}