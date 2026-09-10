package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC5096yM implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5273a;
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC5184zM b;

    public RunnableC5096yM(ViewTreeObserverOnGlobalLayoutListenerC5184zM viewTreeObserverOnGlobalLayoutListenerC5184zM, int i) {
        this.b = viewTreeObserverOnGlobalLayoutListenerC5184zM;
        this.f5273a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewTreeObserverOnGlobalLayoutListenerC5184zM viewTreeObserverOnGlobalLayoutListenerC5184zM = this.b;
        viewTreeObserverOnGlobalLayoutListenerC5184zM.f5323a.h.requestFocus();
        viewTreeObserverOnGlobalLayoutListenerC5184zM.f5323a.c.z.scrollToPosition(this.f5273a);
    }
}
