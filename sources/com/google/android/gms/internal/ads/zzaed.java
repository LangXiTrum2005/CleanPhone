package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaed {
    private final Map zza = new LinkedHashMap();

    public final void zza(zzaec zzaecVar) {
        long[] jArr = zzaecVar.zze;
        if (jArr.length > 0) {
            Map map = this.zza;
            if (map.containsKey(Long.valueOf(jArr[0]))) {
                return;
            }
            map.put(Long.valueOf(jArr[0]), zzaecVar);
        }
    }

    public final zzaec zzb() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (zzaec zzaecVar : this.zza.values()) {
            arrayList.add(zzaecVar.zzb);
            arrayList2.add(zzaecVar.zzc);
            arrayList3.add(zzaecVar.zzd);
            arrayList4.add(zzaecVar.zze);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long length = 0;
        for (int[] iArr2 : iArr) {
            length += (long) iArr2.length;
        }
        int i2 = (int) length;
        zzgqa.zze(length == ((long) i2), "the total number of elements (%s) in the arrays must fit in an int", length);
        int[] iArr3 = new int[i2];
        int i3 = 0;
        for (int[] iArr4 : iArr) {
            int length2 = iArr4.length;
            System.arraycopy(iArr4, 0, iArr3, i3, length2);
            i3 += length2;
        }
        return new zzaec(iArr3, zzgxa.zza((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), zzgxa.zza((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), zzgxa.zza((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }
}
