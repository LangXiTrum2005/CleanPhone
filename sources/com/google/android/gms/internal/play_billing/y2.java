package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y2 extends a3 {
    @Override // com.google.android.gms.internal.play_billing.a3
    public final double a(long j10, Object obj) {
        return Double.longBitsToDouble(this.f24220a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.play_billing.a3
    public final float b(long j10, Object obj) {
        return Float.intBitsToFloat(this.f24220a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.play_billing.a3
    public final void c(Object obj, long j10, boolean z10) {
        if (b3.f24237g) {
            b3.c(obj, j10, z10 ? (byte) 1 : (byte) 0);
        } else {
            b3.d(obj, j10, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.a3
    public final void d(Object obj, long j10, byte b10) {
        if (b3.f24237g) {
            b3.c(obj, j10, b10);
        } else {
            b3.d(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.a3
    public final void e(Object obj, long j10, double d10) {
        this.f24220a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.play_billing.a3
    public final void f(Object obj, long j10, float f10) {
        this.f24220a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.play_billing.a3
    public final boolean g(long j10, Object obj) {
        return b3.f24237g ? b3.m(j10, obj) : b3.n(j10, obj);
    }
}
