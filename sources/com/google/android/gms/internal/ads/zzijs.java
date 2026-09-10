package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzijs implements zzijg {
    private final List zza;
    private final List zzb;

    static {
        zzijh.zza(Collections.EMPTY_SET);
    }

    public /* synthetic */ zzijs(List list, List list2, zzijq zzijqVar) {
        this.zza = list;
        this.zzb = list2;
    }

    public static zzijr zza(int i2, int i3) {
        return new zzijr(i2, i3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final Set zzb() {
        List list = this.zza;
        int size = list.size();
        List list2 = this.zzb;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Collection collection = (Collection) ((zzijp) list2.get(i2)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSetZzb = zzijd.zzb(size);
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            Object objZzb = ((zzijp) list.get(i3)).zzb();
            objZzb.getClass();
            hashSetZzb.add(objZzb);
        }
        int size4 = arrayList.size();
        for (int i4 = 0; i4 < size4; i4++) {
            for (Object obj : (Collection) arrayList.get(i4)) {
                obj.getClass();
                hashSetZzb.add(obj);
            }
        }
        return Collections.unmodifiableSet(hashSetZzb);
    }
}
