package com.mbridge.msdk.config.component.common.metrics;

import com.applovin.impl.sdk.b0;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.report.d;
import com.mbridge.msdk.foundation.same.report.n;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.tracker.e;
import com.mbridge.msdk.tracker.m;
import com.mbridge.msdk.tracker.network.toolbox.h;
import com.mbridge.msdk.tracker.p;
import com.mbridge.msdk.tracker.x;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    m f31949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    x f31950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    JSONObject f31951c;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final a f31952a = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(e eVar) throws Exception {
        return true;
    }

    private m c() {
        try {
            m mVar = this.f31949a;
            if (mVar == null) {
                m mVarA = m.a("metrics_component", c.n().d(), b());
                this.f31949a = mVarA;
                if (mVarA != null) {
                    JSONObject jSONObject = this.f31951c;
                    if (jSONObject != null) {
                        mVarA.a(jSONObject);
                    }
                    this.f31949a.h();
                }
            } else {
                JSONObject jSONObject2 = this.f31951c;
                if (jSONObject2 != null) {
                    mVar.a(jSONObject2);
                }
            }
        } catch (Exception e10) {
            q0.b("ComponentMetrics", e10.getMessage());
        }
        return this.f31949a;
    }

    public void d() {
        if (this.f31949a == null) {
            this.f31949a = c();
        }
        this.f31949a.a();
    }

    private a() {
    }

    public static a a() {
        return b.f31952a;
    }

    public void b(Map<String, Object> map) {
        if (map != null) {
            try {
                this.f31951c = new JSONObject(map);
            } catch (Exception e10) {
                q0.b("ComponentMetrics", e10.getMessage());
            }
        }
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            try {
                String strValueOf = String.valueOf(map.get(com.mbridge.msdk.config.component.common.util.c.c(X3.i.W)));
                JSONObject jSONObject = new JSONObject(map);
                if (jSONObject.length() > 0) {
                    e eVar = new e(strValueOf);
                    eVar.a(jSONObject);
                    eVar.b(0);
                    eVar.a(0);
                    c().d(eVar);
                }
            } catch (Throwable th2) {
                q0.b("ComponentMetrics", th2.getMessage(), th2);
            }
        }
    }

    private x b() {
        if (this.f31950b == null) {
            this.f31950b = new x.b().a(604800000).b(50).d(50).c(15000).e(2).a(new d()).a(new b0(28)).a(new n()).a(0, new p(new h(), com.mbridge.msdk.foundation.same.net.utils.d.h().f33851d, 0)).a();
        }
        return this.f31950b;
    }

    public void a(x xVar) {
        if (xVar != null) {
            this.f31950b = xVar;
            m mVar = this.f31949a;
            if (mVar != null) {
                mVar.i();
                m.b("metrics_component");
                this.f31949a = null;
            }
            c();
        }
    }
}
