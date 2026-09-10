package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodecInfo;
import androidx.media3.common.polloi;
import decarock.grimness;
import java.util.List;
import rajahship.apical;
import rajahship.taiyuan;

/* JADX INFO: compiled from: MediaCodecPerformancePointCoverageProvider.java */
/* JADX INFO: loaded from: classes.dex */
public final class beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static Boolean f12071attabal;

    /* JADX INFO: compiled from: MediaCodecPerformancePointCoverageProvider.java */
    public static final class attabal {
        public static int attabal(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
            List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
                return 0;
            }
            taiyuan.attabal();
            int iSaneness = saneness(supportedPerformancePoints, rajahship.impromptu.attabal(i, i2, (int) d));
            if (iSaneness == 1 && beachfront.f12071attabal == null) {
                Boolean unused = beachfront.f12071attabal = Boolean.valueOf(dern());
                if (beachfront.f12071attabal.booleanValue()) {
                    return 0;
                }
            }
            return iSaneness;
        }

        public static boolean dern() {
            List supportedPerformancePoints;
            if (grimness.f25080attabal >= 35) {
                return false;
            }
            try {
                polloi polloiVarPolder = new polloi.saneness().sensatory("video/avc").polder();
                if (polloiVarPolder.f11218triweekly != null) {
                    List<marial> listDovishness = MediaCodecUtil.dovishness(competently.f12072attabal, polloiVarPolder, false, false);
                    for (int i = 0; i < listDovishness.size(); i++) {
                        if (listDovishness.get(i).f12083dern != null && listDovishness.get(i).f12083dern.getVideoCapabilities() != null && (supportedPerformancePoints = listDovishness.get(i).f12083dern.getVideoCapabilities().getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                            taiyuan.attabal();
                            return saneness(supportedPerformancePoints, rajahship.impromptu.attabal(1280, 720, 60)) == 1;
                        }
                    }
                }
            } catch (MediaCodecUtil.DecoderQueryException unused) {
            }
            return true;
        }

        public static int saneness(List<MediaCodecInfo.VideoCapabilities.PerformancePoint> list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
            for (int i = 0; i < list.size(); i++) {
                if (apical.attabal(list.get(i)).covers(performancePoint)) {
                    return 2;
                }
            }
            return 1;
        }
    }

    public static int dern(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        if (grimness.f25080attabal < 29) {
            return 0;
        }
        Boolean bool = f12071attabal;
        if (bool == null || !bool.booleanValue()) {
            return attabal.attabal(videoCapabilities, i, i2, d);
        }
        return 0;
    }
}
