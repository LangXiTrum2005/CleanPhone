package com.p004ironsource;

import android.content.Context;
import com.p004ironsource.sdk.service.Connectivity.BroadcastReceiverStrategy;
import com.p004ironsource.sdk.utils.Logger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class x8 implements qf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private pf f27680a;

    public x8(JSONObject jSONObject, Context context) {
        pf pfVarA = a(jSONObject, context);
        this.f27680a = pfVarA;
        Logger.i("x8", "created ConnectivityAdapter with strategy ".concat(pfVarA.getClass().getSimpleName()));
    }

    private pf a(JSONObject jSONObject, Context context) {
        if (jSONObject.optInt(d9.i.g0) != 1 && b4.c(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return new lo(this);
        }
        return new BroadcastReceiverStrategy(this);
    }

    public void b() {
        this.f27680a.a();
    }

    public void c(Context context) {
        this.f27680a.a(context);
    }

    public JSONObject a(Context context) {
        return this.f27680a.c(context);
    }

    public void b(Context context) {
        this.f27680a.b(context);
    }

    @Override // com.p004ironsource.qf
    public void a() {
    }

    @Override // com.p004ironsource.qf
    public void b(String str, JSONObject jSONObject) {
    }

    @Override // com.p004ironsource.qf
    public void a(String str, JSONObject jSONObject) {
    }
}
