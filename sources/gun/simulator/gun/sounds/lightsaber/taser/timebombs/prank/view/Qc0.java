package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Qc0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3609a;
    public final /* synthetic */ Toolbar b;

    public /* synthetic */ Qc0(Toolbar toolbar, int i) {
        this.f3609a = i;
        this.b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3609a;
        Toolbar toolbar = this.b;
        switch (i) {
            case 0:
                toolbar.collapseActionView();
                break;
            default:
                toolbar.invalidateMenu();
                break;
        }
    }
}
