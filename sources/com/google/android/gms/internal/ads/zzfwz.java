package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
final class zzfwz extends zzfxc {
    public zzfwz() {
        super(null);
    }

    public static final zzfxc zzf(int i) {
        if (i < 0) {
            return zzfxc.zzb;
        }
        return i > 0 ? zzfxc.zzc : zzfxc.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfxc
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfxc
    public final zzfxc zzb(int i, int i2) {
        return zzf(Integer.compare(i, i2));
    }

    @Override // com.google.android.gms.internal.ads.zzfxc
    public final zzfxc zzc(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzfxc
    public final zzfxc zzd(boolean z, boolean z2) {
        return zzf(Boolean.compare(z, z2));
    }

    @Override // com.google.android.gms.internal.ads.zzfxc
    public final zzfxc zze(boolean z, boolean z2) {
        return zzf(Boolean.compare(z2, z));
    }
}
