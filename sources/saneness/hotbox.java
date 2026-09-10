package saneness;

import ads_mobile_sdk.m53;
import ads_mobile_sdk.n53;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class hotbox extends m53 {
    public hotbox(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // ads_mobile_sdk.m53
    public final boolean a(Object obj, long j) {
        return this.a.getBoolean(obj, j);
    }

    @Override // ads_mobile_sdk.m53
    public final byte b(Object obj, long j) {
        return this.a.getByte(obj, j);
    }

    @Override // ads_mobile_sdk.m53
    public final double c(Object obj, long j) {
        return this.a.getDouble(obj, j);
    }

    @Override // ads_mobile_sdk.m53
    public final float d(Object obj, long j) {
        return this.a.getFloat(obj, j);
    }

    @Override // ads_mobile_sdk.m53
    public final void a(Object obj, long j, boolean z) {
        this.a.putBoolean(obj, j, z);
    }

    @Override // ads_mobile_sdk.m53
    public final boolean b() {
        if (!super.b()) {
            return false;
        }
        try {
            Class<?> cls = this.a.getClass();
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", cls2);
            cls.getMethod("putByte", cls2, Byte.TYPE);
            cls.getMethod("getInt", cls2);
            cls.getMethod("putInt", cls2, Integer.TYPE);
            cls.getMethod("getLong", cls2);
            cls.getMethod("putLong", cls2, cls2);
            cls.getMethod("copyMemory", cls2, cls2, cls2);
            cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
            return true;
        } catch (Throwable th) {
            n53.a(th);
            return false;
        }
    }

    @Override // ads_mobile_sdk.m53
    public final void a(Object obj, long j, byte b) {
        this.a.putByte(obj, j, b);
    }

    @Override // ads_mobile_sdk.m53
    public final void a(Object obj, long j, double d) {
        this.a.putDouble(obj, j, d);
    }

    @Override // ads_mobile_sdk.m53
    public final void a(Object obj, long j, float f) {
        this.a.putFloat(obj, j, f);
    }

    @Override // ads_mobile_sdk.m53
    public final boolean a() {
        if (!super.a()) {
            return false;
        }
        try {
            Class<?> cls = this.a.getClass();
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
        } catch (Throwable th) {
            n53.a(th);
            return false;
        }
    }
}
