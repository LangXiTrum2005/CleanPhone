package kotlin.reflect.jvm.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KCallable;
import kotlin.reflect.KParameter;
import kotlin.reflect.KType;
import kotlin.reflect.KVisibility;
import kotlin.reflect.TypesJVMKt;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.KTypesJvm;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlin/reflect/jvm/internal/KCallableImpl;", "R", "Lkotlin/reflect/KCallable;", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;", "descriptor", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class KCallableImpl<R> implements KCallable<R>, KTypeParameterOwnerImpl {
    public final ReflectProperties.LazySoftVal X = ReflectProperties.a(null, new Function0<List<? extends Annotation>>() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_annotations$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UtilKt.d(this.X.o());
        }
    });

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final ReflectProperties.LazySoftVal f43388Y = ReflectProperties.a(null, new Function0<ArrayList<KParameter>>() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i2;
            KCallableImpl kCallableImpl = this.X;
            final CallableMemberDescriptor callableMemberDescriptorO = kCallableImpl.o();
            ArrayList arrayList = new ArrayList();
            final int i3 = 0;
            if (kCallableImpl.q()) {
                i2 = 0;
            } else {
                final ReceiverParameterDescriptor receiverParameterDescriptorG = UtilKt.g(callableMemberDescriptorO);
                if (receiverParameterDescriptorG != null) {
                    arrayList.add(new KParameterImpl(kCallableImpl, 0, KParameter.Kind.X, new Function0<ParameterDescriptor>() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1.1
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return receiverParameterDescriptorG;
                        }
                    }));
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                final ReceiverParameterDescriptor receiverParameterDescriptorJ = callableMemberDescriptorO.J();
                if (receiverParameterDescriptorJ != null) {
                    arrayList.add(new KParameterImpl(kCallableImpl, i2, KParameter.Kind.f43350Y, new Function0<ParameterDescriptor>() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1.2
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return receiverParameterDescriptorJ;
                        }
                    }));
                    i2++;
                }
            }
            int size = callableMemberDescriptorO.e().size();
            while (i3 < size) {
                arrayList.add(new KParameterImpl(kCallableImpl, i2, KParameter.Kind.Z, new Function0<ParameterDescriptor>() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Object obj = callableMemberDescriptorO.e().get(i3);
                        Intrinsics.e(obj, "descriptor.valueParameters[i]");
                        return (ParameterDescriptor) obj;
                    }
                }));
                i3++;
                i2++;
            }
            if (kCallableImpl.p() && (callableMemberDescriptorO instanceof JavaCallableMemberDescriptor) && arrayList.size() > 1) {
                CollectionsKt.a0(arrayList, new KCallableImpl$_parameters$1$invoke$$inlined$sortBy$1());
            }
            arrayList.trimToSize();
            return arrayList;
        }
    });
    public final ReflectProperties.LazySoftVal Z = ReflectProperties.a(null, new Function0<KTypeImpl>() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_returnType$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            final KCallableImpl kCallableImpl = this.X;
            KotlinType returnType = kCallableImpl.o().getReturnType();
            Intrinsics.c(returnType);
            return new KTypeImpl(returnType, new Function0<Type>() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_returnType$1.1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Type[] lowerBounds;
                    KCallableImpl kCallableImpl2 = kCallableImpl;
                    Type type = null;
                    if (kCallableImpl2.isSuspend()) {
                        Object objG = CollectionsKt.G(kCallableImpl2.c().getD());
                        ParameterizedType parameterizedType = objG instanceof ParameterizedType ? (ParameterizedType) objG : null;
                        if (Intrinsics.a(parameterizedType != null ? parameterizedType.getRawType() : null, Continuation.class)) {
                            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                            Intrinsics.e(actualTypeArguments, "continuationType.actualTypeArguments");
                            Object objK = ArraysKt.K(actualTypeArguments);
                            WildcardType wildcardType = objK instanceof WildcardType ? (WildcardType) objK : null;
                            if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                                type = (Type) ArraysKt.x(lowerBounds);
                            }
                        }
                    }
                    return type == null ? kCallableImpl2.c().getF43436b() : type;
                }
            });
        }
    });
    public final ReflectProperties.LazySoftVal e0 = ReflectProperties.a(null, new Function0<List<? extends KTypeParameterImpl>>() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_typeParameters$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            KCallableImpl kCallableImpl = this.X;
            List typeParameters = kCallableImpl.o().getTypeParameters();
            Intrinsics.e(typeParameters, "descriptor.typeParameters");
            List<TypeParameterDescriptor> list = typeParameters;
            ArrayList arrayList = new ArrayList(CollectionsKt.n(list, 10));
            for (TypeParameterDescriptor descriptor : list) {
                Intrinsics.e(descriptor, "descriptor");
                arrayList.add(new KTypeParameterImpl(kCallableImpl, descriptor));
            }
            return arrayList;
        }
    });
    public final ReflectProperties.LazySoftVal f0 = ReflectProperties.a(null, new Function0<Object[]>() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_absentArguments$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            KCallableImpl kCallableImpl = this.X;
            int size = (kCallableImpl.isSuspend() ? 1 : 0) + kCallableImpl.getParameters().size();
            int size2 = (kCallableImpl.getParameters().size() + 31) / 32;
            Object[] objArr = new Object[size + size2 + 1];
            for (KParameter kParameter : kCallableImpl.getParameters()) {
                if (kParameter.m()) {
                    KTypeImpl type = kParameter.getType();
                    FqName fqName = UtilKt.f43420a;
                    KotlinType kotlinType = type.X;
                    if (kotlinType == null || !InlineClassesUtilsKt.c(kotlinType)) {
                        int iG = kParameter.g();
                        KTypeImpl type2 = kParameter.getType();
                        Type typeI = type2.i();
                        if (typeI == null && (typeI = type2.i()) == null) {
                            typeI = TypesJVMKt.b(type2, false);
                        }
                        objArr[iG] = UtilKt.e(typeI);
                    }
                }
                if (kParameter.h()) {
                    objArr[kParameter.g()] = KCallableImpl.a(kParameter.getType());
                }
            }
            for (int i2 = 0; i2 < size2; i2++) {
                objArr[size + i2] = 0;
            }
            return objArr;
        }
    });

    public static Object a(KType kType) {
        Class clsB = JvmClassMappingKt.b(KTypesJvm.b(kType));
        if (clsB.isArray()) {
            Object objNewInstance = Array.newInstance(clsB.getComponentType(), 0);
            Intrinsics.e(objNewInstance, "type.jvmErasure.java.run…\"\n            )\n        }");
            return objNewInstance;
        }
        throw new KotlinReflectionInternalError("Cannot instantiate the default empty array of type " + clsB.getSimpleName() + ", because it is not an array type");
    }

    public abstract Caller c();

    @Override // kotlin.reflect.KCallable
    public final Object call(Object... args) throws IllegalCallableAccessException {
        Intrinsics.f(args, "args");
        try {
            return c().call(args);
        } catch (IllegalAccessException e2) {
            throw new IllegalCallableAccessException(e2);
        }
    }

    @Override // kotlin.reflect.KCallable
    public final Object callBy(Map args) throws IllegalCallableAccessException {
        Object objA;
        Intrinsics.f(args, "args");
        boolean z2 = false;
        if (p()) {
            List<KParameter> parameters = getParameters();
            ArrayList arrayList = new ArrayList(CollectionsKt.n(parameters, 10));
            for (KParameter kParameter : parameters) {
                if (args.containsKey(kParameter)) {
                    objA = args.get(kParameter);
                    if (objA == null) {
                        throw new IllegalArgumentException("Annotation argument value cannot be null (" + kParameter + ')');
                    }
                } else if (kParameter.m()) {
                    objA = null;
                } else {
                    if (!kParameter.h()) {
                        throw new IllegalArgumentException("No argument provided for a required parameter: " + kParameter);
                    }
                    objA = a(kParameter.getType());
                }
                arrayList.add(objA);
            }
            Caller callerN = n();
            if (callerN != null) {
                try {
                    return callerN.call(arrayList.toArray(new Object[0]));
                } catch (IllegalAccessException e2) {
                    throw new IllegalCallableAccessException(e2);
                }
            }
            throw new KotlinReflectionInternalError("This callable does not support a default call: " + o());
        }
        List<KParameter> parameters2 = getParameters();
        if (parameters2.isEmpty()) {
            try {
                return c().call(isSuspend() ? new Continuation[]{null} : new Continuation[0]);
            } catch (IllegalAccessException e3) {
                throw new IllegalCallableAccessException(e3);
            }
        }
        int size = (isSuspend() ? 1 : 0) + parameters2.size();
        Object[] objArr = (Object[]) ((Object[]) this.f0.invoke()).clone();
        if (isSuspend()) {
            objArr[parameters2.size()] = null;
        }
        int i2 = 0;
        for (KParameter kParameter2 : parameters2) {
            if (args.containsKey(kParameter2)) {
                objArr[kParameter2.g()] = args.get(kParameter2);
            } else if (kParameter2.m()) {
                int i3 = (i2 / 32) + size;
                Object obj = objArr[i3];
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Int");
                objArr[i3] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i2 % 32)));
                z2 = true;
            } else if (!kParameter2.h()) {
                throw new IllegalArgumentException("No argument provided for a required parameter: " + kParameter2);
            }
            if (kParameter2.getKind() == KParameter.Kind.Z) {
                i2++;
            }
        }
        if (!z2) {
            try {
                Caller callerC = c();
                Object[] objArrCopyOf = Arrays.copyOf(objArr, size);
                Intrinsics.e(objArrCopyOf, "copyOf(this, newSize)");
                return callerC.call(objArrCopyOf);
            } catch (IllegalAccessException e4) {
                throw new IllegalCallableAccessException(e4);
            }
        }
        Caller callerN2 = n();
        if (callerN2 != null) {
            try {
                return callerN2.call(objArr);
            } catch (IllegalAccessException e5) {
                throw new IllegalCallableAccessException(e5);
            }
        }
        throw new KotlinReflectionInternalError("This callable does not support a default call: " + o());
    }

    /* JADX INFO: renamed from: f */
    public abstract KDeclarationContainerImpl getG0();

    @Override // kotlin.reflect.KAnnotatedElement
    public final List getAnnotations() {
        Object objInvoke = this.X.invoke();
        Intrinsics.e(objInvoke, "_annotations()");
        return (List) objInvoke;
    }

    @Override // kotlin.reflect.KCallable
    public final List getParameters() {
        Object objInvoke = this.f43388Y.invoke();
        Intrinsics.e(objInvoke, "_parameters()");
        return (List) objInvoke;
    }

    @Override // kotlin.reflect.KCallable
    public final KType getReturnType() {
        Object objInvoke = this.Z.invoke();
        Intrinsics.e(objInvoke, "_returnType()");
        return (KType) objInvoke;
    }

    @Override // kotlin.reflect.KCallable
    public final List getTypeParameters() {
        Object objInvoke = this.e0.invoke();
        Intrinsics.e(objInvoke, "_typeParameters()");
        return (List) objInvoke;
    }

    @Override // kotlin.reflect.KCallable
    public final KVisibility getVisibility() {
        DescriptorVisibility visibility = o().getVisibility();
        Intrinsics.e(visibility, "descriptor.visibility");
        FqName fqName = UtilKt.f43420a;
        if (visibility.equals(DescriptorVisibilities.f43564e)) {
            return KVisibility.X;
        }
        if (visibility.equals(DescriptorVisibilities.f43563c)) {
            return KVisibility.f43356Y;
        }
        if (visibility.equals(DescriptorVisibilities.d)) {
            return KVisibility.Z;
        }
        if (visibility.equals(DescriptorVisibilities.f43561a) ? true : visibility.equals(DescriptorVisibilities.f43562b)) {
            return KVisibility.e0;
        }
        return null;
    }

    @Override // kotlin.reflect.KCallable
    public final boolean isAbstract() {
        return o().q() == Modality.e0;
    }

    @Override // kotlin.reflect.KCallable
    public final boolean isFinal() {
        return o().q() == Modality.X;
    }

    @Override // kotlin.reflect.KCallable
    public final boolean isOpen() {
        return o().q() == Modality.Z;
    }

    public abstract Caller n();

    public abstract CallableMemberDescriptor o();

    public final boolean p() {
        return Intrinsics.a(getH0(), "<init>") && getG0().getF43390Y().isAnnotation();
    }

    public abstract boolean q();
}
