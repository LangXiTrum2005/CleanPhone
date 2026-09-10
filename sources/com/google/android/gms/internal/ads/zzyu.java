package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzyu implements Comparator {
    static final /* synthetic */ zzyu zza = new zzyu();

    private /* synthetic */ zzyu() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((zzzk) ((List) obj).get(0)).compareTo((zzzk) ((List) obj2).get(0));
    }
}
