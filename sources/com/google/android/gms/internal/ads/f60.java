package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f60 implements z50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14262b;

    public /* synthetic */ f60(Object obj, int i10) {
        this.f14261a = i10;
        this.f14262b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.google.android.gms.internal.ads.ez] */
    /* JADX WARN: Type inference failed for: r4v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // com.google.android.gms.internal.ads.z50
    public final void c(JSONObject jSONObject) {
        switch (this.f14261a) {
            case 0:
                if (((Boolean) zzba.zzc().a(am.La)).booleanValue()) {
                    lj0 lj0Var = (lj0) this.f14262b;
                    synchronized (lj0Var) {
                        lj0Var.f17026p = jSONObject;
                    }
                    return;
                }
                return;
            default:
                ((ez) ((lj1) this.f14262b).f17037c).a(jSONObject.optBoolean("npa_reset") ? -1 : jSONObject.optBoolean("npa"), jSONObject.optLong("timestamp"));
                return;
        }
    }
}
