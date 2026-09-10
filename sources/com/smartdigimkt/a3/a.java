package com.smartdigimkt.a3;

import android.text.TextUtils;
import com.smartdigimkt.b.b;
import com.smartdigimkt.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.smartdigimkt.x.d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f33597a = "TemplateWebviewCache";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0428a> f33598b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0428a> f33599c = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, C0428a> d = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0428a> f33600e = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, C0428a> f = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, C0428a> g = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0428a> f33601h = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0428a> f33602i = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, C0428a> j = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, C0428a> k = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.smartdigimkt.a3.a$a, reason: collision with other inner class name */
    public static class C0428a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WindVaneWebView f33603a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f33604b;

        public void a(WindVaneWebView windVaneWebView) {
            this.f33603a = windVaneWebView;
        }

        public WindVaneWebView b() {
            return this.f33603a;
        }

        public boolean c() {
            return this.f33604b;
        }

        public void a(String str) {
            WindVaneWebView windVaneWebView = this.f33603a;
            if (windVaneWebView != null) {
                windVaneWebView.setTag(str);
            }
        }

        public String a() {
            WindVaneWebView windVaneWebView = this.f33603a;
            if (windVaneWebView != null) {
                return (String) windVaneWebView.getTag();
            }
            return "";
        }

        public void a(boolean z2) {
            this.f33604b = z2;
        }
    }

    public static void a(String str, C0428a c0428a, boolean z2, boolean z3) {
        if (z2) {
            if (z3) {
                f33602i.put(str, c0428a);
                return;
            } else {
                f33601h.put(str, c0428a);
                return;
            }
        }
        if (z3) {
            k.put(str, c0428a);
        } else {
            j.put(str, c0428a);
        }
    }

    public static C0428a b(String str) {
        if (f33601h.containsKey(str)) {
            return f33601h.get(str);
        }
        if (f33602i.containsKey(str)) {
            return f33602i.get(str);
        }
        if (j.containsKey(str)) {
            return j.get(str);
        }
        if (k.containsKey(str)) {
            return k.get(str);
        }
        return null;
    }

    public static void c(String str) {
        for (Map.Entry<String, C0428a> entry : f33601h.entrySet()) {
            if (entry.getKey().contains(str)) {
                f33601h.remove(entry.getKey());
            }
        }
    }

    public static void d(String str) {
        for (Map.Entry<String, C0428a> entry : f33602i.entrySet()) {
            if (entry.getKey().contains(str)) {
                f33602i.remove(entry.getKey());
            }
        }
    }

    public static void e(String str) {
        for (Map.Entry<String, C0428a> entry : j.entrySet()) {
            if (entry.getKey().startsWith(str)) {
                j.remove(entry.getKey());
            }
        }
    }

    public static void f(String str) {
        for (Map.Entry<String, C0428a> entry : k.entrySet()) {
            if (entry.getKey().startsWith(str)) {
                k.remove(entry.getKey());
            }
        }
    }

    public static void g(String str) {
        if (f33601h.containsKey(str)) {
            f33601h.remove(str);
        }
        if (j.containsKey(str)) {
            j.remove(str);
        }
        if (f33602i.containsKey(str)) {
            f33602i.remove(str);
        }
        if (k.containsKey(str)) {
            k.remove(str);
        }
    }

    public static void c() {
        f33601h.clear();
    }

    public static void a() {
        f33601h.clear();
        f33602i.clear();
    }

    public static void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : f33601h.keySet()) {
                if (!TextUtils.isEmpty(str2) && str2.startsWith(str)) {
                    f33601h.remove(str2);
                }
            }
        } else {
            f33601h.clear();
        }
        f33602i.clear();
    }

    public static void b() {
        j.clear();
        k.clear();
    }

    public static void b(int i2, d dVar) {
        if (dVar == null) {
            return;
        }
        try {
            String strO1 = dVar.O1();
            if (i2 == 94) {
                if (dVar.D2()) {
                    ConcurrentHashMap<String, C0428a> concurrentHashMap = f33599c;
                    if (concurrentHashMap != null) {
                        concurrentHashMap.remove(strO1);
                        return;
                    }
                    return;
                }
                ConcurrentHashMap<String, C0428a> concurrentHashMap2 = f;
                if (concurrentHashMap2 != null) {
                    concurrentHashMap2.remove(strO1);
                    return;
                }
                return;
            }
            if (i2 != 287) {
                ConcurrentHashMap<String, C0428a> concurrentHashMap3 = f33598b;
                if (concurrentHashMap3 != null) {
                    concurrentHashMap3.remove(strO1);
                    return;
                }
                return;
            }
            if (dVar.D2()) {
                ConcurrentHashMap<String, C0428a> concurrentHashMap4 = d;
                if (concurrentHashMap4 != null) {
                    concurrentHashMap4.remove(strO1);
                    return;
                }
                return;
            }
            ConcurrentHashMap<String, C0428a> concurrentHashMap5 = g;
            if (concurrentHashMap5 != null) {
                concurrentHashMap5.remove(strO1);
            }
        } catch (Exception e2) {
            if (b.f33800a) {
                e2.printStackTrace();
            }
        }
    }

    public static void a(String str, boolean z2, boolean z3) {
        if (z2) {
            if (z3) {
                for (Map.Entry<String, C0428a> entry : f33602i.entrySet()) {
                    if (entry.getKey().startsWith(str)) {
                        f33602i.remove(entry.getKey());
                    }
                }
                return;
            }
            for (Map.Entry<String, C0428a> entry2 : f33601h.entrySet()) {
                if (entry2.getKey().startsWith(str)) {
                    f33601h.remove(entry2.getKey());
                }
            }
            return;
        }
        if (z3) {
            for (Map.Entry<String, C0428a> entry3 : k.entrySet()) {
                if (entry3.getKey().startsWith(str)) {
                    k.remove(entry3.getKey());
                }
            }
            return;
        }
        for (Map.Entry<String, C0428a> entry4 : j.entrySet()) {
            if (entry4.getKey().startsWith(str)) {
                j.remove(entry4.getKey());
            }
        }
    }

    public static C0428a a(int i2, d dVar) {
        if (dVar == null) {
            return null;
        }
        try {
            String strO1 = dVar.O1();
            if (i2 != 94) {
                if (i2 != 287) {
                    ConcurrentHashMap<String, C0428a> concurrentHashMap = f33598b;
                    if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                        return f33598b.get(strO1);
                    }
                } else if (dVar.D2()) {
                    ConcurrentHashMap<String, C0428a> concurrentHashMap2 = d;
                    if (concurrentHashMap2 != null && concurrentHashMap2.size() > 0) {
                        return d.get(strO1);
                    }
                } else {
                    ConcurrentHashMap<String, C0428a> concurrentHashMap3 = g;
                    if (concurrentHashMap3 != null && concurrentHashMap3.size() > 0) {
                        return g.get(strO1);
                    }
                }
            } else if (dVar.D2()) {
                ConcurrentHashMap<String, C0428a> concurrentHashMap4 = f33599c;
                if (concurrentHashMap4 != null && concurrentHashMap4.size() > 0) {
                    return f33599c.get(strO1);
                }
            } else {
                ConcurrentHashMap<String, C0428a> concurrentHashMap5 = f;
                if (concurrentHashMap5 != null && concurrentHashMap5.size() > 0) {
                    return f.get(strO1);
                }
            }
        } catch (Exception e2) {
            if (b.f33800a) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public static void b(int i2) {
        try {
            if (i2 == 94) {
                ConcurrentHashMap<String, C0428a> concurrentHashMap = f;
                if (concurrentHashMap != null) {
                    concurrentHashMap.clear();
                    return;
                }
                return;
            }
            if (i2 != 287) {
                ConcurrentHashMap<String, C0428a> concurrentHashMap2 = f33598b;
                if (concurrentHashMap2 != null) {
                    concurrentHashMap2.clear();
                    return;
                }
                return;
            }
            ConcurrentHashMap<String, C0428a> concurrentHashMap3 = g;
            if (concurrentHashMap3 != null) {
                concurrentHashMap3.clear();
            }
        } catch (Exception e2) {
            if (b.f33800a) {
                e2.printStackTrace();
            }
        }
    }

    public static void b(int i2, String str, C0428a c0428a) {
        try {
            if (i2 == 94) {
                if (f == null) {
                    f = new ConcurrentHashMap<>();
                }
                f.put(str, c0428a);
            } else if (i2 != 287) {
                if (f33598b == null) {
                    f33598b = new ConcurrentHashMap<>();
                }
                f33598b.put(str, c0428a);
            } else {
                if (g == null) {
                    g = new ConcurrentHashMap<>();
                }
                g.put(str, c0428a);
            }
        } catch (Exception e2) {
            if (b.f33800a) {
                e2.printStackTrace();
            }
        }
    }

    public static ConcurrentHashMap<String, C0428a> a(int i2, boolean z2) {
        if (i2 == 94) {
            return z2 ? f33599c : f;
        }
        if (i2 != 287) {
            return f33598b;
        }
        return z2 ? d : g;
    }

    public static void a(int i2) {
        ConcurrentHashMap<String, C0428a> concurrentHashMap;
        try {
            if (i2 != 94) {
                if (i2 == 287 && (concurrentHashMap = d) != null) {
                    concurrentHashMap.clear();
                    return;
                }
                return;
            }
            ConcurrentHashMap<String, C0428a> concurrentHashMap2 = f33599c;
            if (concurrentHashMap2 != null) {
                concurrentHashMap2.clear();
            }
        } catch (Exception e2) {
            if (b.f33800a) {
                e2.printStackTrace();
            }
        }
    }

    public static void a(int i2, String str, C0428a c0428a) {
        try {
            if (i2 == 94) {
                if (f33599c == null) {
                    f33599c = new ConcurrentHashMap<>();
                }
                f33599c.put(str, c0428a);
            } else {
                if (i2 != 287) {
                    return;
                }
                if (d == null) {
                    d = new ConcurrentHashMap<>();
                }
                d.put(str, c0428a);
            }
        } catch (Exception e2) {
            if (b.f33800a) {
                e2.printStackTrace();
            }
        }
    }
}
