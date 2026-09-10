package milliradian;

import com.ironsource.C3414a2;
import com.unity3d.services.UnityAdsConstants;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: Dp.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0097\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Lmilliradian/impromptu;", "", "", "value", "wireman", "(F)F", C3414a2.d, "", "dern", "(FF)I", "", "apical", "(F)Ljava/lang/String;", "cutely", "(F)I", "", "", "marial", "(FLjava/lang/Object;)Z", "F", "getValue", "()F", "kowloon", "attabal", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class impromptu implements Comparable<impromptu> {
    private final float value;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static final float f33476arytenoidectomy = wireman(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static final float f33478monoploid = wireman(Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static final float f33479polloi = wireman(Float.NaN);

    public static String apical(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    public static int cutely(float f) {
        return Float.hashCode(f);
    }

    public static int dern(float f, float f2) {
        return Float.compare(f, f2);
    }

    public static boolean marial(float f, Object obj) {
        return (obj instanceof impromptu) && Float.compare(f, ((impromptu) obj).getValue()) == 0;
    }

    public static final boolean taiyuan(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    public int attabal(float f) {
        return dern(this.value, f);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(impromptu impromptuVar) {
        return attabal(impromptuVar.getValue());
    }

    public boolean equals(Object obj) {
        return marial(this.value, obj);
    }

    /* JADX INFO: renamed from: formularize, reason: from getter */
    public final /* synthetic */ float getValue() {
        return this.value;
    }

    public int hashCode() {
        return cutely(this.value);
    }

    public String toString() {
        return apical(this.value);
    }

    public static float wireman(float f) {
        return f;
    }
}
