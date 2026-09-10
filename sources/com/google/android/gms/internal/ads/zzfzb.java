package com.google.android.gms.internal.ads;

import androidx.datastore.core.DataStore;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfzb implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzfzb(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar3;
    }

    public static zzfzb zzc(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4) {
        return new zzfzb(zzijpVar, zzijpVar2, zzijpVar3, zzijpVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfza zzb() {
        return new zzfza((DataStore) this.zza.zzb(), zzclr.zzc(), (zzduo) this.zzb.zzb(), new zzfyc());
    }
}
