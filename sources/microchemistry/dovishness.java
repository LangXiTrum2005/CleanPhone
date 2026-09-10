package microchemistry;

import androidx.collection.cord;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.Pair;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.kattegat;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.ranges.IntRange;

/* JADX INFO: compiled from: RoundedPolygon.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aS\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aG\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0013\u001a\u00060\u0011j\u0002`\u00122\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a/\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"", "numVertices", "", "radius", "centerX", "centerY", "Lmicrochemistry/dern;", "rounding", "", "perVertexRounding", "Lmicrochemistry/adultoid;", "saneness", "(IFFFLmicrochemistry/dern;Ljava/util/List;)Lmicrochemistry/adultoid;", "", "vertices", "dern", "([FLmicrochemistry/dern;Ljava/util/List;FF)Lmicrochemistry/adultoid;", "Landroidx/collection/competently;", "Landroidx/graphics/shapes/Point;", "marial", "([F)J", "beachfront", "(IFFF)[F", "graphics-shapes_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class dovishness {
    public static final adultoid attabal(int i, float f, float f2, float f3, dern rounding) {
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        return wireman(i, f, f2, f3, rounding, null, 32, null);
    }

    public static final float[] beachfront(int i, float f, float f2, float f3) {
        float[] fArr = new float[i * 2];
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            float f4 = f;
            long jApical = arytenoidectomy.apical(preprohormone.formularize(f4, (preprohormone.competently() / i) * 2 * i2, 0L, 4, null), androidx.collection.competently.saneness(f2, f3));
            int i4 = i3 + 1;
            fArr[i3] = arytenoidectomy.competently(jApical);
            i3 += 2;
            fArr[i4] = arytenoidectomy.impromptu(jApical);
            i2++;
            f = f4;
        }
        return fArr;
    }

    public static final adultoid dern(float[] vertices, dern rounding, List<dern> list, float f, float f2) {
        dern dernVar;
        Float fValueOf = Float.valueOf(1.0f);
        Intrinsics.checkNotNullParameter(vertices, "vertices");
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        if (vertices.length < 6) {
            throw new IllegalArgumentException("Polygons must have at least 3 vertices");
        }
        int i = 2;
        int i2 = 1;
        if (vertices.length % 2 == 1) {
            throw new IllegalArgumentException("The vertices array should have even size");
        }
        if (list != null && list.size() * 2 != vertices.length) {
            throw new IllegalArgumentException("perVertexRounding list should be either null or the same size as the number of vertices (vertices.size / 2)");
        }
        ArrayList arrayList = new ArrayList();
        int length = vertices.length / 2;
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        while (i4 < length) {
            dern dernVar2 = (list == null || (dernVar = list.get(i4)) == null) ? rounding : dernVar;
            int i5 = (((i4 + length) - i2) % length) * 2;
            int i6 = i4 + 1;
            int i7 = (i6 % length) * 2;
            int i8 = i4 * 2;
            arrayList2.add(new graveside(androidx.collection.competently.saneness(vertices[i5], vertices[i5 + i2]), androidx.collection.competently.saneness(vertices[i8], vertices[i8 + i2]), androidx.collection.competently.saneness(vertices[i7], vertices[i7 + 1]), dernVar2, null));
            i4 = i6;
            i2 = i2;
        }
        int i9 = i2;
        IntRange intRangeMonoploid = p002kotlin.ranges.wireman.monoploid(0, length);
        ArrayList arrayList3 = new ArrayList(p002kotlin.collections.dovishness.gintrap(intRangeMonoploid, 10));
        Iterator<Integer> it = intRangeMonoploid.iterator();
        while (it.hasNext()) {
            int iNextInt = ((kattegat) it).nextInt();
            int i10 = (iNextInt + 1) % length;
            float expectedRoundCut = ((graveside) arrayList2.get(iNextInt)).getExpectedRoundCut() + ((graveside) arrayList2.get(i10)).getExpectedRoundCut();
            float fMarial = ((graveside) arrayList2.get(iNextInt)).marial() + ((graveside) arrayList2.get(i10)).marial();
            int i11 = iNextInt * 2;
            int i12 = i10 * 2;
            float fWireman = preprohormone.wireman(vertices[i11] - vertices[i12], vertices[i11 + 1] - vertices[i12 + 1]);
            arrayList3.add(expectedRoundCut > fWireman ? patroclinal.formularize.attabal(Float.valueOf(fWireman / expectedRoundCut), Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) : fMarial > fWireman ? patroclinal.formularize.attabal(fValueOf, Float.valueOf((fWireman - expectedRoundCut) / (fMarial - expectedRoundCut))) : patroclinal.formularize.attabal(fValueOf, fValueOf));
        }
        for (int i13 = 0; i13 < length; i13++) {
            cord cordVar = new cord(2);
            for (int i14 = 0; i14 < 2; i14++) {
                Pair pair = (Pair) arrayList3.get((((i13 + length) - 1) + i14) % length);
                cordVar.competently((((graveside) arrayList2.get(i13)).getExpectedRoundCut() * ((Number) pair.component1()).floatValue()) + ((((graveside) arrayList2.get(i13)).marial() - ((graveside) arrayList2.get(i13)).getExpectedRoundCut()) * ((Number) pair.component2()).floatValue()));
            }
            arrayList.add(((graveside) arrayList2.get(i13)).wireman(cordVar.saneness(0), cordVar.saneness(i9)));
        }
        ArrayList arrayList4 = new ArrayList();
        while (i3 < length) {
            int i15 = i3 + 1;
            int i16 = i15 % length;
            int i17 = i3 * 2;
            long jSaneness = androidx.collection.competently.saneness(vertices[i17], vertices[i17 + i9]);
            int i18 = (((i3 + length) - i9) % length) * i;
            long jSaneness2 = androidx.collection.competently.saneness(vertices[i18], vertices[i18 + i9]);
            int i19 = i16 * 2;
            arrayList4.add(new competently.attabal((List) arrayList.get(i3), jSaneness, ((graveside) arrayList2.get(i3)).getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.CENTER java.lang.String(), arytenoidectomy.attabal(arytenoidectomy.cutely(jSaneness, jSaneness2), arytenoidectomy.cutely(androidx.collection.competently.saneness(vertices[i19], vertices[i19 + i9]), jSaneness)), null));
            arrayList4.add(new competently.saneness(p002kotlin.collections.graveside.marial(wireman.INSTANCE.saneness(((wireman) CollectionsKt.igbo((List) arrayList.get(i3))).wireman(), ((wireman) CollectionsKt.igbo((List) arrayList.get(i3))).marial(), ((wireman) CollectionsKt.lerp((List) arrayList.get(i16))).saneness(), ((wireman) CollectionsKt.lerp((List) arrayList.get(i16))).dern()))));
            i3 = i15;
            i = 2;
        }
        long jMarial = (f == Float.MIN_VALUE || f2 == Float.MIN_VALUE) ? marial(vertices) : androidx.collection.competently.saneness(f, f2);
        return new adultoid(arrayList4, Float.intBitsToFloat((int) (jMarial >> 32)), Float.intBitsToFloat((int) (jMarial & 4294967295L)));
    }

    public static final long marial(float[] fArr) {
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int i = 0;
        float f2 = 0.0f;
        while (i < fArr.length) {
            int i2 = i + 1;
            f += fArr[i];
            i += 2;
            f2 += fArr[i2];
        }
        float f3 = 2;
        return androidx.collection.competently.saneness((f / fArr.length) / f3, (f2 / fArr.length) / f3);
    }

    public static final adultoid saneness(int i, float f, float f2, float f3, dern rounding, List<dern> list) {
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        return dern(beachfront(i, f, f2, f3), rounding, list, f2, f3);
    }

    public static /* synthetic */ adultoid wireman(int i, float f, float f2, float f3, dern dernVar, List list, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f = 1.0f;
        }
        if ((i2 & 4) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 16) != 0) {
            dernVar = dern.f33373wireman;
        }
        if ((i2 & 32) != 0) {
            list = null;
        }
        List list2 = list;
        return saneness(i, f, f2, f3, dernVar, list2);
    }
}
