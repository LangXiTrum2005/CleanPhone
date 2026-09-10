package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.w4;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f9636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f9637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f9638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f9639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map f9640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f9641f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map f9642g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private w4.a f9643h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f9644i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f9645j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f9646k;
    private boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f9647m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f9648n;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f9649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f9650b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f9651c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f9652d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map f9653e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map f9654f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Map f9655g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private w4.a f9656h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f9657i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f9658j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f9659k;
        private boolean l;

        public b a(String str) {
            this.f9652d = str;
            return this;
        }

        public b b(String str) {
            this.f9649a = str;
            return this;
        }

        public b c(String str) {
            this.f9650b = str;
            return this;
        }

        public b d(String str) {
            this.f9651c = str;
            return this;
        }

        public b a(Map map) {
            this.f9654f = map;
            return this;
        }

        public b b(Map map) {
            this.f9653e = map;
            return this;
        }

        public b c(Map map) {
            this.f9655g = map;
            return this;
        }

        public b d(boolean z10) {
            this.f9659k = z10;
            return this;
        }

        public b a(w4.a aVar) {
            this.f9656h = aVar;
            return this;
        }

        public b b(boolean z10) {
            this.l = z10;
            return this;
        }

        public b c(boolean z10) {
            this.f9658j = z10;
            return this;
        }

        public b a(boolean z10) {
            this.f9657i = z10;
            return this;
        }

        public d a() {
            return new d(this);
        }
    }

    public static b b() {
        return new b();
    }

    public void a() {
        Map map = CollectionUtils.map(this.f9640e);
        map.put("postback_ts", String.valueOf(System.currentTimeMillis()));
        this.f9640e = map;
    }

    public int c() {
        return this.f9648n;
    }

    public String d() {
        return this.f9639d;
    }

    public String e() {
        return this.f9647m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f9636a.equals(((d) obj).f9636a);
    }

    public w4.a f() {
        return this.f9643h;
    }

    public Map g() {
        return this.f9641f;
    }

    public String h() {
        return this.f9637b;
    }

    public int hashCode() {
        return this.f9636a.hashCode();
    }

    public Map i() {
        return this.f9640e;
    }

    public Map j() {
        return this.f9642g;
    }

    public String k() {
        return this.f9638c;
    }

    public void l() {
        this.f9648n++;
    }

    public boolean m() {
        return this.f9646k;
    }

    public boolean n() {
        return this.f9644i;
    }

    public boolean o() {
        return this.f9645j;
    }

    public boolean p() {
        return this.l;
    }

    public JSONObject q() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uniqueId", this.f9636a);
        jSONObject.put("communicatorRequestId", this.f9647m);
        jSONObject.put("httpMethod", this.f9637b);
        jSONObject.put("targetUrl", this.f9638c);
        jSONObject.put("backupUrl", this.f9639d);
        jSONObject.put("encodingType", this.f9643h);
        jSONObject.put("isEncodingEnabled", this.f9644i);
        jSONObject.put("gzipBodyEncoding", this.f9645j);
        jSONObject.put("isAllowedPreInitEvent", this.f9646k);
        jSONObject.put("attemptNumber", this.f9648n);
        if (this.f9640e != null) {
            jSONObject.put("parameters", new JSONObject(this.f9640e));
        }
        if (this.f9641f != null) {
            jSONObject.put("httpHeaders", new JSONObject(this.f9641f));
        }
        if (this.f9642g != null) {
            jSONObject.put("requestBody", new JSONObject(this.f9642g));
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PostbackRequest{uniqueId='");
        sb2.append(this.f9636a);
        sb2.append("', communicatorRequestId='");
        sb2.append(this.f9647m);
        sb2.append("', httpMethod='");
        sb2.append(this.f9637b);
        sb2.append("', targetUrl='");
        sb2.append(this.f9638c);
        sb2.append("', backupUrl='");
        sb2.append(this.f9639d);
        sb2.append("', attemptNumber=");
        sb2.append(this.f9648n);
        sb2.append(", isEncodingEnabled=");
        sb2.append(this.f9644i);
        sb2.append(", isGzipBodyEncoding=");
        sb2.append(this.f9645j);
        sb2.append(", isAllowedPreInitEvent=");
        sb2.append(this.f9646k);
        sb2.append(", shouldFireInWebView=");
        return defpackage.e.t(sb2, this.l, '}');
    }

    public d(JSONObject jSONObject, l lVar) throws JSONException {
        String string = JsonUtils.getString(jSONObject, "uniqueId", UUID.randomUUID().toString());
        String string2 = JsonUtils.getString(jSONObject, "communicatorRequestId", "");
        String string3 = JsonUtils.getString(jSONObject, "httpMethod", "");
        String string4 = jSONObject.getString("targetUrl");
        String string5 = JsonUtils.getString(jSONObject, "backupUrl", "");
        int i10 = jSONObject.getInt("attemptNumber");
        Map mapSynchronizedMap = JsonUtils.valueExists(jSONObject, "parameters") ? Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("parameters"))) : new HashMap();
        Map mapSynchronizedMap2 = JsonUtils.valueExists(jSONObject, "httpHeaders") ? Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("httpHeaders"))) : new HashMap();
        Map mapSynchronizedMap3 = JsonUtils.valueExists(jSONObject, "requestBody") ? Collections.synchronizedMap(JsonUtils.toStringObjectMap(jSONObject.getJSONObject("requestBody"))) : new HashMap();
        this.f9636a = string;
        this.f9637b = string3;
        this.f9647m = string2;
        this.f9638c = string4;
        this.f9639d = string5;
        this.f9640e = mapSynchronizedMap;
        this.f9641f = mapSynchronizedMap2;
        this.f9642g = mapSynchronizedMap3;
        this.f9643h = w4.a.a(jSONObject.optInt("encodingType", w4.a.DEFAULT.b()));
        this.f9644i = jSONObject.optBoolean("isEncodingEnabled", false);
        this.f9645j = jSONObject.optBoolean("gzipBodyEncoding", false);
        this.f9646k = jSONObject.optBoolean("isAllowedPreInitEvent", false);
        this.l = jSONObject.optBoolean("shouldFireInWebView", false);
        this.f9648n = i10;
    }

    private d(b bVar) {
        this.f9636a = UUID.randomUUID().toString();
        this.f9637b = bVar.f9650b;
        this.f9638c = bVar.f9651c;
        this.f9639d = bVar.f9652d;
        this.f9640e = bVar.f9653e;
        this.f9641f = bVar.f9654f;
        this.f9642g = bVar.f9655g;
        this.f9643h = bVar.f9656h;
        this.f9644i = bVar.f9657i;
        this.f9645j = bVar.f9658j;
        this.f9646k = bVar.f9659k;
        this.l = bVar.l;
        this.f9647m = bVar.f9649a;
        this.f9648n = 0;
    }
}
