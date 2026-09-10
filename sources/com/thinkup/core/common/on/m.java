package com.thinkup.core.common.on;

import android.support.v4.media.a;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public final class m {
    private int m;
    private int m0 = 2;
    private int mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f42190n;
    private String o;
    private String o0;
    private long om;
    private int on;
    private long oo;

    public final int m() {
        return this.m;
    }

    public final int m0() {
        return this.m0;
    }

    public final int mo() {
        return this.mo;
    }

    public final int n() {
        return this.f42190n;
    }

    public final void o(String str, int i2, int i3) {
        this.o = str;
        this.m = i2;
        this.f42190n = i3;
    }

    public final String o0() {
        return this.o0;
    }

    public final long om() {
        return this.om;
    }

    public final int on() {
        return this.on;
    }

    public final long oo() {
        return this.oo;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdCallExtraInfo{realPlacementId='");
        sb.append(this.o);
        sb.append("', realGroupId=");
        sb.append(this.m);
        sb.append(", realTrafficGroupId=");
        sb.append(this.f42190n);
        sb.append(", realRequestId='");
        sb.append(this.o0);
        sb.append("', realPLSharedPLReqTimeGap=");
        sb.append(this.oo);
        sb.append(", sharedPLFailReqReqTime=");
        sb.append(this.om);
        sb.append(", sharedPLFailRetryReqCount=");
        sb.append(this.on);
        sb.append(", appStrategyType=");
        sb.append(this.m0);
        sb.append(", isReadyResultType=");
        return a.p(sb, this.mo, AbstractJsonLexerKt.END_OBJ);
    }

    public final void m(long j) {
        this.om = j;
    }

    public final void m(int i2) {
        this.mo = i2;
    }

    public final String o() {
        return this.o;
    }

    public final void o(String str) {
        this.o0 = str;
    }

    public final void o(long j) {
        this.oo = j;
    }

    public final void o(int i2) {
        this.on = i2;
    }

    public final void o(boolean z2) {
        if (z2) {
            this.m0 = 1;
        } else {
            this.m0 = 2;
        }
    }
}
