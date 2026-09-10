package bo;

import com.google.android.gms.internal.ads.ws;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.n;
import qk.i0;
import xn.q;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xn.e f5781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile AtomicInteger f5782b = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f5783c;

    public f(i iVar, xn.e eVar) {
        this.f5783c = iVar;
        this.f5781a = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ws wsVar;
        q qVar;
        xn.m mVar = this.f5783c.f5787b.f54060a;
        mVar.getClass();
        try {
            wsVar = new ws();
            wsVar.c(mVar, "/...");
        } catch (IllegalArgumentException unused) {
            wsVar = null;
        }
        n.c(wsVar);
        boolean z10 = false;
        wsVar.f21596d = xn.b.b("", 0, 0, 251, " \"':;<=>@[]^`{}|/\\?#");
        wsVar.f21597e = xn.b.b("", 0, 0, 251, " \"':;<=>@[]^`{}|/\\?#");
        String strConcat = "OkHttp ".concat(wsVar.a().f53996h);
        i iVar = this.f5783c;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(strConcat);
        try {
            try {
                iVar.f5789d.h();
                try {
                    z10 = true;
                    this.f5781a.onResponse(iVar, iVar.i());
                    qVar = iVar.f5786a;
                } catch (IOException e10) {
                    if (z10) {
                        go.m mVar2 = go.m.f42045a;
                        go.m mVar3 = go.m.f42045a;
                        String str = "Callback failure for " + i.a(iVar);
                        mVar3.getClass();
                        go.m.g(str, 4, e10);
                    } else {
                        this.f5781a.onFailure(iVar, e10);
                    }
                    qVar = iVar.f5786a;
                } catch (Throwable th2) {
                    iVar.cancel();
                    if (!z10) {
                        IOException iOException = new IOException("canceled due to " + th2);
                        i0.c(iOException, th2);
                        this.f5781a.onFailure(iVar, iOException);
                    }
                    throw th2;
                }
                qVar.f54027a.p(this);
                threadCurrentThread.setName(name);
            } catch (Throwable th3) {
                threadCurrentThread.setName(name);
                throw th3;
            }
        } catch (Throwable th4) {
            iVar.f5786a.f54027a.p(this);
            throw th4;
        }
    }
}
