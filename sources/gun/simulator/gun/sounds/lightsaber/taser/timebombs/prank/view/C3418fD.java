package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.fD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3418fD implements InterfaceC3588h80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2460Hb f4360a;
    public final Inflater b;
    public int c;
    public boolean d;

    public C3418fD(EX ex, Inflater inflater) {
        this.f4360a = ex;
        this.b = inflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d) {
            return;
        }
        this.b.end();
        this.d = true;
        this.f4360a.close();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3588h80
    public final long read(C4848vb c4848vb, long j) {
        long j2;
        AbstractC2995aW.q(c4848vb, "sink");
        while (j >= 0) {
            if (!(!this.d)) {
                throw new IllegalStateException("closed".toString());
            }
            InterfaceC2460Hb interfaceC2460Hb = this.f4360a;
            Inflater inflater = this.b;
            if (j == 0) {
                j2 = 0;
            } else {
                try {
                    V30 v30W = c4848vb.w(1);
                    int iMin = (int) Math.min(j, 8192 - v30W.c);
                    if (inflater.needsInput() && !interfaceC2460Hb.K()) {
                        V30 v30 = interfaceC2460Hb.getBuffer().f5139a;
                        AbstractC2995aW.n(v30);
                        int i = v30.c;
                        int i2 = v30.b;
                        int i3 = i - i2;
                        this.c = i3;
                        inflater.setInput(v30.f3857a, i2, i3);
                    }
                    int iInflate = inflater.inflate(v30W.f3857a, v30W.c, iMin);
                    int i4 = this.c;
                    if (i4 != 0) {
                        int remaining = i4 - inflater.getRemaining();
                        this.c -= remaining;
                        interfaceC2460Hb.skip(remaining);
                    }
                    if (iInflate > 0) {
                        v30W.c += iInflate;
                        j2 = iInflate;
                        c4848vb.b += j2;
                    } else {
                        if (v30W.b == v30W.c) {
                            c4848vb.f5139a = v30W.a();
                            AbstractC3228d40.a(v30W);
                        }
                        j2 = 0;
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            if (j2 > 0) {
                return j2;
            }
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
            if (interfaceC2460Hb.K()) {
                throw new EOFException("source exhausted prematurely");
            }
        }
        throw new IllegalArgumentException(AbstractC2995aW.v0(Long.valueOf(j), "byteCount < 0: ").toString());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3588h80
    public final Ic0 timeout() {
        return this.f4360a.timeout();
    }
}
