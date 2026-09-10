package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class NA implements Closeable {
    public static final Logger g = Logger.getLogger(AbstractC4644tA.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2434Gb f3445a;
    public final boolean b;
    public final C4848vb c;
    public int d;
    public boolean e;
    public final C3853kA f;

    public NA(InterfaceC2434Gb interfaceC2434Gb, boolean z) {
        this.f3445a = interfaceC2434Gb;
        this.b = z;
        C4848vb c4848vb = new C4848vb();
        this.c = c4848vb;
        this.d = 16384;
        this.f = new C3853kA(c4848vb);
    }

    public final synchronized void a(R50 r50) {
        try {
            AbstractC2995aW.q(r50, "peerSettings");
            if (this.e) {
                throw new IOException("closed");
            }
            int i = this.d;
            int i2 = r50.f3643a;
            if ((i2 & 32) != 0) {
                i = r50.b[5];
            }
            this.d = i;
            if (((i2 & 2) != 0 ? r50.b[1] : -1) != -1) {
                C3853kA c3853kA = this.f;
                int i3 = (i2 & 2) != 0 ? r50.b[1] : -1;
                c3853kA.getClass();
                int iMin = Math.min(i3, 16384);
                int i4 = c3853kA.e;
                if (i4 != iMin) {
                    if (iMin < i4) {
                        c3853kA.c = Math.min(c3853kA.c, iMin);
                    }
                    c3853kA.d = true;
                    c3853kA.e = iMin;
                    int i5 = c3853kA.i;
                    if (iMin < i5) {
                        if (iMin == 0) {
                            C4183nz[] c4183nzArr = c3853kA.f;
                            U5.l0(null, c4183nzArr, 0, c4183nzArr.length);
                            c3853kA.g = c3853kA.f.length - 1;
                            c3853kA.h = 0;
                            c3853kA.i = 0;
                        } else {
                            c3853kA.a(i5 - iMin);
                        }
                    }
                }
            }
            c(0, 0, 4, 1);
            this.f3445a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(boolean z, int i, C4848vb c4848vb, int i2) {
        if (this.e) {
            throw new IOException("closed");
        }
        c(i, i2, 0, z ? 1 : 0);
        if (i2 > 0) {
            AbstractC2995aW.n(c4848vb);
            this.f3445a.d(c4848vb, i2);
        }
    }

    public final void c(int i, int i2, int i3, int i4) {
        Level level = Level.FINE;
        Logger logger = g;
        if (logger.isLoggable(level)) {
            logger.fine(AbstractC4644tA.a(i, i2, i3, i4, false));
        }
        if (i2 > this.d) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.d + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(AbstractC2995aW.v0(Integer.valueOf(i), "reserved bit set: ").toString());
        }
        byte[] bArr = Vg0.f3884a;
        InterfaceC2434Gb interfaceC2434Gb = this.f3445a;
        AbstractC2995aW.q(interfaceC2434Gb, "<this>");
        interfaceC2434Gb.writeByte((i2 >>> 16) & 255);
        interfaceC2434Gb.writeByte((i2 >>> 8) & 255);
        interfaceC2434Gb.writeByte(i2 & 255);
        interfaceC2434Gb.writeByte(i3 & 255);
        interfaceC2434Gb.writeByte(i4 & 255);
        interfaceC2434Gb.writeInt(i & Integer.MAX_VALUE);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.e = true;
        this.f3445a.close();
    }

    public final synchronized void e(int i, EnumC2502Ir enumC2502Ir, byte[] bArr) {
        try {
            if (this.e) {
                throw new IOException("closed");
            }
            if (enumC2502Ir.f3242a == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
            c(0, bArr.length + 8, 7, 0);
            this.f3445a.writeInt(i);
            this.f3445a.writeInt(enumC2502Ir.f3242a);
            if (!(bArr.length == 0)) {
                this.f3445a.write(bArr);
            }
            this.f3445a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void f(int i, ArrayList arrayList, boolean z) {
        if (this.e) {
            throw new IOException("closed");
        }
        this.f.d(arrayList);
        long j = this.c.b;
        long jMin = Math.min(this.d, j);
        int i2 = j == jMin ? 4 : 0;
        if (z) {
            i2 |= 1;
        }
        c(i, (int) jMin, 1, i2);
        this.f3445a.d(this.c, jMin);
        if (j > jMin) {
            m(i, j - jMin);
        }
    }

    public final synchronized void flush() {
        if (this.e) {
            throw new IOException("closed");
        }
        this.f3445a.flush();
    }

    public final synchronized void g(int i, int i2, boolean z) {
        if (this.e) {
            throw new IOException("closed");
        }
        c(0, 8, 6, z ? 1 : 0);
        this.f3445a.writeInt(i);
        this.f3445a.writeInt(i2);
        this.f3445a.flush();
    }

    public final synchronized void h(int i, EnumC2502Ir enumC2502Ir) {
        AbstractC2995aW.q(enumC2502Ir, "errorCode");
        if (this.e) {
            throw new IOException("closed");
        }
        if (enumC2502Ir.f3242a == -1) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        c(i, 4, 3, 0);
        this.f3445a.writeInt(enumC2502Ir.f3242a);
        this.f3445a.flush();
    }

    public final synchronized void i(R50 r50) {
        int i;
        try {
            AbstractC2995aW.q(r50, "settings");
            if (this.e) {
                throw new IOException("closed");
            }
            int i2 = 0;
            c(0, Integer.bitCount(r50.f3643a) * 6, 4, 0);
            while (i2 < 10) {
                int i3 = i2 + 1;
                if (((1 << i2) & r50.f3643a) != 0) {
                    if (i2 != 4) {
                        i = i2 != 7 ? i2 : 4;
                    } else {
                        i = 3;
                    }
                    this.f3445a.writeShort(i);
                    this.f3445a.writeInt(r50.b[i2]);
                }
                i2 = i3;
            }
            this.f3445a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void k(int i, long j) {
        if (this.e) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException(AbstractC2995aW.v0(Long.valueOf(j), "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ").toString());
        }
        c(i, 4, 8, 0);
        this.f3445a.writeInt((int) j);
        this.f3445a.flush();
    }

    public final void m(int i, long j) {
        while (j > 0) {
            long jMin = Math.min(this.d, j);
            j -= jMin;
            c(i, (int) jMin, 9, j == 0 ? 4 : 0);
            this.f3445a.d(this.c, jMin);
        }
    }
}
