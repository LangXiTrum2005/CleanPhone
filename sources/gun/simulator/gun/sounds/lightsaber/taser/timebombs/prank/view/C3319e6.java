package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.e6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3319e6 {
    public static final C3054b6 Companion = new C3054b6(null);
    public static final int DEFAULT_SERVER_CODE = -1;
    private final Throwable cause;

    @InterfaceC3231d6
    private final int reason;
    private final int serverCode;

    public C3319e6(int i, Throwable th, int i2) {
        AbstractC2995aW.q(th, "cause");
        this.serverCode = i;
        this.cause = th;
        this.reason = i2;
    }

    public final Throwable getCause() {
        return this.cause;
    }

    public final int getReason() {
        return this.reason;
    }

    public final int getServerCode() {
        return this.serverCode;
    }
}
