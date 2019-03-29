package core.eos

/**
 * Created by Administrator on 2018/10/30.
 */
class JUpdateAuthAction(var permissionLevel: JPermissionLevel?,
                        var parent: String?,
                        var authority: JAuthority?) : JAction() {
    constructor():this(null, null, null)
    override fun actionName(): String {
        return "updateauth"
    }
}