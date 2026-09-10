package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Iu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2505Iu implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver.OnDrawListener f3245a;
    public final /* synthetic */ ViewTreeObserverOnDrawListenerC2531Ju b;

    public RunnableC2505Iu(ViewTreeObserverOnDrawListenerC2531Ju viewTreeObserverOnDrawListenerC2531Ju, ViewTreeObserver.OnDrawListener onDrawListener) {
        this.b = viewTreeObserverOnDrawListenerC2531Ju;
        this.f3245a = onDrawListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3743iz c3743izA = C3743iz.a();
        c3743izA.getClass();
        Tg0.a();
        c3743izA.d.set(true);
        this.b.b.b = true;
        View view = this.b.f3288a;
        view.getViewTreeObserver().removeOnDrawListener(this.f3245a);
        this.b.b.f3329a.clear();
    }
}
