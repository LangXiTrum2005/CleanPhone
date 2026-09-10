package com.smartdigimkt.s0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a implements Runnable {
    public static long Z;
    public b X = b.READY;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public InterfaceC0579a f38153Y;

    /* JADX INFO: renamed from: com.smartdigimkt.s0.a$a, reason: collision with other inner class name */
    public interface InterfaceC0579a {
        void a(b bVar);
    }

    public enum b {
        READY,
        RUNNING,
        PAUSE,
        CANCEL,
        FINISH
    }

    public a() {
        Z++;
    }

    private void a(b bVar) {
        this.X = bVar;
        InterfaceC0579a interfaceC0579a = this.f38153Y;
        if (interfaceC0579a != null) {
            interfaceC0579a.a(bVar);
        }
    }

    public abstract void a(boolean z2);

    public final void b() {
        b bVar = this.X;
        b bVar2 = b.CANCEL;
        if (bVar != bVar2) {
            a(bVar2);
            c();
        }
    }

    public abstract void c();

    public final long d() {
        return Z;
    }

    public b e() {
        return this.X;
    }

    public abstract void f();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.X == b.READY) {
                a(b.RUNNING);
                f();
                a(b.FINISH);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void a(InterfaceC0579a interfaceC0579a) {
        this.f38153Y = interfaceC0579a;
    }

    public final void b(boolean z2) {
        b bVar = this.X;
        b bVar2 = b.PAUSE;
        if (bVar == bVar2 || bVar == b.CANCEL || bVar == b.FINISH) {
            return;
        }
        if (z2) {
            a(bVar2);
        } else {
            a(b.RUNNING);
        }
        a(z2);
    }
}
