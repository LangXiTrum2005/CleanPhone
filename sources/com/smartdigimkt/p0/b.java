package com.smartdigimkt.p0;

import android.text.TextUtils;
import com.p004ironsource.d9;
import com.p004ironsource.dc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f37496c = "b";
    public static String d = "a";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f37497e = "d";
    public static String f = "e";
    public static String g = "coppa";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, String> f37498a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, com.smartdigimkt.k0.b> f37499b = new LinkedHashMap();

    public b() {
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || str2 == null) {
            return;
        }
        this.f37498a.put(str, str2);
    }

    public String b() {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : this.f37498a.entrySet()) {
                if (sb.length() > 0) {
                    sb.append('&');
                }
                sb.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                sb.append(d9.i.f24747b);
                sb.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return sb.toString();
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : this.f37498a.entrySet()) {
                jSONObject.put(URLEncoder.encode(entry.getKey(), "UTF-8"), URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
            for (Map.Entry<String, com.smartdigimkt.k0.b> entry2 : this.f37499b.entrySet()) {
                jSONObject.put(URLEncoder.encode(entry2.getKey(), "UTF-8"), URLEncoder.encode("FILE_NAME_" + entry2.getValue().d().getName(), "UTF-8"));
            }
        } catch (UnsupportedEncodingException unused) {
        } catch (JSONException e2) {
            e2.getMessage();
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(28);
        try {
            for (Map.Entry<String, String> entry : this.f37498a.entrySet()) {
                if (sb.length() > 0) {
                    sb.append('&');
                }
                sb.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                sb.append(dc.T);
                sb.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
            for (Map.Entry<String, com.smartdigimkt.k0.b> entry2 : this.f37499b.entrySet()) {
                if (sb.length() > 0) {
                    sb.append('&');
                }
                sb.append(URLEncoder.encode(entry2.getKey(), "UTF-8"));
                sb.append(dc.T);
                sb.append(URLEncoder.encode("FILE_NAME_" + entry2.getValue().d().getName(), "UTF-8"));
            }
        } catch (UnsupportedEncodingException e2) {
            e2.getMessage();
        }
        return sb.toString();
    }

    public void a(String str, File file) throws FileNotFoundException {
        a(str, file, null);
    }

    public b(String str, String str2) {
        this.f37498a.put(str, str2);
    }

    public void a(String str, File file, String str2) throws FileNotFoundException {
        a(str, file, str2, null);
    }

    public void a(String str, File file, String str2, String str3) throws FileNotFoundException {
        if (file != null && file.exists()) {
            if (TextUtils.isEmpty(str2)) {
                str2 = file.getName();
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f37499b.put(str, new com.smartdigimkt.k0.b(str2, file, str2, str3));
            return;
        }
        throw new FileNotFoundException();
    }

    public b(Map<String, String> map) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                a(entry.getKey(), entry.getValue());
            }
        }
    }

    public void a(Map<String, ?> map) throws FileNotFoundException {
        if (map != null) {
            for (Map.Entry<String, ?> entry : map.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof String) {
                    a(entry.getKey(), (String) entry.getValue());
                } else if (value instanceof File) {
                    a(entry.getKey(), (File) entry.getValue());
                }
            }
        }
    }

    public b(String... strArr) {
        int length = strArr.length;
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Supplied arguments must be even");
        }
        for (int i2 = 0; i2 < length; i2 += 2) {
            a(strArr[i2], strArr[i2 + 1]);
        }
    }

    public void a(String str) {
        this.f37498a.remove(str);
        this.f37499b.remove(str);
    }

    public Map<String, String> a() {
        return this.f37498a;
    }
}
