package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes2.dex */
public final class EI {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2412Ff f3019a;
    public final Qa0 b;
    public final CI c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f;
    public final Object g;
    public boolean h;
    public final boolean i;

    public EI(Looper looper, InterfaceC2412Ff interfaceC2412Ff, CI ci) {
        this(new CopyOnWriteArraySet(), looper, interfaceC2412Ff, ci);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.g) {
            try {
                if (this.h) {
                    return;
                }
                this.d.add(new DI(obj));
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
        Qa0 qa0 = this.b;
        if (!qa0.f3608a.hasMessages(0)) {
            qa0.getClass();
            Pa0 pa0B = Qa0.b();
            pa0B.f3557a = qa0.f3608a.obtainMessage(0);
            qa0.getClass();
            Message message = pa0B.f3557a;
            message.getClass();
            qa0.f3608a.sendMessageAtFrontOfQueue(message);
            pa0B.a();
        }
        ArrayDeque arrayDeque2 = this.e;
        boolean z = !arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (z) {
            return;
        }
        while (!arrayDeque2.isEmpty()) {
            ((Runnable) arrayDeque2.peekFirst()).run();
            arrayDeque2.removeFirst();
        }
    }

    public final void c(int i, BI bi) {
        f();
        this.f.add(new RunnableC2602Mo(new CopyOnWriteArraySet(this.d), i, bi, 3));
    }

    public final void d() {
        f();
        synchronized (this.g) {
            this.h = true;
        }
        for (DI di : this.d) {
            CI ci = this.c;
            di.d = true;
            if (di.c) {
                di.c = false;
                ci.b(di.f2965a, di.b.b());
            }
        }
        this.d.clear();
    }

    public final void e(int i, BI bi) {
        c(i, bi);
        b();
    }

    public final void f() {
        if (this.i) {
            FW.s(Thread.currentThread() == this.b.f3608a.getLooper().getThread());
        }
    }

    public EI(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, InterfaceC2412Ff interfaceC2412Ff, CI ci) {
        this.f3019a = interfaceC2412Ff;
        this.d = copyOnWriteArraySet;
        this.c = ci;
        this.g = new Object();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.b = ((Oa0) interfaceC2412Ff).a(looper, new W9(this, 3));
        this.i = true;
    }
}
