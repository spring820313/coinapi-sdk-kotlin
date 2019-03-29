package core

import java.math.BigInteger

/**
 * Created by Administrator on 2018/10/30.
 */
data class JAssetAmount(var assetId: String?,
                        var value: BigInteger) {
    constructor():this(null, BigInteger.valueOf(0))
}