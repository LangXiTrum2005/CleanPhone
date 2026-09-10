package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawProjectionComputer;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class TypeParameterUpperBoundEraser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RawProjectionComputer f44541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f44542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MemoizedFunctionToNotNull f44543c;

    public static final class Companion {
    }

    public static final class DataToEraseUpperBound {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TypeParameterDescriptor f44544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ErasureTypeAttributes f44545b;

        public DataToEraseUpperBound(TypeParameterDescriptor typeParameter, ErasureTypeAttributes typeAttr) {
            Intrinsics.f(typeParameter, "typeParameter");
            Intrinsics.f(typeAttr, "typeAttr");
            this.f44544a = typeParameter;
            this.f44545b = typeAttr;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof DataToEraseUpperBound)) {
                return false;
            }
            DataToEraseUpperBound dataToEraseUpperBound = (DataToEraseUpperBound) obj;
            return Intrinsics.a(dataToEraseUpperBound.f44544a, this.f44544a) && Intrinsics.a(dataToEraseUpperBound.f44545b, this.f44545b);
        }

        public final int hashCode() {
            int iHashCode = this.f44544a.hashCode();
            return this.f44545b.hashCode() + (iHashCode * 31) + iHashCode;
        }

        public final String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.f44544a + ", typeAttr=" + this.f44545b + ')';
        }
    }

    public TypeParameterUpperBoundEraser(RawProjectionComputer rawProjectionComputer) {
        this.f44541a = rawProjectionComputer;
        LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("Type parameter upper bound erasure results");
        this.f44542b = LazyKt.b(new Function0<ErrorType>() { // from class: kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser$erroneousErasedBound$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ErrorUtils.c(ErrorTypeKind.CANNOT_COMPUTE_ERASED_BOUND, this.X.toString());
            }
        });
        this.f44543c = lockBasedStorageManager.g(new Function1<DataToEraseUpperBound, KotlinType>() { // from class: kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser$getErasedUpperBound$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                TypeParameterUpperBoundEraser.DataToEraseUpperBound dataToEraseUpperBound = (TypeParameterUpperBoundEraser.DataToEraseUpperBound) obj;
                TypeParameterDescriptor typeParameterDescriptor = dataToEraseUpperBound.f44544a;
                TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = this.X;
                typeParameterUpperBoundEraser.getClass();
                ErasureTypeAttributes erasureTypeAttributes = dataToEraseUpperBound.f44545b;
                Set setC = erasureTypeAttributes.c();
                if (setC != null && setC.contains(typeParameterDescriptor.y0())) {
                    return typeParameterUpperBoundEraser.a(erasureTypeAttributes);
                }
                SimpleType simpleTypeO = typeParameterDescriptor.o();
                Intrinsics.e(simpleTypeO, "typeParameter.defaultType");
                LinkedHashSet<TypeParameterDescriptor> linkedHashSet = new LinkedHashSet();
                TypeUtilsKt.e(simpleTypeO, simpleTypeO, linkedHashSet, setC);
                int iH = MapsKt.h(CollectionsKt.n(linkedHashSet, 10));
                if (iH < 16) {
                    iH = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
                for (TypeParameterDescriptor typeParameterDescriptor2 : linkedHashSet) {
                    linkedHashMap.put(typeParameterDescriptor2.h(), (setC == null || !setC.contains(typeParameterDescriptor2)) ? typeParameterUpperBoundEraser.f44541a.a(typeParameterDescriptor2, erasureTypeAttributes, typeParameterUpperBoundEraser, typeParameterUpperBoundEraser.b(typeParameterDescriptor2, erasureTypeAttributes.d(typeParameterDescriptor))) : TypeUtils.k(typeParameterDescriptor2, erasureTypeAttributes));
                }
                TypeSubstitutor typeSubstitutor = new TypeSubstitutor(new TypeConstructorSubstitution$Companion$createByConstructorsMap$1(linkedHashMap));
                List upperBounds = typeParameterDescriptor.getUpperBounds();
                Intrinsics.e(upperBounds, "typeParameter.upperBounds");
                SetBuilder setBuilderC = typeParameterUpperBoundEraser.c(typeSubstitutor, upperBounds, erasureTypeAttributes);
                if (setBuilderC.X.isEmpty()) {
                    return typeParameterUpperBoundEraser.a(erasureTypeAttributes);
                }
                if (setBuilderC.X.j0 == 1) {
                    return (KotlinType) CollectionsKt.V(setBuilderC);
                }
                throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds");
            }
        });
    }

    public final UnwrappedType a(ErasureTypeAttributes erasureTypeAttributes) {
        UnwrappedType unwrappedTypeL;
        SimpleType simpleTypeA = erasureTypeAttributes.a();
        return (simpleTypeA == null || (unwrappedTypeL = TypeUtilsKt.l(simpleTypeA)) == null) ? (ErrorType) this.f44542b.getX() : unwrappedTypeL;
    }

    public final KotlinType b(TypeParameterDescriptor typeParameter, ErasureTypeAttributes typeAttr) {
        Intrinsics.f(typeParameter, "typeParameter");
        Intrinsics.f(typeAttr, "typeAttr");
        Object objInvoke = this.f44543c.invoke(new DataToEraseUpperBound(typeParameter, typeAttr));
        Intrinsics.e(objInvoke, "getErasedUpperBound(Data…typeParameter, typeAttr))");
        return (KotlinType) objInvoke;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:47:0x012d  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b8  */
    public final SetBuilder c(TypeSubstitutor typeSubstitutor, List list, ErasureTypeAttributes erasureTypeAttributes) {
        UnwrappedType unwrappedTypeD;
        SetBuilder setBuilder = new SetBuilder();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            KotlinType kotlinType = (KotlinType) it.next();
            ClassifierDescriptor classifierDescriptorC = kotlinType.H0().c();
            if (classifierDescriptorC instanceof ClassDescriptor) {
                Set setC = erasureTypeAttributes.c();
                UnwrappedType unwrappedTypeK0 = kotlinType.K0();
                if (unwrappedTypeK0 instanceof FlexibleType) {
                    FlexibleType flexibleType = (FlexibleType) unwrappedTypeK0;
                    SimpleType simpleTypeD = flexibleType.f44509Y;
                    if (!simpleTypeD.H0().getParameters().isEmpty() && simpleTypeD.H0().c() != null) {
                        List parameters = simpleTypeD.H0().getParameters();
                        Intrinsics.e(parameters, "constructor.parameters");
                        List<TypeParameterDescriptor> list2 = parameters;
                        ArrayList arrayList = new ArrayList(CollectionsKt.n(list2, 10));
                        for (TypeParameterDescriptor typeParameterDescriptor : list2) {
                            TypeProjection starProjectionImpl = (TypeProjection) CollectionsKt.B(typeParameterDescriptor.g(), kotlinType.F0());
                            boolean z2 = setC != null && setC.contains(typeParameterDescriptor);
                            if (starProjectionImpl == null || z2) {
                                starProjectionImpl = new StarProjectionImpl(typeParameterDescriptor);
                            } else {
                                TypeSubstitution typeSubstitutionF = typeSubstitutor.f();
                                KotlinType type = starProjectionImpl.getType();
                                Intrinsics.e(type, "argument.type");
                                if (typeSubstitutionF.d(type) == null) {
                                    starProjectionImpl = new StarProjectionImpl(typeParameterDescriptor);
                                }
                            }
                            arrayList.add(starProjectionImpl);
                        }
                        simpleTypeD = TypeSubstitutionKt.d(simpleTypeD, arrayList, null, 2);
                    }
                    SimpleType simpleTypeD2 = flexibleType.Z;
                    if (!simpleTypeD2.H0().getParameters().isEmpty() && simpleTypeD2.H0().c() != null) {
                        List parameters2 = simpleTypeD2.H0().getParameters();
                        Intrinsics.e(parameters2, "constructor.parameters");
                        List<TypeParameterDescriptor> list3 = parameters2;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.n(list3, 10));
                        for (TypeParameterDescriptor typeParameterDescriptor2 : list3) {
                            TypeProjection starProjectionImpl2 = (TypeProjection) CollectionsKt.B(typeParameterDescriptor2.g(), kotlinType.F0());
                            boolean z3 = setC != null && setC.contains(typeParameterDescriptor2);
                            if (starProjectionImpl2 == null || z3) {
                                starProjectionImpl2 = new StarProjectionImpl(typeParameterDescriptor2);
                            } else {
                                TypeSubstitution typeSubstitutionF2 = typeSubstitutor.f();
                                KotlinType type2 = starProjectionImpl2.getType();
                                Intrinsics.e(type2, "argument.type");
                                if (typeSubstitutionF2.d(type2) == null) {
                                    starProjectionImpl2 = new StarProjectionImpl(typeParameterDescriptor2);
                                }
                            }
                            arrayList2.add(starProjectionImpl2);
                        }
                        simpleTypeD2 = TypeSubstitutionKt.d(simpleTypeD2, arrayList2, null, 2);
                    }
                    unwrappedTypeD = KotlinTypeFactory.b(simpleTypeD, simpleTypeD2);
                } else {
                    if (!(unwrappedTypeK0 instanceof SimpleType)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    SimpleType simpleType = (SimpleType) unwrappedTypeK0;
                    if (simpleType.H0().getParameters().isEmpty() || simpleType.H0().c() == null) {
                        unwrappedTypeD = simpleType;
                    } else {
                        List parameters3 = simpleType.H0().getParameters();
                        Intrinsics.e(parameters3, "constructor.parameters");
                        List<TypeParameterDescriptor> list4 = parameters3;
                        ArrayList arrayList3 = new ArrayList(CollectionsKt.n(list4, 10));
                        for (TypeParameterDescriptor typeParameterDescriptor3 : list4) {
                            TypeProjection starProjectionImpl3 = (TypeProjection) CollectionsKt.B(typeParameterDescriptor3.g(), kotlinType.F0());
                            boolean z4 = setC != null && setC.contains(typeParameterDescriptor3);
                            if (starProjectionImpl3 == null || z4) {
                                starProjectionImpl3 = new StarProjectionImpl(typeParameterDescriptor3);
                            } else {
                                TypeSubstitution typeSubstitutionF3 = typeSubstitutor.f();
                                KotlinType type3 = starProjectionImpl3.getType();
                                Intrinsics.e(type3, "argument.type");
                                if (typeSubstitutionF3.d(type3) == null) {
                                    starProjectionImpl3 = new StarProjectionImpl(typeParameterDescriptor3);
                                }
                            }
                            arrayList3.add(starProjectionImpl3);
                        }
                        unwrappedTypeD = TypeSubstitutionKt.d(simpleType, arrayList3, null, 2);
                    }
                }
                setBuilder.add(typeSubstitutor.g(TypeWithEnhancementKt.b(unwrappedTypeD, unwrappedTypeK0), Variance.OUT_VARIANCE));
            } else if (classifierDescriptorC instanceof TypeParameterDescriptor) {
                Set setC2 = erasureTypeAttributes.c();
                if (setC2 == null || !setC2.contains(classifierDescriptorC)) {
                    List upperBounds = ((TypeParameterDescriptor) classifierDescriptorC).getUpperBounds();
                    Intrinsics.e(upperBounds, "declaration.upperBounds");
                    setBuilder.addAll(c(typeSubstitutor, upperBounds, erasureTypeAttributes));
                } else {
                    setBuilder.add(a(erasureTypeAttributes));
                }
            }
        }
        return SetsKt.a(setBuilder);
    }
}
