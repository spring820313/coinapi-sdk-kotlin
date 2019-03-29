package core.multiaddr

import core.TxType
import java.math.BigInteger

/**
 * Created by Administrator on 2018/10/30.
 */
class JMultiAddrBtcTransactionSignParams(var changeAddress: String?,
                                         var feePerKb: BigInteger,
                                         var multiBtcvoutFormList: List<JMultiAddrBtcVout>?,
                                         var multiOutputList: List<JMultiAddrOutput>?,
                                         var recipientsPayFees: Boolean,
                                         var data: ByteArray?,
                                         var txType: Int) {
    constructor():this(null, BigInteger.valueOf(0), null, null, false, null, TxType.NONE.value)
}