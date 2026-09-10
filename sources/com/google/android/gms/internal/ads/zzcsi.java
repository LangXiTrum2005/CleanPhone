package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcsi implements zzijg {
    private final zzijp zza;

    private zzcsi(zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzcsi zza(zzijp zzijpVar) {
        return new zzcsi(zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((zzcwb) this.zza).zza().zzz);
        } catch (JSONException unused) {
            return null;
        }
    }
}
