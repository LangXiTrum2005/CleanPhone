package com.thinkup.core.mg.api;

import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.common.ooo.o0n;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class MgAdInfo {
    private TUAdConst.CURRENCY currency = TUAdConst.CURRENCY.USD;
    private double ecpm;

    public static boolean isMgAdInfoValid(MgAdInfo mgAdInfo) {
        return mgAdInfo != null && mgAdInfo.getEcpm() > 0.0d;
    }

    public TUAdConst.CURRENCY getCurrency() {
        return this.currency;
    }

    public double getEcpm() {
        return this.ecpm;
    }

    public double getUSDEcpm() {
        return getEcpm(TUAdConst.CURRENCY.USD);
    }

    public void setCurrency(TUAdConst.CURRENCY currency) {
        this.currency = currency;
    }

    public void setEcpm(double d) {
        this.ecpm = d;
    }

    public String toString() {
        return "MgAdInfo{ecpm=" + this.ecpm + ", currency=" + this.currency + AbstractJsonLexerKt.END_OBJ;
    }

    public double getEcpm(TUAdConst.CURRENCY currency) {
        return o0n.o(this.ecpm, this.currency, currency);
    }
}
