package com.google.crypto.tink.shaded.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class f1 extends h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24564b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(Unsafe unsafe, int i10) {
        super(unsafe);
        this.f24564b = i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public final boolean c(long j10, Object obj) {
        switch (this.f24564b) {
            case 0:
                if (i1.f24579g) {
                    if (i1.h(j10, obj) == 0) {
                        return false;
                    }
                } else if (i1.i(j10, obj) == 0) {
                    return false;
                }
                return true;
            default:
                if (i1.f24579g) {
                    if (i1.h(j10, obj) == 0) {
                        return false;
                    }
                } else if (i1.i(j10, obj) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public final byte d(long j10, Object obj) {
        switch (this.f24564b) {
            case 0:
                return i1.f24579g ? i1.h(j10, obj) : i1.i(j10, obj);
            default:
                return i1.f24579g ? i1.h(j10, obj) : i1.i(j10, obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public final double e(long j10, Object obj) {
        switch (this.f24564b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(h(j10, obj));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public final float f(long j10, Object obj) {
        switch (this.f24564b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(g(j10, obj));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public final void k(Object obj, long j10, boolean z10) {
        switch (this.f24564b) {
            case 0:
                if (!i1.f24579g) {
                    i1.m(obj, j10, z10 ? (byte) 1 : (byte) 0);
                } else {
                    i1.l(obj, j10, z10 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!i1.f24579g) {
                    i1.m(obj, j10, z10 ? (byte) 1 : (byte) 0);
                } else {
                    i1.l(obj, j10, z10 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public final void l(Object obj, long j10, byte b10) {
        switch (this.f24564b) {
            case 0:
                if (!i1.f24579g) {
                    i1.m(obj, j10, b10);
                } else {
                    i1.l(obj, j10, b10);
                }
                break;
            default:
                if (!i1.f24579g) {
                    i1.m(obj, j10, b10);
                } else {
                    i1.l(obj, j10, b10);
                }
                break;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public final void m(Object obj, long j10, double d10) {
        switch (this.f24564b) {
            case 0:
                p(obj, j10, Double.doubleToLongBits(d10));
                break;
            default:
                p(obj, j10, Double.doubleToLongBits(d10));
                break;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public final void n(Object obj, long j10, float f10) {
        switch (this.f24564b) {
            case 0:
                o(Float.floatToIntBits(f10), j10, obj);
                break;
            default:
                o(Float.floatToIntBits(f10), j10, obj);
                break;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public final boolean s() {
        switch (this.f24564b) {
        }
        return false;
    }
}
