package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzxv implements zzaga {
    private boolean zzB;
    private final zzxq zza;
    private final zztk zzd;
    private final zztf zze;
    private zzxu zzf;
    private zzv zzg;
    private zztd zzh;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private boolean zzw;
    private zzv zzz;
    private final zzxr zzb = new zzxr();
    private int zzi = 1000;
    private long[] zzj = new long[1000];
    private long[] zzk = new long[1000];
    private long[] zzn = new long[1000];
    private int[] zzm = new int[1000];
    private int[] zzl = new int[1000];
    private zzafz[] zzo = new zzafz[1000];
    private final zzyc zzc = new zzyc(zzxs.zza);
    private long zzt = Long.MIN_VALUE;
    private long zzu = Long.MIN_VALUE;
    private long zzv = Long.MIN_VALUE;
    private boolean zzy = true;
    private boolean zzx = true;
    private boolean zzA = true;

    public zzxv(zzaah zzaahVar, zztk zztkVar, zztf zztfVar) {
        this.zzd = zztkVar;
        this.zze = zztfVar;
        this.zza = new zzxq(zzaahVar);
    }

    private final synchronized void zzA() {
        this.zzs = 0;
        this.zza.zzb();
    }

    private final synchronized int zzB(zzle zzleVar, zzih zzihVar, boolean z2, boolean z3, zzxr zzxrVar) {
        try {
            zzihVar.zzd = false;
            if (!zzH()) {
                if (!z3 && !this.zzw) {
                    zzv zzvVar = this.zzz;
                    if (zzvVar == null || (!z2 && zzvVar == this.zzg)) {
                        return -3;
                    }
                    zzI(zzvVar, zzleVar);
                    return -5;
                }
                zzihVar.zzg(4);
                zzihVar.zze = Long.MIN_VALUE;
                return -4;
            }
            zzv zzvVar2 = ((zzxt) this.zzc.zza(this.zzq + this.zzs)).zza;
            if (!z2 && zzvVar2 == this.zzg) {
                int iZzM = zzM(this.zzs);
                if (!zzJ(iZzM)) {
                    zzihVar.zzd = true;
                    return -3;
                }
                zzihVar.zzg(this.zzm[iZzM]);
                if (this.zzs == this.zzp - 1 && (z3 || this.zzw)) {
                    zzihVar.zzh(536870912);
                }
                zzihVar.zze = this.zzn[iZzM];
                zzxrVar.zza = this.zzl[iZzM];
                zzxrVar.zzb = this.zzk[iZzM];
                zzxrVar.zzc = this.zzo[iZzM];
                return -4;
            }
            zzI(zzvVar2, zzleVar);
            return -5;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized boolean zzC(zzv zzvVar) {
        try {
            this.zzy = false;
            if (Objects.equals(zzvVar, this.zzz)) {
                return false;
            }
            zzyc zzycVar = this.zzc;
            if (zzycVar.zzf() || !((zzxt) zzycVar.zzc()).zza.equals(zzvVar)) {
                this.zzz = zzvVar;
            } else {
                this.zzz = ((zzxt) zzycVar.zzc()).zza;
            }
            boolean z2 = this.zzA;
            zzv zzvVar2 = this.zzz;
            this.zzA = z2 & zzas.zzd(zzvVar2.zzo, zzvVar2.zzk);
            this.zzB = false;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x000f  */
    private final synchronized long zzD(long j, boolean z2, boolean z3) throws Throwable {
        Throwable th;
        try {
            try {
                int i2 = this.zzp;
                if (i2 != 0) {
                    long[] jArr = this.zzn;
                    int i3 = this.zzr;
                    if (j >= jArr[i3]) {
                        if (z3) {
                            try {
                                int i4 = this.zzs;
                                if (i4 != i2) {
                                    i2 = i4 + 1;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        int iZzK = zzK(i3, i2, j, false);
                        if (iZzK != -1) {
                            return zzL(iZzK);
                        }
                    }
                }
                return -1L;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private final synchronized long zzE() {
        int i2 = this.zzp;
        if (i2 == 0) {
            return -1L;
        }
        return zzL(i2);
    }

    private final void zzF() {
        if (this.zzh != null) {
            this.zzh = null;
            this.zzg = null;
        }
    }

    private final synchronized void zzG(long j, int i2, long j2, int i3, zzafz zzafzVar) {
        try {
            int i4 = this.zzp;
            if (i4 > 0) {
                int iZzM = zzM(i4 - 1);
                zzgqa.zza(this.zzk[iZzM] + ((long) this.zzl[iZzM]) <= j2);
            }
            this.zzw = (536870912 & i2) != 0;
            this.zzv = Math.max(this.zzv, j);
            int iZzM2 = zzM(this.zzp);
            this.zzn[iZzM2] = j;
            this.zzk[iZzM2] = j2;
            this.zzl[iZzM2] = i3;
            this.zzm[iZzM2] = i2;
            this.zzo[iZzM2] = zzafzVar;
            this.zzj[iZzM2] = 0;
            zzyc zzycVar = this.zzc;
            if (zzycVar.zzf() || !((zzxt) zzycVar.zzc()).zza.equals(this.zzz)) {
                zzv zzvVar = this.zzz;
                if (zzvVar == null) {
                    throw null;
                }
                zzycVar.zzb(this.zzq + this.zzp, new zzxt(zzvVar, zztj.zzb, null));
            }
            int i5 = this.zzp + 1;
            this.zzp = i5;
            int i6 = this.zzi;
            if (i5 == i6) {
                int i7 = i6 + 1000;
                long[] jArr = new long[i7];
                long[] jArr2 = new long[i7];
                long[] jArr3 = new long[i7];
                int[] iArr = new int[i7];
                int[] iArr2 = new int[i7];
                zzafz[] zzafzVarArr = new zzafz[i7];
                int i8 = this.zzr;
                int i9 = i6 - i8;
                System.arraycopy(this.zzk, i8, jArr2, 0, i9);
                System.arraycopy(this.zzn, this.zzr, jArr3, 0, i9);
                System.arraycopy(this.zzm, this.zzr, iArr, 0, i9);
                System.arraycopy(this.zzl, this.zzr, iArr2, 0, i9);
                System.arraycopy(this.zzo, this.zzr, zzafzVarArr, 0, i9);
                System.arraycopy(this.zzj, this.zzr, jArr, 0, i9);
                int i10 = this.zzr;
                System.arraycopy(this.zzk, 0, jArr2, i9, i10);
                System.arraycopy(this.zzn, 0, jArr3, i9, i10);
                System.arraycopy(this.zzm, 0, iArr, i9, i10);
                System.arraycopy(this.zzl, 0, iArr2, i9, i10);
                System.arraycopy(this.zzo, 0, zzafzVarArr, i9, i10);
                System.arraycopy(this.zzj, 0, jArr, i9, i10);
                this.zzk = jArr2;
                this.zzn = jArr3;
                this.zzm = iArr;
                this.zzl = iArr2;
                this.zzo = zzafzVarArr;
                this.zzj = jArr;
                this.zzr = 0;
                this.zzi = i7;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final boolean zzH() {
        return this.zzs != this.zzp;
    }

    private final void zzI(zzv zzvVar, zzle zzleVar) {
        zzv zzvVar2 = this.zzg;
        zzq zzqVar = zzvVar2 == null ? null : zzvVar2.zzs;
        this.zzg = zzvVar;
        zzq zzqVar2 = zzvVar.zzs;
        zztk zztkVar = this.zzd;
        zzleVar.zzb = zzvVar.zzb(zztkVar.zzb(zzvVar));
        zzleVar.zza = this.zzh;
        if (zzvVar2 == null || !Objects.equals(zzqVar, zzqVar2)) {
            zztd zztdVarZza = zztkVar.zza(this.zze, zzvVar);
            this.zzh = zztdVarZza;
            zzleVar.zza = zztdVarZza;
        }
    }

    private final boolean zzJ(int i2) {
        if (this.zzh == null) {
            return true;
        }
        int i3 = this.zzm[i2];
        return false;
    }

    private final int zzK(int i2, int i3, long j, boolean z2) {
        int i4 = -1;
        for (int i5 = 0; i5 < i3; i5++) {
            long j2 = this.zzn[i2];
            if (j2 > j) {
                break;
            }
            if (!z2 || (this.zzm[i2] & 1) != 0) {
                if (j2 == j) {
                    return i5;
                }
                i4 = i5;
            }
            i2++;
            if (i2 == this.zzi) {
                i2 = 0;
            }
        }
        return i4;
    }

    private final long zzL(int i2) {
        long j = this.zzu;
        long jMax = Long.MIN_VALUE;
        if (i2 != 0) {
            int iZzM = zzM(i2 - 1);
            for (int i3 = 0; i3 < i2; i3++) {
                jMax = Math.max(jMax, this.zzn[iZzM]);
                if ((this.zzm[iZzM] & 1) != 0) {
                    break;
                }
                iZzM--;
                if (iZzM == -1) {
                    iZzM = this.zzi - 1;
                }
            }
        }
        this.zzu = Math.max(j, jMax);
        this.zzp -= i2;
        int i4 = this.zzq + i2;
        this.zzq = i4;
        int i5 = this.zzr + i2;
        this.zzr = i5;
        int i6 = this.zzi;
        if (i5 >= i6) {
            this.zzr = i5 - i6;
        }
        int i7 = this.zzs - i2;
        this.zzs = i7;
        if (i7 < 0) {
            this.zzs = 0;
        }
        this.zzc.zzd(i4);
        if (this.zzp != 0) {
            return this.zzk[this.zzr];
        }
        int i8 = this.zzr;
        if (i8 == 0) {
            i8 = this.zzi;
        }
        int i9 = i8 - 1;
        return this.zzk[i9] + ((long) this.zzl[i9]);
    }

    private final int zzM(int i2) {
        int i3 = this.zzr + i2;
        int i4 = this.zzi;
        return i3 < i4 ? i3 : i3 - i4;
    }

    public final void zza() {
        zzb(true);
        zzF();
    }

    public final void zzb(boolean z2) {
        this.zza.zza();
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzx = true;
        this.zzt = Long.MIN_VALUE;
        this.zzu = Long.MIN_VALUE;
        this.zzv = Long.MIN_VALUE;
        this.zzw = false;
        this.zzc.zze();
        if (z2) {
            this.zzz = null;
            this.zzy = true;
            this.zzA = true;
        }
    }

    public final void zzc(long j) {
        this.zzt = j;
    }

    public final int zzd() {
        return this.zzq + this.zzp;
    }

    public final void zze() {
        zzs();
        zzF();
    }

    public final void zzf() throws IOException {
        zztd zztdVar = this.zzh;
        if (zztdVar != null) {
            throw zztdVar.zza();
        }
    }

    public final int zzg() {
        return this.zzq;
    }

    public final int zzh() {
        return this.zzq + this.zzs;
    }

    public final synchronized zzv zzi() {
        if (this.zzy) {
            return null;
        }
        return this.zzz;
    }

    public final synchronized long zzj() {
        return this.zzv;
    }

    public final synchronized boolean zzk() {
        return this.zzw;
    }

    public final synchronized boolean zzl(boolean z2) {
        boolean z3 = true;
        if (zzH()) {
            if (((zzxt) this.zzc.zza(this.zzq + this.zzs)).zza != this.zzg) {
                return true;
            }
            return zzJ(zzM(this.zzs));
        }
        if (!z2 && !this.zzw) {
            zzv zzvVar = this.zzz;
            if (zzvVar == null) {
                z3 = false;
            } else if (zzvVar == this.zzg) {
                return false;
            }
        }
        return z3;
    }

    public final int zzm(zzle zzleVar, zzih zzihVar, int i2, boolean z2) {
        boolean z3 = (i2 & 2) != 0;
        zzxr zzxrVar = this.zzb;
        int iZzB = zzB(zzleVar, zzihVar, z3, z2, zzxrVar);
        if (iZzB != -4) {
            return iZzB;
        }
        if (!zzihVar.zzb()) {
            int i3 = i2 & 1;
            if ((i2 & 4) == 0) {
                if (i3 != 0) {
                    this.zza.zzd(zzihVar, zzxrVar);
                    return -4;
                }
                this.zza.zzc(zzihVar, zzxrVar);
            } else if (i3 != 0) {
                return -4;
            }
            this.zzs++;
        }
        return -4;
    }

    public final synchronized boolean zzn(int i2) {
        zzA();
        int i3 = this.zzq;
        if (i2 >= i3 && i2 <= this.zzp + i3) {
            this.zzt = Long.MIN_VALUE;
            this.zzs = i2 - i3;
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    public final synchronized boolean zzo(long j, boolean z2) throws Throwable {
        Throwable th;
        zzxv zzxvVar;
        long j2;
        int iZzK;
        try {
            try {
                zzA();
                int i2 = this.zzs;
                int iZzM = zzM(i2);
                if (zzH() && j >= this.zzn[iZzM]) {
                    if (j > this.zzv) {
                        if (z2) {
                            z2 = true;
                        }
                    }
                    if (this.zzA) {
                        try {
                            int i3 = this.zzp - i2;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= i3) {
                                    if (!z2) {
                                        zzxvVar = this;
                                        j2 = j;
                                        iZzK = -1;
                                        break;
                                    }
                                    j2 = j;
                                    iZzK = i3;
                                    zzxvVar = this;
                                    break;
                                }
                                if (this.zzn[iZzM] >= j) {
                                    zzxvVar = this;
                                    j2 = j;
                                    iZzK = i4;
                                    break;
                                }
                                iZzM++;
                                if (iZzM == this.zzi) {
                                    iZzM = 0;
                                }
                                i4++;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    } else {
                        zzxvVar = this;
                        j2 = j;
                        iZzK = zzxvVar.zzK(iZzM, this.zzp - i2, j2, true);
                    }
                    if (iZzK != -1) {
                        zzxvVar.zzt = j2;
                        zzxvVar.zzs += iZzK;
                        return true;
                    }
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final synchronized int zzp(long j, boolean z2) {
        Throwable th;
        try {
            try {
                int i2 = this.zzs;
                int iZzM = zzM(i2);
                if (!zzH() || j < this.zzn[iZzM]) {
                    return 0;
                }
                if (j <= this.zzv || !z2) {
                    int iZzK = zzK(iZzM, this.zzp - i2, j, true);
                    if (iZzK == -1) {
                        return 0;
                    }
                    return iZzK;
                }
                try {
                    return this.zzp - i2;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
        }
        throw th;
    }

    public final synchronized void zzq(int i2) {
        boolean z2 = false;
        if (i2 >= 0) {
            try {
                if (this.zzs + i2 <= this.zzp) {
                    z2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzgqa.zza(z2);
        this.zzs += i2;
    }

    public final void zzr(long j, boolean z2, boolean z3) {
        this.zza.zze(zzD(j, false, z3));
    }

    public final void zzs() {
        this.zza.zze(zzE());
    }

    public final void zzt(zzxu zzxuVar) {
        this.zzf = zzxuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzu(zzv zzvVar) {
        boolean zZzC = zzC(zzvVar);
        zzxu zzxuVar = this.zzf;
        if (zzxuVar == null || !zZzC) {
            return;
        }
        zzxuVar.zzy(zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final int zzv(zzj zzjVar, int i2, boolean z2, int i3) throws IOException {
        return this.zza.zzg(zzjVar, i2, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzw(zzer zzerVar, int i2, int i3) {
        this.zza.zzh(zzerVar, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzx(long j, int i2, int i3, int i4, zzafz zzafzVar) {
        if (this.zzx) {
            if ((i2 & 1) == 0) {
                return;
            } else {
                this.zzx = false;
            }
        }
        if (this.zzA) {
            if (j < this.zzt) {
                return;
            }
            if ((i2 & 1) == 0) {
                if (!this.zzB) {
                    zzee.zzc("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.zzz)));
                    this.zzB = true;
                }
                i2 |= 1;
            }
        }
        int i5 = i2;
        zzG(j, i5, (this.zza.zzf() - ((long) i3)) - ((long) i4), i3, zzafzVar);
    }
}
