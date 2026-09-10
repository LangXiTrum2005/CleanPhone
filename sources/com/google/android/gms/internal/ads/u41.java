package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u41 implements t41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h41 f20623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xd f20624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y61 f20625e;

    public u41(String str, String str2, xd xdVar, h41 h41Var, y61 y61Var) {
        this.f20621a = str;
        this.f20622b = str2;
        this.f20624d = xdVar;
        this.f20623c = h41Var;
        this.f20625e = y61Var;
    }

    public abstract void a(Method method, xd xdVar);

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        y61 y61Var = this.f20625e;
        try {
            y61Var.a();
            Method methodB = this.f20623c.b(this.f20621a, this.f20622b);
            if (methodB != null) {
                a(methodB, this.f20624d);
            }
            y61Var.c();
            return null;
        } catch (Throwable th2) {
            try {
                y61Var.b(th2);
                throw th2;
            } catch (Throwable th3) {
                y61Var.c();
                throw th3;
            }
        }
    }
}
