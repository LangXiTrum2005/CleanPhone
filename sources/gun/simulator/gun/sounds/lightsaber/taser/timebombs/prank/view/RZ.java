package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final class RZ implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RZ f3662a = new RZ();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        AbstractC2995aW.q(comparable, "a");
        AbstractC2995aW.q(comparable2, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
        return comparable2.compareTo(comparable);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return C4134nR.f4743a;
    }
}
