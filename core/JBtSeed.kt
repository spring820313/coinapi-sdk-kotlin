package core

/**
 * Created by Administrator on 2018/10/25.
 */
data class JBtSeed(var seed: ByteArray?,
                   var mnemonicCode: List<String>?,
                   var encryptedMnemonicCode: JEncryptedData?,
                   var encryptedSeed: JEncryptedData?,
                   var creationTimeSeconds: Long,
                   var pwdhash: String?,
                   var randomSalt: ByteArray?) {
    constructor(): this(null, null, null, null, 0, null, null)
}