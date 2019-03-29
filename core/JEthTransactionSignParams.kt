package core

import java.math.BigInteger

/**
 * Created by Administrator on 2018/10/30.
 */
class JEthTransactionSignParams(var btSeed: JBtSeed?,
                                var password: String?,
                                var from: String?,
                                var to: String?,
                                var gasLimit: BigInteger,
                                var gasPrice: BigInteger,
                                var value: BigInteger,
                                var data: ByteArray?,
                                var nonce: BigInteger,
                                var priKey: String?): JTransactionSignParams() {
    constructor():this(null, null, null, null, BigInteger.valueOf(0), BigInteger.valueOf(0), BigInteger.valueOf(0), null, BigInteger.valueOf(0), null)
}