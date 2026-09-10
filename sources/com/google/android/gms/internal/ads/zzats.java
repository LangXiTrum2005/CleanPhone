package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Optional;

/* JADX INFO: loaded from: classes4.dex */
public final class zzats {
    public static zzaus zza(final long j) {
        return zzaus.zzf(new zzauk() { // from class: com.google.android.gms.internal.ads.zzatr
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                try {
                    ((zzaun) obj).zzb.zzb(zzaus.zzb(j));
                    return Optional.empty();
                } catch (zzaui unused) {
                    return Optional.of(zzatc.zza);
                }
            }
        });
    }

    public static int zzb(long j, zzaur zzaurVar, boolean z2) throws IOException {
        long j2;
        long[] jArr = {2000490107, 1476547902, 1834034217, 268849430, 1839467528, 4368198174L, 449620248, 1652701270, 1629190168};
        long j3 = jArr[0];
        long j4 = jArr[1];
        long j5 = jArr[2];
        long j6 = jArr[3];
        long j7 = jArr[4];
        long j8 = jArr[5];
        long j9 = jArr[6];
        long j10 = jArr[7];
        long j11 = (((((~j3) & j4) | j5) + ((j3 & j6) | j7)) - j8) + j9;
        long j12 = j10 % 1629190168;
        int i2 = ((((~1725868784) & 388366538) | 739792167) + ((1725868784 & 1395525853) | 1087913783)) - 2073845026;
        int i3 = 1550046828 % 184366026;
        int i4 = ((((~84870791) & 719462960) | 688752780) + ((84870791 & 317383283) | 806209731)) - 1437974767;
        int i5 = 2023762697 % 959200313;
        int i6 = ((((~294151249) & 1465191424) | 201912514) + ((294151249 & 1398095366) | 75641662)) - 1330100008;
        int i7 = 1583887958 % 619175679;
        if (z2) {
            j2 = (j >> ((((((~1375552878) & 930005102) | 1249030018) + ((1375552878 & 1024213116) | 136481682)) - 2090967727) ^ (2014126950 % 228698447))) ^ (j + j);
        } else {
            j2 = j;
        }
        int i8 = 1;
        while (true) {
            long j13 = j11 ^ j12;
            long j14 = j2 >>> (i4 ^ i5);
            boolean z3 = j14 != 0 || i8 < 0;
            int i9 = (int) (j2 & j13);
            if (z3) {
                int i10 = i2 ^ i3;
                i9 = ((i9 | (i6 ^ i7)) << i10) >> i10;
            }
            zzaurVar.zza((byte) i9);
            if (!z3) {
                return i8;
            }
            i8++;
            j2 = j14;
        }
    }
}
