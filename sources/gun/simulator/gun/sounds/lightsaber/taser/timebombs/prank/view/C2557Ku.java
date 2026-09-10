package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ku, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2557Ku implements InterfaceC2481Hw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f3329a = Collections.newSetFromMap(new WeakHashMap());
    public volatile boolean b;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2481Hw
    public final void e(Activity activity) {
        if (!this.b && this.f3329a.add(activity)) {
            View decorView = activity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new ViewTreeObserverOnDrawListenerC2531Ju(this, decorView));
        }
    }
}
