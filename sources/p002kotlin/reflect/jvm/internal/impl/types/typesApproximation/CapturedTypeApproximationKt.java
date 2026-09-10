package p002kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Pair;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p002kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import p002kotlin.reflect.jvm.internal.impl.types.Variance;
import p002kotlin.reflect.jvm.internal.impl.types.coffeecake;
import p002kotlin.reflect.jvm.internal.impl.types.cultivated;
import p002kotlin.reflect.jvm.internal.impl.types.empress;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.nosophobia;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.permissivist;
import p002kotlin.reflect.jvm.internal.impl.types.sayid;
import p002kotlin.reflect.jvm.internal.impl.types.stratoscope;
import p002kotlin.reflect.jvm.internal.impl.types.timberyard;
import p002kotlin.reflect.jvm.internal.impl.types.treadless;
import p002kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: compiled from: CapturedTypeApproximation.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class CapturedTypeApproximationKt {

    /* JADX INFO: compiled from: CapturedTypeApproximation.kt */
    public /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f31821attabal;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f31821attabal = iArr;
        }
    }

    /* JADX INFO: compiled from: CapturedTypeApproximation.kt */
    public static final class saneness extends cultivated {
        @Override // p002kotlin.reflect.jvm.internal.impl.types.cultivated
        public timberyard apical(permissivist key) {
            Intrinsics.checkNotNullParameter(key, "key");
            p002kotlin.reflect.jvm.internal.impl.resolve.calls.inference.saneness sanenessVar = key instanceof p002kotlin.reflect.jvm.internal.impl.resolve.calls.inference.saneness ? (p002kotlin.reflect.jvm.internal.impl.resolve.calls.inference.saneness) key : null;
            if (sanenessVar == null) {
                return null;
            }
            return sanenessVar.dern().saneness() ? new treadless(Variance.OUT_VARIANCE, sanenessVar.dern().getType()) : sanenessVar.dern();
        }
    }

    public static final extinctive.attabal<oilcan> attabal(oilcan type) {
        Object objMarial;
        Intrinsics.checkNotNullParameter(type, "type");
        if (stratoscope.saneness(type)) {
            extinctive.attabal<oilcan> attabalVarAttabal = attabal(stratoscope.dern(type));
            extinctive.attabal<oilcan> attabalVarAttabal2 = attabal(stratoscope.wireman(type));
            return new extinctive.attabal<>(sayid.saneness(KotlinTypeFactory.wireman(stratoscope.dern(attabalVarAttabal.dern()), stratoscope.wireman(attabalVarAttabal2.dern())), type), sayid.saneness(KotlinTypeFactory.wireman(stratoscope.dern(attabalVarAttabal.wireman()), stratoscope.wireman(attabalVarAttabal2.wireman())), type));
        }
        permissivist permissivistVar = type.setterwort();
        if (CapturedTypeConstructorKt.wireman(type)) {
            Intrinsics.competently(permissivistVar, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            timberyard timberyardVarDern = ((p002kotlin.reflect.jvm.internal.impl.resolve.calls.inference.saneness) permissivistVar).dern();
            oilcan type2 = timberyardVarDern.getType();
            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            oilcan oilcanVarSaneness = saneness(type2, type);
            int i = attabal.f31821attabal[timberyardVarDern.dern().ordinal()];
            if (i == 2) {
                merc mercVarRestrictive = TypeUtilsKt.taiyuan(type).restrictive();
                Intrinsics.checkNotNullExpressionValue(mercVarRestrictive, "getNullableAnyType(...)");
                return new extinctive.attabal<>(oilcanVarSaneness, mercVarRestrictive);
            }
            if (i == 3) {
                merc mercVarSupplicat = TypeUtilsKt.taiyuan(type).supplicat();
                Intrinsics.checkNotNullExpressionValue(mercVarSupplicat, "getNothingType(...)");
                return new extinctive.attabal<>(saneness(mercVarSupplicat, type), oilcanVarSaneness);
            }
            throw new AssertionError("Only nontrivial projections should have been captured, not: " + timberyardVarDern);
        }
        if (type.dhss().isEmpty() || type.dhss().size() != permissivistVar.getParameters().size()) {
            return new extinctive.attabal<>(type, type);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<timberyard> listDhss = type.dhss();
        List<clubfoot> parameters = permissivistVar.getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        for (Pair pair : CollectionsKt.fastrack(listDhss, parameters)) {
            timberyard timberyardVar = (timberyard) pair.component1();
            clubfoot clubfootVar = (clubfoot) pair.component2();
            Intrinsics.beachfront(clubfootVar);
            extinctive.saneness sanenessVarCompetently = competently(timberyardVar, clubfootVar);
            if (timberyardVar.saneness()) {
                arrayList.add(sanenessVarCompetently);
                arrayList2.add(sanenessVarCompetently);
            } else {
                extinctive.attabal<extinctive.saneness> attabalVarWireman = wireman(sanenessVarCompetently);
                extinctive.saneness sanenessVarAttabal = attabalVarWireman.attabal();
                extinctive.saneness sanenessVarSaneness = attabalVarWireman.saneness();
                arrayList.add(sanenessVarAttabal);
                arrayList2.add(sanenessVarSaneness);
            }
        }
        boolean z = false;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((extinctive.saneness) it.next()).wireman()) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            objMarial = TypeUtilsKt.taiyuan(type).supplicat();
            Intrinsics.checkNotNullExpressionValue(objMarial, "getNothingType(...)");
        } else {
            objMarial = marial(type, arrayList);
        }
        return new extinctive.attabal<>(objMarial, marial(type, arrayList2));
    }

    public static final timberyard beachfront(timberyard timberyardVar) {
        TypeSubstitutor typeSubstitutorCompetently = TypeSubstitutor.competently(new saneness());
        Intrinsics.checkNotNullExpressionValue(typeSubstitutorCompetently, "create(...)");
        return typeSubstitutorCompetently.graveside(timberyardVar);
    }

    public static final extinctive.saneness competently(timberyard timberyardVar, clubfoot clubfootVar) {
        int i = attabal.f31821attabal[TypeSubstitutor.dern(clubfootVar.cutely(), timberyardVar).ordinal()];
        if (i == 1) {
            oilcan type = timberyardVar.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            oilcan type2 = timberyardVar.getType();
            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            return new extinctive.saneness(clubfootVar, type, type2);
        }
        if (i == 2) {
            oilcan type3 = timberyardVar.getType();
            Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
            merc mercVarRestrictive = DescriptorUtilsKt.cutely(clubfootVar).restrictive();
            Intrinsics.checkNotNullExpressionValue(mercVarRestrictive, "getNullableAnyType(...)");
            return new extinctive.saneness(clubfootVar, type3, mercVarRestrictive);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        merc mercVarSupplicat = DescriptorUtilsKt.cutely(clubfootVar).supplicat();
        Intrinsics.checkNotNullExpressionValue(mercVarSupplicat, "getNothingType(...)");
        oilcan type4 = timberyardVar.getType();
        Intrinsics.checkNotNullExpressionValue(type4, "getType(...)");
        return new extinctive.saneness(clubfootVar, mercVarSupplicat, type4);
    }

    public static final timberyard dern(timberyard timberyardVar, boolean z) {
        if (timberyardVar == null) {
            return null;
        }
        if (!timberyardVar.saneness()) {
            oilcan type = timberyardVar.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            if (nosophobia.dern(type, new Function1<empress, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt$approximateCapturedTypesIfNecessary$1
                @Override // p002kotlin.jvm.functions.Function1
                public final Boolean invoke(empress empressVar) {
                    Intrinsics.beachfront(empressVar);
                    return Boolean.valueOf(CapturedTypeConstructorKt.wireman(empressVar));
                }
            })) {
                Variance varianceDern = timberyardVar.dern();
                Intrinsics.checkNotNullExpressionValue(varianceDern, "getProjectionKind(...)");
                if (varianceDern == Variance.OUT_VARIANCE) {
                    return new treadless(varianceDern, attabal(type).wireman());
                }
                return z ? new treadless(varianceDern, attabal(type).dern()) : beachfront(timberyardVar);
            }
        }
        return timberyardVar;
    }

    public static final timberyard impromptu(extinctive.saneness sanenessVar) {
        sanenessVar.wireman();
        if (!Intrinsics.wireman(sanenessVar.attabal(), sanenessVar.saneness())) {
            Variance varianceCutely = sanenessVar.dern().cutely();
            Variance variance = Variance.IN_VARIANCE;
            if (varianceCutely != variance) {
                if (!beachfront.czestochowa(sanenessVar.attabal()) || sanenessVar.dern().cutely() == variance) {
                    return beachfront.underbelly(sanenessVar.saneness()) ? new treadless(taiyuan(sanenessVar, variance), sanenessVar.attabal()) : new treadless(taiyuan(sanenessVar, Variance.OUT_VARIANCE), sanenessVar.saneness());
                }
                return new treadless(taiyuan(sanenessVar, Variance.OUT_VARIANCE), sanenessVar.saneness());
            }
        }
        return new treadless(sanenessVar.attabal());
    }

    public static final oilcan marial(oilcan oilcanVar, List<extinctive.saneness> list) {
        oilcanVar.dhss().size();
        list.size();
        List<extinctive.saneness> list2 = list;
        ArrayList arrayList = new ArrayList(dovishness.gintrap(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(impromptu((extinctive.saneness) it.next()));
        }
        return coffeecake.marial(oilcanVar, arrayList, null, null, 6, null);
    }

    public static final oilcan saneness(oilcan oilcanVar, oilcan oilcanVar2) {
        oilcan oilcanVarMonoploid = nosophobia.monoploid(oilcanVar, oilcanVar2.mastfed());
        Intrinsics.checkNotNullExpressionValue(oilcanVarMonoploid, "makeNullableIfNeeded(...)");
        return oilcanVarMonoploid;
    }

    public static final Variance taiyuan(extinctive.saneness sanenessVar, Variance variance) {
        return variance == sanenessVar.dern().cutely() ? Variance.INVARIANT : variance;
    }

    public static final extinctive.attabal<extinctive.saneness> wireman(extinctive.saneness sanenessVar) {
        extinctive.attabal<oilcan> attabalVarAttabal = attabal(sanenessVar.attabal());
        oilcan oilcanVarAttabal = attabalVarAttabal.attabal();
        oilcan oilcanVarSaneness = attabalVarAttabal.saneness();
        extinctive.attabal<oilcan> attabalVarAttabal2 = attabal(sanenessVar.saneness());
        return new extinctive.attabal<>(new extinctive.saneness(sanenessVar.dern(), oilcanVarSaneness, attabalVarAttabal2.attabal()), new extinctive.saneness(sanenessVar.dern(), oilcanVarAttabal, attabalVarAttabal2.saneness()));
    }
}
