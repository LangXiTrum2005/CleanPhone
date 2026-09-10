package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzxf implements Comparable {
    private final boolean zza;
    private final boolean zzb;

    public zzxf(zzab zzabVar, int i) {
        this.zza = 1 == (zzabVar.zze & 1);
        this.zzb = zzlk.zza(i, false);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzxf zzxfVar) {
        return zzfxc.zzj().zzd(this.zzb, zzxfVar.zzb).zzd(this.zza, zzxfVar.zza).zza();
    }
}
