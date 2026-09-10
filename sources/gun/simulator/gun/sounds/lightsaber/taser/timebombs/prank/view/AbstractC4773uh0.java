package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.Surface;
import androidx.annotation.DoNotInline;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.uh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4773uh0 {
    @DoNotInline
    public static void a(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            AbstractC4038mJ.d("Failed to call Surface.setFrameRate", e);
        }
    }
}
