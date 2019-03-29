package core.eos

/**
 * Created by Administrator on 2018/10/30.
 */
class JBuyRamAction(var from: String?,
                    var to: String?,
                    var amount: JEosAsset?): JAction() {
    constructor():this(null, null, null)
    override fun actionName(): String {
        return "buyram"
    }
}