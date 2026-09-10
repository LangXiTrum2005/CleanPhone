package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbch {
    private final String zza;
    private final JSONObject zzb;
    private final String zzc;
    private final String zzd;
    private final boolean zze;

    public zzbch(String str, VersionInfoParcel versionInfoParcel, String str2, JSONObject jSONObject, boolean z2, boolean z3) {
        this.zzd = versionInfoParcel.afmaVersion;
        this.zzb = jSONObject;
        this.zzc = str;
        this.zza = str2;
        this.zze = z3;
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzd;
    }

    public final JSONObject zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final boolean zze() {
        return this.zze;
    }
}
