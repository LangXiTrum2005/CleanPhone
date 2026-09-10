package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.View;
import com.badlogic.gdx.backends.android.SpineController;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.RussianRouletteActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class H10 implements SpineController.SpineAnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RussianRouletteActivity f3149a;

    public H10(RussianRouletteActivity russianRouletteActivity) {
        this.f3149a = russianRouletteActivity;
    }

    @Override // com.badlogic.gdx.backends.android.SpineController.SpineAnimationCallback
    public final void onSpineAnimationChanged(SpineController spineController, View view) {
        AbstractC2995aW.q(spineController, "controller");
        int i = RussianRouletteActivity.t;
        RussianRouletteActivity russianRouletteActivity = this.f3149a;
        russianRouletteActivity.getClass();
        if (view != null) {
            view.setOnTouchListener(new UK(russianRouletteActivity, 1));
        }
        if (view != null) {
            view.post(new RunnableC3924l10(russianRouletteActivity, spineController, 1));
        }
    }
}
