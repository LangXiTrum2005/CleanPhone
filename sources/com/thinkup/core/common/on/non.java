package com.thinkup.core.common.on;

/* JADX INFO: loaded from: classes6.dex */
public final class non {
    private String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f42219n;
    private int o;
    private int o0;
    private int oo;

    public non() {
    }

    public final long m() {
        return this.f42219n;
    }

    public final int n() {
        return this.o0;
    }

    public final String o() {
        return this.m;
    }

    public final int o0() {
        return this.oo;
    }

    public final int oo() {
        return this.o;
    }

    public non(int i2, String str) {
        this.o = i2;
        this.m = str;
        this.o0 = 0;
        this.oo = 0;
        this.f42219n = -1L;
    }

    private void n(int i2) {
        this.o = i2;
    }

    private void o(String str) {
        this.m = str;
    }

    public final void m(int i2) {
        this.oo = i2;
    }

    public final void o(long j) {
        this.f42219n = j;
    }

    public final void o(int i2) {
        this.o0 = i2;
    }
}
