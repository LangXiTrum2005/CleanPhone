package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.zM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC5184zM implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EM f5323a;

    public ViewTreeObserverOnGlobalLayoutListenerC5184zM(EM em) {
        this.f5323a = em;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i;
        EM em = this.f5323a;
        em.h.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        int i2 = em.p;
        if ((i2 == 2 || i2 == 3) && i2 == 2 && (i = em.c.u) >= 0) {
            em.h.post(new RunnableC5096yM(this, i));
        }
    }
}
