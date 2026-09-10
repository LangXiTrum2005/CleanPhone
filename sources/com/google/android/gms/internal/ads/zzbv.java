package com.google.android.gms.internal.ads;

import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbv {
    public static final zzbv zza = new zzbv(0, 0, 1.0f);
    public final int zzb;
    public final int zzc;
    public final float zzd;

    static {
        String str = zzfj.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
    }

    public zzbv(int i2, int i3, float f) {
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbv) {
            zzbv zzbvVar = (zzbv) obj;
            if (this.zzb == zzbvVar.zzb && this.zzc == zzbvVar.zzc && this.zzd == zzbvVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zzb + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE;
        float f = this.zzd;
        return Float.floatToRawIntBits(f) + (((i2 * 31) + this.zzc) * 31);
    }
}
