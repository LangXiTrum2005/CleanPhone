package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzgok extends zzgni {
    final /* synthetic */ zzgom zza;
    private final zzgor zzb;

    public zzgok(zzgom zzgomVar, zzgor zzgorVar) {
        Objects.requireNonNull(zzgomVar);
        this.zza = zzgomVar;
        this.zzb = zzgorVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgnj
    public final void zzb(Bundle bundle) {
        int i2 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        int i3 = bundle.getInt("uiMode", 0);
        zzgop zzgopVarZzd = zzgoq.zzd();
        zzgopVarZzd.zza(i2);
        if (string != null) {
            zzgopVarZzd.zzb(string);
        }
        zzgopVarZzd.zzc(i3);
        this.zzb.zza(zzgopVarZzd.zzd());
        if (i2 == 8157) {
            this.zza.zzd();
        }
    }
}
