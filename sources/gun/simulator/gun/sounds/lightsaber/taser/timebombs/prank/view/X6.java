package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.AudioAttributes;
import androidx.annotation.DoNotInline;

/* JADX INFO: loaded from: classes2.dex */
public abstract class X6 {
    @DoNotInline
    public static void a(AudioAttributes.Builder builder, int i) {
        builder.setAllowedCapturePolicy(i);
    }
}
