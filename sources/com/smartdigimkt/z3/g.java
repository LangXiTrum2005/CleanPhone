package com.smartdigimkt.z3;

import com.smartdigimkt.z3.e;
import com.smartdigimkt.z3.f;
import java.lang.Exception;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes6.dex */
public abstract class g<I extends e, O extends f, E extends Exception> implements c<I, O, E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Thread f40357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f40358b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque<I> f40359c = new ArrayDeque<>();
    private final ArrayDeque<O> d = new ArrayDeque<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final I[] f40360e;
    private final O[] f;
    private int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f40361h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private I f40362i;
    private E j;
    private boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f40363l;
    private int m;

    public class a extends Thread {
        public a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            g.this.l();
        }
    }

    public g(I[] iArr, O[] oArr) {
        this.f40360e = iArr;
        this.g = iArr.length;
        for (int i2 = 0; i2 < this.g; i2++) {
            ((I[]) this.f40360e)[i2] = e();
        }
        this.f = oArr;
        this.f40361h = oArr.length;
        for (int i3 = 0; i3 < this.f40361h; i3++) {
            ((O[]) this.f)[i3] = f();
        }
        a aVar = new a();
        this.f40357a = aVar;
        aVar.start();
    }

    private boolean d() {
        return !this.f40359c.isEmpty() && this.f40361h > 0;
    }

    private boolean g() throws InterruptedException {
        synchronized (this.f40358b) {
            while (!this.f40363l && !d()) {
                try {
                    this.f40358b.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f40363l) {
                return false;
            }
            I iRemoveFirst = this.f40359c.removeFirst();
            O[] oArr = this.f;
            int i2 = this.f40361h - 1;
            this.f40361h = i2;
            O o = oArr[i2];
            boolean z2 = this.k;
            this.k = false;
            if (iRemoveFirst.c()) {
                o.a(4);
            } else {
                if (iRemoveFirst.b()) {
                    o.a(Integer.MIN_VALUE);
                }
                try {
                    this.j = (E) a(iRemoveFirst, o, z2);
                } catch (OutOfMemoryError e2) {
                    this.j = (E) a((Throwable) e2);
                } catch (RuntimeException e3) {
                    this.j = (E) a((Throwable) e3);
                }
                if (this.j != null) {
                    synchronized (this.f40358b) {
                    }
                    return false;
                }
            }
            synchronized (this.f40358b) {
                try {
                    if (this.k) {
                        b(o);
                    } else if (o.b()) {
                        this.m++;
                        b(o);
                    } else {
                        o.f40356c = this.m;
                        this.m = 0;
                        this.d.addLast(o);
                    }
                    b(iRemoveFirst);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
    }

    private void j() {
        if (d()) {
            this.f40358b.notify();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends java.lang.Exception */
    private void k() throws Exception {
        E e2 = this.j;
        if (e2 != null) {
            throw e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        do {
            try {
            } catch (InterruptedException e2) {
                throw new IllegalStateException(e2);
            }
        } while (g());
    }

    public abstract E a(I i2, O o, boolean z2);

    public abstract E a(Throwable th);

    public abstract I e();

    public abstract O f();

    @Override // com.smartdigimkt.z3.c
    public final void flush() {
        synchronized (this.f40358b) {
            try {
                this.k = true;
                this.m = 0;
                I i2 = this.f40362i;
                if (i2 != null) {
                    b(i2);
                    this.f40362i = null;
                }
                while (!this.f40359c.isEmpty()) {
                    b(this.f40359c.removeFirst());
                }
                while (!this.d.isEmpty()) {
                    b(this.d.removeFirst());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.smartdigimkt.z3.c
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final I c() throws Exception {
        I i2;
        synchronized (this.f40358b) {
            k();
            com.smartdigimkt.p4.a.b(this.f40362i == null);
            int i3 = this.g;
            if (i3 == 0) {
                i2 = null;
            } else {
                I[] iArr = this.f40360e;
                int i4 = i3 - 1;
                this.g = i4;
                i2 = iArr[i4];
            }
            this.f40362i = i2;
        }
        return i2;
    }

    @Override // com.smartdigimkt.z3.c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final O b() throws Exception {
        synchronized (this.f40358b) {
            try {
                k();
                if (this.d.isEmpty()) {
                    return null;
                }
                return this.d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.smartdigimkt.z3.c
    public void release() {
        synchronized (this.f40358b) {
            this.f40363l = true;
            this.f40358b.notify();
        }
        try {
            this.f40357a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    private void b(I i2) {
        i2.a();
        I[] iArr = this.f40360e;
        int i3 = this.g;
        this.g = i3 + 1;
        iArr[i3] = i2;
    }

    public final void a(int i2) {
        com.smartdigimkt.p4.a.b(this.g == this.f40360e.length);
        for (I i3 : this.f40360e) {
            i3.f(i2);
        }
    }

    private void b(O o) {
        o.a();
        O[] oArr = this.f;
        int i2 = this.f40361h;
        this.f40361h = i2 + 1;
        oArr[i2] = o;
    }

    @Override // com.smartdigimkt.z3.c
    public final void a(I i2) throws Exception {
        synchronized (this.f40358b) {
            k();
            com.smartdigimkt.p4.a.a(i2 == this.f40362i);
            this.f40359c.addLast(i2);
            j();
            this.f40362i = null;
        }
    }

    public void a(O o) {
        synchronized (this.f40358b) {
            b(o);
            j();
        }
    }
}
