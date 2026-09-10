package com.thinkup.core.common.no.o;

/* JADX INFO: loaded from: classes6.dex */
public final class m0 {
    public final boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f42096n;
    public final String o;
    public final boolean o0;

    private m0(String str, boolean z2, boolean z3) {
        this(str, z2, z3, (byte) 0);
    }

    private m0(String str, boolean z2, boolean z3, byte b2) {
        this.o = str;
        this.m = z2;
        this.o0 = z3;
        this.f42096n = 0;
    }

    private m0(String str, boolean z2) {
        this(str, z2, false, (byte) 0);
    }

    public m0(String str) {
        this(str, false, false, (byte) 0);
    }
}
