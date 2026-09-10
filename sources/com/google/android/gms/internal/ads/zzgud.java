package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgud {
    public static ArrayList zza(Iterator it) {
        ArrayList arrayList = new ArrayList();
        it.getClass();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static ArrayList zzb(int i2) {
        zzgrz.zzb(i2, "initialArraySize");
        return new ArrayList(i2);
    }

    public static List zzc(List list, zzgpr zzgprVar) {
        return list instanceof RandomAccess ? new zzgua(list, zzgprVar) : new zzguc(list, zzgprVar);
    }
}
