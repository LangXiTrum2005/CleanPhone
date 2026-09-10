package com.chartboost.sdk.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13396a;

    public a3(Context context) {
        Intrinsics.f(context, "context");
        this.f13396a = context;
    }

    public final int a() {
        return z4.f(this.f13396a);
    }

    public final String b() {
        return z4.g(this.f13396a).b();
    }

    public final y4 c() {
        y4 y4Var;
        Context context = this.f13396a;
        if (!z4.d(context)) {
            y4Var = y4.CONNECTION_ERROR;
        } else if (z4.e(context)) {
            y4Var = y4.CONNECTION_WIFI;
        } else {
            y4Var = z4.c(context) ? y4.CONNECTION_MOBILE : y4.CONNECTION_UNKNOWN;
        }
        za.a("NETWORK TYPE: " + y4Var, (Throwable) null, 2, (Object) null);
        return y4Var;
    }

    public final boolean d() {
        return c() == y4.CONNECTION_MOBILE;
    }

    public final boolean e() {
        return z4.d(this.f13396a);
    }

    public final zc f() {
        return z4.g(this.f13396a);
    }
}
