package core

/**
 * Created by Administrator on 2018/10/30.
 */
open class JBaseOperation(var operType: Int) {
    constructor():this(NULL_OPERATION)
    companion object {
        val NULL_OPERATION: Int = -1
        val TRANSFER_OPERATION: Int  = 0
    }
}