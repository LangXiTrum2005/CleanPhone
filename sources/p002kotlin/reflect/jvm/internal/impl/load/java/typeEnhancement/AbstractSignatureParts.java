package p002kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import byname.wireman;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.jvm.dern;
import p002kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver;
import p002kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import p002kotlin.reflect.jvm.internal.impl.load.java.polloi;
import p002kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import presbytery.apical;
import presbytery.competently;
import presbytery.cutely;
import presbytery.formularize;
import presbytery.impassible;

/* JADX INFO: compiled from: AbstractSignatureParts.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractSignatureParts<TAnnotation> {

    /* JADX INFO: compiled from: AbstractSignatureParts.kt */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final competently f30614attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final formularize f30615dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final polloi f30616saneness;

        public attabal(competently competentlyVar, polloi polloiVar, formularize formularizeVar) {
            this.f30614attabal = competentlyVar;
            this.f30616saneness = polloiVar;
            this.f30615dern = formularizeVar;
        }

        public final polloi attabal() {
            return this.f30616saneness;
        }

        public final formularize dern() {
            return this.f30615dern;
        }

        public final competently saneness() {
            return this.f30614attabal;
        }
    }

    public abstract boolean adultoid();

    /* JADX WARN: Code duplicated, block: B:45:0x00af  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:? A[LOOP:3: B:46:0x00b3->B:72:?, LOOP_END, SYNTHETIC] */
    public final beachfront apical(formularize formularizeVar) {
        List<competently> arrayList;
        List<competently> list;
        Iterator<T> it;
        NullabilityQualifier nullabilityQualifier;
        boolean z;
        impassible impassibleVarDovishness = dovishness();
        if (!cord(formularizeVar)) {
            return null;
        }
        List<competently> listStarveling = impassibleVarDovishness.starveling(formularizeVar);
        List<competently> list2 = listStarveling;
        boolean z2 = list2 instanceof Collection;
        if (!z2 || !list2.isEmpty()) {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (!impassibleVarDovishness.dent((competently) it2.next())) {
                    if (!z2 || !list2.isEmpty()) {
                        Iterator<T> it3 = list2.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (graveside((competently) it3.next()) != null) {
                                    arrayList = listStarveling;
                                }
                            }
                            list = arrayList;
                            if ((list instanceof Collection) && list.isEmpty()) {
                                nullabilityQualifier = NullabilityQualifier.NULLABLE;
                                break;
                            }
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    nullabilityQualifier = NullabilityQualifier.NULLABLE;
                                    break;
                                }
                                if (!impassibleVarDovishness.picketboat((competently) it.next())) {
                                    nullabilityQualifier = NullabilityQualifier.NOT_NULL;
                                    break;
                                }
                            }
                            if (arrayList != listStarveling) {
                                z = true;
                            } else {
                                z = false;
                            }
                            return new beachfront(nullabilityQualifier, z);
                        }
                    }
                    if (!z2 || !list2.isEmpty()) {
                        Iterator<T> it4 = list2.iterator();
                        while (it4.hasNext()) {
                            if (monoploid((competently) it4.next()) != null) {
                                arrayList = new ArrayList<>();
                                Iterator<T> it5 = list2.iterator();
                                while (it5.hasNext()) {
                                    competently competentlyVarMonoploid = monoploid((competently) it5.next());
                                    if (competentlyVarMonoploid != null) {
                                        arrayList.add(competentlyVarMonoploid);
                                    }
                                }
                                list = arrayList;
                                if (list instanceof Collection) {
                                    it = list.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            nullabilityQualifier = NullabilityQualifier.NULLABLE;
                                            break;
                                        }
                                        if (!impassibleVarDovishness.picketboat((competently) it.next())) {
                                            nullabilityQualifier = NullabilityQualifier.NOT_NULL;
                                            break;
                                        }
                                    }
                                } else {
                                    it = list.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            nullabilityQualifier = NullabilityQualifier.NULLABLE;
                                            break;
                                        }
                                        if (!impassibleVarDovishness.picketboat((competently) it.next())) {
                                            nullabilityQualifier = NullabilityQualifier.NOT_NULL;
                                            break;
                                        }
                                    }
                                }
                                if (arrayList != listStarveling) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                return new beachfront(nullabilityQualifier, z);
                            }
                        }
                        break;
                    }
                    break;
                }
            }
        }
        return null;
    }

    public abstract boolean arytenoidectomy();

    public final <T> List<T> beachfront(T t, Function1<? super T, ? extends Iterable<? extends T>> function1) {
        ArrayList arrayList = new ArrayList(1);
        competently(t, arrayList, function1);
        return arrayList;
    }

    public final <T> void competently(T t, List<T> list, Function1<? super T, ? extends Iterable<? extends T>> function1) {
        list.add(t);
        Iterable<? extends T> iterableInvoke = function1.invoke(t);
        if (iterableInvoke != null) {
            Iterator<? extends T> it = iterableInvoke.iterator();
            while (it.hasNext()) {
                competently(it.next(), list, function1);
            }
        }
    }

    public abstract boolean cord(formularize formularizeVar);

    public abstract boolean cuirassed(competently competentlyVar);

    public abstract Iterable<TAnnotation> cutely(competently competentlyVar);

    public final polloi dern(competently competentlyVar, polloi polloiVar) {
        return taiyuan().dern(polloiVar, cutely(competentlyVar));
    }

    public abstract impassible dovishness();

    public abstract Iterable<TAnnotation> formularize();

    public abstract boolean gintrap(competently competentlyVar);

    public final NullabilityQualifier graveside(competently competentlyVar) {
        impassible impassibleVarDovishness = dovishness();
        if (impassibleVarDovishness.adultoid(impassibleVarDovishness.creditor(competentlyVar))) {
            return NullabilityQualifier.NULLABLE;
        }
        if (impassibleVarDovishness.adultoid(impassibleVarDovishness.julian(competentlyVar))) {
            return null;
        }
        return NullabilityQualifier.NOT_NULL;
    }

    public abstract AnnotationQualifierApplicabilityType impassible();

    public abstract boolean impromptu(TAnnotation tannotation, competently competentlyVar);

    public abstract boolean kowloon();

    public final wireman marial(final attabal attabalVar) {
        List listFormularize;
        beachfront beachfrontVarWireman;
        beachfront beachfrontVarApical;
        competently competentlyVarSaneness;
        apical apicalVarNosophobia;
        if (attabalVar.saneness() == null) {
            impassible impassibleVarDovishness = dovishness();
            formularize formularizeVarDern = attabalVar.dern();
            if ((formularizeVarDern != null ? impassibleVarDovishness.sensatory(formularizeVarDern) : null) == TypeVariance.IN) {
                return wireman.f30658marial.attabal();
            }
        }
        boolean z = false;
        boolean z2 = attabalVar.dern() == null;
        competently competentlyVarSaneness2 = attabalVar.saneness();
        if (competentlyVarSaneness2 == null || (listFormularize = cutely(competentlyVarSaneness2)) == null) {
            listFormularize = adultoid.formularize();
        }
        impassible impassibleVarDovishness2 = dovishness();
        competently competentlyVarSaneness3 = attabalVar.saneness();
        formularize formularizeVarPalmyra = (competentlyVarSaneness3 == null || (apicalVarNosophobia = impassibleVarDovishness2.nosophobia(competentlyVarSaneness3)) == null) ? null : impassibleVarDovishness2.palmyra(apicalVarNosophobia);
        boolean z3 = impassible() == AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS;
        if (z2) {
            if (z3 || !arytenoidectomy() || (competentlyVarSaneness = attabalVar.saneness()) == null || !gintrap(competentlyVarSaneness)) {
                listFormularize = CollectionsKt.julian(formularize(), listFormularize);
            } else {
                Iterable<TAnnotation> iterableFormularize = formularize();
                ArrayList arrayList = new ArrayList();
                for (TAnnotation tannotation : iterableFormularize) {
                    if (!taiyuan().impassible(tannotation)) {
                        arrayList.add(tannotation);
                    }
                }
                listFormularize = CollectionsKt.unconsolidated(arrayList, listFormularize);
            }
        }
        MutabilityQualifier mutabilityQualifierMarial = taiyuan().marial(listFormularize);
        beachfront beachfrontVarBeachfront = taiyuan().beachfront(listFormularize, new Function1<TAnnotation, Boolean>(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$extractQualifiersFromAnnotations$annotationsNullability$1
            final /* synthetic */ AbstractSignatureParts<TAnnotation> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p002kotlin.jvm.functions.Function1
            public final Boolean invoke(TAnnotation extractNullability) {
                Intrinsics.checkNotNullParameter(extractNullability, "$this$extractNullability");
                return Boolean.valueOf(this.this$0.impromptu(extractNullability, attabalVar.saneness()));
            }
        });
        if (beachfrontVarBeachfront != null) {
            NullabilityQualifier nullabilityQualifierDern = beachfrontVarBeachfront.dern();
            if (beachfrontVarBeachfront.dern() == NullabilityQualifier.NOT_NULL && formularizeVarPalmyra != null) {
                z = true;
            }
            return new wireman(nullabilityQualifierDern, mutabilityQualifierMarial, z, beachfrontVarBeachfront.wireman());
        }
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityTypeImpassible = (z2 || z3) ? impassible() : AnnotationQualifierApplicabilityType.TYPE_USE;
        polloi polloiVarAttabal = attabalVar.attabal();
        p002kotlin.reflect.jvm.internal.impl.load.java.formularize formularizeVarAttabal = polloiVarAttabal != null ? polloiVarAttabal.attabal(annotationQualifierApplicabilityTypeImpassible) : null;
        beachfront beachfrontVarApical2 = formularizeVarPalmyra != null ? apical(formularizeVarPalmyra) : null;
        if (beachfrontVarApical2 == null || (beachfrontVarWireman = beachfront.saneness(beachfrontVarApical2, NullabilityQualifier.NOT_NULL, false, 2, null)) == null) {
            beachfrontVarWireman = formularizeVarAttabal != null ? formularizeVarAttabal.wireman() : null;
        }
        boolean z4 = (beachfrontVarApical2 != null ? beachfrontVarApical2.dern() : null) == NullabilityQualifier.NOT_NULL || !(formularizeVarPalmyra == null || formularizeVarAttabal == null || !formularizeVarAttabal.dern());
        formularize formularizeVarDern2 = attabalVar.dern();
        if (formularizeVarDern2 == null || (beachfrontVarApical = apical(formularizeVarDern2)) == null) {
            beachfrontVarApical = null;
        } else if (beachfrontVarApical.dern() == NullabilityQualifier.NULLABLE) {
            beachfrontVarApical = beachfront.saneness(beachfrontVarApical, NullabilityQualifier.FORCE_FLEXIBILITY, false, 2, null);
        }
        beachfront beachfrontVarStratoscope = stratoscope(beachfrontVarApical, beachfrontVarWireman);
        NullabilityQualifier nullabilityQualifierDern2 = beachfrontVarStratoscope != null ? beachfrontVarStratoscope.dern() : null;
        if (beachfrontVarStratoscope != null && beachfrontVarStratoscope.wireman()) {
            z = true;
        }
        return new wireman(nullabilityQualifierDern2, mutabilityQualifierMarial, z4, z);
    }

    public abstract wireman molybdenite(competently competentlyVar);

    public abstract competently monoploid(competently competentlyVar);

    public boolean polloi() {
        return false;
    }

    public abstract boolean preprohormone(competently competentlyVar, competently competentlyVar2);

    public abstract boolean rotuma();

    public final Function1<Integer, wireman> saneness(competently competentlyVar, Iterable<? extends competently> overrides, final apical apicalVar, boolean z) {
        int size;
        competently competentlyVarSaneness;
        Intrinsics.checkNotNullParameter(competentlyVar, "<this>");
        Intrinsics.checkNotNullParameter(overrides, "overrides");
        List<attabal> listTrm = trm(competentlyVar);
        ArrayList arrayList = new ArrayList(dovishness.gintrap(overrides, 10));
        Iterator<? extends competently> it = overrides.iterator();
        while (it.hasNext()) {
            arrayList.add(trm(it.next()));
        }
        if (polloi()) {
            size = 1;
        } else {
            if (rotuma() && (!(overrides instanceof Collection) || !((Collection) overrides).isEmpty())) {
                Iterator<? extends competently> it2 = overrides.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!preprohormone(competentlyVar, it2.next())) {
                            size = 1;
                        }
                    }
                }
            }
            size = listTrm.size();
        }
        final wireman[] wiremanVarArr = new wireman[size];
        int i = 0;
        while (i < size) {
            wireman wiremanVarMarial = marial(listTrm.get(i));
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                attabal attabalVar = (attabal) CollectionsKt.lotta((List) it3.next(), i);
                wireman wiremanVarWireman = (attabalVar == null || (competentlyVarSaneness = attabalVar.saneness()) == null) ? null : wireman(competentlyVarSaneness);
                if (wiremanVarWireman != null) {
                    arrayList2.add(wiremanVarWireman);
                }
            }
            wiremanVarArr[i] = impassible.attabal(wiremanVarMarial, arrayList2, i == 0 && rotuma(), i == 0 && kowloon(), z);
            i++;
        }
        return new Function1<Integer, wireman>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$computeIndexedQualifiers$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ wireman invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final wireman invoke(int i2) {
                Map<Integer, wireman> mapAttabal;
                wireman wiremanVar;
                apical apicalVar2 = apicalVar;
                if (apicalVar2 != null && (mapAttabal = apicalVar2.attabal()) != null && (wiremanVar = mapAttabal.get(Integer.valueOf(i2))) != null) {
                    return wiremanVar;
                }
                wireman[] wiremanVarArr2 = wiremanVarArr;
                return (i2 < 0 || i2 > p002kotlin.collections.polloi.walach(wiremanVarArr2)) ? wireman.f30658marial.attabal() : wiremanVarArr2[i2];
            }
        };
    }

    public final beachfront stratoscope(beachfront beachfrontVar, beachfront beachfrontVar2) {
        if (beachfrontVar == null) {
            return beachfrontVar2;
        }
        return (beachfrontVar2 != null && ((beachfrontVar.wireman() && !beachfrontVar2.wireman()) || ((beachfrontVar.wireman() || !beachfrontVar2.wireman()) && (beachfrontVar.dern().compareTo(beachfrontVar2.dern()) < 0 || beachfrontVar.dern().compareTo(beachfrontVar2.dern()) <= 0)))) ? beachfrontVar2 : beachfrontVar;
    }

    public abstract AbstractAnnotationTypeQualifierResolver<TAnnotation> taiyuan();

    public abstract polloi triweekly();

    public final List<attabal> trm(competently competentlyVar) {
        final impassible impassibleVarDovishness = dovishness();
        return beachfront(new attabal(competentlyVar, dern(competentlyVar, triweekly()), null), new Function1<attabal, Iterable<? extends attabal>>(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$toIndexed$1$1
            final /* synthetic */ AbstractSignatureParts<TAnnotation> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // p002kotlin.jvm.functions.Function1
            public final Iterable<AbstractSignatureParts.attabal> invoke(AbstractSignatureParts.attabal it) {
                competently competentlyVarSaneness;
                apical apicalVarNosophobia;
                List<formularize> listMathsort;
                AbstractSignatureParts.attabal attabalVar;
                competently competentlyVarSaneness2;
                Intrinsics.checkNotNullParameter(it, "it");
                if ((this.this$0.adultoid() && (competentlyVarSaneness2 = it.saneness()) != null && impassibleVarDovishness.gintrap(competentlyVarSaneness2)) || (competentlyVarSaneness = it.saneness()) == null || (apicalVarNosophobia = impassibleVarDovishness.nosophobia(competentlyVarSaneness)) == null || (listMathsort = impassibleVarDovishness.mathsort(apicalVarNosophobia)) == null) {
                    return null;
                }
                List<formularize> list = listMathsort;
                List<cutely> listPermissivist = impassibleVarDovishness.permissivist(it.saneness());
                impassible impassibleVar = impassibleVarDovishness;
                AbstractSignatureParts<TAnnotation> abstractSignatureParts = this.this$0;
                Iterator<T> it2 = list.iterator();
                Iterator<T> it3 = listPermissivist.iterator();
                ArrayList arrayList = new ArrayList(Math.min(dovishness.gintrap(list, 10), dovishness.gintrap(listPermissivist, 10)));
                while (it2.hasNext() && it3.hasNext()) {
                    Object next = it2.next();
                    cutely cutelyVar = (cutely) it3.next();
                    formularize formularizeVar = (formularize) next;
                    if (impassibleVar.preprohormone(cutelyVar)) {
                        attabalVar = new AbstractSignatureParts.attabal(null, it.attabal(), formularizeVar);
                    } else {
                        competently competentlyVarWostteth = impassibleVar.wostteth(cutelyVar);
                        attabalVar = new AbstractSignatureParts.attabal(competentlyVarWostteth, abstractSignatureParts.dern(competentlyVarWostteth, it.attabal()), formularizeVar);
                    }
                    arrayList.add(attabalVar);
                }
                return arrayList;
            }
        });
    }

    public final wireman wireman(competently competentlyVar) {
        NullabilityQualifier nullabilityQualifierGraveside;
        NullabilityQualifier nullabilityQualifierGraveside2 = graveside(competentlyVar);
        MutabilityQualifier mutabilityQualifier = null;
        if (nullabilityQualifierGraveside2 == null) {
            competently competentlyVarMonoploid = monoploid(competentlyVar);
            nullabilityQualifierGraveside = competentlyVarMonoploid != null ? graveside(competentlyVarMonoploid) : null;
        } else {
            nullabilityQualifierGraveside = nullabilityQualifierGraveside2;
        }
        impassible impassibleVarDovishness = dovishness();
        dern dernVar = dern.f29852attabal;
        if (dernVar.formularize(molybdenite(impassibleVarDovishness.creditor(competentlyVar)))) {
            mutabilityQualifier = MutabilityQualifier.READ_ONLY;
        } else if (dernVar.apical(molybdenite(impassibleVarDovishness.julian(competentlyVar)))) {
            mutabilityQualifier = MutabilityQualifier.MUTABLE;
        }
        return new wireman(nullabilityQualifierGraveside, mutabilityQualifier, dovishness().underbelly(competentlyVar) || cuirassed(competentlyVar), nullabilityQualifierGraveside != nullabilityQualifierGraveside2);
    }
}
