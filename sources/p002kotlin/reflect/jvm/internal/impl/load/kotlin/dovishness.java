package p002kotlin.reflect.jvm.internal.impl.load.kotlin;

import byname.saneness;
import java.util.Iterator;
import java.util.List;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.competently;
import p002kotlin.reflect.jvm.internal.impl.builtins.jvm.dern;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.attabal;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cutely;
import p002kotlin.reflect.jvm.internal.impl.descriptors.hydrovane;
import p002kotlin.reflect.jvm.internal.impl.descriptors.starveling;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature;
import p002kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import p002kotlin.reflect.jvm.internal.impl.resolve.marial;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;

/* JADX INFO: compiled from: methodSignatureMapping.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class dovishness {
    public static final void attabal(StringBuilder sb, oilcan oilcanVar) {
        sb.append(competently(oilcanVar));
    }

    public static final String beachfront(wireman wiremanVar) {
        Intrinsics.checkNotNullParameter(wiremanVar, "<this>");
        dern dernVar = dern.f29852attabal;
        byname.wireman wiremanVarCutely = DescriptorUtilsKt.formularize(wiremanVar).cutely();
        Intrinsics.checkNotNullExpressionValue(wiremanVarCutely, "toUnsafe(...)");
        saneness sanenessVarTriweekly = dernVar.triweekly(wiremanVarCutely);
        if (sanenessVarTriweekly == null) {
            return marial.saneness(wiremanVar, null, 2, null);
        }
        String strBeachfront = iaido.wireman.saneness(sanenessVarTriweekly).beachfront();
        Intrinsics.checkNotNullExpressionValue(strBeachfront, "getInternalName(...)");
        return strBeachfront;
    }

    public static final formularize competently(oilcan oilcanVar) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        return (formularize) marial.marial(oilcanVar, triweekly.f30804attabal, cord.f30704kowloon, preprohormone.f30799attabal, null, null, 32, null);
    }

    public static /* synthetic */ String dern(p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness dovishnessVar, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return saneness(dovishnessVar, z, z2);
    }

    public static final boolean marial(attabal f) {
        p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness dovishnessVarApical;
        Intrinsics.checkNotNullParameter(f, "f");
        if (!(f instanceof p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness)) {
            return false;
        }
        p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness dovishnessVar = (p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness) f;
        if (Intrinsics.wireman(dovishnessVar.getName().dern(), "remove") && dovishnessVar.beachfront().size() == 1 && !SpecialBuiltinMembers.impromptu((CallableMemberDescriptor) f)) {
            List<cultivated> listBeachfront = dovishnessVar.attabal().beachfront();
            Intrinsics.checkNotNullExpressionValue(listBeachfront, "getValueParameters(...)");
            oilcan type = ((cultivated) CollectionsKt.herdbook(listBeachfront)).getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            formularize formularizeVarCompetently = competently(type);
            formularize.wireman wiremanVar = formularizeVarCompetently instanceof formularize.wireman ? (formularize.wireman) formularizeVarCompetently : null;
            if ((wiremanVar != null ? wiremanVar.taiyuan() : null) != JvmPrimitiveType.INT || (dovishnessVarApical = BuiltinMethodsWithSpecialGenericSignature.apical(dovishnessVar)) == null) {
                return false;
            }
            List<cultivated> listBeachfront2 = dovishnessVarApical.attabal().beachfront();
            Intrinsics.checkNotNullExpressionValue(listBeachfront2, "getValueParameters(...)");
            oilcan type2 = ((cultivated) CollectionsKt.herdbook(listBeachfront2)).getType();
            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            formularize formularizeVarCompetently2 = competently(type2);
            apical apicalVarSaneness = dovishnessVarApical.saneness();
            Intrinsics.checkNotNullExpressionValue(apicalVarSaneness, "getContainingDeclaration(...)");
            if (Intrinsics.wireman(DescriptorUtilsKt.impassible(apicalVarSaneness), competently.attabal.f29738milliradian.cutely()) && (formularizeVarCompetently2 instanceof formularize.dern) && Intrinsics.wireman(((formularize.dern) formularizeVarCompetently2).taiyuan(), "java/lang/Object")) {
                return true;
            }
        }
        return false;
    }

    public static final String saneness(p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness dovishnessVar, boolean z, boolean z2) {
        String strDern;
        Intrinsics.checkNotNullParameter(dovishnessVar, "<this>");
        StringBuilder sb = new StringBuilder();
        if (z2) {
            if (dovishnessVar instanceof cutely) {
                strDern = "<init>";
            } else {
                strDern = dovishnessVar.getName().dern();
                Intrinsics.checkNotNullExpressionValue(strDern, "asString(...)");
            }
            sb.append(strDern);
        }
        sb.append("(");
        starveling starvelingVarPolder = dovishnessVar.polder();
        if (starvelingVarPolder != null) {
            oilcan type = starvelingVarPolder.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            attabal(sb, type);
        }
        Iterator<cultivated> it = dovishnessVar.beachfront().iterator();
        while (it.hasNext()) {
            oilcan type2 = it.next().getType();
            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            attabal(sb, type2);
        }
        sb.append(")");
        if (z) {
            if (marial.dern(dovishnessVar)) {
                sb.append("V");
            } else {
                oilcan returnType = dovishnessVar.getReturnType();
                Intrinsics.beachfront(returnType);
                attabal(sb, returnType);
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final String wireman(attabal attabalVar) {
        Intrinsics.checkNotNullParameter(attabalVar, "<this>");
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.f30687attabal;
        if (marial.yemenite(attabalVar)) {
            return null;
        }
        apical apicalVarSaneness = attabalVar.saneness();
        wireman wiremanVar = apicalVarSaneness instanceof wireman ? (wireman) apicalVarSaneness : null;
        if (wiremanVar == null || wiremanVar.getName().apical()) {
            return null;
        }
        attabal attabalVarAttabal = attabalVar.attabal();
        hydrovane hydrovaneVar = attabalVarAttabal instanceof hydrovane ? (hydrovane) attabalVarAttabal : null;
        if (hydrovaneVar == null) {
            return null;
        }
        return adultoid.attabal(signatureBuildingComponents, wiremanVar, dern(hydrovaneVar, false, false, 3, null));
    }
}
