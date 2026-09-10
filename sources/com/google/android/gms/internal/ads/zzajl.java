package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzajl implements zzajk {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;

    private zzajl(long[] jArr, long[] jArr2, long j, long j2, long j3, int i2) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j;
        this.zzd = j3;
        this.zze = i2;
    }

    public static zzajl zzd(long j, long j2, zzafk zzafkVar, zzer zzerVar) {
        int iZzs;
        zzer zzerVar2 = zzerVar;
        zzerVar2.zzk(6);
        int iZzB = zzerVar2.zzB();
        long j3 = zzafkVar.zzc;
        long j4 = iZzB;
        int iZzB2 = zzerVar2.zzB();
        if (iZzB2 <= 0) {
            return null;
        }
        long jZzr = zzfj.zzr((((long) iZzB2) * ((long) zzafkVar.zzg)) - 1, zzafkVar.zzd);
        int iZzt = zzerVar2.zzt();
        int iZzt2 = zzerVar2.zzt();
        int iZzt3 = zzerVar2.zzt();
        zzerVar2.zzk(2);
        long[] jArr = new long[iZzt];
        long[] jArr2 = new long[iZzt];
        int i2 = 0;
        long j5 = j2 + ((long) zzafkVar.zzc);
        while (i2 < iZzt) {
            long j6 = j3;
            jArr[i2] = (((long) i2) * jZzr) / ((long) iZzt);
            jArr2[i2] = j5;
            if (iZzt3 == 1) {
                iZzs = zzerVar2.zzs();
            } else if (iZzt3 == 2) {
                iZzs = zzerVar2.zzt();
            } else if (iZzt3 == 3) {
                iZzs = zzerVar2.zzx();
            } else {
                if (iZzt3 != 4) {
                    return null;
                }
                iZzs = zzerVar2.zzH();
            }
            j5 += ((long) iZzs) * ((long) iZzt2);
            i2++;
            zzerVar2 = zzerVar;
            iZzt = iZzt;
            j3 = j6;
        }
        long j7 = j2 + j3;
        long jMax = j7 + j4;
        if (j != -1 && j != jMax) {
            StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 27 + String.valueOf(jMax).length());
            androidx.datastore.preferences.protobuf.a.A(sb, "VBRI data size mismatch: ", j, ", ");
            sb.append(jMax);
            zzee.zzc("VbriSeeker", sb.toString());
        }
        if (jMax != j5) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(j5).length() + String.valueOf(jMax).length() + 43 + 28);
            androidx.datastore.preferences.protobuf.a.A(sb2, "VBRI bytes and ToC mismatch (using max): ", jMax, ", ");
            sb2.append(j5);
            sb2.append("\nSeeking will be inaccurate.");
            zzee.zzc("VbriSeeker", sb2.toString());
            jMax = Math.max(jMax, j5);
        }
        return new zzajl(jArr, jArr2, jZzr, j7, jMax, zzafkVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final zzafp zzc(long j) {
        long[] jArr = this.zza;
        int iZzm = zzfj.zzm(jArr, j, true, true);
        long j2 = jArr[iZzm];
        long[] jArr2 = this.zzb;
        zzafs zzafsVar = new zzafs(j2, jArr2[iZzm]);
        if (zzafsVar.zzb >= j || iZzm == jArr.length - 1) {
            return new zzafp(zzafsVar, zzafsVar);
        }
        int i2 = iZzm + 1;
        return new zzafp(zzafsVar, new zzafs(jArr[i2], jArr2[i2]));
    }

    @Override // com.google.android.gms.internal.ads.zzajk
    public final long zze(long j) {
        return this.zza[zzfj.zzm(this.zzb, j, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzajk
    public final long zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzajk
    public final int zzg() {
        return this.zze;
    }
}
