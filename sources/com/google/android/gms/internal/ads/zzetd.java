package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzetd implements zzgpr {
    static final /* synthetic */ zzetd zza = new zzetd();

    private /* synthetic */ zzetd() {
    }

    @Override // com.google.android.gms.internal.ads.zzgpr
    public final /* synthetic */ Object apply(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        if (true == arrayList.isEmpty()) {
            arrayList = null;
        }
        return new zzetf(arrayList);
    }
}
