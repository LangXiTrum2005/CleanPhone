package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzclp implements zzijg {
    private final zzcli zza;

    private zzclp(zzcli zzcliVar) {
        this.zza = zzcliVar;
    }

    public static zzclp zzc(zzcli zzcliVar) {
        return new zzclp(zzcliVar);
    }

    public static Context zzd(zzcli zzcliVar) {
        Context contextZza = zzcliVar.zza();
        zzijo.zzb(contextZza);
        return contextZza;
    }

    public final Context zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
