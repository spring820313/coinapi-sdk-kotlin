package core.eos

/**
 * Created by Administrator on 2018/10/30.
 */
class JBuyRamBytesAction(var from: String?,
                         var to: String?,
                         var bytes: Int) : JAction(){
    constructor(): this(null, null, 0)
    override fun actionName(): String {
        return "buyrambytes"
    }
}