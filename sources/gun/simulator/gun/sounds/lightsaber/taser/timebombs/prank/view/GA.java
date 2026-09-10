package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class GA implements Closeable {
    public static final R50 B;
    public final LinkedHashSet A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3110a;
    public final AbstractC4908wA b;
    public final LinkedHashMap c;
    public final String d;
    public int e;
    public int f;
    public boolean g;
    public final C4497rb0 h;
    public final C4234ob0 i;
    public final C4234ob0 j;
    public final C4234ob0 k;
    public final G7 l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public final R50 r;
    public R50 s;
    public long t;
    public long u;
    public long v;
    public long w;
    public final Socket x;
    public final NA y;
    public final AA z;

    static {
        R50 r50 = new R50();
        r50.c(7, 65535);
        r50.c(5, 16384);
        B = r50;
    }

    public GA(C4732uA c4732uA) {
        boolean z = c4732uA.f5069a;
        this.f3110a = z;
        this.b = c4732uA.g;
        this.c = new LinkedHashMap();
        String str = c4732uA.d;
        if (str == null) {
            AbstractC2995aW.x0("connectionName");
            throw null;
        }
        this.d = str;
        this.f = z ? 3 : 2;
        C4497rb0 c4497rb0 = c4732uA.b;
        this.h = c4497rb0;
        C4234ob0 c4234ob0F = c4497rb0.f();
        this.i = c4234ob0F;
        this.j = c4497rb0.f();
        this.k = c4497rb0.f();
        this.l = c4732uA.h;
        R50 r50 = new R50();
        if (z) {
            r50.c(7, 16777216);
        }
        this.r = r50;
        R50 r51 = B;
        this.s = r51;
        this.w = r51.a();
        Socket socket = c4732uA.c;
        if (socket == null) {
            AbstractC2995aW.x0("socket");
            throw null;
        }
        this.x = socket;
        InterfaceC2434Gb interfaceC2434Gb = c4732uA.f;
        if (interfaceC2434Gb == null) {
            AbstractC2995aW.x0("sink");
            throw null;
        }
        this.y = new NA(interfaceC2434Gb, z);
        InterfaceC2460Hb interfaceC2460Hb = c4732uA.e;
        if (interfaceC2460Hb == null) {
            AbstractC2995aW.x0("source");
            throw null;
        }
        this.z = new AA(this, new JA(interfaceC2460Hb, z));
        this.A = new LinkedHashSet();
        int i = c4732uA.i;
        if (i != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            c4234ob0F.c(new EA(AbstractC2995aW.v0(" ping", str), this, nanos), nanos);
        }
    }

    public final void a(EnumC2502Ir enumC2502Ir, EnumC2502Ir enumC2502Ir2, IOException iOException) {
        int i;
        Object[] array;
        byte[] bArr = Vg0.f3884a;
        try {
            h(enumC2502Ir);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!this.c.isEmpty()) {
                array = this.c.values().toArray(new MA[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                this.c.clear();
            } else {
                array = null;
            }
        }
        MA[] maArr = (MA[]) array;
        if (maArr != null) {
            for (MA ma : maArr) {
                try {
                    ma.c(enumC2502Ir2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.y.close();
        } catch (IOException unused3) {
        }
        try {
            this.x.close();
        } catch (IOException unused4) {
        }
        this.i.f();
        this.j.f();
        this.k.f();
    }

    public final void b(IOException iOException) {
        EnumC2502Ir enumC2502Ir = EnumC2502Ir.PROTOCOL_ERROR;
        a(enumC2502Ir, enumC2502Ir, iOException);
    }

    public final synchronized MA c(int i) {
        return (MA) this.c.get(Integer.valueOf(i));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(EnumC2502Ir.NO_ERROR, EnumC2502Ir.CANCEL, null);
    }

    public final synchronized boolean f(long j) {
        if (this.g) {
            return false;
        }
        return this.p >= this.o || j < this.q;
    }

    public final void flush() {
        this.y.flush();
    }

    public final synchronized MA g(int i) {
        MA ma;
        ma = (MA) this.c.remove(Integer.valueOf(i));
        notifyAll();
        return ma;
    }

    public final void h(EnumC2502Ir enumC2502Ir) {
        synchronized (this.y) {
            synchronized (this) {
                if (this.g) {
                    return;
                }
                this.g = true;
                this.y.e(this.e, enumC2502Ir, Vg0.f3884a);
            }
        }
    }

    public final synchronized void i(long j) {
        long j2 = this.t + j;
        this.t = j2;
        long j3 = j2 - this.u;
        if (j3 >= this.r.a() / 2) {
            n(0, j3);
            this.u += j3;
        }
    }

    public final void k(int i, boolean z, C4848vb c4848vb, long j) {
        long j2;
        long j3;
        int iMin;
        long j4;
        if (j == 0) {
            this.y.b(z, i, c4848vb, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j2 = this.v;
                            j3 = this.w;
                            if (j2 >= j3) {
                                if (!this.c.containsKey(Integer.valueOf(i))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                iMin = Math.min((int) Math.min(j, j3 - j2), this.y.d);
                j4 = iMin;
                this.v += j4;
            }
            j -= j4;
            this.y.b(z && j == 0, i, c4848vb, iMin);
        }
    }

    public final void m(int i, EnumC2502Ir enumC2502Ir) {
        this.i.c(new DA(this.d + '[' + i + "] writeSynReset", this, i, enumC2502Ir, 1), 0L);
    }

    public final void n(int i, long j) {
        this.i.c(new FA(this.d + '[' + i + "] windowUpdate", this, i, j), 0L);
    }
}
