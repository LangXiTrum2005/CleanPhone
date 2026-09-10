package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.C0395ie;
import com.ironsource.InterfaceC0480na;
import com.ironsource.InterfaceC0674y7;
import com.ironsource.Kb;
import com.ironsource.X3;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f30408c = "i";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f30409d = "getDeviceData";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f30410e = "deviceDataFunction";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f30411f = "deviceDataParams";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f30412g = "success";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f30413h = "fail";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f30414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0674y7 f30415b = Kb.Y().a();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f30416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        JSONObject f30417b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f30418c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f30419d;

        public /* synthetic */ a(int i10) {
            this();
        }

        private a() {
        }
    }

    public i(Context context) {
        this.f30414a = context;
    }

    public void a(String str, InterfaceC0480na interfaceC0480na) throws Exception {
        a aVarA = a(str);
        if (f30409d.equals(aVarA.f30416a)) {
            interfaceC0480na.a(true, aVarA.f30418c, a());
            return;
        }
        Logger.i(f30408c, "unhandled API request " + str);
    }

    private C0395ie a() {
        C0395ie c0395ie = new C0395ie();
        c0395ie.b(SDKUtils.encodeString(X3.j.f27844i0), SDKUtils.encodeString(String.valueOf(this.f30415b.j())));
        c0395ie.b(SDKUtils.encodeString(X3.j.f27846j0), SDKUtils.encodeString(String.valueOf(this.f30415b.r(this.f30414a))));
        c0395ie.b(SDKUtils.encodeString(X3.j.f27848k0), SDKUtils.encodeString(String.valueOf(this.f30415b.D(this.f30414a))));
        c0395ie.b(SDKUtils.encodeString(X3.j.f27849l0), SDKUtils.encodeString(String.valueOf(this.f30415b.E(this.f30414a))));
        c0395ie.b(SDKUtils.encodeString(X3.j.f27851m0), SDKUtils.encodeString(String.valueOf(this.f30415b.f(this.f30414a))));
        c0395ie.b(SDKUtils.encodeString(X3.j.f27853n0), SDKUtils.encodeString(String.valueOf(this.f30415b.i(this.f30414a))));
        return c0395ie;
    }

    private a a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        a aVar = new a(0);
        aVar.f30416a = jSONObject.optString(f30410e);
        aVar.f30417b = jSONObject.optJSONObject(f30411f);
        aVar.f30418c = jSONObject.optString("success");
        aVar.f30419d = jSONObject.optString("fail");
        return aVar;
    }
}
