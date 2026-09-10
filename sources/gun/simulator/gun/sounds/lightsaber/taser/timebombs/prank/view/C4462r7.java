package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.r7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4462r7 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4917a;
    public final boolean b;
    public final C4619sw c;

    /* JADX WARN: Illegal instructions before constructor call */
    public C4462r7(int i, int i2, int i3, int i4, C4619sw c4619sw, boolean z, RuntimeException runtimeException) {
        StringBuilder sbT = AbstractC3950lJ.t("AudioTrack init failed ", i, " Config(", i2, ", ");
        AbstractC3888ke0.t(sbT, i3, ", ", i4, ")");
        sbT.append(z ? " (recoverable)" : "");
        super(sbT.toString(), runtimeException);
        this.f4917a = i;
        this.b = z;
        this.c = c4619sw;
    }
}
