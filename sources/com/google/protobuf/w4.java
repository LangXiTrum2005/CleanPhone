package com.google.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class w4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f24998a;

    public w4(Unsafe unsafe) {
        this.f24998a = unsafe;
    }

    public final int a(Class cls) {
        return this.f24998a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f24998a.arrayIndexScale(cls);
    }

    public abstract void c(long j10, byte[] bArr, long j11, long j12);

    public abstract void d(byte[] bArr, long j10, long j11, long j12);

    public abstract boolean e(long j10, Object obj);

    public abstract byte f(long j10);

    public abstract byte g(long j10, Object obj);

    public abstract double h(long j10, Object obj);

    public abstract float i(long j10, Object obj);

    public final int j(long j10, Object obj) {
        return this.f24998a.getInt(obj, j10);
    }

    public abstract long k(long j10);

    public final long l(long j10, Object obj) {
        return this.f24998a.getLong(obj, j10);
    }

    public final Object m(long j10, Object obj) {
        return this.f24998a.getObject(obj, j10);
    }

    public final long n(java.lang.reflect.Field field) {
        return this.f24998a.objectFieldOffset(field);
    }

    public abstract void o(Object obj, long j10, boolean z10);

    public abstract void p(byte b10, long j10);

    public abstract void q(Object obj, long j10, byte b10);

    public abstract void r(Object obj, long j10, double d10);

    public abstract void s(Object obj, long j10, float f10);

    public final void t(int i10, long j10, Object obj) {
        this.f24998a.putInt(obj, j10, i10);
    }

    public final void u(Object obj, long j10, long j11) {
        this.f24998a.putLong(obj, j10, j11);
    }

    public final void v(Object obj, long j10, Object obj2) {
        this.f24998a.putObject(obj, j10, obj2);
    }

    public boolean w() {
        Unsafe unsafe = this.f24998a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th2) {
            x4.a(th2);
            return false;
        }
    }

    public abstract boolean x();
}
