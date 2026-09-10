package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g70 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t80 f14783b;

    public /* synthetic */ g70(t80 t80Var, int i10) {
        this.f14782a = i10;
        this.f14783b = t80Var;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final /* bridge */ /* synthetic */ Object zzb() {
        int i10 = this.f14782a;
        t80 t80Var = this.f14783b;
        switch (i10) {
            case 0:
                try {
                    return new JSONObject(t80Var.a().f13721z);
                } catch (JSONException unused) {
                    return null;
                }
            default:
                return new le0(t80Var.a());
        }
    }
}
