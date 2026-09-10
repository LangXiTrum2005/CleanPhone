package benzoyl;

import android.os.Build;
import android.view.View;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* JADX INFO: loaded from: classes2.dex */
public class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final int f15053attabal = Build.VERSION.SDK_INT;

    public static int attabal(long j, long j2) {
        return Math.min(Math.max(0, j2 > 0 ? (int) (((j * 1.0d) / j2) * 100.0d) : 0), 100);
    }

    public static void dern(View view, boolean z) {
        if (view == null) {
            return;
        }
        if (z) {
            view.setSystemUiVisibility(0);
            return;
        }
        int i = f15053attabal;
        if (i >= 19) {
            view.setSystemUiVisibility(3846);
        } else if (i >= 16) {
            view.setSystemUiVisibility(5);
        } else {
            view.setSystemUiVisibility(1);
        }
    }

    public static String saneness(long j) {
        StringBuilder sb = new StringBuilder();
        long j2 = j / ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        long j3 = ((j % 3600000) % ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) / 1000;
        if (j2 >= 10) {
            sb.append(j2);
        } else if (j2 > 0) {
            sb.append(0);
            sb.append(j2);
        } else {
            sb.append(0);
            sb.append(0);
        }
        sb.append(":");
        if (j3 >= 10) {
            sb.append(j3);
        } else if (j3 > 0) {
            sb.append(0);
            sb.append(j3);
        } else {
            sb.append(0);
            sb.append(0);
        }
        return sb.toString();
    }
}
