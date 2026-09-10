package com.smartdigimkt.sdk.core.bridge.entity;

import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.p004ironsource.m5;
import com.smartdigimkt.y6.b;

/* JADX INFO: loaded from: classes6.dex */
public class BiddingResultInfoEntity extends BaseInfoEntity {

    @DataField("ad_source_id")
    public String adSourceId;

    @DataField("adx_mtg_mix_type")
    public int adxMTGMixType;

    @DataField("a_r")
    public double adxRecoverRate;

    @DataField("cny_ecpm_api")
    public double cnyEcpmApi;

    @DataField(BidResponsed.KEY_CUR)
    public String curreny;

    @DataField("cur_rate")
    public double currenyRate;

    @DataField(m5.y)
    public String displayNoticeUrl;

    @DataField("burl_win")
    public String displayWinNoticeUrl;

    @DataField("ecpm_api")
    public double ecpmApi;

    @DataField("e_c")
    public String ecpmEncInfo;

    @DataField("e_c_id")
    public int ecpmEncPvtKeyServerId;

    @DataField("err_code")
    public int errorCode;

    @DataField("err_msg")
    public String errorMsg;

    @DataField("expire")
    public long expireTime;

    @DataField("is_send_winurl")
    public boolean hasSendWinOrLossUrl;

    @DataField("is_success")
    public boolean isSuccess;

    @DataField(m5.f25678z)
    public String loseNoticeUrl;

    @DataField("nw_firm_id")
    public int networkFirmId;

    @DataField("unit_id")
    public String networkUnitId;

    @DataField("offer_data")
    public String offerData;

    @DataField("origin_price")
    public double originPrice;

    @DataField("origin_request_id")
    public String originRequestId;

    @DataField("out_data_time")
    public long outDateTime;

    @DataField("deal_id")
    public String pmpOrderId;

    @DataField("deal_pri")
    public int pmpPriority;

    @DataField("deal_type_int")
    public int pmpType;

    @DataField("deal_type")
    public String pmpTypeString;

    @DataField("precision")
    public String precision;

    @DataField("price")
    public Double price;

    @DataField("request_id")
    public String requestId;

    @DataField("req_url")
    public String requestUrl;

    @DataField("cny_e_c")
    public String rmbEcpmEncInfo;

    @DataField("cny_price")
    public double rmbPrice;

    @DataField("s_pty")
    public double sortPrice;

    @DataField("bid_id")
    public String token;

    @DataField("tp_bid_id")
    public String tpBidId;

    @DataField("bd_type")
    public int useType;

    @DataField(m5.f25674A)
    public String winNoticeUrl;

    @DataField("x_c")
    public String x_c;

    public b converToBiddingResult() {
        b bVar = new b(this.isSuccess, this.sortPrice, this.price.doubleValue(), this.tpBidId, this.winNoticeUrl, this.loseNoticeUrl, this.displayNoticeUrl, this.errorMsg);
        bVar.f40233e = this.token;
        bVar.g = this.winNoticeUrl;
        bVar.f40234h = this.loseNoticeUrl;
        bVar.f = this.errorMsg;
        bVar.q = this.curreny;
        bVar.r = this.networkUnitId;
        bVar.s = this.networkFirmId;
        bVar.f40250p = this.errorCode;
        bVar.t = this.expireTime;
        bVar.f40251u = this.outDateTime;
        bVar.f40239B = this.offerData;
        bVar.v = this.tpBidId;
        bVar.C = this.displayWinNoticeUrl;
        bVar.D = this.adSourceId;
        bVar.f40240E = this.currenyRate;
        bVar.f40241F = this.ecpmApi;
        bVar.G = this.cnyEcpmApi;
        bVar.H = this.precision;
        bVar.f40252w = this.requestUrl;
        bVar.k = this.useType;
        bVar.f40231b = this.originPrice;
        bVar.f40237n = this.rmbPrice;
        bVar.f40243J = this.adxRecoverRate;
        bVar.d(this.requestId);
        bVar.f40245P = this.adxMTGMixType;
        bVar.f40246Q = this.pmpTypeString;
        bVar.f40247R = this.pmpType;
        bVar.S = this.pmpOrderId;
        bVar.T = this.pmpPriority;
        bVar.a(this.originRequestId);
        bVar.f40248U = this.x_c;
        bVar.L = this.ecpmEncInfo;
        bVar.O = this.rmbEcpmEncInfo;
        bVar.M = this.ecpmEncPvtKeyServerId;
        return bVar;
    }
}
