package kotlin.reflect.jvm.internal.impl.types.checker;

import com.google.android.gms.ads.mediation.MediationConfiguration;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt;

/* JADX INFO: loaded from: classes7.dex */
public class TypeCheckingProcedure {
    public static UnwrappedType a(SimpleType simpleType, SimpleType simpleType2) {
        char c2 = 0;
        if (simpleType != null) {
            TypeCheckerProcedureCallbacksImpl typeCheckerProcedureCallbacksImpl = new TypeCheckerProcedureCallbacksImpl();
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.add(new SubtypePathNode(simpleType, null));
            TypeConstructor typeConstructorH0 = simpleType2.H0();
            while (!arrayDeque.isEmpty()) {
                SubtypePathNode subtypePathNode = (SubtypePathNode) arrayDeque.poll();
                KotlinType kotlinTypeG = subtypePathNode.f44577a;
                TypeConstructor typeConstructorH1 = kotlinTypeG.H0();
                if (typeCheckerProcedureCallbacksImpl.b(typeConstructorH1, typeConstructorH0)) {
                    boolean zI0 = kotlinTypeG.I0();
                    for (SubtypePathNode subtypePathNode2 = subtypePathNode.f44578b; subtypePathNode2 != null; subtypePathNode2 = subtypePathNode2.f44578b) {
                        KotlinType kotlinType = subtypePathNode2.f44577a;
                        List listF0 = kotlinType.F0();
                        boolean z2 = listF0 instanceof Collection;
                        TypeConstructorSubstitution.Companion companion = TypeConstructorSubstitution.f44539b;
                        Variance variance = Variance.INVARIANT;
                        if (!z2 || !listF0.isEmpty()) {
                            Iterator it = listF0.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    kotlinTypeG = new TypeSubstitutor(companion.a(kotlinType.H0(), kotlinType.F0())).g(kotlinTypeG, variance);
                                    break;
                                }
                                if (((TypeProjection) it.next()).b() != variance) {
                                    kotlinTypeG = (KotlinType) CapturedTypeApproximationKt.a(new TypeSubstitutor(CapturedTypeConstructorKt.b(companion.a(kotlinType.H0(), kotlinType.F0()))).g(kotlinTypeG, variance)).f44598b;
                                    break;
                                }
                            }
                        } else {
                            kotlinTypeG = new TypeSubstitutor(companion.a(kotlinType.H0(), kotlinType.F0())).g(kotlinTypeG, variance);
                            break;
                        }
                        zI0 = zI0 || kotlinType.I0();
                    }
                    TypeConstructor typeConstructorH2 = kotlinTypeG.H0();
                    if (typeCheckerProcedureCallbacksImpl.b(typeConstructorH2, typeConstructorH0)) {
                        return TypeUtils.g(kotlinTypeG, zI0);
                    }
                    throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + UtilsKt.a(typeConstructorH2) + ", \n\nsupertype: " + UtilsKt.a(typeConstructorH0) + " \n" + typeConstructorH2.equals(typeConstructorH0));
                }
                for (KotlinType immediateSupertype : typeConstructorH1.d()) {
                    Intrinsics.e(immediateSupertype, "immediateSupertype");
                    arrayDeque.add(new SubtypePathNode(immediateSupertype, subtypePathNode));
                }
            }
            return null;
        }
        Object[] objArr = new Object[3];
        switch (c2) {
            case 1:
            case 3:
            case 18:
            case 20:
                objArr[0] = "supertype";
                break;
            case 2:
            case 17:
            case 19:
            default:
                objArr[0] = "subtype";
                break;
            case 4:
                objArr[0] = "typeCheckingProcedureCallbacks";
                break;
            case 5:
            case '\b':
            case 23:
                objArr[0] = MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD;
                break;
            case 6:
            case '\t':
                objArr[0] = "argument";
                break;
            case 7:
            case '\n':
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
                break;
            case 11:
                objArr[0] = "type1";
                break;
            case '\f':
                objArr[0] = "type2";
                break;
            case '\r':
                objArr[0] = "typeParameter";
                break;
            case 14:
                objArr[0] = "typeArgument";
                break;
            case 15:
                objArr[0] = "typeParameterVariance";
                break;
            case 16:
                objArr[0] = "typeArgumentVariance";
                break;
            case 21:
                objArr[0] = "subtypeArgumentProjection";
                break;
            case 22:
                objArr[0] = "supertypeArgumentProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
        switch (c2) {
            case 5:
            case 6:
                objArr[2] = "getOutType";
                break;
            case 7:
            case '\n':
                break;
            case '\b':
            case '\t':
                objArr[2] = "getInType";
                break;
            case 11:
            case '\f':
                objArr[2] = "equalTypes";
                break;
            case '\r':
            case 14:
            case 15:
            case 16:
                objArr[2] = "getEffectiveProjectionKind";
                break;
            case 17:
            case 18:
                objArr[2] = "isSubtypeOf";
                break;
            case 19:
            case 20:
                objArr[2] = "checkSubtypeForTheSameConstructor";
                break;
            case 21:
            case 22:
            case 23:
                objArr[2] = "capture";
                break;
            default:
                objArr[2] = "findCorrespondingSupertype";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }
}
