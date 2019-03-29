package core.eos

/**
 * Created by Administrator on 2018/10/30.
 */
class JDelegateBwAction(var from: String?,
                        var to: String?,
                        var stakeNetQuantity: JEosAsset?,
                        var stakeCpuQuantity: JEosAsset?,
                        var transfer: Boolean = false) : JAction(){
    constructor():this(null, null, null, null)
    override fun actionName(): String {
        return "delegatebw"
    }
}