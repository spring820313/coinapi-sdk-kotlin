package core.eos

/**
 * Created by Administrator on 2018/10/30.
 */
class JUndelegateBwAction(var from: String?,
                          var to: String?,
                          var stakeNetQuantity: JEosAsset?,
                          var stakeCpuQuantity: JEosAsset?) : JAction() {
    constructor(): this(null, null, null, null)
    override fun actionName(): String {
        return "undelegatebw"
    }
}