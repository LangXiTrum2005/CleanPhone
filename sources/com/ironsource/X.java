package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface X {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a implements X {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final JSONObject f27612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final A7 f27613b;

        public a(JSONObject applicationConfig, A7 epService) {
            kotlin.jvm.internal.n.f(applicationConfig, "applicationConfig");
            kotlin.jvm.internal.n.f(epService, "epService");
            this.f27612a = applicationConfig;
            this.f27613b = epService;
        }

        @Override // com.ironsource.X
        public String a() {
            String strA = this.f27613b.a();
            if (an.h.y0(strA)) {
                strA = null;
            }
            if (strA != null) {
                return strA;
            }
            String it = this.f27612a.optString("controllerUrl");
            kotlin.jvm.internal.n.e(it, "it");
            String str = an.h.y0(it) ? null : it;
            return str == null ? "" : str;
        }

        @Override // com.ironsource.X
        public JSONObject b() {
            JSONObject jSONObjectOptJSONObject = this.f27612a.optJSONObject("controllerConfig");
            return jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        }

        @Override // com.ironsource.X
        public int c() {
            int iOptInt = this.f27612a.optInt("debugMode", 0);
            if (this.f27612a.optBoolean(b.f27618e, false)) {
                return 3;
            }
            return iOptInt;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f27614a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f27615b = "controllerUrl";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f27616c = "controllerConfig";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f27617d = "debugMode";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f27618e = "adptDebugMode";

        private b() {
        }
    }

    String a();

    JSONObject b();

    int c();
}
