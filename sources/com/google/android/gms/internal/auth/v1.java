package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v1 extends w1 {
    @Override // com.google.android.gms.internal.auth.w1
    public final double a(long j10, Object obj) {
        return Double.longBitsToDouble(this.f22913a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.auth.w1
    public final float b(long j10, Object obj) {
        return Float.intBitsToFloat(this.f22913a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.auth.w1
    public final void c(Object obj, long j10, boolean z10) {
        if (x1.f22922f) {
            x1.f(obj, j10, z10);
        } else {
            x1.g(obj, j10, z10);
        }
    }

    @Override // com.google.android.gms.internal.auth.w1
    public final void d(Object obj, long j10, double d10) {
        this.f22913a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.auth.w1
    public final void e(Object obj, long j10, float f10) {
        this.f22913a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.auth.w1
    public final boolean f(long j10, Object obj) {
        return x1.f22922f ? x1.k(j10, obj) : x1.l(j10, obj);
    }
}
