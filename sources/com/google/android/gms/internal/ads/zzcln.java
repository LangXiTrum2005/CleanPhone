package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcln implements zzijg {
    private final zzcli zza;

    private zzcln(zzcli zzcliVar) {
        this.zza = zzcliVar;
    }

    public static zzcln zzc(zzcli zzcliVar) {
        return new zzcln(zzcliVar);
    }

    public static Context zzd(zzcli zzcliVar) {
        Context contextZzb = zzcliVar.zzb();
        zzijo.zzb(contextZzb);
        return contextZzb;
    }

    public final Context zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
