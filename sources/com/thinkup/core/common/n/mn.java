package com.thinkup.core.common.n;

import android.text.TextUtils;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUAdInfo;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUCustomContentResult;
import com.thinkup.core.api.TURewardInfo;
import com.thinkup.core.api.TUSDKUtils;
import com.thinkup.core.basead.adx.api.ITUAdxHandler;
import com.thinkup.core.common.on.omo;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class mn extends TUAdInfo {
    private String m0;
    private Map<String, Object> m0m;
    private int mo;
    private double moo;
    private Double no;
    private TUBaseAdAdapter o;
    private double om;
    private String on;
    private Map<String, Object> ono;
    private int m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f41889n = "";
    private int o0 = -1;
    private double oo = 0.0d;
    private int mm = 0;
    private String mn = "";
    private Double n0 = Double.valueOf(0.0d);
    private String nm = "";
    private String nn = "";
    private String o00 = "";
    private String o0o = "";
    private String o0m = "unknow";
    private String o0n = AndroidInitializeBoldSDK.MSG_NETWORK;
    private String oo0 = "";
    private int ooo = 1;
    private int oom = 0;
    private String oon = "";
    private String om0 = "";
    private int omo = 0;
    private String omm = "";
    private String omn = "";
    private Map<String, Object> on0 = null;
    private String onm = "";
    private int onn = 0;
    private String m00 = "";
    private int m0o = 0;
    private int m0n = 1;
    private String mo0 = "";
    private ITUAdxHandler mom = null;
    private int mon = -1;
    private String mm0 = "";
    private String mmm = "";
    private String mmn = "";
    private Map<String, String> mmo = new HashMap();
    private String mn0 = "";
    private TUCustomContentResult mnm = null;
    private int mno = 0;

    /* JADX INFO: renamed from: com.thinkup.core.common.n.mn$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] o;

        static {
            int[] iArr = new int[TUAdConst.CURRENCY.values().length];
            o = iArr;
            try {
                iArr[TUAdConst.CURRENCY.RMB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                o[TUAdConst.CURRENCY.RMB_CENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                o[TUAdConst.CURRENCY.USD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0042  */
    /* JADX WARN: Code duplicated, block: B:32:0x0046  */
    private static void m(mn mnVar, com.thinkup.core.common.on.n0 n0Var, int i2) {
        mnVar.oo = n0Var.o00();
        mnVar.om = n0Var.o0o();
        if (n0Var.mo0() != 1) {
            return;
        }
        omo omoVarO0oo = n0Var.o0oo();
        Objects.toString(omoVarO0oo);
        if (omoVarO0oo != null) {
            if (i2 == 0) {
                if (omoVarO0oo.m0 == 3) {
                    n0Var.mon();
                    mnVar.oo = 0.0d;
                    mnVar.om = 0.0d;
                }
            } else if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                if (omoVarO0oo.m0 == 3) {
                                    n0Var.mon();
                                    mnVar.oo = 0.0d;
                                    mnVar.om = 0.0d;
                                }
                            }
                        } else if (omoVarO0oo.on == 3) {
                            n0Var.mon();
                            mnVar.oo = 0.0d;
                            mnVar.om = 0.0d;
                        }
                    } else if (omoVarO0oo.om == 3) {
                        n0Var.mon();
                        mnVar.oo = 0.0d;
                        mnVar.om = 0.0d;
                    }
                } else if (omoVarO0oo.oo == 3) {
                    n0Var.mon();
                    mnVar.oo = 0.0d;
                    mnVar.om = 0.0d;
                }
            } else if (omoVarO0oo.o0 == 3) {
                n0Var.mon();
                mnVar.oo = 0.0d;
                mnVar.om = 0.0d;
            }
        }
        n0Var.mon();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    private static mn o(mn mnVar, com.thinkup.core.common.on.n0 n0Var, int i2) {
        String str;
        TURewardInfo tURewardInfoM00;
        TURewardInfo tURewardInfo;
        byte b2 = 2;
        mnVar.m = n0Var.n0n();
        mnVar.f41889n = n0Var.mon();
        mnVar.o0 = n0Var.mmm();
        mnVar.mm = n0Var.mo0();
        mnVar.oo = n0Var.o00();
        mnVar.om = n0Var.o0o();
        if (n0Var.mo0() == 1) {
            omo omoVarO0oo = n0Var.o0oo();
            Objects.toString(omoVarO0oo);
            if (omoVarO0oo != null) {
                if (i2 == 0) {
                    if (omoVarO0oo.m0 == 3) {
                        n0Var.mon();
                        mnVar.oo = 0.0d;
                        mnVar.om = 0.0d;
                    }
                } else if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                if (i2 == 5) {
                                    if (omoVarO0oo.m0 == 3) {
                                        n0Var.mon();
                                        mnVar.oo = 0.0d;
                                        mnVar.om = 0.0d;
                                    }
                                }
                            } else if (omoVarO0oo.on == 3) {
                                n0Var.mon();
                                mnVar.oo = 0.0d;
                                mnVar.om = 0.0d;
                            }
                        } else if (omoVarO0oo.om == 3) {
                            n0Var.mon();
                            mnVar.oo = 0.0d;
                            mnVar.om = 0.0d;
                        }
                    } else if (omoVarO0oo.oo == 3) {
                        n0Var.mon();
                        mnVar.oo = 0.0d;
                        mnVar.om = 0.0d;
                    }
                } else if (omoVarO0oo.o0 == 3) {
                    n0Var.mon();
                    mnVar.oo = 0.0d;
                    mnVar.om = 0.0d;
                }
            }
            n0Var.mon();
        }
        mnVar.on = n0Var.o0m();
        mnVar.m0 = n0Var.o0n();
        mnVar.mo = n0Var.oo0();
        mnVar.moo = n0Var.oo();
        mnVar.nm = n0Var.oom();
        mnVar.mn = n0Var.omm();
        mnVar.n0 = Double.valueOf(mnVar.oo / 1000.0d);
        mnVar.no = Double.valueOf(mnVar.om / 1000.0d);
        mnVar.nn = n0Var.ono();
        mnVar.o0o = com.thinkup.core.common.ooo.nn.om(n0Var.oono());
        String strOomn = n0Var.oomn();
        String strOn = n0Var.on();
        if (TextUtils.isEmpty(strOn) || TextUtils.equals(strOomn, strOn)) {
            str = "";
        } else {
            str = strOomn;
            strOomn = strOn;
        }
        mnVar.o00 = strOomn;
        mnVar.mo0 = str;
        mnVar.o0m = n0Var.on0();
        if (n0Var.n0n() == 35) {
            mnVar.o0n = "Cross_Promotion";
        } else if (n0Var.n0n() == 66) {
            String strO0mn = n0Var.o0mn();
            strO0mn.getClass();
            switch (strO0mn.hashCode()) {
                case 2545:
                    b2 = !strO0mn.equals("PA") ? (byte) -1 : (byte) 0;
                    break;
                case 2548:
                    b2 = !strO0mn.equals("PD") ? (byte) -1 : (byte) 1;
                    break;
                case 79054:
                    if (!strO0mn.equals("PDB")) {
                        b2 = -1;
                    }
                    break;
                default:
                    b2 = -1;
                    break;
            }
            switch (b2) {
                case 0:
                    mnVar.o0n = "Adx_pa";
                    break;
                case 1:
                    mnVar.o0n = "Adx_pd";
                    break;
                case 2:
                    mnVar.o0n = "Adx_pdb";
                    break;
                default:
                    mnVar.o0n = "Adx";
                    break;
            }
        } else {
            mnVar.o0n = AndroidInitializeBoldSDK.MSG_NETWORK;
        }
        mnVar.oo0 = n0Var.omo();
        mnVar.ooo = n0Var.omn();
        mnVar.oom = n0Var.no0();
        mnVar.oon = n0Var.m0o;
        if (TextUtils.equals("RewardedVideo", mnVar.o0o)) {
            Map<String, TURewardInfo> mapOnn = n0Var.onn();
            if (mapOnn != null && mapOnn.containsKey(mnVar.oon) && (tURewardInfo = mapOnn.get(mnVar.oon)) != null) {
                mnVar.om0 = tURewardInfo.rewardName;
                mnVar.omo = tURewardInfo.rewardNumber;
            }
            if ((TextUtils.isEmpty(mnVar.om0) || mnVar.omo == 0) && (tURewardInfoM00 = n0Var.m00()) != null) {
                mnVar.om0 = tURewardInfoM00.rewardName;
                mnVar.omo = tURewardInfoM00.rewardNumber;
            }
        }
        mnVar.omn = o0n.m().nm();
        mnVar.omm = o0n.m().nn();
        mnVar.on0 = n0Var.m0o();
        mnVar.onm = n0Var.nn();
        mnVar.onn = n0Var.nmo();
        mnVar.m00 = n0Var.ooo0();
        mnVar.m0o = n0Var.oomo();
        Map<String, Object> mapMm = n0Var.mm();
        if (mapMm != null) {
            mnVar.m0m = new HashMap(mapMm);
        }
        mnVar.m0n = n0Var.mo();
        Map<String, String> mapO00o = n0Var.o00o();
        if (mapO00o != null) {
            mnVar.mmo = new HashMap(mapO00o);
        }
        mnVar.mmm = n0Var.oom0();
        mnVar.mmn = n0Var.o000();
        mnVar.mn0 = n0Var.oon0();
        mnVar.mnm = n0Var.o0on();
        mnVar.mno = com.thinkup.core.common.ooo.nn.oo(n0Var.mn());
        return mnVar;
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final int getABTestId() {
        return this.m0o;
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final String getAdNetworkType() {
        return this.o0n;
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final int getAdSourceAdType() {
        return this.mon;
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final String getAdSourceCustomExt() {
        return this.mm0;
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final String getAdsourceId() {
        return this.f41889n;
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final int getAdsourceIndex() {
        return this.o0;
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final ITUAdxHandler getAdxHandler() {
        return this.mom;
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final double getBidFloor() {
        return this.moo;
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final int getBidType() {
        return this.mno;
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final String getChannel() {
        return this.omn;
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final String getCountry() {
        return this.nn;
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final String getCurrency() {
        return this.nm;
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final TUCustomContentResult getCustomContentResult() {
        return this.mnm;
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final String getCustomRule() {
        return this.on0 != null ? new JSONObject(this.on0).toString() : "";
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final int getDismissType() {
        return this.onn;
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final double getEcpm() {
        return this.oo;
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final int getEcpmLevel() {
        return this.ooo;
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final String getEcpmPrecision() {
        return this.o0m;
    }

    @Override // com.thinkup.core.api.TUAdInfo
    @Deprecated
    public final double getEcpmWithCurrency(TUAdConst.CURRENCY currency) {
        return com.thinkup.core.common.ooo.o0n.o(this.oo, com.thinkup.core.common.ooo.o0n.o(this.nm), currency);
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final String getEncEcpmInfo() {
        return this.on;
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final Map<String, Object> getExtInfoMap() {
        return this.ono;
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final String getFormat() {
        return this.o0o;
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final Map<String, Object> getLocalExtra() {
        return this.m0m;
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final int getNetworkFirmId() {
        return this.m;
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final String getNetworkName() {
        return this.mmm;
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final String getNetworkPlacementId() {
        return this.oo0;
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final String getPlacementId() {
        return this.o00;
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final int getPlacementType() {
        return this.m0n;
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final Double getPublisherRevenue() {
        return this.n0;
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final String getRequestId() {
        return this.mn0;
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final String getRewardUserCustomData() {
        TUBaseAdAdapter tUBaseAdAdapter = this.o;
        return tUBaseAdAdapter != null ? tUBaseAdAdapter.getUserCustomData() : "";
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final String getRmbEncEcpmInfo() {
        return this.m0;
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final String getScenarioId() {
        return this.oon;
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final String getScenarioRewardName() {
        return this.om0;
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final int getScenarioRewardNumber() {
        return this.omo;
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final int getSecretId() {
        return this.mo;
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final int getSegmentId() {
        return this.oom;
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final String getSharedPlacementId() {
        return this.mo0;
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final String getShowCustomExt() {
        return this.mmn;
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final String getShowId() {
        return this.mn;
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final String getSubChannel() {
        return this.omm;
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final String getTopOnAdFormat() {
        return this.o0o;
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final String getTopOnPlacementId() {
        return this.o00;
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final String getTpBidId() {
        return this.onm;
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final Map<String, String> getUrlTagParams() {
        return this.mmo;
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final String getWaterfallId() {
        return this.m00;
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final int isHeaderBiddingAdsource() {
        return this.mm;
    }

    public final String toString() {
        return o().toString();
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final double getEcpm(TUAdConst.CURRENCY currency) {
        int i2 = AnonymousClass1.o[currency.ordinal()];
        if (i2 == 1) {
            return this.om;
        }
        if (i2 == 2) {
            return this.om * 100.0d;
        }
        if (i2 != 3) {
            return getEcpmWithCurrency(currency);
        }
        String str = this.nm;
        if (str == null || !str.equalsIgnoreCase("CNY")) {
            return this.oo;
        }
        return TUSDKUtils.getRmbChangeToUsdRate() * this.oo;
    }

    @Override // com.thinkup.core.api.TUAdInfo
    public final Double getPublisherRevenue(TUAdConst.CURRENCY currency) {
        int i2 = AnonymousClass1.o[currency.ordinal()];
        if (i2 == 1) {
            return this.no;
        }
        if (i2 == 2) {
            return Double.valueOf(this.no.doubleValue() * 100.0d);
        }
        if (i2 != 3) {
            return getPublisherRevenue();
        }
        String str = this.nm;
        if (str == null || !str.equalsIgnoreCase("CNY")) {
            return this.n0;
        }
        return Double.valueOf(TUSDKUtils.getRmbChangeToUsdRate() * this.n0.doubleValue());
    }

    public final void m(double d) {
        this.om = d;
        this.no = Double.valueOf(d / 1000.0d);
    }

    public static mn o(BaseAd baseAd, TUBaseAdAdapter tUBaseAdAdapter) {
        return o(baseAd, tUBaseAdAdapter, 0);
    }

    public static mn o(BaseAd baseAd, TUBaseAdAdapter tUBaseAdAdapter, int i2) {
        if (baseAd != null) {
            mn mnVarO = o(o(baseAd.getDetail(), i2), tUBaseAdAdapter);
            mnVarO.ono = baseAd.getNetworkInfoMap();
            return mnVarO;
        }
        return new mn();
    }

    private static mn o(mn mnVar, TUBaseAdAdapter tUBaseAdAdapter) {
        if (tUBaseAdAdapter != null) {
            mnVar.o = tUBaseAdAdapter;
            mnVar.ono = tUBaseAdAdapter.getInternalNetworkInfoMap();
            mnVar.mon = mnVar.o.getTrackingInfo().nm0();
            mnVar.mm0 = tUBaseAdAdapter.getAdCustomExt();
            try {
                if (mnVar.o.getTrackingInfo().nno()) {
                    mnVar.mom = mnVar.o.getUnitGroupInfo().n0n().mo();
                    return mnVar;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return mnVar;
    }

    public static mn o(TUBaseAdAdapter tUBaseAdAdapter) {
        return o(tUBaseAdAdapter, 0);
    }

    public static mn o(TUBaseAdAdapter tUBaseAdAdapter, int i2) {
        if (tUBaseAdAdapter != null) {
            return o(o(tUBaseAdAdapter.getTrackingInfo(), i2), tUBaseAdAdapter);
        }
        return new mn();
    }

    public static mn o(com.thinkup.core.common.on.n0 n0Var, TUBaseAdAdapter tUBaseAdAdapter, int i2) {
        return o(o(n0Var, i2), tUBaseAdAdapter);
    }

    public static mn o(com.thinkup.core.common.on.n0 n0Var, TUBaseAdAdapter tUBaseAdAdapter) {
        return o(n0Var, tUBaseAdAdapter, 0);
    }

    private static mn o(com.thinkup.core.common.on.n0 n0Var, int i2) {
        mn mnVar = new mn();
        return n0Var != null ? o(mnVar, n0Var, i2) : mnVar;
    }

    public final JSONObject o() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.mn);
            jSONObject.put("publisher_revenue", this.n0);
            jSONObject.put("publisher_revenue_cny", this.no);
            jSONObject.put("currency", this.nm);
            jSONObject.put("country", this.nn);
            jSONObject.put("adunit_id", this.o00);
            jSONObject.put("adunit_format", this.o0o);
            jSONObject.put("precision", this.o0m);
            jSONObject.put("network_type", this.o0n);
            jSONObject.put("network_placement_id", this.oo0);
            jSONObject.put("ecpm_level", this.ooo);
            jSONObject.put("segment_id", this.oom);
            if (!TextUtils.isEmpty(this.oon)) {
                jSONObject.put("scenario_id", this.oon);
            }
            if (!TextUtils.isEmpty(this.om0) && this.omo != 0) {
                jSONObject.put("scenario_reward_name", this.om0);
                jSONObject.put("scenario_reward_number", this.omo);
            }
            if (!TextUtils.isEmpty(this.omn)) {
                jSONObject.put("channel", this.omn);
            }
            if (!TextUtils.isEmpty(this.omm)) {
                jSONObject.put("sub_channel", this.omm);
            }
            Map<String, Object> map = this.on0;
            if (map != null && map.size() > 0) {
                jSONObject.put("custom_rule", new JSONObject(this.on0));
            }
            jSONObject.put("network_firm_id", this.m);
            jSONObject.put("adsource_id", this.f41889n);
            jSONObject.put("adsource_index", this.o0);
            jSONObject.put("adsource_price", this.oo);
            jSONObject.put("adsource_price_cny", this.om);
            jSONObject.put("adsource_isheaderbidding", this.mm);
            Map<String, Object> map2 = this.ono;
            if (map2 != null && map2.size() > 0) {
                jSONObject.put("ext_info", new JSONObject(this.ono));
            }
            TUBaseAdAdapter tUBaseAdAdapter = this.o;
            if (tUBaseAdAdapter != null) {
                jSONObject.put("reward_custom_data", tUBaseAdAdapter.getUserCustomData());
            }
            if (!TextUtils.isEmpty(this.onm)) {
                jSONObject.put("tp_bid_id", this.onm);
            }
            int i2 = this.onn;
            if (i2 != 0) {
                jSONObject.put("dismiss_type", i2);
            }
            if (!TextUtils.isEmpty(this.m00)) {
                jSONObject.put(com.thinkup.core.oo.n0.o.mnm, this.m00);
            }
            jSONObject.put("abtest_id", this.m0o);
            Map<String, Object> map3 = this.m0m;
            if (map3 != null && map3.size() > 0) {
                jSONObject.put("user_load_extra_data", new JSONObject(this.m0m));
            }
            jSONObject.put("placement_type", this.m0n);
            if (!TextUtils.isEmpty(this.mo0)) {
                jSONObject.put("shared_placement_id", this.mo0);
            }
            jSONObject.put("bid_floor", this.moo);
            jSONObject.put("ad_source_type", this.mon);
            jSONObject.put("ad_source_custom_ext", this.mm0);
            jSONObject.put("url_tag_params", this.mmo);
            jSONObject.put("network_name", this.mmm);
            jSONObject.put("show_custom_ext", this.mmn);
            if (!TextUtils.isEmpty(this.on)) {
                jSONObject.put("e_c", this.on);
            }
            if (!TextUtils.isEmpty(this.m0)) {
                jSONObject.put("e_c_cny", this.m0);
            }
            jSONObject.put("s_id", this.mo);
            jSONObject.put("req_id", this.mn0);
            jSONObject.put("bid_type", this.mno);
            return jSONObject;
        } catch (Throwable th) {
            th.printStackTrace();
            return jSONObject;
        }
    }

    public final void o(double d) {
        this.oo = d;
        this.n0 = Double.valueOf(d / 1000.0d);
    }
}
