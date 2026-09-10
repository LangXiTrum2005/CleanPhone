package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzkj {
    public final long zza;
    public final float zzb;
    public final long zzc;

    public /* synthetic */ zzkj(zzkh zzkhVar, zzki zzkiVar) {
        this.zza = zzkhVar.zza;
        this.zzb = zzkhVar.zzb;
        this.zzc = zzkhVar.zzc;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzkj)) {
            return false;
        }
        zzkj zzkjVar = (zzkj) obj;
        return this.zza == zzkjVar.zza && this.zzb == zzkjVar.zzb && this.zzc == zzkjVar.zzc;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), Float.valueOf(this.zzb), Long.valueOf(this.zzc)});
    }

    public final zzkh zza() {
        return new zzkh(this, null);
    }
}
