package microchemistry;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: RoundedPolygon.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b6\b\u0002\u0018\u00002\u00020\u0001B7\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\u0010\u0005\u001a\u00060\u0002j\u0002`\u0003\u0012\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014Jf\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\n\u0010\u0017\u001a\u00060\u0002j\u0002`\u00032\n\u0010\u0018\u001a\u00060\u0002j\u0002`\u00032\n\u0010\u0019\u001a\u00060\u0002j\u0002`\u00032\n\u0010\u001a\u001a\u00060\u0002j\u0002`\u00032\n\u0010\u001b\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u001c\u001a\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJJ\u0010!\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\n\u0010\u001f\u001a\u00060\u0002j\u0002`\u00032\n\u0010\u0005\u001a\u00060\u0002j\u0002`\u00032\n\u0010 \u001a\u00060\u0002j\u0002`\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\"R!\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010#\u001a\u0004\b$\u0010%R!\u0010\u0005\u001a\u00060\u0002j\u0002`\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010#\u001a\u0004\b&\u0010%R!\u0010\u0006\u001a\u00060\u0002j\u0002`\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010)\u001a\u0004\b*\u0010+R!\u0010 \u001a\u00060\u0002j\u0002`\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b-\u0010%R!\u00100\u001a\u00060\u0002j\u0002`\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b.\u0010#\u001a\u0004\b/\u0010%R\u0017\u00104\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b!\u00101\u001a\u0004\b2\u00103R\u0017\u00107\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b6\u00103R\u0017\u0010:\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b8\u00101\u001a\u0004\b9\u00103R\u0017\u0010=\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b;\u00101\u001a\u0004\b<\u00103R\u0017\u0010?\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b>\u00101\u001a\u0004\b.\u00103R,\u0010C\u001a\u00060\u0002j\u0002`\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b@\u0010#\u001a\u0004\b'\u0010%\"\u0004\bA\u0010BR\u0011\u0010D\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b,\u00103\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006E"}, d2 = {"Lmicrochemistry/graveside;", "", "Landroidx/collection/competently;", "Landroidx/graphics/shapes/Point;", "p0", "p1", "p2", "Lmicrochemistry/dern;", "rounding", "<init>", "(JJJLmicrochemistry/dern;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "allowedCut0", "allowedCut1", "", "Lmicrochemistry/wireman;", "wireman", "(FF)Ljava/util/List;", "allowedCut", "attabal", "(F)F", "actualRoundCut", "actualSmoothingValues", "corner", "sideStart", "circleSegmentIntersection", "otherCircleSegmentIntersection", "circleCenter", "actualR", "saneness", "(FFJJJJJF)Lmicrochemistry/wireman;", "d0", "d1", "competently", "(JJJJ)Landroidx/collection/competently;", "J", "getP0-1ufDz9w", "()J", "getP1-1ufDz9w", "dern", "getP2-1ufDz9w", "Lmicrochemistry/dern;", "getRounding", "()Lmicrochemistry/dern;", "marial", "getD1-1ufDz9w", "beachfront", "getD2-1ufDz9w", "d2", "F", "getCornerRadius", "()F", "cornerRadius", "impromptu", "getSmoothing", "smoothing", "taiyuan", "getCosAngle", "cosAngle", "cutely", "getSinAngle", "sinAngle", "apical", "expectedRoundCut", "formularize", "setCenter-DnnuFBc", "(J)V", TtmlNode.CENTER, "expectedCut", "graphics-shapes_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class graveside {

    /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
    public final float expectedRoundCut;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final long p0;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public final long d2;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public final float cornerRadius;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public final float sinAngle;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final long p2;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name and from kotlin metadata */
    public long center;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public final float smoothing;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final long d1;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final long p1;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public final float cosAngle;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final dern rounding;

    public /* synthetic */ graveside(long j, long j2, long j3, dern dernVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, dernVar);
    }

    public final float attabal(float allowedCut) {
        if (allowedCut > marial()) {
            return this.smoothing;
        }
        float f = this.expectedRoundCut;
        return allowedCut > f ? (this.smoothing * (allowedCut - f)) / (marial() - this.expectedRoundCut) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    /* JADX INFO: renamed from: beachfront, reason: from getter */
    public final float getExpectedRoundCut() {
        return this.expectedRoundCut;
    }

    public final androidx.collection.competently competently(long p0, long d0, long p1, long d1) {
        long jImpassible = preprohormone.impassible(d1);
        float fWireman = arytenoidectomy.wireman(d0, jImpassible);
        if (Math.abs(fWireman) < 1.0E-4f) {
            return null;
        }
        float fWireman2 = arytenoidectomy.wireman(arytenoidectomy.cutely(p1, p0), jImpassible);
        if (Math.abs(fWireman) < Math.abs(fWireman2) * 1.0E-4f) {
            return null;
        }
        return androidx.collection.competently.attabal(arytenoidectomy.apical(p0, arytenoidectomy.formularize(d0, fWireman2 / fWireman)));
    }

    /* JADX INFO: renamed from: dern, reason: from getter */
    public final long getCenter() {
        return this.center;
    }

    public final float marial() {
        return (1 + this.smoothing) * this.expectedRoundCut;
    }

    public final wireman saneness(float actualRoundCut, float actualSmoothingValues, long corner, long sideStart, long circleSegmentIntersection, long otherCircleSegmentIntersection, long circleCenter, float actualR) {
        long jMarial = arytenoidectomy.marial(arytenoidectomy.cutely(sideStart, corner));
        long jApical = arytenoidectomy.apical(corner, arytenoidectomy.formularize(arytenoidectomy.formularize(jMarial, actualRoundCut), 1 + actualSmoothingValues));
        long packedValue = circleSegmentIntersection;
        long jTaiyuan = arytenoidectomy.taiyuan(packedValue, arytenoidectomy.saneness(arytenoidectomy.apical(circleSegmentIntersection, otherCircleSegmentIntersection), 2.0f), actualSmoothingValues);
        long jApical2 = arytenoidectomy.apical(circleCenter, arytenoidectomy.formularize(preprohormone.dern(arytenoidectomy.competently(jTaiyuan) - arytenoidectomy.competently(circleCenter), arytenoidectomy.impromptu(jTaiyuan) - arytenoidectomy.impromptu(circleCenter)), actualR));
        androidx.collection.competently competentlyVarCompetently = competently(sideStart, jMarial, jApical2, preprohormone.impassible(arytenoidectomy.cutely(jApical2, circleCenter)));
        if (competentlyVarCompetently != null) {
            packedValue = competentlyVarCompetently.getPackedValue();
        }
        return new wireman(jApical, arytenoidectomy.saneness(arytenoidectomy.apical(jApical, arytenoidectomy.formularize(packedValue, 2.0f)), 3.0f), packedValue, jApical2, null);
    }

    public final List<wireman> wireman(float allowedCut0, float allowedCut1) {
        float fMin = Math.min(allowedCut0, allowedCut1);
        float f = this.expectedRoundCut;
        if (f < 1.0E-4f || fMin < 1.0E-4f || this.cornerRadius < 1.0E-4f) {
            long j = this.p1;
            this.center = j;
            return p002kotlin.collections.graveside.marial(wireman.INSTANCE.saneness(arytenoidectomy.competently(j), arytenoidectomy.impromptu(this.p1), arytenoidectomy.competently(this.p1), arytenoidectomy.impromptu(this.p1)));
        }
        float fMin2 = Math.min(fMin, f);
        float fAttabal = attabal(allowedCut0);
        float fAttabal2 = attabal(allowedCut1);
        float f2 = (this.cornerRadius * fMin2) / this.expectedRoundCut;
        this.center = arytenoidectomy.apical(this.p1, arytenoidectomy.formularize(arytenoidectomy.marial(arytenoidectomy.saneness(arytenoidectomy.apical(this.d1, this.d2), 2.0f)), (float) Math.sqrt(preprohormone.triweekly(f2) + preprohormone.triweekly(fMin2))));
        long jApical = arytenoidectomy.apical(this.p1, arytenoidectomy.formularize(this.d1, fMin2));
        long jApical2 = arytenoidectomy.apical(this.p1, arytenoidectomy.formularize(this.d2, fMin2));
        wireman wiremanVarSaneness = saneness(fMin2, fAttabal, this.p1, this.p0, jApical, jApical2, this.center, f2);
        wireman wiremanVarFormularize = saneness(fMin2, fAttabal2, this.p1, this.p2, jApical2, jApical, this.center, f2).formularize();
        return p002kotlin.collections.adultoid.kowloon(wiremanVarSaneness, wireman.INSTANCE.attabal(arytenoidectomy.competently(this.center), arytenoidectomy.impromptu(this.center), wiremanVarSaneness.wireman(), wiremanVarSaneness.marial(), wiremanVarFormularize.saneness(), wiremanVarFormularize.dern()), wiremanVarFormularize);
    }

    public graveside(long j, long j2, long j3, dern dernVar) {
        this.p0 = j;
        this.p1 = j2;
        this.p2 = j3;
        this.rounding = dernVar;
        long jMarial = arytenoidectomy.marial(arytenoidectomy.cutely(j, j2));
        this.d1 = jMarial;
        long jMarial2 = arytenoidectomy.marial(arytenoidectomy.cutely(j3, j2));
        this.d2 = jMarial2;
        float radius = dernVar != null ? dernVar.getRadius() : 0.0f;
        this.cornerRadius = radius;
        this.smoothing = dernVar != null ? dernVar.getSmoothing() : 0.0f;
        float fWireman = arytenoidectomy.wireman(jMarial, jMarial2);
        this.cosAngle = fWireman;
        float f = 1;
        float fSqrt = (float) Math.sqrt(f - preprohormone.triweekly(fWireman));
        this.sinAngle = fSqrt;
        this.expectedRoundCut = ((double) fSqrt) > 0.001d ? (radius * (fWireman + f)) / fSqrt : 0.0f;
        this.center = androidx.collection.competently.saneness(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }
}
