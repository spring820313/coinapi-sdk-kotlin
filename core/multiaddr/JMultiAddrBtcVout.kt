package core.multiaddr

import core.JBtcVout
import java.math.BigInteger

/**
 * Created by Administrator on 2018/10/30.
 */
class JMultiAddrBtcVout(var priKey: String?,
                        var address: String?) : JBtcVout(){
    constructor():this(null, null)
}