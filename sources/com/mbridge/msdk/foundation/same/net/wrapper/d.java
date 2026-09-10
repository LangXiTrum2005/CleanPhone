package com.mbridge.msdk.foundation.same.net.wrapper;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d extends com.mbridge.msdk.foundation.same.net.c<JSONObject> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f33877a = "d";

    public d(String str, String str2) {
        setKey(str);
        setRKE(str2);
    }

    private void a(com.mbridge.msdk.foundation.same.net.e<JSONObject> eVar) {
        if (eVar.f33810b.f33835d == 204) {
            a(new JSONObject());
        } else {
            b(eVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0074 A[DONT_INVERT, PHI: r4
  0x0074: PHI (r4v7 org.json.JSONObject) = 
  (r4v3 org.json.JSONObject)
  (r4v3 org.json.JSONObject)
  (r4v3 org.json.JSONObject)
  (r4v3 org.json.JSONObject)
  (r4v4 org.json.JSONObject)
 binds: [B:21:0x0046, B:23:0x0052, B:25:0x005e, B:29:0x0068, B:27:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x0076 A[Catch: Exception -> 0x0072, TryCatch #1 {Exception -> 0x0072, blocks: (B:22:0x0048, B:24:0x0054, B:29:0x0068, B:33:0x0076, B:35:0x0082, B:26:0x0060), top: B:42:0x0048, inners: #0 }] */
    private void b(com.mbridge.msdk.foundation.same.net.e<JSONObject> eVar) {
        JSONObject jSONObject = eVar.f33811c;
        if (jSONObject == null) {
            a("response result is null");
            return;
        }
        int iOptInt = jSONObject.optInt("status", -9999);
        if (iOptInt == -9999) {
            a(eVar.f33811c);
            return;
        }
        if (iOptInt != 1 && iOptInt != 200) {
            String strOptString = eVar.f33811c.optString(NotificationCompat.CATEGORY_MESSAGE);
            if (TextUtils.isEmpty(strOptString)) {
                strOptString = "error message is null";
            }
            a(strOptString);
            return;
        }
        JSONObject jSONObjectOptJSONObject = eVar.f33811c.optJSONObject("data");
        if (jSONObjectOptJSONObject != null) {
            try {
                String strOptString2 = jSONObjectOptJSONObject.optString("r");
                if (!TextUtils.isEmpty(strOptString2)) {
                    String strA = v0.a(strOptString2, "ebmclXzZOhtU2sRlZxGL8A");
                    if (!TextUtils.isEmpty(strA)) {
                        try {
                            jSONObjectOptJSONObject = new JSONObject(strA);
                        } catch (Exception e10) {
                            q0.b(f33877a, e10.getMessage(), e10);
                        }
                        if (jSONObjectOptJSONObject != null && !TextUtils.isEmpty(jSONObjectOptJSONObject.optString("e_str"))) {
                            jSONObjectOptJSONObject.put("rk", getKey());
                        }
                    } else if (jSONObjectOptJSONObject != null) {
                        jSONObjectOptJSONObject.put("rk", getKey());
                    }
                } else if (jSONObjectOptJSONObject != null) {
                    jSONObjectOptJSONObject.put("rk", getKey());
                }
            } catch (Exception e11) {
                q0.b(f33877a, "put rk error", e11);
            }
        } else if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.put("rk", getKey());
        }
        a(jSONObjectOptJSONObject);
    }

    public abstract void a(String str);

    public abstract void a(JSONObject jSONObject);

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        q0.b(f33877a, "errorCode = " + aVar.f33812a);
        a(com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(com.mbridge.msdk.foundation.same.net.e<JSONObject> eVar) {
        if (eVar == null) {
            a("response is null");
            return;
        }
        super.onSuccess(eVar);
        if (eVar.f33810b == null) {
            b(eVar);
        } else {
            a(eVar);
        }
    }

    public d() {
    }
}
