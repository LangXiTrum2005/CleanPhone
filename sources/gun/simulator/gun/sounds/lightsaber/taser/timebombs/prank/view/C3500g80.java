package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.g80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3500g80 implements InterfaceC3759j7 {
    public int b;
    public float c;
    public float d;
    public C3585h7 e;
    public C3585h7 f;
    public C3585h7 g;
    public C3585h7 h;
    public boolean i;
    public C3412f80 j;
    public ByteBuffer k;
    public ShortBuffer l;
    public ByteBuffer m;
    public long n;
    public long o;
    public boolean p;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3759j7
    public final C3585h7 a(C3585h7 c3585h7) throws C3673i7 {
        if (c3585h7.c != 2) {
            throw new C3673i7(c3585h7);
        }
        int i = this.b;
        if (i == -1) {
            i = c3585h7.f4446a;
        }
        this.e = c3585h7;
        C3585h7 c3585h8 = new C3585h7(i, c3585h7.b, 2);
        this.f = c3585h8;
        this.i = true;
        return c3585h8;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3759j7
    public final void flush() {
        if (isActive()) {
            C3585h7 c3585h7 = this.e;
            this.g = c3585h7;
            C3585h7 c3585h8 = this.f;
            this.h = c3585h8;
            if (this.i) {
                this.j = new C3412f80(c3585h7.f4446a, c3585h7.b, this.c, this.d, c3585h8.f4446a);
            } else {
                C3412f80 c3412f80 = this.j;
                if (c3412f80 != null) {
                    c3412f80.k = 0;
                    c3412f80.m = 0;
                    c3412f80.o = 0;
                    c3412f80.p = 0;
                    c3412f80.q = 0;
                    c3412f80.r = 0;
                    c3412f80.s = 0;
                    c3412f80.t = 0;
                    c3412f80.u = 0;
                    c3412f80.v = 0;
                }
            }
        }
        this.m = InterfaceC3759j7.f4537a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3759j7
    public final ByteBuffer getOutput() {
        C3412f80 c3412f80 = this.j;
        if (c3412f80 != null) {
            int i = c3412f80.m;
            int i2 = c3412f80.b;
            int i3 = i * i2 * 2;
            if (i3 > 0) {
                if (this.k.capacity() < i3) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i3).order(ByteOrder.nativeOrder());
                    this.k = byteBufferOrder;
                    this.l = byteBufferOrder.asShortBuffer();
                } else {
                    this.k.clear();
                    this.l.clear();
                }
                ShortBuffer shortBuffer = this.l;
                int iMin = Math.min(shortBuffer.remaining() / i2, c3412f80.m);
                int i4 = iMin * i2;
                shortBuffer.put(c3412f80.l, 0, i4);
                int i5 = c3412f80.m - iMin;
                c3412f80.m = i5;
                short[] sArr = c3412f80.l;
                System.arraycopy(sArr, i4, sArr, 0, i5 * i2);
                this.o += (long) i3;
                this.k.limit(i3);
                this.m = this.k;
            }
        }
        ByteBuffer byteBuffer = this.m;
        this.m = InterfaceC3759j7.f4537a;
        return byteBuffer;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3759j7
    public final boolean isActive() {
        return this.f.f4446a != -1 && (Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.f4446a != this.e.f4446a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3759j7
    public final boolean isEnded() {
        C3412f80 c3412f80;
        return this.p && ((c3412f80 = this.j) == null || (c3412f80.m * c3412f80.b) * 2 == 0);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3759j7
    public final void queueEndOfStream() {
        C3412f80 c3412f80 = this.j;
        if (c3412f80 != null) {
            int i = c3412f80.k;
            float f = c3412f80.c;
            float f2 = c3412f80.d;
            int i2 = c3412f80.m + ((int) ((((i / (f / f2)) + c3412f80.o) / (c3412f80.e * f2)) + 0.5f));
            short[] sArr = c3412f80.j;
            int i3 = c3412f80.h * 2;
            c3412f80.j = c3412f80.c(sArr, i, i3 + i);
            int i4 = 0;
            while (true) {
                int i5 = c3412f80.b;
                if (i4 >= i3 * i5) {
                    break;
                }
                c3412f80.j[(i5 * i) + i4] = 0;
                i4++;
            }
            c3412f80.k = i3 + c3412f80.k;
            c3412f80.f();
            if (c3412f80.m > i2) {
                c3412f80.m = i2;
            }
            c3412f80.k = 0;
            c3412f80.r = 0;
            c3412f80.o = 0;
        }
        this.p = true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3759j7
    public final void queueInput(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            C3412f80 c3412f80 = this.j;
            c3412f80.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.n += (long) iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i = c3412f80.b;
            int i2 = iRemaining2 / i;
            short[] sArrC = c3412f80.c(c3412f80.j, c3412f80.k, i2);
            c3412f80.j = sArrC;
            shortBufferAsShortBuffer.get(sArrC, c3412f80.k * i, ((i2 * i) * 2) / 2);
            c3412f80.k += i2;
            c3412f80.f();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3759j7
    public final void reset() {
        this.c = 1.0f;
        this.d = 1.0f;
        C3585h7 c3585h7 = C3585h7.e;
        this.e = c3585h7;
        this.f = c3585h7;
        this.g = c3585h7;
        this.h = c3585h7;
        ByteBuffer byteBuffer = InterfaceC3759j7.f4537a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }
}
