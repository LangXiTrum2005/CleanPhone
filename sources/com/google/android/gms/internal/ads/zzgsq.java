package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzgsq {
    private static final zzgsq zza = new zzgso();
    private static final zzgsq zzb = new zzgsp(-1);
    private static final zzgsq zzc = new zzgsp(1);

    public /* synthetic */ zzgsq(byte[] bArr) {
    }

    public static zzgsq zzg() {
        return zza;
    }

    public abstract zzgsq zza(Object obj, Object obj2, Comparator comparator);

    public abstract zzgsq zzb(int i2, int i3);

    public abstract zzgsq zzc(boolean z2, boolean z3);

    public abstract zzgsq zzd(boolean z2, boolean z3);

    public abstract int zze();
}
