package com.ironsource;

import android.content.Context;
import com.ironsource.sdk.service.Connectivity.BroadcastReceiverStrategy;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class R3 implements InterfaceC0584t7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC0566s7 f27121a;

    public R3(JSONObject jSONObject, Context context) {
        InterfaceC0566s7 interfaceC0566s7A = a(jSONObject, context);
        this.f27121a = interfaceC0566s7A;
        Logger.i("R3", "created ConnectivityAdapter with strategy ".concat(interfaceC0566s7A.getClass().getSimpleName()));
    }

    @Override // com.ironsource.InterfaceC0584t7
    public void a() {
    }

    @Override // com.ironsource.InterfaceC0584t7
    public void b(String str, JSONObject jSONObject) {
    }

    public void c(Context context) {
        this.f27121a.a(context);
    }

    @Override // com.ironsource.InterfaceC0584t7
    public void a(String str, JSONObject jSONObject) {
    }

    public void b(Context context) {
        this.f27121a.b(context);
    }

    public JSONObject a(Context context) {
        return this.f27121a.c(context);
    }

    public void b() {
        this.f27121a.a();
    }

    private InterfaceC0566s7 a(JSONObject jSONObject, Context context) {
        if (jSONObject.optInt(X3.j.g0) == 1) {
            return new BroadcastReceiverStrategy(this);
        }
        if (!E1.c(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return new BroadcastReceiverStrategy(this);
        }
        return new C0393ic(this);
    }
}
