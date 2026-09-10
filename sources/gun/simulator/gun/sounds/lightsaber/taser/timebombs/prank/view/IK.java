package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Build;
import android.view.ViewGroup;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* JADX INFO: loaded from: classes.dex */
public abstract class IK {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f3212a = Build.VERSION.SDK_INT;

    public static int a(long j, long j2) {
        return Math.min(Math.max(0, j2 > 0 ? (int) (((j * 1.0d) / j2) * 100.0d) : 0), 100);
    }

    public static String b(long j) {
        StringBuilder sb = new StringBuilder();
        long j2 = j / ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        long j3 = ((j % 3600000) % ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) / 1000;
        if (j2 >= 10) {
            sb.append(j2);
        } else if (j2 > 0) {
            sb.append(0);
            sb.append(j2);
        } else {
            sb.append("00");
        }
        sb.append(":");
        if (j3 >= 10) {
            sb.append(j3);
        } else if (j3 > 0) {
            sb.append(0);
            sb.append(j3);
        } else {
            sb.append("00");
        }
        return sb.toString();
    }

    public static void c(ViewGroup viewGroup, boolean z) {
        if (viewGroup == null) {
            return;
        }
        if (z) {
            viewGroup.setSystemUiVisibility(0);
            return;
        }
        int i = f3212a;
        if (i >= 19) {
            viewGroup.setSystemUiVisibility(3846);
        } else if (i >= 16) {
            viewGroup.setSystemUiVisibility(5);
        } else {
            viewGroup.setSystemUiVisibility(1);
        }
    }
}
