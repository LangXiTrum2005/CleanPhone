package com.ironsource.sdk.controller;

import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface f {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0085a f30383c = new C0085a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f30384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final JSONObject f30385b;

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class C0085a {
            public /* synthetic */ C0085a(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final a a(String jsonStr) throws JSONException {
                kotlin.jvm.internal.n.f(jsonStr, "jsonStr");
                JSONObject jSONObject = new JSONObject(jsonStr);
                String id2 = jSONObject.getString(b.f30387b);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
                kotlin.jvm.internal.n.e(id2, "id");
                return new a(id2, jSONObjectOptJSONObject);
            }

            private C0085a() {
            }
        }

        public a(String msgId, JSONObject jSONObject) {
            kotlin.jvm.internal.n.f(msgId, "msgId");
            this.f30384a = msgId;
            this.f30385b = jSONObject;
        }

        public final String a() {
            return this.f30384a;
        }

        public final JSONObject b() {
            return this.f30385b;
        }

        public final String c() {
            return this.f30384a;
        }

        public final JSONObject d() {
            return this.f30385b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.n.a(this.f30384a, aVar.f30384a) && kotlin.jvm.internal.n.a(this.f30385b, aVar.f30385b);
        }

        public int hashCode() {
            int iHashCode = this.f30384a.hashCode() * 31;
            JSONObject jSONObject = this.f30385b;
            return iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
        }

        public String toString() {
            return "CallbackToNative(msgId=" + this.f30384a + ", params=" + this.f30385b + ")";
        }

        public final a a(String msgId, JSONObject jSONObject) {
            kotlin.jvm.internal.n.f(msgId, "msgId");
            return new a(msgId, jSONObject);
        }

        public static /* synthetic */ a a(a aVar, String str, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = aVar.f30384a;
            }
            if ((i10 & 2) != 0) {
                jSONObject = aVar.f30385b;
            }
            return aVar.a(str, jSONObject);
        }

        public static final a a(String str) throws JSONException {
            return f30383c.a(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f30386a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f30387b = "msgId";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f30388c = "adId";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f30389d = "params";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f30390e = "success";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f30391f = "reason";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f30392g = "command";

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f30393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f30394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final JSONObject f30395c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f30396d;

        public c(String adId, String command, JSONObject params) {
            kotlin.jvm.internal.n.f(adId, "adId");
            kotlin.jvm.internal.n.f(command, "command");
            kotlin.jvm.internal.n.f(params, "params");
            this.f30393a = adId;
            this.f30394b = command;
            this.f30395c = params;
            String string = UUID.randomUUID().toString();
            kotlin.jvm.internal.n.e(string, "randomUUID().toString()");
            this.f30396d = string;
        }

        public final String a() {
            return this.f30393a;
        }

        public final String b() {
            return this.f30394b;
        }

        public final JSONObject c() {
            return this.f30395c;
        }

        public final String d() {
            return this.f30393a;
        }

        public final String e() {
            return this.f30394b;
        }

        public boolean equals(Object obj) {
            c cVar = obj instanceof c ? (c) obj : null;
            if (cVar == null) {
                return false;
            }
            if (this == cVar) {
                return true;
            }
            return kotlin.jvm.internal.n.a(this.f30396d, cVar.f30396d) && kotlin.jvm.internal.n.a(this.f30393a, cVar.f30393a) && kotlin.jvm.internal.n.a(this.f30394b, cVar.f30394b) && kotlin.jvm.internal.n.a(this.f30395c.toString(), cVar.f30395c.toString());
        }

        public final String f() {
            return this.f30396d;
        }

        public final JSONObject g() {
            return this.f30395c;
        }

        public final String h() {
            String string = new JSONObject().put(b.f30387b, this.f30396d).put(b.f30388c, this.f30393a).put("params", this.f30395c).toString();
            kotlin.jvm.internal.n.e(string, "JSONObject()\n          .…ms)\n          .toString()");
            return string;
        }

        public int hashCode() {
            return super.hashCode();
        }

        public String toString() {
            String str = this.f30393a;
            String str2 = this.f30394b;
            JSONObject jSONObject = this.f30395c;
            StringBuilder sbV = defpackage.e.v("MessageToController(adId=", str, ", command=", str2, ", params=");
            sbV.append(jSONObject);
            sbV.append(")");
            return sbV.toString();
        }

        public final c a(String adId, String command, JSONObject params) {
            kotlin.jvm.internal.n.f(adId, "adId");
            kotlin.jvm.internal.n.f(command, "command");
            kotlin.jvm.internal.n.f(params, "params");
            return new c(adId, command, params);
        }

        public static /* synthetic */ c a(c cVar, String str, String str2, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = cVar.f30393a;
            }
            if ((i10 & 2) != 0) {
                str2 = cVar.f30394b;
            }
            if ((i10 & 4) != 0) {
                jSONObject = cVar.f30395c;
            }
            return cVar.a(str, str2, jSONObject);
        }

        public final void a(String str) {
            kotlin.jvm.internal.n.f(str, "<set-?>");
            this.f30396d = str;
        }
    }
}
