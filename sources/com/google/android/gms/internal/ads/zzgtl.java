package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class zzgtl<K, V> extends zzgrx<K, V> implements Serializable {
    final transient zzgtg<K, ? extends zzgsz<V>> map;
    final transient int size;

    public zzgtl(zzgtg zzgtgVar, int i2) {
        this.map = zzgtgVar;
        this.size = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgul
    public final int zzd() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgrw, com.google.android.gms.internal.ads.zzgul
    @Deprecated
    public final boolean zze(Object obj, Object obj2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgul
    @Deprecated
    public final void zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgrw
    public final Set zzh() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.android.gms.internal.ads.zzgrw
    public final /* synthetic */ Collection zzj() {
        return new zzgtk(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgrw
    public final Map zzl() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.android.gms.internal.ads.zzgrw
    public final boolean zzr(Object obj) {
        return obj != null && super.zzr(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgrw, com.google.android.gms.internal.ads.zzgul
    public final /* bridge */ /* synthetic */ Collection zzt() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgrw, com.google.android.gms.internal.ads.zzgul
    public /* synthetic */ Map zzu() {
        return this.map;
    }
}
