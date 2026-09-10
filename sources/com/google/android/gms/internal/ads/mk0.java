package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class mk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f17459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f17461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f17462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f17463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f17464f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f17465g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f17466h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f17467i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mk0(Thread thread, int i10) {
        this(new CopyOnWriteArraySet(), (Looper) null, thread, (s6) null, (xi0) null, true);
        switch (i10) {
            case 2:
                this(new CopyOnWriteArraySet(), (Looper) null, thread, (l1.u) null, (l1.l) null, true);
                break;
            default:
                break;
        }
    }

    public void a(Object obj) {
        obj.getClass();
        synchronized (this.f17467i) {
            try {
                if (this.f17459a) {
                    return;
                }
                ((CopyOnWriteArraySet) this.f17464f).add(new l1.m(obj));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b() {
        l1.w wVar = (l1.w) this.f17462d;
        ArrayDeque arrayDeque = (ArrayDeque) this.f17465g;
        f();
        ArrayDeque arrayDeque2 = (ArrayDeque) this.f17466h;
        if (arrayDeque2.isEmpty()) {
            return;
        }
        if (((l1.l) this.f17463e) != null) {
            wVar.getClass();
            Handler handler = wVar.f44825a;
            if (!handler.hasMessages(1)) {
                l1.v vVarB = l1.w.b();
                Message messageObtainMessage = handler.obtainMessage(1);
                vVarB.f44823a = messageObtainMessage;
                messageObtainMessage.getClass();
                handler.sendMessageAtFrontOfQueue(messageObtainMessage);
                vVarB.a();
            }
        }
        boolean zIsEmpty = arrayDeque.isEmpty();
        arrayDeque.addAll(arrayDeque2);
        arrayDeque2.clear();
        if (zIsEmpty) {
            while (!arrayDeque.isEmpty()) {
                ((Runnable) arrayDeque.peekFirst()).run();
                arrayDeque.removeFirst();
            }
        }
    }

    public void c(int i10, l1.k kVar) {
        f();
        ((ArrayDeque) this.f17466h).add(new com.applovin.mediation.nativeAds.adPlacer.a(i10, 5, new CopyOnWriteArraySet((CopyOnWriteArraySet) this.f17464f), kVar));
    }

    public void d() {
        f();
        synchronized (this.f17467i) {
            this.f17459a = true;
        }
        for (l1.m mVar : (CopyOnWriteArraySet) this.f17464f) {
            l1.l lVar = (l1.l) this.f17463e;
            mVar.f44799d = true;
            if (lVar != null && mVar.f44798c) {
                mVar.f44798c = false;
                lVar.a(mVar.f44796a, mVar.f44797b.b());
            }
        }
        ((CopyOnWriteArraySet) this.f17464f).clear();
    }

    public void e(int i10, l1.k kVar) {
        c(i10, kVar);
        b();
    }

    public void f() {
        if (this.f17460b) {
            go.k.t(Thread.currentThread() == ((Thread) this.f17461c));
        }
    }

    public void g(Object obj) {
        obj.getClass();
        synchronized (this.f17467i) {
            try {
                if (this.f17459a) {
                    return;
                }
                ((CopyOnWriteArraySet) this.f17464f).add(new mj0(obj));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void h(Object obj) {
        if (this.f17460b) {
            ps1.c0(Thread.currentThread() == ((Thread) this.f17461c));
        }
        CopyOnWriteArraySet<mj0> copyOnWriteArraySet = (CopyOnWriteArraySet) this.f17464f;
        for (mj0 mj0Var : copyOnWriteArraySet) {
            if (mj0Var.f17454a.equals(obj)) {
                xi0 xi0Var = (xi0) this.f17463e;
                mj0Var.f17457d = true;
                if (xi0Var != null && mj0Var.f17456c) {
                    mj0Var.f17456c = false;
                    xi0Var.a(mj0Var.f17454a, mj0Var.f17455b.d());
                }
                copyOnWriteArraySet.remove(mj0Var);
            }
        }
    }

    public void i(int i10, li0 li0Var) {
        if (this.f17460b) {
            ps1.c0(Thread.currentThread() == ((Thread) this.f17461c));
        }
        ((ArrayDeque) this.f17466h).add(new xj0(i10, 0, new CopyOnWriteArraySet((CopyOnWriteArraySet) this.f17464f), li0Var));
    }

    public void j() {
        if (this.f17460b) {
            ps1.c0(Thread.currentThread() == ((Thread) this.f17461c));
        }
        ArrayDeque arrayDeque = (ArrayDeque) this.f17466h;
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (((xi0) this.f17463e) != null) {
            ys0 ys0Var = (ys0) this.f17462d;
            ys0Var.getClass();
            Handler handler = ys0Var.f22362a;
            if (!handler.hasMessages(1)) {
                ss0 ss0VarG = ys0.g();
                Message messageObtainMessage = handler.obtainMessage(1);
                ss0VarG.f20047a = messageObtainMessage;
                messageObtainMessage.getClass();
                handler.sendMessageAtFrontOfQueue(messageObtainMessage);
                ss0VarG.f20047a = null;
                ys0.f(ss0VarG);
            }
        }
        ArrayDeque arrayDeque2 = (ArrayDeque) this.f17465g;
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

    public void k() {
        if (this.f17460b) {
            ps1.c0(Thread.currentThread() == ((Thread) this.f17461c));
        }
        synchronized (this.f17467i) {
            this.f17459a = true;
        }
        CopyOnWriteArraySet<mj0> copyOnWriteArraySet = (CopyOnWriteArraySet) this.f17464f;
        for (mj0 mj0Var : copyOnWriteArraySet) {
            xi0 xi0Var = (xi0) this.f17463e;
            mj0Var.f17457d = true;
            if (xi0Var != null && mj0Var.f17456c) {
                mj0Var.f17456c = false;
                xi0Var.a(mj0Var.f17454a, mj0Var.f17455b.d());
            }
        }
        copyOnWriteArraySet.clear();
    }

    public mk0(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, s6 s6Var, xi0 xi0Var, boolean z10) {
        this.f17461c = thread;
        this.f17464f = copyOnWriteArraySet;
        this.f17463e = xi0Var;
        this.f17467i = new Object();
        this.f17465g = new ArrayDeque();
        this.f17466h = new ArrayDeque();
        this.f17462d = (looper == null || s6Var == null || xi0Var == null) ? null : s6Var.u(looper, new hk0(this, 0));
        this.f17460b = z10;
    }

    public mk0(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, l1.u uVar, l1.l lVar, boolean z10) {
        this.f17461c = thread;
        this.f17464f = copyOnWriteArraySet;
        this.f17463e = lVar;
        this.f17467i = new Object();
        this.f17465g = new ArrayDeque();
        this.f17466h = new ArrayDeque();
        if (looper != null && uVar != null && lVar != null) {
            this.f17462d = uVar.a(looper, new l1.j(this, 0));
        } else {
            this.f17462d = null;
        }
        this.f17460b = z10;
    }

    public mk0(Context context, String str, k4.a aVar, d5.e eVar, ArrayList arrayList, boolean z10, int i10, Executor executor, Executor executor2, boolean z11, boolean z12) {
        this.f17461c = aVar;
        this.f17462d = context;
        this.f17463e = str;
        this.f17464f = eVar;
        this.f17465g = arrayList;
        this.f17466h = executor;
        this.f17467i = executor2;
        this.f17459a = z11;
        this.f17460b = z12;
    }
}
