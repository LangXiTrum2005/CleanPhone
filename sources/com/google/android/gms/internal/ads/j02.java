package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j02 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j02 f15892c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i02 f15894b;

    static {
        new j02("");
        f15892c = new j02("preload");
    }

    public j02(String str) {
        this.f15893a = str;
        this.f15894b = Build.VERSION.SDK_INT >= 31 ? new i02() : null;
    }

    public final synchronized void a(LogSessionId logSessionId) {
        i02 i02Var = this.f15894b;
        if (i02Var == null) {
            throw null;
        }
        ps1.c0(i02Var.f15468a.equals(LogSessionId.LOG_SESSION_ID_NONE));
        i02Var.f15468a = logSessionId;
    }
}
