package saneness;

import ads_mobile_sdk.m53;
import ads_mobile_sdk.n53;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class strum extends m53 {
    public strum(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // ads_mobile_sdk.m53
    public final void a(Object obj, long j, double d) {
        a(obj, j, Double.doubleToLongBits(d));
    }

    @Override // ads_mobile_sdk.m53
    public final boolean b() {
        return super.b();
    }

    @Override // ads_mobile_sdk.m53
    public final double c(Object obj, long j) {
        return Double.longBitsToDouble(f(obj, j));
    }

    @Override // ads_mobile_sdk.m53
    public final float d(Object obj, long j) {
        return Float.intBitsToFloat(e(obj, j));
    }

    @Override // ads_mobile_sdk.m53
    public final void a(Object obj, long j, float f) {
        a(Float.floatToIntBits(f), j, obj);
    }

    @Override // ads_mobile_sdk.m53
    public final byte b(Object obj, long j) {
        if (n53.g) {
            return n53.a(obj, j);
        }
        return (byte) ((n53.c.e(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    @Override // ads_mobile_sdk.m53
    public final void a(Object obj, long j, byte b) {
        if (n53.g) {
            n53.a(obj, j, b);
        } else {
            n53.b(obj, j, b);
        }
    }

    @Override // ads_mobile_sdk.m53
    public final boolean a(Object obj, long j) {
        if (n53.g) {
            return n53.a(obj, j) != 0;
        }
        return ((byte) ((n53.c.e(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    @Override // ads_mobile_sdk.m53
    public final void a(Object obj, long j, boolean z) {
        if (n53.g) {
            n53.a(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            n53.b(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }
}
