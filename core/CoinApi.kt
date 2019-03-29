package core

import java.math.BigInteger
import core.eos.JTransferAction
import core.eos.JDelegateBwAction
import core.eos.JBuyRamAction
import core.eos.JBuyRamBytesAction
import core.eos.JNewAccountAction
import core.eos.JUndelegateBwAction
import core.eos.JSellRamAction
import core.eos.JRefundAction
import core.eos.JUpdateAuthAction
import core.eos.JDeleteAuthAction
import core.multiaddr.JMultiAddrBtcTransactionSignParams


/**
 * Created by Administrator on 2018/10/25.
 */
class CoinApi {
    /*
    库初始化
    */
    external fun init() : Boolean;

    /*
    库销毁
     */
    external fun cleanup();

    /*
    获取助记词列表
   */
    external fun createAllCoinMnemonicCode(): List<String>?

    /*
   检查助记词列表
   */
    external fun checkMnemonicCode(words: List<String>?): Boolean

    /*
    一次创建一个地址
    */
    external fun createWallet(words: String, password: String, jnetParams: JNetParams): JBtWallet?

    /*
    一次创建多种币种钱包
    */
    external fun createWallets(words: String, password: String, jnetParamsList: List<JNetParams>): List<JBtWallet>

    /*
    根据 加密种子获取 解密后的私钥
    */
    external fun getPriKeyFromBtSeed(jbtSeed: JBtSeed, password: String, jnetParams: JNetParams): String

    /*
    根据 加密种子获取 解密后的助记词
    */
    external fun getMnemonicCodeFromBtSeed(jbtSeed: JBtSeed, password: String, jnetParams: JNetParams): List<String>

    /*
    验证地址有效性
    */
    external fun validateAddress(address: String, jnetParams: JNetParams): Boolean

    /*
    修改密码
    */
    external fun changePassword(joldBtSeed: JBtSeed, password: String, newPassword: String, jnetParams: JNetParams): JBtSeed

    /*
    创建签名交易
    */
    external fun createSignTransaction(signParams: JTransactionSignParams, jnetParams: JNetParams): Map<*, *>

    /*
    生成Transfer二进制
     */
    external fun getTokenTransferBinary(destAddress: String, value: BigInteger): ByteArray

    /*
    lbtc注册
    */
    external fun getLbtcRegister(address: String, prikey: String, name: String, jnetparams: JNetParams): ByteArray

    /*
     lbtc投票
     */
    external fun getLbtcVote(address: String, prikey: String, voteAddressList: List<String>, netparams: JNetParams): ByteArray

    /*
     lbtc取消投票
     */
    external fun getLbtcCancelVote(address: String, prikey: String, voteAddressList: List<String>, netparams: JNetParams): ByteArray

    /*
    wicc 超级币转账合约
     */
    external fun getSpcContractData(address: String, spc: BigInteger): ByteArray

    /*
    wicc 投注合约
     */
    external fun getBetContractData(lid: String, address: String, ltype: Byte, betList: List<JBetItem>): ByteArray

    /*
    eth私钥签名
    */
    external fun ethSign(eth_priv: String, wicc_address: String): Map<*, *>

    /*
     根据 加密种子获取 解密后的主私钥和主公钥
     */
    external fun getHdKeyFromBtSeed(jbtSeed: JBtSeed, jpassword: String, jnetParams: JNetParams): Map<*, *>

    /*
     根据 主公钥和path，获取地址
     */
    external fun getAddressFromMasterPubKey(masterPubkey: String, netParams: JNetParams): String

    /*
     根据主私钥和path，获取私钥
     */
    external fun getPriKeyFromMasterPriKey(masterPrikey: String, netParams: JNetParams): String

    /*
    根据私钥获取地址
    */
    external fun getAddressFromPriKey(priKey: String, netParams: JNetParams): String

    /*
    根据私钥获取公钥
     */
    external fun getPubKeyFromPriKey(priKey: String, netParams: JNetParams): String

    /*
    多签：获取地址
     */
    external fun multiGetAddress(m: Int, pubkeys: List<String>, jnetParams: JNetParams): String

    /*
    多签：获取原始未签名交易
     */
    external fun multiGetUnsignedTransaction(signParams: JTransactionSignParams, m: Int, pubkeys: List<String>, jnetParams: JNetParams): Map<*, *>

