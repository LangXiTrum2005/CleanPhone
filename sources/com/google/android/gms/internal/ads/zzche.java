package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zzche implements zzher {
    private final zzcha zza;

    public zzche(zzcha zzchaVar) {
        this.zza = zzchaVar;
    }

    public static Context zzc(zzcha zzchaVar) {
        Context contextZzb = zzchaVar.zzb();
        zzhez.zzb(contextZzb);
        return contextZzb;
    }

    public final Context zza() {
        return zzc(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* synthetic */ Object zzb() {
        return zzc(this.zza);
    }
}
