package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzdqt implements zzgpr {
    static final /* synthetic */ zzdqt zza = new zzdqt();

    private /* synthetic */ zzdqt() {
    }

    @Override // com.google.android.gms.internal.ads.zzgpr
    public final /* synthetic */ Object apply(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (zzbjj zzbjjVar : (List) obj) {
            if (zzbjjVar != null) {
                arrayList.add(zzbjjVar);
            }
        }
        return arrayList;
    }
}
