package sg.bigo.ads.core.b.c;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.common.n.c;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Handler f48317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ExecutorService f48318b = Executors.newFixedThreadPool(1, new c("Callback-Worker"));

    public static class a extends AbstractRunnableC0865b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Future f48320c;

        public a(Runnable runnable) {
            super(runnable);
        }

        @Override // sg.bigo.ads.core.b.c.b.AbstractRunnableC0865b
        public final void a() {
            Runnable runnable = this.f48321a;
            if (runnable != null) {
                this.f48320c = b.a(runnable);
            }
        }
    }

    /* JADX INFO: renamed from: sg.bigo.ads.core.b.c.b$b, reason: collision with other inner class name */
    public static abstract class AbstractRunnableC0865b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f48321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicBoolean f48322b = new AtomicBoolean(false);

        public AbstractRunnableC0865b(Runnable runnable) {
            this.f48321a = runnable;
        }

        public abstract void a();

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f48322b.get()) {
                return;
            }
            a();
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("BGAd-Callback-Handler");
        handlerThread.start();
        f48317a = new Handler(handlerThread.getLooper());
    }

    public static Future<?> a(final Runnable runnable) {
        return f48318b.submit(new Runnable() { // from class: sg.bigo.ads.core.b.c.b.1
            @Override // java.lang.Runnable
            public final void run() {
                StringBuilder sb;
                try {
                    runnable.run();
                } catch (Exception e2) {
                    e = e2;
                    sb = new StringBuilder("callback thread get exception:");
                    sb.append(e.getLocalizedMessage());
                    sg.bigo.ads.core.b.c.a.a(sb.toString());
                } catch (Throwable th) {
                    e = th;
                    sb = new StringBuilder("callback thread get throwable:");
                    sb.append(e.getLocalizedMessage());
                    sg.bigo.ads.core.b.c.a.a(sb.toString());
                }
            }
        });
    }

    public static AbstractRunnableC0865b a(Runnable runnable, long j) {
        a aVar = new a(runnable);
        f48317a.postDelayed(aVar, j);
        return aVar;
    }

    public static void a(AbstractRunnableC0865b abstractRunnableC0865b) {
        Future future;
        if (abstractRunnableC0865b != null) {
            abstractRunnableC0865b.f48322b.set(true);
            if (abstractRunnableC0865b instanceof a) {
                a aVar = (a) abstractRunnableC0865b;
                if (aVar.f48320c != null && (future = aVar.f48320c) != null && !future.isCancelled() && !future.isDone()) {
                    future.cancel(true);
                }
            }
            f48317a.removeCallbacks(abstractRunnableC0865b);
        }
    }
}
