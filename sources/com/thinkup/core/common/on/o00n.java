package com.thinkup.core.common.on;

/* JADX INFO: loaded from: classes6.dex */
public final class o00n {
    private boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Boolean f42226n;
    private String o;

    public o00n(String str, boolean z2) {
        this.o = str;
        this.m = z2;
    }

    public final synchronized boolean m() {
        return this.m;
    }

    public final synchronized Boolean n() {
        return this.f42226n;
    }

    public final synchronized void o(boolean z2) {
        this.f42226n = Boolean.valueOf(z2);
    }

    public final synchronized String o() {
        return this.o;
    }
}
