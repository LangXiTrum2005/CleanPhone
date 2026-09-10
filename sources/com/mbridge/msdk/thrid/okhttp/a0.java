package com.mbridge.msdk.thrid.okhttp;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final y f36115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final w f36116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f36117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final String f36118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final q f36119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final r f36120f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final b0 f36121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final a0 f36122h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final a0 f36123i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final a0 f36124j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final long f36125k;
    final long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile c f36126m;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        y f36127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        w f36128b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f36129c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f36130d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        q f36131e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        r.a f36132f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        b0 f36133g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        a0 f36134h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        a0 f36135i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        a0 f36136j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        long f36137k;
        long l;

        public a() {
            this.f36129c = -1;
            this.f36132f = new r.a();
        }

        public a a(y yVar) {
            this.f36127a = yVar;
            return this;
        }

        public a b(String str, String str2) {
            this.f36132f.c(str, str2);
            return this;
        }

        public a c(a0 a0Var) {
            if (a0Var != null) {
                a("networkResponse", a0Var);
            }
            this.f36134h = a0Var;
            return this;
        }

        public a d(a0 a0Var) {
            if (a0Var != null) {
                b(a0Var);
            }
            this.f36136j = a0Var;
            return this;
        }

        private void b(a0 a0Var) {
            if (a0Var.f36121g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        public a a(w wVar) {
            this.f36128b = wVar;
            return this;
        }

        public a a(int i10) {
            this.f36129c = i10;
            return this;
        }

        public a(a0 a0Var) {
            this.f36129c = -1;
            this.f36127a = a0Var.f36115a;
            this.f36128b = a0Var.f36116b;
            this.f36129c = a0Var.f36117c;
            this.f36130d = a0Var.f36118d;
            this.f36131e = a0Var.f36119e;
            this.f36132f = a0Var.f36120f.a();
            this.f36133g = a0Var.f36121g;
            this.f36134h = a0Var.f36122h;
            this.f36135i = a0Var.f36123i;
            this.f36136j = a0Var.f36124j;
            this.f36137k = a0Var.f36125k;
            this.l = a0Var.l;
        }

        public a a(String str) {
            this.f36130d = str;
            return this;
        }

        public a b(long j10) {
            this.f36137k = j10;
            return this;
        }

        public a a(q qVar) {
            this.f36131e = qVar;
            return this;
        }

        public a a(String str, String str2) {
            this.f36132f.a(str, str2);
            return this;
        }

        public a a(r rVar) {
            this.f36132f = rVar.a();
            return this;
        }

        public a a(b0 b0Var) {
            this.f36133g = b0Var;
            return this;
        }

        public a a(a0 a0Var) {
            if (a0Var != null) {
                a("cacheResponse", a0Var);
            }
            this.f36135i = a0Var;
            return this;
        }

        private void a(String str, a0 a0Var) {
            if (a0Var.f36121g == null) {
                if (a0Var.f36122h == null) {
                    if (a0Var.f36123i == null) {
                        if (a0Var.f36124j != null) {
                            throw new IllegalArgumentException(wi.d.h(str, ".priorResponse != null"));
                        }
                        return;
                    }
                    throw new IllegalArgumentException(wi.d.h(str, ".cacheResponse != null"));
                }
                throw new IllegalArgumentException(wi.d.h(str, ".networkResponse != null"));
            }
            throw new IllegalArgumentException(wi.d.h(str, ".body != null"));
        }

        public a a(long j10) {
            this.l = j10;
            return this;
        }

        public a0 a() {
            if (this.f36127a != null) {
                if (this.f36128b != null) {
                    if (this.f36129c >= 0) {
                        if (this.f36130d != null) {
                            return new a0(this);
                        }
                        throw new IllegalStateException("message == null");
                    }
                    throw new IllegalStateException("code < 0: " + this.f36129c);
                }
                throw new IllegalStateException("protocol == null");
            }
            throw new IllegalStateException("request == null");
        }
    }

    public a0(a aVar) {
        this.f36115a = aVar.f36127a;
        this.f36116b = aVar.f36128b;
        this.f36117c = aVar.f36129c;
        this.f36118d = aVar.f36130d;
        this.f36119e = aVar.f36131e;
        this.f36120f = aVar.f36132f.a();
        this.f36121g = aVar.f36133g;
        this.f36122h = aVar.f36134h;
        this.f36123i = aVar.f36135i;
        this.f36124j = aVar.f36136j;
        this.f36125k = aVar.f36137k;
        this.l = aVar.l;
    }

    public String a(String str, String str2) {
        String strB = this.f36120f.b(str);
        return strB != null ? strB : str2;
    }

    public String b(String str) {
        return a(str, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b0 b0Var = this.f36121g;
        if (b0Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        b0Var.close();
    }

    public b0 d() {
        return this.f36121g;
    }

    public c h() {
        c cVar = this.f36126m;
        if (cVar != null) {
            return cVar;
        }
        c cVarA = c.a(this.f36120f);
        this.f36126m = cVarA;
        return cVarA;
    }

    public int k() {
        return this.f36117c;
    }

    public q l() {
        return this.f36119e;
    }

    public r m() {
        return this.f36120f;
    }

    public boolean n() {
        int i10 = this.f36117c;
        return i10 >= 200 && i10 < 300;
    }

    public String o() {
        return this.f36118d;
    }

    public a p() {
        return new a(this);
    }

    public a0 q() {
        return this.f36124j;
    }

    public long r() {
        return this.l;
    }

    public y s() {
        return this.f36115a;
    }

    public long t() {
        return this.f36125k;
    }

    public String toString() {
        return "Response{protocol=" + this.f36116b + ", code=" + this.f36117c + ", message=" + this.f36118d + ", url=" + this.f36115a.g() + '}';
    }
}
