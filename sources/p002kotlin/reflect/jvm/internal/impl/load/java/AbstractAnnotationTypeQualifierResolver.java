package p002kotlin.reflect.jvm.internal.impl.load.java;

import byname.dern;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p002kotlin.Pair;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.polloi;
import p002kotlin.collections.starveling;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.competently;
import p002kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier;
import p002kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.beachfront;

/* JADX INFO: compiled from: AbstractAnnotationTypeQualifierResolver.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractAnnotationTypeQualifierResolver<TAnnotation> {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final attabal f30277dern = new attabal(null);

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final Map<String, AnnotationQualifierApplicabilityType> f30278wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final JavaTypeEnhancementState f30279attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ConcurrentHashMap<Object, TAnnotation> f30280saneness;

    /* JADX INFO: compiled from: AbstractAnnotationTypeQualifierResolver.kt */
    public static final class attabal {
        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public attabal() {
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType : AnnotationQualifierApplicabilityType.values()) {
            String javaTarget = annotationQualifierApplicabilityType.getJavaTarget();
            if (linkedHashMap.get(javaTarget) == null) {
                linkedHashMap.put(javaTarget, annotationQualifierApplicabilityType);
            }
        }
        f30278wireman = linkedHashMap;
    }

    public AbstractAnnotationTypeQualifierResolver(JavaTypeEnhancementState javaTypeEnhancementState) {
        Intrinsics.checkNotNullParameter(javaTypeEnhancementState, "javaTypeEnhancementState");
        this.f30279attabal = javaTypeEnhancementState;
        this.f30280saneness = new ConcurrentHashMap<>();
    }

    public abstract Iterable<TAnnotation> apical(TAnnotation tannotation);

    public final ReportLevel arytenoidectomy(TAnnotation tannotation) {
        ReportLevel reportLevelMonoploid = monoploid(tannotation);
        return reportLevelMonoploid != null ? reportLevelMonoploid : this.f30279attabal.wireman().attabal();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Set<AnnotationQualifierApplicabilityType> attabal(Set<? extends AnnotationQualifierApplicabilityType> set) {
        return set.contains(AnnotationQualifierApplicabilityType.TYPE_USE) ? starveling.apical(starveling.cutely(polloi.lampshade(AnnotationQualifierApplicabilityType.values()), AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS), set) : set;
    }

    public final beachfront beachfront(Iterable<? extends TAnnotation> annotations, Function1<? super TAnnotation, Boolean> forceWarning) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(forceWarning, "forceWarning");
        Iterator<? extends TAnnotation> it = annotations.iterator();
        beachfront beachfrontVar = null;
        while (it.hasNext()) {
            beachfront beachfrontVarCompetently = competently(it.next(), forceWarning);
            if (beachfrontVar != null) {
                if (beachfrontVarCompetently != null && !Intrinsics.wireman(beachfrontVarCompetently, beachfrontVar) && (!beachfrontVarCompetently.wireman() || beachfrontVar.wireman())) {
                    if (beachfrontVarCompetently.wireman() || !beachfrontVar.wireman()) {
                        return null;
                    }
                }
            }
            beachfrontVar = beachfrontVarCompetently;
        }
        return beachfrontVar;
    }

    public final beachfront competently(TAnnotation tannotation, Function1<? super TAnnotation, Boolean> function1) {
        beachfront beachfrontVarTriweekly;
        beachfront beachfrontVarTriweekly2 = triweekly(tannotation, function1.invoke(tannotation).booleanValue());
        if (beachfrontVarTriweekly2 != null) {
            return beachfrontVarTriweekly2;
        }
        TAnnotation tannotationMolybdenite = molybdenite(tannotation);
        if (tannotationMolybdenite == null) {
            return null;
        }
        ReportLevel reportLevelArytenoidectomy = arytenoidectomy(tannotation);
        if (reportLevelArytenoidectomy.isIgnore() || (beachfrontVarTriweekly = triweekly(tannotationMolybdenite, function1.invoke(tannotationMolybdenite).booleanValue())) == null) {
            return null;
        }
        return beachfront.saneness(beachfrontVarTriweekly, null, reportLevelArytenoidectomy.isWarning(), 1, null);
    }

    public abstract Object cutely(TAnnotation tannotation);

    public final polloi dern(polloi polloiVar, Iterable<? extends TAnnotation> annotations) {
        EnumMap<AnnotationQualifierApplicabilityType, formularize> enumMapSaneness;
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        if (!this.f30279attabal.saneness()) {
            ArrayList<formularize> arrayList = new ArrayList();
            Iterator<? extends TAnnotation> it = annotations.iterator();
            while (it.hasNext()) {
                formularize formularizeVarWireman = wireman(it.next());
                if (formularizeVarWireman != null) {
                    arrayList.add(formularizeVarWireman);
                }
            }
            if (!arrayList.isEmpty()) {
                EnumMap enumMap = (polloiVar == null || (enumMapSaneness = polloiVar.saneness()) == null) ? new EnumMap(AnnotationQualifierApplicabilityType.class) : new EnumMap((EnumMap) enumMapSaneness);
                boolean z = false;
                for (formularize formularizeVar : arrayList) {
                    Iterator<AnnotationQualifierApplicabilityType> it2 = formularizeVar.marial().iterator();
                    while (it2.hasNext()) {
                        enumMap.put(it2.next(), formularizeVar);
                        z = true;
                    }
                }
                if (z) {
                    return new polloi(enumMap);
                }
            }
        }
        return polloiVar;
    }

    public final boolean formularize(TAnnotation tannotation, dern dernVar) {
        Iterable<TAnnotation> iterableApical = apical(tannotation);
        if ((iterableApical instanceof Collection) && ((Collection) iterableApical).isEmpty()) {
            return false;
        }
        Iterator<TAnnotation> it = iterableApical.iterator();
        while (it.hasNext()) {
            if (Intrinsics.wireman(taiyuan(it.next()), dernVar)) {
                return true;
            }
        }
        return false;
    }

    public final Pair<TAnnotation, Set<AnnotationQualifierApplicabilityType>> graveside(TAnnotation tannotation) {
        TAnnotation tannotationImpromptu;
        TAnnotation next;
        if (this.f30279attabal.wireman().wireman() || (tannotationImpromptu = impromptu(tannotation, p002kotlin.reflect.jvm.internal.impl.load.java.attabal.marial())) == null) {
            return null;
        }
        Iterator<TAnnotation> it = apical(tannotation).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (molybdenite(next) == null);
        if (next == null) {
            return null;
        }
        Iterable<String> iterableSaneness = saneness(tannotationImpromptu, true);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<String> it2 = iterableSaneness.iterator();
        while (it2.hasNext()) {
            AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = f30278wireman.get(it2.next());
            if (annotationQualifierApplicabilityType != null) {
                linkedHashSet.add(annotationQualifierApplicabilityType);
            }
        }
        return new Pair<>(next, attabal(linkedHashSet));
    }

    public final boolean impassible(TAnnotation annotation) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        TAnnotation tannotationImpromptu = impromptu(annotation, competently.attabal.f29768supplicat);
        if (tannotationImpromptu == null) {
            return false;
        }
        Iterable<String> iterableSaneness = saneness(tannotationImpromptu, false);
        if ((iterableSaneness instanceof Collection) && ((Collection) iterableSaneness).isEmpty()) {
            return false;
        }
        Iterator<String> it = iterableSaneness.iterator();
        while (it.hasNext()) {
            if (Intrinsics.wireman(it.next(), "TYPE")) {
                return true;
            }
        }
        return false;
    }

    public final TAnnotation impromptu(TAnnotation tannotation, dern dernVar) {
        for (TAnnotation tannotation2 : apical(tannotation)) {
            if (Intrinsics.wireman(taiyuan(tannotation2), dernVar)) {
                return tannotation2;
            }
        }
        return null;
    }

    public final ReportLevel kowloon(TAnnotation tannotation) {
        dern dernVarTaiyuan = taiyuan(tannotation);
        return (dernVarTaiyuan == null || !p002kotlin.reflect.jvm.internal.impl.load.java.attabal.dern().containsKey(dernVarTaiyuan)) ? arytenoidectomy(tannotation) : this.f30279attabal.dern().invoke(dernVarTaiyuan);
    }

    public final MutabilityQualifier marial(Iterable<? extends TAnnotation> annotations) {
        MutabilityQualifier mutabilityQualifier;
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Iterator<? extends TAnnotation> it = annotations.iterator();
        MutabilityQualifier mutabilityQualifier2 = null;
        while (it.hasNext()) {
            dern dernVarTaiyuan = taiyuan(it.next());
            if (adultoid.arytenoidectomy().contains(dernVarTaiyuan)) {
                mutabilityQualifier = MutabilityQualifier.READ_ONLY;
            } else if (adultoid.impassible().contains(dernVarTaiyuan)) {
                mutabilityQualifier = MutabilityQualifier.MUTABLE;
            } else {
                continue;
            }
            if (mutabilityQualifier2 != null && mutabilityQualifier2 != mutabilityQualifier) {
                return null;
            }
            mutabilityQualifier2 = mutabilityQualifier;
        }
        return mutabilityQualifier2;
    }

    public final TAnnotation molybdenite(TAnnotation annotation) {
        TAnnotation tannotationMolybdenite;
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        if (this.f30279attabal.wireman().wireman()) {
            return null;
        }
        if (CollectionsKt.permissivist(p002kotlin.reflect.jvm.internal.impl.load.java.attabal.saneness(), taiyuan(annotation)) || formularize(annotation, p002kotlin.reflect.jvm.internal.impl.load.java.attabal.beachfront())) {
            return annotation;
        }
        if (!formularize(annotation, p002kotlin.reflect.jvm.internal.impl.load.java.attabal.competently())) {
            return null;
        }
        ConcurrentHashMap<Object, TAnnotation> concurrentHashMap = this.f30280saneness;
        Object objCutely = cutely(annotation);
        TAnnotation tannotation = concurrentHashMap.get(objCutely);
        if (tannotation != null) {
            return tannotation;
        }
        Iterator<TAnnotation> it = apical(annotation).iterator();
        do {
            if (!it.hasNext()) {
                tannotationMolybdenite = null;
                break;
            }
            tannotationMolybdenite = molybdenite(it.next());
        } while (tannotationMolybdenite == null);
        if (tannotationMolybdenite == null) {
            return null;
        }
        TAnnotation tannotationPutIfAbsent = concurrentHashMap.putIfAbsent(objCutely, tannotationMolybdenite);
        return tannotationPutIfAbsent == null ? tannotationMolybdenite : tannotationPutIfAbsent;
    }

    public final ReportLevel monoploid(TAnnotation tannotation) {
        Iterable<String> iterableSaneness;
        String str;
        ReportLevel reportLevel = this.f30279attabal.wireman().dern().get(taiyuan(tannotation));
        if (reportLevel != null) {
            return reportLevel;
        }
        TAnnotation tannotationImpromptu = impromptu(tannotation, p002kotlin.reflect.jvm.internal.impl.load.java.attabal.wireman());
        if (tannotationImpromptu == null || (iterableSaneness = saneness(tannotationImpromptu, false)) == null || (str = (String) CollectionsKt.nosophobia(iterableSaneness)) == null) {
            return null;
        }
        ReportLevel reportLevelSaneness = this.f30279attabal.wireman().saneness();
        if (reportLevelSaneness != null) {
            return reportLevelSaneness;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -2137067054) {
            if (iHashCode != -1838656823) {
                if (iHashCode == 2656902 && str.equals("WARN")) {
                    return ReportLevel.WARN;
                }
            } else if (str.equals("STRICT")) {
                return ReportLevel.STRICT;
            }
        } else if (str.equals("IGNORE")) {
            return ReportLevel.IGNORE;
        }
        return null;
    }

    public final formularize polloi(TAnnotation tannotation) {
        formularize formularizeVar;
        if (this.f30279attabal.saneness() || (formularizeVar = p002kotlin.reflect.jvm.internal.impl.load.java.attabal.attabal().get(taiyuan(tannotation))) == null) {
            return null;
        }
        ReportLevel reportLevelKowloon = kowloon(tannotation);
        if (reportLevelKowloon == ReportLevel.IGNORE) {
            reportLevelKowloon = null;
        }
        if (reportLevelKowloon == null) {
            return null;
        }
        return formularize.saneness(formularizeVar, beachfront.saneness(formularizeVar.wireman(), null, reportLevelKowloon.isWarning(), 1, null), null, false, 6, null);
    }

    public abstract Iterable<String> saneness(TAnnotation tannotation, boolean z);

    public abstract dern taiyuan(TAnnotation tannotation);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0091, code lost:
    
        if (r7.equals("ALWAYS") != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a6, code lost:
    
        if (r7.equals("NEVER") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00af, code lost:
    
        if (r7.equals("MAYBE") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b2, code lost:
    
        r7 = p002kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p002kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.beachfront triweekly(TAnnotation r7, boolean r8) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p002kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver.triweekly(java.lang.Object, boolean):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.beachfront");
    }

    public final formularize wireman(TAnnotation tannotation) {
        beachfront beachfrontVarCompetently;
        formularize formularizeVarPolloi = polloi(tannotation);
        if (formularizeVarPolloi != null) {
            return formularizeVarPolloi;
        }
        Pair<TAnnotation, Set<AnnotationQualifierApplicabilityType>> pairGraveside = graveside(tannotation);
        if (pairGraveside == null) {
            return null;
        }
        TAnnotation tannotationComponent1 = pairGraveside.component1();
        Set<AnnotationQualifierApplicabilityType> setComponent2 = pairGraveside.component2();
        ReportLevel reportLevelMonoploid = monoploid(tannotation);
        if (reportLevelMonoploid == null) {
            reportLevelMonoploid = arytenoidectomy(tannotationComponent1);
        }
        if (reportLevelMonoploid.isIgnore() || (beachfrontVarCompetently = competently(tannotationComponent1, new Function1<TAnnotation, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver$extractDefaultQualifiers$nullabilityQualifier$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p002kotlin.jvm.functions.Function1
            public final Boolean invoke(TAnnotation extractNullability) {
                Intrinsics.checkNotNullParameter(extractNullability, "$this$extractNullability");
                return Boolean.FALSE;
            }
        })) == null) {
            return null;
        }
        return new formularize(beachfront.saneness(beachfrontVarCompetently, null, reportLevelMonoploid.isWarning(), 1, null), setComponent2, false, 4, null);
    }
}
