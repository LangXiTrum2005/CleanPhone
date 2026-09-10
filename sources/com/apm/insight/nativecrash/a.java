package com.apm.insight.nativecrash;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashFilter;
import com.apm.insight.entity.Header;
import com.apm.insight.l.h;
import com.apm.insight.l.m;
import com.apm.insight.l.n;
import com.apm.insight.runtime.j;
import com.apm.insight.runtime.o;
import com.p004ironsource.d9;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static Boolean d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f10252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f10253b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f10254c;

    /* JADX INFO: renamed from: com.apm.insight.nativecrash.a$a, reason: collision with other inner class name */
    public static class C0022a {
        /* JADX INFO: Access modifiers changed from: private */
        public static String b(File file) {
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                try {
                    String line = bufferedReader2.readLine();
                    if (line == null) {
                        com.apm.insight.a.a((Closeable) bufferedReader2);
                        return "";
                    }
                    if (line.startsWith("[FATAL:jni_android.cc") && line.contains("Please include Java exception stack in crash report ttwebview:")) {
                        StringBuilder sb = new StringBuilder();
                        int iIndexOf = line.indexOf(" ttwebview:");
                        sb.append("Caused by: ");
                        sb.append("Please include Java exception stack in crash report");
                        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                        sb.append(line.substring(iIndexOf + 11));
                        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                        while (true) {
                            String line2 = bufferedReader2.readLine();
                            if (line2 == null) {
                                String string = sb.toString();
                                com.apm.insight.a.a((Closeable) bufferedReader2);
                                return string;
                            }
                            sb.append(line2);
                            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                        }
                    } else {
                        com.apm.insight.a.a((Closeable) bufferedReader2);
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    try {
                        com.apm.insight.c.a();
                        j.a(th, "NPTH_CATCH");
                    } finally {
                        com.apm.insight.a.a((Closeable) bufferedReader);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
            return "";
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.apm.insight.nativecrash.c f10255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.apm.insight.h.b f10256b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final File f10257c;
        private final File d;

        public b(File file) {
            this.f10257c = file;
            this.d = com.apm.insight.l.j.a(com.apm.insight.e.g(), file.getName());
            com.apm.insight.h.b bVar = new com.apm.insight.h.b(file);
            this.f10256b = bVar;
            com.apm.insight.nativecrash.c cVar = new com.apm.insight.nativecrash.c(file);
            this.f10255a = cVar;
            if (bVar.d() && cVar.a() == null) {
                cVar.a(file);
            }
        }

        /* JADX WARN: Code duplicated, block: B:11:0x001c A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:4:0x0008, B:6:0x000e, B:11:0x001c), top: B:16:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:9:0x0019  */
        public final long a() {
            String str;
            Map<String, String> mapF = this.f10256b.f();
            if (mapF != null) {
                try {
                    if (mapF.isEmpty()) {
                        str = null;
                    } else {
                        str = mapF.get("start_time");
                    }
                    if (str != null) {
                        return Long.parseLong(str);
                    }
                } catch (Throwable th) {
                    com.apm.insight.c.a();
                    j.a(th, "NPTH_CATCH");
                }
            } else {
                str = null;
                if (str != null) {
                    return Long.parseLong(str);
                }
            }
            return System.currentTimeMillis();
        }

        public final File b() {
            return this.f10257c;
        }

        public final boolean c() {
            return this.f10256b.d();
        }
    }

    public class c extends e {
        public c() {
            super();
            this.f10262b = "Total FD Count:";
            this.f10261a = com.apm.insight.l.j.i(a.this.f10254c.b());
            this.f10263c = ":";
            this.d = -2;
        }
    }

    public class d extends e {
        public d() {
            super();
            this.f10262b = "VmSize:";
            this.f10261a = com.apm.insight.l.j.k(a.this.f10254c.b());
            this.f10263c = "\\s+";
            this.d = -1;
        }
    }

    public class f extends e {
        public f() {
            super();
            this.f10262b = "Total Threads Count:";
            this.f10261a = com.apm.insight.l.j.j(a.this.f10254c.b());
            this.f10263c = ":";
            this.d = -2;
        }
    }

    public a(Context context) {
        this.f10252a = context;
    }

    public static long g() {
        if (NativeImpl.f()) {
            return Long.MAX_VALUE;
        }
        return Header.a() ? 3891200L : 2867200L;
    }

    public static boolean k() {
        Boolean bool = d;
        if (bool != null) {
            return bool.booleanValue();
        }
        String[] strArr = {"/data/local/su", "/data/local/bin/su", "/data/local/xbin/su", "/system/xbin/su", "/system/bin/su", "/system/bin/.ext/su", "/system/bin/failsafe/su", "/system/sd/xbin/su", "/system/usr/we-need-root/su", "/sbin/su", "/su/bin/su"};
        for (int i2 = 0; i2 < 11; i2++) {
            try {
                if (new File(strArr[i2]).exists()) {
                    d = Boolean.TRUE;
                    return true;
                }
                continue;
            } catch (Throwable th) {
                com.apm.insight.c.a();
                j.a(th, "NPTH_CATCH");
            }
        }
        d = Boolean.FALSE;
        return false;
    }

    private String l() {
        b bVar = this.f10254c;
        if (bVar == null) {
            return null;
        }
        String strC = bVar.f10255a.c();
        return (strC == null || strC.isEmpty()) ? this.f10254c.f10256b.e() : strC;
    }

    public final JSONObject b() {
        File fileF = com.apm.insight.l.j.f(this.f10254c.b());
        if (!fileF.exists()) {
            return null;
        }
        try {
            String strA = com.apm.insight.l.f.a(fileF.getAbsolutePath(), IOUtils.LINE_SEPARATOR_UNIX);
            if (strA != null && !strA.isEmpty()) {
                return new JSONObject(strA);
            }
        } catch (Throwable th) {
            com.apm.insight.c.a();
            j.a(th, "NPTH_CATCH");
        }
        return null;
    }

    public final void c() {
        BufferedWriter bufferedWriter;
        Throwable th;
        try {
            File fileE = com.apm.insight.l.j.e(this.f10254c.b());
            File file = new File(fileE.getAbsolutePath() + ".tmp'");
            if (file.exists()) {
                file.delete();
            }
            int i2 = 0;
            if (fileE.exists()) {
                while (i2 < NativeCrashCollector.a()) {
                    File file2 = new File(fileE.getAbsolutePath() + '.' + i2);
                    if (file2.exists()) {
                        file2.delete();
                    }
                    i2++;
                }
                return;
            }
            com.apm.insight.entity.a aVar = new com.apm.insight.entity.a();
            for (int i3 = 0; i3 < NativeCrashCollector.a(); i3++) {
                File file3 = new File(fileE.getAbsolutePath() + '.' + i3);
                if (file3.exists()) {
                    try {
                        String strA = com.apm.insight.l.f.a(file3.getAbsolutePath(), IOUtils.LINE_SEPARATOR_UNIX);
                        if (!TextUtils.isEmpty(strA)) {
                            JSONObject jSONObject = new JSONObject(strA);
                            if (jSONObject.length() > 0) {
                                aVar.c(jSONObject);
                            }
                        }
                    } catch (JSONException e2) {
                        com.apm.insight.c.a();
                        j.a(e2, "NPTH_CATCH");
                    }
                }
            }
            JSONObject jSONObjectC = aVar.c();
            try {
                if (jSONObjectC.length() != 0 && jSONObjectC.opt(d9.a.k) == null) {
                    com.apm.insight.e.g();
                    com.apm.insight.entity.a.a(jSONObjectC, n.a());
                }
            } catch (Throwable unused) {
            }
            if (jSONObjectC.length() != 0) {
                this.f10253b = jSONObjectC;
                file.getParentFile().mkdirs();
                try {
                    bufferedWriter = new BufferedWriter(new FileWriter(file));
                    try {
                        h.a(jSONObjectC, bufferedWriter);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            try {
                                jSONObjectC.put("err_write", th.toString());
                                com.apm.insight.entity.a.a(jSONObjectC, "filters", "err_write", th.getLocalizedMessage());
                            } catch (JSONException unused2) {
                            }
                            com.apm.insight.c.a();
                            j.a(th, "NPTH_CATCH");
                        } catch (Throwable th3) {
                            com.apm.insight.a.a((Closeable) bufferedWriter);
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    bufferedWriter = null;
                    th = th4;
                }
                com.apm.insight.a.a((Closeable) bufferedWriter);
                if (file.renameTo(fileE)) {
                    while (i2 < NativeCrashCollector.a()) {
                        File file4 = new File(fileE.getAbsolutePath() + '.' + i2);
                        if (file4.exists()) {
                            file4.delete();
                        }
                        i2++;
                    }
                }
            }
        } catch (IOException e3) {
            com.apm.insight.c.a();
            j.a(e3, "NPTH_CATCH");
        }
    }

    public final boolean d() {
        ICrashFilter iCrashFilterB = com.apm.insight.e.b().b();
        if (iCrashFilterB == null) {
            return true;
        }
        try {
            return iCrashFilterB.onNativeCrashFilter(l(), "");
        } catch (Throwable th) {
            com.apm.insight.c.a();
            j.a(th, "NPTH_CATCH");
            return true;
        }
    }

    public final boolean e() {
        return com.apm.insight.e.a.a().a(com.apm.insight.l.j.f(this.f10254c.b()).getAbsolutePath());
    }

    public final void f() {
        com.apm.insight.e.a.a().a(com.apm.insight.d.a.b(com.apm.insight.l.j.f(this.f10254c.b()).getAbsolutePath()));
    }

    public final JSONObject h() {
        try {
            com.apm.insight.entity.a aVar = new com.apm.insight.entity.a();
            Header header = new Header(this.f10252a);
            JSONObject jSONObjectA = o.a().a(this.f10254c.a());
            if (jSONObjectA != null) {
                header.a(jSONObjectA);
                header.d();
                header.e();
            }
            Header.b(header);
            aVar.a(header);
            boolean z2 = true;
            aVar.a("is_native_crash", (Object) 1);
            aVar.a("repack_time", Long.valueOf(System.currentTimeMillis()));
            aVar.a("crash_uuid", this.f10254c.b().getName());
            b bVar = this.f10254c;
            Map<String, String> mapF = bVar != null ? bVar.f10256b.f() : null;
            if (mapF != null) {
                Object obj = (String) mapF.get("process_name");
                if (obj != null) {
                    aVar.a("process_name", obj);
                }
                String str = mapF.get("start_time");
                if (str != null) {
                    try {
                        aVar.a(Long.decode(str).longValue());
                    } catch (Throwable th) {
                        com.apm.insight.c.a();
                        j.a(th, "NPTH_CATCH");
                    }
                }
                String str2 = mapF.get(com.smartdigimkt.o1.b.B0);
                if (str2 != null) {
                    try {
                        aVar.a(com.smartdigimkt.o1.b.B0, Long.decode(str2));
                    } catch (Throwable th2) {
                        com.apm.insight.c.a();
                        j.a(th2, "NPTH_CATCH");
                    }
                }
                Object obj2 = (String) mapF.get("crash_thread_name");
                if (obj2 != null) {
                    aVar.a("crash_thread_name", obj2);
                }
                String str3 = mapF.get("crash_time");
                if (str3 != null) {
                    try {
                        aVar.a("crash_time", Long.decode(str3));
                    } catch (Throwable th3) {
                        com.apm.insight.c.a();
                        j.a(th3, "NPTH_CATCH");
                    }
                }
                aVar.a("data", l());
            }
            Map<String, String> mapB = this.f10254c.f10255a.b();
            if (!mapB.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (String str4 : mapB.keySet()) {
                    String strA = a(mapB.get(str4));
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("lib_name", str4);
                        jSONObject.put("lib_uuid", strA);
                        jSONArray.put(jSONObject);
                    } catch (JSONException e2) {
                        com.apm.insight.c.a();
                        j.a(e2, "NPTH_CATCH");
                    }
                }
                aVar.a("crash_lib_uuid", (Object) jSONArray);
            }
            File fileE = com.apm.insight.l.j.e(this.f10254c.b());
            if (fileE.exists() || this.f10253b != null) {
                try {
                    JSONObject jSONObject2 = this.f10253b;
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject(com.apm.insight.l.f.a(fileE.getAbsolutePath(), IOUtils.LINE_SEPARATOR_UNIX));
                    }
                    aVar.c(jSONObject2);
                    aVar.a("has_callback", com.p004ironsource.mediationsdk.metadata.a.g);
                    if (aVar.c().opt(d9.a.k) == null) {
                        com.apm.insight.e.g();
                        aVar.b(n.a());
                    }
                    com.apm.insight.a.a(aVar, aVar.d(), CrashType.NATIVE);
                } catch (Throwable th4) {
                    com.apm.insight.c.a();
                    j.a(th4, "NPTH_CATCH");
                }
                long j = -1;
                long jOptLong = aVar.c().optLong("crash_time", -1L);
                long jOptLong2 = aVar.c().optLong("java_end", -1L);
                if (jOptLong2 != -1 && jOptLong != -1) {
                    j = jOptLong2 - jOptLong;
                }
                try {
                    aVar.b("total_cost", String.valueOf(j));
                    aVar.a("total_cost", String.valueOf(j / 1000));
                } catch (Throwable unused) {
                }
            } else {
                com.apm.insight.e.g();
                aVar.b(n.a());
                aVar.a("has_callback", "false");
            }
            File fileG = com.apm.insight.l.j.g(this.f10254c.b());
            String strA2 = "";
            if (fileG.exists()) {
                try {
                    strA2 = m.a(fileG.getAbsolutePath());
                } catch (Throwable th5) {
                    com.apm.insight.c.a();
                    j.a(th5, "NPTH_CATCH");
                }
            }
            File fileO = com.apm.insight.l.j.o(this.f10254c.b());
            if (fileO.exists()) {
                String strB = C0022a.b(fileO);
                strA2 = strA2.isEmpty() ? strB : strA2 + IOUtils.LINE_SEPARATOR_UNIX + strB;
            }
            try {
                if (!strA2.isEmpty()) {
                    aVar.a("java_data", (Object) strA2);
                }
            } catch (Throwable th6) {
                com.apm.insight.c.a();
                j.a(th6, "NPTH_CATCH");
            }
            b(aVar);
            a(aVar);
            com.apm.insight.entity.d.b(aVar.c());
            HashMap map = new HashMap();
            if (k()) {
                map.put("is_root", com.p004ironsource.mediationsdk.metadata.a.g);
                aVar.a("is_root", com.p004ironsource.mediationsdk.metadata.a.g);
            } else {
                map.put("is_root", "false");
                aVar.a("is_root", "false");
            }
            map.put("has_fds_file", com.apm.insight.l.j.i(this.f10254c.b()).exists() ? com.p004ironsource.mediationsdk.metadata.a.g : "false");
            File fileH = com.apm.insight.l.j.h(this.f10254c.b());
            map.put("has_logcat_file", (!fileH.exists() || fileH.length() <= 128) ? "false" : com.p004ironsource.mediationsdk.metadata.a.g);
            map.put("has_maps_file", com.apm.insight.l.j.d(this.f10254c.b()).exists() ? com.p004ironsource.mediationsdk.metadata.a.g : "false");
            map.put("has_tombstone_file", com.apm.insight.l.j.b(this.f10254c.b()).exists() ? com.p004ironsource.mediationsdk.metadata.a.g : "false");
            map.put("has_meminfo_file", com.apm.insight.l.j.k(this.f10254c.b()).exists() ? com.p004ironsource.mediationsdk.metadata.a.g : "false");
            map.put("has_threads_file", com.apm.insight.l.j.j(this.f10254c.b()).exists() ? com.p004ironsource.mediationsdk.metadata.a.g : "false");
            int iA = new c().a();
            if (iA > 0) {
                if (iA > 960) {
                    map.put("fd_leak", com.p004ironsource.mediationsdk.metadata.a.g);
                } else {
                    map.put("fd_leak", "false");
                }
                aVar.a("fd_count", Integer.valueOf(iA));
            }
            int iA2 = new f().a();
            if (iA2 > 0) {
                if (iA2 > 350) {
                    map.put("threads_leak", com.p004ironsource.mediationsdk.metadata.a.g);
                } else {
                    map.put("threads_leak", "false");
                }
                aVar.a("threads_count", Integer.valueOf(iA2));
            }
            int iA3 = new d().a();
            if (iA3 > 0) {
                if (iA3 > g()) {
                    map.put("memory_leak", com.p004ironsource.mediationsdk.metadata.a.g);
                } else {
                    map.put("memory_leak", "false");
                }
                aVar.a("memory_size", Integer.valueOf(iA3));
            }
            map.put(com.smartdigimkt.b0.a.s1, "2008-20250701130429");
            if (aVar.c().opt("java_data") == null) {
                z2 = false;
            }
            map.put("has_java_stack", String.valueOf(z2));
            JSONArray jSONArrayA = com.apm.insight.nativecrash.b.a(com.apm.insight.l.j.l(this.f10254c.f10257c), com.apm.insight.l.j.m(this.f10254c.f10257c));
            map.put("leak_threads_count", String.valueOf(jSONArrayA.length()));
            if (jSONArrayA.length() > 0) {
                try {
                    com.apm.insight.l.f.a(com.apm.insight.l.j.n(this.f10254c.f10257c), jSONArrayA);
                } catch (Throwable unused2) {
                }
            }
            aVar.b();
            aVar.a("is_64_devices", String.valueOf(Header.a()));
            aVar.a("is_64_runtime", String.valueOf(NativeImpl.f()));
            aVar.a("is_x86_devices", String.valueOf(Header.b()));
            aVar.c(map);
            File fileF = com.apm.insight.l.j.f(this.f10254c.b());
            JSONObject jSONObjectC = aVar.c();
            com.apm.insight.l.f.a(fileF, jSONObjectC);
            return jSONObjectC;
        } catch (Throwable th7) {
            com.apm.insight.c.a();
            j.a(th7, "NPTH_CATCH");
            return null;
        }
    }

    public final boolean i() {
        return com.apm.insight.l.f.a(this.f10254c.b());
    }

    public final void j() {
        try {
            com.apm.insight.l.f.b(this.f10254c.b().getAbsolutePath(), Environment.getExternalStorageDirectory().getAbsolutePath() + "/localDebug/" + com.apm.insight.e.g().getPackageName() + "/" + this.f10254c.b().getName() + ".zip");
        } catch (Throwable th) {
            com.apm.insight.c.a();
            j.a(th, "NPTH_CATCH");
        }
    }

    public final void a(File file) {
        this.f10254c = new b(file);
    }

    public final boolean a() {
        b bVar = this.f10254c;
        if (bVar != null) {
            return bVar.c();
        }
        return false;
    }

    private void a(com.apm.insight.entity.a aVar) {
        File fileA = com.apm.insight.l.j.a(this.f10254c.b());
        if (fileA.exists()) {
            try {
                String strA = com.apm.insight.l.f.a(fileA.getAbsolutePath(), IOUtils.LINE_SEPARATOR_UNIX);
                JSONArray jSONArray = new JSONArray();
                if (strA != null) {
                    for (String str : strA.split(IOUtils.LINE_SEPARATOR_UNIX)) {
                        jSONArray.put(str);
                    }
                }
                aVar.a("native_log", (Object) jSONArray);
            } catch (Throwable th) {
                com.apm.insight.c.a();
                j.a(th, "NPTH_CATCH");
            }
        }
    }

    public class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected File f10261a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected String f10262b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected String f10263c;
        protected int d;

        public e() {
        }

        public final int a() {
            int i2;
            Throwable th;
            if (!this.f10261a.exists() || !this.f10261a.isFile()) {
                return -1;
            }
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(this.f10261a));
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
            if (!str.startsWith(this.f10262b)) {
                return i2;
            }
            try {
                i2 = Integer.parseInt(str.split(this.f10263c)[1].trim());
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

    private void b(com.apm.insight.entity.a aVar) {
        BufferedReader bufferedReader;
        File fileH = com.apm.insight.l.j.h(this.f10254c.b());
        if (!fileH.exists()) {
            NativeImpl.a(fileH.getAbsolutePath(), String.valueOf(com.apm.insight.e.i().getLogcatDumpCount()), String.valueOf(com.apm.insight.e.i().getLogcatLevel()));
        }
        JSONArray jSONArray = new JSONArray();
        String strR = android.support.v4.media.a.r(new StringBuilder(" "), this.f10254c.f10256b.f().get(com.smartdigimkt.o1.b.B0), " ");
        try {
            bufferedReader = new BufferedReader(new FileReader(fileH));
            try {
                if (fileH.length() > 512000) {
                    bufferedReader.skip(fileH.length() - 512000);
                }
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    if ((line.length() > 32 ? line.substring(0, 31) : line).contains(strR)) {
                        jSONArray.put(line);
                    }
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
        }
        com.apm.insight.a.a((Closeable) bufferedReader);
        aVar.a("logcat", (Object) jSONArray);
    }

    private static String a(String str) {
        StringBuilder sb = new StringBuilder();
        try {
            if (str.length() < 16) {
                sb.append(str);
            } else {
                sb.append(str.charAt(6));
                sb.append(str.charAt(7));
                sb.append(str.charAt(4));
                sb.append(str.charAt(5));
                sb.append(str.charAt(2));
                sb.append(str.charAt(3));
                sb.append(str.charAt(0));
                sb.append(str.charAt(1));
                sb.append(str.charAt(10));
                sb.append(str.charAt(11));
                sb.append(str.charAt(8));
                sb.append(str.charAt(9));
                sb.append(str.charAt(14));
                sb.append(str.charAt(15));
                sb.append(str.charAt(12));
                sb.append(str.charAt(13));
                if (str.length() >= 32) {
                    sb.append((CharSequence) str, 16, 32);
                    sb.append('0');
                }
            }
        } catch (Throwable th) {
            com.apm.insight.c.a();
            j.a(th, "NPTH_CATCH");
        }
        return sb.toString().toUpperCase();
    }
}
