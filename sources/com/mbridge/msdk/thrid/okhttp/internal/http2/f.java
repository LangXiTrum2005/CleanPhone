package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.applovin.shadow.okhttp3.internal.http2.Header;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.b0;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.w;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okio.r;
import com.mbridge.msdk.thrid.okio.s;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements com.mbridge.msdk.thrid.okhttp.internal.http.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final List<String> f36437f = com.mbridge.msdk.thrid.okhttp.internal.c.a("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", Header.TARGET_METHOD_UTF8, Header.TARGET_PATH_UTF8, Header.TARGET_SCHEME_UTF8, Header.TARGET_AUTHORITY_UTF8);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final List<String> f36438g = com.mbridge.msdk.thrid.okhttp.internal.c.a("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t.a f36439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okhttp.internal.connection.g f36440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f36441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private i f36442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w f36443e;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends com.mbridge.msdk.thrid.okio.h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f36444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f36445c;

        public a(s sVar) {
            super(sVar);
            this.f36444b = false;
            this.f36445c = 0L;
        }

        private void a(IOException iOException) {
            if (this.f36444b) {
                return;
            }
            this.f36444b = true;
            f fVar = f.this;
            fVar.f36440b.a(false, fVar, this.f36445c, iOException);
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            try {
                long jB = d().b(cVar, j10);
                if (jB <= 0) {
                    return jB;
                }
                this.f36445c += jB;
                return jB;
            } catch (IOException e10) {
                a(e10);
                throw e10;
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.h, com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            a(null);
        }
    }

    public f(v vVar, t.a aVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, g gVar2) {
        this.f36439a = aVar;
        this.f36440b = gVar;
        this.f36441c = gVar2;
        List<w> listU = vVar.u();
        w wVar = w.H2_PRIOR_KNOWLEDGE;
        this.f36443e = listU.contains(wVar) ? wVar : w.HTTP_2;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public r a(y yVar, long j10) {
        return this.f36442d.d();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void b() throws IOException {
        this.f36441c.flush();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void cancel() {
        i iVar = this.f36442d;
        if (iVar != null) {
            iVar.c(b.CANCEL);
        }
    }

    public static List<c> b(y yVar) {
        com.mbridge.msdk.thrid.okhttp.r rVarC = yVar.c();
        ArrayList arrayList = new ArrayList(rVarC.b() + 4);
        arrayList.add(new c(c.f36406f, yVar.e()));
        arrayList.add(new c(c.f36407g, com.mbridge.msdk.thrid.okhttp.internal.http.i.a(yVar.g())));
        String strA = yVar.a("Host");
        if (strA != null) {
            arrayList.add(new c(c.f36409i, strA));
        }
        arrayList.add(new c(c.f36408h, yVar.g().m()));
        int iB = rVarC.b();
        for (int i10 = 0; i10 < iB; i10++) {
            com.mbridge.msdk.thrid.okio.f fVarC = com.mbridge.msdk.thrid.okio.f.c(rVarC.a(i10).toLowerCase(Locale.US));
            if (!f36437f.contains(fVarC.m())) {
                arrayList.add(new c(fVarC, rVarC.b(i10)));
            }
        }
        return arrayList;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void a(y yVar) throws IOException {
        if (this.f36442d != null) {
            return;
        }
        i iVarA = this.f36441c.a(b(yVar), yVar.a() != null);
        this.f36442d = iVarA;
        com.mbridge.msdk.thrid.okio.t tVarH = iVarA.h();
        long jB = this.f36439a.b();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        tVarH.a(jB, timeUnit);
        this.f36442d.l().a(this.f36439a.c(), timeUnit);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void a() throws IOException {
        this.f36442d.d().close();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public a0.a a(boolean z10) throws IOException {
        a0.a aVarA = a(this.f36442d.j(), this.f36443e);
        if (z10 && com.mbridge.msdk.thrid.okhttp.internal.a.f36256a.a(aVarA) == 100) {
            return null;
        }
        return aVarA;
    }

    public static a0.a a(com.mbridge.msdk.thrid.okhttp.r rVar, w wVar) throws IOException {
        com.mbridge.msdk.thrid.okhttp.r.a aVar = new com.mbridge.msdk.thrid.okhttp.r.a();
        int iB = rVar.b();
        com.mbridge.msdk.thrid.okhttp.internal.http.k kVarA = null;
        for (int i10 = 0; i10 < iB; i10++) {
            String strA = rVar.a(i10);
            String strB = rVar.b(i10);
            if (strA.equals(Header.RESPONSE_STATUS_UTF8)) {
                kVarA = com.mbridge.msdk.thrid.okhttp.internal.http.k.a("HTTP/1.1 " + strB);
            } else if (!f36438g.contains(strA)) {
                com.mbridge.msdk.thrid.okhttp.internal.a.f36256a.a(aVar, strA, strB);
            }
        }
        if (kVarA != null) {
            return new a0.a().a(wVar).a(kVarA.f36365b).a(kVarA.f36366c).a(aVar.a());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public b0 a(a0 a0Var) throws IOException {
        com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar = this.f36440b;
        gVar.f36328f.responseBodyStart(gVar.f36327e);
        return new com.mbridge.msdk.thrid.okhttp.internal.http.h(a0Var.b("Content-Type"), com.mbridge.msdk.thrid.okhttp.internal.http.e.a(a0Var), com.mbridge.msdk.thrid.okio.l.a(new a(this.f36442d.e())));
    }
}
