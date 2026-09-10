package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yg implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fg f22231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xd f22234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Method f22235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f22236f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f22237g;

    public yg(fg fgVar, String str, String str2, xd xdVar, int i10, int i11) {
        this.f22231a = fgVar;
        this.f22232b = str;
        this.f22233c = str2;
        this.f22234d = xdVar;
        this.f22236f = i10;
        this.f22237g = i11;
    }

    public abstract void a();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i10;
        try {
            long jNanoTime = System.nanoTime();
            fg fgVar = this.f22231a;
            Method methodD = fgVar.d(this.f22232b, this.f22233c);
            this.f22235e = methodD;
            if (methodD == null) {
                return null;
            }
            a();
            nf nfVar = fgVar.f14397k;
            if (nfVar == null || (i10 = this.f22236f) == Integer.MIN_VALUE) {
                return null;
            }
            nfVar.a(this.f22237g, i10, (System.nanoTime() - jNanoTime) / 1000, null, null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
