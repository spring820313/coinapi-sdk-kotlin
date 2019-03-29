package core

import java.math.BigInteger

/**
 * Created by Administrator on 2018/10/26.
 */
open class JBtcTransactionSignParams(var btSeed: JBtSeed?,
                                var fromAddress: String?,
                                var sendAddress: String?,
                                var sendValue: BigInteger,
                                var feePerKb: BigInteger,
                                var password: String?,
                                var priKey: String?,
                                var btcvoutFormList: List<JBtcVout>?,
                                var recipientsPayFees: Boolean = false,
                                var data: ByteArray? = null,
                                var txType: Int = TxType.NONE.value) : JTransactionSignParams() {
    constructor():this(null, null, null, BigInteger.valueOf(0), BigInteger.valueOf(0), null, null, null, false, null)
}