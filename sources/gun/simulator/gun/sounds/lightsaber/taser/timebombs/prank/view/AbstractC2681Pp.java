package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Pp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2681Pp {
    static {
        Qm0.D(new byte[]{-73, 55, -84, 35, 56, -104, 17, 5}, new byte[]{-45, 71, -40, 96, 89, -5, 121, 96});
        Qm0.D(new byte[]{-56, 54, 68, -116, 2, -80, -45, 93, -31, 39, 87, -91}, new byte[]{-116, 70, 48, -64, 109, -47, -73, 20});
    }

    public static void a(String str, ImageView imageView) {
        if (str != null) {
            try {
                if (str.equals("")) {
                    return;
                }
                WeakReference weakReference = new WeakReference(imageView);
                C4981x20.u().t(new RunnableC3163cN(weakReference, new WeakReference(((ImageView) weakReference.get()).getContext()), str));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
