package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.animation.ValueAnimator;
import android.media.SoundPool;
import android.os.Vibrator;
import android.util.SparseArray;
import android.view.VelocityTracker;
import android.widget.VideoView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.RussianRouletteActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ActivityRussianRouletteBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class L10 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RussianRouletteActivity f3334a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L10(RussianRouletteActivity russianRouletteActivity, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f3334a = russianRouletteActivity;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new L10(this.f3334a, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        L10 l10 = (L10) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        l10.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        AbstractC3375el.b0(obj);
        RussianRouletteActivity russianRouletteActivity = this.f3334a;
        VideoView videoView = ((ActivityRussianRouletteBinding) russianRouletteActivity.getMBinding()).vvScene;
        AbstractC2995aW.p(videoView, "vvScene");
        SparseArray sparseArray = Oh0.f3515a;
        if (videoView.getVisibility() == 0) {
            ((ActivityRussianRouletteBinding) russianRouletteActivity.getMBinding()).vvScene.stopPlayback();
        }
        C4629t20 c4629t20O = russianRouletteActivity.o();
        ValueAnimator valueAnimator = c4629t20O.D;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c4629t20O.D = null;
        c4629t20O.d().removeCallbacksAndMessages(null);
        VelocityTracker velocityTracker = c4629t20O.A;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        c4629t20O.A = null;
        ((SoundPool) c4629t20O.R.getValue()).release();
        ((AbstractC3477fv) c4629t20O.O.getValue()).a();
        Vibrator vibratorE = c4629t20O.e();
        if (vibratorE != null) {
            try {
                vibratorE.cancel();
            } catch (Throwable th) {
                AbstractC3375el.v(th);
            }
        }
        return C5033xf0.f5238a;
    }
}
