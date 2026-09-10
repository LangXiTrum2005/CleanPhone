package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzegl implements zzgyj {
    final /* synthetic */ zzflu zza;

    public zzegl(zzegn zzegnVar, zzflu zzfluVar) {
        this.zza = zzfluVar;
        Objects.requireNonNull(zzegnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zza(Throwable th) {
        String strValueOf = String.valueOf(th.getMessage());
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to get offline signal database: ".concat(strValueOf));
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zza((SQLiteDatabase) obj);
        } catch (Exception e2) {
            String strValueOf = String.valueOf(e2.getMessage());
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Error executing function on offline signal database: ".concat(strValueOf));
        }
    }
}
