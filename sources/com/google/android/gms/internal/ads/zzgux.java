package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzgux implements Comparator {
    public static zzgux zzb() {
        return zzguv.zza;
    }

    public static zzgux zzc(Comparator comparator) {
        return new zzgsm(comparator);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public zzgux zza() {
        return new zzgvg(this);
    }

    public final zzgux zzd(zzgpr zzgprVar) {
        return new zzgry(zzgprVar, this);
    }
}
