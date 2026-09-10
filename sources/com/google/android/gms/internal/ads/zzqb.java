package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class zzqb {
    private final zzv zza;
    private AudioDeviceInfo zzc;
    private zzd zzb = zzd.zza;
    private int zzd = 0;
    private int zze = -1;
    private int zzf = -1;

    public zzqb(zzv zzvVar) {
        this.zza = zzvVar;
    }

    public final zzqb zza(zzd zzdVar) {
        this.zzb = zzdVar;
        return this;
    }

    public final zzqb zzb(AudioDeviceInfo audioDeviceInfo) {
        this.zzc = audioDeviceInfo;
        return this;
    }

    public final zzqb zzc(int i2) {
        this.zzd = i2;
        return this;
    }

    public final zzqb zzd(int i2) {
        this.zze = i2;
        return this;
    }

    public final zzqb zze(int i2) {
        this.zzf = -1;
        return this;
    }

    public final /* synthetic */ zzv zzf() {
        return this.zza;
    }

    public final /* synthetic */ zzd zzg() {
        return this.zzb;
    }

    public final /* synthetic */ AudioDeviceInfo zzh() {
        return this.zzc;
    }

    public final /* synthetic */ int zzi() {
        return this.zzd;
    }

    public final /* synthetic */ int zzj() {
        return this.zze;
    }

    public final /* synthetic */ int zzk() {
        return this.zzf;
    }
}
