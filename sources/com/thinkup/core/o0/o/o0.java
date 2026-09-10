package com.thinkup.core.o0.o;

import android.support.v4.media.a;

/* JADX INFO: loaded from: classes6.dex */
public final class o0 {
    public String m;
    public double o;

    public o0() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecentLoadedHighPriceInfo{price=");
        sb.append(this.o);
        sb.append(", adSourceId='");
        return a.r(sb, this.m, "'}");
    }

    public o0(double d, String str) {
        this.o = d;
        this.m = str;
    }
}
