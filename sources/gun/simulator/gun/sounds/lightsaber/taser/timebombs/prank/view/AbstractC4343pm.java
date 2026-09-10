package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.AudioTrack;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.pm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4343pm {
    @DoNotInline
    public static void a(AudioTrack audioTrack, @Nullable C4518rm c4518rm) {
        audioTrack.setPreferredDevice(c4518rm == null ? null : c4518rm.f4944a);
    }
}