    /*
    多签：用私钥签名原始交易
     */
    external fun multiSign(hex: String, m: Int, pubkeys: List<String>, prikey: String, jnetParams: JNetParams): Map<*, *>

    /*
    多签：获取签名交易
     */
    external fun multiGetSignedTransaction(hex: String, m: Int, pubkeys: List<String>, signs: Map<Int, List<String>>, jnetParams: JNetParams): String

    /*
    多签：获取签名交易
    */
    external fun multiGetSignedTransactionEx(hex: String, m: Int, pubkeys: List<String>, signs: Map<Int, List<String>>, jnetParams: JNetParams): Map<*, *>

    /*
    EOS：转代币
     */
    external fun eosTransfer(signParams: JTransactionSignParams, jnetParams: JNetParams, transfer: JTransferAction): String

    /*
    EOS：买RAM
     */
    external fun eosBuyRam(signParams: JTransactionSignParams, jnetParams: JNetParams, buyRamAction: JBuyRamAction): String

    /*
    EOS：买RAM（字节）
     */
    external fun eosBuyRamBytes(signParams: JTransactionSignParams, jnetParams: JNetParams, buyRamBytesAction: JBuyRamBytesAction): String

    /*
    EOS：抵押
     */
    external fun eosDelegateBw(signParams: JTransactionSignParams, jnetParams: JNetParams, delegateBwAction: JDelegateBwAction): String

    /*
    EOS：撤销抵押
     */
    external fun eosUndelegateBw(signParams: JTransactionSignParams, jnetParams: JNetParams, undelegateBwAction: JUndelegateBwAction): String

    /*
    EOS：卖RAM
     */
    external fun eosSellRam(signParams: JTransactionSignParams, jnetParams: JNetParams, sellRamAction: JSellRamAction): String

    /*
    EOS：赎回
     */
    external fun eosRefund(signParams: JTransactionSignParams, jnetParams: JNetParams, refundAction: JRefundAction): String

    /*
    EOS：新建账户
     */
    external fun eosNewAccount(signParams: JTransactionSignParams, jnetParams: JNetParams, newAccountAction: JNewAccountAction, buyRamBytesAction: JBuyRamBytesAction, delegateBwAction: JDelegateBwAction): String

    /*
    EOS：修改权限
     */
    external fun eosUpdateAuth(signParams: JTransactionSignParams, jnetParams: JNetParams, updateAuthAction: JUpdateAuthAction): String

    /*
    EOS：删除权限
     */
    external fun eosDeleteAuth(signParams: JTransactionSignParams, jnetParams: JNetParams, deleteAuthAction: JDeleteAuthAction): String

    /*
    BTS：估算Memo大小
     */
    external fun estimateMemoSize(memoData: JMemoData, addressPrefix: String): Int

    /*
    生成Usdt script数据
    */
    external fun getUsdtContract(propertyId: Long, amount: Long): ByteArray

    /*
    消息签名
    */
    external fun signMessage(jpriKey: String, message: ByteArray, jnetParams: JNetParams): Map<*, *>

    /*
    验证签名
     */
    external fun verifySign(jpubKey: String, jhash: String, jsignature: String, jnetParams: JNetParams): Boolean

    /*
    创建多地址签名交易
    */
    external fun createMultiAddrSignTransaction(multiAddrSignParams: JMultiAddrBtcTransactionSignParams, jnetParams: JNetParams): Map<*, *>

    /*
    根据公钥，获取地址
    */
    external fun getAddressFromPubKey(pubkey: String, netParams: JNetParams): String

    /*
    一次获取多种币种主公钥，主私钥
    */
    external fun getMultiHdKeyFromBtSeed(jbtSeed: JBtSeed, jpassword: String, jnetParamsList: List<JNetParams>): List<JHdKeys>

    /*
    EOS：验证私钥有效性
    */
    external fun validateWif(jpriKey: String, jnetParams: JNetParams): Boolean

    /*
    验证密码
    */
    external fun verifyPassword(jbtSeed: JBtSeed, password: String): Boolean

    /*
    lbtc注册V2
    */
    external fun getLbtcRegisterV2(name: ByteArray): ByteArray

    /*
     lbtc投票V2
     */
    external fun getLbtcVoteV2(voteAddressList: List<String>): ByteArray

    /*
     lbtc取消投票V2
     */
    external fun getLbtcCancelVoteV2(voteAddressList: List<String>): ByteArray

    var commCoinRef: Long = 0
}