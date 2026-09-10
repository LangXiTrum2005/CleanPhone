package androidx.media3.common.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.FlagSet;
import androidx.media3.common.Player;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class ListenerSet<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clock f5640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerWrapper f5641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IterationFinishedEvent f5642c;
    public final CopyOnWriteArraySet d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayDeque f5643e;
    public final ArrayDeque f;
    public final Object g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5644h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f5645i;

    public interface Event<T> {
        void invoke(Object obj);
    }

    public interface IterationFinishedEvent<T> {
        void c(Object obj, FlagSet flagSet);
    }

    public static final class ListenerHolder<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f5646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public FlagSet.Builder f5647b = new FlagSet.Builder();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f5648c;
        public boolean d;

        public ListenerHolder(Object obj) {
            this.f5646a = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || ListenerHolder.class != obj.getClass()) {
                return false;
            }
            return this.f5646a.equals(((ListenerHolder) obj).f5646a);
        }

        public final int hashCode() {
            return this.f5646a.hashCode();
        }
    }

    public ListenerSet(Looper looper, Clock clock, IterationFinishedEvent iterationFinishedEvent) {
        this(new CopyOnWriteArraySet(), looper, clock, iterationFinishedEvent, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.g) {
            try {
                if (this.f5644h) {
                    return;
                }
                this.d.add(new ListenerHolder(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        g();
        ArrayDeque arrayDeque = this.f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        HandlerWrapper handlerWrapper = this.f5641b;
        if (!handlerWrapper.a()) {
            handlerWrapper.d(handlerWrapper.obtainMessage(1));
        }
        ArrayDeque arrayDeque2 = this.f5643e;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void c(final int i2, final Event event) {
        g();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.d);
        this.f.add(new Runnable() { // from class: androidx.media3.common.util.b
            @Override // java.lang.Runnable
            public final void run() {
                for (ListenerSet.ListenerHolder listenerHolder : copyOnWriteArraySet) {
                    if (!listenerHolder.d) {
                        int i3 = i2;
                        if (i3 != -1) {
                            listenerHolder.f5647b.a(i3);
                        }
                        listenerHolder.f5648c = true;
                        event.invoke(listenerHolder.f5646a);
                    }
                }
            }
        });
    }

    public final void d() {
        g();
        synchronized (this.g) {
            this.f5644h = true;
        }
        for (ListenerHolder listenerHolder : this.d) {
            IterationFinishedEvent iterationFinishedEvent = this.f5642c;
            listenerHolder.d = true;
            if (listenerHolder.f5648c) {
                listenerHolder.f5648c = false;
                iterationFinishedEvent.c(listenerHolder.f5646a, listenerHolder.f5647b.b());
            }
        }
        this.d.clear();
    }

    public final void e(Player.Listener listener) {
        g();
        CopyOnWriteArraySet<ListenerHolder> copyOnWriteArraySet = this.d;
        for (ListenerHolder listenerHolder : copyOnWriteArraySet) {
            if (listenerHolder.f5646a.equals(listener)) {
                listenerHolder.d = true;
                if (listenerHolder.f5648c) {
                    listenerHolder.f5648c = false;
                    FlagSet flagSetB = listenerHolder.f5647b.b();
                    this.f5642c.c(listenerHolder.f5646a, flagSetB);
                }
                copyOnWriteArraySet.remove(listenerHolder);
            }
        }
    }

    public final void f(int i2, Event event) {
        c(i2, event);
        b();
    }

    public final void g() {
        if (this.f5645i) {
            Assertions.e(Thread.currentThread() == this.f5641b.getLooper().getThread());
        }
    }

    public ListenerSet(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Clock clock, IterationFinishedEvent iterationFinishedEvent, boolean z2) {
        this.f5640a = clock;
        this.d = copyOnWriteArraySet;
        this.f5642c = iterationFinishedEvent;
        this.g = new Object();
        this.f5643e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.f5641b = clock.createHandler(looper, new Handler.Callback() { // from class: androidx.media3.common.util.a
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                ListenerSet listenerSet = this.X;
                for (ListenerSet.ListenerHolder listenerHolder : listenerSet.d) {
                    if (!listenerHolder.d && listenerHolder.f5648c) {
                        FlagSet flagSetB = listenerHolder.f5647b.b();
                        listenerHolder.f5647b = new FlagSet.Builder();
                        listenerHolder.f5648c = false;
                        listenerSet.f5642c.c(listenerHolder.f5646a, flagSetB);
                    }
                    if (listenerSet.f5641b.a()) {
                        return true;
                    }
                }
                return true;
            }
        });
        this.f5645i = z2;
    }
}
