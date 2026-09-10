package fo;

import com.applovin.shadow.okhttp3.internal.http2.Header;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class o implements co.e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f41278g = yn.a.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", Header.TARGET_METHOD_UTF8, Header.TARGET_PATH_UTF8, Header.TARGET_SCHEME_UTF8, Header.TARGET_AUTHORITY_UTF8);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List f41279h = yn.a.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bo.k f41280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final co.g f41281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f41282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile v f41283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xn.r f41284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f41285f;

    public o(xn.q qVar, bo.k kVar, co.g gVar, n http2Connection) {
        kotlin.jvm.internal.n.f(http2Connection, "http2Connection");
        this.f41280a = kVar;
        this.f41281b = gVar;
        this.f41282c = http2Connection;
        List list = qVar.f54043r;
        xn.r rVar = xn.r.H2_PRIOR_KNOWLEDGE;
        this.f41284e = list.contains(rVar) ? rVar : xn.r.HTTP_2;
    }

    @Override // co.e
    public final lo.t a(xn.w wVar) {
        v vVar = this.f41283d;
        kotlin.jvm.internal.n.c(vVar);
        return vVar.f41315i;
    }

    @Override // co.e
    public final lo.r b(xn.s sVar, long j10) {
        v vVar = this.f41283d;
        kotlin.jvm.internal.n.c(vVar);
        return vVar.f();
    }

    @Override // co.e
    public final long c(xn.w wVar) {
        if (co.f.a(wVar)) {
            return yn.a.j(wVar);
        }
        return 0L;
    }

    @Override // co.e
    public final void cancel() {
        this.f41285f = true;
        v vVar = this.f41283d;
        if (vVar != null) {
            vVar.e(9);
        }
    }

    @Override // co.e
    public final void d(xn.s sVar) throws IOException {
        int i10;
        v vVar;
        boolean z10;
        if (this.f41283d != null) {
            return;
        }
        boolean z11 = sVar.f54063d != null;
        xn.l lVar = sVar.f54062c;
        ArrayList arrayList = new ArrayList(lVar.size() + 4);
        arrayList.add(new b(b.f41206f, sVar.f54061b));
        lo.h hVar = b.f41207g;
        xn.m url = sVar.f54060a;
        kotlin.jvm.internal.n.f(url, "url");
        String strB = url.b();
        String strD = url.d();
        if (strD != null) {
            strB = strB + '?' + strD;
        }
        arrayList.add(new b(hVar, strB));
        String strB2 = sVar.f54062c.b("Host");
        if (strB2 != null) {
            arrayList.add(new b(b.f41209i, strB2));
        }
        arrayList.add(new b(b.f41208h, url.f53989a));
        int size = lVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            String strH = lVar.h(i11);
            Locale US = Locale.US;
            kotlin.jvm.internal.n.e(US, "US");
            String lowerCase = strH.toLowerCase(US);
            kotlin.jvm.internal.n.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f41278g.contains(lowerCase) || (lowerCase.equals("te") && kotlin.jvm.internal.n.a(lVar.q(i11), "trailers"))) {
                arrayList.add(new b(lowerCase, lVar.q(i11)));
            }
        }
        n nVar = this.f41282c;
        nVar.getClass();
        boolean z12 = !z11;
        synchronized (nVar.f41275w) {
            synchronized (nVar) {
                try {
                    if (nVar.f41258e > 1073741823) {
                        nVar.d(8);
                    }
                    if (nVar.f41259f) {
                        throw new a();
                    }
                    i10 = nVar.f41258e;
                    nVar.f41258e = i10 + 2;
                    vVar = new v(i10, nVar, z12, false, null);
                    z10 = !z11 || nVar.f41272t >= nVar.f41273u || vVar.f41311e >= vVar.f41312f;
                    if (vVar.h()) {
                        nVar.f41255b.put(Integer.valueOf(i10), vVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            nVar.f41275w.h(i10, arrayList, z12);
        }
        if (z10) {
            nVar.f41275w.flush();
        }
        this.f41283d = vVar;
        if (this.f41285f) {
            v vVar2 = this.f41283d;
            kotlin.jvm.internal.n.c(vVar2);
            vVar2.e(9);
            throw new IOException("Canceled");
        }
        v vVar3 = this.f41283d;
        kotlin.jvm.internal.n.c(vVar3);
        u uVar = vVar3.f41317k;
        long j10 = this.f41281b.f6801g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        uVar.g(j10);
        v vVar4 = this.f41283d;
        kotlin.jvm.internal.n.c(vVar4);
        vVar4.l.g(this.f41281b.f6802h);
    }

    @Override // co.e
    public final void finishRequest() {
        v vVar = this.f41283d;
        kotlin.jvm.internal.n.c(vVar);
        vVar.f().close();
    }

    @Override // co.e
    public final void flushRequest() {
        this.f41282c.flush();
    }

    @Override // co.e
    public final bo.k getConnection() {
        return this.f41280a;
    }

    @Override // co.e
    public final xn.v readResponseHeaders(boolean z10) throws IOException {
        xn.l lVar;
        v vVar = this.f41283d;
        if (vVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (vVar) {
            vVar.f41317k.h();
            while (vVar.f41313g.isEmpty() && vVar.f41318m == 0) {
                try {
                    try {
                        vVar.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th2) {
                    vVar.f41317k.k();
                    throw th2;
                }
            }
            vVar.f41317k.k();
            if (vVar.f41313g.isEmpty()) {
                IOException iOException = vVar.f41319n;
                if (iOException != null) {
                    throw iOException;
                }
                int i10 = vVar.f41318m;
                d5.u.t(i10);
                throw new a0(i10);
            }
            Object objRemoveFirst = vVar.f41313g.removeFirst();
            kotlin.jvm.internal.n.e(objRemoveFirst, "headersQueue.removeFirst()");
            lVar = (xn.l) objRemoveFirst;
        }
        xn.r protocol = this.f41284e;
        kotlin.jvm.internal.n.f(protocol, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = lVar.size();
        b2.p pVarA = null;
        for (int i11 = 0; i11 < size; i11++) {
            String name = lVar.h(i11);
            String value = lVar.q(i11);
            if (kotlin.jvm.internal.n.a(name, Header.RESPONSE_STATUS_UTF8)) {
                pVarA = com.google.android.gms.internal.auth.i.A("HTTP/1.1 " + value);
            } else if (!f41279h.contains(name)) {
                kotlin.jvm.internal.n.f(name, "name");
                kotlin.jvm.internal.n.f(value, "value");
                arrayList.add(name);
                arrayList.add(an.h.T0(value).toString());
            }
        }
        if (pVarA == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        xn.v vVar2 = new xn.v();
        vVar2.f54070b = protocol;
        vVar2.f54071c = pVarA.f5363b;
        vVar2.f54072d = (String) pVarA.f5365d;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        h2.d dVar = new h2.d(4, false);
        xj.t.b0(dVar.f42079a, strArr);
        vVar2.f54074f = dVar;
        if (z10 && vVar2.f54071c == 100) {
            return null;
        }
        return vVar2;
    }
}
