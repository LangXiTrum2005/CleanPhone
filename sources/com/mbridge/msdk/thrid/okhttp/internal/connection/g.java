package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.c0;
import com.mbridge.msdk.thrid.okhttp.i;
import com.mbridge.msdk.thrid.okhttp.internal.http2.n;
import com.mbridge.msdk.thrid.okhttp.o;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.v;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final /* synthetic */ boolean f36322o = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okhttp.a f36323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f.a f36324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c0 f36325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f36326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okhttp.d f36327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o f36328f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f36329g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final f f36330h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f36331i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c f36332j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f36333k;
    private boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f36334m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.mbridge.msdk.thrid.okhttp.internal.http.c f36335n;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a extends WeakReference<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f36336a;

        public a(g gVar, Object obj) {
            super(gVar);
            this.f36336a = obj;
        }
    }

    public g(i iVar, com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.d dVar, o oVar, Object obj) {
        this.f36326d = iVar;
        this.f36323a = aVar;
        this.f36327e = dVar;
        this.f36328f = oVar;
        this.f36330h = new f(aVar, i(), dVar, oVar);
        this.f36329g = obj;
    }

    private Socket g() {
        if (!f36322o && !Thread.holdsLock(this.f36326d)) {
            throw new AssertionError();
        }
        c cVar = this.f36332j;
        if (cVar == null || !cVar.f36305k) {
            return null;
        }
        return a(false, false, true);
    }

    private d i() {
        return com.mbridge.msdk.thrid.okhttp.internal.a.f36256a.a(this.f36326d);
    }

    public com.mbridge.msdk.thrid.okhttp.internal.http.c a(v vVar, t.a aVar, boolean z10) {
        try {
            com.mbridge.msdk.thrid.okhttp.internal.http.c cVarA = a(aVar.a(), aVar.b(), aVar.c(), vVar.t(), vVar.z(), z10).a(vVar, aVar, this);
            synchronized (this.f36326d) {
                this.f36335n = cVarA;
            }
            return cVarA;
        } catch (IOException e10) {
            throw new e(e10);
        }
    }

    public com.mbridge.msdk.thrid.okhttp.internal.http.c b() {
        com.mbridge.msdk.thrid.okhttp.internal.http.c cVar;
        synchronized (this.f36326d) {
            cVar = this.f36335n;
        }
        return cVar;
    }

    public synchronized c c() {
        return this.f36332j;
    }

    public boolean d() {
        if (this.f36325c != null) {
            return true;
        }
        f.a aVar = this.f36324b;
        return (aVar != null && aVar.b()) || this.f36330h.a();
    }

    public void e() {
        c cVar;
        Socket socketA;
        synchronized (this.f36326d) {
            cVar = this.f36332j;
            socketA = a(true, false, false);
            if (this.f36332j != null) {
                cVar = null;
            }
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(socketA);
        if (cVar != null) {
            this.f36328f.connectionReleased(this.f36327e, cVar);
        }
    }

    public void f() {
        c cVar;
        Socket socketA;
        synchronized (this.f36326d) {
            cVar = this.f36332j;
            socketA = a(false, true, false);
            if (this.f36332j != null) {
                cVar = null;
            }
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(socketA);
        if (cVar != null) {
            com.mbridge.msdk.thrid.okhttp.internal.a.f36256a.a(this.f36327e, (IOException) null);
            this.f36328f.connectionReleased(this.f36327e, cVar);
            this.f36328f.callEnd(this.f36327e);
        }
    }

    public c0 h() {
        return this.f36325c;
    }

    public String toString() {
        c cVarC = c();
        return cVarC != null ? cVarC.toString() : this.f36323a.toString();
    }

    public Socket b(c cVar) {
        if (!f36322o && !Thread.holdsLock(this.f36326d)) {
            throw new AssertionError();
        }
        if (this.f36335n == null && this.f36332j.f36307n.size() == 1) {
            Reference<g> reference = this.f36332j.f36307n.get(0);
            Socket socketA = a(true, false, false);
            this.f36332j = cVar;
            cVar.f36307n.add(reference);
            return socketA;
        }
        throw new IllegalStateException();
    }

    private c a(int i10, int i11, int i12, int i13, boolean z10, boolean z11) throws Throwable {
        while (true) {
            c cVarA = a(i10, i11, i12, i13, z10);
            synchronized (this.f36326d) {
                try {
                    if (cVarA.l == 0 && !cVarA.f()) {
                        return cVarA;
                    }
                    if (cVarA.a(z11)) {
                        return cVarA;
                    }
                    e();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private c a(int i10, int i11, int i12, int i13, boolean z10) throws Throwable {
        c cVar;
        Socket socketG;
        c cVar2;
        Socket socketA;
        c0 c0VarC;
        boolean z11;
        boolean z12;
        c cVar3;
        f.a aVar;
        synchronized (this.f36326d) {
            try {
                if (!this.l) {
                    if (this.f36335n == null) {
                        if (!this.f36334m) {
                            cVar = this.f36332j;
                            socketG = g();
                            cVar2 = this.f36332j;
                            socketA = null;
                            if (cVar2 != null) {
                                cVar = null;
                            } else {
                                cVar2 = null;
                            }
                            if (!this.f36333k) {
                                cVar = null;
                            }
                            if (cVar2 == null) {
                                com.mbridge.msdk.thrid.okhttp.internal.a.f36256a.a(this.f36326d, this.f36323a, this, null);
                                c cVar4 = this.f36332j;
                                if (cVar4 != null) {
                                    z11 = true;
                                    cVar2 = cVar4;
                                    c0VarC = null;
                                } else {
                                    c0VarC = this.f36325c;
                                }
                            } else {
                                c0VarC = null;
                            }
                            z11 = false;
                        } else {
                            throw new IOException("Canceled");
                        }
                    } else {
                        throw new IllegalStateException("codec != null");
                    }
                } else {
                    throw new IllegalStateException("released");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(socketG);
        if (cVar != null) {
            this.f36328f.connectionReleased(this.f36327e, cVar);
        }
        if (z11) {
            this.f36328f.connectionAcquired(this.f36327e, cVar2);
        }
        if (cVar2 != null) {
            this.f36325c = this.f36332j.c();
            return cVar2;
        }
        if (c0VarC != null || ((aVar = this.f36324b) != null && aVar.b())) {
            z12 = false;
        } else {
            this.f36324b = this.f36330h.c();
            z12 = true;
        }
        synchronized (this.f36326d) {
            try {
                if (this.f36334m) {
                    throw new IOException("Canceled");
                }
                if (z12) {
                    List<c0> listA = this.f36324b.a();
                    int size = listA.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        c0 c0Var = listA.get(i14);
                        com.mbridge.msdk.thrid.okhttp.internal.a.f36256a.a(this.f36326d, this.f36323a, this, c0Var);
                        c cVar5 = this.f36332j;
                        if (cVar5 != null) {
                            this.f36325c = c0Var;
                            z11 = true;
                            cVar2 = cVar5;
                            break;
                        }
                    }
                }
                if (!z11) {
                    if (c0VarC == null) {
                        c0VarC = this.f36324b.c();
                    }
                    this.f36325c = c0VarC;
                    this.f36331i = 0;
                    cVar2 = new c(this.f36326d, c0VarC);
                    a(cVar2, false);
                }
                cVar3 = cVar2;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z11) {
            this.f36328f.connectionAcquired(this.f36327e, cVar3);
            return cVar3;
        }
        cVar3.a(i10, i11, i12, i13, z10, this.f36327e, this.f36328f);
        i().a(cVar3.c());
        synchronized (this.f36326d) {
            try {
                this.f36333k = true;
                com.mbridge.msdk.thrid.okhttp.internal.a.f36256a.b(this.f36326d, cVar3);
                if (cVar3.f()) {
                    socketA = com.mbridge.msdk.thrid.okhttp.internal.a.f36256a.a(this.f36326d, this.f36323a, this);
                    cVar3 = this.f36332j;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(socketA);
        this.f36328f.connectionAcquired(this.f36327e, cVar3);
        return cVar3;
    }

    public void a(boolean z10, com.mbridge.msdk.thrid.okhttp.internal.http.c cVar, long j10, IOException iOException) {
        c cVar2;
        Socket socketA;
        boolean z11;
        this.f36328f.responseBodyEnd(this.f36327e, j10);
        synchronized (this.f36326d) {
            if (cVar != null) {
                try {
                    if (cVar == this.f36335n) {
                        if (!z10) {
                            this.f36332j.l++;
                        }
                        cVar2 = this.f36332j;
                        socketA = a(z10, false, true);
                        if (this.f36332j != null) {
                            cVar2 = null;
                        }
                        z11 = this.l;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            throw new IllegalStateException("expected " + this.f36335n + " but was " + cVar);
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(socketA);
        if (cVar2 != null) {
            this.f36328f.connectionReleased(this.f36327e, cVar2);
        }
        if (iOException != null) {
            this.f36328f.callFailed(this.f36327e, com.mbridge.msdk.thrid.okhttp.internal.a.f36256a.a(this.f36327e, iOException));
        } else if (z11) {
            com.mbridge.msdk.thrid.okhttp.internal.a.f36256a.a(this.f36327e, (IOException) null);
            this.f36328f.callEnd(this.f36327e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    private Socket a(boolean z10, boolean z11, boolean z12) {
        Socket socketG;
        if (!f36322o && !Thread.holdsLock(this.f36326d)) {
            throw new AssertionError();
        }
        if (z12) {
            this.f36335n = null;
        }
        if (z11) {
            this.l = true;
        }
        c cVar = this.f36332j;
        if (cVar != null) {
            if (z10) {
                cVar.f36305k = true;
            }
            if (this.f36335n == null && (this.l || cVar.f36305k)) {
                a(cVar);
                if (this.f36332j.f36307n.isEmpty()) {
                    this.f36332j.f36308o = System.nanoTime();
                    if (com.mbridge.msdk.thrid.okhttp.internal.a.f36256a.a(this.f36326d, this.f36332j)) {
                        socketG = this.f36332j.g();
                    } else {
                        socketG = null;
                    }
                } else {
                    socketG = null;
                }
                this.f36332j = null;
                return socketG;
            }
        }
        return null;
    }

    public void a() {
        com.mbridge.msdk.thrid.okhttp.internal.http.c cVar;
        c cVar2;
        synchronized (this.f36326d) {
            this.f36334m = true;
            cVar = this.f36335n;
            cVar2 = this.f36332j;
        }
        if (cVar != null) {
            cVar.cancel();
        } else if (cVar2 != null) {
            cVar2.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0048  */
    public void a(IOException iOException) {
        c cVar;
        boolean z10;
        Socket socketA;
        synchronized (this.f36326d) {
            try {
                cVar = null;
                if (iOException instanceof n) {
                    com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar = ((n) iOException).f36568a;
                    if (bVar == com.mbridge.msdk.thrid.okhttp.internal.http2.b.REFUSED_STREAM) {
                        int i10 = this.f36331i + 1;
                        this.f36331i = i10;
                        if (i10 > 1) {
                            this.f36325c = null;
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else if (bVar != com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL) {
                        this.f36325c = null;
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    c cVar2 = this.f36332j;
                    if (cVar2 == null || (cVar2.f() && !(iOException instanceof com.mbridge.msdk.thrid.okhttp.internal.http2.a))) {
                        z10 = false;
                    } else {
                        if (this.f36332j.l == 0) {
                            c0 c0Var = this.f36325c;
                            if (c0Var != null && iOException != null) {
                                this.f36330h.a(c0Var, iOException);
                            }
                            this.f36325c = null;
                        }
                        z10 = true;
                    }
                }
                c cVar3 = this.f36332j;
                socketA = a(z10, false, true);
                if (this.f36332j == null && this.f36333k) {
                    cVar = cVar3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(socketA);
        if (cVar != null) {
            this.f36328f.connectionReleased(this.f36327e, cVar);
        }
    }

    public void a(c cVar, boolean z10) {
        if (!f36322o && !Thread.holdsLock(this.f36326d)) {
            throw new AssertionError();
        }
        if (this.f36332j == null) {
            this.f36332j = cVar;
            this.f36333k = z10;
            cVar.f36307n.add(new a(this, this.f36329g));
            return;
        }
        throw new IllegalStateException();
    }

    private void a(c cVar) {
        int size = cVar.f36307n.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (cVar.f36307n.get(i10).get() == this) {
                cVar.f36307n.remove(i10);
                return;
            }
        }
        throw new IllegalStateException();
    }
}
