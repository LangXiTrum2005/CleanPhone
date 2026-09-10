package p002kotlin.reflect.jvm.internal.impl.load.kotlin;

import byname.competently;
import byname.dern;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.beachfront;
import p002kotlin.reflect.jvm.internal.impl.builtins.impromptu;
import p002kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.attabal;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cutely;
import p002kotlin.reflect.jvm.internal.impl.descriptors.overspeculate;
import p002kotlin.reflect.jvm.internal.impl.descriptors.privatdozent;
import p002kotlin.reflect.jvm.internal.impl.descriptors.sealless;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import p002kotlin.reflect.jvm.internal.impl.types.Variance;
import p002kotlin.reflect.jvm.internal.impl.types.checker.kowloon;
import p002kotlin.reflect.jvm.internal.impl.types.nosophobia;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.permissivist;
import p002kotlin.reflect.jvm.internal.impl.types.rotuma;
import p002kotlin.reflect.jvm.internal.impl.types.timberyard;
import p002kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;
import p002kotlin.text.dovishness;
import tetrahedral.triweekly;

/* JADX INFO: compiled from: descriptorBasedTypeSignatureMapping.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class marial {
    public static final String attabal(wireman klass, rotuma<?> typeMappingConfiguration) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        Intrinsics.checkNotNullParameter(typeMappingConfiguration, "typeMappingConfiguration");
        String strSaneness = typeMappingConfiguration.saneness(klass);
        if (strSaneness != null) {
            return strSaneness;
        }
        apical apicalVarSaneness = klass.saneness();
        Intrinsics.checkNotNullExpressionValue(apicalVarSaneness, "getContainingDeclaration(...)");
        String strMarial = competently.saneness(klass.getName()).marial();
        Intrinsics.checkNotNullExpressionValue(strMarial, "getIdentifier(...)");
        if (apicalVarSaneness instanceof sealless) {
            dern dernVarMarial = ((sealless) apicalVarSaneness).marial();
            if (dernVarMarial.wireman()) {
                return strMarial;
            }
            StringBuilder sb = new StringBuilder();
            String strSaneness2 = dernVarMarial.saneness();
            Intrinsics.checkNotNullExpressionValue(strSaneness2, "asString(...)");
            sb.append(dovishness.merc(strSaneness2, '.', '/', false, 4, null));
            sb.append('/');
            sb.append(strMarial);
            return sb.toString();
        }
        wireman wiremanVar = apicalVarSaneness instanceof wireman ? (wireman) apicalVarSaneness : null;
        if (wiremanVar == null) {
            throw new IllegalArgumentException("Unexpected container: " + apicalVarSaneness + " for " + klass);
        }
        String strDern = typeMappingConfiguration.dern(wiremanVar);
        if (strDern == null) {
            strDern = attabal(wiremanVar, typeMappingConfiguration);
        }
        return strDern + '$' + strMarial;
    }

    public static final boolean dern(attabal descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof cutely) {
            return true;
        }
        oilcan returnType = descriptor.getReturnType();
        Intrinsics.beachfront(returnType);
        if (!beachfront.hardpan(returnType)) {
            return false;
        }
        oilcan returnType2 = descriptor.getReturnType();
        Intrinsics.beachfront(returnType2);
        return (nosophobia.formularize(returnType2) || (descriptor instanceof privatdozent)) ? false : true;
    }

    public static /* synthetic */ Object marial(oilcan oilcanVar, impassible impassibleVar, cord cordVar, rotuma rotumaVar, cutely cutelyVar, triweekly triweeklyVar, int i, Object obj) {
        if ((i & 32) != 0) {
            triweeklyVar = FunctionsKt.saneness();
        }
        return wireman(oilcanVar, impassibleVar, cordVar, rotumaVar, cutelyVar, triweeklyVar);
    }

    public static /* synthetic */ String saneness(wireman wiremanVar, rotuma rotumaVar, int i, Object obj) {
        if ((i & 2) != 0) {
            rotumaVar = preprohormone.f30799attabal;
        }
        return attabal(wiremanVar, rotumaVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v36, types: [T, java.lang.Object] */
    public static final <T> T wireman(oilcan kotlinType, impassible<T> factory, cord mode, rotuma<? extends T> typeMappingConfiguration, cutely<T> cutelyVar, triweekly<? super oilcan, ? super T, ? super cord, Unit> writeGenericType) {
        T tAttabal;
        oilcan oilcanVar;
        Object objWireman;
        Intrinsics.checkNotNullParameter(kotlinType, "kotlinType");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(typeMappingConfiguration, "typeMappingConfiguration");
        Intrinsics.checkNotNullParameter(writeGenericType, "writeGenericType");
        oilcan oilcanVarWireman = typeMappingConfiguration.wireman(kotlinType);
        if (oilcanVarWireman != null) {
            return (T) wireman(oilcanVarWireman, factory, mode, typeMappingConfiguration, cutelyVar, writeGenericType);
        }
        if (p002kotlin.reflect.jvm.internal.impl.builtins.marial.polloi(kotlinType)) {
            return (T) wireman(impromptu.attabal(kotlinType), factory, mode, typeMappingConfiguration, cutelyVar, writeGenericType);
        }
        kowloon kowloonVar = kowloon.f31733attabal;
        Object objSaneness = cuirassed.saneness(kowloonVar, kotlinType, factory, mode);
        if (objSaneness != null) {
            ?? r8 = (Object) cuirassed.attabal(factory, objSaneness, mode.wireman());
            writeGenericType.invoke(kotlinType, r8, mode);
            return r8;
        }
        permissivist permissivistVar = kotlinType.setterwort();
        if (permissivistVar instanceof IntersectionTypeConstructor) {
            IntersectionTypeConstructor intersectionTypeConstructor = (IntersectionTypeConstructor) permissivistVar;
            oilcan oilcanVarImpromptu = intersectionTypeConstructor.impromptu();
            if (oilcanVarImpromptu == null) {
                oilcanVarImpromptu = typeMappingConfiguration.beachfront(intersectionTypeConstructor.cutely());
            }
            return (T) wireman(TypeUtilsKt.preprohormone(oilcanVarImpromptu), factory, mode, typeMappingConfiguration, cutelyVar, writeGenericType);
        }
        p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarWireman = permissivistVar.wireman();
        if (beachfrontVarWireman == null) {
            throw new UnsupportedOperationException("no descriptor for type constructor of " + kotlinType);
        }
        if (prescient.competently.impassible(beachfrontVarWireman)) {
            T t = (T) factory.marial("error/NonExistentClass");
            typeMappingConfiguration.marial(kotlinType, (wireman) beachfrontVarWireman);
            return t;
        }
        boolean z = beachfrontVarWireman instanceof wireman;
        if (z && beachfront.timberyard(kotlinType)) {
            if (kotlinType.dhss().size() != 1) {
                throw new UnsupportedOperationException("arrays must have one type argument");
            }
            timberyard timberyardVar = kotlinType.dhss().get(0);
            oilcan type = timberyardVar.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            if (timberyardVar.dern() == Variance.IN_VARIANCE) {
                objWireman = factory.marial("java/lang/Object");
            } else {
                Variance varianceDern = timberyardVar.dern();
                Intrinsics.checkNotNullExpressionValue(varianceDern, "getProjectionKind(...)");
                objWireman = wireman(type, factory, mode.beachfront(varianceDern, true), typeMappingConfiguration, cutelyVar, writeGenericType);
            }
            return (T) factory.attabal('[' + factory.wireman(objWireman));
        }
        if (!z) {
            if (beachfrontVarWireman instanceof clubfoot) {
                oilcan oilcanVarCutely = TypeUtilsKt.cutely((clubfoot) beachfrontVarWireman);
                if (kotlinType.mastfed()) {
                    oilcanVarCutely = TypeUtilsKt.gintrap(oilcanVarCutely);
                }
                return (T) wireman(oilcanVarCutely, factory, mode, typeMappingConfiguration, null, FunctionsKt.saneness());
            }
            if ((beachfrontVarWireman instanceof overspeculate) && mode.saneness()) {
                return (T) wireman(((overspeculate) beachfrontVarWireman).trm(), factory, mode, typeMappingConfiguration, cutelyVar, writeGenericType);
            }
            throw new UnsupportedOperationException("Unknown type " + kotlinType);
        }
        if (p002kotlin.reflect.jvm.internal.impl.resolve.beachfront.saneness(beachfrontVarWireman) && !mode.dern() && (oilcanVar = (oilcan) rotuma.attabal(kowloonVar, kotlinType)) != null) {
            return (T) wireman(oilcanVar, factory, mode.competently(), typeMappingConfiguration, cutelyVar, writeGenericType);
        }
        if (mode.marial() && beachfront.empress((wireman) beachfrontVarWireman)) {
            tAttabal = (Object) factory.beachfront();
        } else {
            wireman wiremanVar = (wireman) beachfrontVarWireman;
            wireman wiremanVarAttabal = wiremanVar.attabal();
            Intrinsics.checkNotNullExpressionValue(wiremanVarAttabal, "getOriginal(...)");
            tAttabal = typeMappingConfiguration.attabal(wiremanVarAttabal);
            if (tAttabal == null) {
                if (wiremanVar.getKind() == ClassKind.ENUM_ENTRY) {
                    apical apicalVarSaneness = wiremanVar.saneness();
                    Intrinsics.competently(apicalVarSaneness, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    wiremanVar = (wireman) apicalVarSaneness;
                }
                wireman wiremanVarAttabal2 = wiremanVar.attabal();
                Intrinsics.checkNotNullExpressionValue(wiremanVarAttabal2, "getOriginal(...)");
                tAttabal = (Object) factory.marial(attabal(wiremanVarAttabal2, typeMappingConfiguration));
            }
        }
        writeGenericType.invoke(kotlinType, tAttabal, mode);
        return tAttabal;
    }
}
