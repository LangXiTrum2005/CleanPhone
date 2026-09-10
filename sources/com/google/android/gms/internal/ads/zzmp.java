package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzmp {
    public static final zzmp zza = new zzmp(new zzmo());
    public final zzgtn zzb;
    public final Double zzc = null;
    public final Double zzd = null;
    public final boolean zze = true;
    public final boolean zzf = true;
    public final boolean zzi = true;
    public final boolean zzg = true;
    public final boolean zzh = true;

    private zzmp(zzmo zzmoVar) {
        this.zzb = zzmoVar.zza();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzmp) && this.zzb.equals(((zzmp) obj).zzb);
    }

    public final int hashCode() {
        zzgtn zzgtnVar = this.zzb;
        Boolean bool = Boolean.TRUE;
        return Objects.hash(zzgtnVar, null, null, bool, bool, bool, bool, bool);
    }
}
