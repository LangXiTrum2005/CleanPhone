package com.google.android.gms.internal.ads;

import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class zzabn implements zzadl {
    private final zzacm zza;
    private final zzacn zzb;
    private final zzacu zzc;
    private final Queue zzd;
    private Surface zze;
    private zzv zzf;
    private long zzg;
    private zzadi zzh;
    private Executor zzi;
    private zzacj zzj;

    public zzabn(zzacm zzacmVar, zzacn zzacnVar, zzdn zzdnVar) {
        this.zza = zzacmVar;
        this.zzb = zzacnVar;
        zzacmVar.zzg(zzdnVar);
        this.zzc = new zzacu(new zzabm(this, null), zzacmVar, zzacnVar);
        this.zzd = new ArrayDeque();
        this.zzf = new zzt().zzM();
        this.zzg = -9223372036854775807L;
        this.zzh = zzadi.zzb;
        this.zzi = zzabi.zza;
        this.zzj = zzabg.zza;
    }

    public final /* synthetic */ Surface zzA() {
        return this.zze;
    }

    public final /* synthetic */ zzadi zzB() {
        return this.zzh;
    }

    public final /* synthetic */ Executor zzC() {
        return this.zzi;
    }

    public final /* synthetic */ zzacj zzD() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final void zza() {
        this.zzb.zzd();
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final void zzb() {
        this.zzb.zzd();
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final void zzc(zzadi zzadiVar, Executor executor) {
        this.zzh = zzadiVar;
        this.zzi = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final boolean zzd(zzv zzvVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final void zzf() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final void zzg(boolean z2) {
        if (z2) {
            this.zza.zzl();
        }
        this.zzb.zzd();
        this.zzc.zza();
        this.zzd.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final boolean zzh(boolean z2) {
        return this.zza.zzi(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final void zzi() {
        this.zzc.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final boolean zzj() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final Surface zzk() {
        Surface surface = this.zze;
        surface.getClass();
        return surface;
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final void zzl(zzacj zzacjVar) {
        this.zzj = zzacjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final void zzm(float f) {
        this.zza.zzn(f);
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final void zzn(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final void zzo(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final void zzp(Surface surface, zzes zzesVar) {
        this.zze = surface;
        this.zza.zzd(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final void zzq() {
        this.zze = null;
        this.zza.zzd(null);
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final void zzr(int i2) {
        this.zza.zzm(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final void zzs(int i2, zzv zzvVar, long j, int i3, List list) {
        zzgqa.zzi(list.isEmpty());
        int i4 = zzvVar.zzv;
        zzv zzvVar2 = this.zzf;
        if (i4 != zzvVar2.zzv || zzvVar.zzw != zzvVar2.zzw) {
            this.zzc.zzc(i4, zzvVar.zzw);
        }
        float f = zzvVar.zzz;
        if (f != this.zzf.zzz) {
            this.zza.zze(f);
        }
        this.zzf = zzvVar;
        if (j != this.zzg) {
            this.zzc.zzd(i3, j);
            this.zzg = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final void zzt() {
        this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final boolean zzu(long j, zzadj zzadjVar) {
        this.zzd.add(zzadjVar);
        this.zzc.zze(j);
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabh
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzy();
            }
        });
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final void zzv(long j, long j2) throws zzadk {
        try {
            this.zzc.zzb(j, j2);
        } catch (zzit e2) {
            throw new zzadk(e2, this.zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final void zzw(boolean z2) {
        this.zza.zzj(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final void zzx() {
    }

    public final /* synthetic */ void zzy() {
        this.zzh.zza();
    }

    public final /* synthetic */ Queue zzz() {
        return this.zzd;
    }
}
