package com.google.android.gms.internal.auth;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f22913a;

    public w1(Unsafe unsafe) {
        this.f22913a = unsafe;
    }

    public abstract double a(long j10, Object obj);

    public abstract float b(long j10, Object obj);

    public abstract void c(Object obj, long j10, boolean z10);

    public abstract void d(Object obj, long j10, double d10);

    public abstract void e(Object obj, long j10, float f10);

    public abstract boolean f(long j10, Object obj);
}
