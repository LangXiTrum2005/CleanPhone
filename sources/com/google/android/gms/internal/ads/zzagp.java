package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
final class zzagp {
    private final zzago zza;
    private final zzaga zzb;
    private final int zzc;
    private final int zzd;
    private final long zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private long zzl;
    private long[] zzm;
    private int[] zzn;

    public zzagp(int i2, zzago zzagoVar, zzaga zzagaVar) {
        this.zza = zzagoVar;
        int iZzc = zzagoVar.zzc();
        boolean z2 = true;
        if (iZzc != 1) {
            if (iZzc == 2) {
                iZzc = 2;
            } else {
                z2 = false;
            }
        }
        zzgqa.zza(z2);
        this.zzc = zzj(i2, iZzc == 2 ? 1667497984 : 1651965952);
        this.zze = zzagoVar.zzd();
        this.zzb = zzagaVar;
        this.zzd = iZzc == 2 ? zzj(i2, 1650720768) : -1;
        this.zzl = -1L;
        this.zzm = new long[512];
        this.zzn = new int[512];
        this.zzf = zzagoVar.zzd;
    }

    private final long zzh(int i2) {
        return (this.zze * ((long) i2)) / ((long) this.zzf);
    }

    private final zzafs zzi(int i2) {
        return new zzafs(((long) this.zzn[i2]) * zzh(1), this.zzm[i2]);
    }

    private static int zzj(int i2, int i3) {
        return (((i2 % 10) + 48) << 8) | ((i2 / 10) + 48) | i3;
    }

    public final void zza(long j, boolean z2) {
        if (this.zzl == -1) {
            this.zzl = j;
        }
        if (z2) {
            if (this.zzk == this.zzn.length) {
                long[] jArr = this.zzm;
                this.zzm = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.zzn;
                this.zzn = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.zzm;
            int i2 = this.zzk;
            jArr2[i2] = j;
            this.zzn[i2] = this.zzj;
            this.zzk = i2 + 1;
        }
        this.zzj++;
    }

    public final void zzb() {
        int i2;
        this.zzm = Arrays.copyOf(this.zzm, this.zzk);
        this.zzn = Arrays.copyOf(this.zzn, this.zzk);
        if ((this.zzc & 1651965952) != 1651965952 || this.zza.zzf == 0 || (i2 = this.zzk) <= 0) {
            return;
        }
        this.zzf = i2;
    }

    public final boolean zzc(int i2) {
        return this.zzc == i2 || this.zzd == i2;
    }

    public final void zzd(int i2) {
        this.zzg = i2;
        this.zzh = i2;
    }

    public final boolean zze(zzaep zzaepVar) throws IOException {
        int i2 = this.zzh;
        zzaga zzagaVar = this.zzb;
        int iZzy = i2 - zzagaVar.zzy(zzaepVar, i2, false);
        this.zzh = iZzy;
        boolean z2 = iZzy == 0;
        if (z2) {
            if (this.zzg > 0) {
                zzagaVar.zzx(zzh(this.zzi), Arrays.binarySearch(this.zzn, this.zzi) >= 0 ? 1 : 0, this.zzg, 0, null);
            }
            this.zzi++;
        }
        return z2;
    }

    public final void zzf(long j) {
        if (this.zzk == 0) {
            this.zzi = 0;
        } else {
            this.zzi = this.zzn[zzfj.zzm(this.zzm, j, true, true)];
        }
    }

    public final zzafp zzg(long j) {
        if (this.zzk == 0) {
            zzafs zzafsVar = new zzafs(0L, this.zzl);
            return new zzafp(zzafsVar, zzafsVar);
        }
        int iZzh = (int) (j / zzh(1));
        int iZzl = zzfj.zzl(this.zzn, iZzh, true, true);
        if (this.zzn[iZzl] == iZzh) {
            zzafs zzafsVarZzi = zzi(iZzl);
            return new zzafp(zzafsVarZzi, zzafsVarZzi);
        }
        zzafs zzafsVarZzi2 = zzi(iZzl);
        int i2 = iZzl + 1;
        return i2 < this.zzm.length ? new zzafp(zzafsVarZzi2, zzi(i2)) : new zzafp(zzafsVarZzi2, zzafsVarZzi2);
    }
}
