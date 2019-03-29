package core

/**
 * Created by Administrator on 2018/10/25.
 */
data class JNetParams(var symbol: String?,
                      var coinType: Int = -1,
                      var nettype: Int = -1,
                      var keyPath: JKeyPath?,
                      var version: Int = 2,
                      var HDprivate: Int,
                      var HDpublic: Int,
                      var P2KH: Int,
                      var P2SH: Int,
                      var keyprefixes: Int,
                      var ApiVersion: Int = 1,
                      var N: Int = 32768,
                      var R: Int = 8,
                      var P: Int = 1)