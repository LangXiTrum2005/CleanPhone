package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public final class EX implements InterfaceC2460Hb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3588h80 f3026a;
    public final C4848vb b;
    public boolean c;

    public EX(InterfaceC3588h80 interfaceC3588h80) {
        AbstractC2995aW.q(interfaceC3588h80, "source");
        this.f3026a = interfaceC3588h80;
        this.b = new C4848vb();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2460Hb
    public final String C() {
        return j(Long.MAX_VALUE);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2460Hb
    public final void D(long j) throws EOFException {
        if (!l(j)) {
            throw new EOFException();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2460Hb
    public final C3971lc F(long j) throws EOFException {
        D(j);
        return this.b.F(j);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2460Hb
    public final long G(C3971lc c3971lc) {
        AbstractC2995aW.q(c3971lc, "targetBytes");
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        long jMax = 0;
        while (true) {
            C4848vb c4848vb = this.b;
            long jP = c4848vb.p(c3971lc, jMax);
            if (jP != -1) {
                return jP;
            }
            long j = c4848vb.b;
            if (this.f3026a.read(c4848vb, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2460Hb
    public final long H(C4848vb c4848vb) {
        C4848vb c4848vb2;
        long j = 0;
        while (true) {
            InterfaceC3588h80 interfaceC3588h80 = this.f3026a;
            c4848vb2 = this.b;
            if (interfaceC3588h80.read(c4848vb2, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                break;
            }
            long jK = c4848vb2.k();
            if (jK > 0) {
                j += jK;
                c4848vb.d(c4848vb2, jK);
            }
        }
        long j2 = c4848vb2.b;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        c4848vb.d(c4848vb2, j2);
        return j3;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2460Hb
    public final byte[] J() {
        InterfaceC3588h80 interfaceC3588h80 = this.f3026a;
        C4848vb c4848vb = this.b;
        c4848vb.B(interfaceC3588h80);
        return c4848vb.q(c4848vb.b);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2460Hb
    public final boolean K() {
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        C4848vb c4848vb = this.b;
        return c4848vb.K() && this.f3026a.read(c4848vb, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2460Hb
    public final String L(Charset charset) {
        C4848vb c4848vb = this.b;
        c4848vb.B(this.f3026a);
        return c4848vb.s(c4848vb.b, charset);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2460Hb
    public final C3971lc N() {
        InterfaceC3588h80 interfaceC3588h80 = this.f3026a;
        C4848vb c4848vb = this.b;
        c4848vb.B(interfaceC3588h80);
        return c4848vb.F(c4848vb.b);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2460Hb
    public final int O(XS xs) throws EOFException {
        C4848vb c4848vb;
        AbstractC2995aW.q(xs, "options");
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            c4848vb = this.b;
            int iB = AbstractC5135ym0.b(c4848vb, xs, true);
            if (iB != -2) {
                if (iB == -1) {
                    break;
                }
                c4848vb.skip(xs.f3969a[iB].c());
                return iB;
            }
        } while (this.f3026a.read(c4848vb, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1);
        return -1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2460Hb
    public final long P() throws EOFException {
        C4848vb c4848vb;
        D(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean zL = l(i2);
            c4848vb = this.b;
            if (!zL) {
                break;
            }
            byte bN = c4848vb.n(i);
            if ((bN < ((byte) 48) || bN > ((byte) 57)) && ((bN < ((byte) 97) || bN > ((byte) 102)) && (bN < ((byte) 65) || bN > ((byte) 70)))) {
                if (i != 0) {
                    break;
                }
                WD.k(16);
                WD.k(16);
                String string = Integer.toString(bN, 16);
                AbstractC2995aW.p(string, "java.lang.Integer.toStri…(this, checkRadix(radix))");
                throw new NumberFormatException(AbstractC2995aW.v0(string, "Expected leading [0-9a-fA-F] character but was 0x"));
            }
            i = i2;
        }
        return c4848vb.P();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2460Hb
    public final C4760ub Q() {
        return new C4760ub(this, 1);
    }

    public final long a(byte b, long j, long j2) {
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        long jMax = 0;
        if (0 > j2) {
            throw new IllegalArgumentException(AbstractC5044xl.h("fromIndex=0 toIndex=", j2).toString());
        }
        while (jMax < j2) {
            long jO = this.b.o(b, jMax, j2);
            if (jO != -1) {
                return jO;
            }
            C4848vb c4848vb = this.b;
            long j3 = c4848vb.b;
            if (j3 >= j2 || this.f3026a.read(c4848vb, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j3);
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.f3026a.close();
        C4848vb c4848vb = this.b;
        c4848vb.skip(c4848vb.b);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2460Hb
    public final C4848vb getBuffer() {
        return this.b;
    }

    public final EX h() {
        return AbstractC4496rb.f(new C2993aU(this));
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2460Hb
    public final String j(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC2995aW.v0(Long.valueOf(j), "limit < 0: ").toString());
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        byte b = (byte) 10;
        long jA = a(b, 0L, j2);
        C4848vb c4848vb = this.b;
        if (jA != -1) {
            return AbstractC5135ym0.a(c4848vb, jA);
        }
        if (j2 < Long.MAX_VALUE && l(j2) && c4848vb.n(j2 - 1) == ((byte) 13) && l(1 + j2) && c4848vb.n(j2) == b) {
            return AbstractC5135ym0.a(c4848vb, j2);
        }
        C4848vb c4848vb2 = new C4848vb();
        c4848vb.m(c4848vb2, 0L, Math.min(32, c4848vb.b));
        throw new EOFException("\\n not found: limit=" + Math.min(c4848vb.b, j) + " content=" + c4848vb2.F(c4848vb2.b).d() + (char) 8230);
    }

    public final long k() {
        C4848vb c4848vb;
        D(1L);
        long j = 0;
        while (true) {
            long j2 = j + 1;
            boolean zL = l(j2);
            c4848vb = this.b;
            if (!zL) {
                break;
            }
            byte bN = c4848vb.n(j);
            if ((bN < ((byte) 48) || bN > ((byte) 57)) && !(j == 0 && bN == ((byte) 45))) {
                if (j != 0) {
                    break;
                }
                WD.k(16);
                WD.k(16);
                String string = Integer.toString(bN, 16);
                AbstractC2995aW.p(string, "java.lang.Integer.toStri…(this, checkRadix(radix))");
                throw new NumberFormatException(AbstractC2995aW.v0(string, "Expected a digit or '-' but was 0x"));
            }
            j = j2;
        }
        return c4848vb.r();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2460Hb
    public final boolean l(long j) {
        C4848vb c4848vb;
        if (!(j >= 0)) {
            throw new IllegalArgumentException(AbstractC2995aW.v0(Long.valueOf(j), "byteCount < 0: ").toString());
        }
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            c4848vb = this.b;
            if (c4848vb.b >= j) {
                return true;
            }
        } while (this.f3026a.read(c4848vb, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1);
        return false;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        AbstractC2995aW.q(byteBuffer, "sink");
        C4848vb c4848vb = this.b;
        if (c4848vb.b == 0 && this.f3026a.read(c4848vb, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return c4848vb.read(byteBuffer);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2460Hb
    public final byte readByte() throws EOFException {
        D(1L);
        return this.b.readByte();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2460Hb
    public final int readInt() throws EOFException {
        D(4L);
        return this.b.readInt();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2460Hb
    public final short readShort() throws EOFException {
        D(2L);
        return this.b.readShort();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2460Hb
    public final void skip(long j) throws EOFException {
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j > 0) {
            C4848vb c4848vb = this.b;
            if (c4848vb.b == 0 && this.f3026a.read(c4848vb, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, c4848vb.b);
            c4848vb.skip(jMin);
            j -= jMin;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3588h80
    public final Ic0 timeout() {
        return this.f3026a.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f3026a + ')';
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3588h80
    public final long read(C4848vb c4848vb, long j) {
        AbstractC2995aW.q(c4848vb, "sink");
        if (j >= 0) {
            if (true ^ this.c) {
                C4848vb c4848vb2 = this.b;
                if (c4848vb2.b == 0 && this.f3026a.read(c4848vb2, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    return -1L;
                }
                return c4848vb2.read(c4848vb, Math.min(j, c4848vb2.b));
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(AbstractC2995aW.v0(Long.valueOf(j), "byteCount < 0: ").toString());
    }
}
