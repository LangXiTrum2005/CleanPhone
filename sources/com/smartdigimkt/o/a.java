package com.smartdigimkt.o;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.smartdigimkt.f1.q;
import com.smartdigimkt.v0.u;
import com.smartdigimkt.v0.y;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private static final int m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f37231n = "Smartdigimkt SDK M";
    public static boolean o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static Map<String, Long> f37232p = new HashMap();
    public static Set<String> q = new HashSet();
    public static final String r = "2";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f37233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f37234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.smartdigimkt.v.c f37235c;
    private Context d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f37236e;
    private com.smartdigimkt.f1.f f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.smartdigimkt.n1.a f37237h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f37238i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f37239l;
    private q.c g = null;
    private boolean j = false;
    private boolean k = true;

    /* JADX INFO: renamed from: com.smartdigimkt.o.a$a, reason: collision with other inner class name */
    public class C0555a implements e {
        @Override // com.smartdigimkt.o.e
        public void a(int i2, Object obj) {
        }

        @Override // com.smartdigimkt.o.e
        public void b(Object obj) {
        }

        @Override // com.smartdigimkt.o.e
        public void c(Object obj) {
        }

        @Override // com.smartdigimkt.o.e
        public void a(Object obj) {
        }

        @Override // com.smartdigimkt.o.e
        public void a(Object obj, String str) {
        }
    }

    public class b implements Runnable {
        final /* synthetic */ boolean X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.f1.k f37240Y;

        public b(boolean z2, com.smartdigimkt.f1.k kVar) {
            this.X = z2;
            this.f37240Y = kVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.X && !a.o && com.smartdigimkt.b.b.f33811p) {
                a.this.b();
            }
            if (a.this.g == null || a.o || !com.smartdigimkt.b.b.f33811p) {
                return;
            }
            a.this.g.c(this.f37240Y);
        }
    }

    public a(Context context, String str) {
        this.f37235c = null;
        this.d = null;
        com.smartdigimkt.n1.a aVarC = com.smartdigimkt.n1.b.b().c(str);
        this.f37237h = aVarC;
        if (aVarC == null) {
            this.f37237h = com.smartdigimkt.n1.b.b().a();
        }
        this.f37238i = this.f37237h.v1();
        Context applicationContext = context.getApplicationContext();
        this.d = applicationContext;
        this.f37233a = str;
        if (this.f37235c == null) {
            this.f37235c = com.smartdigimkt.v.c.a(applicationContext);
        }
    }

    public static void b(com.smartdigimkt.x.d dVar, Context context, String str) {
    }

    private void c(com.smartdigimkt.x.d dVar) {
    }

    private int e() {
        try {
            com.smartdigimkt.n1.a aVar = this.f37237h;
            if (aVar != null) {
                return aVar.p0();
            }
            return 1;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 1;
        }
    }

    public void a(com.smartdigimkt.x.d dVar) {
    }

    public boolean d(com.smartdigimkt.x.d dVar) {
        return false;
    }

    public boolean f() {
        return this.k;
    }

    public void g() {
        try {
            this.g = null;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void a(com.smartdigimkt.x.d dVar, Context context, String str) {
    }

    public com.smartdigimkt.f1.f c() {
        return this.f;
    }

    public com.smartdigimkt.v.c d() {
        return this.f37235c;
    }

    public boolean b(com.smartdigimkt.x.d dVar) {
        Long l2;
        if (dVar == null) {
            return true;
        }
        try {
            if (2 != dVar.e1() && 3 != dVar.e1()) {
                return true;
            }
            String strJ = dVar.j();
            Map<String, Long> map = f37232p;
            if (map == null) {
                return true;
            }
            if (map.containsKey(strJ) && (l2 = f37232p.get(strJ)) != null) {
                if (l2.longValue() > System.currentTimeMillis() || q.contains(dVar.j())) {
                    return false;
                }
            }
            f37232p.put(dVar.j(), Long.valueOf(System.currentTimeMillis() + ((long) (dVar.o0() * 1000))));
            return true;
        } catch (Exception e2) {
            if (!com.smartdigimkt.b.b.f33800a) {
                return true;
            }
            e2.printStackTrace();
            return true;
        }
    }

    public void a(String str) {
        this.f37233a = str;
    }

    public void a(q.c cVar) {
        this.g = cVar;
    }

    public void a(boolean z2) {
        this.k = z2;
    }

    public void a(com.smartdigimkt.f1.f fVar) {
        this.f = fVar;
    }

    public void a(com.smartdigimkt.x.d dVar, q.b bVar) {
        if (bVar != null && dVar != null) {
            bVar.a(dVar);
        }
        a(dVar);
    }

    public void a() {
        c cVar = this.f37236e;
        if (cVar == null || !cVar.g()) {
            return;
        }
        this.f37236e.f();
    }

    private void a(com.smartdigimkt.x.d dVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a(this.d, dVar, this.f37233a, str, true, false, com.smartdigimkt.q.a.r);
    }

    public static void a(Context context, com.smartdigimkt.x.d dVar, String str, String str2, boolean z2, boolean z3) {
        if (context == null) {
            return;
        }
        new c(context.getApplicationContext()).a(str, dVar, null, str2, z2, z3, com.smartdigimkt.q.a.o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        try {
            Intent intent = new Intent();
            intent.setAction("ExitApp");
            com.smartdigimkt.s6.b.a(this.d).a(intent);
        } catch (Exception unused) {
        }
    }

    public static void a(Context context, com.smartdigimkt.x.d dVar, String str, String str2, boolean z2, boolean z3, int i2) {
        if (context == null) {
            return;
        }
        new c(context.getApplicationContext()).a(str, dVar, null, str2, z2, z3, i2);
    }

    private static String a(int i2) {
        if (i2 == 1) {
            return com.smartdigimkt.q0.c.f37812n;
        }
        if (i2 == 2) {
            return com.smartdigimkt.q0.c.o;
        }
        if (i2 == 3) {
            return com.smartdigimkt.q0.c.q;
        }
        if (i2 != 4) {
            return "";
        }
        return com.smartdigimkt.q0.c.f37813p;
    }

    public static void a(Context context, com.smartdigimkt.x.d dVar, String str, String[] strArr, boolean z2, boolean z3) {
        if (context == null || dVar == null || TextUtils.isEmpty(str) || strArr == null) {
            return;
        }
        c cVar = new c(context.getApplicationContext());
        for (String str2 : strArr) {
            cVar.a(str, dVar, new C0555a(), str2, z2, z3, com.smartdigimkt.q.a.o);
        }
    }

    private void a(boolean z2, com.smartdigimkt.f1.k kVar) {
        new Handler(Looper.getMainLooper()).post(new b(z2, kVar));
    }

    public void a(com.smartdigimkt.p.b bVar, com.smartdigimkt.x.d dVar, int i2, boolean z2) {
        if (dVar == null || bVar == null) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f37234b;
            com.smartdigimkt.x.g gVar = new com.smartdigimkt.x.g();
            gVar.i(dVar.O1());
            gVar.a(i2);
            gVar.c(jCurrentTimeMillis + "");
            gVar.a(dVar.j());
            gVar.h(bVar.i());
            if (!TextUtils.isEmpty(bVar.j())) {
                gVar.g(URLEncoder.encode(bVar.j(), "utf-8"));
            }
            gVar.b((this.f37234b / 1000) + "");
            gVar.d(Integer.parseInt(dVar.d1()));
            gVar.e(dVar.e1());
            gVar.j(this.f37233a);
            gVar.h(bVar.i());
            if (!TextUtils.isEmpty(bVar.j())) {
                gVar.g(URLEncoder.encode(bVar.j(), "utf-8"));
            }
            if (this.f37238i) {
                gVar.b(bVar.h());
                if (!TextUtils.isEmpty(bVar.e())) {
                    gVar.f(URLEncoder.encode(bVar.e(), "utf-8"));
                }
                if (!TextUtils.isEmpty(bVar.c())) {
                    gVar.d(URLEncoder.encode(bVar.c(), "UTF-8"));
                }
                if (!TextUtils.isEmpty(bVar.d())) {
                    gVar.e(URLEncoder.encode(bVar.d(), "utf-8"));
                }
            }
            if (z2) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(gVar);
            y.b(com.smartdigimkt.x.g.a(arrayList));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private boolean a(int i2, String str) {
        try {
            if (i2 == 2) {
                return u.a.b(str);
            }
            return !TextUtils.isEmpty(str);
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }
}
