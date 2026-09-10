package com.smartdigimkt.o;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.smartdigimkt.v0.u;
import java.net.URI;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes.dex */
public class m extends d implements com.smartdigimkt.s0.a.InterfaceC0579a {
    public static final int r = 1;
    public static final int s = 2;
    private static final String t = "302";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private e f37275i;
    private com.smartdigimkt.p.b j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f37276l;
    private Context m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.smartdigimkt.s0.c f37277n;
    private com.smartdigimkt.p.a o;
    private boolean q;
    private boolean k = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Handler f37278p = new Handler(Looper.getMainLooper());

    public class a implements h {
        public a() {
        }

        @Override // com.smartdigimkt.o.h
        public void a(com.smartdigimkt.p.b bVar) {
            m.this.j = bVar;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (m.this.f37275i != null) {
                if (m.this.j.l()) {
                    m.this.f37275i.a(m.this.j);
                } else {
                    m.this.f37275i.a(m.this.j, m.this.j.f());
                }
            }
        }
    }

    public class c extends com.smartdigimkt.s0.a {
        private static final int p0 = 10;
        private final Context f0;
        private String g0;
        private String h0;
        private String i0;
        private com.smartdigimkt.x.d j0;
        private boolean k0;
        private boolean l0;
        private int m0;
        private final Semaphore e0 = new Semaphore(0);
        private l.f n0 = new a();

        public c(Context context, String str, String str2, String str3, com.smartdigimkt.x.d dVar, boolean z2, boolean z3, int i2) {
            this.f0 = context;
            this.g0 = str;
            this.h0 = str2;
            this.i0 = str3;
            this.j0 = dVar;
            this.k0 = z2;
            this.l0 = z3;
            this.m0 = i2;
        }

