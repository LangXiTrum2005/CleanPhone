package com.google.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class u4 extends w4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24963b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u4(Unsafe unsafe, int i10) {
        super(unsafe);
        this.f24963b = i10;
    }

    @Override // com.google.protobuf.w4
    public final void c(long j10, byte[] bArr, long j11, long j12) {
        switch (this.f24963b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.w4
    public final void d(byte[] bArr, long j10, long j11, long j12) {
        switch (this.f24963b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.w4
    public final boolean e(long j10, Object obj) {
        switch (this.f24963b) {
            case 0:
                if (x4.f25026h) {
                    if (x4.j(j10, obj) == 0) {
                        return false;
                    }
                } else if (x4.k(j10, obj) == 0) {
                    return false;
                }
                return true;
            default:
                if (x4.f25026h) {
                    if (x4.j(j10, obj) == 0) {
                        return false;
                    }
                } else if (x4.k(j10, obj) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // com.google.protobuf.w4
    public final byte f(long j10) {
        switch (this.f24963b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.w4
    public final byte g(long j10, Object obj) {
        switch (this.f24963b) {
            case 0:
                return x4.f25026h ? x4.j(j10, obj) : x4.k(j10, obj);
            default:
                return x4.f25026h ? x4.j(j10, obj) : x4.k(j10, obj);
        }
    }

    @Override // com.google.protobuf.w4
    public final double h(long j10, Object obj) {
        switch (this.f24963b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(l(j10, obj));
    }

    @Override // com.google.protobuf.w4
    public final float i(long j10, Object obj) {
        switch (this.f24963b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(j(j10, obj));
    }

    @Override // com.google.protobuf.w4
    public final long k(long j10) {
        switch (this.f24963b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.w4
    public final void o(Object obj, long j10, boolean z10) {
        switch (this.f24963b) {
            case 0:
                if (!x4.f25026h) {
                    x4.p(obj, j10, z10 ? (byte) 1 : (byte) 0);
                } else {
                    x4.o(obj, j10, z10 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!x4.f25026h) {
                    x4.p(obj, j10, z10 ? (byte) 1 : (byte) 0);
                } else {
                    x4.o(obj, j10, z10 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // com.google.protobuf.w4
    public final void p(byte b10, long j10) {
        switch (this.f24963b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.w4
    public final void q(Object obj, long j10, byte b10) {
        switch (this.f24963b) {
            case 0:
                if (!x4.f25026h) {
                    x4.p(obj, j10, b10);
                } else {
                    x4.o(obj, j10, b10);
                }
                break;
            default:
                if (!x4.f25026h) {
                    x4.p(obj, j10, b10);
                } else {
                    x4.o(obj, j10, b10);
                }
                break;
        }
    }

    @Override // com.google.protobuf.w4
    public final void r(Object obj, long j10, double d10) {
        switch (this.f24963b) {
            case 0:
                u(obj, j10, Double.doubleToLongBits(d10));
                break;
            default:
                u(obj, j10, Double.doubleToLongBits(d10));
                break;
        }
    }

    @Override // com.google.protobuf.w4
    public final void s(Object obj, long j10, float f10) {
        switch (this.f24963b) {
            case 0:
                t(Float.floatToIntBits(f10), j10, obj);
                break;
            default:
                t(Float.floatToIntBits(f10), j10, obj);
                break;
        }
    }

    @Override // com.google.protobuf.w4
    public final boolean x() {
        switch (this.f24963b) {
        }
        return false;
    }
}
