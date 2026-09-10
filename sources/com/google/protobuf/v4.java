package com.google.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class v4 extends w4 {
    @Override // com.google.protobuf.w4
    public final void c(long j10, byte[] bArr, long j11, long j12) {
        this.f24998a.copyMemory((Object) null, j10, bArr, x4.f25024f + j11, j12);
    }

    @Override // com.google.protobuf.w4
    public final void d(byte[] bArr, long j10, long j11, long j12) {
        this.f24998a.copyMemory(bArr, x4.f25024f + j10, (Object) null, j11, j12);
    }

    @Override // com.google.protobuf.w4
    public final boolean e(long j10, Object obj) {
        return this.f24998a.getBoolean(obj, j10);
    }

    @Override // com.google.protobuf.w4
    public final byte f(long j10) {
        return this.f24998a.getByte(j10);
    }

    @Override // com.google.protobuf.w4
    public final byte g(long j10, Object obj) {
        return this.f24998a.getByte(obj, j10);
    }

    @Override // com.google.protobuf.w4
    public final double h(long j10, Object obj) {
        return this.f24998a.getDouble(obj, j10);
    }

    @Override // com.google.protobuf.w4
    public final float i(long j10, Object obj) {
        return this.f24998a.getFloat(obj, j10);
    }

    @Override // com.google.protobuf.w4
    public final long k(long j10) {
        return this.f24998a.getLong(j10);
    }

    @Override // com.google.protobuf.w4
    public final void o(Object obj, long j10, boolean z10) {
        this.f24998a.putBoolean(obj, j10, z10);
    }

    @Override // com.google.protobuf.w4
    public final void p(byte b10, long j10) {
        this.f24998a.putByte(j10, b10);
    }

    @Override // com.google.protobuf.w4
    public final void q(Object obj, long j10, byte b10) {
        this.f24998a.putByte(obj, j10, b10);
    }

    @Override // com.google.protobuf.w4
    public final void r(Object obj, long j10, double d10) {
        this.f24998a.putDouble(obj, j10, d10);
    }

    @Override // com.google.protobuf.w4
    public final void s(Object obj, long j10, float f10) {
        this.f24998a.putFloat(obj, j10, f10);
    }

    @Override // com.google.protobuf.w4
    public final boolean w() {
        if (!super.w()) {
            return false;
        }
        try {
            Class<?> cls = this.f24998a.getClass();
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th2) {
            x4.a(th2);
            return false;
        }
    }

    @Override // com.google.protobuf.w4
    public final boolean x() {
        Unsafe unsafe = this.f24998a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (x4.f() != null) {
                    try {
                        Class<?> cls3 = this.f24998a.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th2) {
                        x4.a(th2);
                        return false;
                    }
                }
            } catch (Throwable th3) {
                x4.a(th3);
            }
        }
        return false;
    }
}
