package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class zzaiy implements zzafr {
    private final zzaec zza;
    private final SparseArray zzb;
    private final long zzc;
    private final int zzd;

    public zzaiy(SparseArray sparseArray, long j, int i2, long j2, long j3) {
        int i3;
        this.zzb = sparseArray;
        this.zzc = j;
        this.zzd = i2;
        List list = (List) sparseArray.get(i2);
        zzaec zzaecVar = null;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            int[] iArrCopyOf = new int[size];
            long[] jArrCopyOf = new long[size];
            long[] jArrCopyOf2 = new long[size];
            long[] jArrCopyOf3 = new long[size];
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                zzaix zzaixVar = (zzaix) list.get(i5);
                jArrCopyOf3[i5] = zzaixVar.zza();
                jArrCopyOf[i5] = zzaixVar.zzb();
            }
            while (true) {
                i3 = size - 1;
                if (i4 >= i3) {
                    break;
                }
                int i6 = i4 + 1;
                iArrCopyOf[i4] = (int) (jArrCopyOf[i6] - jArrCopyOf[i4]);
                jArrCopyOf2[i4] = jArrCopyOf3[i6] - jArrCopyOf3[i4];
                i4 = i6;
            }
            int i7 = i3;
            while (i7 > 0 && jArrCopyOf3[i7] >= j) {
                i7--;
            }
            iArrCopyOf[i7] = (int) ((j2 + j3) - jArrCopyOf[i7]);
            jArrCopyOf2[i7] = j - jArrCopyOf3[i7];
            if (i7 < i3) {
                zzee.zzc("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                int i8 = i7 + 1;
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i8);
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i8);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i8);
                jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i8);
            }
            zzaecVar = new zzaec(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
        }
        this.zza = zzaecVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final boolean zzb() {
        List list = (List) this.zzb.get(this.zzd);
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final zzafp zzc(long j) {
        zzaec zzaecVar = this.zza;
        if (zzaecVar != null) {
            return zzaecVar.zzc(j);
        }
        zzafs zzafsVar = zzafs.zza;
        return new zzafp(zzafsVar, zzafsVar);
    }
}
