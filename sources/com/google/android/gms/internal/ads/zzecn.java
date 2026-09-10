package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzecn implements zzijg {
    private final zzijp zza;

    private zzecn(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
    }

    public static zzecn zzc(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzecn(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzedj zzb() {
        return new zzedj((Context) this.zza.zzb(), zzflk.zzc());
    }
}
