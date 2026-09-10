package p002kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.resolve.calls.inference.dern;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.triweekly;
import p002kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import p002kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p002kotlin.reflect.jvm.internal.impl.types.Variance;
import p002kotlin.reflect.jvm.internal.impl.types.beachfront;
import p002kotlin.reflect.jvm.internal.impl.types.empress;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import p002kotlin.reflect.jvm.internal.impl.types.nosophobia;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.permissivist;
import p002kotlin.reflect.jvm.internal.impl.types.preprohormone;
import p002kotlin.reflect.jvm.internal.impl.types.sayid;
import p002kotlin.reflect.jvm.internal.impl.types.timberyard;
import p002kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import presbytery.competently;

/* JADX INFO: compiled from: KotlinTypePreparator.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class KotlinTypePreparator extends beachfront {

    /* JADX INFO: compiled from: KotlinTypePreparator.kt */
    public static final class attabal extends KotlinTypePreparator {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final attabal f31707attabal = new attabal();
    }

    public final merc dern(merc mercVar) {
        oilcan type;
        permissivist permissivistVar = mercVar.setterwort();
        IntersectionTypeConstructor intersectionTypeConstructorTriweekly = null;
        empressVarHomozygous = null;
        empress empressVarHomozygous = null;
        if (permissivistVar instanceof dern) {
            dern dernVar = (dern) permissivistVar;
            timberyard timberyardVarDern = dernVar.dern();
            if (timberyardVarDern.dern() != Variance.IN_VARIANCE) {
                timberyardVarDern = null;
            }
            if (timberyardVarDern != null && (type = timberyardVarDern.getType()) != null) {
                empressVarHomozygous = type.homozygous();
            }
            empress empressVar = empressVarHomozygous;
            if (dernVar.competently() == null) {
                timberyard timberyardVarDern2 = dernVar.dern();
                Collection<oilcan> collectionCutely = dernVar.cutely();
                ArrayList arrayList = new ArrayList(dovishness.gintrap(collectionCutely, 10));
                Iterator<T> it = collectionCutely.iterator();
                while (it.hasNext()) {
                    arrayList.add(((oilcan) it.next()).homozygous());
                }
                dernVar.taiyuan(new NewCapturedTypeConstructor(timberyardVarDern2, arrayList, null, 4, null));
            }
            CaptureStatus captureStatus = CaptureStatus.FOR_SUBTYPING;
            NewCapturedTypeConstructor newCapturedTypeConstructorCompetently = dernVar.competently();
            Intrinsics.beachfront(newCapturedTypeConstructorCompetently);
            return new impromptu(captureStatus, newCapturedTypeConstructorCompetently, empressVar, mercVar.vesuvio(), mercVar.mastfed(), false, 32, null);
        }
        boolean z = false;
        if (permissivistVar instanceof triweekly) {
            Collection<oilcan> collectionCutely2 = ((triweekly) permissivistVar).cutely();
            ArrayList arrayList2 = new ArrayList(dovishness.gintrap(collectionCutely2, 10));
            Iterator<T> it2 = collectionCutely2.iterator();
            while (it2.hasNext()) {
                oilcan oilcanVarArytenoidectomy = nosophobia.arytenoidectomy((oilcan) it2.next(), mercVar.mastfed());
                Intrinsics.checkNotNullExpressionValue(oilcanVarArytenoidectomy, "makeNullableAsSpecified(...)");
                arrayList2.add(oilcanVarArytenoidectomy);
            }
            return KotlinTypeFactory.impassible(mercVar.vesuvio(), new IntersectionTypeConstructor(arrayList2), adultoid.formularize(), false, mercVar.formularize());
        }
        if (!(permissivistVar instanceof IntersectionTypeConstructor) || !mercVar.mastfed()) {
            return mercVar;
        }
        IntersectionTypeConstructor intersectionTypeConstructor = (IntersectionTypeConstructor) permissivistVar;
        Collection<oilcan> collectionCutely3 = intersectionTypeConstructor.cutely();
        ArrayList arrayList3 = new ArrayList(dovishness.gintrap(collectionCutely3, 10));
        Iterator<T> it3 = collectionCutely3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(TypeUtilsKt.gintrap((oilcan) it3.next()));
            z = true;
        }
        if (z) {
            oilcan oilcanVarImpromptu = intersectionTypeConstructor.impromptu();
            intersectionTypeConstructorTriweekly = new IntersectionTypeConstructor(arrayList3).triweekly(oilcanVarImpromptu != null ? TypeUtilsKt.gintrap(oilcanVarImpromptu) : null);
        }
        if (intersectionTypeConstructorTriweekly != null) {
            intersectionTypeConstructor = intersectionTypeConstructorTriweekly;
        }
        return intersectionTypeConstructor.competently();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.beachfront
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public empress attabal(competently type) {
        empress empressVarWireman;
        Intrinsics.checkNotNullParameter(type, "type");
        if (!(type instanceof oilcan)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        empress empressVarHomozygous = ((oilcan) type).homozygous();
        if (empressVarHomozygous instanceof merc) {
            empressVarWireman = dern((merc) empressVarHomozygous);
        } else {
            if (!(empressVarHomozygous instanceof preprohormone)) {
                throw new NoWhenBranchMatchedException();
            }
            preprohormone preprohormoneVar = (preprohormone) empressVarHomozygous;
            merc mercVarDern = dern(preprohormoneVar.sakeen());
            merc mercVarDern2 = dern(preprohormoneVar.immediately());
            empressVarWireman = (mercVarDern == preprohormoneVar.sakeen() && mercVarDern2 == preprohormoneVar.immediately()) ? empressVarHomozygous : KotlinTypeFactory.wireman(mercVarDern, mercVarDern2);
        }
        return sayid.dern(empressVarWireman, empressVarHomozygous, new KotlinTypePreparator$prepareType$1(this));
    }
}
