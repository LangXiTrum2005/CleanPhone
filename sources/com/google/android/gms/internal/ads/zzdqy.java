package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzdqy implements zzgpr {
    static final /* synthetic */ zzdqy zza = new zzdqy();

    private /* synthetic */ zzdqy() {
    }

    @Override // com.google.android.gms.internal.ads.zzgpr
    public final /* synthetic */ Object apply(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (zzdqw zzdqwVar : (List) obj) {
            if (zzdqwVar != null) {
                arrayList.add(zzdqwVar);
            }
        }
        return arrayList;
    }
}
