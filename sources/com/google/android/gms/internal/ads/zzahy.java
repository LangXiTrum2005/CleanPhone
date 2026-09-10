package com.google.android.gms.internal.ads;

import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzahy extends zzaig {
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzaig[] zzg;

    public zzahy(String str, int i2, int i3, long j, long j2, zzaig[] zzaigVarArr) {
        super("CHAP");
        this.zza = str;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = j;
        this.zze = j2;
        this.zzg = zzaigVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahy.class == obj.getClass()) {
            zzahy zzahyVar = (zzahy) obj;
            if (this.zzb == zzahyVar.zzb && this.zzc == zzahyVar.zzc && this.zzd == zzahyVar.zzd && this.zze == zzahyVar.zze && Objects.equals(this.zza, zzahyVar.zza) && Arrays.equals(this.zzg, zzahyVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zzb + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        String str = this.zza;
        long j = this.zze;
        return str.hashCode() + (((((((i2 * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + ((int) j)) * 31);
    }
}
