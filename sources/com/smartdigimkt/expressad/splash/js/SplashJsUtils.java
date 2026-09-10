package com.smartdigimkt.expressad.splash.js;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.smartdigimkt.b.b;
import com.smartdigimkt.c0.f;
import com.smartdigimkt.c3.a;
import com.smartdigimkt.c3.i;
import com.smartdigimkt.n.h;
import com.smartdigimkt.p6.o;
import com.smartdigimkt.v0.u;
import com.smartdigimkt.x.d;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class SplashJsUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f34725a = "SplashJsUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f34726b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f34727c = 1;
    public static final String d = "onSystemPause";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f34728e = "onSystemResume";
    public static final String f = "onSystemDestory";

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, d dVar) {
        if (f.f34032p == null || TextUtils.isEmpty(dVar.j())) {
            return;
        }
        f.a(str, dVar, "splash");
    }

    public static void callbackExcep(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f34727c);
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
            jSONObject.put("data", new JSONObject());
            h.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public static void callbackSuccess(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f34726b);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str);
            jSONObject.put("data", jSONObject2);
            h.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            callbackExcep(obj, e2.getMessage());
            e2.getMessage();
        }
    }

    public static String codeToJsonString(int i2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i2);
            String string = jSONObject.toString();
            return !TextUtils.isEmpty(string) ? Base64.encodeToString(string.getBytes(), 2) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void fireOnJSBridgeConnected(WebView webView) {
        h.a().a(webView);
    }

    public static void getFileInfo(Object obj, JSONObject jSONObject) {
        int i2;
        int i3;
        boolean z2;
        String str;
        JSONObject jSONObject2 = new JSONObject();
        int i4 = 1;
        if (jSONObject == null) {
            try {
                jSONObject2.put("code", 1);
                jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "params is null");
                h.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            } catch (JSONException e2) {
                e2.getMessage();
                return;
            }
        }
        try {
            jSONObject2.put("code", 0);
            jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "");
            JSONArray jSONArray = jSONObject.getJSONArray("resource");
            if (jSONArray == null || jSONArray.length() <= 0) {
                try {
                    jSONObject2.put("code", 1);
                    jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "resource is null");
                    h.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                    return;
                } catch (JSONException e3) {
                    e3.getMessage();
                    return;
                }
            }
            JSONArray jSONArray2 = new JSONArray();
            int length = jSONArray.length();
            int i5 = 0;
            while (i5 < length) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i5);
                String strOptString = jSONObject3.optString("ref", "");
                int i6 = jSONObject3.getInt("type");
                JSONObject jSONObject4 = new JSONObject();
                if (i6 != i4 || TextUtils.isEmpty(strOptString)) {
                    i2 = length;
                    i3 = i5;
                    z2 = false;
                    if (i6 == 2 && !TextUtils.isEmpty(strOptString)) {
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("type", 2);
                        jSONObject5.put("path", i.a().c(strOptString) == null ? "" : i.a().c(strOptString));
                        jSONObject4.put(strOptString, jSONObject5);
                        jSONArray2.put(jSONObject4);
                    } else if (i6 == 3 && !TextUtils.isEmpty(strOptString)) {
                        try {
                            File file = new File(strOptString);
                            if (file.exists() && file.isFile() && file.canRead()) {
                                str = "file:////" + strOptString;
                            } else {
                                str = "";
                            }
                        } catch (Throwable th) {
                            if (b.f33800a) {
                                th.printStackTrace();
                            }
                        }
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("type", 3);
                        jSONObject6.put("path", str);
                        jSONObject4.put(strOptString, jSONObject6);
                        jSONArray2.put(jSONObject4);
                    } else if (i6 == 4 && !TextUtils.isEmpty(strOptString)) {
                        JSONObject jSONObject7 = new JSONObject();
                        jSONObject7.put("type", 4);
                        jSONObject7.put("path", u.a(strOptString) == null ? "" : u.a(strOptString));
                        jSONObject4.put(strOptString, jSONObject7);
                        jSONArray2.put(jSONObject4);
                    }
                } else {
                    JSONObject jSONObject8 = new JSONObject();
                    o oVarB = a.a().b(strOptString);
                    if (oVarB != null) {
                        jSONObject8.put("type", 1);
                        i2 = length;
                        i3 = i5;
                        jSONObject8.put("videoDataLength", oVarB.d());
                        String strE = oVarB.e();
                        if (TextUtils.isEmpty(strE)) {
                            jSONObject8.put("path", "");
                            jSONObject8.put("path4Web", "");
                        } else {
                            jSONObject8.put("path", strE);
                            jSONObject8.put("path4Web", strE);
                        }
                        if (oVarB.c() == 100) {
                            jSONObject8.put("downloaded", 1);
                            z2 = false;
                        } else {
                            z2 = false;
                            jSONObject8.put("downloaded", 0);
                        }
                        jSONObject4.put(strOptString, jSONObject8);
                        jSONArray2.put(jSONObject4);
                    } else {
                        i2 = length;
                        i3 = i5;
                        z2 = false;
                    }
                }
                i5 = i3 + 1;
                length = i2;
                i4 = 1;
            }
            jSONObject2.put("resource", jSONArray2);
            h.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            return;
        } catch (Throwable th2) {
            jSONObject2.put("code", 1);
            jSONObject2.put(PglCryptUtils.KEY_MESSAGE, th2.getLocalizedMessage());
            h.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        }
        try {
            jSONObject2.put("code", 1);
            jSONObject2.put(PglCryptUtils.KEY_MESSAGE, th2.getLocalizedMessage());
            h.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (JSONException e4) {
            e4.getMessage();
        }
    }

    public static void increaseOfferFrequence(Object obj, JSONObject jSONObject) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                callbackExcep(obj, "data is empty");
                return;
            }
            d dVarB = d.b(jSONObjectOptJSONObject);
            if (dVarB == null) {
                callbackExcep(obj, "data camapign is empty");
            } else {
                updateFrequence(dVarB);
                callbackSuccess(obj, "");
            }
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
        }
    }

    public static void sendEventToH5(WebView webView, String str, String str2) {
        h.a().a(webView, str, str2);
    }

    public static void updateFrequence(final d dVar) {
        new Thread(new Runnable() { // from class: com.smartdigimkt.expressad.splash.js.SplashJsUtils.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SplashJsUtils.b(dVar.i0(), dVar);
                } catch (Throwable th) {
                    String unused = SplashJsUtils.f34725a;
                    th.getMessage();
                }
            }
        }).start();
    }
}
