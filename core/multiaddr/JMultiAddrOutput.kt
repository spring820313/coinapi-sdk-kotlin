package core.multiaddr

import java.math.BigInteger

/**
 * Created by Administrator on 2018/10/30.
 */
class JMultiAddrOutput(var address: String?,
                       var value: BigInteger) {
    constructor(): this(null, BigInteger.valueOf(0))
}