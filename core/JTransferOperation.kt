package core

/**
 * Created by Administrator on 2018/10/30.
 */
class JTransferOperation(var from: String?,
                         var to: String?,
                         var amount: JAssetAmount?,
                         var fee: JAssetAmount?,
                         var memoData: JAssetAmount?): JBaseOperation(operType = TRANSFER_OPERATION) {
    constructor():this(null, null, null, null, null)
}