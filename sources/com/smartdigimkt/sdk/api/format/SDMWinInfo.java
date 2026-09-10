package com.smartdigimkt.sdk.api.format;

import com.smartdigimkt.n8.j;
import com.smartdigimkt.sdk.api.SDMAdConst;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class SDMWinInfo {
    private final SDMAdConst.CURRENCY currency;
    private final Map<String, Object> extraMap;
    private final double secondPrice;

    public SDMWinInfo(double d) {
        this(d, SDMAdConst.CURRENCY.USD);
    }

    public SDMAdConst.CURRENCY getCurrency() {
        return this.currency;
    }

    public Map<String, Object> getExtraMap() {
        return this.extraMap;
    }

    public double getSecondPrice() {
        return this.secondPrice;
    }

    public SDMWinInfo(double d, SDMAdConst.CURRENCY currency) {
        this(d, currency, null);
    }

    public double getSecondPrice(SDMAdConst.CURRENCY currency) {
        double d = this.secondPrice;
        SDMAdConst.CURRENCY currency2 = this.currency;
        if (d <= 0.0d) {
            return 0.0d;
        }
        return currency2 != null ? j.a(d, currency2, currency) : d;
    }

    public SDMWinInfo(double d, SDMAdConst.CURRENCY currency, Map<String, Object> map) {
        this.secondPrice = d;
        this.currency = currency;
        this.extraMap = map;
    }
}
