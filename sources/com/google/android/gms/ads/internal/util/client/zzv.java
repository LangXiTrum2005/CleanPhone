package com.google.android.gms.ads.internal.util.client;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzx f11005a;

    public zzv() {
        this.f11005a = new zzn(1, 0, 1.0d, false);
    }

    public static zzv zzb(@Nullable JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ping_strategy");
        return new zzv(jSONObjectOptJSONObject == null ? new zzn(1, 0, 1.0d, false) : new zzn(jSONObjectOptJSONObject.optInt("max_attempts", 1), jSONObjectOptJSONObject.optInt("initial_backoff_ms", 0), jSONObjectOptJSONObject.optDouble("backoff_multiplier", 1.0d), jSONObjectOptJSONObject.optBoolean("buffer_after_max_attempts", false)));
    }

    public final zzx zza() {
        return this.f11005a;
    }

    public zzv(zzx zzxVar) {
        this.f11005a = zzxVar;
    }
}
