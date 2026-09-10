package kotlinx.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: EventLoop.common.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006*\u001e\b\u0002\u0010\f\u001a\u0004\b\u0000\u0010\n\"\b\u0012\u0004\u0012\u00028\u00000\u000b2\b\u0012\u0004\u0012\u00028\u00000\u000b¨\u0006\r"}, d2 = {"", "timeMillis", "dern", "(J)J", "Lpigboat/stratoscope;", "attabal", "Lpigboat/stratoscope;", "DISPOSED_TASK", "saneness", "CLOSED_EMPTY", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lpigboat/kowloon;", "Queue", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class empress {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final pigboat.stratoscope f32191attabal = new pigboat.stratoscope("REMOVED_TASK");

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final pigboat.stratoscope f32192saneness = new pigboat.stratoscope("CLOSED_EMPTY");

    public static final long dern(long j) {
        if (j <= 0) {
            return 0L;
        }
        if (j >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return j * 1000000;
    }
}
