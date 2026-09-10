package com.smartdigimkt.sdk.api.format;

import com.smartdigimkt.n8.j;
import com.smartdigimkt.sdk.api.SDMAdConst;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class SDMLossInfo {
    private final SDMAdConst.CURRENCY currency;
    private final Map<String, Object> extraMap;
    private final LOSS_REASON lossReason;
    private final double winPrice;

    public enum LOSS_REASON {
        LOSS_TO_HIGHER_BID(1),
        LOSS_TO_NORMAL(2),
        LOSS_TO_AUCTION_FLOOR(3),
        LOSS_TO_EXPIRE(4);

        private final int code;

        LOSS_REASON(int i2) {
            this.code = i2;
        }

        public int getCode() {
            return this.code;
        }
    }

    public SDMLossInfo(LOSS_REASON loss_reason, double d) {
        this(loss_reason, d, SDMAdConst.CURRENCY.USD);
    }

    public SDMAdConst.CURRENCY getCurrency() {
        return this.currency;
    }

    public Map<String, Object> getExtraMap() {
        return this.extraMap;
    }

    public LOSS_REASON getLossReason() {
        return this.lossReason;
    }

    public double getWinPrice() {
        return this.winPrice;
    }

    public SDMLossInfo(LOSS_REASON loss_reason, double d, SDMAdConst.CURRENCY currency) {
        this(loss_reason, d, currency, null);
    }

    public double getWinPrice(SDMAdConst.CURRENCY currency) {
        double d = this.winPrice;
        SDMAdConst.CURRENCY currency2 = this.currency;
        if (d <= 0.0d) {
            return 0.0d;
        }
        return currency2 != null ? j.a(d, currency2, currency) : d;
    }

    public SDMLossInfo(LOSS_REASON loss_reason, double d, SDMAdConst.CURRENCY currency, Map<String, Object> map) {
        this.lossReason = loss_reason;
        this.winPrice = d;
        this.currency = currency;
        this.extraMap = map;
    }
}
