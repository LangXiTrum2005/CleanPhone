package com.smartdigimkt.j4;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends com.smartdigimkt.j4.c {
    public static final int n0 = 3;
    private final com.smartdigimkt.n4.k g0;
    private final com.smartdigimkt.n4.h.a h0;
    private final com.smartdigimkt.w3.m i0;
    private final long j0;
    private final int k0;
    private final boolean l0;
    private final com.smartdigimkt.w3.e0 m0;

    @Deprecated
    public interface b {
        void a(int i2, IOException iOException);
    }

    public static final class c extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f35953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f35954b;

        public c(b bVar, int i2) {
            this.f35953a = (b) com.smartdigimkt.p4.a.a(bVar);
            this.f35954b = i2;
        }

        @Override // com.smartdigimkt.j4.k, com.smartdigimkt.j4.t
        public void a(int i2, s.a aVar, t.b bVar, t.c cVar, IOException iOException, boolean z2) {
            this.f35953a.a(this.f35954b, iOException);
        }
    }

    @Override // com.smartdigimkt.j4.c
    public void a(com.smartdigimkt.w3.h hVar, boolean z2) {
        a(this.m0, (Object) null);
    }

    @Override // com.smartdigimkt.j4.s
    public void b() throws IOException {
    }

    @Override // com.smartdigimkt.j4.c
    public void g() {
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.smartdigimkt.n4.h.a f35955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f35956b = 3;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f35957c;
        private boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Object f35958e;

        public d(com.smartdigimkt.n4.h.a aVar) {
            this.f35955a = (com.smartdigimkt.n4.h.a) com.smartdigimkt.p4.a.a(aVar);
        }

        public d a(Object obj) {
            com.smartdigimkt.p4.a.b(!this.d);
            this.f35958e = obj;
            return this;
        }

        public d a(int i2) {
            com.smartdigimkt.p4.a.b(!this.d);
            this.f35956b = i2;
            return this;
        }

        public d a(boolean z2) {
            com.smartdigimkt.p4.a.b(!this.d);
            this.f35957c = z2;
            return this;
        }

        public d0 a(Uri uri, com.smartdigimkt.w3.m mVar, long j) {
            this.d = true;
            return new d0(uri, this.f35955a, mVar, j, this.f35956b, this.f35957c, this.f35958e);
        }

        @Deprecated
        public d0 a(Uri uri, com.smartdigimkt.w3.m mVar, long j, Handler handler, t tVar) {
            d0 d0VarA = a(uri, mVar, j);
            if (handler != null && tVar != null) {
                d0VarA.a(handler, tVar);
            }
            return d0VarA;
        }
    }

    @Deprecated
    public d0(Uri uri, com.smartdigimkt.n4.h.a aVar, com.smartdigimkt.w3.m mVar, long j) {
        this(uri, aVar, mVar, j, 3);
    }

    @Override // com.smartdigimkt.j4.s
    public r a(s.a aVar, com.smartdigimkt.n4.b bVar) {
        com.smartdigimkt.p4.a.a(aVar.f36015a == 0);
        return new c0(this.g0, this.h0, this.i0, this.j0, this.k0, a(aVar), this.l0);
    }

    @Deprecated
    public d0(Uri uri, com.smartdigimkt.n4.h.a aVar, com.smartdigimkt.w3.m mVar, long j, int i2) {
        this(uri, aVar, mVar, j, i2, false, null);
    }

    @Deprecated
    public d0(Uri uri, com.smartdigimkt.n4.h.a aVar, com.smartdigimkt.w3.m mVar, long j, int i2, Handler handler, b bVar, int i3, boolean z2) {
        this(uri, aVar, mVar, j, i2, z2, null);
        if (handler == null || bVar == null) {
            return;
        }
        a(handler, new c(bVar, i3));
    }

    @Override // com.smartdigimkt.j4.s
    public void a(r rVar) {
        ((c0) rVar).a();
    }

    private d0(Uri uri, com.smartdigimkt.n4.h.a aVar, com.smartdigimkt.w3.m mVar, long j, int i2, boolean z2, Object obj) {
        this.h0 = aVar;
        this.i0 = mVar;
        this.j0 = j;
        this.k0 = i2;
        this.l0 = z2;
        this.g0 = new com.smartdigimkt.n4.k(uri);
        this.m0 = new b0(j, true, false, obj);
    }
}
