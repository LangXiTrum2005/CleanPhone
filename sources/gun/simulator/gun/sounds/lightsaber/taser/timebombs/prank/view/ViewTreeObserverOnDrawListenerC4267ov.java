package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.view.ViewTreeObserver;
import java.util.HashMap;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ov, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewTreeObserverOnDrawListenerC4267ov implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RunnableC3252dN f4813a;

    public ViewTreeObserverOnDrawListenerC4267ov(RunnableC3252dN runnableC3252dN) {
        this.f4813a = runnableC3252dN;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        RunnableC3252dN runnableC3252dN = this.f4813a;
        HashMap map = (HashMap) ((C4355pv) runnableC3252dN.c).c.get(((Activity) runnableC3252dN.b).getClass());
        if (map == null || map.isEmpty()) {
            return;
        }
        for (ViewTreeObserver.OnDrawListener onDrawListener : map.values()) {
            if (onDrawListener != null) {
                onDrawListener.onDraw();
            }
        }
    }
}
