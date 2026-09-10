package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.metrics.LogSessionId;
import androidx.annotation.DoNotInline;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.vN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4833vN {
    @DoNotInline
    public static void a(C4130nN c4130nN, WU wu) {
        VU vu = wu.f3921a;
        vu.getClass();
        LogSessionId logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        LogSessionId logSessionId2 = vu.f3872a;
        if (logSessionId2.equals(logSessionId)) {
            return;
        }
        c4130nN.b.setString("log-session-id", logSessionId2.getStringId());
    }
}
