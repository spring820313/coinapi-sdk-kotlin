package core

/**
 * Created by Administrator on 2018/10/25.
 */
data class JEncryptedData(var initialisationVector: ByteArray?,
                          var encryptedBytes: ByteArray?) {
    constructor():this(null, null)
}