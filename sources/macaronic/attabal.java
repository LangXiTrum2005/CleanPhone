package macaronic;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.2 */
/* JADX INFO: loaded from: classes3.dex */
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Map f33210attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Map f33211saneness;

    static {
        HashMap map = new HashMap();
        f33210attabal = map;
        HashMap map2 = new HashMap();
        f33211saneness = map2;
        map.put(-1, "The Play Store app is either not installed or not the official version.");
        map.put(-2, "Call first requestReviewFlow to get the ReviewInfo.");
        map.put(-100, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        map2.put(-1, "PLAY_STORE_NOT_FOUND");
        map2.put(-2, "INVALID_REQUEST");
        map2.put(-100, "INTERNAL_ERROR");
    }

    public static String attabal(int i) {
        Map map = f33210attabal;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            return "";
        }
        return ((String) map.get(numValueOf)) + " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#" + ((String) f33211saneness.get(numValueOf)) + ")";
    }
}
