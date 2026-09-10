package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzb;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class vd0 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uw f21153b;

    public /* synthetic */ vd0(uw uwVar, int i10) {
        this.f21152a = i10;
        this.f21153b = uwVar;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        switch (this.f21152a) {
            case 0:
                JSONObject jSONObject = (JSONObject) this.f21153b.f20919c;
                ic1.h(jSONObject);
                return jSONObject;
            case 1:
                ng0 ng0Var = (ng0) this.f21153b.f20920d;
                ic1.h(ng0Var);
                return ng0Var;
            case 2:
                return (zzb) this.f21153b.f20921e;
            default:
                return (bz) this.f21153b.f20918b;
        }
    }
}
