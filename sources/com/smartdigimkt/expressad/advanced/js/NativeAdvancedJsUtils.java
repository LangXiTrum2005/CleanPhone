package com.smartdigimkt.expressad.advanced.js;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.smartdigimkt.b.b;
import com.smartdigimkt.c3.a;
import com.smartdigimkt.c3.i;
import com.smartdigimkt.expressad.atsignalcommon.bridge.CommonJSBridgeImpUtils;
import com.smartdigimkt.n.h;
import com.smartdigimkt.p6.o;
import com.smartdigimkt.v0.u;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class NativeAdvancedJsUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f34661a = "NativeAdvancedJsUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f34662b = "onViewDisappeared";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f34663c = "onViewAppeared";
    public static final String d = "onSystemDestory";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f34664e = "setStyleList";
    public static final String f = "params";
    public static final String g = "showCloseButton";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f34665h = "hideCloseButton";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f34666i = "setVolume";
    public static final String j = "mute";
    public static final String k = "setVideoPlayMode";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f34667l = "autoPlay";
    public static final String m = "onNetstatChanged";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f34668n = "netstat";
    public static final String o = "sq";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f34669p = "thirdPartyCalled";
    public static final String q = "action";
    public static final String r = "params";

    public static void callbackSuccess(Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", CommonJSBridgeImpUtils.f34674b);
            h.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            e2.getMessage();
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

    public static void sendEventToH5(WebView webView, String str, String str2) {
        h.a().a(webView, str, str2);
    }

    public static void sendThirdToH5(final WebView webView, String str, String str2, Object obj) {
        try {
            final JSONObject jSONObject = new JSONObject();
            jSONObject.put(o, 1);
            jSONObject.put("action", str);
            if (!TextUtils.isEmpty(str2)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(str2, obj);
                jSONObject.put("params", jSONObject2);
            }
            if (TextUtils.isEmpty(str2) && obj != null) {
                jSONObject.put("params", obj);
            }
            com.smartdigimkt.l7.b.a().e(new Runnable() { // from class: com.smartdigimkt.expressad.advanced.js.NativeAdvancedJsUtils.1
                @Override // java.lang.Runnable
                public void run() {
                    h.a().a(webView, NativeAdvancedJsUtils.f34669p, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                }
            });
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }
}
