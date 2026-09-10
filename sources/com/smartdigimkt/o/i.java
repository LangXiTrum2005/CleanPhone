package com.smartdigimkt.o;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.smartdigimkt.v0.u;
import java.net.URI;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes.dex */
public class i extends com.smartdigimkt.s0.a {
    public static final int t0 = 1;
    public static final int u0 = 2;
    public static final int v0 = 3;
    private static final String w0 = "SocketRequestTask";
    private static final int x0 = 10;
    private Context f0;
    private String g0;
    private String h0;
    private String i0;
    private com.smartdigimkt.x.d j0;
    private boolean k0;
    private boolean l0;
    private int m0;
    private boolean n0;
    private com.smartdigimkt.p.a o0;
    private com.smartdigimkt.p.b p0;
    private e q0;
    private h r0;
    private final Semaphore e0 = new Semaphore(0);
    private final l.f s0 = new a();

    public i(com.smartdigimkt.p.c cVar) {
        this.f0 = cVar.c();
        this.g0 = cVar.e();
        this.h0 = cVar.b();
        this.i0 = cVar.d();
        this.j0 = cVar.a();
        this.k0 = cVar.g();
        this.l0 = cVar.i();
        this.m0 = cVar.f();
        this.n0 = cVar.h();
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
        e eVar = this.q0;
        if (eVar != null) {
            eVar.b(null);
        }
        com.smartdigimkt.p.b bVar = new com.smartdigimkt.p.b();
        this.p0 = bVar;
        bVar.g(this.g0);
        com.smartdigimkt.p.b bVarC = c(this.g0);
        this.p0 = bVarC;
        if (bVarC != null && !TextUtils.isEmpty(bVarC.d())) {
            this.p0.b(true);
        }
        if (this.X != com.smartdigimkt.s0.a.b.RUNNING) {
            h hVar = this.r0;
            if (hVar != null) {
                hVar.a(this.p0);
                return;
            }
            return;
        }
        if (this.p0.l()) {
            com.smartdigimkt.p.a aVar = this.o0;
            if (aVar != null) {
                this.p0.b(aVar.f);
            }
            j.a(this.j0, this.p0, this.o0, this.h0, this.i0, this.f0, this.s0, this.r0, this.e0);
            return;
        }
        h hVar2 = this.r0;
        if (hVar2 != null) {
            hVar2.a(this.p0);
        }
    }

    public class a implements l.f {
        public a() {
        }

        @Override // com.smartdigimkt.o.l.f
        public boolean a(String str) {
            boolean zB = i.this.b(str);
            if (zB) {
                a();
            }
            return zB;
        }

        @Override // com.smartdigimkt.o.l.f
        public boolean b(String str) {
            return false;
        }

        @Override // com.smartdigimkt.o.l.f
        public boolean c(String str) {
            boolean zB = i.this.b(str);
            if (zB) {
                a();
            }
            return zB;
        }

        @Override // com.smartdigimkt.o.l.f
        public void a(String str, boolean z2, String str2) {
            i.this.b(str);
            i.this.p0.b(str2);
            a();
        }

        private void a() {
            synchronized (this) {
                try {
                    i.this.p0.b(true);
                    if (i.this.r0 != null) {
                        i.this.r0.a(i.this.p0);
                    }
                    i.this.h();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.smartdigimkt.o.l.f
        public void a(int i2, String str, String str2, String str3) {
            if (!TextUtils.isEmpty(str2)) {
                i.this.p0.c(str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                i.this.p0.b(str3);
            }
            i.this.b(str);
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str) {
        return j.a(str, this.j0, this.p0);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x014b A[LOOP:0: B:15:0x0038->B:65:0x014b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x0144 A[SYNTHETIC] */
    private com.smartdigimkt.p.b c(String str) {
        String scheme;
        String str2;
        int i2;
        String strA = a(str);
        com.smartdigimkt.p.b bVar = new com.smartdigimkt.p.b();
        k kVar = new k();
        f fVar = new f();
        String host = "";
        try {
            if (!URLUtil.isNetworkUrl(strA)) {
                str2 = "";
            } else {
                URI uriCreate = URI.create(strA);
                scheme = uriCreate.getScheme();
                try {
                    host = uriCreate.getHost();
                } catch (Exception e2) {
                    e = e2;
                    e.getMessage();
                }
                str2 = host;
                host = scheme;
            }
        } catch (Exception e3) {
            e = e3;
            scheme = "";
        }
        String strA2 = strA;
        for (int i3 = 0; i3 < 10; i3++) {
            if (this.X != com.smartdigimkt.s0.a.b.RUNNING) {
                return null;
            }
            if (strA2.startsWith("tcp")) {
                this.o0 = kVar.a(strA2, this.j0, this.k0, this.l0);
                i2 = 3;
            } else {
                this.o0 = fVar.a(strA2, this.k0, this.l0, this.j0);
                i2 = 1;
            }
            com.smartdigimkt.p.a aVar = this.o0;
            if (aVar == null) {
                bVar.g(strA2);
                bVar.b(false);
                break;
            }
            if (!TextUtils.isEmpty(aVar.f37478h)) {
                bVar.g(strA2);
                bVar.c(this.o0.f37478h);
                bVar.c(i2);
                bVar.d(this.o0.a());
                bVar.b(false);
                if (i3 != 0) {
                    break;
                }
                com.smartdigimkt.q.a.b().a(strA2, this.o0.f37478h, this.j0, this.i0, this.k0, this.l0, this.m0);
                break;
            }
            int i4 = this.o0.f;
            if (i4 == 200) {
                bVar.c(true);
                bVar.g(strA2);
                bVar.b(true);
                String str3 = this.o0.g;
                bVar.b(str3 != null ? str3 : null);
                break;
            }
            if (i4 != 301 && i4 != 302 && i4 != 307) {
                bVar.c(false);
                bVar.g(strA2);
                if (i3 != 0) {
                    break;
                }
                com.smartdigimkt.q.a.b().a(strA2, this.o0.f37478h, this.j0, this.i0, this.k0, this.l0, this.m0);
                break;
            }
            bVar.b(true);
            bVar.a(true);
            if (TextUtils.isEmpty(this.o0.f37474a)) {
                bVar.c(true);
                bVar.g(strA2);
                break;
            }
            String strN = this.o0.f37474a;
            if (!strN.startsWith("http")) {
                if (strN.startsWith("/") && !TextUtils.isEmpty(host) && !TextUtils.isEmpty(str2)) {
                    strN = androidx.media3.extractor.text.ttml.a.n(host, "://", str2, strN);
                    str2 = null;
                    host = null;
                    if (u.a.b(strN)) {
                        bVar.c(true);
                        bVar.g(strN);
                        break;
                    }
                    strA2 = a(strN);
                } else {
                    bVar.c(true);
                    bVar.g(strN);
                    break;
                }
            } else {
                if (u.a.b(strN)) {
                    bVar.c(true);
                    bVar.g(strN);
                    break;
                }
                strA2 = a(strN);
            }
        }
        return bVar;
    }

    public void a(e eVar) {
        this.q0 = eVar;
    }

    public void a(h hVar) {
        this.r0 = hVar;
    }

    private String a(String str) {
        if (!this.n0) {
            return str;
        }
        String strA = com.smartdigimkt.n1.a.a(this.f0, str);
        return !TextUtils.isEmpty(strA) ? android.support.v4.media.a.m(str, strA) : str;
    }
}
