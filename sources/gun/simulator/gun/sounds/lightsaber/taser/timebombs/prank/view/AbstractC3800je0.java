package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Bundle;
import androidx.browser.trusted.TrustedWebActivityDisplayMode;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.je0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3800je0 {
    public static TrustedWebActivityDisplayMode a(Bundle bundle) {
        return bundle.getInt(TrustedWebActivityDisplayMode.KEY_ID) != 1 ? new TrustedWebActivityDisplayMode.DefaultMode() : TrustedWebActivityDisplayMode.ImmersiveMode.fromBundle(bundle);
    }
}
