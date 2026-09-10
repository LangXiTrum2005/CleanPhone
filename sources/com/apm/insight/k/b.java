package com.apm.insight.k;

import android.content.Context;
import android.text.TextUtils;
import com.apm.insight.CrashType;
import com.apm.insight.Npth;
import com.apm.insight.entity.Header;
import com.apm.insight.l.n;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.m;
import com.apm.insight.runtime.o;
import com.google.android.gms.ads.RequestConfiguration;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.p004ironsource.d9;
import com.p004ironsource.fl;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile b f10155b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f10156a;
    private C0021b f;
    private HashMap<String, C0021b> g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<File> f10157c = new ArrayList();
    private List<File> d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f10158e = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f10159h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Runnable f10160i = new Runnable() { // from class: com.apm.insight.k.b.1
        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            b.this.f();
        }
    };
    private Runnable j = new Runnable() { // from class: com.apm.insight.k.b.2
        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            b.this.d();
        }
    };

    /* JADX INFO: renamed from: com.apm.insight.k.b$b, reason: collision with other inner class name */
    public static class C0021b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f10173a;
        a d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        a f10176e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        List<a> f10174b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        List<a> f10175c = new ArrayList();
        boolean f = false;
        int g = 0;

        public C0021b(String str) {
            this.f10173a = str;
        }
    }

    private b(Context context) {
        this.f10156a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() throws Throwable {
        if (this.f10159h || this.g == null) {
            return;
        }
        if (!com.apm.insight.l.k.b(this.f10156a)) {
            e();
        }
        if (this.f10158e == -1) {
            if (com.apm.insight.runtime.a.a() && com.apm.insight.runtime.a.f()) {
                this.f10158e = 1;
            } else {
                this.f10158e = 0;
            }
        }
        boolean z2 = this.f10158e == 1;
        com.apm.insight.runtime.f fVar = new com.apm.insight.runtime.f(this.f10156a);
        Iterator<C0021b> it = this.g.values().iterator();
        while (it.hasNext()) {
            b(it.next(), z2, fVar);
        }
        Iterator<C0021b> it2 = this.g.values().iterator();
        while (it2.hasNext()) {
            a(it2.next(), z2, fVar);
        }
        Iterator<C0021b> it3 = this.g.values().iterator();
        while (it3.hasNext()) {
            com.apm.insight.l.f.a(com.apm.insight.l.j.a(this.f10156a, it3.next().f10173a));
        }
        fVar.a();
        com.apm.insight.runtime.b.a();
        e();
    }

    private void e() {
        this.f10159h = true;
        this.g = null;
        NativeImpl.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() throws Throwable {
        if (this.f10159h) {
            return;
        }
        if (!com.apm.insight.l.k.b(this.f10156a) || (System.currentTimeMillis() - com.apm.insight.e.j() <= 5000 && com.apm.insight.e.i().isApmExists() && !Npth.hasCrash())) {
            m.a().a(this.f10160i, 5000L);
        } else {
            d();
        }
    }

    private void g() {
        File[] fileArrListFiles = com.apm.insight.l.j.i(this.f10156a).listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (int i2 = 0; i2 < fileArrListFiles.length && i2 < 5; i2++) {
            File file = fileArrListFiles[i2];
            if (file.getName().endsWith(".atmp")) {
                com.apm.insight.a.a.a();
                file.getAbsolutePath();
            } else {
                try {
                    com.apm.insight.f.b bVarC = com.apm.insight.l.f.c(file.getAbsolutePath());
                    if (bVarC != null) {
                        if (bVarC.b() != null) {
                            bVarC.b().put("upload_scene", "launch_scan");
                        }
                        if (e.a(e.d(), bVarC.e(), bVarC.d(), bVarC.f(), bVarC.g())) {
                            com.apm.insight.l.f.a(file);
                            String strC = bVarC.c();
                            if (!TextUtils.isEmpty(strC)) {
                                com.apm.insight.l.f.a(new File(strC));
                            }
                        }
                    } else {
                        com.apm.insight.l.f.a(file);
                    }
                } catch (Throwable th) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                }
            }
        }
    }

    public static b a() {
        if (f10155b == null) {
            synchronized (b.class) {
                try {
                    if (f10155b == null) {
                        f10155b = new b(com.apm.insight.e.g());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f10155b;
    }

    public final void b() {
        try {
            if (!this.f10159h && com.apm.insight.l.a.b(com.apm.insight.e.g())) {
                m.a().a(this.j);
            }
        } catch (Throwable unused) {
        }
    }

    public final boolean c() {
        return this.f10159h;
    }

    private void b(HashMap<String, C0021b> map) {
        File[] fileArrListFiles = com.apm.insight.l.j.d(this.f10156a).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        for (int i2 = 0; i2 < fileArrListFiles.length && i2 < 5; i2++) {
            File file = fileArrListFiles[i2];
            try {
                if (!file.isDirectory()) {
                    com.apm.insight.l.f.a(file);
                } else if (file.getName().endsWith(RequestConfiguration.MAX_AD_CONTENT_RATING_G)) {
                    String name = file.getName();
                    C0021b c0021b = map.get(name);
                    if (c0021b == null) {
                        c0021b = new C0021b(name);
                        map.put(name, c0021b);
                    }
                    c0021b.f10175c.add(new a(file, CrashType.NATIVE));
                } else {
                    com.apm.insight.l.f.a(file);
                }
            } catch (Throwable th) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                com.apm.insight.l.f.a(file);
            }
        }
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        File f10169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f10170b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f10171c;
        CrashType d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f10172e;

        public a(File file, CrashType crashType) {
            this.f10170b = -1L;
            this.f10171c = -1L;
            this.f10169a = file;
            this.d = crashType;
            this.f10172e = file.getName();
        }

        public a(File file, long j, CrashType crashType) {
            this.f10171c = -1L;
            this.f10169a = file;
            this.f10170b = j;
            this.d = crashType;
            this.f10172e = file.getName();
        }
    }

    public final void a(boolean z2) throws Throwable {
        if (!Npth.isStopUpload() && z2) {
            if (this.f == null) {
                this.f = new C0021b("old_uuid");
                HashMap<String, C0021b> map = new HashMap<>();
                this.g = map;
                a(map);
                a(this.g, this.f);
                com.apm.insight.l.f.a(com.apm.insight.l.j.b(this.f10156a));
                b(this.g);
                b(this.f, true, null);
                a(this.f, true, null);
                this.f = null;
                if (this.g.isEmpty()) {
                    e();
                } else {
                    f();
                }
            }
            g();
            com.apm.insight.a.c();
        }
    }

    private void b(final C0021b c0021b, boolean z2, com.apm.insight.runtime.f fVar) {
        boolean z3;
        if (c0021b.f10175c.size() <= 1 && c0021b.f10175c.isEmpty()) {
            c0021b.f10176e = c0021b.d;
            return;
        }
        boolean zB = com.apm.insight.l.k.b(this.f10156a);
        c0021b.f10176e = c0021b.d;
        com.apm.insight.nativecrash.a aVar = new com.apm.insight.nativecrash.a(this.f10156a);
        for (a aVar2 : c0021b.f10175c) {
            final File file = aVar2.f10169a;
            try {
                aVar.a(file);
                JSONObject jSONObjectA = a(aVar);
                if (jSONObjectA != null && jSONObjectA.length() != 0) {
                    if (jSONObjectA.length() != 0) {
                        if (!z2) {
                            long jOptLong = jSONObjectA.optLong("crash_time");
                            try {
                                a aVar3 = c0021b.f10176e;
                                if (aVar3 == null) {
                                    c0021b.f10176e = aVar2;
                                    c0021b.f = true;
                                    if (fVar == null || fVar.a("default")) {
                                        z3 = zB;
                                    } else {
                                        aVar.i();
                                    }
                                    com.apm.insight.c.a();
                                    com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                                    com.apm.insight.l.f.a(file);
                                } else {
                                    z3 = zB;
                                    try {
                                        if (!c0021b.f && jOptLong < aVar3.f10170b) {
                                            c0021b.f10176e = aVar2;
                                            if (fVar != null && !fVar.a("default")) {
                                                aVar.i();
                                                zB = z3;
                                            } else {
                                                a(file);
                                                c0021b.f = true;
                                            }
                                        } else {
                                            com.apm.insight.entity.a.a(jSONObjectA, "filters", fl.SESSION_HISTORY_KEY_AD_ID, String.valueOf(jSONObjectA.optJSONObject(com.smartdigimkt.x.g.f39716B).opt(fl.SESSION_HISTORY_KEY_AD_ID)));
                                            jSONObjectA.optJSONObject(com.smartdigimkt.x.g.f39716B).put(fl.SESSION_HISTORY_KEY_AD_ID, 2010);
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                z3 = zB;
                            }
                        } else {
                            z3 = zB;
                            if (fVar != null && !fVar.a("default")) {
                                aVar.i();
                            }
                        }
                        try {
                            com.apm.insight.entity.a.a(jSONObjectA, "filters", "start_uuid", c0021b.f10173a);
                            com.apm.insight.entity.a.a(jSONObjectA, "filters", "crash_thread_name", jSONObjectA.optString("crash_thread_name", "unknown"));
                            if (z3) {
                                c.a aVar4 = new c.a(jSONObjectA, CrashType.NATIVE);
                                com.apm.insight.entity.b.a(jSONObjectA, com.apm.insight.entity.b.a(aVar4.c(), aVar4.a(), o.a().b(aVar4.b() == -1 ? System.currentTimeMillis() : aVar4.b())), new com.apm.insight.entity.b.a() { // from class: com.apm.insight.k.b.4
                                    @Override // com.apm.insight.entity.b.a
                                    public final void a(JSONObject jSONObject) {
                                        d.a();
                                        d.a(jSONObject, file, com.apm.insight.l.j.a(b.this.f10156a, c0021b.f10173a));
                                    }
                                });
                                if (!aVar.i()) {
                                    aVar.f();
                                }
                            }
                            c.a(CrashType.NATIVE, jSONObjectA);
                        } catch (Throwable th3) {
                            th = th3;
                            com.apm.insight.c.a();
                            com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                            com.apm.insight.l.f.a(file);
                        }
                    } else {
                        z3 = zB;
                    }
                    zB = z3;
                } else {
                    z3 = zB;
                    aVar.i();
                    zB = z3;
                }
            } catch (Throwable th4) {
                th = th4;
                z3 = zB;
            }
        }
    }

    private void a(HashMap<String, C0021b> map) {
        File[] fileArrListFiles = com.apm.insight.l.j.f(this.f10156a).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        for (int i2 = 0; i2 < fileArrListFiles.length && i2 < 5; i2++) {
            File file = fileArrListFiles[i2];
            try {
                if (!file.isDirectory()) {
                    com.apm.insight.l.f.a(file);
                } else if (file.getName().endsWith(RequestConfiguration.MAX_AD_CONTENT_RATING_G)) {
                    String name = file.getName();
                    C0021b c0021b = map.get(name);
                    if (c0021b == null) {
                        c0021b = new C0021b(name);
                        map.put(name, c0021b);
                    }
                    JSONArray jSONArrayA = com.apm.insight.nativecrash.b.a(com.apm.insight.l.j.l(file), com.apm.insight.l.j.m(file));
                    int length = jSONArrayA.length();
                    c0021b.g = length;
                    if (length > 0) {
                        try {
                            com.apm.insight.l.f.a(com.apm.insight.l.j.n(file), jSONArrayA);
                        } catch (Throwable unused) {
                        }
                    }
                } else {
                    com.apm.insight.l.f.a(file);
                }
            } catch (Throwable th) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                com.apm.insight.l.f.a(file);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00c5  */
    private void a(HashMap<String, C0021b> map, C0021b c0021b) {
        byte b2;
        CrashType crashType;
        File[] fileArrListFiles = com.apm.insight.l.j.a(this.f10156a).listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        Arrays.sort(fileArrListFiles, Collections.reverseOrder());
        char c2 = 0;
        int i2 = 0;
        while (i2 < fileArrListFiles.length) {
            File file = fileArrListFiles[i2];
            try {
                if (com.apm.insight.e.a.a().a(file.getAbsolutePath())) {
                    com.apm.insight.l.f.a(file);
                } else if (!com.apm.insight.l.f.e(file) && !com.apm.insight.g.a.a().b(file.getName())) {
                    if (file.isFile()) {
                        com.apm.insight.l.f.a(file);
                    } else {
                        String name = file.getName();
                        if (name.endsWith(RequestConfiguration.MAX_AD_CONTENT_RATING_G)) {
                            String[] strArrSplit = name.split("_");
                            if (strArrSplit.length < 5) {
                                c0021b.f10174b.add(new a(file, null));
                            } else {
                                try {
                                    long j = Long.parseLong(strArrSplit[c2]);
                                    long j2 = Long.parseLong(strArrSplit[4]);
                                    String str = strArrSplit[2];
                                    String str2 = strArrSplit[1];
                                    int iHashCode = str2.hashCode();
                                    if (iHashCode != -1109843021) {
                                        if (iHashCode != 96741) {
                                            if (iHashCode == 3254818 && str2.equals("java")) {
                                                b2 = 1;
                                            } else {
                                                b2 = -1;
                                            }
                                        } else if (str2.equals("anr")) {
                                            b2 = 2;
                                        } else {
                                            b2 = -1;
                                        }
                                    } else if (str2.equals("launch")) {
                                        b2 = 0;
                                    } else {
                                        b2 = -1;
                                    }
                                    if (b2 == 0) {
                                        crashType = CrashType.LAUNCH;
                                    } else if (b2 != 1) {
                                        crashType = b2 != 2 ? null : CrashType.ANR;
                                    } else {
                                        crashType = CrashType.JAVA;
                                    }
                                    C0021b c0021b2 = map.get(str);
                                    if (c0021b2 == null) {
                                        c0021b2 = new C0021b(str);
                                        map.put(str, c0021b2);
                                    }
                                    a aVar = new a(file, j, crashType);
                                    aVar.f10171c = j2;
                                    a aVar2 = c0021b2.d;
                                    if ((aVar2 == null || aVar2.f10170b > aVar.f10170b) && crashType != null && crashType != CrashType.ANR && !name.contains("ignore")) {
                                        c0021b2.d = aVar;
                                    }
                                    c0021b2.f10174b.add(aVar);
                                } catch (Throwable unused) {
                                    c0021b.f10174b.add(new a(file, null));
                                    com.apm.insight.c.a();
                                    com.apm.insight.runtime.j.a(new RuntimeException("err format crashTime:".concat(name)), "NPTH_CATCH");
                                }
                            }
                        } else {
                            com.apm.insight.l.f.a(file);
                        }
                    }
                }
            } catch (Throwable th) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
            }
            i2++;
            c2 = 0;
        }
    }

    private static JSONObject a(com.apm.insight.nativecrash.a aVar) {
        JSONObject jSONObjectB = aVar.b();
        if (jSONObjectB != null && jSONObjectB.length() != 0) {
            return jSONObjectB;
        }
        if (com.apm.insight.e.d()) {
            aVar.j();
        }
        if (!aVar.a()) {
            aVar.i();
            return null;
        }
        if (!aVar.d()) {
            aVar.i();
            return null;
        }
        if (aVar.e()) {
            aVar.i();
            return null;
        }
        aVar.c();
        return aVar.h();
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0154 A[Catch: all -> 0x0166, TryCatch #4 {all -> 0x0166, blocks: (B:72:0x0148, B:74:0x0154, B:78:0x0168), top: B:93:0x0148 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x00e0 A[EXC_TOP_SPLITTER, PHI: r16
  0x00e0: PHI (r16v7 java.util.Iterator<com.apm.insight.k.b$a>) = (r16v9 java.util.Iterator<com.apm.insight.k.b$a>), (r16v10 java.util.Iterator<com.apm.insight.k.b$a>) binds: [B:54:0x00de, B:48:0x00d0] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    private void a(final C0021b c0021b, boolean z2, com.apm.insight.runtime.f fVar) {
        Iterator<a> it;
        CrashType crashType;
        if (!c0021b.f10174b.isEmpty()) {
            if (c0021b.f10176e == null) {
                c0021b.f10176e = c0021b.d;
            }
            Iterator<a> it2 = c0021b.f10174b.iterator();
            while (it2.hasNext()) {
                a next = it2.next();
                try {
                    final File file = next.f10169a;
                    CrashType crashType2 = next.d;
                    try {
                        final com.apm.insight.f.b bVarA = a(file, crashType2, c0021b.f10173a, next.f10170b, next.f10171c);
                        if (bVarA == null) {
                            com.apm.insight.l.f.a(file);
                        } else {
                            JSONObject jSONObjectB = bVarA.b();
                            if (jSONObjectB == null) {
                                com.apm.insight.l.f.a(file);
                            } else {
                                JSONObject jSONObjectOptJSONObject = jSONObjectB.optJSONObject(com.smartdigimkt.x.g.f39716B);
                                if (jSONObjectOptJSONObject == null) {
                                    com.apm.insight.l.f.a(file);
                                } else if (crashType2 == null && (new File(file, file.getName()).exists() || file.getName().split("_").length < 5)) {
                                    if (e.b(bVarA.a(), jSONObjectB.toString()).a()) {
                                        com.apm.insight.l.f.a(file);
                                    }
                                } else {
                                    File fileA = com.apm.insight.entity.b.a(file);
                                    if (!fileA.exists()) {
                                        com.apm.insight.l.f.a(file);
                                    } else {
                                        try {
                                            JSONArray jSONArray = new JSONArray(com.apm.insight.l.f.a(fileA, IOUtils.LINE_SEPARATOR_UNIX));
                                            JSONObject jSONObjectOptJSONObject2 = crashType2 == CrashType.LAUNCH ? ((JSONArray) jSONObjectB.opt("data")).optJSONObject(0) : jSONObjectB;
                                            try {
                                                if (z2) {
                                                    it = it2;
                                                } else {
                                                    it = it2;
                                                    try {
                                                        if (c0021b.f10176e != next) {
                                                            try {
                                                                com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, "filters", fl.SESSION_HISTORY_KEY_AD_ID, String.valueOf(jSONObjectOptJSONObject.opt(fl.SESSION_HISTORY_KEY_AD_ID)));
                                                                crashType = crashType2;
                                                                try {
                                                                    com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, "filters", "has_ignore", String.valueOf(next.f10172e.contains("ignore")));
                                                                    jSONObjectOptJSONObject.put(fl.SESSION_HISTORY_KEY_AD_ID, 2010);
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    com.apm.insight.c.a();
                                                                    com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                                                                }
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                crashType = crashType2;
                                                            }
                                                        }
                                                        com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, "filters", "start_uuid", c0021b.f10173a);
                                                        com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, "filters", "leak_threads_count", String.valueOf(c0021b.g));
                                                        com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, "filters", "crash_thread_name", jSONObjectOptJSONObject2.optString("crash_thread_name", "unknown"));
                                                        com.apm.insight.entity.b.a(jSONObjectB, jSONArray, new com.apm.insight.entity.b.a() { // from class: com.apm.insight.k.b.3
                                                            @Override // com.apm.insight.entity.b.a
                                                            public final void a(JSONObject jSONObject) {
                                                                e.a(bVarA.a(), jSONObject.toString(), new File(file, "logZip"), com.apm.insight.l.j.a(b.this.f10156a, c0021b.f10173a));
                                                            }
                                                        });
                                                        if (!com.apm.insight.l.f.a(file)) {
                                                            com.apm.insight.e.a.a().a(com.apm.insight.d.a.b(file.getAbsolutePath()));
                                                        }
                                                        c.a(crashType, jSONObjectB);
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        com.apm.insight.c.a();
                                                        com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                                                        com.apm.insight.l.f.a(next.f10169a);
                                                        it2 = it;
                                                    }
                                                    it2 = it;
                                                }
                                                if (next.f10172e.contains("ignore")) {
                                                    com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, "filters", fl.SESSION_HISTORY_KEY_AD_ID, String.valueOf(jSONObjectOptJSONObject.opt(fl.SESSION_HISTORY_KEY_AD_ID)));
                                                    crashType = crashType2;
                                                    com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, "filters", "has_ignore", String.valueOf(next.f10172e.contains("ignore")));
                                                    jSONObjectOptJSONObject.put(fl.SESSION_HISTORY_KEY_AD_ID, 2010);
                                                } else {
                                                    crashType = crashType2;
                                                    if (fVar != null && !fVar.a(jSONObjectOptJSONObject2.optString("crash_md5", "default"))) {
                                                        com.apm.insight.l.f.a(next.f10169a);
                                                    }
                                                    it2 = it;
                                                }
                                                com.apm.insight.entity.b.a(jSONObjectB, jSONArray, new com.apm.insight.entity.b.a() { // from class: com.apm.insight.k.b.3
                                                    @Override // com.apm.insight.entity.b.a
                                                    public final void a(JSONObject jSONObject) {
                                                        e.a(bVarA.a(), jSONObject.toString(), new File(file, "logZip"), com.apm.insight.l.j.a(b.this.f10156a, c0021b.f10173a));
                                                    }
                                                });
                                                if (!com.apm.insight.l.f.a(file)) {
                                                    com.apm.insight.e.a.a().a(com.apm.insight.d.a.b(file.getAbsolutePath()));
                                                }
                                                c.a(crashType, jSONObjectB);
                                            } catch (Throwable th4) {
                                                th = th4;
                                                com.apm.insight.c.a();
                                                com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                                                com.apm.insight.l.f.a(next.f10169a);
                                            }
                                            com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, "filters", "start_uuid", c0021b.f10173a);
                                            com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, "filters", "leak_threads_count", String.valueOf(c0021b.g));
                                            com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, "filters", "crash_thread_name", jSONObjectOptJSONObject2.optString("crash_thread_name", "unknown"));
                                        } catch (Throwable unused) {
                                            it = it2;
                                        }
                                        it2 = it;
                                    }
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        it = it2;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    it = it2;
                }
            }
        }
    }

    private static boolean a(File file) {
        String[] list = file.list();
        if (list == null) {
            return false;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str) && str.endsWith("")) {
                return true;
            }
        }
        return false;
    }

    private com.apm.insight.f.b a(File file, CrashType crashType, String str, long j, long j2) {
        com.apm.insight.f.b bVar = null;
        try {
            try {
                if (file.isFile()) {
                    com.apm.insight.l.f.a(file);
                    return null;
                }
                boolean z2 = crashType == CrashType.LAUNCH;
                if (crashType == null) {
                    try {
                        return com.apm.insight.l.f.b(new File(file, file.getName()).getAbsolutePath());
                    } catch (Throwable th) {
                        th = th;
                        com.apm.insight.l.f.a(file);
                        com.apm.insight.c.a();
                        com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                        return bVar;
                    }
                }
                com.apm.insight.f.b bVarA = com.apm.insight.l.f.a(file, crashType);
                try {
                    JSONObject jSONObjectB = bVarA.b();
                    try {
                        if (bVarA.b() != null) {
                            if (crashType == CrashType.ANR) {
                                return bVarA;
                            }
                            jSONObjectB.put("crash_time", j);
                            boolean z3 = z2;
                            jSONObjectB.put("app_start_time", j2);
                            JSONObject jSONObjectOptJSONObject = jSONObjectB.optJSONObject(com.smartdigimkt.x.g.f39716B);
                            if (jSONObjectOptJSONObject == null) {
                                jSONObjectOptJSONObject = Header.a(j).f();
                            } else if (z3) {
                                jSONObjectB.remove(com.smartdigimkt.x.g.f39716B);
                            }
                            String strOptString = jSONObjectOptJSONObject.optString("sdk_version_name", null);
                            if (strOptString == null) {
                                strOptString = "2008-20250701130429";
                            }
                            com.apm.insight.entity.a.a(jSONObjectB, "filters", com.smartdigimkt.b0.a.s1, strOptString);
                            JSONArray jSONArrayOptJSONArray = jSONObjectB.optJSONArray("logcat");
                            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                                jSONObjectB.put("logcat", com.apm.insight.runtime.h.a(str));
                            }
                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "has_dump", com.p004ironsource.mediationsdk.metadata.a.g);
                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "has_logcat", String.valueOf(!com.apm.insight.a.a(jSONObjectB, "logcat")));
                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "memory_leak", String.valueOf(com.apm.insight.entity.a.a(str)));
                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "fd_leak", String.valueOf(com.apm.insight.entity.a.b(str)));
                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "threads_leak", String.valueOf(com.apm.insight.entity.a.c(str)));
                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "is_64_devices", String.valueOf(Header.a()));
                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "is_64_runtime", String.valueOf(NativeImpl.f()));
                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "is_x86_devices", String.valueOf(Header.b()));
                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "has_meminfo_file", String.valueOf(com.apm.insight.l.j.d(str).exists()));
                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "is_root", String.valueOf(com.apm.insight.nativecrash.a.k()));
                            jSONObjectB.put("launch_did", com.apm.insight.i.a.a(this.f10156a));
                            jSONObjectB.put("crash_uuid", file.getName());
                            try {
                                long j3 = Long.parseLong(com.apm.insight.runtime.b.a(j, str));
                                com.apm.insight.entity.a.a(jSONObjectB, "filters", "lastAliveTime", Math.abs(j3 - j) < ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS ? "< 60s" : "> 60s");
                                jSONObjectB.put("lastAliveTime", String.valueOf(j3));
                            } catch (Throwable unused) {
                                jSONObjectB.put("lastAliveTime", "unknown");
                                com.apm.insight.entity.a.a(jSONObjectB, "filters", "lastAliveTime", "unknown");
                            }
                            jSONObjectB.put("has_dump", com.p004ironsource.mediationsdk.metadata.a.g);
                            if (jSONObjectB.opt(d9.a.k) == null) {
                                com.apm.insight.e.g();
                                com.apm.insight.entity.a.a(jSONObjectB, n.a());
                            }
                            if (Header.b(jSONObjectOptJSONObject)) {
                                com.apm.insight.entity.a.a(jSONObjectB, "filters", "unauthentic_version", "unauthentic_version");
                            }
                            com.apm.insight.entity.d.b(jSONObjectB);
                            bVarA.b().put("upload_scene", "launch_scan");
                            if (z3) {
                                JSONObject jSONObject = new JSONObject();
                                jSONObjectB.put(com.thinkup.core.common.oo.o.C0684o.m, "start_crash");
                                jSONObjectB.put("stack", jSONObjectB.remove("data"));
                                jSONObject.put("data", new JSONArray().put(jSONObjectB));
                                jSONObject.put(com.smartdigimkt.x.g.f39716B, jSONObjectOptJSONObject);
                                bVarA.a(jSONObject);
                                return bVarA;
                            }
                            jSONObjectB.put("isJava", 1);
                            return bVarA;
                        }
                        com.apm.insight.l.f.a(file);
                        return bVarA;
                    } catch (Throwable th2) {
                        th = th2;
                        bVar = bVarA;
                        com.apm.insight.l.f.a(file);
                        com.apm.insight.c.a();
                        com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                        return bVar;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        com.apm.insight.l.f.a(file);
        com.apm.insight.c.a();
        com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
        return bVar;
    }
}
