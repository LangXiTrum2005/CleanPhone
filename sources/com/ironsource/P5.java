package com.ironsource;

import android.content.Context;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class P5 implements Lc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f26995a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f26996b = Q5.f27088j;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a implements InterfaceC0352g7 {
        @Override // com.ironsource.InterfaceC0352g7
        public void a(boolean z10) {
            if (z10) {
                return;
            }
            IronLog.API.error("failed to send impression data");
        }
    }

    private final JSONObject b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Wa.f27581o, "android");
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        if (applicationContext != null) {
            jSONObject.put("deviceType", IronSourceUtils.b(applicationContext));
            Q9 q9D = IronSourceUtils.d(applicationContext);
            if (q9D != null) {
                jSONObject.put("advId", q9D.c());
                jSONObject.put("advIdType", q9D.d());
            }
        }
        String strI = com.ironsource.mediationsdk.p.h().i();
        if (strI != null) {
            jSONObject.put(X3.j.f27840g, strI);
        }
        return jSONObject;
    }

    @Override // com.ironsource.Lc
    public void a() {
    }

    public final void a(String dataSource, JSONObject impressionData) {
        kotlin.jvm.internal.n.f(dataSource, "dataSource");
        kotlin.jvm.internal.n.f(impressionData, "impressionData");
        if (!this.f26995a) {
            IronLog.INTERNAL.verbose("disabled from server");
            return;
        }
        try {
            JSONObject jSONObjectB = b();
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("externalMediationSource", dataSource);
            jSONObject.putOpt("externalMediationData", impressionData);
            jSONObject.putOpt("clientParams", jSONObjectB);
            IronLog.API.info("impressionData: " + jSONObject);
            C0334f7.a(this.f26996b, jSONObject.toString(), new a());
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.API.error("exception " + e10.getMessage() + " sending impression data");
        }
    }

    @Override // com.ironsource.Lc
    public void a(List<IronSource.a> list, boolean z10, N3 n3) {
        if (n3 != null) {
            C1 c1B = n3.b();
            M1 m1F = c1B != null ? c1B.f() : null;
            kotlin.jvm.internal.n.c(m1F);
            this.f26995a = m1F.l();
            this.f26996b = n3.b().f().d();
        }
    }

    @Override // com.ironsource.Lc
    public void g(String str) {
    }
}
