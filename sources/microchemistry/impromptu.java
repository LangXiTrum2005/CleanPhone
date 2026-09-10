package microchemistry;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p002kotlin.Metadata;
import p002kotlin.Pair;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.kattegat;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.ranges.IntRange;

/* JADX INFO: compiled from: FeatureMapping.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\u001a3\u0010\u0006\u001a\u00020\u00052\u0010\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u00010\u0000j\u0002`\u00022\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00010\u0000j\u0002`\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\r\u001a=\u0010\u000e\u001a\f\u0012\u0004\u0012\u00020\u00010\u0000j\u0002`\u00022\u0010\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u00010\u0000j\u0002`\u00022\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u00010\u0000j\u0002`\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\u000f*\u0018\b\u0000\u0010\u0010\"\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0012\u0004\u0012\u00020\u00010\u0000¨\u0006\u0011"}, d2 = {"", "Lmicrochemistry/molybdenite;", "Landroidx/graphics/shapes/MeasuredFeatures;", "features1", "features2", "Lmicrochemistry/beachfront;", "dern", "(Ljava/util/List;Ljava/util/List;)Lmicrochemistry/beachfront;", "Lmicrochemistry/competently;", "f1", "f2", "", "saneness", "(Lmicrochemistry/competently;Lmicrochemistry/competently;)F", "attabal", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "MeasuredFeatures", "graphics-shapes_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class impromptu {
    public static final List<ProgressableFeature> attabal(List<ProgressableFeature> f1, List<ProgressableFeature> f2) {
        Intrinsics.checkNotNullParameter(f1, "f1");
        Intrinsics.checkNotNullParameter(f2, "f2");
        Iterator<Integer> it = p002kotlin.collections.adultoid.impassible(f2).iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        kattegat kattegatVar = (kattegat) it;
        int iNextInt = kattegatVar.nextInt();
        if (it.hasNext()) {
            float fSaneness = saneness(f1.get(0).getFeature(), f2.get(iNextInt).getFeature());
            do {
                int iNextInt2 = kattegatVar.nextInt();
                float fSaneness2 = saneness(f1.get(0).getFeature(), f2.get(iNextInt2).getFeature());
                if (Float.compare(fSaneness, fSaneness2) > 0) {
                    iNextInt = iNextInt2;
                    fSaneness = fSaneness2;
                }
            } while (it.hasNext());
        }
        int size = f1.size();
        int size2 = f2.size();
        List<ProgressableFeature> listPolloi = p002kotlin.collections.adultoid.polloi(f2.get(iNextInt));
        int i = iNextInt;
        for (int i2 = 1; i2 < size; i2++) {
            int i3 = iNextInt - (size - i2);
            if (i3 <= i) {
                i3 += size2;
            }
            Iterator<Integer> it2 = new IntRange(i + 1, i3).iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            kattegat kattegatVar2 = (kattegat) it2;
            int iNextInt3 = kattegatVar2.nextInt();
            if (it2.hasNext()) {
                float fSaneness3 = saneness(f1.get(i2).getFeature(), f2.get(iNextInt3 % size2).getFeature());
                do {
                    int iNextInt4 = kattegatVar2.nextInt();
                    float fSaneness4 = saneness(f1.get(i2).getFeature(), f2.get(iNextInt4 % size2).getFeature());
                    if (Float.compare(fSaneness3, fSaneness4) > 0) {
                        iNextInt3 = iNextInt4;
                        fSaneness3 = fSaneness4;
                    }
                } while (it2.hasNext());
            }
            i = iNextInt3;
            listPolloi.add(f2.get(i % size2));
        }
        return listPolloi;
    }

    public static final beachfront dern(List<ProgressableFeature> features1, List<ProgressableFeature> features2) {
        Intrinsics.checkNotNullParameter(features1, "features1");
        Intrinsics.checkNotNullParameter(features2, "features2");
        List listDern = p002kotlin.collections.graveside.dern();
        int size = features1.size();
        for (int i = 0; i < size; i++) {
            if (features1.get(i).getFeature() instanceof competently.attabal) {
                listDern.add(features1.get(i));
            }
        }
        List listAttabal = p002kotlin.collections.graveside.attabal(listDern);
        List listDern2 = p002kotlin.collections.graveside.dern();
        int size2 = features2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (features2.get(i2).getFeature() instanceof competently.attabal) {
                listDern2.add(features2.get(i2));
            }
        }
        List listAttabal2 = p002kotlin.collections.graveside.attabal(listDern2);
        Pair pairAttabal = listAttabal.size() > listAttabal2.size() ? patroclinal.formularize.attabal(attabal(listAttabal2, listAttabal), listAttabal2) : patroclinal.formularize.attabal(listAttabal, attabal(listAttabal, listAttabal2));
        List list = (List) pairAttabal.component1();
        List list2 = (List) pairAttabal.component2();
        List listDern3 = p002kotlin.collections.graveside.dern();
        int size3 = list.size();
        for (int i3 = 0; i3 < size3 && i3 != list2.size(); i3++) {
            listDern3.add(patroclinal.formularize.attabal(Float.valueOf(((ProgressableFeature) list.get(i3)).getProgress()), Float.valueOf(((ProgressableFeature) list2.get(i3)).getProgress())));
        }
        Pair[] pairArr = (Pair[]) p002kotlin.collections.graveside.attabal(listDern3).toArray(new Pair[0]);
        return new beachfront((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }

    public static final float saneness(competently f1, competently f2) {
        Intrinsics.checkNotNullParameter(f1, "f1");
        Intrinsics.checkNotNullParameter(f2, "f2");
        if ((f1 instanceof competently.attabal) && (f2 instanceof competently.attabal) && ((competently.attabal) f1).getConvex() != ((competently.attabal) f2).getConvex()) {
            return Float.MAX_VALUE;
        }
        float fSaneness = (((wireman) CollectionsKt.lerp(f1.attabal())).saneness() + ((wireman) CollectionsKt.igbo(f1.attabal())).wireman()) / 2.0f;
        float fDern = (((wireman) CollectionsKt.lerp(f1.attabal())).dern() + ((wireman) CollectionsKt.igbo(f1.attabal())).marial()) / 2.0f;
        float fSaneness2 = fSaneness - ((((wireman) CollectionsKt.lerp(f2.attabal())).saneness() + ((wireman) CollectionsKt.igbo(f2.attabal())).wireman()) / 2.0f);
        float fDern2 = fDern - ((((wireman) CollectionsKt.lerp(f2.attabal())).dern() + ((wireman) CollectionsKt.igbo(f2.attabal())).marial()) / 2.0f);
        return (fSaneness2 * fSaneness2) + (fDern2 * fDern2);
    }
}
