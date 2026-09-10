package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
public abstract class R60 implements InterfaceC4583sa0, InterfaceC2574Ll {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3216cy f3645a;
    public final AbstractC2703Ql[] f;
    public int h;
    public C2677Pl i;
    public C4671ta0 j;
    public boolean k;
    public boolean l;
    public final Object b = new Object();
    public final ArrayDeque c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();
    public final C2677Pl[] e = new C4935wa0[2];
    public int g = 2;

    public R60() {
        AbstractC5023xa0[] abstractC5023xa0Arr = new AbstractC5023xa0[2];
        int i = 0;
        while (true) {
            if (i >= this.g) {
                break;
            }
            this.e[i] = new C4935wa0(1);
            i++;
        }
        this.f = abstractC5023xa0Arr;
        this.h = 2;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = new C3387et(this, 1);
        }
        C3216cy c3216cy = new C3216cy(this);
        this.f3645a = c3216cy;
        c3216cy.start();
        int i3 = this.g;
        C2677Pl[] c2677PlArr = this.e;
        FW.s(i3 == c2677PlArr.length);
        for (C2677Pl c2677Pl : c2677PlArr) {
            c2677Pl.g(1024);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2574Ll
    public final void a(C4935wa0 c4935wa0) {
        synchronized (this.b) {
            try {
                C4671ta0 c4671ta0 = this.j;
                if (c4671ta0 != null) {
                    throw c4671ta0;
                }
                FW.h(c4935wa0 == this.i);
                this.c.addLast(c4935wa0);
                if (!this.c.isEmpty() && this.h > 0) {
                    this.b.notify();
                }
                this.i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract InterfaceC4495ra0 b(byte[] bArr, int i, boolean z);

    public final C4671ta0 c(C2677Pl c2677Pl, AbstractC2703Ql abstractC2703Ql, boolean z) {
        C4935wa0 c4935wa0 = (C4935wa0) c2677Pl;
        AbstractC5023xa0 abstractC5023xa0 = (AbstractC5023xa0) abstractC2703Ql;
        try {
            ByteBuffer byteBuffer = c4935wa0.d;
            byteBuffer.getClass();
            abstractC5023xa0.f(c4935wa0.f, b(byteBuffer.array(), byteBuffer.limit(), z), c4935wa0.j);
            abstractC5023xa0.b &= Integer.MAX_VALUE;
            return null;
        } catch (C4671ta0 e) {
            return e;
        }
    }

    public final boolean d() {
        C4671ta0 c4671ta0;
        C4671ta0 c4671ta0C;
        synchronized (this.b) {
            while (!this.l && (this.c.isEmpty() || this.h <= 0)) {
                try {
                    this.b.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.l) {
                return false;
            }
            C2677Pl c2677Pl = (C2677Pl) this.c.removeFirst();
            AbstractC2703Ql[] abstractC2703QlArr = this.f;
            int i = this.h - 1;
            this.h = i;
            AbstractC2703Ql abstractC2703Ql = abstractC2703QlArr[i];
            boolean z = this.k;
            this.k = false;
            if (c2677Pl.c(4)) {
                abstractC2703Ql.a(4);
            } else {
                if (c2677Pl.c(Integer.MIN_VALUE)) {
                    abstractC2703Ql.a(Integer.MIN_VALUE);
                }
                if (c2677Pl.c(134217728)) {
                    abstractC2703Ql.a(134217728);
                }
                try {
                    c4671ta0C = c(c2677Pl, abstractC2703Ql, z);
                } catch (OutOfMemoryError e) {
                    c4671ta0 = new C4671ta0("Unexpected decode error", e, 0);
                    c4671ta0C = c4671ta0;
                } catch (RuntimeException e2) {
                    c4671ta0 = new C4671ta0("Unexpected decode error", e2, 0);
                    c4671ta0C = c4671ta0;
                }
                if (c4671ta0C != null) {
                    synchronized (this.b) {
                        this.j = c4671ta0C;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                try {
                    if (this.k || abstractC2703Ql.c(Integer.MIN_VALUE)) {
                        abstractC2703Ql.e();
                    } else {
                        this.d.addLast(abstractC2703Ql);
                    }
                    c2677Pl.e();
                    int i2 = this.g;
                    this.g = i2 + 1;
                    this.e[i2] = c2677Pl;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2574Ll
    public final Object dequeueInputBuffer() {
        C2677Pl c2677Pl;
        synchronized (this.b) {
            try {
                C4671ta0 c4671ta0 = this.j;
                if (c4671ta0 != null) {
                    throw c4671ta0;
                }
                FW.s(this.i == null);
                int i = this.g;
                if (i == 0) {
                    c2677Pl = null;
                } else {
                    C2677Pl[] c2677PlArr = this.e;
                    int i2 = i - 1;
                    this.g = i2;
                    c2677Pl = c2677PlArr[i2];
                }
                this.i = c2677Pl;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2677Pl;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2574Ll
    public final Object dequeueOutputBuffer() {
        synchronized (this.b) {
            try {
                C4671ta0 c4671ta0 = this.j;
                if (c4671ta0 != null) {
                    throw c4671ta0;
                }
                if (this.d.isEmpty()) {
                    return null;
                }
                return (AbstractC2703Ql) this.d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2574Ll
    public final void flush() {
        synchronized (this.b) {
            try {
                this.k = true;
                C2677Pl c2677Pl = this.i;
                if (c2677Pl != null) {
                    c2677Pl.e();
                    int i = this.g;
                    this.g = i + 1;
                    this.e[i] = c2677Pl;
                    this.i = null;
                }
                while (!this.c.isEmpty()) {
                    C2677Pl c2677Pl2 = (C2677Pl) this.c.removeFirst();
                    c2677Pl2.e();
                    int i2 = this.g;
                    this.g = i2 + 1;
                    this.e[i2] = c2677Pl2;
                }
                while (!this.d.isEmpty()) {
                    ((AbstractC2703Ql) this.d.removeFirst()).e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2574Ll
    public final void release() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.f3645a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4583sa0
    public final void setPositionUs(long j) {
    }
}
