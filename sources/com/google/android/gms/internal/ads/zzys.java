package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzys implements Comparator {
    static final /* synthetic */ zzys zza = new zzys();

    private /* synthetic */ zzys() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((zzyr) Collections.max((List) obj)).compareTo((zzyr) Collections.max((List) obj2));
    }
}
