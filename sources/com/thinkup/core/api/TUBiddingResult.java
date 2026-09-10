package com.thinkup.core.api;

import com.thinkup.core.common.on.om0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class TUBiddingResult extends om0 {
    private TUBiddingResult(boolean z2, double d, double d2, String str, TUBiddingNotice tUBiddingNotice, String str2, TUAdConst.CURRENCY currency) {
        super(z2, d, d2, str, tUBiddingNotice, str2, currency);
    }

    public static TUBiddingResult fail(String str) {
        return new TUBiddingResult(false, 0.0d, 0.0d, null, null, str, TUAdConst.CURRENCY.USD);
    }

    public static TUBiddingResult success(double d, String str, TUBiddingNotice tUBiddingNotice) {
        return new TUBiddingResult(true, d, d, str, tUBiddingNotice, null, TUAdConst.CURRENCY.USD);
    }

    @Override // com.thinkup.core.common.on.om0
    public void setExtra(Object obj) {
        super.setExtra(obj);
    }

    public void setLoseNoticeUrl(String str) {
        this.loseNoticeUrl = str;
    }

    public void setWinNoticeUrl(String str) {
        this.winNoticeUrl = str;
    }

    public String toString() {
        return "TUBiddingResult{isSuccess=" + this.isSuccess + ", originPrice=" + this.originPrice + ", price=" + this.price + ", sortPrice=" + this.sortPrice + ", token='" + this.token + "', errorMsg='" + this.errorMsg + "', winNoticeUrl='" + this.winNoticeUrl + "', loseNoticeUrl='" + this.loseNoticeUrl + "', displayNoticeUrl='" + this.displayNoticeUrl + "', useType=" + this.useType + ", currency=" + this.currency + ", biddingNotice=" + this.biddingNotice + ", extra=" + this.extra + AbstractJsonLexerKt.END_OBJ;
    }

    public static TUBiddingResult fail(String str, TUBiddingNotice tUBiddingNotice, TUAdConst.CURRENCY currency) {
        return new TUBiddingResult(false, 0.0d, 0.0d, null, tUBiddingNotice, str, currency);
    }

    public static TUBiddingResult success(double d, String str, TUBiddingNotice tUBiddingNotice, TUAdConst.CURRENCY currency) {
        return new TUBiddingResult(true, d, d, str, tUBiddingNotice, null, currency);
    }

    public static TUBiddingResult success(double d, double d2, String str, TUBiddingNotice tUBiddingNotice, TUAdConst.CURRENCY currency) {
        return new TUBiddingResult(true, d, d2, str, tUBiddingNotice, null, currency);
    }
}
