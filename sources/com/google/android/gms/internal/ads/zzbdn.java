package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbdn implements Comparator {
    public zzbdn(zzbdp zzbdpVar) {
        Objects.requireNonNull(zzbdpVar);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbds zzbdsVar = (zzbds) obj;
        zzbds zzbdsVar2 = (zzbds) obj2;
        int i2 = zzbdsVar.zzc - zzbdsVar2.zzc;
        return i2 != 0 ? i2 : Long.compare(zzbdsVar.zza, zzbdsVar2.zza);
    }
}
