package A;

import android.app.ForegroundServiceStartNotAllowedException;
import android.content.ClipData;
import android.location.LocationRequest;
import android.media.metrics.MediaMetricsManager;
import android.os.OutcomeReceiver;
import android.view.ContentInfo;

/* JADX INFO: renamed from: A.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC0912t {
    public static /* bridge */ /* synthetic */ ForegroundServiceStartNotAllowedException c(IllegalStateException illegalStateException) {
        return (ForegroundServiceStartNotAllowedException) illegalStateException;
    }

    public static /* bridge */ /* synthetic */ LocationRequest f(Object obj) {
        return (LocationRequest) obj;
    }

    public static /* bridge */ /* synthetic */ MediaMetricsManager h(Object obj) {
        return (MediaMetricsManager) obj;
    }

    public static /* bridge */ /* synthetic */ OutcomeReceiver i(Object obj) {
        return (OutcomeReceiver) obj;
    }

    public static /* synthetic */ ContentInfo.Builder j(ClipData clipData, int i2) {
        return new ContentInfo.Builder(clipData, i2);
    }

    public static /* bridge */ /* synthetic */ ContentInfo l(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* bridge */ /* synthetic */ boolean y(IllegalStateException illegalStateException) {
        return illegalStateException instanceof ForegroundServiceStartNotAllowedException;
    }
}
