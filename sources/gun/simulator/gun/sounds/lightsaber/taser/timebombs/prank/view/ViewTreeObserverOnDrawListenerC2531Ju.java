package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ju, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC2531Ju implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f3288a;
    public final /* synthetic */ C2557Ku b;

    public ViewTreeObserverOnDrawListenerC2531Ju(C2557Ku c2557Ku, View view) {
        this.b = c2557Ku;
        this.f3288a = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        Tg0.f().post(new RunnableC2505Iu(this, this));
    }
}
