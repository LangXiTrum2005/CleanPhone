package com.mbridge.msdk.advanced.signal;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.m;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.mbsignalcommon.communication.d;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f31567a = "NativeAdvancedJsUtils";

    public static void a(Object obj, JSONObject jSONObject) {
        JSONArray jSONArray;
        boolean z10;
        String str;
        String str2 = "";
        JSONObject jSONObject2 = new JSONObject();
        int i10 = 1;
        if (jSONObject == null) {
            try {
                jSONObject2.put("code", 1);
                jSONObject2.put("message", "params is null");
                f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            } catch (JSONException e10) {
                q0.a(f31567a, e10.getMessage());
                return;
            }
        }
        try {
            jSONObject2.put("code", 0);
            jSONObject2.put("message", "");
            JSONArray jSONArray2 = jSONObject.getJSONArray("resource");
            if (jSONArray2 == null || jSONArray2.length() <= 0) {
                try {
                    jSONObject2.put("code", 1);
                    jSONObject2.put("message", "resource is null");
                    f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                    return;
                } catch (JSONException e11) {
                    q0.a(f31567a, e11.getMessage());
                    return;
                }
            }
            JSONArray jSONArray3 = new JSONArray();
            int length = jSONArray2.length();
            int i11 = 0;
            while (i11 < length) {
                JSONObject jSONObject3 = jSONArray2.getJSONObject(i11);
                String strOptString = jSONObject3.optString("ref", str2);
                int i12 = jSONObject3.getInt("type");
                JSONObject jSONObject4 = new JSONObject();
                if (i12 != i10 || TextUtils.isEmpty(strOptString)) {
                    str2 = str2;
                    jSONArray = jSONArray2;
                    length = length;
                    z10 = false;
                    if (i12 == 2 && !TextUtils.isEmpty(strOptString)) {
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("type", 2);
                        jSONObject5.put("path", H5DownLoadManager.getInstance().getH5ResAddress(strOptString) == null ? str2 : H5DownLoadManager.getInstance().getH5ResAddress(strOptString));
                        jSONObject4.put(strOptString, jSONObject5);
                        jSONArray3.put(jSONObject4);
                    } else if (i12 == 3 && !TextUtils.isEmpty(strOptString)) {
                        try {
                            File file = new File(strOptString);
                            if (file.exists() && file.isFile() && file.canRead()) {
                                q0.a(f31567a, "getFileInfo Mraid file " + strOptString);
                                str = "file:////" + strOptString;
                            } else {
                                str = str2;
                            }
                        } catch (Throwable th2) {
                            q0.b(f31567a, th2.getMessage());
                        }
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("type", 3);
                        jSONObject6.put("path", str);
                        jSONObject4.put(strOptString, jSONObject6);
                        jSONArray3.put(jSONObject4);
                    } else if (i12 == 4 && !TextUtils.isEmpty(strOptString)) {
                        JSONObject jSONObject7 = new JSONObject();
                        jSONObject7.put("type", 4);
                        jSONObject7.put("path", u0.a(strOptString) == null ? str2 : u0.a(strOptString));
                        jSONObject4.put(strOptString, jSONObject7);
                        jSONArray3.put(jSONObject4);
                    }
                } else {
                    JSONObject jSONObject8 = new JSONObject();
                    m mVarB = com.mbridge.msdk.foundation.db.m.a(g.a(c.n().d())).b(strOptString);
                    if (mVarB != null) {
                        jSONArray = jSONArray2;
                        q0.a(f31567a, "VideoBean not null");
                        jSONObject8.put("type", 1);
                        jSONObject8.put("videoDataLength", mVarB.d());
                        String strE = mVarB.e();
                        if (TextUtils.isEmpty(strE)) {
                            q0.a(f31567a, "VideoPath null");
                            jSONObject8.put("path", str2);
                            jSONObject8.put("path4Web", str2);
                        } else {
                            q0.a(f31567a, "VideoPath not null");
                            jSONObject8.put("path", strE);
                            jSONObject8.put("path4Web", strE);
                        }
                        if (mVarB.b() == 5) {
                            jSONObject8.put("downloaded", 1);
                            z10 = false;
                        } else {
                            z10 = false;
                            jSONObject8.put("downloaded", 0);
                        }
                        jSONObject4.put(strOptString, jSONObject8);
                        jSONArray3.put(jSONObject4);
                    } else {
                        str2 = str2;
                        jSONArray = jSONArray2;
                        length = length;
                        z10 = false;
                        q0.a(f31567a, "VideoBean null");
                    }
                }
                i11++;
                jSONArray2 = jSONArray;
                length = length;
                str2 = str2;
                i10 = 1;
            }
            jSONObject2.put("resource", jSONArray3);
            f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            return;
        } catch (Throwable th3) {
            jSONObject2.put("code", 1);
            jSONObject2.put("message", th3.getLocalizedMessage());
            f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        }
        try {
            jSONObject2.put("code", 1);
            jSONObject2.put("message", th3.getLocalizedMessage());
            f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (JSONException e12) {
            q0.a(f31567a, e12.getMessage());
        }
    }

    public static void a(WebView webView, String str, String str2) {
        f.a().a(webView, str, str2);
    }

    public static void a(WebView webView, String str, String str2, Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sq", 1);
            jSONObject.put("action", str);
            if (!TextUtils.isEmpty(str2)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(str2, obj);
                jSONObject.put("params", jSONObject2);
            }
            if (TextUtils.isEmpty(str2) && obj != null) {
                jSONObject.put("params", obj);
            }
            f.a().a(webView, "thirdPartyCalled", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (JSONException e10) {
            q0.b(f31567a, e10.getMessage());
        }
    }

    public static void a(WebView webView) {
        q0.b(f31567a, "fireOnJSBridgeConnected");
        f.a().a(webView);
    }

    public static void a(Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", d.f34868b);
            f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            q0.a(f31567a, e10.getMessage());
        }
    }
}
