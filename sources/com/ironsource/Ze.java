package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Ze {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C0243a6 f28130a;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public final class a extends Ye {
        public a() {
        }

        @Override // com.ironsource.Ye, java.lang.Runnable
        public void run() {
            JSONObject jSONObjectB = IronSourceUtils.b(false);
            try {
                jSONObjectB.put(IronSourceConstants.EVENTS_DURATION, a());
            } catch (JSONException e10) {
                C0474n4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
            C0304dd.P.a(new C0654x5(EnumC0672y5.APP_ENTER_BACKGROUND, jSONObjectB));
        }
    }

    public final void a(InterfaceC0441l7 applicationLifecycleService) {
        kotlin.jvm.internal.n.f(applicationLifecycleService, "applicationLifecycleService");
        this.f28130a = new C0243a6(applicationLifecycleService, new a());
    }
}
