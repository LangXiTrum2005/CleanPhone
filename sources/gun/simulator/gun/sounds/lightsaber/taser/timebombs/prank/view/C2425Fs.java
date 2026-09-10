package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2425Fs implements BI {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3091a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ C2425Fs(boolean z, int i) {
        this.f3091a = i;
        this.b = z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BI
    public final void invoke(Object obj) {
        int i = this.f3091a;
        boolean z = this.b;
        JU ju = (JU) obj;
        switch (i) {
            case 0:
                ju.onShuffleModeEnabledChanged(z);
                break;
            default:
                ju.o(z);
                break;
        }
    }
}
