package com.ironsource;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Nb {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f26654d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JSONObject f26657c;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final Nb a(String jsonStr) throws JSONException {
            kotlin.jvm.internal.n.f(jsonStr, "jsonStr");
            JSONObject jSONObject = new JSONObject(jsonStr);
            String adId = jSONObject.getString(com.ironsource.sdk.controller.f.b.f30388c);
            String command = jSONObject.getString(com.ironsource.sdk.controller.f.b.f30392g);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
            kotlin.jvm.internal.n.e(adId, "adId");
            kotlin.jvm.internal.n.e(command, "command");
            return new Nb(adId, command, jSONObjectOptJSONObject);
        }

        private a() {
        }
    }

    public Nb(String adId, String command, JSONObject jSONObject) {
        kotlin.jvm.internal.n.f(adId, "adId");
        kotlin.jvm.internal.n.f(command, "command");
        this.f26655a = adId;
        this.f26656b = command;
        this.f26657c = jSONObject;
    }

    public final String a() {
        return this.f26655a;
    }

    public final String b() {
        return this.f26656b;
    }

    public final JSONObject c() {
        return this.f26657c;
    }

    public final String d() {
        return this.f26655a;
    }

    public final String e() {
        return this.f26656b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Nb)) {
            return false;
        }
        Nb nb2 = (Nb) obj;
        return kotlin.jvm.internal.n.a(this.f26655a, nb2.f26655a) && kotlin.jvm.internal.n.a(this.f26656b, nb2.f26656b) && kotlin.jvm.internal.n.a(this.f26657c, nb2.f26657c);
    }

    public final JSONObject f() {
        return this.f26657c;
    }

    public int hashCode() {
        int iE = d5.u.e(this.f26655a.hashCode() * 31, 31, this.f26656b);
        JSONObject jSONObject = this.f26657c;
        return iE + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public String toString() {
        String str = this.f26655a;
        String str2 = this.f26656b;
        JSONObject jSONObject = this.f26657c;
        StringBuilder sbV = defpackage.e.v("MessageToNative(adId=", str, ", command=", str2, ", params=");
        sbV.append(jSONObject);
        sbV.append(")");
        return sbV.toString();
    }

    public final Nb a(String adId, String command, JSONObject jSONObject) {
        kotlin.jvm.internal.n.f(adId, "adId");
        kotlin.jvm.internal.n.f(command, "command");
        return new Nb(adId, command, jSONObject);
    }

    public static /* synthetic */ Nb a(Nb nb2, String str, String str2, JSONObject jSONObject, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = nb2.f26655a;
        }
        if ((i10 & 2) != 0) {
            str2 = nb2.f26656b;
        }
        if ((i10 & 4) != 0) {
            jSONObject = nb2.f26657c;
        }
        return nb2.a(str, str2, jSONObject);
    }

    public static final Nb a(String str) throws JSONException {
        return f26654d.a(str);
    }
}
