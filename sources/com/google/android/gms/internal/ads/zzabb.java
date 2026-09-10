package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzabb implements Comparator {
    static final /* synthetic */ zzabb zza = new zzabb();

    private /* synthetic */ zzabb() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return Float.compare(((zzaba) obj).zzc, ((zzaba) obj2).zzc);
    }
}
