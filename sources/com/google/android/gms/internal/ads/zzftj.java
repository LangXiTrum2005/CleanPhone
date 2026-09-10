package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzftj {
    private JSONObject zza;
    private final zzfts zzb;

    public zzftj(zzfts zzftsVar) {
        this.zzb = zzftsVar;
    }

    public final void zza(JSONObject jSONObject, HashSet hashSet, long j) {
        this.zzb.zza(new zzftv(this, hashSet, jSONObject, j));
    }

    public final void zzb(JSONObject jSONObject, HashSet hashSet, long j) {
        this.zzb.zza(new zzftu(this, hashSet, jSONObject, j));
    }

    public final void zzc() {
        this.zzb.zza(new zzftt(this));
    }

    public final JSONObject zzd() {
        return this.zza;
    }

    public final void zze(JSONObject jSONObject) {
        this.zza = jSONObject;
    }
}
