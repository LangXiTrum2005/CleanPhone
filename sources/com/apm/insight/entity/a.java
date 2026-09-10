package com.apm.insight.entity;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import com.apm.insight.e;
import com.apm.insight.l.m;
import com.p004ironsource.d9;
import com.smartdigimkt.x.g;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f10089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Header f10090b;

    public a() {
        JSONObject jSONObject = new JSONObject();
        this.f10089a = jSONObject;
        try {
            jSONObject.put("apm_id", "20000001");
        } catch (JSONException unused) {
        }
    }

    public static a a(long j, Context context, Throwable th) {
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        a aVar = new a();
        aVar.a("isJava", (Object) 1);
        aVar.a("data", (Object) m.a(th));
        aVar.a("crash_time", Long.valueOf(j));
        aVar.a("process_name", (Object) com.apm.insight.l.a.b());
        if (!com.apm.insight.l.a.b(context)) {
            aVar.a("remote_process", (Object) 1);
        }
        return aVar;
    }

    public static boolean c(String str) {
        return com.apm.insight.nativecrash.b.b(str) > 350;
    }

    public final void b() {
        a("has_logcat", String.valueOf(a()));
    }

    public final Header d() {
        if (this.f10090b == null) {
            Header header = new Header(e.g());
            this.f10090b = header;
            a(header);
        }
        return this.f10090b;
    }

    public static boolean b(String str) {
        return com.apm.insight.nativecrash.b.a(str) > 960;
    }

    public final JSONObject c() {
        return this.f10089a;
    }

    public final a b(Map<Integer, String> map) {
        if (map != null && map.size() > 0) {
            JSONObject jSONObject = new JSONObject();
            for (Integer num : map.keySet()) {
                try {
                    jSONObject.put(String.valueOf(num), map.get(num));
                } catch (JSONException e2) {
                    com.apm.insight.a.b((Throwable) e2);
                }
            }
            try {
                this.f10089a.put("sdk_info", jSONObject);
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        }
        return this;
    }

    public final void c(JSONObject jSONObject) {
        b(this.f10089a, jSONObject);
    }

    public a(JSONObject jSONObject) {
        this.f10089a = jSONObject;
    }

    public final a c(Map<? extends String, ? extends String> map) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        if (map != null) {
            Object objOpt = this.f10089a.opt("data");
            if (objOpt instanceof JSONArray) {
                jSONObjectOptJSONObject = ((JSONArray) objOpt).optJSONObject(0);
            } else {
                jSONObjectOptJSONObject = this.f10089a;
            }
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject2 = new JSONObject();
            } else {
                jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("filters");
                if (jSONObjectOptJSONObject2 == null) {
                    jSONObjectOptJSONObject2 = new JSONObject();
                    a("filters", jSONObjectOptJSONObject2);
                }
            }
            for (Map.Entry<? extends String, ? extends String> entry : map.entrySet()) {
                try {
                    jSONObjectOptJSONObject2.put(entry.getKey(), entry.getValue());
                } catch (JSONException unused) {
                }
            }
            a("filters", jSONObjectOptJSONObject2);
        }
        return this;
    }

    public static boolean a(String str) {
        return ((long) com.apm.insight.nativecrash.b.c(str)) > com.apm.insight.nativecrash.a.g();
    }

    public final a a(Header header) {
        a(g.f39716B, header.f());
        this.f10090b = header;
        return this;
    }

    public final a b(JSONObject jSONObject) {
        a(this.f10089a, jSONObject);
        return this;
    }

    public static void b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null || jSONObject2.length() <= 0) {
            return;
        }
        try {
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObject.opt(next);
                if (objOpt == null) {
                    jSONObject.put(next, jSONObject2.opt(next));
                } else if (objOpt instanceof JSONObject) {
                    b(jSONObject.getJSONObject(next), jSONObject2.getJSONObject(next));
                } else if (objOpt instanceof JSONArray) {
                    JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray(next);
                    if (jSONArrayOptJSONArray != null) {
                        JSONArray jSONArray = (JSONArray) objOpt;
                        if (jSONArray.length() == 1 && (jSONArray.opt(0) instanceof JSONObject) && (jSONArrayOptJSONArray.opt(0) instanceof JSONObject)) {
                            b(jSONArray.getJSONObject(0), jSONArrayOptJSONArray.getJSONObject(0));
                        } else {
                            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                                jSONArray.put(jSONArrayOptJSONArray.get(i2));
                            }
                        }
                    }
                } else {
                    jSONObject.put(next, jSONObject2.opt(next));
                }
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public final a a(JSONObject jSONObject) {
        a(g.f39716B, jSONObject);
        return this;
    }

    public static void a(JSONObject jSONObject, Map<? extends String, ? extends String> map) {
        if (map != null) {
            try {
                for (Map.Entry<? extends String, ? extends String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(JSONObject jSONObject, Throwable th) {
        try {
            if (jSONObject.opt("npth_err_info") == null) {
                jSONObject.put("npth_err_info", m.a(th));
                return;
            }
            for (int i2 = 0; i2 < 5; i2++) {
                if (jSONObject.opt("npth_err_info" + i2) == null) {
                    jSONObject.put("npth_err_info" + i2, m.a(th));
                    return;
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final a a(long j) {
        try {
            a("app_start_time", Long.valueOf(j));
            a("app_start_time_readable", (Object) new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss", Locale.getDefault()).format(new Date(j)));
            return this;
        } catch (Exception e2) {
            e2.printStackTrace();
            return this;
        }
    }

    public final a a(com.apm.insight.runtime.a.b bVar) {
        a("activity_trace", bVar.g());
        a("activity_track", bVar.i());
        return this;
    }

    public final a a(Map<String, Integer> map) {
        JSONArray jSONArray = new JSONArray();
        try {
            if (map == null) {
                this.f10089a.put("plugin_info", jSONArray);
                return this;
            }
            for (String str : map.keySet()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("package_name", str);
                jSONObject.put("version_code", map.get(str));
                jSONArray.put(jSONObject);
            }
            this.f10089a.put("plugin_info", jSONArray);
            return this;
        } catch (Exception unused) {
        }
    }

    public final a b(String str, String str2) {
        Object objOpt = this.f10089a.opt("data");
        if (objOpt instanceof JSONArray) {
            a(((JSONArray) objOpt).optJSONObject(0), "custom", str, str2);
            return this;
        }
        a(this.f10089a, "custom", str, str2);
        return this;
    }

    public final a a(int i2, String str) {
        try {
            this.f10089a.put("miniapp_id", i2);
            this.f10089a.put("miniapp_version", str);
            return this;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return this;
        }
    }

    public final a a(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        if (list != null && !list.isEmpty()) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            a("patch_info", (Object) jSONArray);
            return this;
        }
        a("patch_info", (Object) jSONArray);
        return this;
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        String str2;
        try {
            jSONObject.put(d9.a.k, jSONObject2);
        } catch (Throwable unused) {
        }
        long jOptLong = jSONObject2.optLong("inner_free");
        long jOptLong2 = jSONObject2.optLong("sdcard_free");
        long jOptLong3 = jSONObject2.optLong("inner_free_real");
        String str3 = "64M - ";
        if (jOptLong <= 1024) {
            str = "0 - 1K";
        } else if (jOptLong <= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
            str = "1K - 64K";
        } else if (jOptLong <= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
            str = "64K - 512K";
        } else if (jOptLong <= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            str = "512K - 1M";
        } else {
            str = jOptLong <= 67108864 ? "1M - 64M" : "64M - ";
        }
        if (jOptLong3 <= 1024) {
            str2 = "0 - 1K";
        } else if (jOptLong3 <= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
            str2 = "1K - 64K";
        } else if (jOptLong3 <= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
            str2 = "64K - 512K";
        } else if (jOptLong3 <= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            str2 = "512K - 1M";
        } else {
            str2 = jOptLong3 <= 67108864 ? "1M - 64M" : "64M - ";
        }
        if (jOptLong2 <= 1024) {
            str3 = "0 - 1K";
        } else if (jOptLong2 <= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
            str3 = "1K - 64K";
        } else if (jOptLong2 <= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
            str3 = "64K - 512K";
        } else if (jOptLong2 <= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            str3 = "512K - 1M";
        } else if (jOptLong2 <= 67108864) {
            str3 = "1M - 64M";
        }
        a(jSONObject, "filters", "inner_free", str);
        a(jSONObject, "filters", "inner_free_real", str2);
        a(jSONObject, "filters", "sdcard_free", str3);
    }

    public static void a(JSONObject jSONObject, String str, String str2, String str3) {
        if (jSONObject == null) {
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject == null) {
            try {
                jSONObjectOptJSONObject = new JSONObject();
                jSONObject.put(str, jSONObjectOptJSONObject);
            } catch (Throwable unused) {
                return;
            }
        }
        jSONObjectOptJSONObject.put(str2, str3);
    }

    public final void a(String str, Object obj) {
        try {
            this.f10089a.put(str, obj);
        } catch (Exception e2) {
            com.apm.insight.a.b((Throwable) e2);
        }
    }

    public final boolean a() {
        Object objOpt = this.f10089a.opt("data");
        if (objOpt instanceof JSONArray) {
            return !com.apm.insight.a.a(((JSONArray) objOpt).optJSONObject(0), "logcat");
        }
        return !com.apm.insight.a.a(this.f10089a, "logcat");
    }

    private a a(String str, JSONArray jSONArray) {
        JSONObject jSONObjectOptJSONObject = this.f10089a.optJSONObject("custom_long");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
            a("custom_long", jSONObjectOptJSONObject);
        }
        try {
            jSONObjectOptJSONObject.put(str, jSONArray);
        } catch (JSONException unused) {
        }
        return this;
    }

    public final a a(String str, String str2) {
        Object objOpt = this.f10089a.opt("data");
        if (objOpt instanceof JSONArray) {
            a(((JSONArray) objOpt).optJSONObject(0), "filters", str, str2);
            return this;
        }
        a(this.f10089a, "filters", str, str2);
        return this;
    }
}
