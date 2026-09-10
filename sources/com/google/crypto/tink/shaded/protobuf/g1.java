package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class g1 extends h1 {
    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public final boolean c(long j10, Object obj) {
        return this.f24568a.getBoolean(obj, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public final byte d(long j10, Object obj) {
        return this.f24568a.getByte(obj, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public final double e(long j10, Object obj) {
        return this.f24568a.getDouble(obj, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public final float f(long j10, Object obj) {
        return this.f24568a.getFloat(obj, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public final void k(Object obj, long j10, boolean z10) {
        this.f24568a.putBoolean(obj, j10, z10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public final void l(Object obj, long j10, byte b10) {
        this.f24568a.putByte(obj, j10, b10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public final void m(Object obj, long j10, double d10) {
        this.f24568a.putDouble(obj, j10, d10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public final void n(Object obj, long j10, float f10) {
        this.f24568a.putFloat(obj, j10, f10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public final boolean r() {
        if (!super.r()) {
            return false;
        }
        try {
            Class<?> cls = this.f24568a.getClass();
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
            i1.a(th2);
            return false;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public final boolean s() {
        Unsafe unsafe = this.f24568a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (i1.e() != null) {
                    try {
                        Class<?> cls3 = this.f24568a.getClass();
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
                        i1.a(th2);
                        return false;
                    }
                }
            } catch (Throwable th3) {
                i1.a(th3);
            }
        }
        return false;
    }
}
