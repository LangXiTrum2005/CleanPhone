package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbge implements zzbja {
    final /* synthetic */ SharedPreferences zza;

    public zzbge(zzbgi zzbgiVar, SharedPreferences sharedPreferences) {
        this.zza = sharedPreferences;
        Objects.requireNonNull(zzbgiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbja
    public final Boolean zza(String str, boolean z2) {
        try {
            return Boolean.valueOf(this.zza.getBoolean(str, z2));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(this.zza.getString(str, String.valueOf(z2)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbja
    public final Long zzb(String str, long j) {
        try {
            return Long.valueOf(this.zza.getLong(str, j));
        } catch (ClassCastException unused) {
            return Long.valueOf(this.zza.getInt(str, (int) j));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbja
    public final Double zzc(String str, double d) {
        try {
            return Double.valueOf(this.zza.getFloat(str, (float) d));
        } catch (ClassCastException unused) {
            return Double.valueOf(this.zza.getString(str, String.valueOf(d)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbja
    public final String zzd(String str, String str2) {
        return this.zza.getString(str, str2);
    }
}
