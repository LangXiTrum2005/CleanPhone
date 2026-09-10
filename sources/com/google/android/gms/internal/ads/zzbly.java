package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbly {
    private final com.google.android.gms.ads.formats.zze zza;
    private final com.google.android.gms.ads.formats.zzd zzb;
    private zzbkt zzc;

    public zzbly(com.google.android.gms.ads.formats.zze zzeVar, com.google.android.gms.ads.formats.zzd zzdVar) {
        this.zza = zzeVar;
        this.zzb = zzdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final synchronized zzbkt zze(zzbks zzbksVar) {
        zzbkt zzbktVar = this.zzc;
        if (zzbktVar != null) {
            return zzbktVar;
        }
        zzbkt zzbktVar2 = new zzbkt(zzbksVar);
        this.zzc = zzbktVar2;
        return zzbktVar2;
    }

    public final zzblf zza() {
        return new zzblx(this, null);
    }

    public final zzblc zzb() {
        if (this.zzb == null) {
            return null;
        }
        return new zzblw(this, null);
    }

    public final /* synthetic */ com.google.android.gms.ads.formats.zze zzc() {
        return this.zza;
    }

    public final /* synthetic */ com.google.android.gms.ads.formats.zzd zzd() {
        return this.zzb;
    }
}
