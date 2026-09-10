package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class vz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f21324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Looper f21325b;

    public vz0(Context context, Looper looper) {
        this.f21324a = context;
        this.f21325b = looper;
    }

    public final void a(String str) {
        zz0 zz0VarZ = a01.z();
        Context context = this.f21324a;
        String packageName = context.getPackageName();
        zz0VarZ.b();
        ((a01) zz0VarZ.f19193b).A(packageName);
        zz0VarZ.b();
        ((a01) zz0VarZ.f19193b).C(2);
        xz0 xz0VarZ = yz0.z();
        xz0VarZ.b();
        ((yz0) xz0VarZ.f19193b).A(str);
        xz0VarZ.b();
        ((yz0) xz0VarZ.f19193b).B(2);
        zz0VarZ.b();
        ((a01) zz0VarZ.f19193b).B((yz0) xz0VarZ.e());
        hx0 hx0Var = new hx0(context, this.f21325b, (a01) zz0VarZ.e());
        synchronized (hx0Var.f15422f) {
            try {
                if (!hx0Var.f15418b) {
                    hx0Var.f15418b = true;
                    ((e01) hx0Var.f15420d).checkAvailabilityAndConnect();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
