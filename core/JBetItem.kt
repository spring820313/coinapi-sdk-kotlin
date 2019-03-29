package core

import java.math.BigInteger

/**
 * Created by Administrator on 2018/10/30.
 */
data class JBetItem(var playType: Byte,
               var betType: Byte,
               var money: BigInteger) {
    constructor():this(-1, -1, BigInteger.valueOf(0))
}