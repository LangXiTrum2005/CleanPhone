package f2;

import android.net.Uri;
import com.google.android.gms.internal.ads.q2;
import com.mbridge.msdk.foundation.download.Command;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements j2.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f40444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n1.y f40445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g9.k f40446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v0 f40447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l1.f f40448e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f40450g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f40452i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public n1.k f40453j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public n2.a0 f40454k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v0 f40455m;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q2 f40449f = new q2();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f40451h = true;

    public s0(v0 v0Var, Uri uri, n1.h hVar, g9.k kVar, v0 v0Var2, l1.f fVar) {
        this.f40455m = v0Var;
        this.f40444a = uri;
        this.f40445b = new n1.y(hVar);
        this.f40446c = kVar;
        this.f40447d = v0Var2;
        this.f40448e = fVar;
        u.f40463b.getAndIncrement();
        this.f40453j = a(0L, null);
    }

    public final n1.k a(long j10, String str) {
        Map mapC = v0.Q;
        if (str != null && !str.startsWith("W/")) {
            b2.p pVarD = oa.o0.d();
            pVarD.m(mapC.entrySet());
            pVarD.l("If-Range", str);
            mapC = pVarD.c(false);
        }
        Map map = Collections.EMPTY_MAP;
        Uri uri = this.f40444a;
        go.k.o(uri, "The uri must be set.");
        return new n1.k(uri, 1, null, mapC, j10, -1L, null, 6);
    }

    @Override // j2.j
    public final void cancelLoad() {
        this.f40450g = true;
    }

    @Override // j2.j
    public final void load() {
        n1.h tVar;
        n2.k kVar;
        int i10;
        int iB = 0;
        String str = null;
        while (iB == 0 && !this.f40450g) {
            try {
                long j10 = this.f40449f.f18888a;
                n1.k kVarA = a(j10, str);
                this.f40453j = kVarA;
                long jC = this.f40445b.C(kVarA);
                if (this.f40450g) {
                    if (iB != 1 && this.f40446c.r() != -1) {
                        this.f40449f.f18888a = this.f40446c.r();
                    }
                    com.google.android.gms.internal.auth.i.e(this.f40445b);
                    return;
                }
                List list = (List) this.f40445b.f46416a.getResponseHeaders().get(Command.HTTP_HEADER_ETAG);
                str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
                if (jC != -1) {
                    jC += j10;
                    v0 v0Var = this.f40455m;
                    v0Var.f40489q.post(new o0(v0Var, 0));
                }
                long j11 = jC;
                this.f40455m.f40491s = a3.b.d(this.f40445b.f46416a.getResponseHeaders());
                n1.y yVar = this.f40445b;
                a3.b bVar = this.f40455m.f40491s;
                if (bVar == null || (i10 = bVar.f3377f) == -1) {
                    tVar = yVar;
                } else {
                    tVar = new t(yVar, i10, this);
                    n2.a0 a0VarR = this.f40455m.r(new u0(0, true));
                    this.f40454k = a0VarR;
                    a0VarR.b(v0.R);
                }
                this.f40446c.x(tVar, this.f40444a, this.f40445b.f46416a.getResponseHeaders(), j10, j11, this.f40447d);
                if (this.f40455m.f40491s != null && (kVar = (n2.k) this.f40446c.f41771c) != null && (kVar instanceof g3.d)) {
                    ((g3.d) kVar).f41451s = true;
                }
                if (this.f40451h) {
                    g9.k kVar2 = this.f40446c;
                    long j12 = this.f40452i;
                    n2.k kVar3 = (n2.k) kVar2.f41771c;
                    kVar3.getClass();
                    kVar3.seek(j10, j12);
                    this.f40451h = false;
                }
                while (iB == 0 && !this.f40450g) {
                    try {
                        l1.f fVar = this.f40448e;
                        synchronized (fVar) {
                            while (!fVar.f44786b) {
                                try {
                                    fVar.f44785a.getClass();
                                    fVar.wait();
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                        g9.k kVar4 = this.f40446c;
                        q2 q2Var = this.f40449f;
                        n2.k kVar5 = (n2.k) kVar4.f41771c;
                        kVar5.getClass();
                        n2.h hVar = (n2.h) kVar4.f41772d;
                        hVar.getClass();
                        iB = kVar5.b(hVar, q2Var);
                        long jR = this.f40446c.r();
                        if (jR > this.f40455m.f40482i + j10) {
                            l1.f fVar2 = this.f40448e;
                            synchronized (fVar2) {
                                fVar2.f44786b = false;
                            }
                            v0 v0Var2 = this.f40455m;
                            v0Var2.f40489q.post(v0Var2.f40488p);
                            j10 = jR;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (iB == 1) {
                    iB = 0;
                } else if (this.f40446c.r() != -1) {
                    this.f40449f.f18888a = this.f40446c.r();
                }
                com.google.android.gms.internal.auth.i.e(this.f40445b);
            } catch (Throwable th3) {
                if (iB != 1 && this.f40446c.r() != -1) {
                    this.f40449f.f18888a = this.f40446c.r();
                }
                com.google.android.gms.internal.auth.i.e(this.f40445b);
                throw th3;
            }
        }
    }
}
