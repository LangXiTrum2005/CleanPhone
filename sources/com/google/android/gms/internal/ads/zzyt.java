package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzyt implements Comparator {
    static final /* synthetic */ zzyt zza = new zzyt();

    private /* synthetic */ zzyt() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((zzzc) ((List) obj).get(0)).compareTo((zzzc) ((List) obj2).get(0));
    }
}
