package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.AbstractStubType;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.DynamicType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SimpleTypeWithEnhancement;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextKt;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import p005e.a;

/* JADX INFO: loaded from: classes7.dex */
public interface ClassicTypeSystemContext extends TypeSystemCommonBackendContext, TypeSystemInferenceExtensionContext {

    public static final class DefaultImpls {
        public static boolean A(TypeConstructorMarker receiver) {
            Intrinsics.f(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return ((TypeConstructor) receiver).c() instanceof ClassDescriptor;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, receiver.getClass(), sb).toString());
        }

        public static boolean B(TypeConstructorMarker typeConstructorMarker) {
            if (typeConstructorMarker instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorC = ((TypeConstructor) typeConstructorMarker).c();
                ClassDescriptor classDescriptor = classifierDescriptorC instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorC : null;
                return (classDescriptor == null || classDescriptor.q() != Modality.X || classDescriptor.getKind() == ClassKind.Z || classDescriptor.getKind() == ClassKind.e0 || classDescriptor.getKind() == ClassKind.f0) ? false : true;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, typeConstructorMarker.getClass(), sb).toString());
        }

        public static boolean C(TypeConstructorMarker receiver) {
            Intrinsics.f(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return ((TypeConstructor) receiver).e();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, receiver.getClass(), sb).toString());
        }

        public static boolean D(KotlinTypeMarker receiver) {
            Intrinsics.f(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return KotlinTypeKt.a((KotlinType) receiver);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, receiver.getClass(), sb).toString());
        }

        public static boolean E(TypeConstructorMarker receiver) {
            Intrinsics.f(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorC = ((TypeConstructor) receiver).c();
                ClassDescriptor classDescriptor = classifierDescriptorC instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorC : null;
                return (classDescriptor != null ? classDescriptor.O() : null) instanceof InlineClassRepresentation;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, receiver.getClass(), sb).toString());
        }

        public static boolean F(TypeConstructorMarker receiver) {
            Intrinsics.f(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return receiver instanceof IntegerLiteralTypeConstructor;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, receiver.getClass(), sb).toString());
        }

        public static boolean G(TypeConstructorMarker receiver) {
            Intrinsics.f(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return receiver instanceof IntersectionTypeConstructor;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, receiver.getClass(), sb).toString());
        }

        public static boolean H(SimpleTypeMarker receiver) {
            Intrinsics.f(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                return ((SimpleType) receiver).I0();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, receiver.getClass(), sb).toString());
        }

        public static boolean I(TypeConstructorMarker receiver) {
            Intrinsics.f(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return KotlinBuiltIns.H((TypeConstructor) receiver, StandardNames.FqNames.f43495b);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, receiver.getClass(), sb).toString());
        }

        public static boolean J(KotlinTypeMarker receiver) {
            Intrinsics.f(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return TypeUtils.e((KotlinType) receiver);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, receiver.getClass(), sb).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean K(SimpleTypeMarker receiver) {
            Intrinsics.f(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return KotlinBuiltIns.F((KotlinType) receiver);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, receiver.getClass(), sb).toString());
        }

        public static boolean L(CapturedTypeMarker capturedTypeMarker) {
            if (capturedTypeMarker instanceof NewCapturedType) {
                return ((NewCapturedType) capturedTypeMarker).h0;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(capturedTypeMarker);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, capturedTypeMarker.getClass(), sb).toString());
        }

        public static boolean M(TypeArgumentMarker receiver) {
            Intrinsics.f(receiver, "$receiver");
            if (receiver instanceof TypeProjection) {
                return ((TypeProjection) receiver).a();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, receiver.getClass(), sb).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean N(SimpleTypeMarker receiver) {
            Intrinsics.f(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                KotlinType kotlinType = (KotlinType) receiver;
                if (kotlinType instanceof AbstractStubType) {
                    return true;
                }
                return (kotlinType instanceof DefinitelyNotNullType) && (((DefinitelyNotNullType) kotlinType).f44501Y instanceof AbstractStubType);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, receiver.getClass(), sb).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean O(SimpleTypeMarker receiver) {
            Intrinsics.f(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                KotlinType kotlinType = (KotlinType) receiver;
                if (kotlinType instanceof StubTypeForBuilderInference) {
                    return true;
                }
                return (kotlinType instanceof DefinitelyNotNullType) && (((DefinitelyNotNullType) kotlinType).f44501Y instanceof StubTypeForBuilderInference);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, receiver.getClass(), sb).toString());
        }

        public static SimpleType P(FlexibleTypeMarker flexibleTypeMarker) {
            if (flexibleTypeMarker instanceof FlexibleType) {
                return ((FlexibleType) flexibleTypeMarker).f44509Y;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(flexibleTypeMarker);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, flexibleTypeMarker.getClass(), sb).toString());
        }

        public static UnwrappedType Q(CapturedTypeMarker capturedTypeMarker) {
            if (capturedTypeMarker instanceof NewCapturedType) {
                return ((NewCapturedType) capturedTypeMarker).e0;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(capturedTypeMarker);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, capturedTypeMarker.getClass(), sb).toString());
        }

        public static UnwrappedType R(KotlinTypeMarker kotlinTypeMarker) {
            if (kotlinTypeMarker instanceof UnwrappedType) {
                return SpecialTypesKt.a((UnwrappedType) kotlinTypeMarker, false);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, kotlinTypeMarker.getClass(), sb).toString());
        }

        public static SimpleType S(DefinitelyNotNullTypeMarker definitelyNotNullTypeMarker) {
            if (definitelyNotNullTypeMarker instanceof DefinitelyNotNullType) {
                return ((DefinitelyNotNullType) definitelyNotNullTypeMarker).f44501Y;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(definitelyNotNullTypeMarker);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, definitelyNotNullTypeMarker.getClass(), sb).toString());
        }

        public static int T(TypeConstructorMarker receiver) {
            Intrinsics.f(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return ((TypeConstructor) receiver).getParameters().size();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, receiver.getClass(), sb).toString());
        }

        public static Set U(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker receiver) {
            Intrinsics.f(receiver, "$receiver");
            TypeConstructor typeConstructorZ = classicTypeSystemContext.Z(receiver);
            if (typeConstructorZ instanceof IntegerLiteralTypeConstructor) {
                return ((IntegerLiteralTypeConstructor) typeConstructorZ).f44307a;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, receiver.getClass(), sb).toString());
        }

        public static TypeProjection V(CapturedTypeConstructorMarker receiver) {
            Intrinsics.f(receiver, "$receiver");
            if (receiver instanceof NewCapturedTypeConstructor) {
                return ((NewCapturedTypeConstructor) receiver).f44567a;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, receiver.getClass(), sb).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v6, types: [kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext$substitutionSupertypePolicy$2] */
        public static ClassicTypeSystemContext$substitutionSupertypePolicy$2 W(final ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker simpleTypeMarker) {
            if (simpleTypeMarker instanceof SimpleType) {
                KotlinType kotlinType = (KotlinType) simpleTypeMarker;
                final TypeSubstitutor typeSubstitutor = new TypeSubstitutor(TypeConstructorSubstitution.f44539b.a(kotlinType.H0(), kotlinType.F0()));
                return new TypeCheckerState.SupertypesPolicy.DoCustomTransform() { // from class: kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext$substitutionSupertypePolicy$2
                    @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy
                    public final SimpleTypeMarker a(TypeCheckerState state, KotlinTypeMarker type) {
                        Intrinsics.f(state, "state");
                        Intrinsics.f(type, "type");
                        ClassicTypeSystemContext classicTypeSystemContext2 = classicTypeSystemContext;
                        SimpleType simpleTypeF = classicTypeSystemContext2.F(typeSubstitutor.g(classicTypeSystemContext2.i0(type), Variance.INVARIANT));
                        Intrinsics.c(simpleTypeF);
                        return simpleTypeF;
                    }
                };
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(simpleTypeMarker);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, simpleTypeMarker.getClass(), sb).toString());
        }

        public static Collection X(TypeConstructorMarker receiver) {
            Intrinsics.f(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                Collection collectionD = ((TypeConstructor) receiver).d();
                Intrinsics.e(collectionD, "this.supertypes");
                return collectionD;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, receiver.getClass(), sb).toString());
        }

        public static TypeConstructor Y(SimpleTypeMarker receiver) {
            Intrinsics.f(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                return ((SimpleType) receiver).H0();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, receiver.getClass(), sb).toString());
        }

        public static NewCapturedTypeConstructor Z(CapturedTypeMarker receiver) {
            Intrinsics.f(receiver, "$receiver");
            if (receiver instanceof NewCapturedType) {
                return ((NewCapturedType) receiver).Z;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, receiver.getClass(), sb).toString());
        }

        public static boolean a(TypeConstructorMarker c1, TypeConstructorMarker c2) {
            Intrinsics.f(c1, "c1");
            Intrinsics.f(c2, "c2");
            if (!(c1 instanceof TypeConstructor)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(c1);
                sb.append(", ");
                throw new IllegalArgumentException(a.b(Reflection.f43333a, c1.getClass(), sb).toString());
            }
            if (c2 instanceof TypeConstructor) {
                return c1.equals(c2);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(c2);
            sb2.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, c2.getClass(), sb2).toString());
        }

        public static SimpleType a0(FlexibleTypeMarker flexibleTypeMarker) {
            if (flexibleTypeMarker instanceof FlexibleType) {
                return ((FlexibleType) flexibleTypeMarker).Z;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(flexibleTypeMarker);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, flexibleTypeMarker.getClass(), sb).toString());
        }

        public static int b(KotlinTypeMarker receiver) {
            Intrinsics.f(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return ((KotlinType) receiver).F0().size();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, receiver.getClass(), sb).toString());
        }

        public static SimpleType b0(SimpleTypeMarker receiver, boolean z2) {
            Intrinsics.f(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                return ((SimpleType) receiver).L0(z2);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, receiver.getClass(), sb).toString());
        }

        public static TypeArgumentListMarker c(SimpleTypeMarker receiver) {
            Intrinsics.f(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                return (TypeArgumentListMarker) receiver;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, receiver.getClass(), sb).toString());
        }

        public static KotlinTypeMarker c0(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
            if (kotlinTypeMarker instanceof SimpleTypeMarker) {
                return classicTypeSystemContext.d0((SimpleTypeMarker) kotlinTypeMarker, true);
            }
            if (!(kotlinTypeMarker instanceof FlexibleTypeMarker)) {
                throw new IllegalStateException("sealed");
            }
            FlexibleTypeMarker flexibleTypeMarker = (FlexibleTypeMarker) kotlinTypeMarker;
            return classicTypeSystemContext.g(classicTypeSystemContext.d0(classicTypeSystemContext.B(flexibleTypeMarker), true), classicTypeSystemContext.d0(classicTypeSystemContext.g0(flexibleTypeMarker), true));
        }

        public static CapturedTypeMarker d(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker receiver) {
            Intrinsics.f(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                if (receiver instanceof SimpleTypeWithEnhancement) {
                    return classicTypeSystemContext.h0(((SimpleTypeWithEnhancement) receiver).f44520Y);
                }
                if (receiver instanceof NewCapturedType) {
                    return (NewCapturedType) receiver;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, receiver.getClass(), sb).toString());
        }

        public static DefinitelyNotNullType e(SimpleTypeMarker receiver) {
            Intrinsics.f(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                if (receiver instanceof DefinitelyNotNullType) {
                    return (DefinitelyNotNullType) receiver;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, receiver.getClass(), sb).toString());
        }

        public static DynamicType f(FlexibleType flexibleType) {
            if (flexibleType instanceof DynamicType) {
                return (DynamicType) flexibleType;
            }
            return null;
        }

        public static FlexibleType g(KotlinTypeMarker receiver) {
            Intrinsics.f(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                UnwrappedType unwrappedTypeK0 = ((KotlinType) receiver).K0();
                if (unwrappedTypeK0 instanceof FlexibleType) {
                    return (FlexibleType) unwrappedTypeK0;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, receiver.getClass(), sb).toString());
        }

        public static RawType h(FlexibleTypeMarker flexibleTypeMarker) {
            if (flexibleTypeMarker instanceof FlexibleType) {
                if (flexibleTypeMarker instanceof RawType) {
                    return (RawType) flexibleTypeMarker;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(flexibleTypeMarker);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, flexibleTypeMarker.getClass(), sb).toString());
        }

        public static SimpleType i(KotlinTypeMarker receiver) {
            Intrinsics.f(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                UnwrappedType unwrappedTypeK0 = ((KotlinType) receiver).K0();
                if (unwrappedTypeK0 instanceof SimpleType) {
                    return (SimpleType) unwrappedTypeK0;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, receiver.getClass(), sb).toString());
        }

        public static TypeProjectionImpl j(KotlinTypeMarker receiver) {
            Intrinsics.f(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return TypeUtilsKt.a((KotlinType) receiver);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, receiver.getClass(), sb).toString());
        }

        /* JADX WARN: Code duplicated, block: B:6:0x001f  */
        public static SimpleType k(SimpleTypeMarker simpleTypeMarker) {
            ArrayList arrayList;
            KotlinTypePreparator.Default r12;
            CaptureStatus captureStatus = CaptureStatus.X;
            if (!(simpleTypeMarker instanceof SimpleType)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(simpleTypeMarker);
                sb.append(", ");
                throw new IllegalArgumentException(a.b(Reflection.f43333a, simpleTypeMarker.getClass(), sb).toString());
            }
            SimpleType simpleType = (SimpleType) simpleTypeMarker;
            Function0 function0 = null;
            if (simpleType.F0().size() != simpleType.H0().getParameters().size()) {
                arrayList = null;
            } else {
                List listF0 = simpleType.F0();
                List list = listF0;
                if ((list instanceof Collection) && list.isEmpty()) {
                    arrayList = null;
                } else {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Variance varianceB = ((TypeProjection) it.next()).b();
                        Variance variance = Variance.INVARIANT;
                        if (varianceB != variance) {
                            List parameters = simpleType.H0().getParameters();
                            Intrinsics.e(parameters, "type.constructor.parameters");
                            ArrayList<Pair> arrayListN0 = CollectionsKt.n0(list, parameters);
                            arrayList = new ArrayList(CollectionsKt.n(arrayListN0, 10));
                            for (Pair pair : arrayListN0) {
                                TypeProjection typeProjectionA = (TypeProjection) pair.X;
                                TypeParameterDescriptor parameter = (TypeParameterDescriptor) pair.f43249Y;
                                if (typeProjectionA.b() != variance) {
                                    UnwrappedType unwrappedTypeK0 = (typeProjectionA.a() || typeProjectionA.b() != Variance.IN_VARIANCE) ? null : typeProjectionA.getType().K0();
                                    Intrinsics.e(parameter, "parameter");
                                    typeProjectionA = TypeUtilsKt.a(new NewCapturedType(captureStatus, new NewCapturedTypeConstructor(typeProjectionA, function0, parameter, 6), unwrappedTypeK0, (TypeAttributes) null, false, 56));
                                }
                                arrayList.add(typeProjectionA);
                            }
                            TypeSubstitutor typeSubstitutor = new TypeSubstitutor(TypeConstructorSubstitution.f44539b.a(simpleType.H0(), arrayList));
                            int size = listF0.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                TypeProjection typeProjection = (TypeProjection) listF0.get(i2);
                                TypeProjection typeProjection2 = (TypeProjection) arrayList.get(i2);
                                if (typeProjection.b() != variance) {
                                    List upperBounds = ((TypeParameterDescriptor) simpleType.H0().getParameters().get(i2)).getUpperBounds();
                                    Intrinsics.e(upperBounds, "type.constructor.parameters[index].upperBounds");
                                    final ArrayList arrayList2 = new ArrayList();
                                    Iterator it2 = upperBounds.iterator();
                                    while (true) {
                                        boolean zHasNext = it2.hasNext();
                                        r12 = KotlinTypePreparator.Default.f44563a;
                                        if (!zHasNext) {
                                            break;
                                        }
                                        arrayList2.add(r12.a(typeSubstitutor.g((KotlinType) it2.next(), variance).K0()));
                                    }
                                    if (!typeProjection.a() && typeProjection.b() == Variance.OUT_VARIANCE) {
                                        arrayList2.add(r12.a(typeProjection.getType().K0()));
                                    }
                                    KotlinType type = typeProjection2.getType();
                                    Intrinsics.d(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                                    NewCapturedTypeConstructor newCapturedTypeConstructor = ((NewCapturedType) type).Z;
                                    newCapturedTypeConstructor.getClass();
                                    newCapturedTypeConstructor.f44568b = new Function0<List<? extends UnwrappedType>>() { // from class: kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor$initializeSupertypes$2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return arrayList2;
                                        }
                                    };
                                }
                            }
                        }
                    }
                    arrayList = null;
                }
            }
            if (arrayList != null) {
                return KotlinTypeFactory.d(simpleType.G0(), simpleType.H0(), arrayList, simpleType.I0(), null);
            }
            return null;
        }

        public static CaptureStatus l(CapturedTypeMarker receiver) {
            Intrinsics.f(receiver, "$receiver");
            if (receiver instanceof NewCapturedType) {
                return ((NewCapturedType) receiver).f44566Y;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, receiver.getClass(), sb).toString());
        }

        public static UnwrappedType m(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker lowerBound, SimpleTypeMarker upperBound) {
            Intrinsics.f(lowerBound, "lowerBound");
            Intrinsics.f(upperBound, "upperBound");
            if (!(lowerBound instanceof SimpleType)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(classicTypeSystemContext);
                sb.append(", ");
                throw new IllegalArgumentException(a.b(Reflection.f43333a, classicTypeSystemContext.getClass(), sb).toString());
            }
            if (upperBound instanceof SimpleType) {
                return KotlinTypeFactory.b((SimpleType) lowerBound, (SimpleType) upperBound);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(classicTypeSystemContext);
            sb2.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, classicTypeSystemContext.getClass(), sb2).toString());
        }

        public static TypeArgumentMarker n(KotlinTypeMarker receiver, int i2) {
            Intrinsics.f(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return (TypeArgumentMarker) ((KotlinType) receiver).F0().get(i2);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, receiver.getClass(), sb).toString());
        }

        public static List o(KotlinTypeMarker receiver) {
            Intrinsics.f(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return ((KotlinType) receiver).F0();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, receiver.getClass(), sb).toString());
        }

        public static TypeParameterMarker p(TypeConstructorMarker receiver, int i2) {
            Intrinsics.f(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                Object obj = ((TypeConstructor) receiver).getParameters().get(i2);
                Intrinsics.e(obj, "this.parameters[index]");
                return (TypeParameterMarker) obj;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, receiver.getClass(), sb).toString());
        }

        public static List q(TypeConstructorMarker typeConstructorMarker) {
            if (typeConstructorMarker instanceof TypeConstructor) {
                List parameters = ((TypeConstructor) typeConstructorMarker).getParameters();
                Intrinsics.e(parameters, "this.parameters");
                return parameters;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, typeConstructorMarker.getClass(), sb).toString());
        }

        public static UnwrappedType r(TypeArgumentMarker receiver) {
            Intrinsics.f(receiver, "$receiver");
            if (receiver instanceof TypeProjection) {
                return ((TypeProjection) receiver).getType().K0();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, receiver.getClass(), sb).toString());
        }

        public static TypeParameterDescriptor s(TypeVariableTypeConstructorMarker typeVariableTypeConstructorMarker) {
            if (typeVariableTypeConstructorMarker instanceof NewTypeVariableConstructor) {
                return ((NewTypeVariableConstructor) typeVariableTypeConstructorMarker).a();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeVariableTypeConstructorMarker);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, typeVariableTypeConstructorMarker.getClass(), sb).toString());
        }

        public static TypeParameterDescriptor t(TypeConstructorMarker receiver) {
            Intrinsics.f(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorC = ((TypeConstructor) receiver).c();
                if (classifierDescriptorC instanceof TypeParameterDescriptor) {
                    return (TypeParameterDescriptor) classifierDescriptorC;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, receiver.getClass(), sb).toString());
        }

        public static TypeVariance u(TypeArgumentMarker receiver) {
            Intrinsics.f(receiver, "$receiver");
            if (receiver instanceof TypeProjection) {
                Variance varianceB = ((TypeProjection) receiver).b();
                Intrinsics.e(varianceB, "this.projectionKind");
                return TypeSystemContextKt.a(varianceB);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, receiver.getClass(), sb).toString());
        }

        public static TypeVariance v(TypeParameterMarker receiver) {
            Intrinsics.f(receiver, "$receiver");
            if (receiver instanceof TypeParameterDescriptor) {
                Variance varianceJ = ((TypeParameterDescriptor) receiver).j();
                Intrinsics.e(varianceJ, "this.variance");
                return TypeSystemContextKt.a(varianceJ);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, receiver.getClass(), sb).toString());
        }

        public static boolean w(KotlinType receiver, FqName fqName) {
            Intrinsics.f(receiver, "$receiver");
            Intrinsics.f(fqName, "fqName");
            return receiver.getAnnotations().E0(fqName);
        }

        public static boolean x(TypeParameterMarker typeParameterMarker, TypeConstructorMarker typeConstructorMarker) {
            if (!(typeParameterMarker instanceof TypeParameterDescriptor)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(typeParameterMarker);
                sb.append(", ");
                throw new IllegalArgumentException(a.b(Reflection.f43333a, typeParameterMarker.getClass(), sb).toString());
            }
            if (typeConstructorMarker == null ? true : typeConstructorMarker instanceof TypeConstructor) {
                return TypeUtilsKt.h((TypeParameterDescriptor) typeParameterMarker, (TypeConstructor) typeConstructorMarker, null);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(typeParameterMarker);
            sb2.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, typeParameterMarker.getClass(), sb2).toString());
        }

        public static boolean y(SimpleTypeMarker a2, SimpleTypeMarker b2) {
            Intrinsics.f(a2, "a");
            Intrinsics.f(b2, "b");
            if (!(a2 instanceof SimpleType)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(a2);
                sb.append(", ");
                throw new IllegalArgumentException(a.b(Reflection.f43333a, a2.getClass(), sb).toString());
            }
            if (b2 instanceof SimpleType) {
                return ((SimpleType) a2).F0() == ((SimpleType) b2).F0();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(b2);
            sb2.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, b2.getClass(), sb2).toString());
        }

        public static boolean z(TypeConstructorMarker receiver) {
            Intrinsics.f(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return KotlinBuiltIns.H((TypeConstructor) receiver, StandardNames.FqNames.f43494a);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, receiver.getClass(), sb).toString());
        }
    }

    UnwrappedType g(SimpleTypeMarker simpleTypeMarker, SimpleTypeMarker simpleTypeMarker2);
}
