package core.eos

/**
 * Created by Administrator on 2018/10/30.
 */
class JRefundAction(var owner: String?) : JAction() {
    constructor(): this(null)
    override fun actionName(): String {
        return "refund"
    }
}