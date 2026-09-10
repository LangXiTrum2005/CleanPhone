package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f24220a;

    public a3(Unsafe unsafe) {
        this.f24220a = unsafe;
    }

    public abstract double a(long j10, Object obj);

    public abstract float b(long j10, Object obj);

    public abstract void c(Object obj, long j10, boolean z10);

    public abstract void d(Object obj, long j10, byte b10);

    public abstract void e(Object obj, long j10, double d10);

    public abstract void f(Object obj, long j10, float f10);

    public abstract boolean g(long j10, Object obj);
}
