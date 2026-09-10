package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
final class zzgun extends zzgur {
    final /* synthetic */ Comparator zza;

    public zzgun(Comparator comparator) {
        this.zza = comparator;
    }

    @Override // com.google.android.gms.internal.ads.zzgur
    public final Map zza() {
        return new TreeMap(this.zza);
    }
}
