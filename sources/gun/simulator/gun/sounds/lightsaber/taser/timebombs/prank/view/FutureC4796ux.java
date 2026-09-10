package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ux, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class FutureC4796ux implements Future {
    public static final C4708tx Companion = new C4708tx(null);
    private static final String TAG = FutureC4796ux.class.getSimpleName();
    private final Future<Object> future;

    public FutureC4796ux(Future<Object> future) {
        this.future = future;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        Future<Object> future = this.future;
        if (future != null) {
            return future.cancel(z);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        AbstractC2995aW.q(timeUnit, "unit");
        try {
            Future<Object> future = this.future;
            if (future != null) {
                return future.get(j, timeUnit);
            }
            return null;
        } catch (InterruptedException unused) {
            C4829vJ c4829vJ = C4917wJ.Companion;
            String str = TAG;
            AbstractC2995aW.p(str, "TAG");
            c4829vJ.w(str, "future.get() Interrupted on Thread " + Thread.currentThread().getName());
            Thread.currentThread().interrupt();
            return null;
        } catch (ExecutionException e) {
            C4829vJ c4829vJ2 = C4917wJ.Companion;
            String str2 = TAG;
            AbstractC2995aW.p(str2, "TAG");
            c4829vJ2.e(str2, "error on execution", e);
            return null;
        } catch (TimeoutException e2) {
            C4829vJ c4829vJ3 = C4917wJ.Companion;
            String str3 = TAG;
            AbstractC2995aW.p(str3, "TAG");
            c4829vJ3.e(str3, "error on timeout", e2);
            AbstractC2995aW.p(str3, "TAG");
            c4829vJ3.w(str3, "future.get() Timeout on Thread " + Thread.currentThread().getName());
            return null;
        }
    }

    public final Future<Object> getFuture() {
        return this.future;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        Future<Object> future = this.future;
        if (future != null) {
            return future.isCancelled();
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Future<Object> future = this.future;
        if (future != null) {
            return future.isDone();
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        try {
            Future<Object> future = this.future;
            if (future != null) {
                return future.get();
            }
            return null;
        } catch (InterruptedException unused) {
            C4829vJ c4829vJ = C4917wJ.Companion;
            String str = TAG;
            AbstractC2995aW.p(str, "TAG");
            c4829vJ.w(str, "future.get() Interrupted on Thread " + Thread.currentThread().getName());
            Thread.currentThread().interrupt();
            return null;
        } catch (ExecutionException e) {
            C4829vJ c4829vJ2 = C4917wJ.Companion;
            String str2 = TAG;
            AbstractC2995aW.p(str2, "TAG");
            c4829vJ2.e(str2, "error on execution", e);
            return null;
        }
    }
}
