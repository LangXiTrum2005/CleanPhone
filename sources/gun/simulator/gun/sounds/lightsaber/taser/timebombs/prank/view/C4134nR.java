package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.Comparator;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.nR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4134nR implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4134nR f4743a = new C4134nR();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        AbstractC2995aW.q(comparable, "a");
        AbstractC2995aW.q(comparable2, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
        return comparable.compareTo(comparable2);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return RZ.f3662a;
    }
}
