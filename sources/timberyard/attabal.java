package timberyard;

import com.ironsource.C3414a2;
import com.unity3d.services.UnityAdsConstants;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: BaselineShift.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00042\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0014"}, d2 = {"Ltimberyard/attabal;", "", "", "multiplier", "saneness", "(F)F", "", "marial", "(F)Ljava/lang/String;", "", "wireman", "(F)I", C3414a2.d, "", "dern", "(FLjava/lang/Object;)Z", "attabal", "F", "getMultiplier", "()F", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final float multiplier;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final float f38828dern = saneness(0.5f);

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final float f38831wireman = saneness(-0.5f);

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final float f38829marial = saneness(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);

    /* JADX INFO: renamed from: timberyard.attabal$attabal, reason: collision with other inner class name and from kotlin metadata */
    /* JADX INFO: compiled from: BaselineShift.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltimberyard/attabal$attabal;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public /* synthetic */ attabal(float f) {
        this.multiplier = f;
    }

    public static final /* synthetic */ attabal attabal(float f) {
        return new attabal(f);
    }

    public static boolean dern(float f, Object obj) {
        return (obj instanceof attabal) && Float.compare(f, ((attabal) obj).getMultiplier()) == 0;
    }

    public static String marial(float f) {
        return "BaselineShift(multiplier=" + f + ')';
    }

    public static int wireman(float f) {
        return Float.hashCode(f);
    }

    /* JADX INFO: renamed from: beachfront, reason: from getter */
    public final /* synthetic */ float getMultiplier() {
        return this.multiplier;
    }

    public boolean equals(Object obj) {
        return dern(this.multiplier, obj);
    }

    public int hashCode() {
        return wireman(this.multiplier);
    }

    public String toString() {
        return marial(this.multiplier);
    }

    public static float saneness(float f) {
        return f;
    }
}
