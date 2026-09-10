package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;

/* JADX INFO: loaded from: classes4.dex */
public class zzeok extends zzbte {
    private final zzdai zza;
    private final zzdip zzb;
    private final zzdbc zzc;
    private final zzdbr zzd;
    private final zzdbw zze;
    private final zzdfo zzf;
    private final zzdcv zzg;
    private final zzdjn zzh;
    private final zzdfk zzi;
    private final zzdax zzj;

    public zzeok(zzdai zzdaiVar, zzdip zzdipVar, zzdbc zzdbcVar, zzdbr zzdbrVar, zzdbw zzdbwVar, zzdfo zzdfoVar, zzdcv zzdcvVar, zzdjn zzdjnVar, zzdfk zzdfkVar, zzdax zzdaxVar) {
        this.zza = zzdaiVar;
        this.zzb = zzdipVar;
        this.zzc = zzdbcVar;
        this.zzd = zzdbrVar;
        this.zze = zzdbwVar;
        this.zzf = zzdfoVar;
        this.zzg = zzdcvVar;
        this.zzh = zzdjnVar;
        this.zzi = zzdfkVar;
        this.zzj = zzdaxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zze() {
        this.zza.onAdClicked();
        this.zzb.zzdu();
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzf() {
        this.zzg.zzdT(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzg(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzh() {
        this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzi() {
        this.zzg.zzh();
        this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzj() {
        this.zze.zzg();
    }

    public void zzk() {
        this.zzc.zza();
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzl(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzm(zzbks zzbksVar, String str) {
    }

    public void zzn() {
        this.zzh.zzb();
    }

    public void zzo() {
        this.zzh.zzc();
    }

    public void zzp(zzbzy zzbzyVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzq() {
        this.zzh.zza();
    }

    public void zzr(zzcac zzcacVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    @Deprecated
    public final void zzs(int i2) throws RemoteException {
        zzy(new com.google.android.gms.ads.internal.client.zze(i2, "", AdError.UNDEFINED_DOMAIN, null, null));
    }

    public void zzt() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzu() throws RemoteException {
        this.zzh.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzv(String str) {
        zzy(new com.google.android.gms.ads.internal.client.zze(0, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzw(int i2, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzx(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzy(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzj.zzc(zzfjm.zzc(8, zzeVar));
    }

    public void zzz() throws RemoteException {
    }
}
