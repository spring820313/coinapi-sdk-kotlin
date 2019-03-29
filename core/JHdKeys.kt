package core

/**
 * Created by Administrator on 2018/10/30.
 */
data class JHdKeys(var symbol: String?,
                   var coinType: Int,
                   var hdMasterPriKey: String?,
                   var hdMasterPubKey: String?) {
    constructor():this(null, -1, null, null)
}