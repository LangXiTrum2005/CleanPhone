package com.smartdigimkt.sdk.api;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class SDMAdxBidFloorInfo {
    public static final String EXTRA_L_S_P = "extra_l_s_p";
    public static final String EXTRA_M_INFO = "extra_m_info";
    public static final String EXTRA_TP_M_INFO = "extra_tp_m_info";
    public static final String EXTRA_TYPE = "extra_type";
    double bidFloor;
    SDMAdConst.CURRENCY currency;
    Map<String, Object> extraMap;

    public SDMAdxBidFloorInfo(double d, SDMAdConst.CURRENCY currency) {
        this.bidFloor = d;
        this.currency = currency;
    }

    public double getBidFloor() {
        return this.bidFloor;
    }

    public SDMAdConst.CURRENCY getCurrency() {
        return this.currency;
    }

    public Map<String, Object> getExtraMap() {
        return this.extraMap;
    }

    public SDMAdxBidFloorInfo(double d, SDMAdConst.CURRENCY currency, Map<String, Object> map) {
        this(d, currency);
        this.extraMap = map;
    }
}
