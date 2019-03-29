package core.eos

/**
 * Created by Administrator on 2018/10/30.
 */
class JDeleteAuthAction(var permissionLevel: JPermissionLevel?) : JAction() {
    constructor(): this(null)
    override fun actionName(): String {
        return "deleteauth"
    }
}