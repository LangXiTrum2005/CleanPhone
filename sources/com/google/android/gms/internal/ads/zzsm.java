package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzsm {
    private final zzv zza;
    private final zzv zzb;
    private final int zzc;
    private final int zzd;
    private final zzqi zze;
    private final zzck zzf;

    private zzsm(zzv zzvVar, zzv zzvVar2, int i2, int i3, zzqi zzqiVar, zzck zzckVar) {
        this.zza = zzvVar;
        this.zzb = zzvVar2;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = zzqiVar;
        this.zzf = zzckVar;
    }

    public final /* synthetic */ zzsm zza(zzqi zzqiVar) {
        return new zzsm(this.zza, this.zzb, this.zzc, this.zzd, zzqiVar, this.zzf);
    }

    public final /* synthetic */ boolean zzb(zzsm zzsmVar) {
        return zzsmVar.zze.equals(this.zze);
    }

    public final /* synthetic */ long zzc(long j) {
        return zzfj.zzr(j, this.zza.zzH);
    }

    public final /* synthetic */ long zzd(long j) {
        return zzfj.zzr(j, this.zze.zzb);
    }

    public final /* synthetic */ zzqz zze() {
        zzqi zzqiVar = this.zze;
        return new zzqz(zzqiVar.zza, zzqiVar.zzb, zzqiVar.zzc, false, false, zzqiVar.zze);
    }

    public final /* synthetic */ boolean zzf() {
        return Objects.equals(this.zza.zzo, "audio/raw");
    }

    public final /* synthetic */ zzv zzg() {
        return this.zza;
    }

    public final /* synthetic */ zzv zzh() {
        return this.zzb;
    }

    public final /* synthetic */ int zzi() {
        return this.zzc;
    }

    public final /* synthetic */ int zzj() {
        return this.zzd;
    }

    public final /* synthetic */ zzqi zzk() {
        return this.zze;
    }

    public final /* synthetic */ zzck zzl() {
        return this.zzf;
    }

    public /* synthetic */ zzsm(zzv zzvVar, zzv zzvVar2, int i2, int i3, zzqi zzqiVar, zzck zzckVar, byte[] bArr) {
        this(zzvVar, zzvVar2, i2, i3, zzqiVar, zzckVar);
    }
}
