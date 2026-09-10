package p002kotlin.reflect.jvm.internal;

import byname.dern;
import byname.saneness;
import foreshot.taiyuan;
import foreshot.wireman;
import genesic.formularize;
import henotic.attabal;
import java.lang.reflect.Method;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.calls.impromptu;
import p002kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.creditor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cutely;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness;
import p002kotlin.reflect.jvm.internal.impl.descriptors.privatdozent;
import p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.impassible;
import p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.molybdenite;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import p002kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import p002kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly;
import p002kotlin.reflect.jvm.internal.impl.resolve.beachfront;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import p002kotlin.reflect.jvm.internal.impl.resolve.marial;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.competently;
import p002kotlin.text.StringsKt;

/* JADX INFO: compiled from: RuntimeTypeMapper.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001eR\u001e\u0010#\u001a\u0004\u0018\u00010 *\u0006\u0012\u0002\b\u00030\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lkotlin/reflect/jvm/internal/arytenoidectomy;", "", "<init>", "()V", "Lkotlin/reflect/jvm/internal/impl/descriptors/dovishness;", "possiblySubstitutedFunction", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "competently", "(Lkotlin/reflect/jvm/internal/impl/descriptors/dovishness;)Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "Lkotlin/reflect/jvm/internal/impl/descriptors/saran;", "possiblyOverriddenProperty", "Lkotlin/reflect/jvm/internal/competently;", "beachfront", "(Lkotlin/reflect/jvm/internal/impl/descriptors/saran;)Lkotlin/reflect/jvm/internal/competently;", "Ljava/lang/Class;", "klass", "Lbyname/saneness;", "dern", "(Ljava/lang/Class;)Lbyname/saneness;", "descriptor", "", "saneness", "(Lkotlin/reflect/jvm/internal/impl/descriptors/dovishness;)Z", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$dern;", "wireman", "(Lkotlin/reflect/jvm/internal/impl/descriptors/dovishness;)Lkotlin/reflect/jvm/internal/JvmFunctionSignature$dern;", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "", "marial", "(Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;)Ljava/lang/String;", "Lbyname/saneness;", "JAVA_LANG_VOID", "Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;", "getPrimitiveType", "(Ljava/lang/Class;)Lorg/jetbrains/kotlin/builtins/PrimitiveType;", "primitiveType", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class arytenoidectomy {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final arytenoidectomy f29551attabal = new arytenoidectomy();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final saneness JAVA_LANG_VOID;

    static {
        saneness sanenessVarImpassible = saneness.impassible(new dern("java.lang.Void"));
        Intrinsics.checkNotNullExpressionValue(sanenessVarImpassible, "topLevel(...)");
        JAVA_LANG_VOID = sanenessVarImpassible;
    }

    public final PrimitiveType attabal(Class<?> cls) {
        if (cls.isPrimitive()) {
            return JvmPrimitiveType.get(cls.getSimpleName()).getPrimitiveType();
        }
        return null;
    }

    public final competently beachfront(saran possiblyOverriddenProperty) {
        Intrinsics.checkNotNullParameter(possiblyOverriddenProperty, "possiblyOverriddenProperty");
        saran saranVarAttabal = ((saran) marial.seminary(possiblyOverriddenProperty)).attabal();
        Intrinsics.checkNotNullExpressionValue(saranVarAttabal, "getOriginal(...)");
        if (saranVarAttabal instanceof competently) {
            competently competentlyVar = (competently) saranVarAttabal;
            ProtoBuf$Property protoBuf$PropertyCig = competentlyVar.cultivated();
            GeneratedMessageLite.marial<ProtoBuf$Property, JvmProtoBuf.JvmPropertySignature> propertySignature = JvmProtoBuf.f31037wireman;
            Intrinsics.checkNotNullExpressionValue(propertySignature, "propertySignature");
            JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) genesis.marial.attabal(protoBuf$PropertyCig, propertySignature);
            if (jvmPropertySignature != null) {
                return new competently.dern(saranVarAttabal, protoBuf$PropertyCig, jvmPropertySignature, competentlyVar.oilcan(), competentlyVar.cuirassed());
            }
        } else if (saranVarAttabal instanceof methylmercury.marial) {
            walach walachVarCompetently = ((methylmercury.marial) saranVarAttabal).competently();
            attabal attabalVar = walachVarCompetently instanceof attabal ? (attabal) walachVarCompetently : null;
            formularize formularizeVarDern = attabalVar != null ? attabalVar.dern() : null;
            if (formularizeVarDern instanceof p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.arytenoidectomy) {
                return new competently.attabal(((p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.arytenoidectomy) formularizeVarDern).privatdozent());
            }
            if (formularizeVarDern instanceof molybdenite) {
                Method methodPrivatdozent = ((molybdenite) formularizeVarDern).privatdozent();
                creditor setter = saranVarAttabal.getSetter();
                walach walachVarCompetently2 = setter != null ? setter.competently() : null;
                attabal attabalVar2 = walachVarCompetently2 instanceof attabal ? (attabal) walachVarCompetently2 : null;
                formularize formularizeVarDern2 = attabalVar2 != null ? attabalVar2.dern() : null;
                molybdenite molybdeniteVar = formularizeVarDern2 instanceof molybdenite ? (molybdenite) formularizeVarDern2 : null;
                return new competently.saneness(methodPrivatdozent, molybdeniteVar != null ? molybdeniteVar.privatdozent() : null);
            }
            throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java field " + saranVarAttabal + " (source = " + formularizeVarDern + ')');
        }
        privatdozent getter = saranVarAttabal.getGetter();
        Intrinsics.beachfront(getter);
        JvmFunctionSignature.dern dernVarWireman = wireman(getter);
        creditor setter2 = saranVarAttabal.getSetter();
        return new competently.wireman(dernVarWireman, setter2 != null ? wireman(setter2) : null);
    }

    public final JvmFunctionSignature competently(dovishness possiblySubstitutedFunction) {
        Method methodPrivatdozent;
        wireman.saneness sanenessVarSaneness;
        wireman.saneness sanenessVarMarial;
        Intrinsics.checkNotNullParameter(possiblySubstitutedFunction, "possiblySubstitutedFunction");
        dovishness dovishnessVarAttabal = ((dovishness) marial.seminary(possiblySubstitutedFunction)).attabal();
        Intrinsics.checkNotNullExpressionValue(dovishnessVarAttabal, "getOriginal(...)");
        if (!(dovishnessVarAttabal instanceof p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.saneness)) {
            if (dovishnessVarAttabal instanceof JavaMethodDescriptor) {
                walach walachVarCompetently = ((JavaMethodDescriptor) dovishnessVarAttabal).competently();
                attabal attabalVar = walachVarCompetently instanceof attabal ? (attabal) walachVarCompetently : null;
                formularize formularizeVarDern = attabalVar != null ? attabalVar.dern() : null;
                molybdenite molybdeniteVar = formularizeVarDern instanceof molybdenite ? (molybdenite) formularizeVarDern : null;
                if (molybdeniteVar != null && (methodPrivatdozent = molybdeniteVar.privatdozent()) != null) {
                    return new JvmFunctionSignature.attabal(methodPrivatdozent);
                }
                throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java method " + dovishnessVarAttabal);
            }
            if (!(dovishnessVarAttabal instanceof methylmercury.saneness)) {
                if (saneness(dovishnessVarAttabal)) {
                    return wireman(dovishnessVarAttabal);
                }
                throw new KotlinReflectionInternalError("Unknown origin of " + dovishnessVarAttabal + " (" + dovishnessVarAttabal.getClass() + ')');
            }
            walach walachVarCompetently2 = ((methylmercury.saneness) dovishnessVarAttabal).competently();
            attabal attabalVar2 = walachVarCompetently2 instanceof attabal ? (attabal) walachVarCompetently2 : null;
            formularize formularizeVarDern2 = attabalVar2 != null ? attabalVar2.dern() : null;
            if (formularizeVarDern2 instanceof impassible) {
                return new JvmFunctionSignature.JavaConstructor(((impassible) formularizeVarDern2).privatdozent());
            }
            if (formularizeVarDern2 instanceof ReflectJavaClass) {
                ReflectJavaClass reflectJavaClass = (ReflectJavaClass) formularizeVarDern2;
                if (reflectJavaClass.kowloon()) {
                    return new JvmFunctionSignature.FakeJavaAnnotationConstructor(reflectJavaClass.getElement());
                }
            }
            throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java constructor " + dovishnessVarAttabal + " (" + formularizeVarDern2 + ')');
        }
        p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.saneness sanenessVar = (p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.saneness) dovishnessVarAttabal;
        triweekly triweeklyVarCultivated = sanenessVar.cultivated();
        if ((triweeklyVarCultivated instanceof ProtoBuf$Function) && (sanenessVarMarial = taiyuan.f26288attabal.marial((ProtoBuf$Function) triweeklyVarCultivated, sanenessVar.oilcan(), sanenessVar.cuirassed())) != null) {
            return new JvmFunctionSignature.dern(sanenessVarMarial);
        }
        if (!(triweeklyVarCultivated instanceof ProtoBuf$Constructor) || (sanenessVarSaneness = taiyuan.f26288attabal.saneness((ProtoBuf$Constructor) triweeklyVarCultivated, sanenessVar.oilcan(), sanenessVar.cuirassed())) == null) {
            return wireman(dovishnessVarAttabal);
        }
        apical apicalVarSaneness = possiblySubstitutedFunction.saneness();
        Intrinsics.checkNotNullExpressionValue(apicalVarSaneness, "getContainingDeclaration(...)");
        if (beachfront.saneness(apicalVarSaneness)) {
            return new JvmFunctionSignature.dern(sanenessVarSaneness);
        }
        apical apicalVarSaneness2 = possiblySubstitutedFunction.saneness();
        Intrinsics.checkNotNullExpressionValue(apicalVarSaneness2, "getContainingDeclaration(...)");
        if (!beachfront.wireman(apicalVarSaneness2)) {
            return new JvmFunctionSignature.saneness(sanenessVarSaneness);
        }
        cutely cutelyVar = (cutely) possiblySubstitutedFunction;
        if (cutelyVar.clubfoot()) {
            if (!Intrinsics.wireman(sanenessVarSaneness.dern(), "constructor-impl") || !p002kotlin.text.dovishness.cuirassed(sanenessVarSaneness.saneness(), ")V", false, 2, null)) {
                throw new IllegalArgumentException(("Invalid signature: " + sanenessVarSaneness).toString());
            }
        } else {
            if (!Intrinsics.wireman(sanenessVarSaneness.dern(), "constructor-impl")) {
                throw new IllegalArgumentException(("Invalid signature: " + sanenessVarSaneness).toString());
            }
            p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVarDent = cutelyVar.dent();
            Intrinsics.checkNotNullExpressionValue(wiremanVarDent, "getConstructedClass(...)");
            String strGraveside = impromptu.graveside(wiremanVarDent);
            if (p002kotlin.text.dovishness.cuirassed(sanenessVarSaneness.saneness(), ")V", false, 2, null)) {
                sanenessVarSaneness = wireman.saneness.marial(sanenessVarSaneness, null, StringsKt.herdbook(sanenessVarSaneness.saneness(), "V") + strGraveside, 1, null);
            } else if (!p002kotlin.text.dovishness.cuirassed(sanenessVarSaneness.saneness(), strGraveside, false, 2, null)) {
                throw new IllegalArgumentException(("Invalid signature: " + sanenessVarSaneness).toString());
            }
        }
        return new JvmFunctionSignature.dern(sanenessVarSaneness);
    }

    public final saneness dern(Class<?> klass) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        if (klass.isArray()) {
            Class<?> componentType = klass.getComponentType();
            Intrinsics.checkNotNullExpressionValue(componentType, "getComponentType(...)");
            PrimitiveType primitiveTypeAttabal = attabal(componentType);
            if (primitiveTypeAttabal != null) {
                return new saneness(p002kotlin.reflect.jvm.internal.impl.builtins.competently.f29682preprohormone, primitiveTypeAttabal.getArrayTypeName());
            }
            saneness sanenessVarImpassible = saneness.impassible(kotlin.reflect.jvm.internal.impl.builtins.competently.attabal.f29769taiyuan.formularize());
            Intrinsics.checkNotNullExpressionValue(sanenessVarImpassible, "topLevel(...)");
            return sanenessVarImpassible;
        }
        if (Intrinsics.wireman(klass, Void.TYPE)) {
            return JAVA_LANG_VOID;
        }
        PrimitiveType primitiveTypeAttabal2 = attabal(klass);
        if (primitiveTypeAttabal2 != null) {
            return new saneness(p002kotlin.reflect.jvm.internal.impl.builtins.competently.f29682preprohormone, primitiveTypeAttabal2.getTypeName());
        }
        saneness sanenessVarAttabal = ReflectClassUtilKt.attabal(klass);
        if (!sanenessVarAttabal.apical()) {
            p002kotlin.reflect.jvm.internal.impl.builtins.jvm.dern dernVar = p002kotlin.reflect.jvm.internal.impl.builtins.jvm.dern.f29852attabal;
            dern dernVarSaneness = sanenessVarAttabal.saneness();
            Intrinsics.checkNotNullExpressionValue(dernVarSaneness, "asSingleFqName(...)");
            saneness sanenessVarImpassible2 = dernVar.impassible(dernVarSaneness);
            if (sanenessVarImpassible2 != null) {
                return sanenessVarImpassible2;
            }
        }
        return sanenessVarAttabal;
    }

    public final String marial(CallableMemberDescriptor descriptor) {
        String strSaneness = SpecialBuiltinMembers.saneness(descriptor);
        if (strSaneness != null) {
            return strSaneness;
        }
        if (descriptor instanceof privatdozent) {
            String strDern = DescriptorUtilsKt.graveside(descriptor).getName().dern();
            Intrinsics.checkNotNullExpressionValue(strDern, "asString(...)");
            return p002kotlin.reflect.jvm.internal.impl.load.java.molybdenite.saneness(strDern);
        }
        if (descriptor instanceof creditor) {
            String strDern2 = DescriptorUtilsKt.graveside(descriptor).getName().dern();
            Intrinsics.checkNotNullExpressionValue(strDern2, "asString(...)");
            return p002kotlin.reflect.jvm.internal.impl.load.java.molybdenite.marial(strDern2);
        }
        String strDern3 = descriptor.getName().dern();
        Intrinsics.checkNotNullExpressionValue(strDern3, "asString(...)");
        return strDern3;
    }

    public final boolean saneness(dovishness descriptor) {
        if (p002kotlin.reflect.jvm.internal.impl.resolve.wireman.arytenoidectomy(descriptor) || p002kotlin.reflect.jvm.internal.impl.resolve.wireman.monoploid(descriptor)) {
            return true;
        }
        return Intrinsics.wireman(descriptor.getName(), p002kotlin.reflect.jvm.internal.impl.builtins.jvm.attabal.f29846marial.attabal()) && descriptor.beachfront().isEmpty();
    }

    public final JvmFunctionSignature.dern wireman(dovishness descriptor) {
        return new JvmFunctionSignature.dern(new wireman.saneness(marial(descriptor), p002kotlin.reflect.jvm.internal.impl.load.kotlin.dovishness.dern(descriptor, false, false, 1, null)));
    }
}
