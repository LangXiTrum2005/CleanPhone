package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzlc implements Handler.Callback, zzwd, zzaac, zzly, zziq, zzmc, zzcc, zzacj {
    private static final long zza = zzfj.zzp(10000);
    private zzmq zzA;
    private boolean zzC;
    private boolean zzD;
    private zzlb zzE;
    private int zzF;
    private zzma zzG;
    private zzkz zzH;
    private boolean zzI;
    private boolean zzK;
    private boolean zzL;
    private boolean zzN;
    private boolean zzQ;
    private int zzR;
    private zzlb zzS;
    private long zzT;
    private long zzU;
    private int zzV;
    private boolean zzW;
    private zzit zzX;
    private zzjd zzZ;
    private boolean zzab;
    private final zzim zzad;
    private final zzmm[] zzb;
    private final zzmk[] zzc;
    private final boolean[] zzd;
    private final zzaad zze;
    private final zzaae zzf;
    private final zzlg zzg;
    private final zzaam zzh;
    private final zzdx zzi;
    private final zzmb zzj;
    private final Looper zzk;
    private final zzbe zzl;
    private final zzbd zzm;
    private final long zzn;
    private final zzir zzo;
    private final ArrayList zzp;
    private final zzdn zzq;
    private final zzla zzr;
    private final zzln zzs;
    private final zzlz zzt;
    private final long zzu;
    private final zzpn zzv;
    private final zzmu zzw;
    private final zzdx zzx;
    private final boolean zzy;
    private final zzcd zzz;
    private long zzaa = -9223372036854775807L;
    private int zzO = 0;
    private boolean zzP = false;
    private boolean zzJ = false;
    private float zzac = 1.0f;
    private zzmp zzB = zzmp.zza;
    private long zzY = -9223372036854775807L;
    private long zzM = -9223372036854775807L;

    public zzlc(Context context, zzmi[] zzmiVarArr, zzmi[] zzmiVarArr2, zzaad zzaadVar, zzaae zzaaeVar, zzlg zzlgVar, zzaam zzaamVar, int i2, boolean z2, zzmu zzmuVar, zzmq zzmqVar, zzim zzimVar, long j, boolean z3, boolean z4, Looper looper, zzdn zzdnVar, zzla zzlaVar, zzpn zzpnVar, zzmb zzmbVar, zzjd zzjdVar, final zzacj zzacjVar) {
        this.zzr = zzlaVar;
        this.zze = zzaadVar;
        this.zzf = zzaaeVar;
        this.zzg = zzlgVar;
        this.zzh = zzaamVar;
        int i3 = 0;
        this.zzA = zzmqVar;
        this.zzad = zzimVar;
        this.zzu = j;
        this.zzq = zzdnVar;
        this.zzv = zzpnVar;
        this.zzZ = zzjdVar;
        this.zzw = zzmuVar;
        this.zzn = zzlgVar.zzf(zzpnVar);
        zzlgVar.zzg(zzpnVar);
        zzbf zzbfVar = zzbf.zza;
        zzma zzmaVarZza = zzma.zza(zzaaeVar);
        this.zzG = zzmaVarZza;
        this.zzH = new zzkz(zzmaVarZza);
        int length = zzmiVarArr.length;
        this.zzc = new zzmk[2];
        this.zzd = new boolean[2];
        zzmj zzmjVarZzg = zzaadVar.zzg();
        this.zzb = new zzmm[2];
        boolean z5 = false;
        for (int i4 = 2; i3 < i4; i4 = 2) {
            zzmiVarArr[i3].zzc(i3, zzpnVar, zzdnVar);
            this.zzc[i3] = zzmiVarArr[i3].zzb();
            this.zzc[i3].zzv(zzmjVarZzg);
            zzmi zzmiVar = zzmiVarArr2[i3];
            if (zzmiVar != null) {
                zzmiVar.zzc(i3, zzpnVar, zzdnVar);
                z5 = true;
            }
            this.zzb[i3] = new zzmm(zzmiVarArr[i3], zzmiVarArr2[i3], i3);
            i3++;
        }
        this.zzy = z5;
        this.zzo = new zzir(this, zzdnVar);
        this.zzp = new ArrayList();
        this.zzl = new zzbe();
        this.zzm = new zzbd();
        zzaadVar.zzr(this, zzaamVar);
        this.zzW = true;
        zzdx zzdxVarZzd = zzdnVar.zzd(looper, null);
        this.zzx = zzdxVarZzd;
        this.zzs = new zzln(zzmuVar, zzdxVarZzd, new zzkv(this), zzjdVar);
        this.zzt = new zzlz(this, zzmuVar, zzdxVarZzd, zzpnVar);
        zzmb zzmbVar2 = new zzmb(null);
        this.zzj = zzmbVar2;
        Looper looperZza = zzmbVar2.zza();
        this.zzk = looperZza;
        zzdx zzdxVarZzd2 = zzdnVar.zzd(looperZza, this);
        this.zzi = zzdxVarZzd2;
        this.zzz = new zzcd(context, looperZza, this);
        zzdxVarZzd2.zzd(35, new zzacj() { // from class: com.google.android.gms.internal.ads.zzkr
            @Override // com.google.android.gms.internal.ads.zzacj
            public final /* synthetic */ void zzcS(long j2, long j3, zzv zzvVar, MediaFormat mediaFormat) {
                this.zza.zzcS(j2, j3, zzvVar, mediaFormat);
            }
        }).zza();
    }

    private final void zzA(IOException iOException, int i2) {
        zzln zzlnVar = this.zzs;
        zzit zzitVarZza = zzit.zza(iOException, i2);
        zzlk zzlkVarZzm = zzlnVar.zzm();
        if (zzlkVarZzm != null) {
            zzitVarZza = zzitVarZza.zzd(zzlkVarZzm.zzg.zza);
        }
        zzee.zzf("ExoPlayerImplInternal", "Playback error", zzitVarZza);
        zzW(false, false);
        this.zzG = this.zzG.zzf(zzitVarZza);
    }

    private final void zzB(int i2) {
        zzma zzmaVar = this.zzG;
        if (zzmaVar.zze != i2) {
            if (i2 != 2) {
                this.zzY = -9223372036854775807L;
            }
            this.zzG = zzmaVar.zze(i2);
        }
    }

    private final void zzC() {
        this.zzH.zzb(this.zzG);
        if (this.zzH.zzd()) {
            this.zzr.zza(this.zzH);
            this.zzH = new zzkz(this.zzG);
        }
    }

    private final void zzD(float f) throws zzit {
        this.zzac = f;
        float fZza = this.zzz.zza() * f;
        int i2 = 0;
        while (true) {
            zzmm[] zzmmVarArr = this.zzb;
            if (i2 >= 2) {
                return;
            }
            zzmmVarArr[i2].zzL(fZza);
            i2++;
        }
    }

    private final void zzE(boolean z2, int i2, boolean z3, int i3) throws zzit {
        this.zzH.zza(z3 ? 1 : 0);
        zzG(z2, i2, i3);
    }

    private final void zzF() throws zzit {
        zzma zzmaVar = this.zzG;
        zzG(zzmaVar.zzl, zzmaVar.zzn, zzmaVar.zzm);
    }

    private final void zzG(boolean z2, int i2, int i3) throws zzit {
        zzH(z2, this.zzz.zzc(z2, this.zzG.zze), i2, i3);
    }

    private final void zzH(boolean z2, int i2, int i3, int i4) throws zzit {
        boolean z3;
        if (!z2) {
            z3 = false;
        } else if (i2 != -1) {
            z3 = true;
        } else {
            i2 = -1;
            z3 = false;
        }
        if (i2 == -1) {
            i4 = 2;
        } else if (i4 == 2) {
            i4 = 1;
        }
        boolean z4 = this.zzC;
        if (i2 == 0) {
            i3 = 1;
        } else if (i3 == 1) {
            i3 = z4 ? 4 : 0;
        }
        zzma zzmaVar = this.zzG;
        if (zzmaVar.zzl == z3 && zzmaVar.zzn == i3 && zzmaVar.zzm == i4) {
            return;
        }
        this.zzG = zzmaVar.zzi(z3, i4, i3);
        zzaC(false, false);
        zzln zzlnVar = this.zzs;
        for (zzlk zzlkVarZzm = zzlnVar.zzm(); zzlkVarZzm != null; zzlkVarZzm = zzlkVarZzm.zzp()) {
            for (zzzw zzzwVar : zzlkVarZzm.zzr().zzc) {
            }
        }
        if (!zzax()) {
            zzK();
            zzL();
            boolean z5 = this.zzG.zzp;
            zzlnVar.zzf(this.zzT);
            return;
        }
        int i5 = this.zzG.zze;
        if (i5 == 3) {
            this.zzo.zza();
            zzJ();
            this.zzi.zzh(2);
        } else if (i5 == 2) {
            this.zzi.zzh(2);
        }
    }

    private final void zzI(boolean z2) throws zzit {
        zzwg zzwgVar = this.zzs.zzm().zzg.zza;
        long jZzT = zzT(zzwgVar, this.zzG.zzs, true, false);
        if (jZzT != this.zzG.zzs) {
            zzma zzmaVar = this.zzG;
            this.zzG = zzao(zzwgVar, jZzT, zzmaVar.zzc, zzmaVar.zzd, z2, 5);
        }
    }

    private final void zzJ() throws zzit {
        zzlk zzlkVarZzm = this.zzs.zzm();
        if (zzlkVarZzm == null) {
            return;
        }
        zzaae zzaaeVarZzr = zzlkVarZzm.zzr();
        int i2 = 0;
        while (true) {
            zzmm[] zzmmVarArr = this.zzb;
            if (i2 >= 2) {
                return;
            }
            if (zzaaeVarZzr.zza(i2)) {
                zzmmVarArr[i2].zzv();
            }
            i2++;
        }
    }

    private final void zzK() throws zzit {
        this.zzo.zzb();
        int i2 = 0;
        while (true) {
            zzmm[] zzmmVarArr = this.zzb;
            if (i2 >= 2) {
                return;
            }
            zzmmVarArr[i2].zzw();
            i2++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a9, code lost:
    
        r13 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzL() throws com.google.android.gms.internal.ads.zzit {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlc.zzL():void");
    }

    private final void zzM(zzav zzavVar) {
        this.zzi.zzk(16);
        this.zzo.zzi(zzavVar);
    }

    private final void zzN(final int i2, final boolean z2) {
        boolean[] zArr = this.zzd;
        if (zArr[i2] != z2) {
            zArr[i2] = z2;
            this.zzx.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzks
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzu(i2, z2);
                }
            });
        }
    }

    private final long zzO(zzbf zzbfVar, Object obj, long j) {
        int i2 = zzbfVar.zzo(obj, this.zzm).zzc;
        zzbe zzbeVar = this.zzl;
        zzbfVar.zzb(i2, zzbeVar, 0L);
        if (zzbeVar.zzf == -9223372036854775807L || !zzbeVar.zzb() || !zzbeVar.zzi) {
            return -9223372036854775807L;
        }
        long j2 = zzbeVar.zzg;
        String str = zzfj.zza;
        return zzfj.zzq((j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime()) - zzbeVar.zzf) - j;
    }

    private final boolean zzP(zzbf zzbfVar, zzwg zzwgVar) {
        if (!zzwgVar.zzb() && !zzbfVar.zzg()) {
            int i2 = zzbfVar.zzo(zzwgVar.zza, this.zzm).zzc;
            zzbe zzbeVar = this.zzl;
            zzbfVar.zzb(i2, zzbeVar, 0L);
            if (zzbeVar.zzb() && zzbeVar.zzi && zzbeVar.zzf != -9223372036854775807L) {
                return true;
            }
        }
        return false;
    }

    private final void zzQ(long j) {
        long jMin = 1000;
        if (zzw()) {
            jMin = this.zzG.zze != 3 ? zza : 1000L;
            zzmm[] zzmmVarArr = this.zzb;
            for (int i2 = 0; i2 < 2; i2++) {
                jMin = Math.min(jMin, zzfj.zzp(zzmmVarArr[i2].zzk(this.zzT, this.zzU)));
            }
            if (this.zzG.zzj()) {
                zzln zzlnVar = this.zzs;
                zzlk zzlkVarZzp = zzlnVar.zzm() != null ? zzlnVar.zzm().zzp() : null;
                if (zzlkVarZzp != null) {
                    if (this.zzT + (zzfj.zzq(jMin) * this.zzG.zzo.zzb) >= zzlkVarZzp.zzc()) {
                        jMin = Math.min(jMin, zza);
                    }
                }
            }
        } else if (this.zzG.zze != 3 || zzax()) {
            jMin = zza;
        }
        this.zzi.zzj(2, j + jMin);
    }

    private final void zzR(zzlb zzlbVar, boolean z2) throws Throwable {
        long jLongValue;
        long j;
        long j2;
        boolean z3;
        zzwg zzwgVar;
        zzwg zzwgVar2;
        boolean z4;
        long j3;
        long jZzk;
        long jZzS;
        zzma zzmaVar;
        zzbf zzbfVar;
        zzwg zzwgVar3;
        long j4;
        zzwg zzwgVar4;
        long j5;
        long j6;
        zzma zzmaVar2;
        int i2;
        this.zzH.zza(z2 ? 1 : 0);
        if (this.zzD) {
            if (this.zzE != null) {
                this.zzF++;
            }
            this.zzE = zzlbVar;
            return;
        }
        zzbf zzbfVar2 = this.zzG.zza;
        int i3 = this.zzO;
        boolean z5 = this.zzP;
        zzbe zzbeVar = this.zzl;
        zzbd zzbdVar = this.zzm;
        Pair pairZzaD = zzaD(zzbfVar2, zzlbVar, true, i3, z5, zzbeVar, zzbdVar);
        if (pairZzaD == null) {
            Pair pairZzY = zzY(this.zzG.zza);
            zzwgVar = (zzwg) pairZzY.first;
            jLongValue = ((Long) pairZzY.second).longValue();
            z3 = !this.zzG.zza.zzg();
            j = -9223372036854775807L;
            j2 = 0;
        } else {
            Object obj = pairZzaD.first;
            jLongValue = ((Long) pairZzaD.second).longValue();
            long j7 = zzlbVar.zzc;
            j = j7 == -9223372036854775807L ? -9223372036854775807L : jLongValue;
            j2 = 0;
            zzwg zzwgVarZzy = this.zzs.zzy(this.zzG.zza, obj, jLongValue);
            if (zzwgVarZzy.zzb()) {
                this.zzG.zza.zzo(zzwgVarZzy.zza, zzbdVar);
                if (zzbdVar.zzd(zzwgVarZzy.zzb) == zzwgVarZzy.zzc) {
                    zzbdVar.zzj();
                }
                zzwgVar = zzwgVarZzy;
                z3 = true;
                jLongValue = 0;
            } else {
                z3 = j7 == -9223372036854775807L;
                zzwgVar = zzwgVarZzy;
            }
        }
        try {
            if (this.zzG.zza.zzg()) {
                this.zzS = zzlbVar;
            } else if (pairZzaD == null) {
                if (this.zzG.zze != 1) {
                    zzB(4);
                }
                zzX(false, true, false, true);
            } else {
                try {
                    try {
                        if (zzwgVar.equals(this.zzG.zzb)) {
                            zzlk zzlkVarZzm = this.zzs.zzm();
                            if (zzlkVarZzm == null || !zzlkVarZzm.zze || jLongValue == j2) {
                                jZzk = jLongValue;
                            } else {
                                zzwe zzweVar = zzlkVarZzm.zza;
                                long j8 = zzbeVar.zzm;
                                if (this.zzC && j8 != -9223372036854775807L) {
                                    Double d = this.zzB.zzc;
                                }
                                jZzk = zzweVar.zzk(jLongValue, this.zzA);
                            }
                            if (zzfj.zzp(jZzk) == zzfj.zzp(this.zzG.zzs) && ((i2 = (zzmaVar2 = this.zzG).zze) == 2 || i2 == 3)) {
                                jLongValue = zzmaVar2.zzs;
                            }
                            this.zzG = zzao(zzwgVar4, j6, j5, j6, z4, 2);
                        }
                        jZzk = jLongValue;
                        zzag(zzbfVar, zzwgVar3, zzbfVar, zzmaVar.zzb, j4, true);
                        zzwgVar4 = zzwgVar3;
                        j5 = j4;
                        j6 = jZzS;
                        this.zzG = zzao(zzwgVar4, j6, j5, j6, z4, 2);
                    } catch (Throwable th) {
                        th = th;
                        zzwgVar2 = zzwgVar3;
                        j = j4;
                        j3 = jZzS;
                        this.zzG = zzao(zzwgVar2, j3, j, j3, z4, 2);
                        throw th;
                    }
                    zzmaVar = this.zzG;
                    zzbfVar = zzmaVar.zza;
                    zzwgVar3 = zzwgVar;
                    j4 = j;
                } catch (Throwable th2) {
                    th = th2;
                    zzwgVar2 = zzwgVar;
                }
                if (this.zzC) {
                    zzmm[] zzmmVarArr = this.zzb;
                    for (int i4 = 0; i4 < 2; i4++) {
                        zzmm zzmmVar = zzmmVarArr[i4];
                        if (zzmmVar.zzM() && zzmmVar.zze() == 2) {
                            this.zzD = true;
                            break;
                        }
                    }
                }
                jZzS = zzS(zzwgVar, jZzk, this.zzG.zze == 4);
                z4 = (jLongValue != jZzS) | z3;
            }
            z4 = z3;
            zzwgVar4 = zzwgVar;
            j6 = jLongValue;
            j5 = j;
            this.zzG = zzao(zzwgVar4, j6, j5, j6, z4, 2);
        } catch (Throwable th3) {
            th = th3;
            zzwgVar2 = zzwgVar;
            z4 = z3;
            j3 = jLongValue;
        }
    }

    private final long zzS(zzwg zzwgVar, long j, boolean z2) throws zzit {
        zzln zzlnVar = this.zzs;
        return zzT(zzwgVar, j, zzlnVar.zzm() != zzlnVar.zzn(), z2);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00c6  */
    private final long zzT(zzwg zzwgVar, long j, boolean z2, boolean z3) throws zzit {
        zzK();
        boolean z4 = true;
        zzaC(false, true);
        if (z3 || this.zzG.zze == 3) {
            zzB(2);
        }
        zzln zzlnVar = this.zzs;
        zzlk zzlkVarZzm = zzlnVar.zzm();
        zzlk zzlkVarZzp = zzlkVarZzm;
        while (zzlkVarZzp != null && !zzwgVar.equals(zzlkVarZzp.zzg.zza)) {
            zzlkVarZzp = zzlkVarZzp.zzp();
        }
        if (z2 || zzlkVarZzm != zzlkVarZzp || (zzlkVarZzp != null && zzlkVarZzp.zza() + j < 0)) {
            zzaa();
            if (zzlkVarZzp != null) {
                while (zzlnVar.zzm() != zzlkVarZzp) {
                    zzlnVar.zzr();
                }
                zzlnVar.zzs(zzlkVarZzp);
                zzlkVarZzp.zzb(1000000000000L);
                zzap();
                zzlkVarZzp.zzh = true;
            }
        }
        zzab();
        if (zzlkVarZzp != null) {
            zzlnVar.zzs(zzlkVarZzp);
            if (!zzlkVarZzp.zze) {
                zzlkVarZzp.zzg = zzlkVarZzp.zzg.zza(j);
            } else if (zzlkVarZzp.zzf) {
                if (this.zzC) {
                    boolean z5 = this.zzB.zzi;
                    if (this.zzG.zza.zzg() || !zzlkVarZzp.zzg.zza.equals(this.zzG.zzb)) {
                        zzwe zzweVar = zzlkVarZzp.zza;
                        j = zzweVar.zzj(j);
                        zzweVar.zzf(j - this.zzn, false);
                    } else {
                        zzmm[] zzmmVarArr = this.zzb;
                        boolean zZzF = true;
                        for (int i2 = 0; i2 < 2; i2++) {
                            zzmm zzmmVar = zzmmVarArr[i2];
                            if (zzmmVar.zzM()) {
                                zZzF &= zzmmVar.zzF(zzlkVarZzp, j);
                            }
                        }
                        if (zZzF) {
                            zzwe zzweVar2 = zzlkVarZzp.zza;
                            long j2 = this.zzG.zzs;
                            zzmq zzmqVar = zzmq.zzb;
                            if (zzweVar2.zzk(j2, zzmqVar) == zzweVar2.zzk(j, zzmqVar)) {
                                z4 = false;
                            } else {
                                zzwe zzweVar3 = zzlkVarZzp.zza;
                                j = zzweVar3.zzj(j);
                                zzweVar3.zzf(j - this.zzn, false);
                            }
                        } else {
                            zzwe zzweVar4 = zzlkVarZzp.zza;
                            j = zzweVar4.zzj(j);
                            zzweVar4.zzf(j - this.zzn, false);
                        }
                    }
                } else {
                    zzwe zzweVar5 = zzlkVarZzp.zza;
                    j = zzweVar5.zzj(j);
                    zzweVar5.zzf(j - this.zzn, false);
                }
            }
            zzU(j, z4);
            zzam();
        } else {
            zzlnVar.zzv();
            zzU(j, true);
        }
        zzas(false);
        this.zzi.zzh(2);
        return j;
    }

    private final void zzU(long j, boolean z2) throws zzit {
        zzlk zzlkVarZzm = this.zzs.zzm();
        long jZza = j + (zzlkVarZzm == null ? 1000000000000L : zzlkVarZzm.zza());
        this.zzT = jZza;
        this.zzo.zzc(jZza);
        zzmm[] zzmmVarArr = this.zzb;
        for (int i2 = 0; i2 < 2; i2++) {
            zzmmVarArr[i2].zzE(zzlkVarZzm, this.zzT, z2);
        }
        for (zzlk zzlkVarZzm2 = r0.zzm(); zzlkVarZzm2 != null; zzlkVarZzm2 = zzlkVarZzm2.zzp()) {
            for (zzzw zzzwVar : zzlkVarZzm2.zzr().zzc) {
            }
        }
    }

    private final void zzV() throws zzit {
        int i2 = 0;
        while (true) {
            zzmm[] zzmmVarArr = this.zzb;
            if (i2 >= 2) {
                return;
            }
            zzmmVarArr[i2].zzz(this.zzC ? this.zzB : null);
            i2++;
        }
    }

    private final void zzW(boolean z2, boolean z3) {
        zzX(z2 || !this.zzQ, false, true, false);
        this.zzH.zza(z3 ? 1 : 0);
        this.zzg.zzc(this.zzv);
        this.zzz.zzc(this.zzG.zzl, 1);
        zzB(1);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0094 A[PHI: r2 r7 r9
  0x0094: PHI (r2v2 com.google.android.gms.internal.ads.zzwg) = (r2v1 com.google.android.gms.internal.ads.zzwg), (r2v11 com.google.android.gms.internal.ads.zzwg) binds: [B:25:0x006a, B:27:0x008f] A[DONT_GENERATE, DONT_INLINE]
  0x0094: PHI (r7v3 long) = (r7v2 long), (r7v11 long) binds: [B:25:0x006a, B:27:0x008f] A[DONT_GENERATE, DONT_INLINE]
  0x0094: PHI (r9v2 long) = (r9v1 long), (r9v7 long) binds: [B:25:0x006a, B:27:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d8 A[PHI: r3
  0x00d8: PHI (r3v3 com.google.android.gms.internal.ads.zzbf) = 
  (r3v2 com.google.android.gms.internal.ads.zzbf)
  (r3v2 com.google.android.gms.internal.ads.zzbf)
  (r3v12 com.google.android.gms.internal.ads.zzbf)
  (r3v12 com.google.android.gms.internal.ads.zzbf)
 binds: [B:31:0x00a1, B:33:0x00a5, B:35:0x00b6, B:37:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    private final void zzX(boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        zzwg zzwgVar;
        zzbf zzbfVar;
        this.zzi.zzk(2);
        this.zzD = false;
        this.zzE = null;
        this.zzX = null;
        zzaC(false, true);
        this.zzo.zzb();
        this.zzT = 1000000000000L;
        try {
            zzaa();
        } catch (zzit | RuntimeException e2) {
            zzee.zzf("ExoPlayerImplInternal", "Disable failed.", e2);
        }
        if (z2) {
            zzmm[] zzmmVarArr = this.zzb;
            for (int i2 = 0; i2 < 2; i2++) {
                try {
                    zzmmVarArr[i2].zzG();
                } catch (RuntimeException e3) {
                    zzee.zzf("ExoPlayerImplInternal", "Reset failed.", e3);
                }
            }
        }
        this.zzR = 0;
        zzma zzmaVar = this.zzG;
        zzwg zzwgVar2 = zzmaVar.zzb;
        long jLongValue = zzmaVar.zzs;
        long j = (this.zzG.zzb.zzb() || zzaB(this.zzG, this.zzm)) ? this.zzG.zzc : this.zzG.zzs;
        if (z3) {
            this.zzS = null;
            Pair pairZzY = zzY(this.zzG.zza);
            zzwgVar2 = (zzwg) pairZzY.first;
            jLongValue = ((Long) pairZzY.second).longValue();
            j = -9223372036854775807L;
            z6 = zzwgVar2.equals(this.zzG.zzb) ? false : true;
        }
        long j2 = jLongValue;
        long j3 = j;
        zzln zzlnVar = this.zzs;
        zzlnVar.zzv();
        this.zzN = false;
        zzbf zzbfVarZzx = this.zzG.zza;
        if (z4 && (zzbfVarZzx instanceof zzmg)) {
            zzbfVarZzx = ((zzmg) zzbfVarZzx).zzx(this.zzt.zzq());
            if (zzwgVar2.zzb != -1) {
                Object obj = zzwgVar2.zza;
                zzbd zzbdVar = this.zzm;
                zzbfVarZzx.zzo(obj, zzbdVar);
                zzbe zzbeVar = this.zzl;
                zzbfVarZzx.zzb(zzbdVar.zzc, zzbeVar, 0L);
                if (zzbeVar.zzb()) {
                    zzbfVar = zzbfVarZzx;
                    zzwgVar = new zzwg(obj, zzwgVar2.zzd);
                } else {
                    zzwgVar = zzwgVar2;
                    zzbfVar = zzbfVarZzx;
                }
            } else {
                zzwgVar = zzwgVar2;
                zzbfVar = zzbfVarZzx;
            }
        } else {
            zzwgVar = zzwgVar2;
            zzbfVar = zzbfVarZzx;
        }
        zzma zzmaVar2 = this.zzG;
        int i3 = zzmaVar2.zze;
        zzit zzitVar = z5 ? null : zzmaVar2.zzf;
        zzyh zzyhVar = z6 ? zzyh.zza : zzmaVar2.zzh;
        zzaae zzaaeVar = z6 ? this.zzf : zzmaVar2.zzi;
        List listZzi = z6 ? zzgtd.zzi() : zzmaVar2.zzj;
        zzma zzmaVar3 = this.zzG;
        this.zzG = new zzma(zzbfVar, zzwgVar, j3, j2, i3, zzitVar, false, zzyhVar, zzaaeVar, listZzi, zzwgVar, zzmaVar3.zzl, zzmaVar3.zzm, zzmaVar3.zzn, zzmaVar3.zzo, j2, 0L, j2, 0L, false);
        if (z4) {
            zzlnVar.zzj();
            this.zzt.zzg();
        }
    }

    private final Pair zzY(zzbf zzbfVar) {
        long j = 0;
        if (zzbfVar.zzg()) {
            return Pair.create(zzma.zzb(), 0L);
        }
        int iZzk = zzbfVar.zzk(this.zzP);
        zzbe zzbeVar = this.zzl;
        zzbd zzbdVar = this.zzm;
        Pair pairZzm = zzbfVar.zzm(zzbeVar, zzbdVar, iZzk, -9223372036854775807L);
        zzwg zzwgVarZzy = this.zzs.zzy(zzbfVar, pairZzm.first, 0L);
        long jLongValue = ((Long) pairZzm.second).longValue();
        if (zzwgVarZzy.zzb()) {
            zzbfVar.zzo(zzwgVarZzy.zza, zzbdVar);
            if (zzwgVarZzy.zzc == zzbdVar.zzd(zzwgVarZzy.zzb)) {
                zzbdVar.zzj();
            }
        } else {
            j = jLongValue;
        }
        return Pair.create(zzwgVarZzy, Long.valueOf(j));
    }

    private final void zzZ(zzbf zzbfVar, zzbf zzbfVar2) {
        if (zzbfVar.zzg() && zzbfVar2.zzg()) {
            return;
        }
        ArrayList arrayList = this.zzp;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            Object obj = ((zzky) arrayList.get(size)).zzb;
            String str = zzfj.zza;
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzaA, reason: merged with bridge method [inline-methods] */
    public final boolean zzw() {
        if (!this.zzC) {
            return false;
        }
        boolean z2 = this.zzB.zzg;
        return true;
    }

    private static boolean zzaB(zzma zzmaVar, zzbd zzbdVar) {
        zzwg zzwgVar = zzmaVar.zzb;
        zzbf zzbfVar = zzmaVar.zza;
        return zzbfVar.zzg() || zzbfVar.zzo(zzwgVar.zza, zzbdVar).zzf;
    }

    private final void zzaC(boolean z2, boolean z3) {
        this.zzL = z2;
        long jElapsedRealtime = -9223372036854775807L;
        if (z2 && !z3) {
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.zzM = jElapsedRealtime;
    }

    private static Pair zzaD(zzbf zzbfVar, zzlb zzlbVar, boolean z2, int i2, boolean z3, zzbe zzbeVar, zzbd zzbdVar) {
        zzbf zzbfVar2;
        zzbf zzbfVar3 = zzlbVar.zza;
        if (zzbfVar.zzg()) {
            return null;
        }
        if (true == zzbfVar3.zzg()) {
            zzbfVar2 = zzbfVar3;
            zzbfVar2 = zzbfVar;
        }
        try {
            zzbfVar2 = zzbfVar3;
            Pair pairZzm = zzbfVar2.zzm(zzbeVar, zzbdVar, zzlbVar.zzb, zzlbVar.zzc);
            zzbf zzbfVar4 = zzbfVar2;
            if (zzbfVar.equals(zzbfVar4)) {
                return pairZzm;
            }
            if (zzbfVar.zze(pairZzm.first) != -1) {
                return (zzbfVar4.zzo(pairZzm.first, zzbdVar).zzf && zzbfVar4.zzb(zzbdVar.zzc, zzbeVar, 0L).zzn == zzbfVar4.zze(pairZzm.first)) ? zzbfVar.zzm(zzbeVar, zzbdVar, zzbfVar.zzo(pairZzm.first, zzbdVar).zzc, zzlbVar.zzc) : pairZzm;
            }
            int iZzr = zzr(zzbeVar, zzbdVar, i2, z3, pairZzm.first, zzbfVar4, zzbfVar);
            if (iZzr != -1) {
                return zzbfVar.zzm(zzbeVar, zzbdVar, iZzr, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    private static final void zzaE(zzme zzmeVar) throws zzit {
        zzmeVar.zzh();
        try {
            zzmeVar.zza().zzx(zzmeVar.zzc(), zzmeVar.zze());
        } finally {
            zzmeVar.zzi(true);
        }
    }

    private static final boolean zzaF(zzlk zzlkVar) {
        if (zzlkVar != null) {
            try {
                if (zzlkVar.zze) {
                    zzxw[] zzxwVarArr = zzlkVar.zzc;
                    for (int i2 = 0; i2 < 2; i2++) {
                        zzxw zzxwVar = zzxwVarArr[i2];
                        if (zzxwVar != null) {
                            zzxwVar.zzc();
                        }
                    }
                } else {
                    zzlkVar.zza.zzc();
                }
                if (zzlkVar.zzg() != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    private final void zzaa() throws zzit {
        int i2 = 0;
        while (true) {
            zzmm[] zzmmVarArr = this.zzb;
            if (i2 >= 2) {
                this.zzaa = -9223372036854775807L;
                return;
            }
            int iZzd = zzmmVarArr[i2].zzd();
            zzmmVarArr[i2].zzA(this.zzo);
            zzN(i2, false);
            this.zzR -= iZzd;
            i2++;
        }
    }

    private final void zzab() {
        if (this.zzy && zzaz()) {
            zzmm[] zzmmVarArr = this.zzb;
            for (int i2 = 0; i2 < 2; i2++) {
                zzmm zzmmVar = zzmmVarArr[i2];
                int iZzd = zzmmVar.zzd();
                zzmmVar.zzC(this.zzo);
                this.zzR -= iZzd - zzmmVar.zzd();
            }
            this.zzaa = -9223372036854775807L;
        }
    }

    private final void zzac() throws zzit {
        zzad();
        zzI(true);
    }

    private final void zzad() throws zzit {
        zzaae zzaaeVarZzk;
        zzaae zzaaeVar;
        boolean z2;
        zzlc zzlcVar;
        int i2;
        int i3;
        zzir zzirVar = this.zzo;
        float f = zzirVar.zzj().zzb;
        zzln zzlnVar = this.zzs;
        zzlk zzlkVarZzm = zzlnVar.zzm();
        zzlk zzlkVarZzn = zzlnVar.zzn();
        zzaae zzaaeVar2 = null;
        boolean z3 = true;
        loop0: while (true) {
            if (zzlkVarZzm == null || !zzlkVarZzm.zze) {
                return;
            }
            zzma zzmaVar = this.zzG;
            zzaaeVarZzk = zzlkVarZzm.zzk(f, zzmaVar.zza, zzmaVar.zzl);
            zzaaeVar = zzlkVarZzm == zzlnVar.zzm() ? zzaaeVarZzk : zzaaeVar2;
            zzaae zzaaeVarZzr = zzlkVarZzm.zzr();
            z2 = false;
            if (zzaaeVarZzr == null) {
                break;
            }
            zzzw[] zzzwVarArr = zzaaeVarZzk.zzc;
            if (zzaaeVarZzr.zzc.length != zzzwVarArr.length) {
                break;
            }
            for (int i4 = 0; i4 < zzzwVarArr.length; i4++) {
                if (!zzaaeVarZzk.zzb(zzaaeVarZzr, i4)) {
                    break loop0;
                }
            }
            if (zzlkVarZzm != zzlkVarZzn) {
                z2 = true;
            }
            z3 &= z2;
            zzlkVarZzm = zzlkVarZzm.zzp();
            zzaaeVar2 = zzaaeVar;
        }
        if (z3) {
            zzlk zzlkVarZzm2 = zzlnVar.zzm();
            int iZzs = zzlnVar.zzs(zzlkVarZzm2) & 1;
            zzmm[] zzmmVarArr = this.zzb;
            boolean[] zArr = new boolean[2];
            zzaaeVar.getClass();
            long jZzm = zzlkVarZzm2.zzm(zzaaeVar, this.zzG.zzs, 1 == iZzs, zArr);
            zzma zzmaVar2 = this.zzG;
            if (zzmaVar2.zze != 4 && jZzm != zzmaVar2.zzs) {
                z2 = true;
            }
            zzma zzmaVar3 = this.zzG;
            i2 = 4;
            i3 = 2;
            zzlcVar = this;
            zzlcVar.zzG = zzao(zzmaVar3.zzb, jZzm, zzmaVar3.zzc, zzmaVar3.zzd, z2, 5);
            if (z2) {
                zzlcVar.zzU(jZzm, true);
            }
            zzlcVar.zzab();
            boolean[] zArr2 = new boolean[2];
            int i5 = 0;
            while (i5 < 2) {
                int iZzd = zzmmVarArr[i5].zzd();
                zArr2[i5] = zzmmVarArr[i5].zzM();
                zzir zzirVar2 = zzirVar;
                zzmmVarArr[i5].zzD(zzlkVarZzm2.zzc[i5], zzirVar2, zzlcVar.zzT, zArr[i5]);
                if (iZzd - zzmmVarArr[i5].zzd() > 0) {
                    zzlcVar.zzN(i5, false);
                }
                zzlcVar.zzR -= iZzd - zzmmVarArr[i5].zzd();
                i5++;
                zzirVar = zzirVar2;
            }
            zzlcVar.zzaq(zArr2, zzlcVar.zzT);
            zzlkVarZzm2.zzh = true;
        } else {
            zzlcVar = this;
            i2 = 4;
            i3 = 2;
            zzlnVar.zzs(zzlkVarZzm);
            if (zzlkVarZzm.zze) {
                long jMax = Math.max(zzlkVarZzm.zzg.zzb, zzlcVar.zzT - zzlkVarZzm.zza());
                if (zzlcVar.zzy && zzlcVar.zzaz() && zzlnVar.zzo() == zzlkVarZzm) {
                    zzlcVar.zzab();
                }
                zzlkVarZzm.zzl(zzaaeVarZzk, jMax, false);
            }
        }
        zzlcVar.zzas(true);
        if (zzlcVar.zzG.zze != i2) {
            zzlcVar.zzam();
            zzlcVar.zzL();
            zzlcVar.zzi.zzh(i3);
        }
    }

    private final boolean zzae() {
        zzlk zzlkVarZzm = this.zzs.zzm();
        long j = zzlkVarZzm.zzg.zze;
        if (zzlkVarZzm.zze) {
            return j == -9223372036854775807L || this.zzG.zzs < j || !zzax();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x027b  */
    /* JADX WARN: Code duplicated, block: B:128:0x027e A[Catch: all -> 0x02dc, TryCatch #6 {all -> 0x02dc, blocks: (B:125:0x0273, B:129:0x0287, B:128:0x027e), top: B:235:0x0273 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x0293  */
    /* JADX WARN: Code duplicated, block: B:134:0x0298 A[Catch: all -> 0x02a3, TRY_LEAVE, TryCatch #2 {all -> 0x02a3, blocks: (B:131:0x028d, B:134:0x0298), top: B:227:0x028d }] */
    /* JADX WARN: Code duplicated, block: B:143:0x02be  */
    /* JADX WARN: Code duplicated, block: B:147:0x02ca A[Catch: all -> 0x02c3, TryCatch #1 {all -> 0x02c3, blocks: (B:144:0x02bf, B:147:0x02ca, B:149:0x02cd, B:157:0x02e1, B:159:0x02ea, B:161:0x02f2, B:163:0x02fc, B:164:0x0307, B:165:0x030c), top: B:226:0x0271 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x02cd A[Catch: all -> 0x02c3, TryCatch #1 {all -> 0x02c3, blocks: (B:144:0x02bf, B:147:0x02ca, B:149:0x02cd, B:157:0x02e1, B:159:0x02ea, B:161:0x02f2, B:163:0x02fc, B:164:0x0307, B:165:0x030c), top: B:226:0x0271 }] */
    /* JADX WARN: Code duplicated, block: B:157:0x02e1 A[Catch: all -> 0x02c3, TryCatch #1 {all -> 0x02c3, blocks: (B:144:0x02bf, B:147:0x02ca, B:149:0x02cd, B:157:0x02e1, B:159:0x02ea, B:161:0x02f2, B:163:0x02fc, B:164:0x0307, B:165:0x030c), top: B:226:0x0271 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x02ea A[Catch: all -> 0x02c3, TryCatch #1 {all -> 0x02c3, blocks: (B:144:0x02bf, B:147:0x02ca, B:149:0x02cd, B:157:0x02e1, B:159:0x02ea, B:161:0x02f2, B:163:0x02fc, B:164:0x0307, B:165:0x030c), top: B:226:0x0271 }] */
    /* JADX WARN: Code duplicated, block: B:161:0x02f2 A[Catch: all -> 0x02c3, TryCatch #1 {all -> 0x02c3, blocks: (B:144:0x02bf, B:147:0x02ca, B:149:0x02cd, B:157:0x02e1, B:159:0x02ea, B:161:0x02f2, B:163:0x02fc, B:164:0x0307, B:165:0x030c), top: B:226:0x0271 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x02fc A[Catch: all -> 0x02c3, TryCatch #1 {all -> 0x02c3, blocks: (B:144:0x02bf, B:147:0x02ca, B:149:0x02cd, B:157:0x02e1, B:159:0x02ea, B:161:0x02f2, B:163:0x02fc, B:164:0x0307, B:165:0x030c), top: B:226:0x0271 }] */
    /* JADX WARN: Code duplicated, block: B:168:0x0318  */
    /* JADX WARN: Code duplicated, block: B:169:0x031b  */
    /* JADX WARN: Code duplicated, block: B:174:0x032d  */
    /* JADX WARN: Code duplicated, block: B:176:0x0337 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:182:0x034b  */
    /* JADX WARN: Code duplicated, block: B:185:0x0357  */
    /* JADX WARN: Code duplicated, block: B:187:0x035c  */
    /* JADX WARN: Code duplicated, block: B:191:0x037d  */
    /* JADX WARN: Code duplicated, block: B:196:0x0392  */
    /* JADX WARN: Code duplicated, block: B:197:0x0395  */
    /* JADX WARN: Code duplicated, block: B:200:0x039f  */
    /* JADX WARN: Code duplicated, block: B:204:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:206:0x03b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:212:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:215:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:217:0x03df  */
    /* JADX WARN: Code duplicated, block: B:221:0x0400  */
    /* JADX WARN: Code duplicated, block: B:227:0x028d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x0259 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x0273 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x0307 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    private final void zzaf(zzbf zzbfVar, boolean z2) throws Throwable {
        zzwg zzwgVar;
        zzbe zzbeVar;
        Object obj;
        long j;
        long j2;
        long j3;
        int i2;
        long jMax;
        boolean z3;
        boolean z4;
        char c2;
        int iZzk;
        boolean z5;
        long jLongValue;
        zzwg zzwgVarZzb;
        boolean z6;
        char c3;
        int i3;
        long jLongValue2;
        Object obj2;
        int iZzk2;
        char c4;
        Object obj3;
        char c5;
        boolean z7;
        boolean z8;
        zzbf zzbfVar2;
        zzwg zzwgVar2;
        Object obj4;
        long j4;
        zzwg zzwgVar3;
        Object obj5;
        boolean z9;
        int i4;
        zzmm[] zzmmVarArr;
        int i5;
        zzln zzlnVar;
        long jZzah;
        long jZzah2;
        int iZzw;
        long j5;
        zzwg zzwgVar4;
        zzbf zzbfVar3;
        Object obj6;
        boolean z10;
        int i6;
        zzln zzlnVar2;
        zzlk zzlkVarZzm;
        zzma zzmaVar = this.zzG;
        zzlb zzlbVar = this.zzS;
        int i7 = this.zzO;
        boolean z11 = this.zzP;
        char c6 = 4;
        long jZzS = 0;
        int i8 = -1;
        if (zzbfVar.zzg()) {
            zzbfVar = zzbfVar;
            zzwgVarZzb = zzma.zzb();
            z6 = false;
            c3 = 0;
            z4 = true;
            j = -9223372036854775807L;
            j3 = -9223372036854775807L;
        } else {
            zzbd zzbdVar = this.zzm;
            zzwg zzwgVar5 = zzmaVar.zzb;
            Object obj7 = zzwgVar5.zza;
            boolean zZzaB = zzaB(zzmaVar, zzbdVar);
            long j6 = (zzwgVar5.zzb() || zZzaB) ? zzmaVar.zzc : zzmaVar.zzs;
            zzbe zzbeVar2 = this.zzl;
            if (zzlbVar != null) {
                zzwgVar = zzwgVar5;
                obj = obj7;
                j = -9223372036854775807L;
                zzbfVar = zzbfVar;
                Pair pairZzaD = zzaD(zzbfVar, zzlbVar, true, i7, z11, zzbeVar2, zzbdVar);
                if (pairZzaD == null) {
                    iZzk2 = zzbfVar.zzk(z11);
                    obj3 = obj;
                    jLongValue2 = j6;
                    z7 = false;
                    z8 = true;
                    c5 = 0;
                } else {
                    if (zzlbVar.zzc == -9223372036854775807L) {
                        iZzk2 = zzbfVar.zzo(pairZzaD.first, zzbdVar).zzc;
                        obj2 = obj;
                        jLongValue2 = j6;
                        c4 = 0;
                    } else {
                        Object obj8 = pairZzaD.first;
                        jLongValue2 = ((Long) pairZzaD.second).longValue();
                        obj2 = obj8;
                        iZzk2 = -1;
                        c4 = 1;
                    }
                    obj3 = obj2;
                    c5 = c4;
                    z7 = zzmaVar.zze == 4;
                    z8 = false;
                }
                i2 = iZzk2;
                zzbeVar = zzbeVar2;
                obj = obj3;
                j3 = jLongValue2;
                zzbdVar = zzbdVar;
                char c7 = c5;
                z3 = z7;
                z4 = z8;
                c2 = c7;
                j2 = j6;
            } else {
                zzwgVar = zzwgVar5;
                zzbeVar = zzbeVar2;
                obj = obj7;
                j = -9223372036854775807L;
                zzbfVar = zzbfVar;
                zzbf zzbfVar4 = zzmaVar.zza;
                if (zzbfVar4.zzg()) {
                    iZzk = zzbfVar.zzk(z11);
                } else if (zzbfVar.zze(obj) == -1) {
                    int iZzr = zzr(zzbeVar, zzbdVar, i7, z11, obj, zzbfVar4, zzbfVar);
                    if (iZzr == -1) {
                        zzbeVar = zzbeVar;
                        zzbfVar = zzbfVar;
                        obj = obj;
                        iZzr = zzbfVar.zzk(z11);
                        z5 = true;
                    } else {
                        zzbeVar = zzbeVar;
                        zzbfVar = zzbfVar;
                        obj = obj;
                        z5 = false;
                    }
                    i2 = iZzr;
                    zzbdVar = zzbdVar;
                    obj = obj;
                    j2 = j6;
                    j3 = j2;
                    z3 = false;
                    c2 = 0;
                    z4 = z5;
                } else if (j6 == -9223372036854775807L) {
                    iZzk = zzbfVar.zzo(obj, zzbdVar).zzc;
                } else if (zZzaB) {
                    zzbfVar4.zzo(obj, zzbdVar);
                    if (zzbfVar4.zzb(zzbdVar.zzc, zzbeVar, 0L).zzn == zzbfVar4.zze(obj)) {
                        zzbdVar = zzbdVar;
                        Pair pairZzm = zzbfVar.zzm(zzbeVar, zzbdVar, zzbfVar.zzo(obj, zzbdVar).zzc, j6);
                        j2 = j6;
                        obj = pairZzm.first;
                        jMax = ((Long) pairZzm.second).longValue();
                    } else {
                        zzbdVar = zzbdVar;
                        j2 = j6;
                        if (zzbfVar.zzo(obj, zzbdVar).zzd != -9223372036854775807L) {
                            long j7 = zzbdVar.zzd - 1;
                            String str = zzfj.zza;
                            jMax = Math.max(0L, Math.min(j2, j7));
                        } else {
                            jMax = j2;
                        }
                        obj = obj;
                    }
                    i2 = -1;
                    j3 = jMax;
                    z3 = false;
                    z4 = false;
                    c2 = 1;
                } else {
                    j2 = j6;
                    j3 = j2;
                    i2 = -1;
                    z3 = false;
                    z4 = false;
                    c2 = 0;
                }
                i2 = iZzk;
                j2 = j6;
                j3 = j2;
                z3 = false;
                z4 = false;
                c2 = 0;
            }
            if (i2 != -1) {
                Pair pairZzm2 = zzbfVar.zzm(zzbeVar, zzbdVar, i2, -9223372036854775807L);
                obj = pairZzm2.first;
                jLongValue = ((Long) pairZzm2.second).longValue();
                j3 = j;
            } else {
                jLongValue = j3;
            }
            zzwg zzwgVarZzy = this.zzs.zzy(zzbfVar, obj, jLongValue);
            int i9 = zzwgVarZzy.zze;
            boolean z12 = obj.equals(obj) && !zzwgVar.zzb() && !zzwgVarZzy.zzb() && (i9 == -1 || ((i3 = zzwgVar.zze) != -1 && i9 >= i3));
            zzbd zzbdVarZzo = zzbfVar.zzo(obj, zzbdVar);
            if (!zZzaB && j2 == j3 && obj.equals(zzwgVarZzy.zza)) {
                if (zzwgVar.zzb()) {
                    zzbdVarZzo.zzk(zzwgVar.zzb);
                }
                if (zzwgVarZzy.zzb()) {
                    zzbdVarZzo.zzk(zzwgVarZzy.zzb);
                }
            }
            if (true == z12) {
                zzwgVarZzy = zzwgVar;
            }
            if (zzwgVarZzy.zzb()) {
                if (zzwgVarZzy.equals(zzwgVar)) {
                    jLongValue = zzmaVar.zzs;
                } else {
                    zzbfVar.zzo(zzwgVarZzy.zza, zzbdVar);
                    if (zzwgVarZzy.zzc == zzbdVar.zzd(zzwgVarZzy.zzb)) {
                        zzbdVar.zzj();
                    }
                    jLongValue = 0;
                }
            }
            zzwgVarZzb = zzwgVarZzy;
            jZzS = jLongValue;
            z6 = z3;
            c3 = c2;
        }
        boolean z13 = (this.zzG.zzb.equals(zzwgVarZzb) && jZzS == this.zzG.zzs) ? false : true;
        i8 = 2;
        if (!z4) {
            zzmmVarArr = this.zzb;
            for (i5 = 0; i5 < 2; i5++) {
                zzmmVarArr[i5].zzn(zzbfVar);
            }
            if (z13) {
                i8 = 2;
                c6 = 1;
                if (!zzbfVar.zzg()) {
                    zzlnVar2 = this.zzs;
                    for (zzlkVarZzm = zzlnVar2.zzm(); zzlkVarZzm != null; zzlkVarZzm = zzlkVarZzm.zzp()) {
                        if (zzlkVarZzm.zzg.zza.equals(zzwgVarZzb)) {
                            zzlkVarZzm.zzg = zzlnVar2.zzx(zzbfVar, zzlkVarZzm.zzg);
                            zzlkVarZzm.zzs();
                        }
                    }
                    jZzS = zzS(zzwgVarZzb, jZzS, z6);
                }
            } else {
                zzlnVar = this.zzs;
                if (zzlnVar.zzn() == null) {
                    jZzah = 0;
                } else {
                    jZzah = zzah(zzlnVar.zzn());
                }
                if (!zzaz()) {
                    jZzah2 = 0;
                } else if (zzlnVar.zzo() == null) {
                    jZzah2 = 0;
                } else {
                    jZzah2 = zzah(zzlnVar.zzo());
                }
                i8 = i8;
                c6 = 1;
                iZzw = zzlnVar.zzw(zzbfVar, this.zzT, jZzah, jZzah2);
                zzbfVar = zzbfVar;
                if ((iZzw & 1) != 0) {
                    zzI(false);
                } else if ((iZzw & i8) != 0) {
                    zzab();
                }
            }
            zzma zzmaVar2 = this.zzG;
            zzbf zzbfVar5 = zzmaVar2.zza;
            zzwg zzwgVar6 = zzmaVar2.zzb;
            if (c6 != c3) {
                j5 = j;
            } else {
                j5 = jZzS;
            }
            zzwgVar4 = zzwgVarZzb;
            zzag(zzbfVar, zzwgVar4, zzbfVar5, zzwgVar6, j5, false);
            zzbfVar3 = zzbfVar;
            if (z13) {
                zzma zzmaVar3 = this.zzG;
                obj6 = zzmaVar3.zzb.zza;
                zzbf zzbfVar6 = zzmaVar3.zza;
                if (z13) {
                    z10 = 0;
                } else {
                    z10 = 0;
                }
                long j8 = this.zzG.zzd;
                if (zzbfVar3.zze(obj6) == -1) {
                    i6 = 4;
                } else {
                    i6 = 3;
                }
                this.zzG = zzao(zzwgVar4, jZzS, j3, j8, z10, i6);
            } else {
                zzma zzmaVar4 = this.zzG;
                obj6 = zzmaVar4.zzb.zza;
                zzbf zzbfVar7 = zzmaVar4.zza;
                if (z13) {
                    z10 = 0;
                } else {
                    z10 = 0;
                }
                long j9 = this.zzG.zzd;
                if (zzbfVar3.zze(obj6) == -1) {
                    i6 = 4;
                } else {
                    i6 = 3;
                }
                this.zzG = zzao(zzwgVar4, jZzS, j3, j9, z10, i6);
            }
            zzaj();
            zzZ(zzbfVar3, this.zzG.zza);
            this.zzG = this.zzG.zzd(zzbfVar3);
            if (!zzbfVar3.zzg()) {
                this.zzS = null;
            }
            zzas(false);
            this.zzi.zzh(i8);
            return;
        }
        try {
            if (this.zzG.zze != 1) {
                try {
                    zzB(4);
                } catch (Throwable th) {
                    th = th;
                    zzwg zzwgVar7 = zzwgVarZzb;
                    zzbfVar2 = zzbfVar;
                    zzwgVar2 = zzwgVar7;
                    obj4 = null;
                    i8 = 2;
                    c6 = 1;
                }
            }
            zzX(false, false, false, true);
            zzmmVarArr = this.zzb;
            while (i5 < 2) {
                try {
                    zzmmVarArr[i5].zzn(zzbfVar);
                } catch (Throwable th2) {
                    th = th2;
                    zzwg zzwgVar8 = zzwgVarZzb;
                    zzbfVar2 = zzbfVar;
                    zzwgVar2 = zzwgVar8;
                    obj4 = null;
                    i8 = 2;
                    c6 = 1;
                }
            }
            try {
                if (z13) {
                    try {
                        zzlnVar = this.zzs;
                        if (zzlnVar.zzn() == null) {
                            jZzah = 0;
                        } else {
                            jZzah = zzah(zzlnVar.zzn());
                        }
                        if (!zzaz()) {
                            try {
                                if (zzlnVar.zzo() == null) {
                                    jZzah2 = 0;
                                } else {
                                    jZzah2 = zzah(zzlnVar.zzo());
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                obj4 = null;
                                i8 = 2;
                                zzwgVar2 = zzwgVarZzb;
                                c6 = 1;
                                zzbfVar2 = zzbfVar;
                            }
                        } else {
                            jZzah2 = 0;
                        }
                        try {
                            i8 = i8;
                            c6 = 1;
                            try {
                                iZzw = zzlnVar.zzw(zzbfVar, this.zzT, jZzah, jZzah2);
                                zzbfVar = zzbfVar;
                                if ((iZzw & 1) != 0) {
                                    zzI(false);
                                } else if ((iZzw & i8) != 0) {
                                    zzab();
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                zzbfVar = zzbfVar;
                                zzwg zzwgVar9 = zzwgVarZzb;
                                zzbfVar2 = zzbfVar;
                                zzwgVar2 = zzwgVar9;
                                obj4 = null;
                                zzma zzmaVar5 = this.zzG;
                                zzbf zzbfVar8 = zzmaVar5.zza;
                                zzwg zzwgVar10 = zzmaVar5.zzb;
                                if (c6 != c3) {
                                    j4 = j;
                                } else {
                                    j4 = jZzS;
                                }
                                zzwgVar3 = zzwgVar2;
                                zzag(zzbfVar2, zzwgVar3, zzbfVar8, zzwgVar10, j4, false);
                                if (z13) {
                                    zzma zzmaVar6 = this.zzG;
                                    obj5 = zzmaVar6.zzb.zza;
                                    zzbf zzbfVar9 = zzmaVar6.zza;
                                    if (z13) {
                                        z9 = 0;
                                    } else {
                                        z9 = 0;
                                    }
                                    long j10 = this.zzG.zzd;
                                    if (zzbfVar2.zze(obj5) == -1) {
                                        i4 = 4;
                                    } else {
                                        i4 = 3;
                                    }
                                    this.zzG = zzao(zzwgVar3, jZzS, j3, j10, z9, i4);
                                } else {
                                    zzma zzmaVar7 = this.zzG;
                                    obj5 = zzmaVar7.zzb.zza;
                                    zzbf zzbfVar10 = zzmaVar7.zza;
                                    if (z13) {
                                        z9 = 0;
                                    } else {
                                        z9 = 0;
                                    }
                                    long j11 = this.zzG.zzd;
                                    if (zzbfVar2.zze(obj5) == -1) {
                                        i4 = 4;
                                    } else {
                                        i4 = 3;
                                    }
                                    this.zzG = zzao(zzwgVar3, jZzS, j3, j11, z9, i4);
                                }
                                zzaj();
                                zzZ(zzbfVar2, this.zzG.zza);
                                this.zzG = this.zzG.zzd(zzbfVar2);
                                if (!zzbfVar2.zzg()) {
                                    this.zzS = obj4;
                                }
                                zzas(false);
                                this.zzi.zzh(i8);
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            c6 = 1;
                            zzwg zzwgVar11 = zzwgVarZzb;
                            zzbfVar2 = zzbfVar;
                            zzwgVar2 = zzwgVar11;
                            obj4 = null;
                            zzma zzmaVar8 = this.zzG;
                            zzbf zzbfVar11 = zzmaVar8.zza;
                            zzwg zzwgVar12 = zzmaVar8.zzb;
                            if (c6 != c3) {
                                j4 = j;
                            } else {
                                j4 = jZzS;
                            }
                            zzwgVar3 = zzwgVar2;
                            zzag(zzbfVar2, zzwgVar3, zzbfVar11, zzwgVar12, j4, false);
                            if (z13) {
                                zzma zzmaVar9 = this.zzG;
                                obj5 = zzmaVar9.zzb.zza;
                                zzbf zzbfVar12 = zzmaVar9.zza;
                                if (z13) {
                                    z9 = 0;
                                } else {
                                    z9 = 0;
                                }
                                long j12 = this.zzG.zzd;
                                if (zzbfVar2.zze(obj5) == -1) {
                                    i4 = 4;
                                } else {
                                    i4 = 3;
                                }
                                this.zzG = zzao(zzwgVar3, jZzS, j3, j12, z9, i4);
                            } else {
                                zzma zzmaVar10 = this.zzG;
                                obj5 = zzmaVar10.zzb.zza;
                                zzbf zzbfVar13 = zzmaVar10.zza;
                                if (z13) {
                                    z9 = 0;
                                } else {
                                    z9 = 0;
                                }
                                long j13 = this.zzG.zzd;
                                if (zzbfVar2.zze(obj5) == -1) {
                                    i4 = 4;
                                } else {
                                    i4 = 3;
                                }
                                this.zzG = zzao(zzwgVar3, jZzS, j3, j13, z9, i4);
                            }
                            zzaj();
                            zzZ(zzbfVar2, this.zzG.zza);
                            this.zzG = this.zzG.zzd(zzbfVar2);
                            if (!zzbfVar2.zzg()) {
                                this.zzS = obj4;
                            }
                            zzas(false);
                            this.zzi.zzh(i8);
                            throw th;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                } else {
                    i8 = 2;
                    c6 = 1;
                    if (!zzbfVar.zzg()) {
                        zzlnVar2 = this.zzs;
                        while (zzlkVarZzm != null) {
                            if (zzlkVarZzm.zzg.zza.equals(zzwgVarZzb)) {
                                zzlkVarZzm.zzg = zzlnVar2.zzx(zzbfVar, zzlkVarZzm.zzg);
                                zzlkVarZzm.zzs();
                            }
                        }
                        jZzS = zzS(zzwgVarZzb, jZzS, z6);
                    }
                }
                zzma zzmaVar11 = this.zzG;
                zzbf zzbfVar14 = zzmaVar11.zza;
                zzwg zzwgVar13 = zzmaVar11.zzb;
                if (c6 != c3) {
                    j5 = j;
                } else {
                    j5 = jZzS;
                }
                zzwgVar4 = zzwgVarZzb;
                zzag(zzbfVar, zzwgVar4, zzbfVar14, zzwgVar13, j5, false);
                zzbfVar3 = zzbfVar;
                if (z13 || j3 != this.zzG.zzc) {
                    zzma zzmaVar12 = this.zzG;
                    obj6 = zzmaVar12.zzb.zza;
                    zzbf zzbfVar15 = zzmaVar12.zza;
                    if (z13 || !z2 || zzbfVar15.zzg() || zzbfVar15.zzo(obj6, this.zzm).zzf) {
                        z10 = 0;
                    } else {
                        z10 = c6;
                    }
                    long j14 = this.zzG.zzd;
                    if (zzbfVar3.zze(obj6) == -1) {
                        i6 = 4;
                    } else {
                        i6 = 3;
                    }
                    this.zzG = zzao(zzwgVar4, jZzS, j3, j14, z10, i6);
                }
                zzaj();
                zzZ(zzbfVar3, this.zzG.zza);
                this.zzG = this.zzG.zzd(zzbfVar3);
                if (!zzbfVar3.zzg()) {
                    this.zzS = null;
                }
                zzas(false);
                this.zzi.zzh(i8);
                return;
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            th = th8;
            zzwg zzwgVar14 = zzwgVarZzb;
            zzbfVar2 = zzbfVar;
            zzwgVar2 = zzwgVar14;
            obj4 = null;
            i8 = 2;
            c6 = 1;
        }
        zzma zzmaVar13 = this.zzG;
        zzbf zzbfVar16 = zzmaVar13.zza;
        zzwg zzwgVar15 = zzmaVar13.zzb;
        if (c6 != c3) {
            j4 = j;
        } else {
            j4 = jZzS;
        }
        zzwgVar3 = zzwgVar2;
        zzag(zzbfVar2, zzwgVar3, zzbfVar16, zzwgVar15, j4, false);
        if (z13 || j3 != this.zzG.zzc) {
            zzma zzmaVar14 = this.zzG;
            obj5 = zzmaVar14.zzb.zza;
            zzbf zzbfVar17 = zzmaVar14.zza;
            if (z13 || !z2 || zzbfVar17.zzg() || zzbfVar17.zzo(obj5, this.zzm).zzf) {
                z9 = 0;
            } else {
                z9 = c6;
            }
            long j15 = this.zzG.zzd;
            if (zzbfVar2.zze(obj5) == -1) {
                i4 = 4;
            } else {
                i4 = 3;
            }
            this.zzG = zzao(zzwgVar3, jZzS, j3, j15, z9, i4);
        }
        zzaj();
        zzZ(zzbfVar2, this.zzG.zza);
        this.zzG = this.zzG.zzd(zzbfVar2);
        if (!zzbfVar2.zzg()) {
            this.zzS = obj4;
        }
        zzas(false);
        this.zzi.zzh(i8);
        throw th;
    }

    private final void zzag(zzbf zzbfVar, zzwg zzwgVar, zzbf zzbfVar2, zzwg zzwgVar2, long j, boolean z2) throws zzit {
        if (!zzP(zzbfVar, zzwgVar)) {
            zzav zzavVar = zzwgVar.zzb() ? zzav.zza : this.zzG.zzo;
            if (this.zzo.zzj().equals(zzavVar)) {
                return;
            }
            zzM(zzavVar);
            zzal(this.zzG.zzo, zzavVar.zzb, false, false);
            return;
        }
        Object obj = zzwgVar.zza;
        zzbd zzbdVar = this.zzm;
        int i2 = zzbfVar.zzo(obj, zzbdVar).zzc;
        zzbe zzbeVar = this.zzl;
        zzbfVar.zzb(i2, zzbeVar, 0L);
        zzim zzimVar = this.zzad;
        zzaf zzafVar = zzbeVar.zzj;
        String str = zzfj.zza;
        zzimVar.zza(zzafVar);
        if (j != -9223372036854775807L) {
            zzimVar.zzb(zzO(zzbfVar, obj, j));
            return;
        }
        if (!Objects.equals(!zzbfVar2.zzg() ? zzbfVar2.zzb(zzbfVar2.zzo(zzwgVar2.zza, zzbdVar).zzc, zzbeVar, 0L).zzb : null, zzbeVar.zzb) || z2) {
            zzimVar.zzb(-9223372036854775807L);
        }
    }

    private final long zzah(zzlk zzlkVar) {
        if (zzlkVar == null) {
            return 0L;
        }
        long jZza = zzlkVar.zza();
        if (zzlkVar.zze) {
            int i2 = 0;
            while (true) {
                zzmm[] zzmmVarArr = this.zzb;
                if (i2 >= 2) {
                    break;
                }
                if (zzmmVarArr[i2].zzp(zzlkVar)) {
                    long jZzf = zzmmVarArr[i2].zzf(zzlkVar);
                    if (jZzf == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    jZza = Math.max(jZzf, jZza);
                }
                i2++;
            }
        }
        return jZza;
    }

    private final void zzai() {
        zzln zzlnVar = this.zzs;
        zzlnVar.zzt();
        zzlk zzlkVarZzl = zzlnVar.zzl();
        if (zzlkVarZzl != null) {
            if (!zzlkVarZzl.zzd || zzlkVarZzl.zze) {
                zzwe zzweVar = zzlkVarZzl.zza;
                if (zzweVar.zzn()) {
                    return;
                }
                if (this.zzg.zzj(this.zzv, this.zzG.zza, zzlkVarZzl.zzg.zza, zzlkVarZzl.zze ? zzweVar.zzi() : 0L)) {
                    if (!zzlkVarZzl.zzd) {
                        zzlkVarZzl.zzt(this, zzlkVarZzl.zzg.zzb);
                        return;
                    }
                    zzlh zzlhVar = new zzlh();
                    zzlhVar.zza(this.zzT - zzlkVarZzl.zza());
                    zzlhVar.zzb(this.zzo.zzj().zzb);
                    zzlhVar.zzc(this.zzM);
                    zzlkVarZzl.zzj(new zzli(zzlhVar, null));
                }
            }
        }
    }

    private final void zzaj() {
        zzlk zzlkVarZzm = this.zzs.zzm();
        boolean z2 = false;
        if (zzlkVarZzm != null && zzlkVarZzm.zzg.zzi && this.zzJ) {
            z2 = true;
        }
        this.zzK = z2;
    }

    private final void zzak(zzav zzavVar, boolean z2) throws zzit {
        zzal(zzavVar, zzavVar.zzb, true, z2);
    }

    private final void zzal(zzav zzavVar, float f, boolean z2, boolean z3) throws zzit {
        int i2;
        if (z2) {
            if (z3) {
                this.zzH.zza(1);
            }
            zzma zzmaVar = this.zzG;
            this.zzG = new zzma(zzmaVar.zza, zzmaVar.zzb, zzmaVar.zzc, zzmaVar.zzd, zzmaVar.zze, zzmaVar.zzf, zzmaVar.zzg, zzmaVar.zzh, zzmaVar.zzi, zzmaVar.zzj, zzmaVar.zzk, zzmaVar.zzl, zzmaVar.zzm, zzmaVar.zzn, zzavVar, zzmaVar.zzq, zzmaVar.zzr, zzmaVar.zzs, zzmaVar.zzt, false);
        }
        float f2 = zzavVar.zzb;
        zzlk zzlkVarZzm = this.zzs.zzm();
        while (true) {
            i2 = 0;
            if (zzlkVarZzm == null) {
                break;
            }
            zzzw[] zzzwVarArr = zzlkVarZzm.zzr().zzc;
            int length = zzzwVarArr.length;
            while (i2 < length) {
                zzzw zzzwVar = zzzwVarArr[i2];
                i2++;
            }
            zzlkVarZzm = zzlkVarZzm.zzp();
        }
        zzmm[] zzmmVarArr = this.zzb;
        while (i2 < 2) {
            zzmmVarArr[i2].zzm(f, f2);
            i2++;
        }
    }

    private final void zzam() {
        long jZza;
        long jZza2;
        zzln zzlnVar = this.zzs;
        boolean zZzh = false;
        if (zzaF(zzlnVar.zzk())) {
            zzlk zzlkVarZzk = zzlnVar.zzk();
            long jZzau = zzau(zzlkVarZzk.zzg());
            if (zzlkVarZzk == zzlnVar.zzm()) {
                jZza = this.zzT;
                jZza2 = zzlkVarZzk.zza();
            } else {
                jZza = this.zzT - zzlkVarZzk.zza();
                jZza2 = zzlkVarZzk.zzg.zzb;
            }
            zzlf zzlfVar = new zzlf(this.zzv, this.zzG.zza, zzlkVarZzk.zzg.zza, jZza - jZza2, jZzau, this.zzo.zzj().zzb, this.zzG.zzl, this.zzL, zzP(this.zzG.zza, zzlkVarZzk.zzg.zza) ? this.zzad.zze() : -9223372036854775807L, this.zzM);
            zzlg zzlgVar = this.zzg;
            boolean zZzh2 = zzlgVar.zzh(zzlfVar);
            zzlk zzlkVarZzm = zzlnVar.zzm();
            if (zZzh2 || !zzlkVarZzm.zze || jZzau >= 500000 || this.zzn <= 0) {
                zZzh = zZzh2;
            } else {
                zzlkVarZzm.zza.zzf(this.zzG.zzs, false);
                zZzh = zzlgVar.zzh(zzlfVar);
            }
        }
        this.zzN = zZzh;
        if (zZzh) {
            zzlk zzlkVarZzk2 = zzlnVar.zzk();
            zzlkVarZzk2.getClass();
            zzlh zzlhVar = new zzlh();
            zzlhVar.zza(this.zzT - zzlkVarZzk2.zza());
            zzlhVar.zzb(this.zzo.zzj().zzb);
            zzlhVar.zzc(this.zzM);
            zzlkVarZzk2.zzj(new zzli(zzlhVar, null));
        }
        zzan();
    }

    private final void zzan() {
        zzlk zzlkVarZzk = this.zzs.zzk();
        boolean z2 = true;
        if (!this.zzN && (zzlkVarZzk == null || !zzlkVarZzk.zza.zzn())) {
            z2 = false;
        }
        zzma zzmaVar = this.zzG;
        if (z2 != zzmaVar.zzg) {
            this.zzG = zzmaVar.zzg(z2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0098  */
    private final zzma zzao(zzwg zzwgVar, long j, long j2, long j3, boolean z2, int i2) {
        List list;
        zzaae zzaaeVar;
        zzlk zzlkVarZzm;
        int i3 = 0;
        this.zzW = (!this.zzW && j == this.zzG.zzs && zzwgVar.equals(this.zzG.zzb)) ? false : true;
        zzaj();
        zzma zzmaVar = this.zzG;
        zzyh zzyhVar = zzmaVar.zzh;
        zzaae zzaaeVar2 = zzmaVar.zzi;
        List listZzi = zzmaVar.zzj;
        if (this.zzt.zzb()) {
            zzln zzlnVar = this.zzs;
            zzlk zzlkVarZzm2 = zzlnVar.zzm();
            zzyh zzyhVarZzq = zzlkVarZzm2 == null ? zzyh.zza : zzlkVarZzm2.zzq();
            zzaae zzaaeVarZzr = zzlkVarZzm2 == null ? this.zzf : zzlkVarZzm2.zzr();
            zzzw[] zzzwVarArr = zzaaeVarZzr.zzc;
            zzgta zzgtaVar = new zzgta();
            boolean z3 = false;
            for (zzzw zzzwVar : zzzwVarArr) {
                if (zzzwVar != null) {
                    zzap zzapVar = zzzwVar.zzb(0).zzl;
                    if (zzapVar == null) {
                        zzgtaVar.zzf(new zzap(-9223372036854775807L, new zzao[0]));
                    } else {
                        zzgtaVar.zzf(zzapVar);
                        z3 = true;
                    }
                }
            }
            zzgtd zzgtdVarZzi = z3 ? zzgtaVar.zzi() : zzgtd.zzi();
            if (zzlkVarZzm2 != null) {
                zzll zzllVar = zzlkVarZzm2.zzg;
                if (zzllVar.zzc != j2) {
                    zzlkVarZzm2.zzg = zzllVar.zzb(j2);
                }
            }
            if (zzlnVar.zzm() == zzlnVar.zzn() && (zzlkVarZzm = zzlnVar.zzm()) != null) {
                zzaae zzaaeVarZzr2 = zzlkVarZzm.zzr();
                while (true) {
                    zzmm[] zzmmVarArr = this.zzb;
                    if (i3 >= 2) {
                        break;
                    }
                    if (zzaaeVarZzr2.zza(i3)) {
                        if (zzmmVarArr[i3].zze() != 1) {
                            break;
                        }
                        int i4 = zzaaeVarZzr2.zzb[i3].zzb;
                    }
                    i3++;
                }
            }
            list = zzgtdVarZzi;
            zzyhVar = zzyhVarZzq;
            zzaaeVar = zzaaeVarZzr;
        } else {
            if (!zzwgVar.equals(this.zzG.zzb)) {
                zzaaeVar2 = this.zzf;
                zzyhVar = zzyh.zza;
                listZzi = zzgtd.zzi();
            }
            list = listZzi;
            zzaaeVar = zzaaeVar2;
        }
        if (z2) {
            this.zzH.zzc(i2);
        }
        return this.zzG.zzc(zzwgVar, j, j2, j3, zzat(), zzyhVar, zzaaeVar, list);
    }

    private final void zzap() throws zzit {
        zzaq(new boolean[2], this.zzs.zzn().zzc());
    }

    private final void zzaq(boolean[] zArr, long j) throws zzit {
        zzmm[] zzmmVarArr;
        long j2;
        zzlk zzlkVarZzn = this.zzs.zzn();
        zzaae zzaaeVarZzr = zzlkVarZzn.zzr();
        int i2 = 0;
        while (true) {
            zzmmVarArr = this.zzb;
            if (i2 >= 2) {
                break;
            }
            if (!zzaaeVarZzr.zza(i2)) {
                zzmmVarArr[i2].zzG();
            }
            i2++;
        }
        int i3 = 0;
        while (i3 < 2) {
            if (!zzaaeVarZzr.zza(i3) || zzmmVarArr[i3].zzp(zzlkVarZzn)) {
                j2 = j;
            } else {
                j2 = j;
                zzar(zzlkVarZzn, i3, zArr[i3], j2);
            }
            i3++;
            j = j2;
        }
    }

    private final void zzar(zzlk zzlkVar, int i2, boolean z2, long j) throws zzit {
        zzmm zzmmVar = this.zzb[i2];
        if (zzmmVar.zzM()) {
            return;
        }
        boolean z3 = zzlkVar == this.zzs.zzm();
        zzaae zzaaeVarZzr = zzlkVar.zzr();
        zzml zzmlVar = zzaaeVarZzr.zzb[i2];
        zzzw zzzwVar = zzaaeVarZzr.zzc[i2];
        boolean z4 = zzax() && this.zzG.zze == 3;
        boolean z5 = !z2 && z4;
        this.zzR++;
        zzmmVar.zzx(zzmlVar, zzzwVar, zzlkVar.zzc[i2], this.zzT, z5, z3, j, zzlkVar.zza(), zzlkVar.zzg.zza, this.zzo);
        zzmmVar.zzy(11, new zzkq(this), zzlkVar);
        if (z4 && z3) {
            zzmmVar.zzv();
        }
    }

    private final void zzas(boolean z2) {
        zzlk zzlkVarZzk = this.zzs.zzk();
        zzwg zzwgVar = zzlkVarZzk == null ? this.zzG.zzb : zzlkVarZzk.zzg.zza;
        boolean zEquals = this.zzG.zzk.equals(zzwgVar);
        if (!zEquals) {
            this.zzG = this.zzG.zzh(zzwgVar);
        }
        zzma zzmaVar = this.zzG;
        zzmaVar.zzq = zzlkVarZzk == null ? zzmaVar.zzs : zzlkVarZzk.zzf();
        this.zzG.zzr = zzat();
        if ((!zEquals || z2) && zzlkVarZzk != null && zzlkVarZzk.zze) {
            zzaw(zzlkVarZzk.zzg.zza, zzlkVarZzk.zzq(), zzlkVarZzk.zzr());
        }
    }

    private final long zzat() {
        return zzau(this.zzG.zzq);
    }

    private final long zzau(long j) {
        zzlk zzlkVarZzk = this.zzs.zzk();
        if (zzlkVarZzk == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.zzT - zzlkVarZzk.zza()));
    }

    private final long zzav(zzlk zzlkVar) {
        zzgqa.zzi(zzlkVar.zze);
        return (long) ((zzlkVar.zzc() - this.zzT) / this.zzo.zzj().zzb);
    }

    private final void zzaw(zzwg zzwgVar, zzyh zzyhVar, zzaae zzaaeVar) {
        long jZza;
        long jZza2;
        zzln zzlnVar = this.zzs;
        zzlk zzlkVarZzk = zzlnVar.zzk();
        zzlkVarZzk.getClass();
        if (zzlkVarZzk == zzlnVar.zzm()) {
            jZza = this.zzT;
            jZza2 = zzlkVarZzk.zza();
        } else {
            jZza = this.zzT - zzlkVarZzk.zza();
            jZza2 = zzlkVarZzk.zzg.zzb;
        }
        this.zzg.zzb(new zzlf(this.zzv, this.zzG.zza, zzwgVar, jZza - jZza2, zzau(zzlkVarZzk.zzf()), this.zzo.zzj().zzb, this.zzG.zzl, this.zzL, zzP(this.zzG.zza, zzlkVarZzk.zzg.zza) ? this.zzad.zze() : -9223372036854775807L, this.zzM), zzyhVar, zzaaeVar.zzc);
    }

    private final boolean zzax() {
        zzma zzmaVar = this.zzG;
        return zzmaVar.zzl && zzmaVar.zzn == 0;
    }

    private final void zzay(int i2) throws Throwable {
        zzmm zzmmVar = this.zzb[i2];
        try {
            zzlk zzlkVarZzm = this.zzs.zzm();
            if (zzlkVarZzm == null) {
                throw null;
            }
            zzmmVar.zzu(zzlkVarZzm);
        } catch (IOException e2) {
            e = e2;
            zzmmVar.zze();
            throw e;
        } catch (RuntimeException e3) {
            e = e3;
            zzmmVar.zze();
            throw e;
        }
    }

    private final boolean zzaz() {
        if (!this.zzy) {
            return false;
        }
        zzmm[] zzmmVarArr = this.zzb;
        for (int i2 = 0; i2 < 2; i2++) {
            if (zzmmVarArr[i2].zzc()) {
                return true;
            }
        }
        return false;
    }

    public static int zzr(zzbe zzbeVar, zzbd zzbdVar, int i2, boolean z2, Object obj, zzbf zzbfVar, zzbf zzbfVar2) {
        zzbf zzbfVar3 = zzbfVar;
        Object obj2 = zzbfVar3.zzb(zzbfVar3.zzo(obj, zzbdVar).zzc, zzbeVar, 0L).zzb;
        for (int i3 = 0; i3 < zzbfVar2.zza(); i3++) {
            if (zzbfVar2.zzb(i3, zzbeVar, 0L).zzb.equals(obj2)) {
                return i3;
            }
        }
        int iZze = zzbfVar3.zze(obj);
        int iZzc = zzbfVar3.zzc();
        int iZze2 = -1;
        int i4 = 0;
        while (i4 < iZzc && iZze2 == -1) {
            zzbf zzbfVar4 = zzbfVar3;
            int iZzl = zzbfVar4.zzl(iZze, zzbdVar, zzbeVar, i2, z2);
            if (iZzl == -1) {
                iZze2 = -1;
                break;
            }
            iZze2 = zzbfVar2.zze(zzbfVar4.zzf(iZzl));
            i4++;
            zzbfVar3 = zzbfVar4;
            iZze = iZzl;
        }
        if (iZze2 == -1) {
            return -1;
        }
        return zzbfVar2.zzd(iZze2, zzbdVar, false).zzc;
    }

    public static final /* synthetic */ void zzz(zzme zzmeVar) {
        try {
            zzaE(zzmeVar);
        } catch (zzit e2) {
            zzee.zzf("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e2);
            throw new RuntimeException(e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:233:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:289:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:290:0x05f5 A[Catch: IOException -> 0x0029, zzvg -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztc -> 0x0035, RuntimeException -> 0x058f, zzit -> 0x0592, TRY_LEAVE, TryCatch #34 {zzit -> 0x0592, RuntimeException -> 0x058f, blocks: (B:270:0x058b, B:278:0x05a9, B:279:0x05b2, B:281:0x05c3, B:283:0x05d1, B:287:0x05ea, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad5, B:581:0x0adb, B:585:0x0ae5, B:596:0x0afe, B:593:0x0af7, B:595:0x0afb, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ad0, B:578:0x0ad1, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f5, B:300:0x0611, B:305:0x0622, B:309:0x0634, B:314:0x064a, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b03, B:601:0x0b0e), top: B:687:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:294:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:295:0x0604 A[Catch: RuntimeException -> 0x0711, IOException -> 0x0716, zzvg -> 0x071b, zzhc -> 0x0720, zzat -> 0x0725, zztc -> 0x072a, zzit -> 0x072f, TryCatch #14 {zzat -> 0x0725, zzhc -> 0x0720, zzit -> 0x072f, zztc -> 0x072a, zzvg -> 0x071b, IOException -> 0x0716, RuntimeException -> 0x0711, blocks: (B:292:0x05fb, B:295:0x0604, B:298:0x060d, B:303:0x061c, B:307:0x062c, B:312:0x0642, B:317:0x0656), top: B:692:0x05fb }] */
    /* JADX WARN: Code duplicated, block: B:297:0x060c  */
    /* JADX WARN: Code duplicated, block: B:300:0x0611 A[Catch: IOException -> 0x0029, zzvg -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztc -> 0x0035, RuntimeException -> 0x058f, zzit -> 0x0592, TRY_ENTER, TRY_LEAVE, TryCatch #34 {zzit -> 0x0592, RuntimeException -> 0x058f, blocks: (B:270:0x058b, B:278:0x05a9, B:279:0x05b2, B:281:0x05c3, B:283:0x05d1, B:287:0x05ea, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad5, B:581:0x0adb, B:585:0x0ae5, B:596:0x0afe, B:593:0x0af7, B:595:0x0afb, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ad0, B:578:0x0ad1, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f5, B:300:0x0611, B:305:0x0622, B:309:0x0634, B:314:0x064a, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b03, B:601:0x0b0e), top: B:687:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:302:0x0619 A[LOOP:15: B:298:0x060d->B:302:0x0619, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:321:0x0691 A[Catch: IOException -> 0x0029, zzvg -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztc -> 0x0035, RuntimeException -> 0x058f, zzit -> 0x0592, TryCatch #34 {zzit -> 0x0592, RuntimeException -> 0x058f, blocks: (B:270:0x058b, B:278:0x05a9, B:279:0x05b2, B:281:0x05c3, B:283:0x05d1, B:287:0x05ea, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad5, B:581:0x0adb, B:585:0x0ae5, B:596:0x0afe, B:593:0x0af7, B:595:0x0afb, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ad0, B:578:0x0ad1, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f5, B:300:0x0611, B:305:0x0622, B:309:0x0634, B:314:0x064a, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b03, B:601:0x0b0e), top: B:687:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:341:0x06df  */
    /* JADX WARN: Code duplicated, block: B:350:0x0705 A[Catch: IOException -> 0x0029, zzvg -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztc -> 0x0035, RuntimeException -> 0x058f, zzit -> 0x0592, LOOP:18: B:349:0x0703->B:350:0x0705, LOOP_END, TryCatch #34 {zzit -> 0x0592, RuntimeException -> 0x058f, blocks: (B:270:0x058b, B:278:0x05a9, B:279:0x05b2, B:281:0x05c3, B:283:0x05d1, B:287:0x05ea, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad5, B:581:0x0adb, B:585:0x0ae5, B:596:0x0afe, B:593:0x0af7, B:595:0x0afb, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ad0, B:578:0x0ad1, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f5, B:300:0x0611, B:305:0x0622, B:309:0x0634, B:314:0x064a, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b03, B:601:0x0b0e), top: B:687:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:367:0x073a A[Catch: IOException -> 0x0029, zzvg -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztc -> 0x0035, RuntimeException -> 0x058f, zzit -> 0x0592, TryCatch #34 {zzit -> 0x0592, RuntimeException -> 0x058f, blocks: (B:270:0x058b, B:278:0x05a9, B:279:0x05b2, B:281:0x05c3, B:283:0x05d1, B:287:0x05ea, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad5, B:581:0x0adb, B:585:0x0ae5, B:596:0x0afe, B:593:0x0af7, B:595:0x0afb, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ad0, B:578:0x0ad1, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f5, B:300:0x0611, B:305:0x0622, B:309:0x0634, B:314:0x064a, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b03, B:601:0x0b0e), top: B:687:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:369:0x073e A[Catch: IOException -> 0x0029, zzvg -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztc -> 0x0035, RuntimeException -> 0x058f, zzit -> 0x0592, TryCatch #34 {zzit -> 0x0592, RuntimeException -> 0x058f, blocks: (B:270:0x058b, B:278:0x05a9, B:279:0x05b2, B:281:0x05c3, B:283:0x05d1, B:287:0x05ea, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad5, B:581:0x0adb, B:585:0x0ae5, B:596:0x0afe, B:593:0x0af7, B:595:0x0afb, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ad0, B:578:0x0ad1, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f5, B:300:0x0611, B:305:0x0622, B:309:0x0634, B:314:0x064a, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b03, B:601:0x0b0e), top: B:687:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:371:0x0743 A[Catch: IOException -> 0x0029, zzvg -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztc -> 0x0035, RuntimeException -> 0x058f, zzit -> 0x0592, TryCatch #34 {zzit -> 0x0592, RuntimeException -> 0x058f, blocks: (B:270:0x058b, B:278:0x05a9, B:279:0x05b2, B:281:0x05c3, B:283:0x05d1, B:287:0x05ea, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad5, B:581:0x0adb, B:585:0x0ae5, B:596:0x0afe, B:593:0x0af7, B:595:0x0afb, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ad0, B:578:0x0ad1, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f5, B:300:0x0611, B:305:0x0622, B:309:0x0634, B:314:0x064a, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b03, B:601:0x0b0e), top: B:687:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:373:0x074b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:374:0x074c A[Catch: IOException -> 0x0029, zzvg -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztc -> 0x0035, RuntimeException -> 0x058f, zzit -> 0x0592, TryCatch #34 {zzit -> 0x0592, RuntimeException -> 0x058f, blocks: (B:270:0x058b, B:278:0x05a9, B:279:0x05b2, B:281:0x05c3, B:283:0x05d1, B:287:0x05ea, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad5, B:581:0x0adb, B:585:0x0ae5, B:596:0x0afe, B:593:0x0af7, B:595:0x0afb, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ad0, B:578:0x0ad1, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f5, B:300:0x0611, B:305:0x0622, B:309:0x0634, B:314:0x064a, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b03, B:601:0x0b0e), top: B:687:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:378:0x075a  */
    /* JADX WARN: Code duplicated, block: B:381:0x0766  */
    /* JADX WARN: Code duplicated, block: B:394:0x078d A[Catch: IOException -> 0x0029, zzvg -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztc -> 0x0035, RuntimeException -> 0x058f, zzit -> 0x0592, LOOP:5: B:392:0x0789->B:394:0x078d, LOOP_END, TryCatch #34 {zzit -> 0x0592, RuntimeException -> 0x058f, blocks: (B:270:0x058b, B:278:0x05a9, B:279:0x05b2, B:281:0x05c3, B:283:0x05d1, B:287:0x05ea, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad5, B:581:0x0adb, B:585:0x0ae5, B:596:0x0afe, B:593:0x0af7, B:595:0x0afb, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ad0, B:578:0x0ad1, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f5, B:300:0x0611, B:305:0x0622, B:309:0x0634, B:314:0x064a, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b03, B:601:0x0b0e), top: B:687:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:396:0x07af  */
    /* JADX WARN: Code duplicated, block: B:398:0x07b2 A[Catch: IOException -> 0x0029, zzvg -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztc -> 0x0035, RuntimeException -> 0x058f, zzit -> 0x0592, TryCatch #34 {zzit -> 0x0592, RuntimeException -> 0x058f, blocks: (B:270:0x058b, B:278:0x05a9, B:279:0x05b2, B:281:0x05c3, B:283:0x05d1, B:287:0x05ea, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad5, B:581:0x0adb, B:585:0x0ae5, B:596:0x0afe, B:593:0x0af7, B:595:0x0afb, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ad0, B:578:0x0ad1, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f5, B:300:0x0611, B:305:0x0622, B:309:0x0634, B:314:0x064a, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b03, B:601:0x0b0e), top: B:687:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:440:0x086e A[Catch: IOException -> 0x0029, zzvg -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztc -> 0x0035, RuntimeException -> 0x058f, zzit -> 0x0592, LOOP:8: B:439:0x086c->B:440:0x086e, LOOP_END, TryCatch #34 {zzit -> 0x0592, RuntimeException -> 0x058f, blocks: (B:270:0x058b, B:278:0x05a9, B:279:0x05b2, B:281:0x05c3, B:283:0x05d1, B:287:0x05ea, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad5, B:581:0x0adb, B:585:0x0ae5, B:596:0x0afe, B:593:0x0af7, B:595:0x0afb, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ad0, B:578:0x0ad1, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f5, B:300:0x0611, B:305:0x0622, B:309:0x0634, B:314:0x064a, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b03, B:601:0x0b0e), top: B:687:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:443:0x087c A[Catch: IOException -> 0x0029, zzvg -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztc -> 0x0035, RuntimeException -> 0x058f, zzit -> 0x0592, TryCatch #34 {zzit -> 0x0592, RuntimeException -> 0x058f, blocks: (B:270:0x058b, B:278:0x05a9, B:279:0x05b2, B:281:0x05c3, B:283:0x05d1, B:287:0x05ea, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad5, B:581:0x0adb, B:585:0x0ae5, B:596:0x0afe, B:593:0x0af7, B:595:0x0afb, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ad0, B:578:0x0ad1, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f5, B:300:0x0611, B:305:0x0622, B:309:0x0634, B:314:0x064a, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b03, B:601:0x0b0e), top: B:687:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:447:0x088c A[Catch: IOException -> 0x0029, zzvg -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztc -> 0x0035, RuntimeException -> 0x058f, zzit -> 0x0592, TryCatch #34 {zzit -> 0x0592, RuntimeException -> 0x058f, blocks: (B:270:0x058b, B:278:0x05a9, B:279:0x05b2, B:281:0x05c3, B:283:0x05d1, B:287:0x05ea, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad5, B:581:0x0adb, B:585:0x0ae5, B:596:0x0afe, B:593:0x0af7, B:595:0x0afb, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ad0, B:578:0x0ad1, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f5, B:300:0x0611, B:305:0x0622, B:309:0x0634, B:314:0x064a, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b03, B:601:0x0b0e), top: B:687:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:449:0x0892 A[Catch: IOException -> 0x0029, zzvg -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztc -> 0x0035, RuntimeException -> 0x058f, zzit -> 0x0592, TryCatch #34 {zzit -> 0x0592, RuntimeException -> 0x058f, blocks: (B:270:0x058b, B:278:0x05a9, B:279:0x05b2, B:281:0x05c3, B:283:0x05d1, B:287:0x05ea, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad5, B:581:0x0adb, B:585:0x0ae5, B:596:0x0afe, B:593:0x0af7, B:595:0x0afb, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ad0, B:578:0x0ad1, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f5, B:300:0x0611, B:305:0x0622, B:309:0x0634, B:314:0x064a, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b03, B:601:0x0b0e), top: B:687:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:692:0x05fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:701:0x07ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:716:0x0897 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:730:0x061c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:731:0x05f0 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:407:0x07d8
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:127)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:75)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r43) {
        /*
            Method dump skipped, instruction units count: 3272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlc.handleMessage(android.os.Message):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final void zza(float f) {
        this.zzi.zzh(34);
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final void zzb(int i2) {
        this.zzi.zze(33, i2, 0).zza();
    }

    @Override // com.google.android.gms.internal.ads.zziq
    public final void zzc(zzav zzavVar) {
        this.zzi.zzd(16, zzavVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final void zzcS(long j, long j2, zzv zzvVar, MediaFormat mediaFormat) {
        if (this.zzD) {
            this.zzi.zzc(37).zza();
        }
    }

    public final void zzd() {
        this.zzi.zzc(29).zza();
    }

    public final void zze(boolean z2, int i2, int i3) {
        this.zzi.zze(1, z2 ? 1 : 0, (i3 << 4) | 1).zza();
    }

    public final void zzf(zzbf zzbfVar, int i2, long j) {
        this.zzi.zzd(3, new zzlb(zzbfVar, i2, j)).zza();
    }

    public final void zzg(zzmp zzmpVar) {
        this.zzi.zzd(38, zzmpVar).zza();
    }

    public final void zzh() {
        this.zzi.zzc(6).zza();
    }

    public final void zzi(zzd zzdVar, boolean z2) {
        this.zzi.zzf(31, 0, 0, zzdVar).zza();
    }

    public final void zzj(float f) {
        this.zzi.zzd(32, Float.valueOf(f)).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final void zzk(zzme zzmeVar) {
        if (!this.zzI && this.zzk.getThread().isAlive()) {
            this.zzi.zzd(14, zzmeVar).zza();
        } else {
            zzee.zzc("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            zzmeVar.zzi(false);
        }
    }

    public final boolean zzl(Object obj, long j) {
        if (this.zzI || !this.zzk.getThread().isAlive()) {
            return true;
        }
        zzdq zzdqVar = new zzdq(this.zzq);
        this.zzi.zzd(30, new Pair(obj, zzdqVar)).zza();
        if (j != -9223372036854775807L) {
            return zzdqVar.zze(j);
        }
        return true;
    }

    public final boolean zzm() {
        if (this.zzI || !this.zzk.getThread().isAlive()) {
            return true;
        }
        this.zzI = true;
        zzdq zzdqVar = new zzdq(this.zzq);
        this.zzi.zzd(7, zzdqVar).zza();
        return zzdqVar.zze(this.zzu);
    }

    public final Looper zzn() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final void zzo() {
        zzdx zzdxVar = this.zzi;
        zzdxVar.zzk(2);
        zzdxVar.zzh(22);
    }

    @Override // com.google.android.gms.internal.ads.zzwd
    public final void zzp(zzwe zzweVar) {
        this.zzi.zzd(8, zzweVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaac
    public final void zzq() {
        this.zzi.zzh(10);
    }

    @Override // com.google.android.gms.internal.ads.zzxx
    public final /* bridge */ /* synthetic */ void zzs(zzxy zzxyVar) {
        this.zzi.zzd(9, (zzwe) zzxyVar).zza();
    }

    public final /* synthetic */ zzlk zzt(zzll zzllVar, long j) {
        zzaah zzaahVarZze = this.zzg.zze(this.zzv);
        long j2 = this.zzZ.zzb;
        zzaae zzaaeVar = this.zzf;
        zzlz zzlzVar = this.zzt;
        return new zzlk(this.zzc, j, this.zze, zzaahVarZze, zzlzVar, zzllVar, zzaaeVar, -9223372036854775807L);
    }

    public final /* synthetic */ void zzu(int i2, boolean z2) {
        this.zzw.zzB(i2, this.zzb[i2].zze(), z2);
    }

    public final /* synthetic */ void zzv(int i2) {
        this.zzw.zzW(i2);
    }

    public final /* synthetic */ zzdx zzx() {
        return this.zzi;
    }

    public final void zzy(List list, int i2, long j, zzxz zzxzVar) {
        this.zzi.zzd(17, new zzkw(list, zzxzVar, i2, j, null)).zza();
    }
}
