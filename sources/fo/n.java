package fo;

import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class n implements Closeable {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final z f41253z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f41254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f41255b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f41256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f41257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f41258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f41259f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ao.d f41260g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ao.c f41261h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ao.c f41262i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ao.c f41263j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y f41264k;
    public long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f41265m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f41266n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f41267o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z f41268p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public z f41269q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f41270r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f41271s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f41272t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f41273u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Socket f41274v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final w f41275w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final cl.i f41276x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final LinkedHashSet f41277y;

    static {
        z zVar = new z();
        zVar.c(7, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        zVar.c(5, Http2.INITIAL_MAX_FRAME_SIZE);
        f41253z = zVar;
    }

    public n(com.google.android.gms.internal.consent_sdk.x xVar) {
        this.f41254a = (h) xVar.f23265f;
        String str = (String) xVar.f23262c;
        if (str == null) {
            kotlin.jvm.internal.n.l("connectionName");
            throw null;
        }
        this.f41256c = str;
        this.f41258e = 3;
        ao.d dVar = (ao.d) xVar.f23260a;
        this.f41260g = dVar;
        this.f41261h = dVar.e();
        this.f41262i = dVar.e();
        this.f41263j = dVar.e();
        this.f41264k = y.f41329a;
        z zVar = new z();
        zVar.c(7, 16777216);
        this.f41268p = zVar;
        z zVar2 = f41253z;
        this.f41269q = zVar2;
        this.f41273u = zVar2.a();
        Socket socket = (Socket) xVar.f23261b;
        if (socket == null) {
            kotlin.jvm.internal.n.l("socket");
            throw null;
        }
        this.f41274v = socket;
        lo.m mVar = (lo.m) xVar.f23264e;
        if (mVar == null) {
            kotlin.jvm.internal.n.l("sink");
            throw null;
        }
        this.f41275w = new w(mVar);
        lo.n nVar = (lo.n) xVar.f23263d;
        if (nVar == null) {
            kotlin.jvm.internal.n.l("source");
            throw null;
        }
        this.f41276x = new cl.i(2, this, new r(nVar));
        this.f41277y = new LinkedHashSet();
    }

    public final void a(int i10, int i11, IOException iOException) {
        int i12;
        Object[] array;
        d5.u.n(i10, "connectionCode");
        d5.u.n(i11, "streamCode");
        byte[] bArr = yn.a.f54560a;
        try {
            d(i10);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f41255b.isEmpty()) {
                array = null;
            } else {
                array = this.f41255b.values().toArray(new v[0]);
                this.f41255b.clear();
            }
        }
        v[] vVarArr = (v[]) array;
        if (vVarArr != null) {
            for (v vVar : vVarArr) {
                try {
                    vVar.c(i11, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f41275w.close();
        } catch (IOException unused3) {
        }
        try {
            this.f41274v.close();
        } catch (IOException unused4) {
        }
        this.f41261h.e();
        this.f41262i.e();
        this.f41263j.e();
    }

    public final synchronized v b(int i10) {
        return (v) this.f41255b.get(Integer.valueOf(i10));
    }

    public final synchronized v c(int i10) {
        v vVar;
        vVar = (v) this.f41255b.remove(Integer.valueOf(i10));
        notifyAll();
        return vVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(1, 9, null);
    }

    public final void d(int i10) {
        d5.u.n(i10, "statusCode");
        synchronized (this.f41275w) {
            synchronized (this) {
                if (this.f41259f) {
                    return;
                }
                this.f41259f = true;
                this.f41275w.d(yn.a.f54560a, this.f41257d, i10);
            }
        }
    }

    public final void flush() {
        this.f41275w.flush();
    }

    public final synchronized void h(long j10) {
        long j11 = this.f41270r + j10;
        this.f41270r = j11;
        long j12 = j11 - this.f41271s;
        if (j12 >= this.f41268p.a() / 2) {
            n(0, j12);
            this.f41271s += j12;
        }
    }

    public final void j(int i10, boolean z10, lo.e eVar, long j10) {
        long j11;
        long j12;
        int iMin;
        long j13;
        if (j10 == 0) {
            this.f41275w.b(z10, i10, eVar, 0);
            return;
        }
        while (j10 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j11 = this.f41272t;
                            j12 = this.f41273u;
                            if (j11 >= j12) {
                                if (!this.f41255b.containsKey(Integer.valueOf(i10))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                iMin = Math.min((int) Math.min(j10, j12 - j11), this.f41275w.f41323c);
                j13 = iMin;
                this.f41272t += j13;
            }
            j10 -= j13;
            this.f41275w.b(z10 && j10 == 0, i10, eVar, iMin);
        }
    }

    public final void k(int i10, int i11) {
        d5.u.n(i11, IronSourceConstants.EVENTS_ERROR_CODE);
        this.f41261h.c(new j(this.f41256c + '[' + i10 + "] writeSynReset", this, i10, i11, 2), 0L);
    }

    public final void n(int i10, long j10) {
        this.f41261h.c(new m(this.f41256c + '[' + i10 + "] windowUpdate", this, i10, j10), 0L);
    }
}
