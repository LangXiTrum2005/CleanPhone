package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.zip.Deflater;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.qA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4381qA implements InterfaceC4463r70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4873a = 1;
    public boolean b;
    public final Object c;
    public final Object d;

    public C4381qA(DX dx, Deflater deflater) {
        this.c = dx;
        this.d = deflater;
    }

    public final void a(boolean z) {
        V30 v30W;
        int iDeflate;
        InterfaceC2434Gb interfaceC2434Gb = (InterfaceC2434Gb) this.c;
        C4848vb buffer = interfaceC2434Gb.getBuffer();
        while (true) {
            v30W = buffer.w(1);
            Object obj = this.d;
            byte[] bArr = v30W.f3857a;
            if (z) {
                int i = v30W.c;
                iDeflate = ((Deflater) obj).deflate(bArr, i, 8192 - i, 2);
            } else {
                int i2 = v30W.c;
                iDeflate = ((Deflater) obj).deflate(bArr, i2, 8192 - i2);
            }
            if (iDeflate > 0) {
                v30W.c += iDeflate;
                buffer.b += (long) iDeflate;
                interfaceC2434Gb.z();
            } else if (((Deflater) obj).needsInput()) {
                break;
            }
        }
        if (v30W.b == v30W.c) {
            buffer.f5139a = v30W.a();
            AbstractC3228d40.a(v30W);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4463r70, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws Throwable {
        int i = this.f4873a;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                if (this.b) {
                    return;
                }
                this.b = true;
                C4556sA c4556sA = (C4556sA) obj2;
                C5059xw c5059xw = (C5059xw) obj;
                c4556sA.getClass();
                Ic0 ic0 = c5059xw.e;
                c5059xw.e = Ic0.d;
                ic0.a();
                ic0.b();
                c4556sA.e = 3;
                return;
            default:
                if (this.b) {
                    return;
                }
                ((Deflater) obj2).finish();
                a(false);
                th = null;
                try {
                    ((Deflater) obj2).end();
                    break;
                } catch (Throwable th) {
                    if (th == null) {
                        th = th;
                    }
                }
                try {
                    ((InterfaceC2434Gb) obj).close();
                    break;
                } catch (Throwable th2) {
                    if (th == null) {
                        th = th2;
                    }
                }
                this.b = true;
                if (th != null) {
                    throw th;
                }
                return;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4463r70
    public final void d(C4848vb c4848vb, long j) {
        int i = this.f4873a;
        Object obj = this.d;
        switch (i) {
            case 0:
                AbstractC2995aW.q(c4848vb, "source");
                if (!(!this.b)) {
                    throw new IllegalStateException("closed".toString());
                }
                long j2 = c4848vb.b;
                byte[] bArr = Vg0.f3884a;
                if (j < 0 || 0 > j2 || j2 < j) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                ((C4556sA) obj).d.d(c4848vb, j);
                return;
            default:
                AbstractC2995aW.q(c4848vb, "source");
                AbstractC2845Vx.P(c4848vb.b, 0L, j);
                while (j > 0) {
                    V30 v30 = c4848vb.f5139a;
                    AbstractC2995aW.n(v30);
                    int iMin = (int) Math.min(j, v30.c - v30.b);
                    ((Deflater) obj).setInput(v30.f3857a, v30.b, iMin);
                    a(false);
                    long j3 = iMin;
                    c4848vb.b -= j3;
                    int i2 = v30.b + iMin;
                    v30.b = i2;
                    if (i2 == v30.c) {
                        c4848vb.f5139a = v30.a();
                        AbstractC3228d40.a(v30);
                    }
                    j -= j3;
                }
                return;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4463r70, java.io.Flushable
    public final void flush() {
        switch (this.f4873a) {
            case 0:
                if (!this.b) {
                    ((C4556sA) this.d).d.flush();
                    break;
                }
                break;
            default:
                a(true);
                ((InterfaceC2434Gb) this.c).flush();
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4463r70
    public final Ic0 timeout() {
        int i = this.f4873a;
        Object obj = this.c;
        switch (i) {
            case 0:
                return (C5059xw) obj;
            default:
                return ((InterfaceC2434Gb) obj).timeout();
        }
    }

    public final String toString() {
        switch (this.f4873a) {
            case 1:
                return "DeflaterSink(" + ((InterfaceC2434Gb) this.c) + ')';
            default:
                return super.toString();
        }
    }

    public C4381qA(C4556sA c4556sA) {
        AbstractC2995aW.q(c4556sA, "this$0");
        this.d = c4556sA;
        this.c = new C5059xw(c4556sA.d.timeout());
    }
}
