package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.AudioTrack;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.PlaybackParams;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.om, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC4255om {
    public static /* synthetic */ AudioTrack.Builder e() {
        return new AudioTrack.Builder();
    }

    public static /* bridge */ /* synthetic */ MediaDrm.KeyStatus k(Object obj) {
        return (MediaDrm.KeyStatus) obj;
    }

    public static /* synthetic */ PlaybackParams l() {
        return new PlaybackParams();
    }

    public static /* bridge */ /* synthetic */ boolean z(Object obj) {
        return obj instanceof MediaDrmResetException;
    }
}
