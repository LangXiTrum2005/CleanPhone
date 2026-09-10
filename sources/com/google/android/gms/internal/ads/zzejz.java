package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzejz implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzejz(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzejz zzc(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzejz(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzejy zzb() {
        return new zzejy((Context) this.zza.zzb(), (zzcsq) this.zzb.zzb());
    }
}
