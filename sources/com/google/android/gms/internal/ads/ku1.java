package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ku1 extends mu1 {
    @Override // com.google.android.gms.internal.ads.mu1
    public final boolean B0(long j10, Object obj) {
        return nu1.f17986g ? nu1.q(j10, obj) : nu1.r(j10, obj);
    }

    @Override // com.google.android.gms.internal.ads.mu1
    public final void D0(Object obj, long j10, boolean z10) {
        if (nu1.f17986g) {
            nu1.d(obj, j10, z10 ? (byte) 1 : (byte) 0);
        } else {
            nu1.e(obj, j10, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.mu1
    public final float E0(long j10, Object obj) {
        return Float.intBitsToFloat(((Unsafe) this.f17550a).getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.ads.mu1
    public final void F0(Object obj, long j10, float f10) {
        ((Unsafe) this.f17550a).putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.ads.mu1
    public final double G0(long j10, Object obj) {
        return Double.longBitsToDouble(((Unsafe) this.f17550a).getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.ads.mu1
    public final void H0(Object obj, long j10, double d10) {
        ((Unsafe) this.f17550a).putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.ads.mu1
    public final byte I0(long j10) {
        return Memory.peekByte((int) j10);
    }

    @Override // com.google.android.gms.internal.ads.mu1
    public final void z0(Object obj, long j10, byte b10) {
        if (nu1.f17986g) {
            nu1.d(obj, j10, b10);
        } else {
            nu1.e(obj, j10, b10);
        }
    }
}
