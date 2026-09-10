package com.mbridge.msdk.thrid.okhttp.internal.http1;

import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.b0;
import com.mbridge.msdk.thrid.okhttp.internal.http.h;
import com.mbridge.msdk.thrid.okhttp.internal.http.k;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okio.i;
import com.mbridge.msdk.thrid.okio.l;
import com.mbridge.msdk.thrid.okio.r;
import com.mbridge.msdk.thrid.okio.s;
import com.mbridge.msdk.thrid.okio.t;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements com.mbridge.msdk.thrid.okhttp.internal.http.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final v f36367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okhttp.internal.connection.g f36368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okio.e f36369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okio.d f36370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f36371e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f36372f = 262144;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public abstract class b implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final i f36373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected boolean f36374b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected long f36375c;

        private b() {
            this.f36373a = new i(a.this.f36369c.b());
            this.f36375c = 0L;
        }

        public final void a(boolean z10, IOException iOException) throws IOException {
            a aVar = a.this;
            int i10 = aVar.f36371e;
            if (i10 == 6) {
                return;
            }
            if (i10 != 5) {
                throw new IllegalStateException("state: " + a.this.f36371e);
            }
            aVar.a(this.f36373a);
            a aVar2 = a.this;
            aVar2.f36371e = 6;
            com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar = aVar2.f36368b;
            if (gVar != null) {
                gVar.a(!z10, aVar2, this.f36375c, iOException);
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public t b() {
            return this.f36373a;
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            try {
                long jB = a.this.f36369c.b(cVar, j10);
                if (jB <= 0) {
                    return jB;
                }
                this.f36375c += jB;
                return jB;
            } catch (IOException e10) {
                a(false, e10);
                throw e10;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public final class c implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i f36377a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f36378b;

        public c() {
            this.f36377a = new i(a.this.f36370d.b());
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public void a(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (this.f36378b) {
                throw new IllegalStateException("closed");
            }
            if (j10 == 0) {
                return;
            }
            a.this.f36370d.a(j10);
            a.this.f36370d.a("\r\n");
            a.this.f36370d.a(cVar, j10);
            a.this.f36370d.a("\r\n");
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public t b() {
            return this.f36377a;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() throws IOException {
            if (this.f36378b) {
                return;
            }
            this.f36378b = true;
            a.this.f36370d.a("0\r\n\r\n");
            a.this.a(this.f36377a);
            a.this.f36371e = 3;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
        public synchronized void flush() throws IOException {
            if (this.f36378b) {
                return;
            }
            a.this.f36370d.flush();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final com.mbridge.msdk.thrid.okhttp.s f36380e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f36381f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f36382g;

        public d(com.mbridge.msdk.thrid.okhttp.s sVar) {
            super();
            this.f36381f = -1L;
            this.f36382g = true;
            this.f36380e = sVar;
        }

        private void d() throws IOException {
            if (this.f36381f != -1) {
                a.this.f36369c.c();
            }
            try {
                this.f36381f = a.this.f36369c.i();
                String strTrim = a.this.f36369c.c().trim();
                if (this.f36381f < 0 || !(strTrim.isEmpty() || strTrim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f36381f + strTrim + "\"");
                }
                if (this.f36381f == 0) {
                    this.f36382g = false;
                    com.mbridge.msdk.thrid.okhttp.internal.http.e.a(a.this.f36367a.i(), this.f36380e, a.this.f());
                    a(true, null);
                }
            } catch (NumberFormatException e10) {
                throw new ProtocolException(e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http1.a.b, com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (j10 < 0) {
                throw new IllegalArgumentException(defpackage.e.i(j10, "byteCount < 0: "));
            }
            if (this.f36374b) {
                throw new IllegalStateException("closed");
            }
            if (!this.f36382g) {
                return -1L;
            }
            long j11 = this.f36381f;
            if (j11 == 0 || j11 == -1) {
                d();
                if (!this.f36382g) {
                    return -1L;
                }
            }
            long jB = super.b(cVar, Math.min(j10, this.f36381f));
            if (jB != -1) {
                this.f36381f -= jB;
                return jB;
            }
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a(false, protocolException);
            throw protocolException;
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f36374b) {
                return;
            }
            if (this.f36382g && !com.mbridge.msdk.thrid.okhttp.internal.c.a(this, 100, TimeUnit.MILLISECONDS)) {
                a(false, null);
            }
            this.f36374b = true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public final class e implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i f36384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f36385b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f36386c;

        public e(long j10) {
            this.f36384a = new i(a.this.f36370d.b());
            this.f36386c = j10;
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public void a(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (this.f36385b) {
                throw new IllegalStateException("closed");
            }
            com.mbridge.msdk.thrid.okhttp.internal.c.a(cVar.size(), 0L, j10);
            if (j10 <= this.f36386c) {
                a.this.f36370d.a(cVar, j10);
                this.f36386c -= j10;
            } else {
                StringBuilder sb2 = new StringBuilder("expected ");
                sb2.append(this.f36386c);
                throw new ProtocolException(defpackage.e.s(sb2, " bytes but received ", j10));
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public t b() {
            return this.f36384a;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f36385b) {
                return;
            }
            this.f36385b = true;
            if (this.f36386c > 0) {
                throw new ProtocolException("unexpected end of stream");
            }
            a.this.a(this.f36384a);
            a.this.f36371e = 3;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
        public void flush() throws IOException {
            if (this.f36385b) {
                return;
            }
            a.this.f36370d.flush();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class f extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f36388e;

        public f(long j10) throws IOException {
            super();
            this.f36388e = j10;
            if (j10 == 0) {
                a(true, null);
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http1.a.b, com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (j10 < 0) {
                throw new IllegalArgumentException(defpackage.e.i(j10, "byteCount < 0: "));
            }
            if (this.f36374b) {
                throw new IllegalStateException("closed");
            }
            long j11 = this.f36388e;
            if (j11 == 0) {
                return -1L;
            }
            long jB = super.b(cVar, Math.min(j11, j10));
            if (jB == -1) {
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a(false, protocolException);
                throw protocolException;
            }
            long j12 = this.f36388e - jB;
            this.f36388e = j12;
            if (j12 == 0) {
                a(true, null);
            }
            return jB;
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f36374b) {
                return;
            }
            if (this.f36388e != 0 && !com.mbridge.msdk.thrid.okhttp.internal.c.a(this, 100, TimeUnit.MILLISECONDS)) {
                a(false, null);
            }
            this.f36374b = true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class g extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f36390e;

        public g() {
            super();
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http1.a.b, com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (j10 < 0) {
                throw new IllegalArgumentException(defpackage.e.i(j10, "byteCount < 0: "));
            }
            if (this.f36374b) {
                throw new IllegalStateException("closed");
            }
            if (this.f36390e) {
                return -1L;
            }
            long jB = super.b(cVar, j10);
            if (jB != -1) {
                return jB;
            }
            this.f36390e = true;
            a(true, null);
            return -1L;
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f36374b) {
                return;
            }
            if (!this.f36390e) {
                a(false, null);
            }
            this.f36374b = true;
        }
    }

    public a(v vVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, com.mbridge.msdk.thrid.okio.e eVar, com.mbridge.msdk.thrid.okio.d dVar) {
        this.f36367a = vVar;
        this.f36368b = gVar;
        this.f36369c = eVar;
        this.f36370d = dVar;
    }

    private String e() throws IOException {
        String strD = this.f36369c.d(this.f36372f);
        this.f36372f -= (long) strD.length();
        return strD;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public r a(y yVar, long j10) {
        if ("chunked".equalsIgnoreCase(yVar.a("Transfer-Encoding"))) {
            return c();
        }
        if (j10 != -1) {
            return a(j10);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void b() throws IOException {
        this.f36370d.flush();
    }

    public r c() {
        if (this.f36371e == 1) {
            this.f36371e = 2;
            return new c();
        }
        throw new IllegalStateException("state: " + this.f36371e);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void cancel() {
        com.mbridge.msdk.thrid.okhttp.internal.connection.c cVarC = this.f36368b.c();
        if (cVarC != null) {
            cVarC.d();
        }
    }

    public s d() throws IOException {
        if (this.f36371e != 4) {
            throw new IllegalStateException("state: " + this.f36371e);
        }
        com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar = this.f36368b;
        if (gVar == null) {
            throw new IllegalStateException("streamAllocation == null");
        }
        this.f36371e = 5;
        gVar.e();
        return new g();
    }

    public com.mbridge.msdk.thrid.okhttp.r f() throws IOException {
        com.mbridge.msdk.thrid.okhttp.r.a aVar = new com.mbridge.msdk.thrid.okhttp.r.a();
        while (true) {
            String strE = e();
            if (strE.length() == 0) {
                return aVar.a();
            }
            com.mbridge.msdk.thrid.okhttp.internal.a.f36256a.a(aVar, strE);
        }
    }

    public s b(long j10) throws IOException {
        if (this.f36371e == 4) {
            this.f36371e = 5;
            return new f(j10);
        }
        throw new IllegalStateException("state: " + this.f36371e);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void a(y yVar) throws IOException {
        a(yVar.c(), com.mbridge.msdk.thrid.okhttp.internal.http.i.a(yVar, this.f36368b.c().c().b().type()));
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public b0 a(a0 a0Var) throws IOException {
        com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar = this.f36368b;
        gVar.f36328f.responseBodyStart(gVar.f36327e);
        String strB = a0Var.b("Content-Type");
        if (!com.mbridge.msdk.thrid.okhttp.internal.http.e.b(a0Var)) {
            return new h(strB, 0L, l.a(b(0L)));
        }
        if ("chunked".equalsIgnoreCase(a0Var.b("Transfer-Encoding"))) {
            return new h(strB, -1L, l.a(a(a0Var.s().g())));
        }
        long jA = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(a0Var);
        if (jA != -1) {
            return new h(strB, jA, l.a(b(jA)));
        }
        return new h(strB, -1L, l.a(d()));
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public void a() throws IOException {
        this.f36370d.flush();
    }

    public void a(com.mbridge.msdk.thrid.okhttp.r rVar, String str) throws IOException {
        if (this.f36371e == 0) {
            this.f36370d.a(str).a("\r\n");
            int iB = rVar.b();
            for (int i10 = 0; i10 < iB; i10++) {
                this.f36370d.a(rVar.a(i10)).a(": ").a(rVar.b(i10)).a("\r\n");
            }
            this.f36370d.a("\r\n");
            this.f36371e = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.f36371e);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.c
    public a0.a a(boolean z10) throws IOException {
        int i10 = this.f36371e;
        if (i10 != 1 && i10 != 3) {
            throw new IllegalStateException("state: " + this.f36371e);
        }
        try {
            k kVarA = k.a(e());
            a0.a aVarA = new a0.a().a(kVarA.f36364a).a(kVarA.f36365b).a(kVarA.f36366c).a(f());
            if (z10 && kVarA.f36365b == 100) {
                return null;
            }
            if (kVarA.f36365b == 100) {
                this.f36371e = 3;
                return aVarA;
            }
            this.f36371e = 4;
            return aVarA;
        } catch (EOFException e10) {
            IOException iOException = new IOException("unexpected end of stream on " + this.f36368b);
            iOException.initCause(e10);
            throw iOException;
        }
    }

    public r a(long j10) {
        if (this.f36371e == 1) {
            this.f36371e = 2;
            return new e(j10);
        }
        throw new IllegalStateException("state: " + this.f36371e);
    }

    public s a(com.mbridge.msdk.thrid.okhttp.s sVar) throws IOException {
        if (this.f36371e == 4) {
            this.f36371e = 5;
            return new d(sVar);
        }
        throw new IllegalStateException("state: " + this.f36371e);
    }

    public void a(i iVar) {
        t tVarG = iVar.g();
        iVar.a(t.f36822d);
        tVarG.a();
        tVarG.b();
    }
}
