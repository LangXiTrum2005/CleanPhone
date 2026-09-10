package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbgb {
    private final int zza;
    private final String zzb;
    private final Object zzc;
    private final Object zzd;

    public /* synthetic */ zzbgb(int i2, String str, Object obj, Object obj2, byte[] bArr) {
        this.zza = i2;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        com.google.android.gms.ads.internal.client.zzbd.zzb().zza(this);
    }

    public static zzbgb zzh(int i2, String str, int i3, int i4) {
        return new zzbfx(1, str, Integer.valueOf(i3), Integer.valueOf(i4));
    }

    public static zzbgb zzi(int i2, String str, long j, long j2) {
        return new zzbfy(1, str, Long.valueOf(j), Long.valueOf(j2));
    }

    public static zzbgb zzj(int i2, String str, float f, float f2) {
        return new zzbfz(1, str, Float.valueOf(f), Float.valueOf(f2));
    }

    public static zzbgb zzk(int i2, String str) {
        zzbga zzbgaVar = new zzbga(1, "gads:sdk_core_constants:experiment_id", null, null);
        com.google.android.gms.ads.internal.client.zzbd.zzb().zzb(zzbgaVar);
        return zzbgaVar;
    }

    public static zzbgb zzl(int i2, String str) {
        zzbga zzbgaVar = new zzbga(1, "gads:sdk_core_constants_service:experiment_id", null, null);
        com.google.android.gms.ads.internal.client.zzbd.zzb().zzc(zzbgaVar);
        return zzbgaVar;
    }

    public abstract Object zza(Bundle bundle);

    public abstract void zzb(SharedPreferences.Editor editor, Object obj);

    public abstract Object zzc(JSONObject jSONObject);

    public abstract Object zzd(SharedPreferences sharedPreferences);

    public final String zze() {
        return this.zzb;
    }

    public final Object zzf() {
        return com.google.android.gms.ads.internal.client.zzbd.zzc().zzb() ? this.zzd : this.zzc;
    }

    public final Object zzg() {
        return com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(this);
    }

    public final int zzm() {
        return this.zza;
    }
}
