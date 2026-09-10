package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class ListenerSet<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clock f18910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerWrapper f18911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IterationFinishedEvent f18912c;
    public final CopyOnWriteArraySet d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayDeque f18913e;
    public final ArrayDeque f;
    public final Object g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f18914h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f18915i;

    public interface Event<T> {
        void invoke(Object obj);
    }

    public interface IterationFinishedEvent<T> {
        void f(Object obj, FlagSet flagSet);
    }

    public static final class ListenerHolder<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f18916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public FlagSet.Builder f18917b = new FlagSet.Builder();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f18918c;
        public boolean d;

        public ListenerHolder(Object obj) {
            this.f18916a = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || ListenerHolder.class != obj.getClass()) {
                return false;
            }
            return this.f18916a.equals(((ListenerHolder) obj).f18916a);
        }

        public final int hashCode() {
            return this.f18916a.hashCode();
        }
    }

    public ListenerSet(Looper looper, Clock clock, IterationFinishedEvent iterationFinishedEvent) {
        this(new CopyOnWriteArraySet(), looper, clock, iterationFinishedEvent);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.g) {
            try {
                if (this.f18914h) {
                    return;
                }
                this.d.add(new ListenerHolder(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        f();
        ArrayDeque arrayDeque = this.f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        HandlerWrapper handlerWrapper = this.f18911b;
        if (!handlerWrapper.a()) {
            handlerWrapper.d(handlerWrapper.obtainMessage(0));
        }
        ArrayDeque arrayDeque2 = this.f18913e;
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
        f();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.d);
        this.f.add(new Runnable() { // from class: com.google.android.exoplayer2.util.a
            @Override // java.lang.Runnable
            public final void run() {
                for (ListenerSet.ListenerHolder listenerHolder : copyOnWriteArraySet) {
                    if (!listenerHolder.d) {
                        int i3 = i2;
                        if (i3 != -1) {
                            listenerHolder.f18917b.a(i3);
                        }
                        listenerHolder.f18918c = true;
                        event.invoke(listenerHolder.f18916a);
                    }
                }
            }
        });
    }

    public final void d() {
        f();
        synchronized (this.g) {
            this.f18914h = true;
        }
        for (ListenerHolder listenerHolder : this.d) {
            IterationFinishedEvent iterationFinishedEvent = this.f18912c;
            listenerHolder.d = true;
            if (listenerHolder.f18918c) {
                listenerHolder.f18918c = false;
                iterationFinishedEvent.f(listenerHolder.f18916a, listenerHolder.f18917b.b());
            }
        }
        this.d.clear();
    }

    public final void e(int i2, Event event) {
        c(i2, event);
        b();
    }

    public final void f() {
        if (this.f18915i) {
            Assertions.d(Thread.currentThread() == this.f18911b.getLooper().getThread());
        }
    }

    public ListenerSet(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Clock clock, IterationFinishedEvent iterationFinishedEvent) {
        this.f18910a = clock;
        this.d = copyOnWriteArraySet;
        this.f18912c = iterationFinishedEvent;
        this.g = new Object();
        this.f18913e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.f18911b = clock.createHandler(looper, new Handler.Callback() { // from class: com.google.android.exoplayer2.util.b
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                ListenerSet listenerSet = this.X;
                for (ListenerSet.ListenerHolder listenerHolder : listenerSet.d) {
                    if (!listenerHolder.d && listenerHolder.f18918c) {
                        FlagSet flagSetB = listenerHolder.f18917b.b();
                        listenerHolder.f18917b = new FlagSet.Builder();
                        listenerHolder.f18918c = false;
                        listenerSet.f18912c.f(listenerHolder.f18916a, flagSetB);
                    }
                    if (listenerSet.f18911b.a()) {
                        return true;
                    }
                }
                return true;
            }
        });
        this.f18915i = true;
    }
}
