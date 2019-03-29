package core.eos

/**
 * Created by Administrator on 2018/10/30.
 */
data class JAuthority (var threshold: Int,
                       var keys: List<JKeyPermissionWeight>?)