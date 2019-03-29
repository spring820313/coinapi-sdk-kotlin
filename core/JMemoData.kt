package core

/**
 * Created by Administrator on 2018/10/30.
 */
data class JMemoData(var priKey: String?,
                     var toMemoPubkey: String?,
                     var memo: String?) {
    constructor():this(null, null, null)
}