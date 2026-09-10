package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2654Oo extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient InterfaceC3549gk f3524a;

    public C2654Oo(InterfaceC3549gk interfaceC3549gk) {
        this.f3524a = interfaceC3549gk;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f3524a.toString();
    }
}
