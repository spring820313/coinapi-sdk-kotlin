package core

/**
 * Created by Administrator on 2018/10/30.
 */
class JBtsTransactionSignParams(var btSeed: JBtSeed?,
                                var password: String?,
                                var priKey: String?,
                                var chainId: String?,
                                var refBlockNum: Int,
                                var refBlockPrefix: Int,
                                var expiration: Int,
                                var ops: List<JBaseOperation>?): JTransactionSignParams() {
    constructor(): this(null, null, null, null, 0, 0, 0, null)
}