package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.applovin.shadow.okhttp3.internal.http2.Http2Stream;
import com.mbridge.msdk.thrid.okhttp.r;
import com.mbridge.msdk.thrid.okio.s;
import com.mbridge.msdk.thrid.okio.t;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class i {
    static final /* synthetic */ boolean l = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f36527a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f36528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f36529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final g f36530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Deque<r> f36531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f36532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f36533g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final a f36534h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final c f36535i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final c f36536j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    com.mbridge.msdk.thrid.okhttp.internal.http2.b f36537k;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c extends com.mbridge.msdk.thrid.okio.a {
        public c() {
        }

        @Override // com.mbridge.msdk.thrid.okio.a
        public IOException b(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // com.mbridge.msdk.thrid.okio.a
        public void j() {
            i.this.c(com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
            i.this.f36530d.l();
        }

        public void k() throws IOException {
            if (i()) {
                throw b((IOException) null);
            }
        }
    }

    public i(int i10, g gVar, boolean z10, boolean z11, r rVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f36531e = arrayDeque;
        this.f36535i = new c();
        this.f36536j = new c();
        this.f36537k = null;
        if (gVar == null) {
            throw new NullPointerException("connection == null");
        }
        this.f36529c = i10;
        this.f36530d = gVar;
        this.f36528b = gVar.f36467u.c();
        b bVar = new b(gVar.f36466t.c());
        this.f36533g = bVar;
        a aVar = new a();
        this.f36534h = aVar;
        bVar.f36548e = z11;
        aVar.f36541c = z10;
        if (rVar != null) {
            arrayDeque.add(rVar);
        }
        if (f() && rVar != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!f() && rVar == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    public static /* synthetic */ com.mbridge.msdk.thrid.okhttp.internal.http2.c.a b(i iVar) {
        iVar.getClass();
        return null;
    }

    public int c() {
        return this.f36529c;
    }

    public com.mbridge.msdk.thrid.okio.r d() {
        synchronized (this) {
            try {
                if (!this.f36532f && !f()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f36534h;
    }

    public s e() {
        return this.f36533g;
    }

    public boolean f() {
        return this.f36530d.f36448a == ((this.f36529c & 1) == 1);
    }

    public synchronized boolean g() {
        try {
            if (this.f36537k != null) {
                return false;
            }
            b bVar = this.f36533g;
            if (bVar.f36548e || bVar.f36547d) {
                a aVar = this.f36534h;
                if ((aVar.f36541c || aVar.f36540b) && this.f36532f) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public t h() {
        return this.f36535i;
    }

    public void i() {
        boolean zG;
        if (!l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            this.f36533g.f36548e = true;
            zG = g();
            notifyAll();
        }
        if (zG) {
            return;
        }
        this.f36530d.c(this.f36529c);
    }

    public synchronized r j() throws IOException {
        this.f36535i.h();
        while (this.f36531e.isEmpty() && this.f36537k == null) {
            try {
                k();
            } catch (Throwable th2) {
                this.f36535i.k();
                throw th2;
            }
        }
        this.f36535i.k();
        if (this.f36531e.isEmpty()) {
            throw new n(this.f36537k);
        }
        return this.f36531e.removeFirst();
    }

    public void k() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public t l() {
        return this.f36536j;
    }

    private boolean b(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
        if (!l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            try {
                if (this.f36537k != null) {
                    return false;
                }
                if (this.f36533g.f36548e && this.f36534h.f36541c) {
                    return false;
                }
                this.f36537k = bVar;
                notifyAll();
                this.f36530d.c(this.f36529c);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) throws IOException {
        if (b(bVar)) {
            this.f36530d.b(this.f36529c, bVar);
        }
    }

    public void c(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
        if (b(bVar)) {
            this.f36530d.c(this.f36529c, bVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public final class a implements com.mbridge.msdk.thrid.okio.r {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final /* synthetic */ boolean f36538e = true;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.thrid.okio.c f36539a = new com.mbridge.msdk.thrid.okio.c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f36540b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f36541c;

        public a() {
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public void a(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (!f36538e && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            this.f36539a.a(cVar, j10);
            while (this.f36539a.size() >= Http2Stream.EMIT_BUFFER_SIZE) {
                a(false);
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public t b() {
            return i.this.f36536j;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!f36538e && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            synchronized (i.this) {
                try {
                    if (this.f36540b) {
                        return;
                    }
                    if (!i.this.f36534h.f36541c) {
                        if (this.f36539a.size() > 0) {
                            while (this.f36539a.size() > 0) {
                                a(true);
                            }
                        } else {
                            i iVar = i.this;
                            iVar.f36530d.a(iVar.f36529c, true, (com.mbridge.msdk.thrid.okio.c) null, 0L);
                        }
                    }
                    synchronized (i.this) {
                        this.f36540b = true;
                    }
                    i.this.f36530d.flush();
                    i.this.a();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
        public void flush() throws IOException {
            if (!f36538e && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            synchronized (i.this) {
                i.this.b();
            }
            while (this.f36539a.size() > 0) {
                a(false);
                i.this.f36530d.flush();
            }
        }

        private void a(boolean z10) throws IOException {
            i iVar;
            long jMin;
            i iVar2;
            synchronized (i.this) {
                i.this.f36536j.h();
                while (true) {
                    try {
                        iVar = i.this;
                        if (iVar.f36528b > 0 || this.f36541c || this.f36540b || iVar.f36537k != null) {
                            break;
                        } else {
                            iVar.k();
                        }
                    } catch (Throwable th2) {
                        i.this.f36536j.k();
                        throw th2;
                    }
                }
                iVar.f36536j.k();
                i.this.b();
                jMin = Math.min(i.this.f36528b, this.f36539a.size());
                iVar2 = i.this;
                iVar2.f36528b -= jMin;
            }
            iVar2.f36536j.h();
            try {
                i iVar3 = i.this;
                iVar3.f36530d.a(iVar3.f36529c, z10 && jMin == this.f36539a.size(), this.f36539a, jMin);
            } finally {
                i.this.f36536j.k();
            }
        }
    }

    public void a(List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list) {
        boolean zG;
        if (!l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            this.f36532f = true;
            this.f36531e.add(com.mbridge.msdk.thrid.okhttp.internal.c.b(list));
            zG = g();
            notifyAll();
        }
        if (zG) {
            return;
        }
        this.f36530d.c(this.f36529c);
    }

    public synchronized void d(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
        if (this.f36537k == null) {
            this.f36537k = bVar;
            notifyAll();
        }
    }

    public void a(com.mbridge.msdk.thrid.okio.e eVar, int i10) throws IOException {
        if (!l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        this.f36533g.a(eVar, i10);
    }

    public void b() throws IOException {
        a aVar = this.f36534h;
        if (!aVar.f36540b) {
            if (!aVar.f36541c) {
                if (this.f36537k != null) {
                    throw new n(this.f36537k);
                }
                return;
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x002b  */
    public void a() throws IOException {
        boolean z10;
        boolean zG;
        if (!l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            try {
                b bVar = this.f36533g;
                if (bVar.f36548e || !bVar.f36547d) {
                    z10 = false;
                } else {
                    a aVar = this.f36534h;
                    if (aVar.f36541c || aVar.f36540b) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                zG = g();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            a(com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
        } else {
            if (zG) {
                return;
            }
            this.f36530d.c(this.f36529c);
        }
    }

    public void a(long j10) {
        this.f36528b += j10;
        if (j10 > 0) {
            notifyAll();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public final class b implements s {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final /* synthetic */ boolean f36543g = true;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.thrid.okio.c f36544a = new com.mbridge.msdk.thrid.okio.c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.mbridge.msdk.thrid.okio.c f36545b = new com.mbridge.msdk.thrid.okio.c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f36546c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f36547d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f36548e;

        public b(long j10) {
            this.f36546c = j10;
        }

        private void f(long j10) {
            if (!f36543g && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            i.this.f36530d.g(j10);
        }

        public void a(com.mbridge.msdk.thrid.okio.e eVar, long j10) throws IOException {
            boolean z10;
            boolean z11;
            long size;
            if (!f36543g && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            while (j10 > 0) {
                synchronized (i.this) {
                    z10 = this.f36548e;
                    z11 = this.f36545b.size() + j10 > this.f36546c;
                }
                if (z11) {
                    eVar.skip(j10);
                    i.this.c(com.mbridge.msdk.thrid.okhttp.internal.http2.b.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z10) {
                    eVar.skip(j10);
                    return;
                }
                long jB = eVar.b(this.f36544a, j10);
                if (jB == -1) {
                    throw new EOFException();
                }
                j10 -= jB;
                synchronized (i.this) {
                    try {
                        if (this.f36547d) {
                            size = this.f36544a.size();
                            this.f36544a.k();
                        } else {
                            boolean z12 = this.f36545b.size() == 0;
                            this.f36545b.a(this.f36544a);
                            if (z12) {
                                i.this.notifyAll();
                            }
                            size = 0;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (size > 0) {
                    f(size);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:39:0x0094  */
        /* JADX WARN: Code duplicated, block: B:41:0x0098 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:42:0x009a A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:43:0x009b  */
        @Override // com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar;
            long jB;
            if (j10 < 0) {
                throw new IllegalArgumentException(defpackage.e.i(j10, "byteCount < 0: "));
            }
            while (true) {
                synchronized (i.this) {
                    try {
                        i.this.f36535i.h();
                        try {
                            i iVar = i.this;
                            bVar = iVar.f36537k;
                            if (bVar == null) {
                                bVar = null;
                            }
                            if (this.f36547d) {
                                throw new IOException("stream closed");
                            }
                            if (!iVar.f36531e.isEmpty()) {
                                i.b(i.this);
                            }
                            if (this.f36545b.size() > 0) {
                                com.mbridge.msdk.thrid.okio.c cVar2 = this.f36545b;
                                jB = cVar2.b(cVar, Math.min(j10, cVar2.size()));
                                i iVar2 = i.this;
                                long j11 = iVar2.f36527a + jB;
                                iVar2.f36527a = j11;
                                if (bVar != null || j11 < iVar2.f36530d.f36466t.c() / 2) {
                                    break;
                                    break;
                                }
                                i iVar3 = i.this;
                                iVar3.f36530d.a(iVar3.f36529c, iVar3.f36527a);
                                i.this.f36527a = 0L;
                                break;
                            }
                            if (this.f36548e || bVar != null) {
                                jB = -1;
                                break;
                            }
                            i.this.k();
                            i.this.f36535i.k();
                        } catch (Throwable th2) {
                            i.this.f36535i.k();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (jB != -1) {
                    f(jB);
                    return jB;
                }
                if (bVar == null) {
                    return -1L;
                }
                throw new n(bVar);
            }
            i.this.f36535i.k();
            if (jB != -1) {
                f(jB);
                return jB;
            }
            if (bVar == null) {
                return -1L;
            }
            throw new n(bVar);
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long size;
            synchronized (i.this) {
                try {
                    this.f36547d = true;
                    size = this.f36545b.size();
                    this.f36545b.k();
                    if (!i.this.f36531e.isEmpty()) {
                        i.b(i.this);
                    }
                    i.this.notifyAll();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (size > 0) {
                f(size);
            }
            i.this.a();
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public t b() {
            return i.this.f36535i;
        }
    }
}
