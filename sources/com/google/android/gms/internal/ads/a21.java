package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a21 extends y11 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static a21 f11815i;

    public static final a21 f(Context context) {
        a21 a21Var;
        synchronized (a21.class) {
            try {
                if (f11815i == null) {
                    f11815i = new a21(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
                }
                a21Var = f11815i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a21Var;
    }

    public final void g() {
        synchronized (a21.class) {
            try {
                iw0 iw0Var = this.f22079f;
                if (((SharedPreferences) iw0Var.f15865c).contains(this.f22074a)) {
                    c(false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
