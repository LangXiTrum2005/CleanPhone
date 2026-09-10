package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.badlogic.gdx.backends.android.SpineController;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Q10 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3584a = 1;
    public final /* synthetic */ ZX b;
    public final /* synthetic */ C4629t20 c;

    public /* synthetic */ Q10(ZX zx, C4629t20 c4629t20) {
        this.b = zx;
        this.c = c4629t20;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LifecycleCoroutineScope lifecycleScope;
        C4991x70 skeleton;
        int i = this.f3584a;
        C4629t20 c4629t20 = this.c;
        ZX zx = this.b;
        switch (i) {
            case 0:
                AbstractC2995aW.q(c4629t20, "this$0");
                AbstractC2995aW.q(zx, "$number");
                for (String str : AbstractC2340Cl.K("banji", "jichui", "dancao", "qiang")) {
                    SpineController spineController = c4629t20.c;
                    if (spineController != null && (skeleton = spineController.getSkeleton(str)) != null) {
                        skeleton.d();
                    }
                }
                View view = c4629t20.d.mask;
                AbstractC2995aW.p(view, "mask");
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                valueAnimatorOfFloat.setDuration(400L);
                valueAnimatorOfFloat.addUpdateListener(new Tc0(view, 2));
                valueAnimatorOfFloat.start();
                LifecycleOwner lifecycleOwner = c4629t20.b;
                if (lifecycleOwner != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                    WD.D(lifecycleScope, null, 0, new C3312e20(c4629t20, zx, null), 3);
                    break;
                }
                break;
            default:
                AbstractC2995aW.q(zx, "$number");
                AbstractC2995aW.q(c4629t20, "this$0");
                S3.b("russian_roulette_display", "" + zx.f4074a);
                c4629t20.x = true;
                break;
        }
    }

    public /* synthetic */ Q10(C4629t20 c4629t20, ZX zx) {
        this.c = c4629t20;
        this.b = zx;
    }
}
