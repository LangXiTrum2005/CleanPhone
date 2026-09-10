package com.smartdigimkt.c8;

import android.text.TextUtils;
import com.p004ironsource.d9;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final String f34348a = "d";

    public byte[] a(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes("utf-8"));
            gZIPOutputStream.close();
        } catch (Throwable unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    public String b() {
        return com.smartdigimkt.m6.b.p().f();
    }

    public String c() {
        return com.smartdigimkt.m6.b.p().g();
    }

    public JSONObject d() {
        return com.smartdigimkt.w7.a.a(e());
    }

    @Deprecated
    public int e() {
        return 0;
    }

    public List<String> f() {
        return null;
    }

    public Map<String, String> g() {
        return androidx.media3.extractor.text.ttml.a.t("Content-Encoding", com.smartdigimkt.o0.b.d, "Content-Type", "application/json;charset=utf-8");
    }

    public com.smartdigimkt.x7.c h() {
        return null;
    }

    public JSONObject i() {
        return com.smartdigimkt.w7.a.a(e(), f());
    }

    public byte[] j() throws JSONException {
        String strK = k();
        if (TextUtils.isEmpty(strK)) {
            return new byte[0];
        }
        try {
            return strK.getBytes("utf-8");
        } catch (Throwable unused) {
            return strK.getBytes();
        }
    }

    public String k() throws JSONException {
        try {
            HashMap map = new HashMap();
            String strB = com.smartdigimkt.n8.b.b(d().toString());
            String strB2 = com.smartdigimkt.n8.b.b(i().toString());
            map.put("api_ver", a());
            map.put("p", strB);
            map.put("p2", strB2);
            ArrayList<String> arrayList = new ArrayList(map.size());
            arrayList.addAll(map.keySet());
            Collections.sort(arrayList);
            StringBuilder sb = new StringBuilder();
            for (String str : arrayList) {
                if (sb.length() > 0) {
                    sb.append(d9.i.f24749c);
                }
                sb.append(str);
                sb.append(d9.i.f24747b);
                sb.append(map.get(str));
            }
            map.put("sign", com.smartdigimkt.n8.e.a(c() + sb.toString()));
            Set<String> setKeySet = map.keySet();
            JSONObject jSONObject = new JSONObject();
            try {
                for (String str2 : setKeySet) {
                    jSONObject.put(str2, String.valueOf(map.get(str2)));
                }
                return jSONObject.toString();
            } catch (OutOfMemoryError unused) {
                System.gc();
                return "";
            }
        } catch (Throwable unused2) {
            return "";
        }
    }

    public abstract int l();

    public abstract String m();

    public String a() {
        return "1.0";
    }
}
