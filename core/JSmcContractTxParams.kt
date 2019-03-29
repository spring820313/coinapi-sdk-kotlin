package core

import java.math.BigInteger

/**
 * Created by Administrator on 2018/10/30.
 */
class JSmcContractTxParams(var contract: ByteArray?):JSmcCommonTxParams() {
    constructor():this(null) {
        txType = TxType.WICC_TRANSFER_SPC.value
        txVersion = 1
        value = BigInteger.valueOf(0)
    }
}