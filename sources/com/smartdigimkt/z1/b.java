package com.smartdigimkt.z1;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.smartdigimkt.n.h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class b {
    private static final String d = "HandlerH5MessageManager";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f40305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f40306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f40307c;

    /* JADX INFO: renamed from: com.smartdigimkt.z1.b$b, reason: collision with other inner class name */
    public static final class C0649b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static b f40308a = new b();

        private C0649b() {
        }
    }

    public static b a() {
        return C0649b.f40308a;
    }

    private b() {
        this.f40305a = "handlerNativeResult";
        this.f40306b = 0;
        this.f40307c = 1;
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
                        a(this.f40306b, "receivedMessage", obj);
                        if (!strOptString.equalsIgnoreCase("reporter") && strOptString.equalsIgnoreCase("MediaPlayer")) {
                            com.smartdigimkt.z1.a.a().a(obj, strOptString2, jSONArrayOptJSONArray, iOptInt);
                            return;
                        }
                        return;
                    }
                    a(this.f40307c, "module or method is null", obj);
                    return;
                }
            } catch (Exception e2) {
                e2.getMessage();
                a(this.f40307c, e2.getMessage(), obj);
                return;
            } catch (Throwable th) {
                th.getMessage();
                a(this.f40307c, th.getMessage(), obj);
                return;
            }
        }
        a(this.f40307c, "params is null", obj);
    }

    public void a(int i2, String str, Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i2);
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
            h.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (JSONException e2) {
            e2.getMessage();
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
