package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzakn implements zzafr {
    private final long zza;
    private final zzako[] zzb;
    private final int zzc;

    public zzakn(long j, zzako[] zzakoVarArr, int i2) {
        this.zza = j;
        this.zzb = zzakoVarArr;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final boolean zzb() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:28:0x0070  */
    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    /* JADX WARN: Code duplicated, block: B:34:0x0087  */
    /* JADX WARN: Code duplicated, block: B:38:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0075 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzafr
    public final zzafp zzc(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        int i2;
        long jZzh;
        long jZzh2;
        zzaky zzakyVar;
        int iZzb;
        zzako[] zzakoVarArr = this.zzb;
        if (zzakoVarArr.length == 0) {
            zzafs zzafsVar = zzafs.zza;
            return new zzafp(zzafsVar, zzafsVar);
        }
        int i3 = this.zzc;
        if (i3 != -1) {
            zzaky zzakyVar2 = zzakoVarArr[i3].zzb;
            int iZzl = zzakp.zzl(zzakyVar2, j);
            if (iZzl == -1) {
                zzafs zzafsVar2 = zzafs.zza;
                return new zzafp(zzafsVar2, zzafsVar2);
            }
            long[] jArr = zzakyVar2.zzf;
            j3 = jArr[iZzl];
            long[] jArr2 = zzakyVar2.zzc;
            j2 = jArr2[iZzl];
            if (j3 < j && iZzl < zzakyVar2.zzb - 1 && (iZzb = zzakyVar2.zzb(j)) != -1 && iZzb != iZzl) {
                j4 = jArr[iZzb];
                j5 = jArr2[iZzb];
            }
            jZzh = j2;
            jZzh2 = j5;
            for (i2 = 0; i2 < zzakoVarArr.length; i2++) {
                if (i2 != i3) {
                    zzakyVar = zzakoVarArr[i2].zzb;
                    jZzh = zzakp.zzh(zzakyVar, j3, jZzh);
                    if (j4 != -9223372036854775807L) {
                        jZzh2 = zzakp.zzh(zzakyVar, j4, jZzh2);
                    }
                }
            }
            zzafs zzafsVar3 = new zzafs(j3, jZzh);
            return j4 == -9223372036854775807L ? new zzafp(zzafsVar3, zzafsVar3) : new zzafp(zzafsVar3, new zzafs(j4, jZzh2));
        }
        j2 = Long.MAX_VALUE;
        j3 = j;
        j4 = -9223372036854775807L;
        j5 = -1;
        jZzh = j2;
        jZzh2 = j5;
        while (i2 < zzakoVarArr.length) {
            if (i2 != i3) {
                zzakyVar = zzakoVarArr[i2].zzb;
                jZzh = zzakp.zzh(zzakyVar, j3, jZzh);
                if (j4 != -9223372036854775807L) {
                    jZzh2 = zzakp.zzh(zzakyVar, j4, jZzh2);
                }
            }
        }
        zzafs zzafsVar4 = new zzafs(j3, jZzh);
        if (j4 == -9223372036854775807L) {
        }
    }
}
