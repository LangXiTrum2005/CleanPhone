package microchemistry;

import com.unity3d.services.UnityAdsConstants;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: CornerRounding.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\n\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0007B\u001b\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\n\u0010\t¨\u0006\f"}, d2 = {"Lmicrochemistry/dern;", "", "", "radius", "smoothing", "<init>", "(FF)V", "attabal", "F", "()F", "saneness", "dern", "graphics-shapes_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class dern {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final dern f33373wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final float radius;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final float smoothing;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        f33373wireman = new dern(f, f, 3, defaultConstructorMarker);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public dern() {
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this(f, f, 3, null);
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final float getRadius() {
        return this.radius;
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final float getSmoothing() {
        return this.smoothing;
    }

    public dern(float f, float f2) {
        this.radius = f;
        this.smoothing = f2;
    }

    public /* synthetic */ dern(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2);
    }
}
