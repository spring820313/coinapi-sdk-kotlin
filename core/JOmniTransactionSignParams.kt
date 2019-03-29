package core

/**
 * Created by Administrator on 2018/10/30.
 */
class JOmniTransactionSignParams(var height: Int,
                                 var minRelayTxFee: Long): JBtcTransactionSignParams() {
    constructor():this(0, 0)
}