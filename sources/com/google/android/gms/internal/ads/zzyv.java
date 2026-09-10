package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzyv implements Comparator {
    static final /* synthetic */ zzyv zza = new zzyv();

    private /* synthetic */ zzyv() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        List list = (List) obj2;
        List list2 = (List) obj;
        return zzgsq.zzg().zza((zzzt) Collections.max(list2, zzzs.zza), (zzzt) Collections.max(list, zzzn.zza), zzzo.zza).zzb(list2.size(), list.size()).zza((zzzt) Collections.max(list2, zzzp.zza), (zzzt) Collections.max(list, zzzq.zza), zzzr.zza).zze();
    }
}
