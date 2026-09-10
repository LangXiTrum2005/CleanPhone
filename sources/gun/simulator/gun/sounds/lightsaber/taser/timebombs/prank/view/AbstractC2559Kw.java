package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.MediaDrm;
import android.media.metrics.LogSessionId;
import androidx.annotation.DoNotInline;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Kw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2559Kw {
    @DoNotInline
    public static boolean a(MediaDrm mediaDrm, String str) {
        return mediaDrm.requiresSecureDecoder(str);
    }

    @DoNotInline
    public static void b(MediaDrm mediaDrm, byte[] bArr, WU wu) {
        VU vu = wu.f3921a;
        vu.getClass();
        LogSessionId logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        LogSessionId logSessionId2 = vu.f3872a;
        if (logSessionId2.equals(logSessionId)) {
            return;
        }
        MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
        playbackComponent.getClass();
        D4.g(playbackComponent).setLogSessionId(logSessionId2);
    }
}
