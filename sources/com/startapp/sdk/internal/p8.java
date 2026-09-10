package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.TimeoutConfig;

/* JADX INFO: loaded from: classes6.dex */
public final class p8 {
    public static final s8 f = new s8(new byte[0], "text/plain", null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q8 f41353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s8 f41355c = f;
    public TimeoutConfig d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i7 f41356e;

    public p8(q8 q8Var, String str) {
        this.f41353a = q8Var;
        this.f41354b = str;
    }

    public final t8 a() {
        q8 q8Var = this.f41353a;
        try {
            return q8Var.a(this);
        } catch (Throwable th) {
            if (!q8Var.a(1)) {
                return null;
            }
            g9.a(th);
            return null;
        }
    }

    public final String b() {
        q8 q8Var = this.f41353a;
        try {
            return q8Var.b(this);
        } catch (Throwable th) {
            if (!q8Var.a(4)) {
                return null;
            }
            g9.a(th);
            return null;
        }
    }
}