        private boolean b(int i2) {
            return i2 == 301 || i2 == 302 || i2 == 307;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean d(String str) {
            return n.a(str, this.j0, m.this.j);
        }

        private void g() {
            this.e0.acquireUninterruptibly();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h() {
            this.e0.release();
        }

        @Override // com.smartdigimkt.s0.a
        public void a(boolean z2) {
        }

        @Override // com.smartdigimkt.s0.a
        public void c() {
        }

        @Override // com.smartdigimkt.s0.a
        public void f() {
            if (m.this.f37275i != null) {
                m.this.f37275i.b(null);
            }
            m.this.j = new com.smartdigimkt.p.b();
            m.this.j.g(this.g0);
            m.this.j = a(this.g0, this.k0, this.l0, this.j0, this.m0);
            if (!TextUtils.isEmpty(m.this.j.d())) {
                m.this.j.b(true);
            }
            if (m.this.k && m.this.j.l()) {
                if (m.this.o != null) {
                    m.this.j.b(m.this.o.f);
                }
                n.a(this.j0, m.this.j, m.this.o, this.h0, this.i0, this.f0, this.n0, this.e0);
            }
        }

        public class a implements l.f {
            public a() {
            }

            @Override // com.smartdigimkt.o.l.f
            public boolean a(String str) {
                boolean zD = c.this.d(str);
                if (zD) {
                    a();
                }
                return zD;
            }

            @Override // com.smartdigimkt.o.l.f
            public boolean b(String str) {
                return false;
            }

            @Override // com.smartdigimkt.o.l.f
            public boolean c(String str) {
                boolean zD = c.this.d(str);
                if (zD) {
                    a();
                }
                return zD;
            }

            @Override // com.smartdigimkt.o.l.f
            public void a(String str, boolean z2, String str2) {
                c.this.d(str);
                m.this.j.b(str2);
                a();
            }

            @Override // com.smartdigimkt.o.l.f
            public void a(int i2, String str, String str2, String str3) {
                if (!TextUtils.isEmpty(str2)) {
                    m.this.j.c(str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    m.this.j.b(str3);
                }
                c.this.d(str);
                a();
            }

            private void a() {
                synchronized (m.this) {
                    m.this.j.b(true);
                    c.this.h();
                }
            }
        }

        private boolean a(int i2) {
            return i2 == 200;
        }

        private boolean b(String str) {
            return !URLUtil.isNetworkUrl(str);
        }

        private boolean c(String str) {
            return str.startsWith("/");
        }

        private com.smartdigimkt.p.b a(String str, boolean z2, boolean z3, com.smartdigimkt.x.d dVar, int i2) {
            String scheme;
            String str2;
            String scheme2 = "";
            if (m.this.f37276l) {
                String strA = com.smartdigimkt.n1.a.a(this.f0, str);
                if (!TextUtils.isEmpty(strA)) {
                    str = android.support.v4.media.a.m(str, strA);
                }
            }
            com.smartdigimkt.p.b bVar = new com.smartdigimkt.p.b();
            f fVar = new f();
            try {
                if (b(str)) {
                    str2 = "";
                } else {
                    URI uriCreate = URI.create(str);
                    scheme = uriCreate.getScheme();
                    try {
                        scheme2 = uriCreate.getHost();
                    } catch (Exception e2) {
                        e = e2;
                        e.printStackTrace();
                    }
                    str2 = scheme2;
                    scheme2 = scheme;
                }
            } catch (Exception e3) {
                e = e3;
                scheme = "";
            }
            String strM = str;
            String host = str2;
            for (int i3 = 0; i3 < 10; i3++) {
                if (!m.this.k) {
                    return null;
                }
                m.this.o = fVar.a(strM, z2, z3, dVar);
                if (m.this.o != null) {
                    if (!TextUtils.isEmpty(m.this.o.f37478h)) {
                        bVar.g(strM);
                        bVar.c(m.this.o.f37478h);
                        bVar.c(1);
                        bVar.d(m.this.o.a());
                        bVar.b(false);
                        if (i3 != 0) {
                            break;
                        }
                        com.smartdigimkt.q.a.b().a(strM, m.this.o.f37478h, dVar, this.i0, z2, z3, i2);
                        break;
                    }
                    bVar.b(true);
                    if (!b(m.this.o.f)) {
                        if (a(m.this.o.f)) {
                            bVar.c(true);
                            bVar.g(strM);
                            bVar.b(m.this.o.g);
                            break;
                        }
                        bVar.c(false);
                        bVar.g(strM);
                        if (i3 != 0) {
                            break;
                        }
                        com.smartdigimkt.q.a.b().a(strM, "error code:" + m.this.o.f, dVar, this.i0, z2, z3, i2);
                        break;
                    }
                    bVar.a(true);
                    if (!TextUtils.isEmpty(m.this.o.f37474a)) {
                        strM = m.this.o.f37474a;
                        if (b(strM)) {
                            if (c(strM) && !TextUtils.isEmpty(scheme2) && !TextUtils.isEmpty(host)) {
                                strM = androidx.media3.extractor.text.ttml.a.n(scheme2, "://", host, strM);
                                host = null;
                                scheme2 = null;
                            } else {
                                bVar.c(true);
                                bVar.g(strM);
                                break;
                            }
                        } else if (!b(strM)) {
                            try {
                                URI uriCreate2 = URI.create(strM);
                                scheme2 = uriCreate2.getScheme();
                                host = uriCreate2.getHost();
                            } catch (Exception e4) {
                                e4.printStackTrace();
                            }
                        }
                        if (!a(strM)) {
                            if (m.this.f37276l) {
                                String strA2 = com.smartdigimkt.n1.a.a(this.f0, strM);
                                if (!TextUtils.isEmpty(strA2)) {
                                    strM = android.support.v4.media.a.m(strM, strA2);
                                }
                            }
                        } else {
                            bVar.c(true);
                            bVar.g(strM);
                            break;
                        }
                    } else {
                        bVar.c(true);
                        bVar.g(strM);
                        break;
                    }
                } else {
                    bVar.g(strM);
                    bVar.b(false);
                    bVar.e("request url is invalided");
                    break;
                }
            }
            return bVar;
        }

        private boolean a(String str) {
            return u.a.b(str);
        }
    }

    public m(Context context) {
        this.m = context;
        this.f37277n = new com.smartdigimkt.s0.c(context, 2);
    }

    @Override // com.smartdigimkt.o.d
    public void f() {
        this.k = false;
    }

    public boolean g() {
        return this.k;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void a(String str, e eVar, boolean z2, String str2, String str3, com.smartdigimkt.x.d dVar, boolean z3, boolean z4, int i2) {
        com.smartdigimkt.s0.a cVar;
        this.f37275i = eVar;
        this.f37276l = z2;
        com.smartdigimkt.p.c cVar2 = new com.smartdigimkt.p.c();
        cVar2.a(this.m);
        cVar2.c(str);
        cVar2.b(z2);
        cVar2.a(str2);
        cVar2.b(str3);
        cVar2.a(dVar);
        cVar2.a(z3);
        cVar2.c(z4);
        cVar2.a(i2);
        if (str.startsWith("tcp")) {
            i iVar = new i(cVar2);
            iVar.a(this.f37275i);
            iVar.a(new a());
            cVar = iVar;
        } else {
            cVar = new c(this.m, str, str2, str3, dVar, z3, z4, i2);
        }
        this.f37277n.b(cVar, this);
    }

    @Override // com.smartdigimkt.s0.a.InterfaceC0579a
    public void a(com.smartdigimkt.s0.a.b bVar) {
        if (bVar == com.smartdigimkt.s0.a.b.FINISH && this.k) {
            this.f37278p.post(new b());
        }
    }
}
