package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzclx implements zzijg {
    private final zzijp zza;

    private zzclx(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
    }

    public static zzclx zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzclx(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzch)).booleanValue() ? Collections.singleton(new zzdij((zzdzr) this.zza.zzb(), zzflk.zzc())) : Collections.EMPTY_SET;
        zzijo.zzb(setSingleton);
        return setSingleton;
    }
}
