package core

import java.math.BigInteger

/**
 * Created by Administrator on 2018/10/30.
 */
open class JSmcCommonTxParams(var srcRegId: String?,
                         var destAddr: String?,
                         var value: BigInteger): JSmcBaseTransactionSignParams(){
    constructor():this(null, null, BigInteger.valueOf(0)) {
        txType = TxType.WICC_COMMON.value
        txVersion = 1
    }
}