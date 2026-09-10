package microchemistry;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.collections.cord;
import p002kotlin.collections.kattegat;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.ranges.IntRange;

/* JADX INFO: compiled from: Shapes.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0014\n\u0002\b\u0003\u001a;\u0010\b\u001a\u00020\u0007*\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\b\u0010\t\u001aU\u0010\u0010\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000e2\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001ak\u0010\u0015\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000e2\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a7\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lmicrochemistry/adultoid$attabal;", "", "numVertices", "", "radius", "centerX", "centerY", "Lmicrochemistry/adultoid;", "dern", "(Lmicrochemistry/adultoid$attabal;IFFF)Lmicrochemistry/adultoid;", "width", "height", "Lmicrochemistry/dern;", "rounding", "", "perVertexRounding", "marial", "(Lmicrochemistry/adultoid$attabal;FFLmicrochemistry/dern;Ljava/util/List;FF)Lmicrochemistry/adultoid;", "numVerticesPerRadius", "innerRadius", "innerRounding", "competently", "(Lmicrochemistry/adultoid$attabal;IFFLmicrochemistry/dern;Lmicrochemistry/dern;Ljava/util/List;FF)Lmicrochemistry/adultoid;", "", "taiyuan", "(IFFFF)[F", "graphics-shapes_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class gintrap {
    public static final adultoid attabal(adultoid.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return wireman(companion, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 15, null);
    }

    public static final adultoid beachfront(adultoid.Companion companion, int i, float f, float f2, dern rounding) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        return impromptu(companion, i, f, f2, rounding, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, PsExtractor.VIDEO_STREAM_MASK, null);
    }

    public static final adultoid competently(adultoid.Companion companion, int i, float f, float f2, dern rounding, dern dernVar, List<dern> list, float f3, float f4) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new IllegalArgumentException("Star radii must both be greater than 0");
        }
        if (f2 >= f) {
            throw new IllegalArgumentException("innerRadius must be less than radius");
        }
        if (list == null && dernVar != null) {
            IntRange intRangeMonoploid = p002kotlin.ranges.wireman.monoploid(0, i);
            list = new ArrayList<>();
            Iterator<Integer> it = intRangeMonoploid.iterator();
            while (it.hasNext()) {
                ((kattegat) it).nextInt();
                cord.stratoscope(list, p002kotlin.collections.adultoid.kowloon(rounding, dernVar));
            }
        }
        return dovishness.dern(taiyuan(i, f, f2, f3, f4), rounding, list, f3, f4);
    }

    public static final adultoid dern(adultoid.Companion companion, int i, float f, float f2, float f3) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        if (i >= 3) {
            return dovishness.wireman(i, f / ((float) Math.cos(preprohormone.competently() / i)), f2, f3, new dern(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, null), null, 32, null);
        }
        throw new IllegalArgumentException("Circle must have at least three vertices");
    }

    public static /* synthetic */ adultoid impromptu(adultoid.Companion companion, int i, float f, float f2, dern dernVar, dern dernVar2, List list, float f3, float f4, int i2, Object obj) {
        return competently(companion, i, (i2 & 2) != 0 ? 1.0f : f, (i2 & 4) != 0 ? 0.5f : f2, (i2 & 8) != 0 ? dern.f33373wireman : dernVar, (i2 & 16) != 0 ? null : dernVar2, (i2 & 32) == 0 ? list : null, (i2 & 64) != 0 ? 0.0f : f3, (i2 & 128) != 0 ? 0.0f : f4);
    }

    public static final adultoid marial(adultoid.Companion companion, float f, float f2, dern rounding, List<dern> list, float f3, float f4) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        float f5 = 2;
        float f6 = f / f5;
        float f7 = f3 - f6;
        float f8 = f2 / f5;
        float f9 = f4 - f8;
        float f10 = f6 + f3;
        float f11 = f8 + f4;
        return dovishness.dern(new float[]{f10, f11, f7, f11, f7, f9, f10, f9}, rounding, list, f3, f4);
    }

    public static final adultoid saneness(adultoid.Companion companion, int i) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return wireman(companion, i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14, null);
    }

    public static final float[] taiyuan(int i, float f, float f2, float f3, float f4) {
        float[] fArr = new float[i * 4];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f5 = i;
            long jFormularize = preprohormone.formularize(f, (preprohormone.competently() / f5) * 2 * i3, 0L, 4, null);
            fArr[i2] = arytenoidectomy.competently(jFormularize) + f3;
            fArr[i2 + 1] = arytenoidectomy.impromptu(jFormularize) + f4;
            long jFormularize2 = preprohormone.formularize(f2, (preprohormone.competently() / f5) * ((i3 * 2) + 1), 0L, 4, null);
            int i4 = i2 + 3;
            fArr[i2 + 2] = arytenoidectomy.competently(jFormularize2) + f3;
            i2 += 4;
            fArr[i4] = arytenoidectomy.impromptu(jFormularize2) + f4;
        }
        return fArr;
    }

    public static /* synthetic */ adultoid wireman(adultoid.Companion companion, int i, float f, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8;
        }
        if ((i2 & 2) != 0) {
            f = 1.0f;
        }
        if ((i2 & 4) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f3 = 0.0f;
        }
        return dern(companion, i, f, f2, f3);
    }
}
