package core

/**
 * Created by Administrator on 2018/10/25.
 */
data class JBtWallet(var btSeed: JBtSeed?,
                     var pubkey: String?,
                     var address: String?,
                     var symbol: String?
                    ) {
    constructor():this(null, null, null, null)
}