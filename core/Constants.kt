package core

/**
 * Created by Administrator on 2018/10/26.
 */
enum class CoinType constructor(var value: Int) {
    BTC(1),
    ETH(2),
    WICC(3),
    BTS(4),
    AFT(5),
    LTC(6),
    SBTC(7),
    DOGE(8),
    ETC(9),
    WBTC(10),
    ZEC(11),
    DSH(12),
    BCH(13),
    QTUM(14),
    LBTC(15),
    NEO(16),
    GAS(17),
    XZC(18),
    USDT(19),
    BCO(20),
    BHD(21),
    EOS(22)
}

enum class CoinSymbol constructor(var value: String) {
    BTC("BTC"),
    ETH("ETH"),
    WICC("WICC"),
    BTS("BTS"),
    AFT("AFT"),
    LTC("LTC"),
    SBTC("SBTC"),
    DOGE("DOGE"),
    ETC("ETC"),
    WBTC("WBTC"),
    ZEC("ZEC"),
    DSH("DSH"),
    BCH("BCH"),
    QTUM("QTUM"),
    LBTC("LBTC"),
    NEO("NEO"),
    GAS("GAS"),
    XZC("XZC"),
    USDT("USDT"),
    BCO("BCO"),
    BHD("BHD"),
    EOS("EOS")
}

enum class NetworkType constructor(var value: Int) {
    MAIN(1),
    TEST(2),
    REGTEST(3)
}

enum class TxType constructor(var value: Int) {
    NONE(0),
    LBTC_REGISTER(1),
    LBTC_VOTE(2),
    LBTC_CANCELVOTE(3),
    QTUM_TOKEN_TRANSFER(4),
    WICC_REGISTERACCOUNT(5),
    WICC_COMMON(6),
    WICC_TRANSFER_SPC(7),
    WICC_BET(8)
}