package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcxa implements zzdby, com.google.android.gms.ads.internal.client.zza, zzddq, zzdbe, zzdak, zzdgb {
    private final Clock zza;
    private final zzccu zzb;

    public zzcxa(Clock clock, zzccu zzccuVar) {
        this.zza = clock;
        this.zzb = zzccuVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zzd(zzbzm zzbzmVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zzdJ() {
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzdO(zzbza zzbzaVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzdP(zzfic zzficVar) {
        this.zzb.zzd(this.zza.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzdbe
    public final void zzdr() {
        this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zzds() {
        this.zzb.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zzdt() {
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdby
    public final void zzg() {
        this.zzb.zzh(true);
    }

    public final void zzi(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zzb.zza(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdgb
    public final void zzj(zzbfp.zzb zzbVar) {
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzdgb
    public final void zzk(zzbfp.zzb zzbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgb
    public final void zzl(zzbfp.zzb zzbVar) {
        this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdgb
    public final void zzm(boolean z2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgb
    public final void zzn(boolean z2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgb
    public final void zzo() {
    }

    public final String zzp() {
        return this.zzb.zzj();
    }
}
