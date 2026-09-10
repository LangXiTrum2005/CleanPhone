package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.qN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4394qN {
    @DoNotInline
    public static void a(InterfaceC4726u7 interfaceC4726u7, @Nullable Object obj) {
        C4518rm c4518rm;
        AudioDeviceInfo audioDeviceInfoI = YB.i(obj);
        C2315Bm c2315Bm = (C2315Bm) interfaceC4726u7;
        if (audioDeviceInfoI == null) {
            c4518rm = null;
        } else {
            c2315Bm.getClass();
            c4518rm = new C4518rm(audioDeviceInfoI);
        }
        c2315Bm.Y = c4518rm;
        AudioTrack audioTrack = c2315Bm.u;
        if (audioTrack != null) {
            AbstractC4343pm.a(audioTrack, c4518rm);
        }
    }
}
