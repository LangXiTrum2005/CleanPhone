package com.smartdigimkt.c3;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Patterns;
import android.webkit.URLUtil;
import com.smartdigimkt.v0.x;
import com.smartdigimkt.v0.y;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class i {
    private static final String f = "H5DownLoadManager";
    public static final String g = "ending_page_source";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f34111h = "ending_page_save_time";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile i f34112i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<String> f34113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConcurrentMap<String, com.smartdigimkt.c3.d> f34114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n f34115c;
    private j d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f34116e = false;

    public class a extends com.smartdigimkt.s0.a {
        final /* synthetic */ String e0;
        final /* synthetic */ b f0;

        /* JADX INFO: renamed from: com.smartdigimkt.c3.i$a$a, reason: collision with other inner class name */
        public class C0450a implements d {
            public C0450a() {
            }

            @Override // com.smartdigimkt.c3.i.d
            public void a() {
            }

            @Override // com.smartdigimkt.c3.i.d
            public void a(String str, String str2) {
                try {
                    i.this.f34113a.remove(str2);
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    if (i.this.d.a(str2, str)) {
                        b bVar = a.this.f0;
                        if (bVar != null) {
                            bVar.a(str2, "", false);
                            return;
                        }
                        return;
                    }
                    b bVar2 = a.this.f0;
                    if (bVar2 != null) {
                        bVar2.b(str2, "save file failed");
                    }
                } catch (Exception e2) {
                    if (com.smartdigimkt.b.b.f33800a) {
                        e2.printStackTrace();
                    }
                    b bVar3 = a.this.f0;
                    if (bVar3 != null) {
                        bVar3.b(str2, e2.getMessage());
                    }
                }
            }

            @Override // com.smartdigimkt.c3.i.d
            public void a(String str) {
                try {
                    i.this.f34113a.remove(a.this.e0);
                    a aVar = a.this;
                    b bVar = aVar.f0;
                    if (bVar != null) {
                        bVar.b(aVar.e0, str);
                    }
                } catch (Exception e2) {
                    if (com.smartdigimkt.b.b.f33800a) {
                        e2.printStackTrace();
                    }
                    a aVar2 = a.this;
                    b bVar2 = aVar2.f0;
                    if (bVar2 != null) {
                        bVar2.b(aVar2.e0, str);
                    }
                }
            }
        }

        public a(String str, b bVar) {
            this.e0 = str;
            this.f0 = bVar;
        }

        @Override // com.smartdigimkt.s0.a
        public void a(boolean z2) {
        }

        @Override // com.smartdigimkt.s0.a
        public void c() {
        }

        @Override // com.smartdigimkt.s0.a
        public void f() {
            if (TextUtils.isEmpty(i.this.d.a(this.e0))) {
                g.a(this.e0, i.this.d.c(this.e0), new C0450a());
                return;
            }
            i.this.f34113a.remove(this.e0);
            b bVar = this.f0;
            if (bVar != null) {
                bVar.a(this.e0, "", true);
            }
        }
    }

    public interface b {
        void a(String str, String str2, boolean z2);

        void b(String str, String str2);
    }

    public interface c extends b {
    }

    public interface d {
        void a();

        void a(String str);

        void a(String str, String str2);
    }

    public interface e extends b {
    }

    private i() {
        try {
            this.f34115c = n.b();
            this.d = j.b();
            this.f34113a = new CopyOnWriteArrayList<>();
            this.f34114b = new ConcurrentHashMap();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private void c(String str, b bVar) {
        try {
            if (this.f34113a.contains(str)) {
                return;
            }
            this.f34113a.add(str);
            h.a().a(new a(str, bVar));
        } catch (Throwable th) {
            if (com.smartdigimkt.b.b.f33800a) {
                th.printStackTrace();
            }
        }
    }

    private String d(String str) {
        j jVar = this.d;
        return jVar != null ? jVar.b(str) : str;
    }

    private long e(String str) {
        try {
            Object objB = x.b(com.smartdigimkt.u.a.f().d(), "ending_page_save_time" + str, 0L);
            if (objB != null && (objB instanceof Long)) {
                return ((Long) objB).longValue();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return 0L;
    }

    private void h(String str) {
        try {
            x.d(com.smartdigimkt.u.a.f().d(), "ending_page_save_time" + str, Long.valueOf(System.currentTimeMillis()));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public String f(String str) {
        n nVar = this.f34115c;
        if (nVar != null) {
            return nVar.a(str);
        }
        return null;
    }

    public String g(String str) {
        try {
            Object objB = x.b(com.smartdigimkt.u.a.f().d(), "ending_page_source" + str, "");
            if (objB == null || !(objB instanceof String)) {
                return null;
            }
            String str2 = (String) objB;
            if (y.b(str2)) {
                return str2;
            }
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static i a() {
        if (f34112i == null) {
            synchronized (i.class) {
                try {
                    if (f34112i == null) {
                        f34112i = new i();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f34112i;
    }

    private void b(String str, e eVar) {
        try {
            String strB = this.f34115c.b(str);
            try {
                if (!TextUtils.isEmpty(this.f34115c.a(str))) {
                    if (eVar != null) {
                        eVar.a(str, "", true);
                    }
                } else if (!this.f34114b.containsKey(strB)) {
                    com.smartdigimkt.c3.d dVar = new com.smartdigimkt.c3.d(this.f34114b, this.f34115c, eVar, str, strB);
                    this.f34114b.put(strB, dVar);
                    g.a(str, strB, dVar);
                } else {
                    com.smartdigimkt.c3.d dVar2 = this.f34114b.get(strB);
                    if (dVar2 != null) {
                        dVar2.a(eVar);
                    }
                }
            } catch (Exception e2) {
                e = e2;
                if (eVar != null) {
                    eVar.b(str, "downloadzip failed");
                }
                if (com.smartdigimkt.b.b.f33800a) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public String c(String str) {
        try {
            if (Patterns.WEB_URL.matcher(str).matches() || URLUtil.isValidUrl(str)) {
                Uri uri = Uri.parse(str);
                String path = uri.getPath();
                if (!TextUtils.isEmpty(path) && TextUtils.isEmpty(uri.getQueryParameter("urlDebug"))) {
                    if (path.toLowerCase().endsWith(".zip")) {
                        return f(str);
                    }
                    return d(str);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return str;
    }

    public void a(String str, e eVar) {
        b(str, eVar);
    }

    public void a(String str) {
        a(str, (b) null);
    }

    public void a(String str, b bVar) {
        c(str, bVar);
    }

    private void a(String str, String str2) {
        try {
            x.d(com.smartdigimkt.u.a.f().d(), "ending_page_source" + str2, str);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void b(String str) {
        b(str, (b) null);
    }

    public void b(String str, b bVar) {
        try {
            if (Patterns.WEB_URL.matcher(str).matches() || URLUtil.isValidUrl(str)) {
                String path = Uri.parse(str).getPath();
                if (!TextUtils.isEmpty(path)) {
                    if (path.toLowerCase().endsWith(".zip")) {
                        a(str, (e) bVar);
                        return;
                    } else {
                        a(str, bVar);
                        return;
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (bVar != null) {
            bVar.b(str, "The URL does not contain a path ");
        }
    }
}
