package microchemistry;

import com.unity3d.services.UnityAdsConstants;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PolygonMeasure.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lmicrochemistry/saneness;", "Lmicrochemistry/formularize;", "", "centerX", "centerY", "<init>", "(FF)V", "Lmicrochemistry/wireman;", "c", "attabal", "(Lmicrochemistry/wireman;)F", "m", "saneness", "(Lmicrochemistry/wireman;F)F", "F", "getCenterX", "()F", "getCenterY", "graphics-shapes_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class saneness implements formularize {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final float centerX;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final float centerY;

    public saneness(float f, float f2) {
        this.centerX = f;
        this.centerY = f2;
    }

    public static final float wireman(wireman c, saneness this$0, float f, float f2, float f3) {
        Intrinsics.checkNotNullParameter(c, "$c");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        long jApical = c.apical(f3);
        return Math.abs(preprohormone.cutely(preprohormone.attabal(arytenoidectomy.competently(jApical) - this$0.centerX, arytenoidectomy.impromptu(jApical) - this$0.centerY) - f, preprohormone.impromptu()) - f2);
    }

    @Override // microchemistry.formularize
    public float attabal(wireman c) {
        Intrinsics.checkNotNullParameter(c, "c");
        float fCutely = preprohormone.cutely(preprohormone.attabal(c.wireman() - this.centerX, c.marial() - this.centerY) - preprohormone.attabal(c.saneness() - this.centerX, c.dern() - this.centerY), preprohormone.impromptu());
        return fCutely > preprohormone.impromptu() - 1.0E-4f ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : fCutely;
    }

    @Override // microchemistry.formularize
    public float saneness(final wireman c, final float m) {
        Intrinsics.checkNotNullParameter(c, "c");
        final float fAttabal = preprohormone.attabal(c.saneness() - this.centerX, c.dern() - this.centerY);
        return preprohormone.beachfront(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0E-5f, new taiyuan() { // from class: microchemistry.attabal
            @Override // microchemistry.taiyuan
            public final float attabal(float f) {
                return saneness.wireman(c, this, fAttabal, m, f);
            }
        });
    }
}
