package p002kotlin.reflect.jvm.internal.impl.descriptors;

import byname.dern;
import byname.marial;
import discontentedly.saneness;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.resolve.beachfront;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.util.kowloon;

/* JADX INFO: compiled from: descriptorUtil.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class monoploid {
    public static final beachfront attabal(apical apicalVar) {
        Intrinsics.checkNotNullParameter(apicalVar, "<this>");
        apical apicalVarSaneness = apicalVar.saneness();
        if (apicalVarSaneness != null && !(apicalVar instanceof sealless)) {
            if (!saneness(apicalVarSaneness)) {
                return attabal(apicalVarSaneness);
            }
            if (apicalVarSaneness instanceof beachfront) {
                return (beachfront) apicalVarSaneness;
            }
        }
        return null;
    }

    public static final boolean dern(dovishness dovishnessVar) {
        merc mercVarImpassible;
        oilcan oilcanVarPreprohormone;
        oilcan returnType;
        Intrinsics.checkNotNullParameter(dovishnessVar, "<this>");
        apical apicalVarSaneness = dovishnessVar.saneness();
        wireman wiremanVar = apicalVarSaneness instanceof wireman ? (wireman) apicalVarSaneness : null;
        if (wiremanVar != null) {
            wireman wiremanVar2 = beachfront.competently(wiremanVar) ? wiremanVar : null;
            if (wiremanVar2 != null && (mercVarImpassible = wiremanVar2.impassible()) != null && (oilcanVarPreprohormone = TypeUtilsKt.preprohormone(mercVarImpassible)) != null && (returnType = dovishnessVar.getReturnType()) != null && Intrinsics.wireman(dovishnessVar.getName(), kowloon.f31881marial) && ((TypeUtilsKt.triweekly(returnType) || TypeUtilsKt.kowloon(returnType)) && dovishnessVar.beachfront().size() == 1)) {
                oilcan type = dovishnessVar.beachfront().get(0).getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                if (Intrinsics.wireman(TypeUtilsKt.preprohormone(type), oilcanVarPreprohormone) && dovishnessVar.gusty().isEmpty() && dovishnessVar.polder() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean saneness(apical apicalVar) {
        Intrinsics.checkNotNullParameter(apicalVar, "<this>");
        return apicalVar.saneness() instanceof sealless;
    }

    public static final wireman wireman(trm trmVar, dern fqName, saneness lookupLocation) {
        beachfront beachfrontVarMarial;
        MemberScope memberScopePrivatdozent;
        Intrinsics.checkNotNullParameter(trmVar, "<this>");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(lookupLocation, "lookupLocation");
        if (fqName.wireman()) {
            return null;
        }
        dern dernVarMarial = fqName.marial();
        Intrinsics.checkNotNullExpressionValue(dernVarMarial, "parent(...)");
        MemberScope memberScopeFormularize = trmVar.hydrovane(dernVarMarial).formularize();
        marial marialVarCompetently = fqName.competently();
        Intrinsics.checkNotNullExpressionValue(marialVarCompetently, "shortName(...)");
        beachfront beachfrontVarMarial2 = memberScopeFormularize.marial(marialVarCompetently, lookupLocation);
        wireman wiremanVar = beachfrontVarMarial2 instanceof wireman ? (wireman) beachfrontVarMarial2 : null;
        if (wiremanVar != null) {
            return wiremanVar;
        }
        dern dernVarMarial2 = fqName.marial();
        Intrinsics.checkNotNullExpressionValue(dernVarMarial2, "parent(...)");
        wireman wiremanVarWireman = wireman(trmVar, dernVarMarial2, lookupLocation);
        if (wiremanVarWireman == null || (memberScopePrivatdozent = wiremanVarWireman.privatdozent()) == null) {
            beachfrontVarMarial = null;
        } else {
            marial marialVarCompetently2 = fqName.competently();
            Intrinsics.checkNotNullExpressionValue(marialVarCompetently2, "shortName(...)");
            beachfrontVarMarial = memberScopePrivatdozent.marial(marialVarCompetently2, lookupLocation);
        }
        if (beachfrontVarMarial instanceof wireman) {
            return (wireman) beachfrontVarMarial;
        }
        return null;
    }
}
