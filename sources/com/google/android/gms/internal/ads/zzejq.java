package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

/* JADX INFO: loaded from: classes3.dex */
public final class zzejq extends com.google.android.gms.ads.internal.client.zzbt {

    @VisibleForTesting
    final zzfch zza;

    @VisibleForTesting
    final zzdio zzb;
    private final Context zzc;
    private final zzcgx zzd;
    private com.google.android.gms.ads.internal.client.zzbl zze;

    public zzejq(zzcgx zzcgxVar, Context context, String str) {
        zzfch zzfchVar = new zzfch();
        this.zza = zzfchVar;
        this.zzb = new zzdio();
        this.zzd = zzcgxVar;
        zzfchVar.zzt(str);
        this.zzc = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzbr zze() {
        zzdiq zzdiqVarZzg = this.zzb.zzg();
        this.zza.zzE(zzdiqVarZzg.zzi());
        this.zza.zzF(zzdiqVarZzg.zzh());
        zzfch zzfchVar = this.zza;
        if (zzfchVar.zzh() == null) {
            zzfchVar.zzs(com.google.android.gms.ads.internal.client.zzs.zzc());
        }
        return new zzejr(this.zzc, this.zzd, this.zza, zzdiqVarZzg, this.zze);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzf(zzbgu zzbguVar) {
        this.zzb.zza(zzbguVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzg(zzbgx zzbgxVar) {
        this.zzb.zzb(zzbgxVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzh(String str, zzbhd zzbhdVar, @Nullable zzbha zzbhaVar) {
        this.zzb.zzc(str, zzbhdVar, zzbhaVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzi(zzbmi zzbmiVar) {
        this.zzb.zzd(zzbmiVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzj(zzbhh zzbhhVar, com.google.android.gms.ads.internal.client.zzs zzsVar) {
        this.zzb.zze(zzbhhVar);
        this.zza.zzs(zzsVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzk(zzbhk zzbhkVar) {
        this.zzb.zzf(zzbhkVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzl(com.google.android.gms.ads.internal.client.zzbl zzblVar) {
        this.zze = zzblVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zza.zzr(adManagerAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzn(zzblz zzblzVar) {
        this.zza.zzw(zzblzVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzo(zzbfl zzbflVar) {
        this.zza.zzD(zzbflVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) {
        this.zza.zzG(publisherAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzq(com.google.android.gms.ads.internal.client.zzcq zzcqVar) {
        this.zza.zzV(zzcqVar);
    }
}
