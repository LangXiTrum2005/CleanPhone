package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
final class zzidk extends zzidl {
    public zzidk(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final void zza(Object obj, long j, byte b2) {
        if (zzidm.zzb) {
            zzidm.zzG(obj, j, b2);
        } else {
            zzidm.zzH(obj, j, b2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final boolean zzb(Object obj, long j) {
        return zzidm.zzb ? zzidm.zzx(obj, j) : zzidm.zzy(obj, j);
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.ads.zzidm.zzA(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.ads.zzidm.zzz(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z2' boolean)' in method call: com.google.android.gms.internal.ads.zzidm.zzA(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z2' boolean)' in method call: com.google.android.gms.internal.ads.zzidm.zzz(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.ads.zzidl
    public final void zzc(Object obj, long j, boolean z2) {
        if (zzidm.zzb) {
            zzidm.zzz(obj, j, z2);
        } else {
            zzidm.zzA(obj, j, z2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final float zzd(Object obj, long j) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final void zze(Object obj, long j, float f) {
        this.zza.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final double zzf(Object obj, long j) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final void zzg(Object obj, long j, double d) {
        this.zza.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final byte zzh(long j) {
        return Memory.peekByte(j);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final void zzi(long j, byte[] bArr, long j2, long j3) {
        Memory.peekByteArray(j, bArr, (int) j2, (int) j3);
    }
}
