package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
final class zzgso extends zzgsq {
    public zzgso() {
        super(null);
    }

    public static final zzgsq zzf(int i2) {
        if (i2 < 0) {
            return zzgsq.zzb;
        }
        return i2 > 0 ? zzgsq.zzc : zzgsq.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgsq
    public final zzgsq zza(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzgsq
    public final zzgsq zzb(int i2, int i3) {
        return zzf(Integer.compare(i2, i3));
    }

    @Override // com.google.android.gms.internal.ads.zzgsq
    public final zzgsq zzc(boolean z2, boolean z3) {
        return zzf(Boolean.compare(z3, z2));
    }

    @Override // com.google.android.gms.internal.ads.zzgsq
    public final zzgsq zzd(boolean z2, boolean z3) {
        return zzf(Boolean.compare(z2, z3));
    }

    @Override // com.google.android.gms.internal.ads.zzgsq
    public final int zze() {
        return 0;
    }
}
