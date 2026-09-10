package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 extends p1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4140b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n1(Unsafe unsafe, int i10) {
        super(unsafe);
        this.f4140b = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.p1
    public final boolean c(long j10, Object obj) {
        switch (this.f4140b) {
            case 0:
                return q1.f4161g ? q1.b(j10, obj) : q1.c(j10, obj);
            default:
                return q1.f4161g ? q1.b(j10, obj) : q1.c(j10, obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p1
    public final double d(long j10, Object obj) {
        switch (this.f4140b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(g(j10, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.p1
    public final float e(long j10, Object obj) {
        switch (this.f4140b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(f(j10, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.p1
    public final void j(Object obj, long j10, boolean z10) {
        switch (this.f4140b) {
            case 0:
                if (!q1.f4161g) {
                    q1.l(obj, j10, z10 ? (byte) 1 : (byte) 0);
                } else {
                    q1.k(obj, j10, z10 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!q1.f4161g) {
                    q1.l(obj, j10, z10 ? (byte) 1 : (byte) 0);
                } else {
                    q1.k(obj, j10, z10 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p1
    public final void k(Object obj, long j10, byte b10) {
        switch (this.f4140b) {
            case 0:
                if (!q1.f4161g) {
                    q1.l(obj, j10, b10);
                } else {
                    q1.k(obj, j10, b10);
                }
                break;
            default:
                if (!q1.f4161g) {
                    q1.l(obj, j10, b10);
                } else {
                    q1.k(obj, j10, b10);
                }
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p1
    public final void l(Object obj, long j10, double d10) {
        switch (this.f4140b) {
            case 0:
                o(obj, j10, Double.doubleToLongBits(d10));
                break;
            default:
                o(obj, j10, Double.doubleToLongBits(d10));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p1
    public final void m(Object obj, long j10, float f10) {
        switch (this.f4140b) {
            case 0:
                n(Float.floatToIntBits(f10), j10, obj);
                break;
            default:
                n(Float.floatToIntBits(f10), j10, obj);
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p1
    public final boolean r() {
        switch (this.f4140b) {
        }
        return false;
    }
}
