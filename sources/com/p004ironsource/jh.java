package com.p004ironsource;

import android.content.Context;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.sdk.utils.IronSourceStorageUtils;
import com.p004ironsource.sdk.utils.Logger;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class jh implements z2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f25419b = "jh";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static jh f25420c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, di> f25421a = androidx.datastore.preferences.protobuf.a.r();

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ih f25422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f25423b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f25424c;

        public a(ih ihVar, Context context, String str) {
            this.f25422a = ihVar;
            this.f25423b = context;
            this.f25424c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            jh.this.f25421a.put(this.f25424c, new dh(this.f25422a, this.f25423b));
        }
    }

    private bh a(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString(d9.h.O));
            String string = jSONObject2.get("height").toString();
            String string2 = jSONObject2.get("width").toString();
            return new bh(Integer.parseInt(string2), Integer.parseInt(string), jSONObject2.get("label").toString());
        } catch (Exception e2) {
            q9.d().a(e2);
            return new bh();
        }
    }

    private bh b(JSONObject jSONObject) {
        bh bhVar = new bh();
        try {
            return a(jSONObject);
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return bhVar;
        }
    }

    public String c(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null || !jSONObject.has("adViewId")) {
            return (jSONObject == null || !jSONObject.has("params")) ? "" : new JSONObject(jSONObject.getString("params")).getString("adViewId");
        }
        return jSONObject.getString("adViewId");
    }

    public void d(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = new JSONObject(jSONObject.getString("params")).getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(f25419b, "sendMessageToAd fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        if (!this.f25421a.containsKey(string)) {
            Logger.i(f25419b, "sendMessageToAd fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        di diVar = this.f25421a.get(string);
        if (diVar != null) {
            diVar.c(jSONObject, str, str2);
        }
    }

    private boolean d(JSONObject jSONObject) {
        return jSONObject.optBoolean(d9.h.s0);
    }

    @Override // com.p004ironsource.z2
    public di a(String str) {
        if (str.isEmpty() || !this.f25421a.containsKey(str)) {
            return null;
        }
        return this.f25421a.get(str);
    }

    public void b(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(f25419b, "performWebViewAction fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        if (!this.f25421a.containsKey(string)) {
            Logger.i(f25419b, "performWebViewAction fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        di diVar = this.f25421a.get(string);
        String string2 = jSONObject.getString(d9.h.v0);
        if (diVar != null) {
            diVar.a(string2, str, str2);
        }
    }

    public void c(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(f25419b, "removeAdView fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        if (!this.f25421a.containsKey(string)) {
            Logger.i(f25419b, "removeAdView fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        di diVar = this.f25421a.get(string);
        this.f25421a.remove(string);
        if (diVar != null) {
            diVar.a(str, str2);
        }
    }

    public static synchronized jh a() {
        try {
            if (f25420c == null) {
                f25420c = new jh();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f25420c;
    }

    public void a(eh ehVar, JSONObject jSONObject, Context context, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(f25419b, "loadWithUrl fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        bh bhVarB = b(jSONObject);
        if (this.f25421a.containsKey(string)) {
            Logger.i(f25419b, "sendMessageToAd fail - collection already contain adViewId");
            throw new Exception("collection already contain adViewId");
        }
        ih ihVar = new ih(ehVar, context, string, bhVarB);
        ihVar.e(IronSourceStorageUtils.getNetworkStorageDir(context));
        ihVar.b(jSONObject, str, str2);
        if (d(jSONObject)) {
            pg.f26494a.d(new a(ihVar, context, string));
        } else {
            this.f25421a.put(string, ihVar);
        }
    }

    public void a(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(f25419b, "removeAdView fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        if (!this.f25421a.containsKey(string)) {
            Logger.i(f25419b, "removeAdView fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        di diVar = this.f25421a.get(string);
        if (diVar != null) {
            diVar.a(jSONObject, str, str2);
        }
    }
}
