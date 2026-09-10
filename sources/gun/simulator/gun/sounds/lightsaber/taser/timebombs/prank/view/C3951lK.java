package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.lK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3951lK {
    public static final ExecutorService e = Executors.newCachedThreadPool(new ThreadFactoryC4039mK());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f4643a = new LinkedHashSet(1);
    public final LinkedHashSet b = new LinkedHashSet(1);
    public final Handler c = new Handler(Looper.getMainLooper());
    public volatile C3775jK d = null;

    public C3951lK(MJ mj) {
        f(new C3775jK(mj));
    }

    public final synchronized void a(InterfaceC3513gK interfaceC3513gK) {
        Throwable th;
        try {
            C3775jK c3775jK = this.d;
            if (c3775jK != null && (th = c3775jK.b) != null) {
                interfaceC3513gK.onResult(th);
            }
            this.b.add(interfaceC3513gK);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(InterfaceC3513gK interfaceC3513gK) {
        Object obj;
        try {
            C3775jK c3775jK = this.d;
            if (c3775jK != null && (obj = c3775jK.f4549a) != null) {
                interfaceC3513gK.onResult(obj);
            }
            this.f4643a.add(interfaceC3513gK);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(Throwable th) {
        ArrayList arrayList = new ArrayList(this.b);
        if (arrayList.isEmpty()) {
            AbstractC5005xJ.c("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC3513gK) it.next()).onResult(th);
        }
    }

    public final void d() {
        C3775jK c3775jK = this.d;
        if (c3775jK == null) {
            return;
        }
        Object obj = c3775jK.f4549a;
        if (obj == null) {
            c(c3775jK.b);
            return;
        }
        synchronized (this) {
            Iterator it = new ArrayList(this.f4643a).iterator();
            while (it.hasNext()) {
                ((InterfaceC3513gK) it.next()).onResult(obj);
            }
        }
    }

    public final synchronized void e(InterfaceC3513gK interfaceC3513gK) {
        this.b.remove(interfaceC3513gK);
    }

    public final void f(C3775jK c3775jK) {
        if (this.d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.d = c3775jK;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            d();
        } else {
            this.c.post(new RunnableC2928Zc(this, 3));
        }
    }

    public C3951lK(Callable callable, boolean z) {
        if (z) {
            try {
                f((C3775jK) callable.call());
                return;
            } catch (Throwable th) {
                f(new C3775jK(th));
                return;
            }
        }
        ExecutorService executorService = e;
        C3863kK c3863kK = new C3863kK(callable);
        c3863kK.f4594a = this;
        executorService.execute(c3863kK);
    }
}
