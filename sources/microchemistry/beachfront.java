package microchemistry;

import androidx.collection.cord;
import com.unity3d.services.UnityAdsConstants;
import p002kotlin.Metadata;
import p002kotlin.Pair;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FloatMapping.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\tB3\u0012*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u0002\"\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\rR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lmicrochemistry/beachfront;", "", "", "Lkotlin/Pair;", "", "mappings", "<init>", "([Lkotlin/Pair;)V", "x", "attabal", "(F)F", "saneness", "Landroidx/collection/cord;", "Landroidx/collection/cord;", "sourceValues", "targetValues", "dern", "graphics-shapes_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class beachfront {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final beachfront f33365wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final cord sourceValues;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final cord targetValues;

    static {
        Float fValueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Pair pairAttabal = patroclinal.formularize.attabal(fValueOf, fValueOf);
        Float fValueOf2 = Float.valueOf(0.5f);
        f33365wireman = new beachfront(pairAttabal, patroclinal.formularize.attabal(fValueOf2, fValueOf2));
    }

    public beachfront(Pair<Float, Float>... mappings) {
        Intrinsics.checkNotNullParameter(mappings, "mappings");
        this.sourceValues = new cord(mappings.length);
        this.targetValues = new cord(mappings.length);
        int length = mappings.length;
        for (int i = 0; i < length; i++) {
            this.sourceValues.competently(mappings[i].getFirst().floatValue());
            this.targetValues.competently(mappings[i].getSecond().floatValue());
        }
        cutely.dern(this.sourceValues);
        cutely.dern(this.targetValues);
    }

    public final float attabal(float x) {
        return cutely.attabal(this.sourceValues, this.targetValues, x);
    }

    public final float saneness(float x) {
        return cutely.attabal(this.targetValues, this.sourceValues, x);
    }
}
