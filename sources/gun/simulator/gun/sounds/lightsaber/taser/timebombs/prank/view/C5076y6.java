package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.y6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5076y6 implements InterfaceC4463r70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5260a = 0;
    public final Object b;
    public final Object c;

    public C5076y6(OutputStream outputStream, Ic0 ic0) {
        this.b = outputStream;
        this.c = ic0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4463r70, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        int i = this.f5260a;
        Object obj = this.b;
        switch (i) {
            case 0:
                A6 a6 = (A6) obj;
                InterfaceC4463r70 interfaceC4463r70 = (InterfaceC4463r70) this.c;
                a6.h();
                try {
                    try {
                        interfaceC4463r70.close();
                        if (a6.i()) {
                            throw a6.j(null);
                        }
                        return;
                    } catch (IOException e) {
                        if (!a6.i()) {
                            throw e;
                        }
                        throw a6.j(e);
                    }
                } catch (Throwable th) {
                    a6.i();
                    throw th;
                }
            default:
                ((OutputStream) obj).close();
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0098 A[LOOP:1: B:12:0x0062->B:25:0x0098, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x009a A[SYNTHETIC] */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4463r70
    public final void d(C4848vb c4848vb, long j) throws IOException {
        A6 a6;
        int i = this.f5260a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                AbstractC2995aW.q(c4848vb, "source");
                AbstractC2845Vx.P(c4848vb.b, 0L, j);
                while (j > 0) {
                    V30 v30 = c4848vb.f5139a;
                    AbstractC2995aW.n(v30);
                    long j2 = 0;
                    try {
                        try {
                            while (j2 < PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                                j2 += (long) (v30.c - v30.b);
                                if (j2 >= j) {
                                    j2 = j;
                                    a6 = (A6) obj;
                                    InterfaceC4463r70 interfaceC4463r70 = (InterfaceC4463r70) obj2;
                                    a6.h();
                                    interfaceC4463r70.d(c4848vb, j2);
                                    if (!a6.i()) {
                                        throw a6.j(null);
                                    }
                                    j -= j2;
                                } else {
                                    v30 = v30.f;
                                    AbstractC2995aW.n(v30);
                                }
                            }
                            interfaceC4463r70.d(c4848vb, j2);
                            if (!a6.i()) {
                                throw a6.j(null);
                            }
                            j -= j2;
                        } catch (IOException e) {
                            if (!a6.i()) {
                                throw e;
                            }
                            throw a6.j(e);
                        }
                    } catch (Throwable th) {
                        a6.i();
                        throw th;
                    }
                    a6 = (A6) obj;
                    InterfaceC4463r70 interfaceC4463r71 = (InterfaceC4463r70) obj2;
                    a6.h();
                }
                return;
            default:
                AbstractC2995aW.q(c4848vb, "source");
                AbstractC2845Vx.P(c4848vb.b, 0L, j);
                while (j > 0) {
                    ((Ic0) obj2).f();
                    V30 v31 = c4848vb.f5139a;
                    AbstractC2995aW.n(v31);
                    int iMin = (int) Math.min(j, v31.c - v31.b);
                    ((OutputStream) obj).write(v31.f3857a, v31.b, iMin);
                    int i2 = v31.b + iMin;
                    v31.b = i2;
                    long j3 = iMin;
                    j -= j3;
                    c4848vb.b -= j3;
                    if (i2 == v31.c) {
                        c4848vb.f5139a = v31.a();
                        AbstractC3228d40.a(v31);
                    }
                }
                return;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4463r70, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.f5260a;
        Object obj = this.b;
        switch (i) {
            case 0:
                A6 a6 = (A6) obj;
                InterfaceC4463r70 interfaceC4463r70 = (InterfaceC4463r70) this.c;
                a6.h();
                try {
                    try {
                        interfaceC4463r70.flush();
                        if (a6.i()) {
                            throw a6.j(null);
                        }
                        return;
                    } catch (IOException e) {
                        if (!a6.i()) {
                            throw e;
                        }
                        throw a6.j(e);
                    }
                } catch (Throwable th) {
                    a6.i();
                    throw th;
                }
            default:
                ((OutputStream) obj).flush();
                return;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4463r70
    public final Ic0 timeout() {
        switch (this.f5260a) {
            case 0:
                return (A6) this.b;
            default:
                return (Ic0) this.c;
        }
    }

    public final String toString() {
        switch (this.f5260a) {
            case 0:
                return "AsyncTimeout.sink(" + ((InterfaceC4463r70) this.c) + ')';
            default:
                return "sink(" + ((OutputStream) this.b) + ')';
        }
    }

    public C5076y6(HX hx, C5076y6 c5076y6) {
        this.b = hx;
        this.c = c5076y6;
    }
}
