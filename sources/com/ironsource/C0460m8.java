package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.m8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0460m8 implements InterfaceC0292d1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f29249b = "m8";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static C0460m8 f29250c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, H8> f29251a = defpackage.e.w();

    /* JADX INFO: renamed from: com.ironsource.m8$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C0442l8 f29252a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f29253b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29254c;

        public a(C0442l8 c0442l8, Context context, String str) {
            this.f29252a = c0442l8;
            this.f29253b = context;
            this.f29254c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0460m8.this.f29251a.put(this.f29254c, new C0353g8(this.f29252a, this.f29253b));
        }
    }

    private C0317e8 b(JSONObject jSONObject) {
        C0317e8 c0317e8 = new C0317e8();
        try {
            return a(jSONObject);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return c0317e8;
        }
    }

    private boolean d(JSONObject jSONObject) {
        return jSONObject.optBoolean(X3.i.f27814s0);
    }

    public String c(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null || !jSONObject.has("adViewId")) {
            return (jSONObject == null || !jSONObject.has("params")) ? "" : new JSONObject(jSONObject.getString("params")).getString("adViewId");
        }
        return jSONObject.getString("adViewId");
    }

    public static synchronized C0460m8 a() {
        try {
            if (f29250c == null) {
                f29250c = new C0460m8();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f29250c;
    }

    public void d(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = new JSONObject(jSONObject.getString("params")).getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(f29249b, "sendMessageToAd fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        if (!this.f29251a.containsKey(string)) {
            Logger.i(f29249b, "sendMessageToAd fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        H8 h8 = this.f29251a.get(string);
        if (h8 != null) {
            h8.c(jSONObject, str, str2);
        }
    }

    private C0317e8 a(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString(X3.i.O));
            String string = jSONObject2.get("height").toString();
            String string2 = jSONObject2.get("width").toString();
            return new C0317e8(Integer.parseInt(string2), Integer.parseInt(string), jSONObject2.get("label").toString());
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            return new C0317e8();
        }
    }

    public void b(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            if (this.f29251a.containsKey(string)) {
                H8 h8 = this.f29251a.get(string);
                String string2 = jSONObject.getString(X3.i.f27819v0);
                if (h8 != null) {
                    h8.a(string2, str, str2);
                    return;
                }
                return;
            }
            Logger.i(f29249b, "performWebViewAction fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        Logger.i(f29249b, "performWebViewAction fail - adViewId is empty");
        throw new Exception("adViewId is empty");
    }

    public void c(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            if (this.f29251a.containsKey(string)) {
                H8 h8 = this.f29251a.get(string);
                this.f29251a.remove(string);
                if (h8 != null) {
                    h8.a(str, str2);
                    return;
                }
                return;
            }
            Logger.i(f29249b, "removeAdView fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        Logger.i(f29249b, "removeAdView fail - adViewId is empty");
        throw new Exception("adViewId is empty");
    }

    public void a(InterfaceC0371h8 interfaceC0371h8, JSONObject jSONObject, Context context, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            C0317e8 c0317e8B = b(jSONObject);
            if (!this.f29251a.containsKey(string)) {
                C0442l8 c0442l8 = new C0442l8(interfaceC0371h8, context, string, c0317e8B);
                c0442l8.e(IronSourceStorageUtils.getNetworkStorageDir(context));
                c0442l8.b(jSONObject, str, str2);
                if (d(jSONObject)) {
                    R7.f27125a.d(new a(c0442l8, context, string));
                    return;
                } else {
                    this.f29251a.put(string, c0442l8);
                    return;
                }
            }
            Logger.i(f29249b, "sendMessageToAd fail - collection already contain adViewId");
            throw new Exception("collection already contain adViewId");
        }
        Logger.i(f29249b, "loadWithUrl fail - adViewId is empty");
        throw new Exception("adViewId is empty");
    }

    @Override // com.ironsource.InterfaceC0292d1
    public H8 a(String str) {
        if (str.isEmpty() || !this.f29251a.containsKey(str)) {
            return null;
        }
        return this.f29251a.get(str);
    }

    public void a(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            if (this.f29251a.containsKey(string)) {
                H8 h8 = this.f29251a.get(string);
                if (h8 != null) {
                    h8.a(jSONObject, str, str2);
                    return;
                }
                return;
            }
            Logger.i(f29249b, "removeAdView fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        Logger.i(f29249b, "removeAdView fail - adViewId is empty");
        throw new Exception("adViewId is empty");
    }
}
