package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class FX implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2539Kc f3069a;
    public volatile AtomicInteger b;
    public final /* synthetic */ IX c;

    public FX(IX ix, InterfaceC2539Kc interfaceC2539Kc) {
        AbstractC2995aW.q(ix, "this$0");
        AbstractC2995aW.q(interfaceC2539Kc, "responseCallback");
        this.c = ix;
        this.f3069a = interfaceC2539Kc;
        this.b = new AtomicInteger(0);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th;
        boolean z;
        IOException e;
        C3605hO c3605hO;
        String strV0 = AbstractC2995aW.v0(this.c.b.f3175a.g(), "OkHttp ");
        IX ix = this.c;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(strV0);
        try {
            ix.f.h();
            try {
                try {
                    z = true;
                    try {
                        this.f3069a.onResponse(ix, ix.g());
                        c3605hO = ix.f3221a.f5131a;
                    } catch (IOException e2) {
                        e = e2;
                        if (z) {
                            C5104yU c5104yU = C5104yU.f5278a;
                            C5104yU c5104yU2 = C5104yU.f5278a;
                            String strV1 = AbstractC2995aW.v0(IX.a(ix), "Callback failure for ");
                            c5104yU2.getClass();
                            C5104yU.i(4, strV1, e);
                        } else {
                            this.f3069a.onFailure(ix, e);
                        }
                        c3605hO = ix.f3221a.f5131a;
                    } catch (Throwable th2) {
                        th = th2;
                        ix.cancel();
                        if (!z) {
                            IOException iOException = new IOException(AbstractC2995aW.v0(th, "canceled due to "));
                            AbstractC2995aW.h(iOException, th);
                            this.f3069a.onFailure(ix, iOException);
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                    z = false;
                } catch (Throwable th3) {
                    th = th3;
                    z = false;
                }
                c3605hO.g(this);
                threadCurrentThread.setName(name);
            } catch (Throwable th4) {
                ix.f3221a.f5131a.g(this);
                throw th4;
            }
        } catch (Throwable th5) {
            threadCurrentThread.setName(name);
            throw th5;
        }
    }
}
