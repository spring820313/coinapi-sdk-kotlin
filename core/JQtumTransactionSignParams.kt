package core

import java.math.BigInteger

/**
 * Created by Administrator on 2018/10/30.
 */
class JQtumTransactionSignParams(var gasLimit: BigInteger,
                                 var gasPrice: BigInteger,
                                 var tokenValue: BigInteger,
                                 var tokenAddress: String?): JBtcTransactionSignParams() {
    constructor():this(gasLimit = BigInteger.valueOf(0),
            gasPrice = BigInteger.valueOf(0),
            tokenValue = BigInteger.valueOf(0),
            tokenAddress = null)
}