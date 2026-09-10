package sg.bigo.ads.common.g.a;

import java.util.LinkedList;
import java.util.concurrent.CountDownLatch;
import sg.bigo.ads.common.n.e;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final LinkedList<Runnable> f47228a = new LinkedList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object f47229b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final e f47230c;

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final CountDownLatch f47234a = new CountDownLatch(1);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Runnable f47235b = new Runnable() { // from class: sg.bigo.ads.common.g.a.c.a.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    a.this.f47234a.await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f47236c;

        public a(Runnable runnable) {
            this.f47236c = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f47236c.run();
            this.f47234a.countDown();
        }
    }

    public c() {
        e eVar = new e("Waitable", 1, 1);
        this.f47230c = eVar;
        eVar.allowCoreThreadTimeOut(true);
    }
}
