package sg.bigo.ads.core.d.c;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.common.n.c;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Handler f48381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ExecutorService f48382b = Executors.newFixedThreadPool(1, new c("Stat-Worker"));

    /* JADX INFO: renamed from: sg.bigo.ads.core.d.c.a$a, reason: collision with other inner class name */
    public static class C0868a extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Future f48384c;

        public C0868a(Runnable runnable) {
            super(runnable);
        }

        @Override // sg.bigo.ads.core.d.c.a.b
        public final void a() {
            Runnable runnable = this.f48385a;
            if (runnable != null) {
                this.f48384c = a.a(runnable);
            }
        }
    }

    public static abstract class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f48385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicBoolean f48386b = new AtomicBoolean(false);

        public b(Runnable runnable) {
            this.f48385a = runnable;
        }

        public abstract void a();

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f48386b.get()) {
                return;
            }
            a();
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("BGAd-Stat-Handler");
        handlerThread.start();
        f48381a = new Handler(handlerThread.getLooper());
    }

    public static Future a(final Runnable runnable) {
        return f48382b.submit(new Runnable() { // from class: sg.bigo.ads.core.d.c.a.1
            @Override // java.lang.Runnable
            public final void run() {
                StringBuilder sb;
                try {
                    runnable.run();
                } catch (Exception e2) {
                    e = e2;
                    sb = new StringBuilder("stat thread get exception:");
                    sb.append(e.getLocalizedMessage());
                    sg.bigo.ads.common.t.a.a(0, "Stats", sb.toString());
                } catch (Throwable th) {
                    e = th;
                    sb = new StringBuilder("stat thread get throwable:");
                    sb.append(e.getLocalizedMessage());
                    sg.bigo.ads.common.t.a.a(0, "Stats", sb.toString());
                }
            }
        });
    }

    public static b a(Runnable runnable, long j) {
        C0868a c0868a = new C0868a(runnable);
        f48381a.postDelayed(c0868a, j);
        return c0868a;
    }

    public static void a(b bVar) {
        Future future;
        if (bVar != null) {
            bVar.f48386b.set(true);
            if (bVar instanceof C0868a) {
                C0868a c0868a = (C0868a) bVar;
                if (c0868a.f48384c != null && (future = c0868a.f48384c) != null && !future.isCancelled() && !future.isDone()) {
                    future.cancel(true);
                }
            }
            f48381a.removeCallbacks(bVar);
        }
    }
}
