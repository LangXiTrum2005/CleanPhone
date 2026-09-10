package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzyo extends zzyq {
    public zzyo(zzbg zzbgVar, int[] iArr, int i2, zzaam zzaamVar, long j, long j2, long j3, int i3, int i4, float f, float f2, List list, zzdn zzdnVar) {
        super(zzbgVar, iArr, 0);
        zzgtd.zzq(list);
    }

    public static /* synthetic */ zzgtd zzd(zzzv[] zzzvVarArr) {
        int i2;
        long[][] jArr;
        int i3 = 1;
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        for (int i5 = 0; i5 < 2; i5++) {
            zzzv zzzvVar = zzzvVarArr[i5];
            if (zzzvVar == null || zzzvVar.zzb.length <= 1) {
                arrayList.add(null);
            } else {
                int i6 = zzgtd.zzd;
                zzgta zzgtaVar = new zzgta();
                zzgtaVar.zzf(new zzym(0L, 0L));
                arrayList.add(zzgtaVar);
            }
        }
        long[][] jArr2 = new long[2][];
        for (int i7 = 0; i7 < 2; i7++) {
            zzzv zzzvVar2 = zzzvVarArr[i7];
            if (zzzvVar2 == null) {
                jArr2[i7] = new long[0];
            } else {
                int[] iArr = zzzvVar2.zzb;
                jArr2[i7] = new long[iArr.length];
                for (int i8 = 0; i8 < iArr.length; i8++) {
                    long j = zzzvVar2.zza.zza(iArr[i8]).zzj;
                    long[] jArr3 = jArr2[i7];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr3[i8] = j;
                }
                Arrays.sort(jArr2[i7]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr4 = new long[2];
        for (int i9 = 0; i9 < 2; i9++) {
            long[] jArr5 = jArr2[i9];
            jArr4[i9] = jArr5.length == 0 ? 0L : jArr5[0];
        }
        zzi(arrayList, jArr4);
        zzgty zzgtyVarZza = zzgus.zzc(zzgux.zzb()).zzb(2).zza();
        int i10 = 0;
        while (i10 < 2) {
            int length = jArr2[i10].length;
            if (length <= i3) {
                i2 = i4;
                jArr = jArr2;
            } else {
                double[] dArr = new double[length];
                int i11 = i4;
                while (true) {
                    long[] jArr6 = jArr2[i10];
                    double dLog = 0.0d;
                    if (i11 >= jArr6.length) {
                        break;
                    }
                    int i12 = i4;
                    long[][] jArr7 = jArr2;
                    long j2 = jArr6[i11];
                    if (j2 != -1) {
                        dLog = Math.log(j2);
                    }
                    dArr[i11] = dLog;
                    i11 += i3;
                    i4 = i12;
                    jArr2 = jArr7;
                }
                i2 = i4;
                jArr = jArr2;
                int i13 = length - 1;
                double d = dArr[i13] - dArr[i2];
                int i14 = i2;
                while (i14 < i13) {
                    double d2 = dArr[i14];
                    i14 += i3;
                    zzgtyVarZza.zze(Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i14]) * 0.5d) - dArr[i2]) / d), Integer.valueOf(i10));
                    i3 = i3;
                }
            }
            i10++;
            i4 = i2;
            jArr2 = jArr;
            i3 = i3;
        }
        int i15 = i4;
        long[][] jArr8 = jArr2;
        zzgtd zzgtdVarZzq = zzgtd.zzq(zzgtyVarZza.zzt());
        while (i4 < zzgtdVarZzq.size()) {
            int iIntValue = ((Integer) zzgtdVarZzq.get(i4)).intValue();
            int i16 = iArr2[iIntValue] + 1;
            iArr2[iIntValue] = i16;
            jArr4[iIntValue] = jArr8[iIntValue][i16];
            zzi(arrayList, jArr4);
            i4++;
        }
        for (int i17 = i15; i17 < 2; i17++) {
            if (arrayList.get(i17) != null) {
                long j3 = jArr4[i17];
                jArr4[i17] = j3 + j3;
            }
        }
        zzi(arrayList, jArr4);
        zzgta zzgtaVar2 = new zzgta();
        for (int i18 = i15; i18 < arrayList.size(); i18++) {
            zzgta zzgtaVar3 = (zzgta) arrayList.get(i18);
            zzgtaVar2.zzf(zzgtaVar3 == null ? zzgtd.zzi() : zzgtaVar3.zzi());
        }
        return zzgtaVar2.zzi();
    }

    private static void zzi(List list, long[] jArr) {
        long j = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            j += jArr[i2];
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            zzgta zzgtaVar = (zzgta) list.get(i3);
            if (zzgtaVar != null) {
                zzgtaVar.zzf(new zzym(j, jArr[i3]));
            }
        }
    }
}
