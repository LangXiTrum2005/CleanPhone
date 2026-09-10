package androidx.media3.exoplayer.mediacodec;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Util;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class MediaCodecPerformancePointCoverageProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Boolean f6297a;

    public static final class Api29 {
        /* JADX WARN: Code duplicated, block: B:20:0x0040 A[EDGE_INSN: B:20:0x0040->B:45:0x00bd BREAK  A[LOOP:1: B:24:0x0060->B:44:0x00ba]] */
        public static int a(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3, double d) {
            char c2;
            boolean z2;
            int i4;
            List supportedPerformancePoints;
            List supportedPerformancePoints2 = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints2 != null && !supportedPerformancePoints2.isEmpty()) {
                androidx.core.view.accessibility.b.i();
                android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointE = androidx.core.view.accessibility.b.e(i2, i3, (int) d);
                int i5 = 0;
                while (true) {
                    c2 = 2;
                    z2 = true;
                    if (i5 >= supportedPerformancePoints2.size()) {
                        i4 = 1;
                        break;
                    }
                    if (androidx.core.view.accessibility.b.f(supportedPerformancePoints2.get(i5)).covers(performancePointE)) {
                        i4 = 2;
                        break;
                    }
                    i5++;
                }
                if (i4 == 1 && MediaCodecPerformancePointCoverageProvider.f6297a == null) {
                    if (Util.f5683a >= 35) {
                        z2 = false;
                        break;
                    }
                    try {
                        Format.Builder builder = new Format.Builder();
                        builder.f5429l = MimeTypes.l("video/avc");
                        Format format = new Format(builder);
                        if (format.m != null) {
                            List listG = MediaCodecUtil.g(MediaCodecSelector.f6304a, format, false, false);
                            for (int i6 = 0; i6 < listG.size(); i6++) {
                                if (((MediaCodecInfo) listG.get(i6)).d != null && ((MediaCodecInfo) listG.get(i6)).d.getVideoCapabilities() != null && (supportedPerformancePoints = ((MediaCodecInfo) listG.get(i6)).d.getVideoCapabilities().getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                                    androidx.core.view.accessibility.b.i();
                                    android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointD = androidx.core.view.accessibility.b.d();
                                    int i7 = 0;
                                    while (true) {
                                        if (i7 >= supportedPerformancePoints.size()) {
                                            c2 = 1;
                                            break;
                                        }
                                        if (androidx.core.view.accessibility.b.f(supportedPerformancePoints.get(i7)).covers(performancePointD)) {
                                            break;
                                        }
                                        i7++;
                                    }
                                    if (c2 == 1) {
                                        break;
                                    }
                                    z2 = false;
                                    break;
                                }
                            }
                        }
                    } catch (MediaCodecUtil.DecoderQueryException unused) {
                    }
                    MediaCodecPerformancePointCoverageProvider.f6297a = Boolean.valueOf(z2);
                    if (z2) {
                    }
                }
                return i4;
            }
            return 0;
        }
    }
}
