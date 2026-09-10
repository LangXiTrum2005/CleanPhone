package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Qy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2716Qy implements InterfaceC3588h80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f3635a;
    public final EX b;
    public final Inflater c;
    public final C3418fD d;
    public final CRC32 e;

    public C2716Qy(InterfaceC3588h80 interfaceC3588h80) {
        AbstractC2995aW.q(interfaceC3588h80, "source");
        EX ex = new EX(interfaceC3588h80);
        this.b = ex;
        Inflater inflater = new Inflater(true);
        this.c = inflater;
        this.d = new C3418fD(ex, inflater);
        this.e = new CRC32();
    }

    public static void a(int i, int i2, String str) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3)));
        }
    }

    public final void b(C4848vb c4848vb, long j, long j2) {
        V30 v30 = c4848vb.f5139a;
        AbstractC2995aW.n(v30);
        while (true) {
            int i = v30.c;
            int i2 = v30.b;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            v30 = v30.f;
            AbstractC2995aW.n(v30);
        }
        while (j2 > 0) {
            int i3 = (int) (((long) v30.b) + j);
            int iMin = (int) Math.min(v30.c - i3, j2);
            this.e.update(v30.f3857a, i3, iMin);
            j2 -= (long) iMin;
            v30 = v30.f;
            AbstractC2995aW.n(v30);
            j = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3588h80
    public final long read(C4848vb c4848vb, long j) throws IOException {
        EX ex;
        long j2;
        AbstractC2995aW.q(c4848vb, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC2995aW.v0(Long.valueOf(j), "byteCount < 0: ").toString());
        }
        if (j == 0) {
            return 0L;
        }
        byte b = this.f3635a;
        CRC32 crc32 = this.e;
        EX ex2 = this.b;
        if (b == 0) {
            ex2.D(10L);
            C4848vb c4848vb2 = ex2.b;
            byte bN = c4848vb2.n(3L);
            boolean z = ((bN >> 1) & 1) == 1;
            if (z) {
                b(ex2.b, 0L, 10L);
            }
            a(8075, ex2.readShort(), "ID1ID2");
            ex2.skip(8L);
            if (((bN >> 2) & 1) == 1) {
                ex2.D(2L);
                if (z) {
                    b(ex2.b, 0L, 2L);
                }
                short s = c4848vb2.readShort();
                long j3 = (short) (((s & 255) << 8) | ((s & 65280) >>> 8));
                ex2.D(j3);
                if (z) {
                    b(ex2.b, 0L, j3);
                    j2 = j3;
                } else {
                    j2 = j3;
                }
                ex2.skip(j2);
            }
            if (((bN >> 3) & 1) == 1) {
                ex = ex2;
                long jA = ex2.a((byte) 0, 0L, Long.MAX_VALUE);
                if (jA == -1) {
                    throw new EOFException();
                }
                if (z) {
                    b(ex.b, 0L, jA + 1);
                }
                ex.skip(jA + 1);
            } else {
                ex = ex2;
            }
            if (((bN >> 4) & 1) == 1) {
                long jA2 = ex.a((byte) 0, 0L, Long.MAX_VALUE);
                if (jA2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    b(ex.b, 0L, jA2 + 1);
                }
                ex.skip(jA2 + 1);
            }
            if (z) {
                ex.D(2L);
                short s2 = c4848vb2.readShort();
                a((short) (((s2 & 255) << 8) | ((s2 & 65280) >>> 8)), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            this.f3635a = (byte) 1;
        } else {
            ex = ex2;
        }
        if (this.f3635a == 1) {
            long j4 = c4848vb.b;
            long j5 = this.d.read(c4848vb, j);
            if (j5 != -1) {
                b(c4848vb, j4, j5);
                return j5;
            }
            this.f3635a = (byte) 2;
        }
        if (this.f3635a != 2) {
            return -1L;
        }
        ex.D(4L);
        C4848vb c4848vb3 = ex.b;
        a(AbstractC2845Vx.h0(c4848vb3.readInt()), (int) crc32.getValue(), "CRC");
        ex.D(4L);
        a(AbstractC2845Vx.h0(c4848vb3.readInt()), (int) this.c.getBytesWritten(), "ISIZE");
        this.f3635a = (byte) 3;
        if (ex.K()) {
            return -1L;
        }
        throw new IOException("gzip finished without exhausting source");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3588h80
    public final Ic0 timeout() {
        return this.b.f3026a.timeout();
    }
}
