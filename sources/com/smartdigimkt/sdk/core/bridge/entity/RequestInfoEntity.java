package com.smartdigimkt.sdk.core.bridge.entity;

import com.smartdigimkt.v6.a;

/* JADX INFO: loaded from: classes6.dex */
public class RequestInfoEntity extends BaseInfoEntity {

    @DataField("adsource_id")
    public String adsourceId;

    @DataField("bid_id")
    public String bidId;

    @DataField("bid_result_out_date_time")
    public long bidResultOutDateTime;

    @DataField("channel_from")
    public int channelFrom;

    @DataField("format")
    public int format;

    @DataField("group_id")
    public int groupId;

    @DataField("max_exclude_id_size")
    public int maxExcludeIdSize;

    @DataField("max_install_id_size")
    public int maxInstallIdSize;

    @DataField("mtg_mix_format")
    public int mtgMixFormat = -1;

    @DataField("network_firm_id")
    public int networkFirmId;

    @DataField("network_name")
    public String networkName;

    @DataField("origin_request_id")
    public String originRequestId;

    @DataField("placement_id")
    public String placementId;

    @DataField("request_id")
    public String requestId;

    @DataField("request_url")
    public String requestUrl;

    @DataField("tp_bid_id")
    public String tpBidId;

    @DataField("traffic_group_id")
    public int trafficGroupId;

    @DataField("unit_group_content")
    public String unitGroupContent;

    @DataField("x_c")
    public String x_c;

    public a convertToBaseAdRequestInfo() {
        a aVar = new a();
        aVar.f39163a = this.placementId;
        aVar.f39164b = this.format;
        aVar.f39165c = this.trafficGroupId;
        aVar.d = this.groupId;
        aVar.f39166e = this.adsourceId;
        aVar.f = this.requestId;
        aVar.g = this.originRequestId;
        aVar.f39167h = this.x_c;
        aVar.f39168i = this.bidId;
        aVar.j = this.networkFirmId;
        aVar.k = this.networkName;
        aVar.f39169l = this.tpBidId;
        aVar.m = this.channelFrom;
        aVar.f39170n = this.mtgMixFormat;
        aVar.o = this.unitGroupContent;
        aVar.f39171p = this.bidResultOutDateTime;
        aVar.q = this.requestUrl;
        aVar.r = this.maxInstallIdSize;
        aVar.s = this.maxExcludeIdSize;
        return aVar;
    }
}
