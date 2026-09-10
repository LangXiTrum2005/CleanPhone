package com.mbridge.msdk.video.bt.component;

import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f37147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f37148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f37149c;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static c f37150a = new c();
    }

    public static c a() {
        return b.f37150a;
    }

    private c() {
        this.f37147a = "handlerNativeResult";
        this.f37148b = 0;
        this.f37149c = 1;
    }

    public void a(Object obj, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (!TextUtils.isEmpty(jSONObject.toString())) {
                    String strOptString = jSONObject.optString("uniqueIdentifier");
                    String strOptString2 = jSONObject.optString("name");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("parameters");
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("result");
                        int iOptInt = 0;
                        if (jSONObjectOptJSONObject != null && !TextUtils.isEmpty(jSONObjectOptJSONObject.toString())) {
                            iOptInt = jSONObjectOptJSONObject.optInt("type", 0);
                        }
                        a(this.f37148b, "receivedMessage", obj);
                        if (strOptString.equalsIgnoreCase("reporter")) {
                            com.mbridge.msdk.mbsignalcommon.Report.a.a().a(obj, strOptString2, jSONArrayOptJSONArray, iOptInt);
                            return;
                        } else {
                            if (strOptString.equalsIgnoreCase("MediaPlayer")) {
                                com.mbridge.msdk.video.bt.component.b.a().a(obj, strOptString2, jSONArrayOptJSONArray, iOptInt);
                                return;
                            }
                            return;
                        }
                    }
                    a(this.f37149c, "module or method is null", obj);
                    return;
                }
            } catch (Exception e10) {
                q0.a("HandlerH5MessageManager", e10.getMessage());
                a(this.f37149c, e10.getMessage(), obj);
                return;
            } catch (Throwable th2) {
                q0.a("HandlerH5MessageManager", th2.getMessage());
                a(this.f37149c, th2.getMessage(), obj);
                return;
            }
        }
        a(this.f37149c, "params is null", obj);
    }

    public void a(int i10, String str, Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i10);
            jSONObject.put("message", str);
            f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (JSONException e10) {
            q0.a("HandlerH5MessageManager", e10.getMessage());
        } catch (Throwable th2) {
            q0.a("HandlerH5MessageManager", th2.getMessage());
        }
    }
}
