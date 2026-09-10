package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzefj implements zzecy {
    private final zzdpm zza;

    public zzefj(zzdpm zzdpmVar) {
        this.zza = zzdpmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzecy
    @Nullable
    public final zzecz zza(String str, JSONObject jSONObject) throws zzfcq {
        return new zzecz(this.zza.zzc(str, jSONObject), new zzees(), str);
    }
}
