package com.p004ironsource.adqualitysdk.sdk.i;

/* JADX INFO: loaded from: classes5.dex */
public final class hr {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static hr f2286;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final ho f2288 = new ho();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final hw f2287 = new hw();

    private hr() {
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static synchronized hr m2242() {
        try {
            if (f2286 == null) {
                f2286 = new hr();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f2286;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static synchronized void m2243() {
        f2286 = null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final ho m2244() {
        return this.f2288;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final hw m2245() {
        return this.f2287;
    }
}
