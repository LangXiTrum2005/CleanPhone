package com.thinkup.core.common.on;

import android.support.v4.media.a;

/* JADX INFO: loaded from: classes6.dex */
public final class mo0 {
    private String m;
    private int m0;
    private String mm;
    private n0 mn;
    private String mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f42204n;
    private boolean n0;
    private String o;
    private String o0;
    private long om;
    private long on;
    private int oo;

    private mo0() {
    }

    public static mo0 o(n0 n0Var, String str, String str2, int i2) {
        mo0 mo0Var = new mo0();
        mo0Var.m = n0Var.mon();
        mo0Var.o0 = n0Var.oon0();
        mo0Var.o = n0Var.oomn();
        mo0Var.oo = n0Var.n0n();
        mo0Var.om = System.currentTimeMillis();
        mo0Var.m0 = i2;
        mo0Var.mo = str;
        mo0Var.mm = str2;
        mo0Var.mn = n0Var;
        return mo0Var;
    }

    public final String m() {
        String str = this.o;
        return str != null ? str : "";
    }

    public final String m0() {
        return this.f42204n;
    }

    public final boolean mm() {
        return this.n0;
    }

    public final n0 mo() {
        return this.mn;
    }

    public final int n() {
        return this.oo;
    }

    public final int o0() {
        return this.m0;
    }

    public final long om() {
        return this.om + this.on;
    }

    public final String on() {
        return this.o0;
    }

    public final String oo() {
        return this.mo + "," + this.mm;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DynWFAdSourceRecordEntity{placementId='");
        sb.append(this.o);
        sb.append("', adSourceId='");
        sb.append(this.m);
        sb.append("', requestId='");
        sb.append(this.o0);
        sb.append("', networkFirmId=");
        sb.append(this.oo);
        sb.append("', recordTimeStamp=");
        sb.append(this.om);
        sb.append("', recordTimeInterval=");
        sb.append(this.on);
        sb.append("', recordTimeType=");
        sb.append(this.m0);
        sb.append("', networkErrorCode='");
        sb.append(this.mo);
        sb.append("', networkErrorMsg='");
        sb.append(this.mm);
        sb.append("', serverErrorCode='");
        return a.r(sb, this.f42204n, "'}");
    }

    public final String o() {
        return this.m;
    }

    public final void o(long j) {
        this.on = j;
    }

    public final void o(String str) {
        this.f42204n = str;
    }

    public final void o(boolean z2) {
        this.n0 = z2;
    }
}
