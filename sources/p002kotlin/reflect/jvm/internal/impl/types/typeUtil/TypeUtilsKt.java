package p002kotlin.reflect.jvm.internal.impl.types.typeUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.IndexedValue;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.competently;
import p002kotlin.reflect.jvm.internal.impl.descriptors.overspeculate;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p002kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import p002kotlin.reflect.jvm.internal.impl.types.Variance;
import p002kotlin.reflect.jvm.internal.impl.types.coffeecake;
import p002kotlin.reflect.jvm.internal.impl.types.empress;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.nosophobia;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.permissivist;
import p002kotlin.reflect.jvm.internal.impl.types.preprohormone;
import p002kotlin.reflect.jvm.internal.impl.types.sayid;
import p002kotlin.reflect.jvm.internal.impl.types.starveling;
import p002kotlin.reflect.jvm.internal.impl.types.timberyard;
import p002kotlin.reflect.jvm.internal.impl.types.treadless;
import p002kotlin.reflect.jvm.internal.impl.types.triweekly;
import prescient.marial;

/* JADX INFO: compiled from: TypeUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class TypeUtilsKt {
    public static final boolean adultoid(oilcan type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return (type instanceof marial) && ((marial) type).basify().isUnresolved();
    }

    public static final boolean apical(clubfoot typeParameter) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        return impassible(typeParameter, null, null, 6, null);
    }

    public static final boolean arytenoidectomy(oilcan oilcanVar) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        if (oilcanVar instanceof p002kotlin.reflect.jvm.internal.impl.types.marial) {
            return true;
        }
        return (oilcanVar instanceof triweekly) && (((triweekly) oilcanVar).prefect() instanceof p002kotlin.reflect.jvm.internal.impl.types.marial);
    }

    public static final timberyard attabal(oilcan oilcanVar) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        return new treadless(oilcanVar);
    }

    public static final timberyard beachfront(oilcan type, Variance projectionKind, clubfoot clubfootVar) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(projectionKind, "projectionKind");
        if ((clubfootVar != null ? clubfootVar.cutely() : null) == projectionKind) {
            projectionKind = Variance.INVARIANT;
        }
        return new treadless(projectionKind, type);
    }

    public static final Set<clubfoot> competently(oilcan oilcanVar, Set<? extends clubfoot> set) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        impromptu(oilcanVar, oilcanVar, linkedHashSet, set);
        return linkedHashSet;
    }

    public static final boolean cord(oilcan oilcanVar) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        return saneness(oilcanVar, new Function1<empress, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt$requiresTypeAliasExpansion$1
            @Override // p002kotlin.jvm.functions.Function1
            public final Boolean invoke(empress it) {
                Intrinsics.checkNotNullParameter(it, "it");
                beachfront beachfrontVarWireman = it.setterwort().wireman();
                boolean z = false;
                if (beachfrontVarWireman != null && ((beachfrontVarWireman instanceof overspeculate) || (beachfrontVarWireman instanceof clubfoot))) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        });
    }

    public static final oilcan cutely(clubfoot clubfootVar) {
        Object obj;
        Intrinsics.checkNotNullParameter(clubfootVar, "<this>");
        List<oilcan> upperBounds = clubfootVar.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
        upperBounds.isEmpty();
        List<oilcan> upperBounds2 = clubfootVar.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds2, "getUpperBounds(...)");
        Iterator<T> it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            beachfront beachfrontVarWireman = ((oilcan) next).setterwort().wireman();
            wireman wiremanVar = beachfrontVarWireman instanceof wireman ? (wireman) beachfrontVarWireman : null;
            if (wiremanVar != null && wiremanVar.getKind() != ClassKind.INTERFACE && wiremanVar.getKind() != ClassKind.ANNOTATION_CLASS) {
                obj = next;
                break;
            }
        }
        oilcan oilcanVar = (oilcan) obj;
        if (oilcanVar != null) {
            return oilcanVar;
        }
        List<oilcan> upperBounds3 = clubfootVar.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds3, "getUpperBounds(...)");
        Object objLerp = CollectionsKt.lerp(upperBounds3);
        Intrinsics.checkNotNullExpressionValue(objLerp, "first(...)");
        return (oilcan) objLerp;
    }

    public static final boolean dern(oilcan oilcanVar, permissivist permissivistVar, Set<? extends clubfoot> set) {
        boolean zDern;
        if (Intrinsics.wireman(oilcanVar.setterwort(), permissivistVar)) {
            return true;
        }
        beachfront beachfrontVarWireman = oilcanVar.setterwort().wireman();
        competently competentlyVar = beachfrontVarWireman instanceof competently ? (competently) beachfrontVarWireman : null;
        List<clubfoot> listTriweekly = competentlyVar != null ? competentlyVar.triweekly() : null;
        Iterable<IndexedValue> iterableLicking = CollectionsKt.licking(oilcanVar.dhss());
        if ((iterableLicking instanceof Collection) && ((Collection) iterableLicking).isEmpty()) {
            return false;
        }
        for (IndexedValue indexedValue : iterableLicking) {
            int index = indexedValue.getIndex();
            timberyard timberyardVar = (timberyard) indexedValue.saneness();
            clubfoot clubfootVar = listTriweekly != null ? (clubfoot) CollectionsKt.lotta(listTriweekly, index) : null;
            if ((clubfootVar == null || set == null || !set.contains(clubfootVar)) && !timberyardVar.saneness()) {
                oilcan type = timberyardVar.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                zDern = dern(type, permissivistVar, set);
            } else {
                zDern = false;
            }
            if (zDern) {
                return true;
            }
        }
        return false;
    }

    public static final oilcan dovishness(oilcan oilcanVar) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        oilcan oilcanVarTriweekly = nosophobia.triweekly(oilcanVar);
        Intrinsics.checkNotNullExpressionValue(oilcanVarTriweekly, "makeNotNullable(...)");
        return oilcanVarTriweekly;
    }

    public static final boolean formularize(clubfoot typeParameter, permissivist permissivistVar, Set<? extends clubfoot> set) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        List<oilcan> upperBounds = typeParameter.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
        List<oilcan> list = upperBounds;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (oilcan oilcanVar : list) {
            Intrinsics.beachfront(oilcanVar);
            if (dern(oilcanVar, typeParameter.impassible().setterwort(), set) && (permissivistVar == null || Intrinsics.wireman(oilcanVar.setterwort(), permissivistVar))) {
                return true;
            }
        }
        return false;
    }

    public static final oilcan gintrap(oilcan oilcanVar) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        oilcan oilcanVarKowloon = nosophobia.kowloon(oilcanVar);
        Intrinsics.checkNotNullExpressionValue(oilcanVarKowloon, "makeNullable(...)");
        return oilcanVarKowloon;
    }

    public static final boolean graveside(oilcan oilcanVar) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        return nosophobia.impassible(oilcanVar);
    }

    public static /* synthetic */ boolean impassible(clubfoot clubfootVar, permissivist permissivistVar, Set set, int i, Object obj) {
        if ((i & 2) != 0) {
            permissivistVar = null;
        }
        if ((i & 4) != 0) {
            set = null;
        }
        return formularize(clubfootVar, permissivistVar, set);
    }

    public static final void impromptu(oilcan oilcanVar, oilcan oilcanVar2, Set<clubfoot> set, Set<? extends clubfoot> set2) {
        beachfront beachfrontVarWireman = oilcanVar.setterwort().wireman();
        if (beachfrontVarWireman instanceof clubfoot) {
            if (!Intrinsics.wireman(oilcanVar.setterwort(), oilcanVar2.setterwort())) {
                set.add(beachfrontVarWireman);
                return;
            }
            for (oilcan oilcanVar3 : ((clubfoot) beachfrontVarWireman).getUpperBounds()) {
                Intrinsics.beachfront(oilcanVar3);
                impromptu(oilcanVar3, oilcanVar2, set, set2);
            }
            return;
        }
        beachfront beachfrontVarWireman2 = oilcanVar.setterwort().wireman();
        competently competentlyVar = beachfrontVarWireman2 instanceof competently ? (competently) beachfrontVarWireman2 : null;
        List<clubfoot> listTriweekly = competentlyVar != null ? competentlyVar.triweekly() : null;
        int i = 0;
        for (timberyard timberyardVar : oilcanVar.dhss()) {
            int i2 = i + 1;
            clubfoot clubfootVar = listTriweekly != null ? (clubfoot) CollectionsKt.lotta(listTriweekly, i) : null;
            if ((clubfootVar == null || set2 == null || !set2.contains(clubfootVar)) && !timberyardVar.saneness() && !CollectionsKt.permissivist(set, timberyardVar.getType().setterwort().wireman()) && !Intrinsics.wireman(timberyardVar.getType().setterwort(), oilcanVar2.setterwort())) {
                oilcan type = timberyardVar.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                impromptu(type, oilcanVar2, set, set2);
            }
            i = i2;
        }
    }

    public static final boolean kowloon(oilcan oilcanVar) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        return p002kotlin.reflect.jvm.internal.impl.builtins.beachfront.czestochowa(oilcanVar);
    }

    public static final boolean marial(oilcan oilcanVar) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        return nosophobia.dern(oilcanVar, new Function1<empress, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt$containsTypeParameter$1
            @Override // p002kotlin.jvm.functions.Function1
            public final Boolean invoke(empress empressVar) {
                return Boolean.valueOf(nosophobia.impassible(empressVar));
            }
        });
    }

    public static final boolean molybdenite(beachfront beachfrontVar) {
        Intrinsics.checkNotNullParameter(beachfrontVar, "<this>");
        return (beachfrontVar instanceof clubfoot) && (((clubfoot) beachfrontVar).saneness() instanceof overspeculate);
    }

    public static final boolean monoploid(oilcan oilcanVar) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        if (oilcanVar instanceof starveling) {
            return true;
        }
        return (oilcanVar instanceof triweekly) && (((triweekly) oilcanVar).prefect() instanceof starveling);
    }

    public static final boolean polloi(oilcan oilcanVar, oilcan superType) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        Intrinsics.checkNotNullParameter(superType, "superType");
        return p002kotlin.reflect.jvm.internal.impl.types.checker.marial.f31734attabal.wireman(oilcanVar, superType);
    }

    public static final oilcan preprohormone(oilcan oilcanVar) {
        merc mercVar;
        empress empressVarBeachfront;
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        empress empressVarHomozygous = oilcanVar.homozygous();
        if (empressVarHomozygous instanceof preprohormone) {
            preprohormone preprohormoneVar = (preprohormone) empressVarHomozygous;
            merc mercVarSakeen = preprohormoneVar.sakeen();
            if (!mercVarSakeen.setterwort().getParameters().isEmpty() && mercVarSakeen.setterwort().wireman() != null) {
                List<clubfoot> parameters = mercVarSakeen.setterwort().getParameters();
                Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
                List<clubfoot> list = parameters;
                ArrayList arrayList = new ArrayList(dovishness.gintrap(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new StarProjectionImpl((clubfoot) it.next()));
                }
                mercVarSakeen = coffeecake.beachfront(mercVarSakeen, arrayList, null, 2, null);
            }
            merc mercVarImmediately = preprohormoneVar.immediately();
            if (!mercVarImmediately.setterwort().getParameters().isEmpty() && mercVarImmediately.setterwort().wireman() != null) {
                List<clubfoot> parameters2 = mercVarImmediately.setterwort().getParameters();
                Intrinsics.checkNotNullExpressionValue(parameters2, "getParameters(...)");
                List<clubfoot> list2 = parameters2;
                ArrayList arrayList2 = new ArrayList(dovishness.gintrap(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new StarProjectionImpl((clubfoot) it2.next()));
                }
                mercVarImmediately = coffeecake.beachfront(mercVarImmediately, arrayList2, null, 2, null);
            }
            empressVarBeachfront = KotlinTypeFactory.wireman(mercVarSakeen, mercVarImmediately);
        } else {
            if (!(empressVarHomozygous instanceof merc)) {
                throw new NoWhenBranchMatchedException();
            }
            mercVar = (merc) empressVarHomozygous;
            if (!mercVar.setterwort().getParameters().isEmpty() && mercVar.setterwort().wireman() != null) {
                empressVarBeachfront = mercVar;
                empressVarBeachfront = mercVar;
                List<clubfoot> parameters3 = mercVar.setterwort().getParameters();
                Intrinsics.checkNotNullExpressionValue(parameters3, "getParameters(...)");
                List<clubfoot> list3 = parameters3;
                ArrayList arrayList3 = new ArrayList(dovishness.gintrap(list3, 10));
                Iterator<T> it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new StarProjectionImpl((clubfoot) it3.next()));
                }
                empressVarBeachfront = coffeecake.beachfront(mercVar, arrayList3, null, 2, null);
            }
        }
        empressVarBeachfront = mercVar;
        empressVarBeachfront = mercVar;
        empressVarBeachfront = mercVar;
        return sayid.saneness(empressVarBeachfront, empressVarHomozygous);
    }

    public static final oilcan rotuma(oilcan oilcanVar, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial newAnnotations) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        Intrinsics.checkNotNullParameter(newAnnotations, "newAnnotations");
        return (oilcanVar.getAnnotations().isEmpty() && newAnnotations.isEmpty()) ? oilcanVar : oilcanVar.homozygous().deadwork(p002kotlin.reflect.jvm.internal.impl.types.clubfoot.attabal(oilcanVar.vesuvio(), newAnnotations));
    }

    public static final boolean saneness(oilcan oilcanVar, Function1<? super empress, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return nosophobia.dern(oilcanVar, predicate);
    }

    public static final p002kotlin.reflect.jvm.internal.impl.builtins.beachfront taiyuan(oilcan oilcanVar) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        p002kotlin.reflect.jvm.internal.impl.builtins.beachfront beachfrontVarApical = oilcanVar.setterwort().apical();
        Intrinsics.checkNotNullExpressionValue(beachfrontVarApical, "getBuiltIns(...)");
        return beachfrontVarApical;
    }

    public static final boolean triweekly(oilcan oilcanVar) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        return p002kotlin.reflect.jvm.internal.impl.builtins.beachfront.itchy(oilcanVar);
    }

    public static final boolean wireman(oilcan oilcanVar) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        return saneness(oilcanVar, new Function1<empress, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt$containsTypeAliasParameters$1
            @Override // p002kotlin.jvm.functions.Function1
            public final Boolean invoke(empress it) {
                Intrinsics.checkNotNullParameter(it, "it");
                beachfront beachfrontVarWireman = it.setterwort().wireman();
                return Boolean.valueOf(beachfrontVarWireman != null ? TypeUtilsKt.molybdenite(beachfrontVarWireman) : false);
            }
        });
    }
}
