package core.eos

/**
 * Created by Administrator on 2018/10/30.
 */
class JSellRamAction(var from: String?,
                     var bytes: Long) : JAction(){
    constructor(): this(null, 0)
    override fun actionName(): String {
        return "sellram"
    }
}