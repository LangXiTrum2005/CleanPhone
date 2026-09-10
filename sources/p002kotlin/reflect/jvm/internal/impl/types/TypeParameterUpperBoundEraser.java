package p002kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Pair;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.polder;
import p002kotlin.collections.privatdozent;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import p002kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p002kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import patroclinal.formularize;
import patroclinal.taiyuan;
import prescient.competently;
import prescient.marial;
import yeast.beachfront;

/* JADX INFO: compiled from: TypeParameterUpperBoundEraser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class TypeParameterUpperBoundEraser {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final attabal f31688beachfront = new attabal(null);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final dovishness f31689attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final LockBasedStorageManager f31690dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final beachfront<saneness, oilcan> f31691marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final premeiotic f31692saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final taiyuan f31693wireman;

    /* JADX INFO: compiled from: TypeParameterUpperBoundEraser.kt */
    public static final class attabal {
        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0089  */
        /* JADX WARN: Code duplicated, block: B:24:0x0093  */
        /* JADX WARN: Code duplicated, block: B:29:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:48:0x0120  */
        /* JADX WARN: Code duplicated, block: B:52:0x012a  */
        /* JADX WARN: Code duplicated, block: B:57:0x0140  */
        /* JADX WARN: Code duplicated, block: B:79:0x01be  */
        /* JADX WARN: Code duplicated, block: B:83:0x01c8  */
        /* JADX WARN: Code duplicated, block: B:88:0x01de  */
        public final oilcan attabal(oilcan oilcanVar, TypeSubstitutor substitutor, Set<? extends clubfoot> set, boolean z) {
            empress empressVarBeachfront;
            boolean z2;
            oilcan type;
            boolean z3;
            oilcan type2;
            boolean z4;
            oilcan type3;
            Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
            Intrinsics.checkNotNullParameter(substitutor, "substitutor");
            empress empressVarHomozygous = oilcanVar.homozygous();
            if (empressVarHomozygous instanceof preprohormone) {
                preprohormone preprohormoneVar = (preprohormone) empressVarHomozygous;
                merc mercVarSakeen = preprohormoneVar.sakeen();
                if (!mercVarSakeen.setterwort().getParameters().isEmpty() && mercVarSakeen.setterwort().wireman() != null) {
                    List<clubfoot> parameters = mercVarSakeen.setterwort().getParameters();
                    Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
                    List<clubfoot> list = parameters;
                    ArrayList arrayList = new ArrayList(dovishness.gintrap(list, 10));
                    for (clubfoot clubfootVar : list) {
                        timberyard starProjectionImpl = (timberyard) CollectionsKt.lotta(oilcanVar.dhss(), clubfootVar.getIndex());
                        if (!z || starProjectionImpl == null || (type3 = starProjectionImpl.getType()) == null) {
                            if (set == null && set.contains(clubfootVar)) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (starProjectionImpl != null || z4) {
                                starProjectionImpl = new StarProjectionImpl(clubfootVar);
                            } else {
                                itchy itchyVarCutely = substitutor.cutely();
                                oilcan type4 = starProjectionImpl.getType();
                                Intrinsics.checkNotNullExpressionValue(type4, "getType(...)");
                                if (itchyVarCutely.marial(type4) == null) {
                                    starProjectionImpl = new StarProjectionImpl(clubfootVar);
                                }
                            }
                        } else {
                            Intrinsics.beachfront(type3);
                            if (TypeUtilsKt.marial(type3)) {
                                if (set == null) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (starProjectionImpl != null) {
                                    starProjectionImpl = new StarProjectionImpl(clubfootVar);
                                } else {
                                    starProjectionImpl = new StarProjectionImpl(clubfootVar);
                                }
                            }
                        }
                        arrayList.add(starProjectionImpl);
                    }
                    mercVarSakeen = coffeecake.beachfront(mercVarSakeen, arrayList, null, 2, null);
                }
                merc mercVarImmediately = preprohormoneVar.immediately();
                if (!mercVarImmediately.setterwort().getParameters().isEmpty() && mercVarImmediately.setterwort().wireman() != null) {
                    List<clubfoot> parameters2 = mercVarImmediately.setterwort().getParameters();
                    Intrinsics.checkNotNullExpressionValue(parameters2, "getParameters(...)");
                    List<clubfoot> list2 = parameters2;
                    ArrayList arrayList2 = new ArrayList(dovishness.gintrap(list2, 10));
                    for (clubfoot clubfootVar2 : list2) {
                        timberyard starProjectionImpl2 = (timberyard) CollectionsKt.lotta(oilcanVar.dhss(), clubfootVar2.getIndex());
                        if (!z || starProjectionImpl2 == null || (type2 = starProjectionImpl2.getType()) == null) {
                            if (set == null && set.contains(clubfootVar2)) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (starProjectionImpl2 != null || z3) {
                                starProjectionImpl2 = new StarProjectionImpl(clubfootVar2);
                            } else {
                                itchy itchyVarCutely2 = substitutor.cutely();
                                oilcan type5 = starProjectionImpl2.getType();
                                Intrinsics.checkNotNullExpressionValue(type5, "getType(...)");
                                if (itchyVarCutely2.marial(type5) == null) {
                                    starProjectionImpl2 = new StarProjectionImpl(clubfootVar2);
                                }
                            }
                        } else {
                            Intrinsics.beachfront(type2);
                            if (TypeUtilsKt.marial(type2)) {
                                if (set == null) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                }
                                if (starProjectionImpl2 != null) {
                                    starProjectionImpl2 = new StarProjectionImpl(clubfootVar2);
                                } else {
                                    starProjectionImpl2 = new StarProjectionImpl(clubfootVar2);
                                }
                            }
                        }
                        arrayList2.add(starProjectionImpl2);
                    }
                    mercVarImmediately = coffeecake.beachfront(mercVarImmediately, arrayList2, null, 2, null);
                }
                empressVarBeachfront = KotlinTypeFactory.wireman(mercVarSakeen, mercVarImmediately);
            } else {
                if (!(empressVarHomozygous instanceof merc)) {
                    throw new NoWhenBranchMatchedException();
                }
                merc mercVar = (merc) empressVarHomozygous;
                if (mercVar.setterwort().getParameters().isEmpty() || mercVar.setterwort().wireman() == null) {
                    empressVarBeachfront = mercVar;
                } else {
                    List<clubfoot> parameters3 = mercVar.setterwort().getParameters();
                    Intrinsics.checkNotNullExpressionValue(parameters3, "getParameters(...)");
                    List<clubfoot> list3 = parameters3;
                    ArrayList arrayList3 = new ArrayList(dovishness.gintrap(list3, 10));
                    for (clubfoot clubfootVar3 : list3) {
                        timberyard starProjectionImpl3 = (timberyard) CollectionsKt.lotta(oilcanVar.dhss(), clubfootVar3.getIndex());
                        if (!z || starProjectionImpl3 == null || (type = starProjectionImpl3.getType()) == null) {
                            if (set == null && set.contains(clubfootVar3)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (starProjectionImpl3 != null || z2) {
                                starProjectionImpl3 = new StarProjectionImpl(clubfootVar3);
                            } else {
                                itchy itchyVarCutely3 = substitutor.cutely();
                                oilcan type6 = starProjectionImpl3.getType();
                                Intrinsics.checkNotNullExpressionValue(type6, "getType(...)");
                                if (itchyVarCutely3.marial(type6) == null) {
                                    starProjectionImpl3 = new StarProjectionImpl(clubfootVar3);
                                }
                            }
                        } else {
                            Intrinsics.beachfront(type);
                            if (TypeUtilsKt.marial(type)) {
                                if (set == null) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                if (starProjectionImpl3 != null) {
                                    starProjectionImpl3 = new StarProjectionImpl(clubfootVar3);
                                } else {
                                    starProjectionImpl3 = new StarProjectionImpl(clubfootVar3);
                                }
                            }
                        }
                        arrayList3.add(starProjectionImpl3);
                    }
                    empressVarBeachfront = coffeecake.beachfront(mercVar, arrayList3, null, 2, null);
                }
            }
            oilcan oilcanVarTriweekly = substitutor.triweekly(sayid.saneness(empressVarBeachfront, empressVarHomozygous), Variance.OUT_VARIANCE);
            Intrinsics.checkNotNullExpressionValue(oilcanVarTriweekly, "safeSubstitute(...)");
            return oilcanVarTriweekly;
        }

        public attabal() {
        }
    }

    /* JADX INFO: compiled from: TypeParameterUpperBoundEraser.kt */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final clubfoot f31694attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final gintrap f31695saneness;

        public saneness(clubfoot typeParameter, gintrap typeAttr) {
            Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
            Intrinsics.checkNotNullParameter(typeAttr, "typeAttr");
            this.f31694attabal = typeParameter;
            this.f31695saneness = typeAttr;
        }

        public final gintrap attabal() {
            return this.f31695saneness;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof saneness)) {
                return false;
            }
            saneness sanenessVar = (saneness) obj;
            return Intrinsics.wireman(sanenessVar.f31694attabal, this.f31694attabal) && Intrinsics.wireman(sanenessVar.f31695saneness, this.f31695saneness);
        }

        public int hashCode() {
            int iHashCode = this.f31694attabal.hashCode();
            return iHashCode + (iHashCode * 31) + this.f31695saneness.hashCode();
        }

        public final clubfoot saneness() {
            return this.f31694attabal;
        }

        public String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.f31694attabal + ", typeAttr=" + this.f31695saneness + ')';
        }
    }

    public TypeParameterUpperBoundEraser(dovishness projectionComputer, premeiotic options) {
        Intrinsics.checkNotNullParameter(projectionComputer, "projectionComputer");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f31689attabal = projectionComputer;
        this.f31692saneness = options;
        LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("Type parameter upper bound erasure results");
        this.f31690dern = lockBasedStorageManager;
        this.f31693wireman = p002kotlin.saneness.saneness(new Function0<marial>() { // from class: kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser$erroneousErasedBound$2
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final marial invoke() {
                return competently.wireman(ErrorTypeKind.CANNOT_COMPUTE_ERASED_BOUND, this.this$0.toString());
            }
        });
        beachfront<saneness, oilcan> beachfrontVarTaiyuan = lockBasedStorageManager.taiyuan(new Function1<saneness, oilcan>() { // from class: kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser$getErasedUpperBound$1
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public final oilcan invoke(TypeParameterUpperBoundEraser.saneness sanenessVar) {
                return this.this$0.wireman(sanenessVar.saneness(), sanenessVar.attabal());
            }
        });
        Intrinsics.checkNotNullExpressionValue(beachfrontVarTaiyuan, "createMemoizedFunction(...)");
        this.f31691marial = beachfrontVarTaiyuan;
    }

    public final Set<oilcan> beachfront(TypeSubstitutor typeSubstitutor, List<? extends oilcan> list, gintrap gintrapVar) {
        Set setSaneness = privatdozent.saneness();
        for (oilcan oilcanVar : list) {
            p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarWireman = oilcanVar.setterwort().wireman();
            if (beachfrontVarWireman instanceof wireman) {
                setSaneness.add(f31688beachfront.attabal(oilcanVar, typeSubstitutor, gintrapVar.dern(), this.f31692saneness.saneness()));
            } else if (beachfrontVarWireman instanceof clubfoot) {
                Set<clubfoot> setDern = gintrapVar.dern();
                if (setDern == null || !setDern.contains(beachfrontVarWireman)) {
                    List<oilcan> upperBounds = ((clubfoot) beachfrontVarWireman).getUpperBounds();
                    Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
                    setSaneness.addAll(beachfront(typeSubstitutor, upperBounds, gintrapVar));
                } else {
                    setSaneness.add(saneness(gintrapVar));
                }
            }
            if (!this.f31692saneness.attabal()) {
                break;
            }
        }
        return privatdozent.attabal(setSaneness);
    }

    public final oilcan dern(clubfoot typeParameter, gintrap typeAttr) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        Intrinsics.checkNotNullParameter(typeAttr, "typeAttr");
        oilcan oilcanVarInvoke = this.f31691marial.invoke(new saneness(typeParameter, typeAttr));
        Intrinsics.checkNotNullExpressionValue(oilcanVarInvoke, "invoke(...)");
        return oilcanVarInvoke;
    }

    public final marial marial() {
        return (marial) this.f31693wireman.getValue();
    }

    public final oilcan saneness(gintrap gintrapVar) {
        oilcan oilcanVarPreprohormone;
        merc mercVarAttabal = gintrapVar.attabal();
        return (mercVarAttabal == null || (oilcanVarPreprohormone = TypeUtilsKt.preprohormone(mercVarAttabal)) == null) ? marial() : oilcanVarPreprohormone;
    }

    public final oilcan wireman(clubfoot clubfootVar, gintrap gintrapVar) {
        timberyard timberyardVarAttabal;
        Set<clubfoot> setDern = gintrapVar.dern();
        if (setDern != null && setDern.contains(clubfootVar.attabal())) {
            return saneness(gintrapVar);
        }
        merc mercVarImpassible = clubfootVar.impassible();
        Intrinsics.checkNotNullExpressionValue(mercVarImpassible, "getDefaultType(...)");
        Set<clubfoot> setCompetently = TypeUtilsKt.competently(mercVarImpassible, setDern);
        LinkedHashMap linkedHashMap = new LinkedHashMap(p002kotlin.ranges.wireman.wireman(polder.marial(dovishness.gintrap(setCompetently, 10)), 16));
        for (clubfoot clubfootVar2 : setCompetently) {
            if (setDern == null || !setDern.contains(clubfootVar2)) {
                timberyardVarAttabal = this.f31689attabal.attabal(clubfootVar2, gintrapVar, this, dern(clubfootVar2, gintrapVar.wireman(clubfootVar)));
            } else {
                timberyardVarAttabal = nosophobia.graveside(clubfootVar2, gintrapVar);
                Intrinsics.checkNotNullExpressionValue(timberyardVarAttabal, "makeStarProjection(...)");
            }
            Pair pairAttabal = formularize.attabal(clubfootVar2.impromptu(), timberyardVarAttabal);
            linkedHashMap.put(pairAttabal.getFirst(), pairAttabal.getSecond());
        }
        TypeSubstitutor typeSubstitutorCompetently = TypeSubstitutor.competently(cultivated.attabal.marial(cultivated.f31745dern, linkedHashMap, false, 2, null));
        Intrinsics.checkNotNullExpressionValue(typeSubstitutorCompetently, "create(...)");
        List<oilcan> upperBounds = clubfootVar.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
        Set<oilcan> setBeachfront = beachfront(typeSubstitutorCompetently, upperBounds, gintrapVar);
        if (setBeachfront.isEmpty()) {
            return saneness(gintrapVar);
        }
        if (!this.f31692saneness.attabal()) {
            if (setBeachfront.size() == 1) {
                return (oilcan) CollectionsKt.hardpan(setBeachfront);
            }
            throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds");
        }
        List listMolet = CollectionsKt.molet(setBeachfront);
        ArrayList arrayList = new ArrayList(dovishness.gintrap(listMolet, 10));
        Iterator it = listMolet.iterator();
        while (it.hasNext()) {
            arrayList.add(((oilcan) it.next()).homozygous());
        }
        return p002kotlin.reflect.jvm.internal.impl.types.checker.wireman.attabal(arrayList);
    }

    public /* synthetic */ TypeParameterUpperBoundEraser(dovishness dovishnessVar, premeiotic premeioticVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dovishnessVar, (i & 2) != 0 ? new premeiotic(false, false) : premeioticVar);
    }
}
