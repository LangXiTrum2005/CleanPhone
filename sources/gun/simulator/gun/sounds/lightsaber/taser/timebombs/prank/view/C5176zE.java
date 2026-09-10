package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.zE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5176zE extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient InterfaceC5000xE f5320a;

    public C5176zE(String str, Throwable th, InterfaceC5000xE interfaceC5000xE) {
        super(str);
        this.f5320a = interfaceC5000xE;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C5176zE) {
                C5176zE c5176zE = (C5176zE) obj;
                if (!AbstractC2995aW.i(c5176zE.getMessage(), getMessage()) || !AbstractC2995aW.i(c5176zE.f5320a, this.f5320a) || !AbstractC2995aW.i(c5176zE.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        AbstractC2995aW.n(message);
        int iHashCode = (this.f5320a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f5320a;
    }
}
