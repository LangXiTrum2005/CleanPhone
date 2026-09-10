package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.core.widget.ContentLoadingProgressBar;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Qj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2701Qj implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3619a;
    public final /* synthetic */ ContentLoadingProgressBar b;

    public /* synthetic */ RunnableC2701Qj(ContentLoadingProgressBar contentLoadingProgressBar, int i) {
        this.f3619a = i;
        this.b = contentLoadingProgressBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3619a;
        ContentLoadingProgressBar contentLoadingProgressBar = this.b;
        switch (i) {
            case 0:
                contentLoadingProgressBar.lambda$new$0();
                break;
            case 1:
                contentLoadingProgressBar.lambda$new$1();
                break;
            case 2:
                contentLoadingProgressBar.showOnUiThread();
                break;
            default:
                contentLoadingProgressBar.hideOnUiThread();
                break;
        }
    }
}
