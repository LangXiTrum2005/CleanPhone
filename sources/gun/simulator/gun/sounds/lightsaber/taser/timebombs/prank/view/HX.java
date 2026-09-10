package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
public final class HX extends A6 {
    public final /* synthetic */ int k = 0;
    public final Object l;

    public HX(MA ma) {
        AbstractC2995aW.q(ma, "this$0");
        this.l = ma;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.A6
    public final InterruptedIOException j(IOException iOException) {
        switch (this.k) {
            case 1:
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException.initCause(iOException);
                }
                return socketTimeoutException;
            case 2:
                SocketTimeoutException socketTimeoutException2 = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException2.initCause(iOException);
                }
                return socketTimeoutException2;
            default:
                return super.j(iOException);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.A6
    public final void k() {
        switch (this.k) {
            case 0:
                ((IX) this.l).cancel();
                return;
            case 1:
                ((MA) this.l).e(EnumC2502Ir.CANCEL);
                GA ga = ((MA) this.l).b;
                synchronized (ga) {
                    long j = ga.p;
                    long j2 = ga.o;
                    if (j < j2) {
                        return;
                    }
                    ga.o = j2 + 1;
                    ga.q = System.nanoTime() + ((long) 1000000000);
                    ga.i.c(new C4146nb0(ga, AbstractC2995aW.v0(" ping", ga.d), 1), 0L);
                    return;
                }
            default:
                Object obj = this.l;
                try {
                    ((Socket) obj).close();
                    return;
                } catch (AssertionError e) {
                    if (!AbstractC4496rb.s(e)) {
                        throw e;
                    }
                    AbstractC4926wS.f5180a.log(Level.WARNING, AbstractC2995aW.v0((Socket) obj, "Failed to close timed out socket "), (Throwable) e);
                    return;
                } catch (Exception e2) {
                    AbstractC4926wS.f5180a.log(Level.WARNING, AbstractC2995aW.v0((Socket) obj, "Failed to close timed out socket "), (Throwable) e2);
                    return;
                }
        }
    }

    public final void l() throws InterruptedIOException {
        if (i()) {
            throw j(null);
        }
    }

    public HX(IX ix) {
        this.l = ix;
    }

    public HX(Socket socket) {
        this.l = socket;
    }
}
