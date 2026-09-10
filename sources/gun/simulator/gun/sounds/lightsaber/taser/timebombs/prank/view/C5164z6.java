package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.z6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5164z6 implements InterfaceC3588h80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5314a = 0;
    public final Object b;
    public final Object c;

    public C5164z6(InputStream inputStream, Ic0 ic0) {
        AbstractC2995aW.q(inputStream, "input");
        this.b = inputStream;
        this.c = ic0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = this.f5314a;
        Object obj = this.b;
        switch (i) {
            case 0:
                A6 a6 = (A6) obj;
                InterfaceC3588h80 interfaceC3588h80 = (InterfaceC3588h80) this.c;
                a6.h();
                try {
                    try {
                        interfaceC3588h80.close();
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
                ((InputStream) obj).close();
                return;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3588h80
    public final long read(C4848vb c4848vb, long j) throws IOException {
        int i = this.f5314a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                AbstractC2995aW.q(c4848vb, "sink");
                A6 a6 = (A6) obj;
                InterfaceC3588h80 interfaceC3588h80 = (InterfaceC3588h80) obj2;
                a6.h();
                try {
                    try {
                        long j2 = interfaceC3588h80.read(c4848vb, j);
                        if (a6.i()) {
                            throw a6.j(null);
                        }
                        return j2;
                    } catch (Throwable th) {
                        a6.i();
                        throw th;
                    }
                } catch (IOException e) {
                    if (a6.i()) {
                        throw a6.j(e);
                    }
                    throw e;
                }
            default:
                AbstractC2995aW.q(c4848vb, "sink");
                if (j == 0) {
                    return 0L;
                }
                if (j < 0) {
                    throw new IllegalArgumentException(AbstractC2995aW.v0(Long.valueOf(j), "byteCount < 0: ").toString());
                }
                try {
                    ((Ic0) obj2).f();
                    V30 v30W = c4848vb.w(1);
                    int i2 = ((InputStream) obj).read(v30W.f3857a, v30W.c, (int) Math.min(j, 8192 - v30W.c));
                    if (i2 == -1) {
                        if (v30W.b == v30W.c) {
                            c4848vb.f5139a = v30W.a();
                            AbstractC3228d40.a(v30W);
                        }
                        return -1L;
                    }
                    v30W.c += i2;
                    long j3 = i2;
                    c4848vb.b += j3;
                    return j3;
                } catch (AssertionError e2) {
                    if (AbstractC4496rb.s(e2)) {
                        throw new IOException(e2);
                    }
                    throw e2;
                }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3588h80
    public final Ic0 timeout() {
        switch (this.f5314a) {
            case 0:
                return (A6) this.b;
            default:
                return (Ic0) this.c;
        }
    }

    public final String toString() {
        switch (this.f5314a) {
            case 0:
                return "AsyncTimeout.source(" + ((InterfaceC3588h80) this.c) + ')';
            default:
                return "source(" + ((InputStream) this.b) + ')';
        }
    }

    public C5164z6(HX hx, C5164z6 c5164z6) {
        this.b = hx;
        this.c = c5164z6;
    }
}
