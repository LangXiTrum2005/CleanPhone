package supplicat;

import com.unity3d.services.UnityAdsConstants;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: CornerRadius.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\b\u0087@\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0012\u0010\u000e\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0016"}, d2 = {"Lsupplicat/attabal;", "", "", "packedValue", "saneness", "(J)J", "", "competently", "(J)Ljava/lang/String;", "", "beachfront", "(J)I", "", "wireman", "(J)F", "getX$annotations", "()V", "x", "marial", "getY$annotations", "y", "attabal", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final long f38301saneness = saneness.saneness(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, null);

    /* JADX INFO: renamed from: supplicat.attabal$attabal, reason: collision with other inner class name and from kotlin metadata */
    /* JADX INFO: compiled from: CornerRadius.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Lsupplicat/attabal$attabal;", "", "<init>", "()V", "Lsupplicat/attabal;", "Zero", "J", "attabal", "()J", "getZero-kKHJgLs$annotations", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long attabal() {
            return attabal.f38301saneness;
        }

        public Companion() {
        }
    }

    public static int beachfront(long j) {
        return Long.hashCode(j);
    }

    public static String competently(long j) {
        if (wireman(j) == marial(j)) {
            return "CornerRadius.circular(" + dern.attabal(wireman(j), 1) + ')';
        }
        return "CornerRadius.elliptical(" + dern.attabal(wireman(j), 1) + ", " + dern.attabal(marial(j), 1) + ')';
    }

    public static final boolean dern(long j, long j2) {
        return j == j2;
    }

    public static final float marial(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float wireman(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static long saneness(long j) {
        return j;
    }
}
