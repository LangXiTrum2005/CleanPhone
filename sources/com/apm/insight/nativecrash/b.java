package com.apm.insight.nativecrash;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.apm.insight.ICommonParams;
import com.apm.insight.l.m;
import com.apm.insight.runtime.j;
import com.p004ironsource.fl;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f10266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ICommonParams f10267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ICommonParams f10268c;

    public static class a extends c {
        public a(File file) {
            super(file);
            this.f10270b = "Total FD Count:";
            this.f10271c = ":";
            this.d = -2;
        }
    }

    /* JADX INFO: renamed from: com.apm.insight.nativecrash.b$b, reason: collision with other inner class name */
    public static class C0023b extends c {
        public C0023b(File file) {
            super(file);
            this.f10270b = "VmSize:";
            this.f10271c = "\\s+";
            this.d = -1;
        }
    }

    public static class d extends c {
        public d(File file) {
            super(file);
        }

        public final HashMap<String, List<String>> b() {
            HashMap<String, List<String>> map = new HashMap<>();
            try {
                JSONArray jSONArrayA = com.apm.insight.l.f.a(this.f10269a.getAbsolutePath());
                if (jSONArrayA != null) {
                    for (int i2 = 0; i2 < jSONArrayA.length(); i2++) {
                        String strOptString = jSONArrayA.optString(i2);
                        if (!TextUtils.isEmpty(strOptString) && strOptString.startsWith("[tid:0") && strOptString.endsWith("sigstack:0x0]")) {
                            int iIndexOf = strOptString.indexOf("[routine:0x");
                            int i3 = iIndexOf + 11;
                            String strSubstring = iIndexOf > 0 ? strOptString.substring(i3, strOptString.indexOf(93, i3)) : "unknown addr";
                            List<String> arrayList = map.get(strSubstring);
                            if (arrayList == null) {
                                arrayList = new ArrayList<>();
                                map.put(strSubstring, arrayList);
                            }
                            arrayList.add(strOptString);
                        }
                    }
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                com.apm.insight.c.a();
                j.a(th, "NPTH_CATCH");
            }
            return map;
        }
    }

    public static class e extends c {
        public e(File file) {
            super(file);
        }

        public final JSONArray a(HashMap<String, List<String>> map) {
            int iIndexOf;
            List<String> list;
            JSONArray jSONArray = new JSONArray();
            if (!map.isEmpty()) {
                try {
                    JSONArray jSONArrayA = com.apm.insight.l.f.a(this.f10269a.getAbsolutePath());
                    if (jSONArrayA != null) {
                        for (int i2 = 0; i2 < jSONArrayA.length(); i2++) {
                            String strOptString = jSONArrayA.optString(i2);
                            if (!TextUtils.isEmpty(strOptString) && (iIndexOf = strOptString.indexOf(":")) > 2) {
                                String strSubstring = strOptString.substring(2, iIndexOf);
                                if (map.containsKey(strSubstring) && (list = map.get(strSubstring)) != null) {
                                    Iterator<String> it = list.iterator();
                                    while (it.hasNext()) {
                                        jSONArray.put(it.next() + " " + strOptString);
                                    }
                                    map.remove(strSubstring);
                                }
                            }
                        }
                        Iterator<List<String>> it2 = map.values().iterator();
                        while (it2.hasNext()) {
                            Iterator<String> it3 = it2.next().iterator();
                            while (it3.hasNext()) {
                                jSONArray.put(it3.next() + "  0x000000:unknown");
                            }
                        }
                    }
                } catch (IOException unused) {
                } catch (Throwable th) {
                    com.apm.insight.c.a();
                    j.a(th, "NPTH_CATCH");
                }
            }
            return jSONArray;
        }
    }

    public static class f extends c {
        public f(File file) {
            super(file);
            this.f10270b = "Total Threads Count:";
            this.f10271c = ":";
            this.d = -2;
        }
    }

    public b(Context context, ICommonParams iCommonParams) {
        this(context, iCommonParams, null);
    }

    public static JSONArray a(File file, File file2) {
        return new e(file2).a(new d(file).b());
    }

    public static int b(String str) {
        return new f(com.apm.insight.l.j.c(str)).a();
    }

    public static int c(String str) {
        return new C0023b(com.apm.insight.l.j.d(str)).a();
    }

    public final String d() {
        try {
            return this.f10267b.getDeviceId();
        } catch (Throwable unused) {
            return "";
        }
    }

    public final String e() {
        try {
            return String.valueOf(this.f10267b.getCommonParams().get(fl.SESSION_HISTORY_KEY_AD_ID));
        } catch (Throwable unused) {
            return "4444";
        }
    }

    public final long f() {
        try {
            return this.f10267b.getUserId();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public b(Context context, ICommonParams iCommonParams, b bVar) {
        this.f10266a = context;
        this.f10267b = iCommonParams;
        this.f10268c = bVar == null ? null : bVar.f10267b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Map, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.HashMap] */
    public final Map<String, Object> b() {
        Map<String, Object> map;
        Throwable th;
        ?? map2;
        try {
            ICommonParams iCommonParams = this.f10268c;
            Map<String, Object> commonParams = iCommonParams != null ? iCommonParams.getCommonParams() : new HashMap();
            try {
                commonParams.putAll(this.f10267b.getCommonParams());
                th = null;
                map2 = commonParams;
            } catch (Throwable th2) {
                map = commonParams;
                th = th2;
                Map<String, Object> map3 = map;
                th = th;
                map2 = map3;
            }
        } catch (Throwable th3) {
            th = th3;
            map = null;
        }
        if (map2 == 0) {
            map2 = new HashMap(4);
            if (th != null) {
                try {
                    map2.put("err_info", m.a(th));
                } catch (Throwable unused) {
                }
            }
        }
        if (a((Map<String, Object>) map2)) {
            try {
                PackageInfo packageInfo = this.f10266a.getPackageManager().getPackageInfo(this.f10266a.getPackageName(), 128);
                map2.put("version_name", packageInfo.versionName);
                map2.put("version_code", Integer.valueOf(packageInfo.versionCode));
                if (map2.get("update_version_code") == null) {
                    Bundle bundle = packageInfo.applicationInfo.metaData;
                    Object obj = bundle != null ? bundle.get("UPDATE_VERSION_CODE") : null;
                    if (obj == null) {
                        obj = map2.get("version_code");
                    }
                    map2.put("update_version_code", obj);
                }
            } catch (Throwable unused2) {
                map2.put("version_name", com.apm.insight.l.a.c(this.f10266a));
                map2.put("version_code", Integer.valueOf(com.apm.insight.l.a.d(this.f10266a)));
                if (map2.get("update_version_code") == null) {
                    map2.put("update_version_code", map2.get("version_code"));
                }
            }
        } else {
            try {
                String str = this.f10266a.getPackageManager().getPackageInfo(this.f10266a.getPackageName(), 128).versionName;
                String str2 = (String) Class.forName(this.f10266a.getPackageName() + ".BuildConfig").getDeclaredField("VERSION_NAME").get(null);
                if (str != null && !str.equals(str2)) {
                    map2.put("manifest_version", str);
                }
            } catch (Throwable unused3) {
            }
        }
        return map2;
    }

    public final ICommonParams c() {
        return this.f10267b;
    }

    public static int a(String str) {
        return new a(com.apm.insight.l.j.b(str)).a();
    }

    public final Map<String, Object> a() {
        Object obj;
        Map<String, Object> mapB = b();
        if (((mapB == null || (obj = mapB.get(fl.SESSION_HISTORY_KEY_AD_ID)) == null) ? null : String.valueOf(obj)) == null) {
            mapB.put(fl.SESSION_HISTORY_KEY_AD_ID, 4444);
        }
        return mapB;
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected File f10269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected String f10270b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected String f10271c;
        protected int d;

        public c(File file) {
            this.f10269a = file;
        }

        public final int a() {
            int i2;
            Throwable th;
            if (!this.f10269a.exists() || !this.f10269a.isFile()) {
                return -1;
            }
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(this.f10269a));
                int iA = -1;
                do {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            break;
                        }
                        iA = a(line);
                    } catch (Throwable th2) {
                        th = th2;
                        i2 = iA;
                        bufferedReader = bufferedReader2;
                        try {
                            com.apm.insight.c.a();
                            j.a(th, "NPTH_CATCH");
                            return i2;
                        } finally {
                            if (bufferedReader != null) {
                                com.apm.insight.a.a((Closeable) bufferedReader);
                            }
                        }
                    }
                } while (iA == -1);
                com.apm.insight.a.a((Closeable) bufferedReader2);
                return iA;
            } catch (Throwable th3) {
                i2 = -1;
                th = th3;
            }
        }

        private int a(String str) {
            int i2 = this.d;
            if (!str.startsWith(this.f10270b)) {
                return i2;
            }
            try {
                i2 = Integer.parseInt(str.split(this.f10271c)[1].trim());
            } catch (NumberFormatException e2) {
                com.apm.insight.c.a();
                j.a(e2, "NPTH_CATCH");
            }
            if (i2 < 0) {
                return -2;
            }
            return i2;
        }
    }

    public static boolean a(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return true;
        }
        return ((map.containsKey("app_version") || map.containsKey("version_name")) && map.containsKey("version_code") && map.containsKey("update_version_code")) ? false : true;
    }
}
