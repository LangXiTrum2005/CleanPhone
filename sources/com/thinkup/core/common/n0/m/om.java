package com.thinkup.core.common.n0.m;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public final class om {
    private int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f41943n;
    private String o;
    private boolean o0;
    private Object om;
    private int oo;

    private om() {
    }

    public static om o() {
        return new om();
    }

    public final String m() {
        return this.o;
    }

    public final int n() {
        return this.m;
    }

    public final long o0() {
        return this.f41943n;
    }

    public final int om() {
        return this.oo;
    }

    public final Object on() {
        return this.om;
    }

    public final boolean oo() {
        return this.o0;
    }

    public final String toString() {
        return "HttpRespEntity{urlKey='" + this.o + "', statusCode=" + this.m + ", reqNextTime=" + this.f41943n + ", isIntercept=" + this.o0 + ", interceptStatusCode=" + this.oo + ", interceptResult=" + this.om + AbstractJsonLexerKt.END_OBJ;
    }

    public final void m(int i2) {
        this.oo = i2;
    }

    public final void o(String str) {
        this.o = str;
    }

    public final void o(int i2) {
        this.m = i2;
    }

    public final void o(long j) {
        this.f41943n = j;
    }

    public final void o(boolean z2) {
        this.o0 = z2;
    }

    public final void o(Object obj) {
        this.om = obj;
    }
}
