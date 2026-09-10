package com.thinkup.core.common.on;

import android.support.v4.media.a;

/* JADX INFO: loaded from: classes6.dex */
public final class o0 {
    private String m;
    private int m0;
    private int mm;
    private long mn;
    private int mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f42222n;
    private String n0;
    private int nm;
    private int nn;
    private String no;
    public int o;
    private String o0;
    private long o00;
    private String om;
    private String on;
    private String oo;

    public o0(String str) {
        this.m = str;
    }

    private String nn() {
        return this.on;
    }

    private int o00() {
        return this.o;
    }

    public final String m() {
        return this.f42222n;
    }

    public final int m0() {
        return this.mm;
    }

    public final String mm() {
        return this.n0;
    }

    public final String mn() {
        return this.no;
    }

    public final long mo() {
        return this.mn;
    }

    public final String n() {
        return this.o0;
    }

    public final int n0() {
        return this.nm;
    }

    public final long nm() {
        return this.o00;
    }

    public final int no() {
        return this.nn;
    }

    public final String o() {
        return this.m;
    }

    public final String o0() {
        return this.oo;
    }

    public final int om() {
        return this.m0;
    }

    public final int on() {
        return this.mo;
    }

    public final String oo() {
        return this.om;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{eventType='");
        sb.append(this.m);
        sb.append("', networkId='");
        sb.append(this.f42222n);
        sb.append("', format='");
        sb.append(this.o0);
        sb.append("', placementId='");
        sb.append(this.oo);
        sb.append("', sourceId='");
        sb.append(this.om);
        sb.append("', extra='");
        sb.append(this.on);
        sb.append("', month=");
        sb.append(this.m0);
        sb.append(", day=");
        sb.append(this.mo);
        sb.append(", hour=");
        sb.append(this.mm);
        sb.append(", timeStamp=");
        sb.append(this.mn);
        sb.append(", reqNum=");
        sb.append(this.o);
        sb.append(", app='");
        sb.append(this.n0);
        sb.append("', networkFormat='");
        return a.r(sb, this.no, "'}");
    }

    private void n(int i2) {
        this.o = i2;
    }

    public final void m(int i2) {
        this.nn = i2;
    }

    public final void o(long j) {
        this.mn = j;
    }

    public o0(String str, String str2, String str3, long j, int i2) {
        this.m = str;
        this.mn = j;
        this.o = i2;
        str3.getClass();
        switch (str3) {
            case "network_format":
                this.no = str2;
                break;
            case "source_id":
                this.om = str2;
                break;
            case "format":
                this.o0 = str2;
                break;
            case "network_id":
                this.f42222n = str2;
                break;
            case "app":
                this.n0 = str2;
                break;
            case "placement_id":
                this.oo = str2;
                break;
        }
    }

    public final void m(long j) {
        this.o00 = j;
    }

    public final void o(String str) {
        this.om = str;
    }

    public final void o(int i2) {
        this.nm = i2;
    }

    public o0(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, int i3, int i4, long j) {
        this.m = str;
        this.n0 = str2;
        this.f42222n = str3;
        this.o0 = str4;
        this.no = str5;
        this.oo = str6;
        this.om = str7;
        this.m0 = i2;
        this.mo = i3;
        this.mm = i4;
        this.mn = j;
    }
}
