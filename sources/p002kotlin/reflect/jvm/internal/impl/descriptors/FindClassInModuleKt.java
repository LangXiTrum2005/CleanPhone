package p002kotlin.reflect.jvm.internal.impl.descriptors;

import byname.dern;
import byname.marial;
import byname.saneness;
import java.util.List;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import p002kotlin.reflect.jvm.internal.impl.resolve.formularize;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p002kotlin.sequences.SequencesKt___SequencesKt;
import p002kotlin.sequences.arytenoidectomy;

/* JADX INFO: compiled from: findClassInModule.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class FindClassInModuleKt {
    public static final wireman attabal(trm trmVar, saneness classId) {
        Intrinsics.checkNotNullParameter(trmVar, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        beachfront beachfrontVarSaneness = saneness(trmVar, classId);
        if (beachfrontVarSaneness instanceof wireman) {
            return (wireman) beachfrontVarSaneness;
        }
        return null;
    }

    public static final wireman dern(trm trmVar, saneness classId, NotFoundClasses notFoundClasses) {
        Intrinsics.checkNotNullParameter(trmVar, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        wireman wiremanVarAttabal = attabal(trmVar, classId);
        return wiremanVarAttabal != null ? wiremanVarAttabal : notFoundClasses.wireman(classId, SequencesKt___SequencesKt.hydrovane(SequencesKt___SequencesKt.restrictive(arytenoidectomy.triweekly(classId, FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1.INSTANCE), new Function1<saneness, Integer>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$2
            @Override // p002kotlin.jvm.functions.Function1
            public final Integer invoke(saneness it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return 0;
            }
        })));
    }

    public static final beachfront saneness(trm trmVar, saneness classId) {
        Intrinsics.checkNotNullParameter(trmVar, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        trm trmVarAttabal = formularize.attabal(trmVar);
        if (trmVarAttabal == null) {
            dern dernVarImpromptu = classId.impromptu();
            Intrinsics.checkNotNullExpressionValue(dernVarImpromptu, "getPackageFqName(...)");
            merc mercVarHydrovane = trmVar.hydrovane(dernVarImpromptu);
            List<marial> listBeachfront = classId.taiyuan().beachfront();
            Intrinsics.checkNotNullExpressionValue(listBeachfront, "pathSegments(...)");
            MemberScope memberScopeFormularize = mercVarHydrovane.formularize();
            Object objLerp = CollectionsKt.lerp(listBeachfront);
            Intrinsics.checkNotNullExpressionValue(objLerp, "first(...)");
            beachfront beachfrontVarMarial = memberScopeFormularize.marial((marial) objLerp, NoLookupLocation.FROM_DESERIALIZATION);
            if (beachfrontVarMarial == null) {
                return null;
            }
            for (marial marialVar : listBeachfront.subList(1, listBeachfront.size())) {
                if (!(beachfrontVarMarial instanceof wireman)) {
                    return null;
                }
                MemberScope memberScopePrivatdozent = ((wireman) beachfrontVarMarial).privatdozent();
                Intrinsics.beachfront(marialVar);
                beachfront beachfrontVarMarial2 = memberScopePrivatdozent.marial(marialVar, NoLookupLocation.FROM_DESERIALIZATION);
                beachfrontVarMarial = beachfrontVarMarial2 instanceof wireman ? (wireman) beachfrontVarMarial2 : null;
                if (beachfrontVarMarial == null) {
                    return null;
                }
            }
            return beachfrontVarMarial;
        }
        dern dernVarImpromptu2 = classId.impromptu();
        Intrinsics.checkNotNullExpressionValue(dernVarImpromptu2, "getPackageFqName(...)");
        merc mercVarHydrovane2 = trmVarAttabal.hydrovane(dernVarImpromptu2);
        List<marial> listBeachfront2 = classId.taiyuan().beachfront();
        Intrinsics.checkNotNullExpressionValue(listBeachfront2, "pathSegments(...)");
        MemberScope memberScopeFormularize2 = mercVarHydrovane2.formularize();
        Object objLerp2 = CollectionsKt.lerp(listBeachfront2);
        Intrinsics.checkNotNullExpressionValue(objLerp2, "first(...)");
        beachfront beachfrontVarMarial3 = memberScopeFormularize2.marial((marial) objLerp2, NoLookupLocation.FROM_DESERIALIZATION);
        if (beachfrontVarMarial3 == null) {
            beachfrontVarMarial3 = null;
            break;
        }
        for (marial marialVar2 : listBeachfront2.subList(1, listBeachfront2.size())) {
            if (beachfrontVarMarial3 instanceof wireman) {
                MemberScope memberScopePrivatdozent2 = ((wireman) beachfrontVarMarial3).privatdozent();
                Intrinsics.beachfront(marialVar2);
                beachfront beachfrontVarMarial4 = memberScopePrivatdozent2.marial(marialVar2, NoLookupLocation.FROM_DESERIALIZATION);
                beachfrontVarMarial3 = beachfrontVarMarial4 instanceof wireman ? (wireman) beachfrontVarMarial4 : null;
                if (beachfrontVarMarial3 != null) {
                }
            }
            beachfrontVarMarial3 = null;
        }
        if (beachfrontVarMarial3 != null) {
            return beachfrontVarMarial3;
        }
        dern dernVarImpromptu3 = classId.impromptu();
        Intrinsics.checkNotNullExpressionValue(dernVarImpromptu3, "getPackageFqName(...)");
        merc mercVarHydrovane3 = trmVar.hydrovane(dernVarImpromptu3);
        List<marial> listBeachfront3 = classId.taiyuan().beachfront();
        Intrinsics.checkNotNullExpressionValue(listBeachfront3, "pathSegments(...)");
        MemberScope memberScopeFormularize3 = mercVarHydrovane3.formularize();
        Object objLerp3 = CollectionsKt.lerp(listBeachfront3);
        Intrinsics.checkNotNullExpressionValue(objLerp3, "first(...)");
        beachfront beachfrontVarMarial5 = memberScopeFormularize3.marial((marial) objLerp3, NoLookupLocation.FROM_DESERIALIZATION);
        if (beachfrontVarMarial5 == null) {
            return null;
        }
        for (marial marialVar3 : listBeachfront3.subList(1, listBeachfront3.size())) {
            if (!(beachfrontVarMarial5 instanceof wireman)) {
                return null;
            }
            MemberScope memberScopePrivatdozent3 = ((wireman) beachfrontVarMarial5).privatdozent();
            Intrinsics.beachfront(marialVar3);
            beachfront beachfrontVarMarial6 = memberScopePrivatdozent3.marial(marialVar3, NoLookupLocation.FROM_DESERIALIZATION);
            beachfrontVarMarial5 = beachfrontVarMarial6 instanceof wireman ? (wireman) beachfrontVarMarial6 : null;
            if (beachfrontVarMarial5 == null) {
                return null;
            }
        }
        return beachfrontVarMarial5;
    }

    public static final overspeculate wireman(trm trmVar, saneness classId) {
        Intrinsics.checkNotNullParameter(trmVar, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        beachfront beachfrontVarSaneness = saneness(trmVar, classId);
        if (beachfrontVarSaneness instanceof overspeculate) {
            return (overspeculate) beachfrontVarSaneness;
        }
        return null;
    }
}
