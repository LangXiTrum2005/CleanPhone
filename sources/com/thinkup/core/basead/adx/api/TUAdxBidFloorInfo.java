package com.thinkup.core.basead.adx.api;

import com.thinkup.core.api.TUAdConst;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class TUAdxBidFloorInfo {
    public static final String EXTRA_L_S_P = "extra_l_s_p";
    public static final String EXTRA_M_INFO = "extra_m_info";
    public static final String EXTRA_TP_M_INFO = "extra_tp_m_info";
    public static final String EXTRA_TYPE = "extra_type";
    double bidFloor;
    TUAdConst.CURRENCY currency;
    Map<String, Object> extraMap;

    public TUAdxBidFloorInfo(double d, TUAdConst.CURRENCY currency) {
        this.bidFloor = d;
        this.currency = currency;
    }

    public double getBidFloor() {
        return this.bidFloor;
    }

    public TUAdConst.CURRENCY getCurrency() {
        return this.currency;
    }

    public Map<String, Object> getExtraMap() {
        return this.extraMap;
    }

    public TUAdxBidFloorInfo(double d, TUAdConst.CURRENCY currency, Map<String, Object> map) {
        this(d, currency);
        this.extraMap = map;
    }
}
