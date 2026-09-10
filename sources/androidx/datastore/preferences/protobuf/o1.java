package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 extends p1 {
    @Override // androidx.datastore.preferences.protobuf.p1
    public final boolean c(long j10, Object obj) {
        return this.f4152a.getBoolean(obj, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.p1
    public final double d(long j10, Object obj) {
        return this.f4152a.getDouble(obj, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.p1
    public final float e(long j10, Object obj) {
        return this.f4152a.getFloat(obj, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.p1
    public final void j(Object obj, long j10, boolean z10) {
        this.f4152a.putBoolean(obj, j10, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.p1
    public final void k(Object obj, long j10, byte b10) {
        this.f4152a.putByte(obj, j10, b10);
    }

    @Override // androidx.datastore.preferences.protobuf.p1
    public final void l(Object obj, long j10, double d10) {
        this.f4152a.putDouble(obj, j10, d10);
    }

    @Override // androidx.datastore.preferences.protobuf.p1
    public final void m(Object obj, long j10, float f10) {
        this.f4152a.putFloat(obj, j10, f10);
    }

    @Override // androidx.datastore.preferences.protobuf.p1
    public final boolean q() {
        if (!super.q()) {
            return false;
        }
        try {
            Class<?> cls = this.f4152a.getClass();
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
            q1.a(th2);
            return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p1
    public final boolean r() {
        Unsafe unsafe = this.f4152a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (q1.g() != null) {
                    try {
                        Class<?> cls3 = this.f4152a.getClass();
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
                        q1.a(th2);
                        return false;
                    }
                }
            } catch (Throwable th3) {
                q1.a(th3);
            }
        }
        return false;
    }
}
