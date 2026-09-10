package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzfqu implements Comparator {
    static final /* synthetic */ zzfqu zza = new zzfqu();

    private /* synthetic */ zzfqu() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzfqm zzfqmVar = (zzfqm) obj2;
        zzfqm zzfqmVar2 = (zzfqm) obj;
        int iCompare = Double.compare(zzfqmVar.zze(), zzfqmVar2.zze());
        return iCompare == 0 ? Long.compare(zzfqmVar2.zzd(), zzfqmVar.zzd()) : iCompare;
    }
}
