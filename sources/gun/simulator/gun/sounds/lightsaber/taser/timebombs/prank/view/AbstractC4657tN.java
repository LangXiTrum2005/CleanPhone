package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.MediaCodecInfo;
import androidx.annotation.DoNotInline;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4657tN {
    @DoNotInline
    public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            String str = Ug0.b;
            if (!str.equals("sabrina") && !str.equals("boreal")) {
                String str2 = Ug0.d;
                if (!str2.startsWith("Lenovo TB-X605") && !str2.startsWith("Lenovo TB-X606") && !str2.startsWith("Lenovo TB-X616")) {
                    AbstractC4652tI.k();
                    MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointF = AbstractC4652tI.f(i, i2, (int) d);
                    for (int i3 = 0; i3 < supportedPerformancePoints.size(); i3++) {
                        if (AbstractC4652tI.g(supportedPerformancePoints.get(i3)).covers(performancePointF)) {
                            return 2;
                        }
                    }
                    return 1;
                }
            }
        }
        return 0;
    }
}
