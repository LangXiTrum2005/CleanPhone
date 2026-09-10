package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzesm implements zzezx {
    private final Set zza;

    public zzesm(Set set) {
        this.zza = set;
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return zzgym.zza(new zzesl(arrayList, null));
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 8;
    }
}
