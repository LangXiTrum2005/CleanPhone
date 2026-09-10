package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzijr {
    private final List zza;
    private final List zzb;

    public /* synthetic */ zzijr(int i2, int i3, zzijq zzijqVar) {
        this.zza = zzijd.zza(i2);
        this.zzb = zzijd.zza(i3);
    }

    public final zzijr zza(zzijp zzijpVar) {
        this.zza.add(zzijpVar);
        return this;
    }

    public final zzijr zzb(zzijp zzijpVar) {
        this.zzb.add(zzijpVar);
        return this;
    }

    public final zzijs zzc() {
        return new zzijs(this.zza, this.zzb, null);
    }
}
