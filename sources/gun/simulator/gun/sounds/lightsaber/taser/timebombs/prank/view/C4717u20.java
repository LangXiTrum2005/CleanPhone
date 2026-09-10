package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewbinding.ViewBinding;
import com.badlogic.gdx.backends.android.SpineController;
import com.badlogic.gdx.graphics.Color;
import com.mbridge.msdk.MBridgeConstans;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.RussianRouletteActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ActivityRussianRouletteBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.LayoutRussainRouletteGuideBinding;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.u20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4717u20 extends V9 {
    public final ActivityRussianRouletteBinding d;
    public final LifecycleOwner e;
    public final RussianRouletteActivity f;
    public boolean g;

    /* JADX WARN: Illegal instructions before constructor call */
    public C4717u20(ActivityRussianRouletteBinding activityRussianRouletteBinding, RussianRouletteActivity russianRouletteActivity, RussianRouletteActivity russianRouletteActivity2) {
        AbstractC2995aW.q(activityRussianRouletteBinding, "activityRussianRouletteBinding");
        AbstractC2995aW.q(russianRouletteActivity2, "mActivity");
        ConstraintLayout root = activityRussianRouletteBinding.getRoot();
        AbstractC2995aW.p(root, "getRoot(...)");
        super(root, russianRouletteActivity);
        this.d = activityRussianRouletteBinding;
        this.f = russianRouletteActivity2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4681tf0
    public final View[] d() {
        return new TextView[]{((LayoutRussainRouletteGuideBinding) this.b).btGotIt};
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4681tf0
    public final ViewBinding e(ConstraintLayout constraintLayout) {
        LayoutRussainRouletteGuideBinding layoutRussainRouletteGuideBindingBind = LayoutRussainRouletteGuideBinding.bind(constraintLayout);
        AbstractC2995aW.p(layoutRussainRouletteGuideBindingBind, "bind(...)");
        return layoutRussainRouletteGuideBindingBind;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4593sf0
    public final void onClickView(View view) {
        C4991x70 skeleton;
        N70 n70B;
        C4991x70 skeleton2;
        AbstractC2995aW.q(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        if (AbstractC2995aW.i(view, ((LayoutRussainRouletteGuideBinding) this.b).btGotIt)) {
            if (this.g) {
                S3.b("russian_roulette_click", "tip_ok_first");
            }
            RussianRouletteActivity russianRouletteActivity = this.f;
            russianRouletteActivity.getClass();
            for (String str : AbstractC2340Cl.K("banji", "jichui", "dancao")) {
                SpineController spineController = russianRouletteActivity.e;
                if (spineController != null && (skeleton2 = spineController.getSkeleton(str)) != null) {
                    skeleton2.d();
                }
            }
            SpineController spineController2 = russianRouletteActivity.e;
            if (spineController2 != null) {
                spineController2.hideSlot("banji", "banji2");
            }
            SpineController spineController3 = russianRouletteActivity.e;
            if (spineController3 != null) {
                spineController3.hideSlot("banji", "banji_hong");
            }
            SpineController spineController4 = russianRouletteActivity.e;
            Color color = (spineController4 == null || (skeleton = spineController4.getSkeleton("banji")) == null || (n70B = skeleton.b("banji_hong")) == null) ? null : n70B.c;
            if (color != null) {
                color.f202a = 0.0f;
            }
            SpineController spineController5 = russianRouletteActivity.e;
            if (spineController5 != null) {
                spineController5.hideSlot("jichui", "jichui2");
            }
            SpineController spineController6 = russianRouletteActivity.e;
            if (spineController6 != null) {
                spineController6.hideSlot("jichui", "jichui_hong");
            }
            SpineController spineController7 = russianRouletteActivity.e;
            if (spineController7 != null) {
                spineController7.hideSlot("dancao", "dancao2");
            }
            SpineController spineController8 = russianRouletteActivity.e;
            if (spineController8 != null) {
                spineController8.hideSlot("dancao", "dancao_hong");
            }
            russianRouletteActivity.j(russianRouletteActivity.b);
            ActivityRussianRouletteBinding activityRussianRouletteBinding = this.d;
            activityRussianRouletteBinding.ivBack.setVisibility(0);
            activityRussianRouletteBinding.groupReload.setVisibility(0);
            activityRussianRouletteBinding.groupReloadDone.setVisibility(8);
            ((LayoutRussainRouletteGuideBinding) this.b).groupLayout.setVisibility(8);
            russianRouletteActivity.s(russianRouletteActivity.b);
        }
    }
}
