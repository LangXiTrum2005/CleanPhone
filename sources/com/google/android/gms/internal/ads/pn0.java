package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class pn0 implements pm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nh0 f18743a;

    public pn0(nh0 nh0Var) {
        this.f18743a = nh0Var;
    }

    @Override // com.google.android.gms.internal.ads.pm0
    public final qm0 a(String str, JSONObject jSONObject) {
        return new qm0(this.f18743a.a(str, jSONObject), new jn0(), str);
    }
}
