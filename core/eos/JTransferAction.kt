package core.eos

/**
 * Created by Administrator on 2018/10/26.
 */
class JTransferAction(var contract: String?,
                      var from: String?,
                      var to: String?,
                      var amount: JEosAsset?,
                      var memo: ByteArray?) : JAction() {
    constructor():this(null, null, null, null, null)
    override fun actionName(): String {
        return "transfer"
    }
}