package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3218d extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient InterfaceC4530rv f4252a;

    public C3218d(InterfaceC4530rv interfaceC4530rv) {
        super("Flow was aborted, no more elements needed");
        this.f4252a = interfaceC4530rv;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
