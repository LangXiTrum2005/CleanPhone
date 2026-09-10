package treadless;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.unity3d.services.UnityAdsConstants;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: MathUtils.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0010\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ%\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\tJ5\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ltreadless/wireman;", "", "<init>", "()V", "", "start", "stop", "amount", "saneness", "(FFF)F", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "value", "dern", "rangeMin", "rangeMax", "valueMin", "valueMax", "attabal", "(FFFFF)F", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final wireman f38988attabal = new wireman();

    public final float attabal(float rangeMin, float rangeMax, float valueMin, float valueMax, float value) {
        return saneness(rangeMin, rangeMax, Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(1.0f, dern(valueMin, valueMax, value))));
    }

    public final float dern(float a, float b, float value) {
        return a == b ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : (value - a) / (b - a);
    }

    public final float saneness(float start, float stop, float amount2) {
        return start + ((stop - start) * amount2);
    }
}
