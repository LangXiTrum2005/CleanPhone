package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.k8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3599k8 implements InterfaceC3467d1 {
    private static final String b = "k8";
    private static C3599k8 c;
    private final Map<String, F8> a = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: com.ironsource.k8$a */
    public class a implements Runnable {
        final /* synthetic */ C3581j8 a;
        final /* synthetic */ Context b;
        final /* synthetic */ String c;

        public a(C3581j8 c3581j8, Context context, String str) {
            this.a = c3581j8;
            this.b = context;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3599k8.this.a.put(this.c, new C3492e8(this.a, this.b));
        }
    }

    public static synchronized C3599k8 a() {
        try {
            if (c == null) {
                c = new C3599k8();
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    private C3456c8 b(JSONObject jSONObject) {
        C3456c8 c3456c8 = new C3456c8();
        try {
            return a(jSONObject);
        } catch (Exception e) {
            C3631m4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return c3456c8;
        }
    }

    private boolean d(JSONObject jSONObject) {
        return jSONObject.optBoolean(X3.i.s0);
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
            Logger.i(b, "sendMessageToAd fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        if (!this.a.containsKey(string)) {
            Logger.i(b, "sendMessageToAd fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        F8 f8 = this.a.get(string);
        if (f8 != null) {
            f8.c(jSONObject, str, str2);
        }
    }

    private C3456c8 a(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString(X3.i.O));
            String string = jSONObject2.get("height").toString();
            String string2 = jSONObject2.get("width").toString();
            return new C3456c8(Integer.parseInt(string2), Integer.parseInt(string), jSONObject2.get("label").toString());
        } catch (Exception e) {
            C3631m4.d().a(e);
            return new C3456c8();
        }
    }

    public void b(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            if (this.a.containsKey(string)) {
                F8 f8 = this.a.get(string);
                String string2 = jSONObject.getString(X3.i.v0);
                if (f8 != null) {
                    f8.a(string2, str, str2);
                    return;
                }
                return;
            }
            Logger.i(b, "performWebViewAction fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        Logger.i(b, "performWebViewAction fail - adViewId is empty");
        throw new Exception("adViewId is empty");
    }

    public void c(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            if (this.a.containsKey(string)) {
                F8 f8 = this.a.get(string);
                this.a.remove(string);
                if (f8 != null) {
                    f8.a(str, str2);
                    return;
                }
                return;
            }
            Logger.i(b, "removeAdView fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        Logger.i(b, "removeAdView fail - adViewId is empty");
        throw new Exception("adViewId is empty");
    }

    public void a(InterfaceC3510f8 interfaceC3510f8, JSONObject jSONObject, Context context, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            C3456c8 c3456c8B = b(jSONObject);
            if (!this.a.containsKey(string)) {
                C3581j8 c3581j8 = new C3581j8(interfaceC3510f8, context, string, c3456c8B);
                c3581j8.e(IronSourceStorageUtils.getNetworkStorageDir(context));
                c3581j8.b(jSONObject, str, str2);
                if (d(jSONObject)) {
                    P7.a.d(new a(c3581j8, context, string));
                    return;
                } else {
                    this.a.put(string, c3581j8);
                    return;
                }
            }
            Logger.i(b, "sendMessageToAd fail - collection already contain adViewId");
            throw new Exception("collection already contain adViewId");
        }
        Logger.i(b, "loadWithUrl fail - adViewId is empty");
        throw new Exception("adViewId is empty");
    }

    @Override // com.ironsource.InterfaceC3467d1
    public F8 a(String str) {
        if (str.isEmpty() || !this.a.containsKey(str)) {
            return null;
        }
        return this.a.get(str);
    }

    public void a(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            if (this.a.containsKey(string)) {
                F8 f8 = this.a.get(string);
                if (f8 != null) {
                    f8.a(jSONObject, str, str2);
                    return;
                }
                return;
            }
            Logger.i(b, "removeAdView fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        Logger.i(b, "removeAdView fail - adViewId is empty");
        throw new Exception("adViewId is empty");
    }
}
