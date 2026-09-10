package com.thinkup.core.common.on;

import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUBiddingNotice;

/* JADX INFO: loaded from: classes6.dex */
public class om0 {
    public TUBiddingNotice biddingNotice;
    public TUAdConst.CURRENCY currency;
    public String displayNoticeUrl;
    public String errorMsg;
    public Object extra;
    protected boolean isSuccess;
    public String loseNoticeUrl;
    public double originPrice;
    protected String originRequestId;
    protected double price;
    public double rmbPrice;
    protected double sortPrice;
    public String token;
    public int useType;
    public String winNoticeUrl;

    public om0(boolean z2, double d, String str, String str2, String str3, String str4, String str5, TUAdConst.CURRENCY currency) {
        this.useType = 1;
        this.isSuccess = z2;
        this.originPrice = d;
        this.price = d;
        this.sortPrice = d;
        this.token = str;
        this.winNoticeUrl = str2;
        this.loseNoticeUrl = str3;
        this.displayNoticeUrl = str4;
        this.errorMsg = str5;
        this.currency = currency;
    }

    public TUAdConst.CURRENCY getCurrency() {
        return this.currency;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public Object getExtra() {
        return this.extra;
    }

    public double getOriginPrice() {
        return this.originPrice;
    }

    public String getOriginRequestId() {
        return this.originRequestId;
    }

    public double getPrice() {
        return this.price;
    }

    public double getRmbPrice() {
        return this.rmbPrice;
    }

    public double getSortPrice() {
        return this.sortPrice;
    }

    public boolean isSamePrice() {
        return this.sortPrice == this.originPrice;
    }

    public boolean isSuccessWithUseType() {
        return this.isSuccess && this.useType == 1;
    }

    public void setBiddingNotice(TUBiddingNotice tUBiddingNotice) {
        this.biddingNotice = tUBiddingNotice;
    }

    public void setExtra(Object obj) {
        this.extra = obj;
    }

    public void setOriginRequestId(String str) {
        this.originRequestId = str;
    }

    public void setPrice(double d) {
        this.price = d;
    }

    public void setSortPrice(double d) {
        this.sortPrice = d;
    }

    public om0(boolean z2, double d, String str, TUBiddingNotice tUBiddingNotice, String str2, TUAdConst.CURRENCY currency) {
        this.useType = 1;
        this.isSuccess = z2;
        this.originPrice = d;
        this.price = d;
        this.sortPrice = d;
        this.token = str;
        this.biddingNotice = tUBiddingNotice;
        this.errorMsg = str2;
        this.currency = currency;
    }

    public om0(boolean z2, double d, double d2, String str, TUBiddingNotice tUBiddingNotice, String str2, TUAdConst.CURRENCY currency) {
        this(z2, d2, str, tUBiddingNotice, str2, currency);
        this.sortPrice = d;
    }
}
