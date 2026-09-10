package com.mbridge.msdk.foundation.same.net.wrapper;

import android.text.TextUtils;
import com.ironsource.B5;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.tools.q0;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f33878c = "e";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f33879d = "h";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f33880e = "i";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f33881f = "coppa";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f33882g = "d";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f33883h = "e";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f33884i = "a";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f33885j = "f";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static String f33886k = "g";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, com.mbridge.msdk.foundation.same.net.model.a> f33887a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f33888b = new LinkedHashMap();

    public void a(String str, String str2) {
        if (str2 == null) {
            q0.b(f33878c, "add() value is null!");
        }
        if (TextUtils.isEmpty(str) || str2 == null) {
            return;
        }
        this.f33888b.put(str, str2);
    }

    public String b() {
        StringBuilder sb2 = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : this.f33888b.entrySet()) {
                if (sb2.length() > 0) {
                    sb2.append('&');
                }
                sb2.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                sb2.append(X3.j.f27830b);
                sb2.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return sb2.toString();
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : this.f33888b.entrySet()) {
                jSONObject.put(URLEncoder.encode(entry.getKey(), "UTF-8"), URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
            for (Map.Entry<String, com.mbridge.msdk.foundation.same.net.model.a> entry2 : this.f33887a.entrySet()) {
                jSONObject.put(URLEncoder.encode(entry2.getKey(), "UTF-8"), URLEncoder.encode("FILE_NAME_" + entry2.getValue().d().getName(), "UTF-8"));
            }
        } catch (UnsupportedEncodingException unused) {
        } catch (JSONException e10) {
            q0.b(f33878c, e10.getMessage());
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(28);
        try {
            for (Map.Entry<String, String> entry : this.f33888b.entrySet()) {
                if (sb2.length() > 0) {
                    sb2.append('&');
                }
                sb2.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                sb2.append(B5.U);
                sb2.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
            for (Map.Entry<String, com.mbridge.msdk.foundation.same.net.model.a> entry2 : this.f33887a.entrySet()) {
                if (sb2.length() > 0) {
                    sb2.append('&');
                }
                sb2.append(URLEncoder.encode(entry2.getKey(), "UTF-8"));
                sb2.append(B5.U);
                sb2.append(URLEncoder.encode("FILE_NAME_" + entry2.getValue().d().getName(), "UTF-8"));
            }
        } catch (UnsupportedEncodingException e10) {
            q0.b(f33878c, e10.getMessage());
        }
        return sb2.toString();
    }

    public Map<String, String> a() {
        return this.f33888b;
    }

    public void a(String str) {
        this.f33888b.remove(str);
        this.f33887a.remove(str);
    }
}
