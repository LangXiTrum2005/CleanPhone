package com.smartdigimkt.j4;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class o extends com.smartdigimkt.j4.c implements n.e {
    public static final int p0 = 3;
    public static final int q0 = 6;
    public static final int r0 = -1;
    public static final int s0 = 1048576;
    private final Uri g0;
    private final com.smartdigimkt.n4.h.a h0;
    private final com.smartdigimkt.b4.h i0;
    private final int j0;
    private final String k0;
    private final int l0;
    private final Object m0;
    private long n0;
    private boolean o0;

    @Deprecated
    public interface b {
        void a(IOException iOException);
    }

    public static final class c extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f36007a;

        public c(b bVar) {
            this.f36007a = (b) com.smartdigimkt.p4.a.a(bVar);
        }

        @Override // com.smartdigimkt.j4.k, com.smartdigimkt.j4.t
        public void a(int i2, s.a aVar, t.b bVar, t.c cVar, IOException iOException, boolean z2) {
            this.f36007a.a(iOException);
        }
    }

    public static final class d implements com.smartdigimkt.k4.c.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.smartdigimkt.n4.h.a f36008a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.smartdigimkt.b4.h f36009b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f36010c;
        private Object d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f36011e = -1;
        private int f = 1048576;
        private boolean g;

        public d(com.smartdigimkt.n4.h.a aVar) {
            this.f36008a = aVar;
        }

        public d b(int i2) {
            com.smartdigimkt.p4.a.b(!this.g);
            this.f36011e = i2;
            return this;
        }

        public d a(com.smartdigimkt.b4.h hVar) {
            com.smartdigimkt.p4.a.b(!this.g);
            this.f36009b = hVar;
            return this;
        }

        @Override // com.smartdigimkt.k4.c.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public o a(Uri uri) {
            this.g = true;
            if (this.f36009b == null) {
                this.f36009b = new com.smartdigimkt.b4.c();
            }
            return new o(uri, this.f36008a, this.f36009b, this.f36011e, this.f36010c, this.f, this.d);
        }

        public d a(String str) {
            com.smartdigimkt.p4.a.b(!this.g);
            this.f36010c = str;
            return this;
        }

        public d a(Object obj) {
            com.smartdigimkt.p4.a.b(!this.g);
            this.d = obj;
            return this;
        }

        public d a(int i2) {
            com.smartdigimkt.p4.a.b(!this.g);
            this.f = i2;
            return this;
        }

        @Deprecated
        public o a(Uri uri, Handler handler, t tVar) {
            o oVarA = a(uri);
            if (handler != null && tVar != null) {
                oVarA.a(handler, tVar);
            }
            return oVarA;
        }

        @Override // com.smartdigimkt.k4.c.g
        public int[] a() {
            return new int[]{3};
        }
    }

    @Override // com.smartdigimkt.j4.c
    public void a(com.smartdigimkt.w3.h hVar, boolean z2) {
        b(this.n0, false);
    }

    @Override // com.smartdigimkt.j4.s
    public void b() throws IOException {
    }

    @Override // com.smartdigimkt.j4.c
    public void g() {
    }

    @Deprecated
    public o(Uri uri, com.smartdigimkt.n4.h.a aVar, com.smartdigimkt.b4.h hVar, Handler handler, b bVar) {
        this(uri, aVar, hVar, handler, bVar, null);
    }

    private void b(long j, boolean z2) {
        this.n0 = j;
        this.o0 = z2;
        a(new b0(this.n0, this.o0, false, this.m0), (Object) null);
    }

    @Override // com.smartdigimkt.j4.s
    public r a(s.a aVar, com.smartdigimkt.n4.b bVar) {
        com.smartdigimkt.p4.a.a(aVar.f36015a == 0);
        return new n(this.g0, this.h0.a(), this.i0.a(), this.j0, a(aVar), this, bVar, this.k0, this.l0);
    }

    @Deprecated
    public o(Uri uri, com.smartdigimkt.n4.h.a aVar, com.smartdigimkt.b4.h hVar, Handler handler, b bVar, String str) {
        this(uri, aVar, hVar, -1, handler, bVar, str, 1048576);
    }

    @Deprecated
    public o(Uri uri, com.smartdigimkt.n4.h.a aVar, com.smartdigimkt.b4.h hVar, int i2, Handler handler, b bVar, String str, int i3) {
        this(uri, aVar, hVar, i2, str, i3, null);
        if (bVar == null || handler == null) {
            return;
        }
        a(handler, new c(bVar));
    }

    private o(Uri uri, com.smartdigimkt.n4.h.a aVar, com.smartdigimkt.b4.h hVar, int i2, String str, int i3, Object obj) {
        this.g0 = uri;
        this.h0 = aVar;
        this.i0 = hVar;
        this.j0 = i2;
        this.k0 = str;
        this.l0 = i3;
        this.n0 = -9223372036854775807L;
        this.m0 = obj;
    }

    @Override // com.smartdigimkt.j4.s
    public void a(r rVar) {
        ((n) rVar).m();
    }

    @Override // com.smartdigimkt.j4.n.e
    public void a(long j, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.n0;
        }
        if (this.n0 == j && this.o0 == z2) {
            return;
        }
        b(j, z2);
    }
}
