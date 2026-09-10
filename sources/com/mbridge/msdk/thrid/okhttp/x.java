package com.mbridge.msdk.thrid.okhttp;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
final class x implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final v f36739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okhttp.internal.http.j f36740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okio.a f36741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private o f36742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final y f36743e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f36744f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f36745g;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends com.mbridge.msdk.thrid.okio.a {
        public a() {
        }

        @Override // com.mbridge.msdk.thrid.okio.a
        public void j() {
            x.this.cancel();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public final class b extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ boolean f36747d = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e f36748b;

        public b(e eVar) {
            super("OkHttp %s", x.this.e());
            this.f36748b = eVar;
        }

        public void a(ExecutorService executorService) {
            if (!f36747d && Thread.holdsLock(x.this.f36739a.j())) {
                throw new AssertionError();
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e10) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e10);
                    x.this.f36742d.callFailed(x.this, interruptedIOException);
                    this.f36748b.a(x.this, interruptedIOException);
                    x.this.f36739a.j().b(this);
                }
            } catch (Throwable th2) {
                x.this.f36739a.j().b(this);
                throw th2;
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            x.this.f36741c.h();
            boolean z10 = false;
            try {
                try {
                    try {
                        this.f36748b.a(x.this, x.this.c());
                        x.this.f36739a.j().b(this);
                    } catch (IOException e10) {
                        e = e10;
                        z10 = true;
                        IOException iOExceptionA = x.this.a(e);
                        if (z10) {
                            com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(4, "Callback failure for " + x.this.f(), iOExceptionA);
                        } else {
                            x.this.f36742d.callFailed(x.this, iOExceptionA);
                            this.f36748b.a(x.this, iOExceptionA);
                        }
                        x.this.f36739a.j().b(this);
                    } catch (Throwable th2) {
                        th = th2;
                        z10 = true;
                        x.this.cancel();
                        if (!z10) {
                            this.f36748b.a(x.this, new IOException("canceled due to " + th));
                        }
                        throw th;
                    }
                } catch (IOException e11) {
                    e = e11;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                x.this.f36739a.j().b(this);
                throw th4;
            }
        }

        public x c() {
            return x.this;
        }

        public String d() {
            return x.this.f36743e.g().g();
        }
    }

    private x(v vVar, y yVar, boolean z10) {
        this.f36739a = vVar;
        this.f36743e = yVar;
        this.f36744f = z10;
        this.f36740b = new com.mbridge.msdk.thrid.okhttp.internal.http.j(vVar, z10);
        a aVar = new a();
        this.f36741c = aVar;
        aVar.a(vVar.b(), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public x clone() {
        return a(this.f36739a, this.f36743e, this.f36744f);
    }

    public a0 c() throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f36739a.p());
        arrayList.add(this.f36740b);
        arrayList.add(new com.mbridge.msdk.thrid.okhttp.internal.http.a(this.f36739a.i()));
        this.f36739a.q();
        arrayList.add(new com.mbridge.msdk.thrid.okhttp.internal.cache.a(null));
        arrayList.add(new com.mbridge.msdk.thrid.okhttp.internal.connection.a(this.f36739a));
        if (!this.f36744f) {
            arrayList.addAll(this.f36739a.r());
        }
        arrayList.add(new com.mbridge.msdk.thrid.okhttp.internal.http.b(this.f36744f));
        a0 a0VarA = new com.mbridge.msdk.thrid.okhttp.internal.http.g(arrayList, null, null, null, 0, this.f36743e, this, this.f36742d, this.f36739a.e(), this.f36739a.y(), this.f36739a.C()).a(this.f36743e);
        if (!this.f36740b.b()) {
            return a0VarA;
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(a0VarA);
        throw new IOException("Canceled");
    }

    @Override // com.mbridge.msdk.thrid.okhttp.d
    public void cancel() {
        this.f36740b.a();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.d
    public a0 d() throws IOException {
        synchronized (this) {
            if (this.f36745g) {
                throw new IllegalStateException("Already Executed");
            }
            this.f36745g = true;
        }
        a();
        this.f36741c.h();
        this.f36742d.callStart(this);
        try {
            try {
                this.f36739a.j().a(this);
                a0 a0VarC = c();
                if (a0VarC == null) {
                    throw new IOException("Canceled");
                }
                this.f36739a.j().b(this);
                return a0VarC;
            } catch (IOException e10) {
                IOException iOExceptionA = a(e10);
                this.f36742d.callFailed(this, iOExceptionA);
                throw iOExceptionA;
            }
        } catch (Throwable th2) {
            this.f36739a.j().b(this);
            throw th2;
        }
        this.f36739a.j().b(this);
        throw th2;
    }

    public String e() {
        return this.f36743e.g().l();
    }

    public String f() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(h() ? "canceled " : "");
        sb2.append(this.f36744f ? "web socket" : NotificationCompat.CATEGORY_CALL);
        sb2.append(" to ");
        sb2.append(e());
        return sb2.toString();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.d
    public boolean h() {
        return this.f36740b.b();
    }

    public static x a(v vVar, y yVar, boolean z10) {
        x xVar = new x(vVar, yVar, z10);
        xVar.f36742d = vVar.l().a(xVar);
        return xVar;
    }

    public IOException a(IOException iOException) {
        if (!this.f36741c.i()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    private void a() {
        this.f36740b.a(com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a("response.body().close()"));
    }

    @Override // com.mbridge.msdk.thrid.okhttp.d
    public void a(e eVar) {
        synchronized (this) {
            if (!this.f36745g) {
                this.f36745g = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        a();
        this.f36742d.callStart(this);
        this.f36739a.j().a(new b(eVar));
    }
}
