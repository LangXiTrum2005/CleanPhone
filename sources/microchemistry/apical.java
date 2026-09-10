package microchemistry;

import androidx.collection.cord;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.Pair;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PolygonMeasure.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\b\u0000\u0018\u0000  2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002!\"B5\b\u0012\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001e\u0010\t\u001a\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lmicrochemistry/apical;", "Lkotlin/collections/wireman;", "Lmicrochemistry/apical$saneness;", "Lmicrochemistry/formularize;", "measurer", "", "Lmicrochemistry/molybdenite;", X3.a.v, "Lmicrochemistry/wireman;", "cubics", "Landroidx/collection/impromptu;", "outlineProgress", "<init>", "(Lmicrochemistry/formularize;Ljava/util/List;Ljava/util/List;Landroidx/collection/impromptu;)V", "", "cuttingPoint", "beachfront", "(F)Lmicrochemistry/apical;", "", "index", "competently", "(I)Lmicrochemistry/apical$saneness;", "kowloon", "Lmicrochemistry/formularize;", "arytenoidectomy", "Ljava/util/List;", "monoploid", "impromptu", "()Ljava/util/List;", "getSize", "()I", "size", "polloi", "attabal", "saneness", "graphics-shapes_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class apical extends p002kotlin.collections.wireman<MeasuredCubic> {

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final List<MeasuredCubic> cubics;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final formularize measurer;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final List<ProgressableFeature> features;

    /* JADX INFO: renamed from: microchemistry.apical$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: PolygonMeasure.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lmicrochemistry/apical$attabal;", "", "<init>", "()V", "Lmicrochemistry/formularize;", "measurer", "Lmicrochemistry/adultoid;", "polygon", "Lmicrochemistry/apical;", "attabal", "(Lmicrochemistry/formularize;Lmicrochemistry/adultoid;)Lmicrochemistry/apical;", "graphics-shapes_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final apical attabal(formularize measurer, adultoid polygon) {
            List listMarial;
            Intrinsics.checkNotNullParameter(measurer, "measurer");
            Intrinsics.checkNotNullParameter(polygon, "polygon");
            ArrayList<wireman> arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = polygon.competently().size();
            for (int i = 0; i < size; i++) {
                competently competentlyVar = polygon.competently().get(i);
                int size2 = competentlyVar.attabal().size();
                for (int i2 = 0; i2 < size2; i2++) {
                    if ((competentlyVar instanceof competently.attabal) && i2 == competentlyVar.attabal().size() / 2) {
                        arrayList2.add(patroclinal.formularize.attabal(competentlyVar, Integer.valueOf(arrayList.size())));
                    }
                    arrayList.add(competentlyVar.attabal().get(i2));
                }
            }
            Float fValueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            int iGintrap = p002kotlin.collections.dovishness.gintrap(arrayList, 9);
            if (iGintrap == 0) {
                listMarial = p002kotlin.collections.graveside.marial(fValueOf);
            } else {
                ArrayList arrayList3 = new ArrayList(iGintrap + 1);
                arrayList3.add(fValueOf);
                for (wireman wiremanVar : arrayList) {
                    float fFloatValue = fValueOf.floatValue();
                    float fAttabal = measurer.attabal(wiremanVar);
                    if (fAttabal < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        throw new IllegalArgumentException("Measured cubic is expected to be greater or equal to zero");
                    }
                    Unit unit = Unit.f29295attabal;
                    fValueOf = Float.valueOf(fFloatValue + fAttabal);
                    arrayList3.add(fValueOf);
                }
                listMarial = arrayList3;
            }
            float fFloatValue2 = ((Number) CollectionsKt.igbo(listMarial)).floatValue();
            cord cordVar = new cord(listMarial.size());
            int size3 = listMarial.size();
            for (int i3 = 0; i3 < size3; i3++) {
                cordVar.competently(((Number) listMarial.get(i3)).floatValue() / fFloatValue2);
            }
            String unused = polloi.f33394attabal;
            List listDern = p002kotlin.collections.graveside.dern();
            int size4 = arrayList2.size();
            for (int i4 = 0; i4 < size4; i4++) {
                int iIntValue = ((Number) ((Pair) arrayList2.get(i4)).getSecond()).intValue();
                listDern.add(new ProgressableFeature((cordVar.saneness(iIntValue) + cordVar.saneness(iIntValue + 1)) / 2, (competently) ((Pair) arrayList2.get(i4)).getFirst()));
            }
            return new apical(measurer, p002kotlin.collections.graveside.attabal(listDern), arrayList, cordVar, null);
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: microchemistry.apical$saneness, reason: from toString */
    /* JADX INFO: compiled from: PolygonMeasure.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0080\u0004\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000f\u001a\u0016\u0012\b\u0012\u00060\u0000R\u00020\u000e\u0012\b\u0012\u00060\u0000R\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R$\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019¨\u0006\u001e"}, d2 = {"Lmicrochemistry/apical$saneness;", "", "Lmicrochemistry/wireman;", "cubic", "", "startOutlineProgress", "endOutlineProgress", "<init>", "(Lmicrochemistry/apical;Lmicrochemistry/wireman;FF)V", "", "marial", "(FF)V", "cutOutlineProgress", "Lkotlin/Pair;", "Lmicrochemistry/apical;", "attabal", "(F)Lkotlin/Pair;", "", "toString", "()Ljava/lang/String;", "Lmicrochemistry/wireman;", "saneness", "()Lmicrochemistry/wireman;", "F", "getMeasuredSize", "()F", "measuredSize", "<set-?>", "dern", "wireman", "graphics-shapes_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class MeasuredCubic {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
        public final wireman cubic;

        /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata and from toString */
        public float outlineProgress;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final /* synthetic */ apical f33357marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
        public final float size;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
        public float endOutlineProgress;

        public MeasuredCubic(apical apicalVar, wireman cubic, float f, float f2) {
            Intrinsics.checkNotNullParameter(cubic, "cubic");
            this.f33357marial = apicalVar;
            this.cubic = cubic;
            if (f2 < f) {
                throw new IllegalArgumentException("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
            }
            this.size = apicalVar.measurer.attabal(cubic);
            this.outlineProgress = f;
            this.endOutlineProgress = f2;
        }

        public static /* synthetic */ void beachfront(MeasuredCubic measuredCubic, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = measuredCubic.outlineProgress;
            }
            if ((i & 2) != 0) {
                f2 = measuredCubic.endOutlineProgress;
            }
            measuredCubic.marial(f, f2);
        }

        public final Pair<MeasuredCubic, MeasuredCubic> attabal(float cutOutlineProgress) {
            float fCutely = p002kotlin.ranges.wireman.cutely(cutOutlineProgress, this.outlineProgress, this.endOutlineProgress);
            float f = this.endOutlineProgress;
            float f2 = this.outlineProgress;
            float fSaneness = this.f33357marial.measurer.saneness(this.cubic, ((fCutely - f2) / (f - f2)) * this.size);
            if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT > fSaneness || fSaneness > 1.0f) {
                throw new IllegalArgumentException("Cubic cut point is expected to be between 0 and 1");
            }
            String unused = polloi.f33394attabal;
            Pair<wireman, wireman> pairImpassible = this.cubic.impassible(fSaneness);
            return patroclinal.formularize.attabal(new MeasuredCubic(this.f33357marial, pairImpassible.component1(), this.outlineProgress, fCutely), new MeasuredCubic(this.f33357marial, pairImpassible.component2(), fCutely, this.endOutlineProgress));
        }

        /* JADX INFO: renamed from: dern, reason: from getter */
        public final float getEndOutlineProgress() {
            return this.endOutlineProgress;
        }

        public final void marial(float startOutlineProgress, float endOutlineProgress) {
            if (endOutlineProgress < startOutlineProgress) {
                throw new IllegalArgumentException("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
            }
            this.outlineProgress = startOutlineProgress;
            this.endOutlineProgress = endOutlineProgress;
        }

        /* JADX INFO: renamed from: saneness, reason: from getter */
        public final wireman getCubic() {
            return this.cubic;
        }

        public String toString() {
            return "MeasuredCubic(outlineProgress=[" + this.outlineProgress + " .. " + this.endOutlineProgress + "], size=" + this.size + ", cubic=" + this.cubic + ')';
        }

        /* JADX INFO: renamed from: wireman, reason: from getter */
        public final float getOutlineProgress() {
            return this.outlineProgress;
        }
    }

    public /* synthetic */ apical(formularize formularizeVar, List list, List list2, androidx.collection.impromptu impromptuVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(formularizeVar, list, list2, impromptuVar);
    }

    public final apical beachfront(float cuttingPoint) {
        float fCutely;
        if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT > cuttingPoint || cuttingPoint > 1.0f) {
            throw new IllegalArgumentException("Cutting point is expected to be between 0 and 1");
        }
        if (cuttingPoint < 1.0E-4f) {
            return this;
        }
        Iterator<MeasuredCubic> it = this.cubics.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            MeasuredCubic next = it.next();
            float outlineProgress = next.getOutlineProgress();
            if (cuttingPoint <= next.getEndOutlineProgress() && outlineProgress <= cuttingPoint) {
                break;
            }
            i++;
        }
        Pair<MeasuredCubic, MeasuredCubic> pairAttabal = this.cubics.get(i).attabal(cuttingPoint);
        MeasuredCubic measuredCubicComponent1 = pairAttabal.component1();
        MeasuredCubic measuredCubicComponent2 = pairAttabal.component2();
        String unused = polloi.f33394attabal;
        List listPolloi = p002kotlin.collections.adultoid.polloi(measuredCubicComponent2.getCubic());
        int size = this.cubics.size();
        for (int i2 = 1; i2 < size; i2++) {
            List<MeasuredCubic> list = this.cubics;
            listPolloi.add(list.get((i2 + i) % list.size()).getCubic());
        }
        listPolloi.add(measuredCubicComponent1.getCubic());
        cord cordVar = new cord(this.cubics.size() + 2);
        int size2 = this.cubics.size() + 2;
        for (int i3 = 0; i3 < size2; i3++) {
            if (i3 == 0) {
                fCutely = 0.0f;
            } else if (i3 == this.cubics.size() + 1) {
                fCutely = 1.0f;
            } else {
                fCutely = preprohormone.cutely(this.cubics.get(((i + i3) - 1) % this.cubics.size()).getEndOutlineProgress() - cuttingPoint, 1.0f);
            }
            cordVar.competently(fCutely);
        }
        List listDern = p002kotlin.collections.graveside.dern();
        int size3 = this.features.size();
        for (int i4 = 0; i4 < size3; i4++) {
            listDern.add(new ProgressableFeature(preprohormone.cutely(this.features.get(i4).getProgress() - cuttingPoint, 1.0f), this.features.get(i4).getFeature()));
        }
        return new apical(this.measurer, p002kotlin.collections.graveside.attabal(listDern), listPolloi, cordVar);
    }

    @Override // p002kotlin.collections.wireman, java.util.List
    /* JADX INFO: renamed from: competently, reason: merged with bridge method [inline-methods] */
    public MeasuredCubic get(int index) {
        return this.cubics.get(index);
    }

    @Override // p002kotlin.collections.saneness, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof MeasuredCubic) {
            return marial((MeasuredCubic) obj);
        }
        return false;
    }

    public /* bridge */ int cutely(MeasuredCubic measuredCubic) {
        return super.lastIndexOf(measuredCubic);
    }

    @Override // p002kotlin.collections.wireman, p002kotlin.collections.saneness
    public int getSize() {
        return this.cubics.size();
    }

    public final List<ProgressableFeature> impromptu() {
        return this.features;
    }

    @Override // p002kotlin.collections.wireman, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof MeasuredCubic) {
            return taiyuan((MeasuredCubic) obj);
        }
        return -1;
    }

    @Override // p002kotlin.collections.wireman, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof MeasuredCubic) {
            return cutely((MeasuredCubic) obj);
        }
        return -1;
    }

    public /* bridge */ boolean marial(MeasuredCubic measuredCubic) {
        return super.contains(measuredCubic);
    }

    public /* bridge */ int taiyuan(MeasuredCubic measuredCubic) {
        return super.indexOf(measuredCubic);
    }

    public apical(formularize formularizeVar, List<ProgressableFeature> list, List<? extends wireman> list2, androidx.collection.impromptu impromptuVar) {
        if (impromptuVar.get_size() != list2.size() + 1) {
            throw new IllegalArgumentException("Outline progress size is expected to be the cubics size + 1");
        }
        if (impromptuVar.attabal() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new IllegalArgumentException("First outline progress value is expected to be zero");
        }
        if (impromptuVar.beachfront() != 1.0f) {
            throw new IllegalArgumentException("Last outline progress value is expected to be one");
        }
        this.measurer = formularizeVar;
        this.features = list;
        ArrayList arrayList = new ArrayList();
        int size = list2.size();
        int i = 0;
        float fSaneness = 0.0f;
        while (i < size) {
            int i2 = i + 1;
            if (impromptuVar.saneness(i2) - impromptuVar.saneness(i) > 1.0E-4f) {
                arrayList.add(new MeasuredCubic(this, list2.get(i), fSaneness, impromptuVar.saneness(i2)));
                fSaneness = impromptuVar.saneness(i2);
            }
            i = i2;
        }
        MeasuredCubic.beachfront((MeasuredCubic) arrayList.get(p002kotlin.collections.adultoid.triweekly(arrayList)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1, null);
        this.cubics = arrayList;
    }
}
