package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x2 extends y2 {
    @Override // com.google.android.gms.internal.measurement.y2
    public final void b(Object obj, long j10, byte b10) {
        if (z2.f24197f) {
            z2.b(obj, j10, b10);
        } else {
            z2.c(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.y2
    public final boolean d(long j10, Object obj) {
        return z2.f24197f ? z2.n(j10, obj) : z2.o(j10, obj);
    }

    @Override // com.google.android.gms.internal.measurement.y2
    public final void g(Object obj, long j10, boolean z10) {
        if (z2.f24197f) {
            z2.b(obj, j10, z10 ? (byte) 1 : (byte) 0);
        } else {
            z2.c(obj, j10, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.y2
    public final float h(long j10, Object obj) {
        return Float.intBitsToFloat(((Unsafe) this.f24166a).getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.measurement.y2
    public final void j(Object obj, long j10, float f10) {
        ((Unsafe) this.f24166a).putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.measurement.y2
    public final double k(long j10, Object obj) {
        return Double.longBitsToDouble(((Unsafe) this.f24166a).getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.measurement.y2
    public final void l(Object obj, long j10, double d10) {
        ((Unsafe) this.f24166a).putLong(obj, j10, Double.doubleToLongBits(d10));
    }
}
