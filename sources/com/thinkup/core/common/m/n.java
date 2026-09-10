package com.thinkup.core.common.m;

import android.support.v4.media.a;

/* JADX INFO: loaded from: classes6.dex */
public final class n {
    private long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f41867n;
    private String o;
    private String o0;
    private String om;
    private boolean oo;

    private n(String str, String str2, boolean z2, long j, boolean z3) {
        this(str, str2, z2, j, z3, null);
    }

    private String m() {
        return this.o;
    }

    private long n() {
        return this.m;
    }

    private boolean o0() {
        return this.f41867n;
    }

    private String om() {
        return this.om;
    }

    private String oo() {
        return this.o0;
    }

    public final boolean o() {
        return this.oo;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApkInspectResult{pkgName='");
        sb.append(this.o);
        sb.append("', inspectTime=");
        sb.append(this.m);
        sb.append(", inspectResult=");
        sb.append(this.f41867n);
        sb.append(", appVersion='");
        sb.append(this.o0);
        sb.append("', isRealTimeInspect=");
        sb.append(this.oo);
        sb.append(", uploadKey='");
        return a.r(sb, this.om, "'}");
    }

    private n(String str, String str2, boolean z2, long j, boolean z3, String str3) {
        this.o = str;
        this.om = str2;
        this.oo = z2;
        this.m = j;
        this.f41867n = z3;
        this.o0 = str3;
    }
}
