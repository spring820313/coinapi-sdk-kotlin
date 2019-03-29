package core

/**
 * Created by Administrator on 2018/10/26.
 */
class JEosTransactionSignParams(var btSeed: JBtSeed?,
                                var priKey: String?,
                                var password: String?,
                                var chainId: String?,
                                var headBlockId: String?,
                                var expiration: Int) : JTransactionSignParams() {
    constructor():this(null, null, null, null, null, 0)
}