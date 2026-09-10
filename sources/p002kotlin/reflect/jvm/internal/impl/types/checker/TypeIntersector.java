package p002kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import p002kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import p002kotlin.reflect.jvm.internal.impl.types.empress;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.overspeculate;
import p002kotlin.reflect.jvm.internal.impl.types.saran;
import p002kotlin.reflect.jvm.internal.impl.types.starveling;
import p002kotlin.reflect.jvm.internal.impl.types.stratoscope;
import p002kotlin.reflect.jvm.internal.impl.types.triweekly;
import pussyfooter.attabal;

/* JADX INFO: compiled from: IntersectionType.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class TypeIntersector {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final TypeIntersector f31713attabal = new TypeIntersector();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: IntersectionType.kt */
    public static final class ResultNullability {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public static final /* synthetic */ attabal f31714arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public static final /* synthetic */ ResultNullability[] f31715kowloon;
        public static final ResultNullability START = new START("START", 0);
        public static final ResultNullability ACCEPT_NULL = new ACCEPT_NULL("ACCEPT_NULL", 1);
        public static final ResultNullability UNKNOWN = new UNKNOWN("UNKNOWN", 2);
        public static final ResultNullability NOT_NULL = new NOT_NULL("NOT_NULL", 3);

        /* JADX INFO: compiled from: IntersectionType.kt */
        public static final class ACCEPT_NULL extends ResultNullability {
            public ACCEPT_NULL(String str, int i) {
                super(str, i, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability
            public ResultNullability combine(empress nextType) {
                Intrinsics.checkNotNullParameter(nextType, "nextType");
                return getResultNullability(nextType);
            }
        }

        /* JADX INFO: compiled from: IntersectionType.kt */
        public static final class NOT_NULL extends ResultNullability {
            public NOT_NULL(String str, int i) {
                super(str, i, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability
            public NOT_NULL combine(empress nextType) {
                Intrinsics.checkNotNullParameter(nextType, "nextType");
                return this;
            }
        }

        /* JADX INFO: compiled from: IntersectionType.kt */
        public static final class START extends ResultNullability {
            public START(String str, int i) {
                super(str, i, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability
            public ResultNullability combine(empress nextType) {
                Intrinsics.checkNotNullParameter(nextType, "nextType");
                return getResultNullability(nextType);
            }
        }

        /* JADX INFO: compiled from: IntersectionType.kt */
        public static final class UNKNOWN extends ResultNullability {
            public UNKNOWN(String str, int i) {
                super(str, i, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability
            public ResultNullability combine(empress nextType) {
                Intrinsics.checkNotNullParameter(nextType, "nextType");
                ResultNullability resultNullability = getResultNullability(nextType);
                return resultNullability == ResultNullability.ACCEPT_NULL ? this : resultNullability;
            }
        }

        static {
            ResultNullability[] resultNullabilityArrAttabal = attabal();
            f31715kowloon = resultNullabilityArrAttabal;
            f31714arytenoidectomy = p002kotlin.enums.attabal.attabal(resultNullabilityArrAttabal);
        }

        public /* synthetic */ ResultNullability(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static final /* synthetic */ ResultNullability[] attabal() {
            return new ResultNullability[]{START, ACCEPT_NULL, UNKNOWN, NOT_NULL};
        }

        public static ResultNullability valueOf(String str) {
            return (ResultNullability) Enum.valueOf(ResultNullability.class, str);
        }

        public static ResultNullability[] values() {
            return (ResultNullability[]) f31715kowloon.clone();
        }

        public abstract ResultNullability combine(empress empressVar);

        public final ResultNullability getResultNullability(empress empressVar) {
            Intrinsics.checkNotNullParameter(empressVar, "<this>");
            if (empressVar.mastfed()) {
                return ACCEPT_NULL;
            }
            if ((empressVar instanceof triweekly) && (((triweekly) empressVar).prefect() instanceof starveling)) {
                return NOT_NULL;
            }
            if (empressVar instanceof starveling) {
                return UNKNOWN;
            }
            return impassible.f31726attabal.attabal(empressVar) ? NOT_NULL : UNKNOWN;
        }

        public ResultNullability(String str, int i) {
            super(str, i);
        }
    }

    public final merc dern(List<? extends merc> types) {
        Intrinsics.checkNotNullParameter(types, "types");
        types.size();
        ArrayList<merc> arrayList = new ArrayList();
        for (merc mercVar : types) {
            if (mercVar.setterwort() instanceof IntersectionTypeConstructor) {
                Collection<oilcan> collectionCutely = mercVar.setterwort().cutely();
                Intrinsics.checkNotNullExpressionValue(collectionCutely, "getSupertypes(...)");
                Collection<oilcan> collection2 = collectionCutely;
                ArrayList arrayList2 = new ArrayList(dovishness.gintrap(collection2, 10));
                for (oilcan oilcanVar : collection2) {
                    Intrinsics.beachfront(oilcanVar);
                    merc mercVarWireman = stratoscope.wireman(oilcanVar);
                    if (mercVar.mastfed()) {
                        mercVarWireman = mercVarWireman.lampshade(true);
                    }
                    arrayList2.add(mercVarWireman);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(mercVar);
            }
        }
        ResultNullability resultNullabilityCombine = ResultNullability.START;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            resultNullabilityCombine = resultNullabilityCombine.combine((empress) it.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (merc mercVarTaiyuan : arrayList) {
            if (resultNullabilityCombine == ResultNullability.NOT_NULL) {
                if (mercVarTaiyuan instanceof impromptu) {
                    mercVarTaiyuan = saran.apical((impromptu) mercVarTaiyuan);
                }
                mercVarTaiyuan = saran.taiyuan(mercVarTaiyuan, false, 1, null);
            }
            linkedHashSet.add(mercVarTaiyuan);
        }
        List<? extends merc> list = types;
        ArrayList arrayList3 = new ArrayList(dovishness.gintrap(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((merc) it2.next()).vesuvio());
        }
        Iterator it3 = arrayList3.iterator();
        if (!it3.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it3.next();
        while (it3.hasNext()) {
            next = ((overspeculate) next).cutely((overspeculate) it3.next());
        }
        return wireman(linkedHashSet).deadwork((overspeculate) next);
    }

    public final boolean marial(oilcan oilcanVar, oilcan oilcanVar2) {
        apical apicalVarAttabal = cutely.f31723saneness.attabal();
        return apicalVarAttabal.wireman(oilcanVar, oilcanVar2) && !apicalVarAttabal.wireman(oilcanVar2, oilcanVar);
    }

    public final Collection<merc> saneness(Collection<? extends merc> collection2, Function2<? super merc, ? super merc, Boolean> function2) {
        ArrayList<merc> arrayList = new ArrayList(collection2);
        Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            merc mercVar = (merc) it.next();
            if (!arrayList.isEmpty()) {
                for (merc mercVar2 : arrayList) {
                    if (mercVar2 != mercVar) {
                        Intrinsics.beachfront(mercVar2);
                        Intrinsics.beachfront(mercVar);
                        if (function2.invoke(mercVar2, mercVar).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final merc wireman(final Set<? extends merc> set) {
        if (set.size() == 1) {
            return (merc) CollectionsKt.hardpan(set);
        }
        new Function0<String>() { // from class: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$intersectTypesWithoutIntersectionType$errorMessage$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final String invoke() {
                return "This collections cannot be empty! input types: " + CollectionsKt.preterite(set, null, null, null, 0, null, null, 63, null);
            }
        };
        Set<? extends merc> set2 = set;
        Collection<merc> collectionSaneness = saneness(set2, new TypeIntersector$intersectTypesWithoutIntersectionType$filteredEqualTypes$1(this));
        collectionSaneness.isEmpty();
        merc mercVarSaneness = IntegerLiteralTypeConstructor.f31315marial.saneness(collectionSaneness);
        if (mercVarSaneness != null) {
            return mercVarSaneness;
        }
        Collection<merc> collectionSaneness2 = saneness(collectionSaneness, new TypeIntersector$intersectTypesWithoutIntersectionType$filteredSuperAndEqualTypes$1(cutely.f31723saneness.attabal()));
        collectionSaneness2.isEmpty();
        return collectionSaneness2.size() < 2 ? (merc) CollectionsKt.hardpan(collectionSaneness2) : new IntersectionTypeConstructor(set2).competently();
    }
}
