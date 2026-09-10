package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import androidx.annotation.DoNotInline;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.qm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4431qm {
    @DoNotInline
    public static void a(AudioTrack audioTrack, WU wu) {
        VU vu = wu.f3921a;
        vu.getClass();
        LogSessionId logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        LogSessionId logSessionId2 = vu.f3872a;
        if (logSessionId2.equals(logSessionId)) {
            return;
        }
        audioTrack.setLogSessionId(logSessionId2);
    }
}
