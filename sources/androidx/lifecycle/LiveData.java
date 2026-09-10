package androidx.lifecycle;

import android.os.Looper;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.arch.core.internal.SafeIterableMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class LiveData<T> {
    public static final Object k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5245a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SafeIterableMap f5246b = new SafeIterableMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5247c = 0;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f5248e;
    public volatile Object f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5249h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f5250i;
    public final Runnable j;

    public class AlwaysActiveObserver extends LiveData<T>.ObserverWrapper {
        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        public final boolean d() {
            return true;
        }
    }

    public class LifecycleBoundObserver extends LiveData<T>.ObserverWrapper implements LifecycleEventObserver {
        public final Object f0;

        public LifecycleBoundObserver(LifecycleOwner lifecycleOwner, Observer observer) {
            super(observer);
            this.f0 = lifecycleOwner;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.LifecycleOwner, java.lang.Object] */
        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        public final void b() {
            this.f0.getLifecycle().c(this);
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        public final boolean c(LifecycleOwner lifecycleOwner) {
            return this.f0 == lifecycleOwner;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.LifecycleOwner, java.lang.Object] */
        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        public final boolean d() {
            return this.f0.getLifecycle().b().compareTo(Lifecycle.State.e0) >= 0;
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.LifecycleOwner, java.lang.Object] */
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            ?? r3 = this.f0;
            Lifecycle.State stateB = r3.getLifecycle().b();
            if (stateB == Lifecycle.State.X) {
                LiveData.this.i(this.X);
                return;
            }
            Lifecycle.State state = null;
            while (state != stateB) {
                a(d());
                state = stateB;
                stateB = r3.getLifecycle().b();
            }
        }
    }

    public abstract class ObserverWrapper {
        public final Observer X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public boolean f5251Y;
        public int Z = -1;

        public ObserverWrapper(Observer observer) {
            this.X = observer;
        }

        public final void a(boolean z2) {
            if (z2 == this.f5251Y) {
                return;
            }
            this.f5251Y = z2;
            int i2 = z2 ? 1 : -1;
            LiveData liveData = LiveData.this;
            int i3 = liveData.f5247c;
            liveData.f5247c = i2 + i3;
            if (!liveData.d) {
                liveData.d = true;
                while (true) {
                    try {
                        int i4 = liveData.f5247c;
                        if (i3 == i4) {
                            break;
                        }
                        boolean z3 = i3 == 0 && i4 > 0;
                        boolean z4 = i3 > 0 && i4 == 0;
                        if (z3) {
                            liveData.g();
                        } else if (z4) {
                            liveData.h();
                        }
                        i3 = i4;
                    } catch (Throwable th) {
                        liveData.d = false;
                        throw th;
                    }
                }
                liveData.d = false;
            }
            if (this.f5251Y) {
                liveData.d(this);
            }
        }

        public void b() {
        }

        public boolean c(LifecycleOwner lifecycleOwner) {
            return false;
        }

        public abstract boolean d();
    }

    public LiveData() {
        Object obj = k;
        this.f = obj;
        this.j = new Runnable() { // from class: androidx.lifecycle.LiveData.1
            @Override // java.lang.Runnable
            public final void run() {
                Object obj2;
                synchronized (LiveData.this.f5245a) {
                    obj2 = LiveData.this.f;
                    LiveData.this.f = LiveData.k;
                }
                LiveData.this.j(obj2);
            }
        };
        this.f5248e = obj;
        this.g = -1;
    }

    public static void b(String str) {
        ArchTaskExecutor.a().f3676a.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(android.support.v4.media.a.n("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void c(ObserverWrapper observerWrapper) {
        if (observerWrapper.f5251Y) {
            if (!observerWrapper.d()) {
                observerWrapper.a(false);
                return;
            }
            int i2 = observerWrapper.Z;
            int i3 = this.g;
            if (i2 >= i3) {
                return;
            }
            observerWrapper.Z = i3;
            observerWrapper.X.a(this.f5248e);
        }
    }

    public final void d(ObserverWrapper observerWrapper) {
        if (this.f5249h) {
            this.f5250i = true;
            return;
        }
        this.f5249h = true;
        do {
            this.f5250i = false;
            if (observerWrapper != null) {
                c(observerWrapper);
                observerWrapper = null;
            } else {
                SafeIterableMap safeIterableMap = this.f5246b;
                safeIterableMap.getClass();
                SafeIterableMap.IteratorWithAdditions iteratorWithAdditions = new SafeIterableMap.IteratorWithAdditions();
                safeIterableMap.Z.put(iteratorWithAdditions, Boolean.FALSE);
                while (iteratorWithAdditions.hasNext()) {
                    c((ObserverWrapper) ((Map.Entry) iteratorWithAdditions.next()).getValue());
                    if (this.f5250i) {
                        break;
                    }
                }
            }
        } while (this.f5250i);
        this.f5249h = false;
    }

    public final void e(LifecycleOwner lifecycleOwner, Observer observer) {
        b("observe");
        if (lifecycleOwner.getLifecycle().b() == Lifecycle.State.X) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(lifecycleOwner, observer);
        ObserverWrapper observerWrapper = (ObserverWrapper) this.f5246b.c(observer, lifecycleBoundObserver);
        if (observerWrapper != null && !observerWrapper.c(lifecycleOwner)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (observerWrapper != null) {
            return;
        }
        lifecycleOwner.getLifecycle().a(lifecycleBoundObserver);
    }

    public final void f(Observer observer) {
        b("observeForever");
        AlwaysActiveObserver alwaysActiveObserver = new AlwaysActiveObserver(observer);
        ObserverWrapper observerWrapper = (ObserverWrapper) this.f5246b.c(observer, alwaysActiveObserver);
        if (observerWrapper instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (observerWrapper != null) {
            return;
        }
        alwaysActiveObserver.a(true);
    }

    public void g() {
    }

    public void h() {
    }

    public void i(Observer observer) {
        b("removeObserver");
        ObserverWrapper observerWrapper = (ObserverWrapper) this.f5246b.d(observer);
        if (observerWrapper == null) {
            return;
        }
        observerWrapper.b();
        observerWrapper.a(false);
    }

    public void j(Object obj) {
        b("setValue");
        this.g++;
        this.f5248e = obj;
        d(null);
    }
}
