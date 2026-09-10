package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.view.Surface;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class zzms extends zzf implements zzje {
    private final zzkp zzb;
    private final zzdq zzc;

    public zzms(zzjc zzjcVar) {
        zzdq zzdqVar = new zzdq(zzdn.zza);
        this.zzc = zzdqVar;
        try {
            this.zzb = new zzkp(zzjcVar, this);
            zzdqVar.zza();
        } catch (Throwable th) {
            this.zzc.zza();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzA() {
        this.zzc.zzd();
        return this.zzb.zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzB(float f) {
        this.zzc.zzd();
        this.zzb.zzB(f);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzC(Surface surface) {
        this.zzc.zzd();
        this.zzb.zzC(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzje
    public final void zzD(zzmx zzmxVar) {
        this.zzc.zzd();
        this.zzb.zzD(zzmxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzje
    public final void zzE(zzmx zzmxVar) {
        this.zzc.zzd();
        this.zzb.zzE(zzmxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzje
    public final int zzF() {
        this.zzc.zzd();
        this.zzb.zzF();
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzje
    public final void zzG(zzwi zzwiVar) {
        this.zzc.zzd();
        this.zzb.zzG(zzwiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzje
    public final void zzH() {
        this.zzc.zzd();
        this.zzb.zzH();
    }

    public final zzit zzI() {
        this.zzc.zzd();
        return this.zzb.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzf
    public final void zzc(int i2, long j, int i3, boolean z2) {
        this.zzc.zzd();
        this.zzb.zzc(i2, j, 5, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final Looper zzd() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zze(zzaz zzazVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzf(zzaz zzazVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzg() {
        this.zzc.zzd();
        this.zzb.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzh() {
        this.zzc.zzd();
        return this.zzb.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzi() {
        this.zzc.zzd();
        return this.zzb.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzj(boolean z2) {
        this.zzc.zzd();
        this.zzb.zzj(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzk() {
        this.zzc.zzd();
        return this.zzb.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzl() {
        this.zzc.zzd();
        this.zzb.zzl();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzm() {
        this.zzc.zzd();
        this.zzb.zzm();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzav zzn() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzo() {
        this.zzc.zzd();
        this.zzb.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzbn zzp() {
        this.zzc.zzd();
        return this.zzb.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzbf zzq() {
        this.zzc.zzd();
        return this.zzb.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzr() {
        this.zzc.zzd();
        return this.zzb.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzs() {
        this.zzc.zzd();
        return this.zzb.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzt() {
        this.zzc.zzd();
        return this.zzb.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzu() {
        this.zzc.zzd();
        return this.zzb.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzv() {
        this.zzc.zzd();
        return this.zzb.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzw() {
        this.zzc.zzd();
        return this.zzb.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzx() {
        this.zzc.zzd();
        return this.zzb.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzy() {
        this.zzc.zzd();
        return this.zzb.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzz() {
        this.zzc.zzd();
        return this.zzb.zzz();
    }
}
