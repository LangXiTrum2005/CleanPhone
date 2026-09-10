package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.t7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4638t7 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5017a;
    public final boolean b;
    public final C4619sw c;

    public C4638t7(int i, C4619sw c4619sw, boolean z) {
        super(AbstractC3950lJ.p("AudioTrack write failed: ", i));
        this.b = z;
        this.f5017a = i;
        this.c = c4619sw;
    }
}
