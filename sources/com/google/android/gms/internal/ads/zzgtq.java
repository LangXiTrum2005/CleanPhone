package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public class zzgtq<K, V> extends zzgtl<K, V> implements zzgul<K, V> {
    private final transient zzgtn<V> emptySet;
    private transient zzgtn zza;

    public zzgtq(zzgtg zzgtgVar, int i2, Comparator comparator) {
        super(zzgtgVar, i2);
        this.emptySet = zzgve.zza;
    }

    public final zzgtn zza() {
        zzgtn zzgtnVar = this.zza;
        if (zzgtnVar != null) {
            return zzgtnVar;
        }
        zzgtp zzgtpVar = new zzgtp(this);
        this.zza = zzgtpVar;
        return zzgtpVar;
    }
}
