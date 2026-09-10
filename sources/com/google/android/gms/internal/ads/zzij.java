package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzij implements zzmi, zzmk {
    private final int zzb;
    private zzml zzd;
    private int zze;
    private zzpn zzf;
    private zzdn zzg;
    private int zzh;
    private zzxw zzi;
    private zzv[] zzj;
    private long zzk;
    private long zzl;
    private boolean zzn;
    private boolean zzo;
    private zzwg zzq;
    private zzmj zzr;
    private final Object zza = new Object();
    private final zzle zzc = new zzle();
    private long zzm = Long.MIN_VALUE;
    private zzbf zzp = zzbf.zza;

    public zzij(int i2) {
        this.zzb = i2;
    }

    private final void zzac(long j, boolean z2, boolean z3) throws zzit {
        this.zzn = false;
        this.zzl = j;
        this.zzm = j;
        if (!z3) {
            z3 = zzP(j) != 0;
        }
        zzA(j, z2, z3);
    }

    public void zzA(long j, boolean z2, boolean z3) throws zzit {
        throw null;
    }

    public void zzB() throws zzit {
    }

    public void zzC() {
    }

    public void zzD() {
        throw null;
    }

    public void zzE() {
    }

    public void zzF() {
    }

    public final long zzG() {
        return this.zzl;
    }

    public final zzle zzH() {
        zzle zzleVar = this.zzc;
        zzleVar.zza = null;
        zzleVar.zzb = null;
        return zzleVar;
    }

    public final zzv[] zzI() {
        zzv[] zzvVarArr = this.zzj;
        zzvVarArr.getClass();
        return zzvVarArr;
    }

    public final zzml zzJ() {
        zzml zzmlVar = this.zzd;
        zzmlVar.getClass();
        return zzmlVar;
    }

    public final zzpn zzK() {
        zzpn zzpnVar = this.zzf;
        zzpnVar.getClass();
        return zzpnVar;
    }

    public final zzdn zzL() {
        zzdn zzdnVar = this.zzg;
        zzdnVar.getClass();
        return zzdnVar;
    }

    public final zzbf zzM() {
        return this.zzp;
    }

    public final zzit zzN(Throwable th, zzv zzvVar, boolean z2, int i2) {
        int iZzab = 4;
        if (zzvVar != null && !this.zzo) {
            this.zzo = true;
            try {
                iZzab = zzab(zzvVar) & 7;
            } catch (zzit unused) {
            } finally {
                this.zzo = false;
            }
        }
        return zzit.zzb(th, zzS(), this.zze, zzvVar, iZzab, this.zzq, z2, i2);
    }

    public final int zzO(zzle zzleVar, zzih zzihVar, int i2) {
        zzxw zzxwVar = this.zzi;
        zzxwVar.getClass();
        int iZzd = zzxwVar.zzd(zzleVar, zzihVar, i2);
        if (iZzd == -4) {
            if (zzihVar.zzb()) {
                this.zzm = Long.MIN_VALUE;
                return this.zzn ? -4 : -3;
            }
            long j = zzihVar.zze + this.zzk;
            zzihVar.zze = j;
            this.zzm = Math.max(this.zzm, j);
            return iZzd;
        }
        if (iZzd == -5) {
            zzv zzvVar = zzleVar.zzb;
            zzvVar.getClass();
            long j2 = zzvVar.zzt;
            if (j2 != Long.MAX_VALUE) {
                zzt zztVarZza = zzvVar.zza();
                zztVarZza.zzr(j2 + this.zzk);
                zzleVar.zzb = zztVarZza.zzM();
                return -5;
            }
        }
        return iZzd;
    }

    public final int zzP(long j) {
        zzxw zzxwVar = this.zzi;
        zzxwVar.getClass();
        return zzxwVar.zze(j - this.zzk);
    }

    public final boolean zzQ() {
        if (zzcW()) {
            return this.zzn;
        }
        zzxw zzxwVar = this.zzi;
        zzxwVar.getClass();
        return zzxwVar.zzb();
    }

    public final void zzR() {
        zzmj zzmjVar;
        synchronized (this.zza) {
            zzmjVar = this.zzr;
        }
        if (zzmjVar != null) {
            zzmjVar.zza(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmi, com.google.android.gms.internal.ads.zzmk
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final zzmk zzb() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zzc(int i2, zzpn zzpnVar, zzdn zzdnVar) {
        this.zze = i2;
        this.zzf = zzpnVar;
        this.zzg = zzdnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zzcT() throws zzit {
        zzgqa.zzi(this.zzh == 1);
        this.zzh = 2;
        zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zzcU(zzv[] zzvVarArr, zzxw zzxwVar, long j, long j2, zzwg zzwgVar) throws zzit {
        zzgqa.zzi(!this.zzn);
        this.zzi = zzxwVar;
        this.zzq = zzwgVar;
        if (this.zzm == Long.MIN_VALUE) {
            this.zzm = j;
        }
        this.zzj = zzvVarArr;
        this.zzk = j2;
        zzz(zzvVarArr, j, j2, zzwgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final zzxw zzcV() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final boolean zzcW() {
        return this.zzm == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public zzlj zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final int zze() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zzf(zzml zzmlVar, zzv[] zzvVarArr, zzxw zzxwVar, long j, boolean z2, boolean z3, long j2, long j3, zzwg zzwgVar) throws zzit {
        zzgqa.zzi(this.zzh == 0);
        this.zzd = zzmlVar;
        this.zzq = zzwgVar;
        this.zzh = 1;
        zzy(z2, z3);
        zzcU(zzvVarArr, zzxwVar, j2, j3, zzwgVar);
        zzac(j2, z2, true);
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final long zzk() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zzl() {
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final boolean zzm() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zzn() throws IOException {
        zzxw zzxwVar = this.zzi;
        zzxwVar.getClass();
        zzxwVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zzo(zzbf zzbfVar) {
        if (Objects.equals(this.zzp, zzbfVar)) {
            return;
        }
        this.zzp = zzbfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zzp(long j, boolean z2) throws zzit {
        zzac(j, false, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zzq() {
        zzgqa.zzi(this.zzh == 2);
        this.zzh = 1;
        zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zzr() {
        zzgqa.zzi(this.zzh == 1);
        zzle zzleVar = this.zzc;
        zzleVar.zza = null;
        zzleVar.zzb = null;
        this.zzh = 0;
        this.zzi = null;
        this.zzj = null;
        this.zzn = false;
        zzD();
        this.zzq = null;
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zzs() {
        zzgqa.zzi(this.zzh == 0);
        zzle zzleVar = this.zzc;
        zzleVar.zza = null;
        zzleVar.zzb = null;
        zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zzt() {
        zzgqa.zzi(this.zzh == 0);
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzmk
    public int zzu() throws zzit {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzmk
    public final void zzv(zzmj zzmjVar) {
        synchronized (this.zza) {
            this.zzr = zzmjVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmk
    public final void zzw() {
        synchronized (this.zza) {
            this.zzr = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public void zzx(int i2, Object obj) throws zzit {
    }

    public void zzy(boolean z2, boolean z3) throws zzit {
    }

    public void zzz(zzv[] zzvVarArr, long j, long j2, zzwg zzwgVar) throws zzit {
    }
}
