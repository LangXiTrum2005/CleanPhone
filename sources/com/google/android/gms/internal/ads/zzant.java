package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class zzant implements zzalt {
    private final List zza;
    private final long[] zzb;
    private final long[] zzc;

    public zzant(List list) {
        this.zza = Collections.unmodifiableList(new ArrayList(list));
        int size = list.size();
        this.zzb = new long[size + size];
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzanj zzanjVar = (zzanj) list.get(i2);
            long[] jArr = this.zzb;
            int i3 = i2 + i2;
            jArr[i3] = zzanjVar.zzb;
            jArr[i3 + 1] = zzanjVar.zzc;
        }
        long[] jArr2 = this.zzb;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.zzc = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    public final int zza() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    public final long zzb(int i2) {
        zzgqa.zza(i2 >= 0);
        long[] jArr = this.zzc;
        zzgqa.zza(i2 < jArr.length);
        return jArr[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    public final List zzc(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        while (true) {
            List list = this.zza;
            if (i2 >= list.size()) {
                break;
            }
            long[] jArr = this.zzb;
            int i3 = i2 + i2;
            if (jArr[i3] <= j && j < jArr[i3 + 1]) {
                zzanj zzanjVar = (zzanj) list.get(i2);
                zzcx zzcxVar = zzanjVar.zza;
                if (zzcxVar.zze == -3.4028235E38f) {
                    arrayList2.add(zzanjVar);
                } else {
                    arrayList.add(zzcxVar);
                }
            }
            i2++;
        }
        Collections.sort(arrayList2, zzans.zza);
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            zzcw zzcwVarZza = ((zzanj) arrayList2.get(i4)).zza.zza();
            zzcwVarZza.zzf((-1) - i4, 1);
            arrayList.add(zzcwVarZza.zzr());
        }
        return arrayList;
    }
}
