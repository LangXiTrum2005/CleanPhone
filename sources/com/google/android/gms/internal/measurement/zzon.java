package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
final class zzon extends zzoo {
    public zzon(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.zzoo
    public final void zza(Object obj, long j, byte b2) {
        if (zzop.zzb) {
            zzop.zzD(obj, j, b2);
        } else {
            zzop.zzE(obj, j, b2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoo
    public final boolean zzb(Object obj, long j) {
        return zzop.zzb ? zzop.zzu(obj, j) : zzop.zzv(obj, j);
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.measurement.zzop.zzw(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.measurement.zzop.zzx(java.lang.Object, long, boolean):void */
    /* JADX WARN: Method inline failed with exception
    java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 2
    	at java.base/java.util.ArrayList.shiftTailOverGap(Unknown Source)
    	at java.base/java.util.ArrayList.removeIf(Unknown Source)
     */
    /* JADX WARN: Unknown register number '(r5v0 boolean)' in method call: com.google.android.gms.internal.measurement.zzop.zzx(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.measurement.zzoo
    public final void zzc(Object obj, long j, boolean z2) {
        if (zzop.zzb) {
            zzop.zzw(obj, j, z2);
        } else {
            zzop.zzx(obj, j, z2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoo
    public final float zzd(Object obj, long j) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.zzoo
    public final void zze(Object obj, long j, float f) {
        this.zza.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.measurement.zzoo
    public final double zzf(Object obj, long j) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.zzoo
    public final void zzg(Object obj, long j, double d) {
        this.zza.putLong(obj, j, Double.doubleToLongBits(d));
    }
}
