package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.annotation.DoNotInline;

/* JADX INFO: loaded from: classes2.dex */
public abstract class IN {
    @DoNotInline
    public static boolean a(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null || !display.isHdr()) {
            return false;
        }
        for (int i : display.getHdrCapabilities().getSupportedHdrTypes()) {
            if (i == 1) {
                return true;
            }
        }
        return false;
    }
}
