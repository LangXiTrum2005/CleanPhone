package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class zzgxv extends zzgxx {
    public zzgxv(zzgsz zzgszVar, boolean z2) {
        super(zzgszVar, z2);
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgxx
    public final /* bridge */ /* synthetic */ Object zzD(List list) {
        ArrayList arrayListZzb = zzgud.zzb(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzgxw zzgxwVar = (zzgxw) it.next();
            arrayListZzb.add(zzgxwVar != null ? zzgxwVar.zza : null);
        }
        return Collections.unmodifiableList(arrayListZzb);
    }
}
