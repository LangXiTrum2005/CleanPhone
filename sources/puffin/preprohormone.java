package puffin;

import android.util.Pair;
import androidx.media3.exoplayer.drm.DrmSession;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.drm.WidevineUtil;
import java.util.Map;

/* JADX INFO: compiled from: WidevineUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class preprohormone {
    public static long attabal(Map<String, String> map, String str) {
        if (map == null) {
            return C.TIME_UNSET;
        }
        try {
            String str2 = map.get(str);
            return str2 != null ? Long.parseLong(str2) : C.TIME_UNSET;
        } catch (NumberFormatException unused) {
            return C.TIME_UNSET;
        }
    }

    public static Pair<Long, Long> saneness(DrmSession drmSession) {
        Map<String, String> mapQueryKeyStatus = drmSession.queryKeyStatus();
        if (mapQueryKeyStatus == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(attabal(mapQueryKeyStatus, WidevineUtil.PROPERTY_LICENSE_DURATION_REMAINING)), Long.valueOf(attabal(mapQueryKeyStatus, WidevineUtil.PROPERTY_PLAYBACK_DURATION_REMAINING)));
    }
}
