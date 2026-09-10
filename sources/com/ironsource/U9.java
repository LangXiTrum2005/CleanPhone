package com.ironsource;

import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class U9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    S6 f27310a = new S6();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends AbstractRunnableC0430ke {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ EnumC0609ue f27311b;

        public a(EnumC0609ue enumC0609ue) {
            this.f27311b = enumC0609ue;
        }

        @Override // com.ironsource.AbstractRunnableC0430ke
        public void a() {
            U9.this.f27310a.a(O6.g0, new JSONArray().put(this.f27311b.b()));
        }
    }

    public void a(JSONObject jSONObject) {
        this.f27310a.a(O6.f26751u, (Object) jSONObject);
    }

    public void b() {
        this.f27310a.a(O6.T0);
    }

    public void c(String str) {
        this.f27310a.a(O6.L0, str);
    }

    public void d(String str) {
        this.f27310a.a(O6.N0, str);
    }

    public void e(String str) {
        this.f27310a.a(com.ironsource.mediationsdk.metadata.a.f29612i, str);
    }

    public void f(String str) {
        this.f27310a.a(O6.f26701b1, str);
    }

    public void g(String str) {
        this.f27310a.a(O6.A, str);
    }

    public void h(String str) {
        this.f27310a.a(O6.f26710e1, str);
    }

    public void i(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f27310a.a(O6.f26709e0, str);
    }

    public void a(boolean z10) {
        this.f27310a.a(O6.S0, Boolean.valueOf(z10));
    }

    public void b(JSONObject jSONObject) {
        this.f27310a.a(O6.f26713f1, (Object) jSONObject);
    }

    public void c(int i10) {
        this.f27310a.a(O6.f26712f0, Integer.valueOf(i10));
    }

    public void a(List<String> list) {
        if (list != null) {
            this.f27310a.a(O6.T0, (Object) new JSONArray((Collection) list));
        }
    }

    public void b(int i10) {
        if (i10 >= 0) {
            this.f27310a.a(O6.V0, Integer.valueOf(i10));
        }
    }

    public void a() {
        this.f27310a.a(O6.S0);
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f27310a.a(O6.D1, str);
    }

    public void a(Context context) {
        this.f27310a.a(context);
    }

    public void a(Boolean bool) {
        this.f27310a.a(O6.W0, bool);
    }

    public void b(Context context) {
        InterfaceC0674y7 interfaceC0674y7A = Kb.Y().a();
        ActivityManager.MemoryInfo memoryInfoO = interfaceC0674y7A.o(context);
        this.f27310a.a(O6.f26757w, interfaceC0674y7A.c(memoryInfoO));
        this.f27310a.a(O6.f26760x, interfaceC0674y7A.b(memoryInfoO));
    }

    public void a(EnumC0609ue enumC0609ue) {
        new Thread(new a(enumC0609ue)).start();
    }

    public void a(Q7 q10) {
        try {
            HashMap map = new HashMap();
            map.put(O6.E, q10.a());
            map.put(O6.D, q10.b());
            map.put(O6.V, q10.c());
            this.f27310a.a(map);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
        }
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f27310a.a("abt", str);
    }

    public void a(int i10) {
        this.f27310a.a(O6.f26722j0, Integer.valueOf(i10));
    }
}
