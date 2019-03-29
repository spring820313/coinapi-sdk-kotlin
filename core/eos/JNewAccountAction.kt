package core.eos

/**
 * Created by Administrator on 2018/10/30.
 */
class JNewAccountAction(var creator: String?,
                        var accountName: String?,
                        var owner: JAuthority?,
                        var active: JAuthority?) : JAction() {
    constructor(): this(null, null, null, null)
    override fun actionName(): String {
        return "newaccount"
    }
}