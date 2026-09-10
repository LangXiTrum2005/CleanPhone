package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class zzln {
    private final zzmu zzc;
    private final zzdx zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzjd zzh;
    private zzlk zzi;
    private zzlk zzj;
    private zzlk zzk;
    private zzlk zzl;
    private zzlk zzm;
    private int zzn;
    private Object zzo;
    private long zzp;
    private final zzkv zzr;
    private final zzbd zza = new zzbd();
    private final zzbe zzb = new zzbe();
    private List zzq = new ArrayList();

    public zzln(zzmu zzmuVar, zzdx zzdxVar, zzkv zzkvVar, zzjd zzjdVar) {
        this.zzc = zzmuVar;
        this.zzd = zzdxVar;
        this.zzr = zzkvVar;
        this.zzh = zzjdVar;
    }

    private static zzwg zzA(zzbf zzbfVar, Object obj, long j, long j2, zzbe zzbeVar, zzbd zzbdVar) {
        zzbfVar.zzo(obj, zzbdVar);
        zzbfVar.zzb(zzbdVar.zzc, zzbeVar, 0L);
        zzbfVar.zze(obj);
        zzbdVar.zzb();
        zzbfVar.zzo(obj, zzbdVar);
        int iZze = zzbdVar.zze(j);
        return iZze == -1 ? new zzwg(obj, j2, zzbdVar.zzf(j)) : new zzwg(obj, iZze, zzbdVar.zzd(iZze), j2);
    }

    private final void zzB() {
        int i2 = zzgtd.zzd;
        final zzgta zzgtaVar = new zzgta();
        for (zzlk zzlkVarZzp = this.zzi; zzlkVarZzp != null; zzlkVarZzp = zzlkVarZzp.zzp()) {
            zzgtaVar.zzf(zzlkVarZzp.zzg.zza);
        }
        zzlk zzlkVar = this.zzj;
        final zzwg zzwgVar = zzlkVar == null ? null : zzlkVar.zzg.zza;
        this.zzd.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlm
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzz(zzgtaVar, zzwgVar);
            }
        });
    }

    private final long zzC(Object obj) {
        for (int i2 = 0; i2 < this.zzq.size(); i2++) {
            zzlk zzlkVar = (zzlk) this.zzq.get(i2);
            if (zzlkVar.zzb.equals(obj)) {
                return zzlkVar.zzg.zza.zzd;
            }
        }
        return -1L;
    }

    private final int zzD(zzbf zzbfVar) {
        zzbf zzbfVar2;
        zzlk zzlkVarZzp = this.zzi;
        if (zzlkVarZzp == null) {
            return 0;
        }
        int iZze = zzbfVar.zze(zzlkVarZzp.zzb);
        while (true) {
            zzbfVar2 = zzbfVar;
            iZze = zzbfVar2.zzl(iZze, this.zza, this.zzb, this.zzf, this.zzg);
            while (true) {
                zzlkVarZzp.getClass();
                if (zzlkVarZzp.zzp() == null || zzlkVarZzp.zzg.zzh) {
                    break;
                }
                zzlkVarZzp = zzlkVarZzp.zzp();
            }
            zzlk zzlkVarZzp2 = zzlkVarZzp.zzp();
            if (iZze == -1 || zzlkVarZzp2 == null || zzbfVar2.zze(zzlkVarZzp2.zzb) != iZze) {
                break;
            }
            zzlkVarZzp = zzlkVarZzp2;
            zzbfVar = zzbfVar2;
        }
        int iZzs = zzs(zzlkVarZzp);
        zzlkVarZzp.zzg = zzx(zzbfVar2, zzlkVarZzp.zzg);
        return iZzs;
    }

    private final zzll zzE(zzbf zzbfVar, zzlk zzlkVar, long j) {
        zzbf zzbfVar2;
        long j2;
        zzbe zzbeVar;
        Object obj;
        long j3;
        long j4;
        long j5;
        zzll zzllVar = zzlkVar.zzg;
        long jZza = zzlkVar.zza();
        long j6 = zzllVar.zze;
        long j7 = (jZza + j6) - j;
        if (!zzllVar.zzh) {
            zzwg zzwgVar = zzllVar.zza;
            Object obj2 = zzwgVar.zza;
            zzbd zzbdVar = this.zza;
            zzbfVar.zzo(obj2, zzbdVar);
            if (!zzwgVar.zzb()) {
                int i2 = zzwgVar.zze;
                if (i2 != -1) {
                    zzbdVar.zzi(i2);
                }
                int iZzd = zzbdVar.zzd(i2);
                zzbdVar.zzk(i2);
                if (iZzd != zzbdVar.zzg(i2)) {
                    return zzG(zzbfVar, obj2, i2, iZzd, j6, zzwgVar.zzd, false);
                }
                zzK(zzbfVar, obj2, i2);
                return zzH(zzbfVar, obj2, 0L, j6, zzwgVar.zzd, false);
            }
            int i3 = zzwgVar.zzb;
            if (zzbdVar.zzg(i3) == -1) {
                return null;
            }
            int iZza = zzbdVar.zzg.zza(i3).zza(zzwgVar.zzc);
            if (iZza < 0) {
                return zzG(zzbfVar, obj2, i3, iZza, zzllVar.zzc, zzwgVar.zzd, false);
            }
            long jLongValue = zzllVar.zzc;
            if (jLongValue == -9223372036854775807L) {
                Pair pairZzn = zzbfVar.zzn(this.zzb, zzbdVar, zzbdVar.zzc, -9223372036854775807L, Math.max(0L, j7));
                zzbfVar2 = zzbfVar;
                if (pairZzn == null) {
                    return null;
                }
                jLongValue = ((Long) pairZzn.second).longValue();
                j2 = -9223372036854775807L;
            } else {
                zzbfVar2 = zzbfVar;
                j2 = jLongValue;
            }
            zzK(zzbfVar2, obj2, i3);
            return zzH(zzbfVar2, obj2, Math.max(0L, jLongValue), j2, zzwgVar.zzd, false);
        }
        zzwg zzwgVar2 = zzllVar.zza;
        Object obj3 = zzwgVar2.zza;
        int iZze = zzbfVar.zze(obj3);
        int i4 = this.zzf;
        boolean z2 = this.zzg;
        zzbe zzbeVar2 = this.zzb;
        zzbd zzbdVar2 = this.zza;
        long j8 = 0;
        int iZzl = zzbfVar.zzl(iZze, zzbdVar2, zzbeVar2, i4, z2);
        if (iZzl == -1) {
            return null;
        }
        int i5 = zzbfVar.zzd(iZzl, zzbdVar2, true).zzc;
        Object obj4 = zzbdVar2.zzb;
        obj4.getClass();
        long j9 = zzwgVar2.zzd;
        if (zzbfVar.zzb(i5, zzbeVar2, 0L).zzn == iZzl) {
            Pair pairZzn2 = zzbfVar.zzn(zzbeVar2, zzbdVar2, i5, -9223372036854775807L, Math.max(0L, j7));
            if (pairZzn2 == null) {
                return null;
            }
            Object obj5 = pairZzn2.first;
            long jLongValue2 = ((Long) pairZzn2.second).longValue();
            zzlk zzlkVarZzp = zzlkVar.zzp();
            if (zzlkVarZzp == null || !zzlkVarZzp.zzb.equals(obj5)) {
                long jZzC = zzC(obj5);
                if (jZzC == -1) {
                    jZzC = this.zze;
                    this.zze = 1 + jZzC;
                }
                j5 = jZzC;
            } else {
                j5 = zzlkVarZzp.zzg.zza.zzd;
            }
            zzbeVar = zzbeVar2;
            j3 = jLongValue2;
            obj = obj5;
            j4 = j5;
            j8 = -9223372036854775807L;
        } else {
            zzbeVar = zzbeVar2;
            obj = obj4;
            j3 = 0;
            j4 = j9;
        }
        zzwg zzwgVarZzA = zzA(zzbfVar, obj, j3, j4, zzbeVar, zzbdVar2);
        long j10 = j3;
        if (j8 != -9223372036854775807L && zzllVar.zzc != -9223372036854775807L) {
            zzbfVar.zzo(obj3, zzbdVar2).zzb();
            int i6 = zzbdVar2.zzg.zzd;
        }
        return zzF(zzbfVar, zzwgVarZzA, j8, j10);
    }

    private final zzll zzF(zzbf zzbfVar, zzwg zzwgVar, long j, long j2) {
        Object obj = zzwgVar.zza;
        zzbfVar.zzo(obj, this.zza);
        return zzwgVar.zzb() ? zzG(zzbfVar, obj, zzwgVar.zzb, zzwgVar.zzc, j, zzwgVar.zzd, false) : zzH(zzbfVar, obj, j2, j, zzwgVar.zzd, false);
    }

    private final zzll zzG(zzbf zzbfVar, Object obj, int i2, int i3, long j, long j2, boolean z2) {
        zzwg zzwgVar = new zzwg(obj, i2, i3, j2);
        Object obj2 = zzwgVar.zza;
        int i4 = zzwgVar.zzb;
        int i5 = zzwgVar.zzc;
        zzbd zzbdVar = this.zza;
        long jZzh = zzbfVar.zzo(obj2, zzbdVar).zzh(i4, i5);
        if (i3 == zzbdVar.zzd(i2)) {
            zzbdVar.zzj();
        }
        zzbdVar.zzk(i4);
        long jMax = 0;
        if (jZzh != -9223372036854775807L && jZzh <= 0) {
            jMax = Math.max(0L, (-1) + jZzh);
        }
        return new zzll(zzwgVar, jMax, j, -9223372036854775807L, jZzh, false, false, false, false, false);
    }

    private final zzll zzH(zzbf zzbfVar, Object obj, long j, long j2, long j3, boolean z2) {
        long j4;
        long j5;
        long j6;
        long jMax = j;
        zzbd zzbdVar = this.zza;
        zzbfVar.zzo(obj, zzbdVar);
        int iZzf = zzbdVar.zzf(jMax);
        if (iZzf == -1) {
            zzbdVar.zzb();
        } else {
            zzbdVar.zzk(iZzf);
        }
        zzwg zzwgVar = new zzwg(obj, j3, iZzf);
        boolean zZzL = zzL(zzwgVar);
        boolean zZzI = zzI(zzbfVar, zzwgVar);
        boolean zZzJ = zzJ(zzbfVar, zzwgVar, zZzL);
        if (iZzf != -1) {
            zzbdVar.zzk(iZzf);
        }
        if (iZzf != -1) {
            zzbdVar.zzi(iZzf);
        }
        if (iZzf != -1) {
            zzbdVar.zzc(iZzf);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        if (j4 != -9223372036854775807L) {
            j6 = j4;
            j5 = j6;
        } else {
            j5 = zzbdVar.zzd;
            j6 = -9223372036854775807L;
        }
        if (j5 != -9223372036854775807L && jMax >= j5) {
            jMax = Math.max(0L, j5 - 1);
        }
        return new zzll(zzwgVar, jMax, j2, j6, j5, false, false, zZzL, zZzI, zZzJ);
    }

    private final boolean zzI(zzbf zzbfVar, zzwg zzwgVar) {
        if (!zzL(zzwgVar)) {
            return false;
        }
        Object obj = zzwgVar.zza;
        return zzbfVar.zzb(zzbfVar.zzo(obj, this.zza).zzc, this.zzb, 0L).zzo == zzbfVar.zze(obj);
    }

    private final boolean zzJ(zzbf zzbfVar, zzwg zzwgVar, boolean z2) {
        int iZze = zzbfVar.zze(zzwgVar.zza);
        zzbd zzbdVar = this.zza;
        int i2 = zzbfVar.zzd(iZze, zzbdVar, false).zzc;
        zzbe zzbeVar = this.zzb;
        return !zzbfVar.zzb(i2, zzbeVar, 0L).zzi && zzbfVar.zzl(iZze, zzbdVar, zzbeVar, this.zzf, this.zzg) == -1 && z2;
    }

    private final long zzK(zzbf zzbfVar, Object obj, int i2) {
        zzbd zzbdVar = this.zza;
        zzbfVar.zzo(obj, zzbdVar);
        zzbdVar.zzc(i2);
        long j = zzbdVar.zzg.zza(i2).zzi;
        return 0L;
    }

    private static final boolean zzL(zzwg zzwgVar) {
        return !zzwgVar.zzb() && zzwgVar.zze == -1;
    }

    public final int zza(zzbf zzbfVar, int i2) {
        this.zzf = i2;
        return zzD(zzbfVar);
    }

    public final int zzb(zzbf zzbfVar, boolean z2) {
        this.zzg = z2;
        return zzD(zzbfVar);
    }

    public final void zzc(zzbf zzbfVar, zzjd zzjdVar) {
        this.zzh = zzjdVar;
        long j = zzjdVar.zzb;
        zzj();
    }

    public final boolean zzd(zzwe zzweVar) {
        zzlk zzlkVar = this.zzl;
        return zzlkVar != null && zzlkVar.zza == zzweVar;
    }

    public final boolean zze(zzwe zzweVar) {
        zzlk zzlkVar = this.zzm;
        return zzlkVar != null && zzlkVar.zza == zzweVar;
    }

    public final void zzf(long j) {
        zzlk zzlkVar = this.zzl;
        if (zzlkVar != null) {
            zzlkVar.zzi(j);
        }
    }

    public final boolean zzg() {
        zzlk zzlkVar = this.zzl;
        if (zzlkVar != null) {
            return !zzlkVar.zzg.zzj && zzlkVar.zzd() && this.zzl.zzg.zze != -9223372036854775807L && this.zzn < 100;
        }
        return true;
    }

    public final zzll zzh(long j, zzma zzmaVar) {
        zzlk zzlkVar = this.zzl;
        return zzlkVar == null ? zzF(zzmaVar.zza, zzmaVar.zzb, zzmaVar.zzc, zzmaVar.zzs) : zzE(zzmaVar.zza, zzlkVar, j);
    }

    public final zzlk zzi(zzll zzllVar) {
        zzlk zzlkVarZza;
        zzlk zzlkVar = this.zzl;
        long jZza = zzlkVar == null ? 1000000000000L : (zzlkVar.zza() + zzlkVar.zzg.zze) - zzllVar.zzb;
        int i2 = 0;
        while (true) {
            if (i2 >= this.zzq.size()) {
                zzlkVarZza = null;
                break;
            }
            zzll zzllVar2 = ((zzlk) this.zzq.get(i2)).zzg;
            long j = zzllVar2.zze;
            long j2 = zzllVar.zze;
            if ((j == -9223372036854775807L || j == j2) && zzllVar2.zzb == zzllVar.zzb && zzllVar2.zza.equals(zzllVar.zza)) {
                zzlkVarZza = (zzlk) this.zzq.remove(i2);
                break;
            }
            i2++;
        }
        if (zzlkVarZza == null) {
            zzlkVarZza = this.zzr.zza(zzllVar, jZza);
        } else {
            zzlkVarZza.zzg = zzllVar;
            zzlkVarZza.zzb(jZza);
        }
        zzlk zzlkVar2 = this.zzl;
        if (zzlkVar2 != null) {
            zzlkVar2.zzo(zzlkVarZza);
        } else {
            this.zzi = zzlkVarZza;
            this.zzj = zzlkVarZza;
            this.zzk = zzlkVarZza;
        }
        this.zzo = null;
        this.zzl = zzlkVarZza;
        this.zzn++;
        zzB();
        return zzlkVarZza;
    }

    public final void zzj() {
        if (this.zzq.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.zzq.size(); i2++) {
            ((zzlk) this.zzq.get(i2)).zzn();
        }
        this.zzq = arrayList;
        this.zzm = null;
        zzt();
    }

    public final zzlk zzk() {
        return this.zzl;
    }

    public final zzlk zzl() {
        return this.zzm;
    }

    public final zzlk zzm() {
        return this.zzi;
    }

    public final zzlk zzn() {
        return this.zzj;
    }

    public final zzlk zzo() {
        return this.zzk;
    }

    public final zzlk zzp() {
        zzlk zzlkVar = this.zzk;
        zzlk zzlkVar2 = this.zzj;
        if (zzlkVar == zzlkVar2) {
            zzlkVar2.getClass();
            this.zzk = zzlkVar2.zzp();
        }
        zzlkVar2.getClass();
        this.zzj = zzlkVar2.zzp();
        zzB();
        zzlk zzlkVar3 = this.zzj;
        zzlkVar3.getClass();
        return zzlkVar3;
    }

    public final zzlk zzq() {
        zzlk zzlkVar = this.zzk;
        zzlkVar.getClass();
        this.zzk = zzlkVar.zzp();
        zzB();
        zzlk zzlkVar2 = this.zzk;
        zzlkVar2.getClass();
        return zzlkVar2;
    }

    public final zzlk zzr() {
        zzlk zzlkVar = this.zzi;
        if (zzlkVar == null) {
            return null;
        }
        if (zzlkVar == this.zzj) {
            this.zzj = zzlkVar.zzp();
        }
        if (zzlkVar == this.zzk) {
            this.zzk = zzlkVar.zzp();
        }
        zzlkVar.zzn();
        int i2 = this.zzn - 1;
        this.zzn = i2;
        if (i2 == 0) {
            this.zzl = null;
            zzlk zzlkVar2 = this.zzi;
            this.zzo = zzlkVar2.zzb;
            this.zzp = zzlkVar2.zzg.zza.zzd;
        }
        this.zzi = this.zzi.zzp();
        zzB();
        return this.zzi;
    }

    public final int zzs(zzlk zzlkVar) {
        zzlkVar.getClass();
        int i2 = 0;
        if (zzlkVar.equals(this.zzl)) {
            return 0;
        }
        this.zzl = zzlkVar;
        while (zzlkVar.zzp() != null) {
            zzlkVar = zzlkVar.zzp();
            zzlkVar.getClass();
            if (zzlkVar == this.zzj) {
                zzlk zzlkVar2 = this.zzi;
                this.zzj = zzlkVar2;
                this.zzk = zzlkVar2;
                i2 = 3;
            }
            if (zzlkVar == this.zzk) {
                this.zzk = this.zzj;
                i2 |= 2;
            }
            zzlkVar.zzn();
            this.zzn--;
        }
        zzlk zzlkVar3 = this.zzl;
        zzlkVar3.getClass();
        zzlkVar3.zzo(null);
        zzB();
        return i2;
    }

    public final void zzt() {
        zzlk zzlkVar = this.zzm;
        if (zzlkVar == null || zzlkVar.zze()) {
            this.zzm = null;
            for (int i2 = 0; i2 < this.zzq.size(); i2++) {
                zzlk zzlkVar2 = (zzlk) this.zzq.get(i2);
                if (!zzlkVar2.zze()) {
                    this.zzm = zzlkVar2;
                    return;
                }
            }
        }
    }

    public final zzlk zzu(zzwe zzweVar) {
        for (int i2 = 0; i2 < this.zzq.size(); i2++) {
            zzlk zzlkVar = (zzlk) this.zzq.get(i2);
            if (zzlkVar.zza == zzweVar) {
                return zzlkVar;
            }
        }
        return null;
    }

    public final void zzv() {
        if (this.zzn == 0) {
            return;
        }
        zzlk zzlkVarZzp = this.zzi;
        zzlkVarZzp.getClass();
        this.zzo = zzlkVarZzp.zzb;
        this.zzp = zzlkVarZzp.zzg.zza.zzd;
        while (zzlkVarZzp != null) {
            zzlkVarZzp.zzn();
            zzlkVarZzp = zzlkVarZzp.zzp();
        }
        this.zzi = null;
        this.zzl = null;
        this.zzj = null;
        this.zzk = null;
        this.zzn = 0;
        zzB();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    public final int zzw(zzbf zzbfVar, long j, long j2, long j3) {
        zzll zzllVarZzx;
        boolean z2;
        zzlk zzlkVarZzp = this.zzi;
        zzlk zzlkVar = null;
        while (true) {
            int i2 = 0;
            if (zzlkVarZzp == null) {
                return 0;
            }
            zzll zzllVar = zzlkVarZzp.zzg;
            if (zzlkVar == null) {
                zzllVarZzx = zzx(zzbfVar, zzllVar);
            } else {
                zzll zzllVarZzE = zzE(zzbfVar, zzlkVar, j);
                if (zzllVarZzE == null || zzllVar.zzb != zzllVarZzE.zzb || !zzllVar.zza.equals(zzllVarZzE.zza)) {
                    return zzs(zzlkVar);
                }
                zzllVarZzx = zzllVarZzE;
            }
            zzlkVarZzp.zzg = zzllVarZzx.zzb(zzllVar.zzc);
            long j4 = zzllVar.zze;
            long j5 = zzllVarZzx.zze;
            if (j4 != j5) {
                zzlkVarZzp.zzs();
                long jZza = j5 == -9223372036854775807L ? Long.MAX_VALUE : j5 + zzlkVarZzp.zza();
                if (zzlkVarZzp == this.zzj) {
                    boolean z3 = zzlkVarZzp.zzg.zzg;
                    if (j2 == Long.MIN_VALUE || j2 >= jZza) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                boolean z4 = zzlkVarZzp == this.zzk && (j3 == Long.MIN_VALUE || j3 >= jZza);
                int iZzs = zzs(zzlkVarZzp);
                if (iZzs != 0) {
                    return iZzs;
                }
                if (j4 == -9223372036854775807L) {
                    j4 = -9223372036854775807L;
                }
                if (z2 && j4 != -9223372036854775807L) {
                    i2 = 1;
                }
                return z4 ? i2 | 2 : i2;
            }
            zzlkVar = zzlkVarZzp;
            zzlkVarZzp = zzlkVarZzp.zzp();
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0057  */
    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0061  */
    public final zzll zzx(zzbf zzbfVar, zzll zzllVar) {
        long j;
        long jZzh;
        long j2;
        long j3;
        int i2;
        int i3;
        zzwg zzwgVar = zzllVar.zza;
        boolean zZzL = zzL(zzwgVar);
        boolean zZzI = zzI(zzbfVar, zzwgVar);
        boolean zZzJ = zzJ(zzbfVar, zzwgVar, zZzL);
        Object obj = zzwgVar.zza;
        zzbd zzbdVar = this.zza;
        zzbfVar.zzo(obj, zzbdVar);
        if (zzwgVar.zzb() || (i3 = zzwgVar.zze) == -1) {
            j = -9223372036854775807L;
        } else {
            zzbdVar.zzc(i3);
            j = 0;
        }
        if (!zzwgVar.zzb()) {
            if (j != -9223372036854775807L) {
                j2 = 0;
                j3 = 0;
            } else {
                jZzh = zzbdVar.zzd;
            }
            if (zzwgVar.zzb()) {
                zzbdVar.zzk(zzwgVar.zzb);
            } else {
                i2 = zzwgVar.zze;
                if (i2 != -1) {
                    zzbdVar.zzk(i2);
                }
            }
            return new zzll(zzwgVar, zzllVar.zzb, zzllVar.zzc, j3, j2, false, false, zZzL, zZzI, zZzJ);
        }
        jZzh = zzbdVar.zzh(zzwgVar.zzb, zzwgVar.zzc);
        j2 = jZzh;
        j3 = j;
        if (zzwgVar.zzb()) {
            zzbdVar.zzk(zzwgVar.zzb);
        } else {
            i2 = zzwgVar.zze;
            if (i2 != -1) {
                zzbdVar.zzk(i2);
            }
        }
        return new zzll(zzwgVar, zzllVar.zzb, zzllVar.zzc, j3, j2, false, false, zZzL, zZzI, zZzJ);
    }

    public final zzwg zzy(zzbf zzbfVar, Object obj, long j) {
        long jZzC;
        int iZze;
        zzbd zzbdVar = this.zza;
        int i2 = zzbfVar.zzo(obj, zzbdVar).zzc;
        Object obj2 = this.zzo;
        if (obj2 == null || (iZze = zzbfVar.zze(obj2)) == -1 || zzbfVar.zzd(iZze, zzbdVar, false).zzc != i2) {
            zzlk zzlkVarZzp = this.zzi;
            while (true) {
                if (zzlkVarZzp == null) {
                    zzlk zzlkVarZzp2 = this.zzi;
                    while (true) {
                        if (zzlkVarZzp2 == null) {
                            jZzC = zzC(obj);
                            if (jZzC != -1) {
                                break;
                            }
                            jZzC = this.zze;
                            this.zze = 1 + jZzC;
                            if (this.zzi != null) {
                                break;
                            }
                            this.zzo = obj;
                            this.zzp = jZzC;
                            break;
                        }
                        int iZze2 = zzbfVar.zze(zzlkVarZzp2.zzb);
                        if (iZze2 != -1 && zzbfVar.zzd(iZze2, zzbdVar, false).zzc == i2) {
                            jZzC = zzlkVarZzp2.zzg.zza.zzd;
                            break;
                        }
                        zzlkVarZzp2 = zzlkVarZzp2.zzp();
                    }
                } else {
                    if (zzlkVarZzp.zzb.equals(obj)) {
                        jZzC = zzlkVarZzp.zzg.zza.zzd;
                        break;
                    }
                    zzlkVarZzp = zzlkVarZzp.zzp();
                }
            }
        } else {
            jZzC = this.zzp;
        }
        long j2 = jZzC;
        zzbfVar.zzo(obj, zzbdVar);
        int i3 = zzbdVar.zzc;
        zzbe zzbeVar = this.zzb;
        zzbfVar.zzb(i3, zzbeVar, 0L);
        Object obj3 = obj;
        for (int iZze3 = zzbfVar.zze(obj); iZze3 >= zzbeVar.zzn; iZze3--) {
            zzbfVar.zzd(iZze3, zzbdVar, true);
            zzbdVar.zzb();
            if (zzbdVar.zze(zzbdVar.zzd) != -1) {
                Object obj4 = zzbdVar.zzb;
                obj4.getClass();
                obj3 = obj4;
            }
        }
        return zzA(zzbfVar, obj3, j, j2, zzbeVar, zzbdVar);
    }

    public final /* synthetic */ void zzz(zzgta zzgtaVar, zzwg zzwgVar) {
        this.zzc.zzz(zzgtaVar.zzi(), zzwgVar);
    }
}
