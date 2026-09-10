package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzecu;
import com.google.android.gms.internal.ads.zzflk;
import com.google.android.gms.internal.ads.zzijg;
import com.google.android.gms.internal.ads.zzijp;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbi implements zzijg {
    private final zzijp zza;

    private zzbi(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar2;
    }

    public static zzbi zzc(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzbi(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbh zzb() {
        return new zzbh(zzflk.zzc(), ((zzecu) this.zza).zzb());
    }
}
