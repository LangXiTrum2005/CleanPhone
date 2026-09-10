package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.p004ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes4.dex */
public final class zzil {
    public final String zza;
    public final zzv zzb;
    public final zzv zzc;
    public final int zzd;
    public final int zze;

    public zzil(String str, zzv zzvVar, zzv zzvVar2, int i2, int i3) {
        boolean z2;
        if (i2 != 0) {
            z2 = false;
            if (i3 == 0) {
                i3 = 0;
                z2 = true;
            }
        } else {
            z2 = true;
        }
        zzgqa.zza(z2);
        zzgqa.zza(true ^ TextUtils.isEmpty(str));
        this.zza = str;
        this.zzb = zzvVar;
        zzvVar2.getClass();
        this.zzc = zzvVar2;
        this.zzd = i2;
        this.zze = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzil.class == obj.getClass()) {
            zzil zzilVar = (zzil) obj;
            if (this.zzd == zzilVar.zzd && this.zze == zzilVar.zze && this.zza.equals(zzilVar.zza) && this.zzb.equals(zzilVar.zzb) && this.zzc.equals(zzilVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zzd + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        String str = this.zza;
        int iHashCode = str.hashCode() + (((i2 * 31) + this.zze) * 31);
        int iHashCode2 = this.zzb.hashCode() + (iHashCode * 31);
        return this.zzc.hashCode() + (iHashCode2 * 31);
    }
}
