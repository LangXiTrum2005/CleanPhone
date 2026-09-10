package com.p004ironsource;

import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.WaterfallConfiguration;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class hk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    re f25243a = new re();

    public class a extends ks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ us f25244a;

        public a(us usVar) {
            this.f25244a = usVar;
        }

        @Override // com.p004ironsource.ks
        public void a() {
            hk.this.f25243a.a(ne.f0, new JSONArray().put(this.f25244a.getValue()));
        }
    }

    public void a(int i2) {
        this.f25243a.a(ne.h0, Integer.valueOf(i2));
    }

    public void b(int i2) {
        if (i2 >= 0) {
            this.f25243a.a(ne.R0, Integer.valueOf(i2));
        }
    }

    public void c(int i2) {
        this.f25243a.a(ne.e0, Integer.valueOf(i2));
    }

    public void d(String str) {
        this.f25243a.a(ne.K0, str);
    }

    public void e(String str) {
        this.f25243a.a(com.p004ironsource.mediationsdk.metadata.a.f25963i, str);
    }

    public void f(String str) {
        this.f25243a.a(ne.Y0, str);
    }

    public void g(String str) {
        this.f25243a.a(ne.f26254A, str);
    }

    public void h(String str) {
        this.f25243a.a(ne.b1, str);
    }

    public void i(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f25243a.a(ne.f26272d0, str);
    }

    public void a(Context context) {
        this.f25243a.a(context);
    }

    public void b(Context context) {
        vf vfVarF = on.U().f();
        ActivityManager.MemoryInfo memoryInfoZ = vfVarF.z(context);
        this.f25243a.a(ne.f26280w, vfVarF.c(memoryInfoZ));
        this.f25243a.a(ne.x, vfVarF.b(memoryInfoZ));
    }

    public void c(String str) {
        this.f25243a.a(ne.I0, str);
    }

    public void a(IronSource.AD_UNIT ad_unit, WaterfallConfiguration waterfallConfiguration) {
        JSONObject jSONObject = new JSONObject();
        if (waterfallConfiguration != null) {
            try {
                jSONObject.put(ne.s1, waterfallConfiguration.getFloor());
                jSONObject.put(ne.t1, waterfallConfiguration.getCeiling());
            } catch (JSONException e2) {
                q9.d().a(e2);
            }
        }
        if (jSONObject.length() == 0) {
            this.f25243a.a(ne.r1, v2.a(ad_unit));
        } else {
            this.f25243a.a(ne.r1, jSONObject, v2.a(ad_unit));
        }
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f25243a.a(ne.B1, str);
    }

    public void a(og ogVar) {
        try {
            HashMap map = new HashMap();
            map.put(ne.D, ogVar.a());
            map.put(ne.C, ogVar.b());
            map.put(ne.f26264U, ogVar.c());
            this.f25243a.a(map);
        } catch (Exception e2) {
            q9.d().a(e2);
        }
    }

    public void b(JSONObject jSONObject) {
        this.f25243a.a(ne.d1, (Object) jSONObject);
    }

    public void a(us usVar) {
        new Thread(new a(usVar)).start();
    }

    public void b(boolean z2) {
        this.f25243a.a("gpi", Boolean.valueOf(z2));
    }

    public void a(Boolean bool) {
        this.f25243a.a(ne.S0, bool);
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f25243a.a(ne.N0, str);
    }

    public void a(JSONObject jSONObject) {
        this.f25243a.a(ne.f26279u, (Object) jSONObject);
    }

    public void a(boolean z2) {
        this.f25243a.a(ne.P0, Boolean.valueOf(z2));
    }
}
