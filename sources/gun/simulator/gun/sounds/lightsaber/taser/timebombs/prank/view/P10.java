package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Vibrator;
import android.view.SurfaceView;
import com.badlogic.gdx.backends.android.IControl;
import com.badlogic.gdx.backends.android.SpineController;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ActivityRussianRouletteBinding;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class P10 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3530a;
    public final /* synthetic */ C4629t20 b;

    public /* synthetic */ P10(C4629t20 c4629t20, int i) {
        this.f3530a = i;
        this.b = c4629t20;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3530a;
        C4629t20 c4629t20 = this.b;
        switch (i) {
            case 0:
                AbstractC2995aW.q(c4629t20, "this$0");
                SurfaceView surfaceView = c4629t20.f5012a.h;
                if (surfaceView != null) {
                    surfaceView.setVisibility(4);
                }
                Vibrator vibratorE = c4629t20.e();
                if (vibratorE != null) {
                    try {
                        vibratorE.cancel();
                    } catch (Throwable th) {
                        AbstractC3375el.v(th);
                        return;
                    }
                }
                break;
            case 1:
                AbstractC2995aW.q(c4629t20, "this$0");
                c4629t20.k(Integer.valueOf(c4629t20.m));
                break;
            case 2:
                AbstractC2995aW.q(c4629t20, "this$0");
                ActivityRussianRouletteBinding activityRussianRouletteBinding = c4629t20.d;
                activityRussianRouletteBinding.lavShootWarn.setVisibility(0);
                activityRussianRouletteBinding.lavShootWarn.requestLayout();
                activityRussianRouletteBinding.lavShootWarn.e();
                activityRussianRouletteBinding.lavShootWarn.a(c4629t20.S);
                break;
            default:
                ArrayList arrayList = c4629t20.t;
                if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((Boolean) it.next()).booleanValue()) {
                            c4629t20.k(Integer.valueOf(c4629t20.l));
                        }
                    }
                }
                for (int i2 = 0; i2 < 6; i2++) {
                    ArrayList arrayList2 = c4629t20.r;
                    Boolean bool = Boolean.FALSE;
                    arrayList2.set(i2, bool);
                    c4629t20.s.set(i2, bool);
                    ArrayList arrayList3 = c4629t20.t;
                    if (((Boolean) arrayList3.get(i2)).booleanValue()) {
                        SpineController spineController = c4629t20.c;
                        if (spineController != null) {
                            IControl.DefaultImpls.addAnimation$default(spineController, AbstractC3950lJ.p("bullet", i2 + 1), i2 + 31, "xiadan", false, 0.0f, null, 48, null);
                        }
                        if (spineController != null) {
                            spineController.hideSlot("reload", String.valueOf(i2 + 1));
                        }
                        arrayList3.set(i2, bool);
                    }
                }
                c4629t20.y = false;
                break;
        }
    }
}
