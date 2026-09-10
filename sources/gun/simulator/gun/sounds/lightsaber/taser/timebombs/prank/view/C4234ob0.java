package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ob0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4234ob0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4497rb0 f4794a;
    public final String b;
    public boolean c;
    public AbstractC3882kb0 d;
    public final ArrayList e;
    public boolean f;

    public C4234ob0(C4497rb0 c4497rb0, String str) {
        AbstractC2995aW.q(c4497rb0, "taskRunner");
        AbstractC2995aW.q(str, "name");
        this.f4794a = c4497rb0;
        this.b = str;
        this.e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = Vg0.f3884a;
        synchronized (this.f4794a) {
            if (b()) {
                this.f4794a.e(this);
            }
        }
    }

    public final boolean b() {
        AbstractC3882kb0 abstractC3882kb0 = this.d;
        if (abstractC3882kb0 != null && abstractC3882kb0.b) {
            this.f = true;
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size() - 1;
        boolean z = false;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                if (((AbstractC3882kb0) arrayList.get(size)).b) {
                    AbstractC3882kb0 abstractC3882kb1 = (AbstractC3882kb0) arrayList.get(size);
                    if (C4497rb0.i.isLoggable(Level.FINE)) {
                        AbstractC2871Wx.M(abstractC3882kb1, this, "canceled");
                    }
                    arrayList.remove(size);
                    z = true;
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        return z;
    }

    public final void c(AbstractC3882kb0 abstractC3882kb0, long j) {
        AbstractC2995aW.q(abstractC3882kb0, "task");
        synchronized (this.f4794a) {
            if (!this.c) {
                if (e(abstractC3882kb0, j, false)) {
                    this.f4794a.e(this);
                }
            } else if (abstractC3882kb0.b) {
                C4497rb0 c4497rb0 = C4497rb0.h;
                if (C4497rb0.i.isLoggable(Level.FINE)) {
                    AbstractC2871Wx.M(abstractC3882kb0, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                C4497rb0 c4497rb1 = C4497rb0.h;
                if (C4497rb0.i.isLoggable(Level.FINE)) {
                    AbstractC2871Wx.M(abstractC3882kb0, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean e(AbstractC3882kb0 abstractC3882kb0, long j, boolean z) {
        AbstractC2995aW.q(abstractC3882kb0, "task");
        C4234ob0 c4234ob0 = abstractC3882kb0.c;
        if (c4234ob0 != this) {
            if (c4234ob0 != null) {
                throw new IllegalStateException("task is in multiple queues".toString());
            }
            abstractC3882kb0.c = this;
        }
        this.f4794a.f4936a.getClass();
        long jNanoTime = System.nanoTime();
        long j2 = jNanoTime + j;
        ArrayList arrayList = this.e;
        int iIndexOf = arrayList.indexOf(abstractC3882kb0);
        if (iIndexOf != -1) {
            if (abstractC3882kb0.d <= j2) {
                if (C4497rb0.i.isLoggable(Level.FINE)) {
                    AbstractC2871Wx.M(abstractC3882kb0, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(iIndexOf);
        }
        abstractC3882kb0.d = j2;
        if (C4497rb0.i.isLoggable(Level.FINE)) {
            AbstractC2871Wx.M(abstractC3882kb0, this, z ? AbstractC2995aW.v0(AbstractC2871Wx.a0(j2 - jNanoTime), "run again after ") : AbstractC2995aW.v0(AbstractC2871Wx.a0(j2 - jNanoTime), "scheduled after "));
        }
        Iterator it = arrayList.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((AbstractC3882kb0) it.next()).d - jNanoTime > j) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = arrayList.size();
        }
        arrayList.add(size, abstractC3882kb0);
        return size == 0;
    }

    public final void f() {
        byte[] bArr = Vg0.f3884a;
        synchronized (this.f4794a) {
            this.c = true;
            if (b()) {
                this.f4794a.e(this);
            }
        }
    }

    public final String toString() {
        return this.b;
    }
}
