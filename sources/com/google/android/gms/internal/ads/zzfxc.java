package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzfxc {
    private static final zzfxc zza = new zzfwz();
    private static final zzfxc zzb = new zzfxa(-1);
    private static final zzfxc zzc = new zzfxa(1);

    public /* synthetic */ zzfxc(zzfxb zzfxbVar) {
    }

    public static zzfxc zzj() {
        return zza;
    }

    public abstract int zza();

    public abstract zzfxc zzb(int i, int i2);

    public abstract zzfxc zzc(Object obj, Object obj2, Comparator comparator);

    public abstract zzfxc zzd(boolean z, boolean z2);

    public abstract zzfxc zze(boolean z, boolean z2);
}
