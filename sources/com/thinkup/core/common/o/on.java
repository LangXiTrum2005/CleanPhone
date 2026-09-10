package com.thinkup.core.common.o;

import android.support.v4.media.a;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public final class on {
    private String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f42129n;
    private String o;
    private int o0;
    private String oo;

    public final String m() {
        return TextUtils.isEmpty(this.m) ? "" : this.m;
    }

    public final String n() {
        return TextUtils.isEmpty(this.f42129n) ? "" : this.f42129n;
    }

    public final String o() {
        return TextUtils.isEmpty(this.o) ? "" : this.o;
    }

    public final int o0() {
        return this.o0;
    }

    public final String oo() {
        return TextUtils.isEmpty(this.oo) ? "" : this.oo;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdxOfferTrackingRecordBean{placementId='");
        sb.append(this.o);
        sb.append("', dspId='");
        sb.append(this.m);
        sb.append("', offerId='");
        sb.append(this.f42129n);
        sb.append("', tkType=");
        sb.append(this.o0);
        sb.append(", extraInfo='");
        return a.r(sb, this.oo, "'}");
    }

    public final void o0(String str) {
        this.oo = str;
    }

    public final void m(String str) {
        this.m = str;
    }

    public final void n(String str) {
        this.f42129n = str;
    }

    public final void o(String str) {
        this.o = str;
    }

    public final void o(int i2) {
        this.o0 = i2;
    }
}
