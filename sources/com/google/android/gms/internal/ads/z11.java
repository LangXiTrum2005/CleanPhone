package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z11 extends y11 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static z11 f22462i;

    public static final z11 f(Context context) {
        z11 z11Var;
        synchronized (z11.class) {
            try {
                if (f22462i == null) {
                    f22462i = new z11(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
                }
                z11Var = f22462i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11Var;
    }
}
