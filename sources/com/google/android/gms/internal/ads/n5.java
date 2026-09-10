package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n5 implements a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2 f17670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f17671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17673d;

    public n5(SparseArray sparseArray, long j10, int i10, long j11, long j12) {
        int i11;
        this.f17671b = sparseArray;
        this.f17672c = j10;
        this.f17673d = i10;
        List list = (List) sparseArray.get(i10);
        g2 g2Var = null;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            int[] iArrCopyOf = new int[size];
            long[] jArrCopyOf = new long[size];
            long[] jArrCopyOf2 = new long[size];
            long[] jArrCopyOf3 = new long[size];
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                m5 m5Var = (m5) list.get(i13);
                jArrCopyOf3[i13] = m5Var.f17246a;
                jArrCopyOf[i13] = m5Var.f17247b;
            }
            while (true) {
                i11 = size - 1;
                if (i12 >= i11) {
                    break;
                }
                int i14 = i12 + 1;
                iArrCopyOf[i12] = (int) (jArrCopyOf[i14] - jArrCopyOf[i12]);
                jArrCopyOf2[i12] = jArrCopyOf3[i14] - jArrCopyOf3[i12];
                i12 = i14;
            }
            int i15 = i11;
            while (i15 > 0 && jArrCopyOf3[i15] >= j10) {
                i15--;
            }
            iArrCopyOf[i15] = (int) ((j11 + j12) - jArrCopyOf[i15]);
            jArrCopyOf2[i15] = j10 - jArrCopyOf3[i15];
            if (i15 < i11) {
                v71.y("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                int i16 = i15 + 1;
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i16);
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i16);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i16);
                jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i16);
            }
            g2Var = new g2(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
        }
        this.f17670a = g2Var;
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final z2 b(long j10) {
        g2 g2Var = this.f17670a;
        if (g2Var != null) {
            return g2Var.b(j10);
        }
        b3 b3Var = b3.f12618c;
        return new z2(b3Var, b3Var);
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final long zza() {
        return this.f17672c;
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final boolean zzb() {
        List list = (List) this.f17671b.get(this.f17673d);
        return (list == null || list.isEmpty()) ? false : true;
    }
}
