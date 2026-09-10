package kotlin.reflect.jvm.internal;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.KTypeBase;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KProperty;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.KTypesJvm;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\u0012\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/KTypeImpl;", "Lkotlin/jvm/internal/KTypeBase;", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "type", "Lkotlin/Function0;", "Ljava/lang/reflect/Type;", "computeJavaType", "<init>", "(Lorg/jetbrains/kotlin/types/KotlinType;Lkotlin/jvm/functions/Function0;)V", "", "parameterizedTypeArguments", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class KTypeImpl implements KTypeBase {
    public static final /* synthetic */ KProperty[] f0;
    public final KotlinType X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final ReflectProperties.LazySoftVal f43411Y;
    public final ReflectProperties.LazySoftVal Z;
    public final ReflectProperties.LazySoftVal e0;

    static {
        ReflectionFactory reflectionFactory = Reflection.f43333a;
        f0 = new KProperty[]{reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(KTypeImpl.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(KTypeImpl.class), "arguments", "getArguments()Ljava/util/List;"))};
    }

    public KTypeImpl(KotlinType type, final Function0 function0) {
        Intrinsics.f(type, "type");
        this.X = type;
        ReflectProperties.LazySoftVal lazySoftVal = function0 instanceof ReflectProperties.LazySoftVal ? (ReflectProperties.LazySoftVal) function0 : null;
        this.f43411Y = lazySoftVal == null ? function0 != null ? ReflectProperties.a(null, function0) : null : lazySoftVal;
        this.Z = ReflectProperties.a(null, new Function0<KClassifier>() { // from class: kotlin.reflect.jvm.internal.KTypeImpl$classifier$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KTypeImpl kTypeImpl = this.X;
                return kTypeImpl.a(kTypeImpl.X);
            }
        });
        this.e0 = ReflectProperties.a(null, new Function0<List<? extends KTypeProjection>>(function0) { // from class: kotlin.reflect.jvm.internal.KTypeImpl$arguments$2

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ Lambda f43412Y;

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                static {
                    int[] iArr = new int[Variance.values().length];
                    try {
                        iArr[0] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[1] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[2] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f43412Y = (Lambda) function0;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KTypeProjection kTypeProjectionA;
                final KTypeImpl kTypeImpl = this.X;
                List listF0 = kTypeImpl.X.F0();
                if (listF0.isEmpty()) {
                    return EmptyList.X;
                }
                final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.f43248Y, new Function0<List<? extends Type>>() { // from class: kotlin.reflect.jvm.internal.KTypeImpl$arguments$2$parameterizedTypeArguments$2
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Type typeI = kTypeImpl.i();
                        Intrinsics.c(typeI);
                        return ReflectClassUtilKt.c(typeI);
                    }
                });
                List list = listF0;
                ArrayList arrayList = new ArrayList(CollectionsKt.n(list, 10));
                final int i2 = 0;
                for (Object obj : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.f0();
                        throw null;
                    }
                    TypeProjection typeProjection = (TypeProjection) obj;
                    if (typeProjection.a()) {
                        kTypeProjectionA = KTypeProjection.f43351c;
                    } else {
                        KotlinType type2 = typeProjection.getType();
                        Intrinsics.e(type2, "typeProjection.type");
                        KTypeImpl kTypeImpl2 = new KTypeImpl(type2, this.f43412Y != null ? new Function0<Type>() { // from class: kotlin.reflect.jvm.internal.KTypeImpl$arguments$2$1$type$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                KTypeImpl kTypeImpl3 = kTypeImpl;
                                Type typeI = kTypeImpl3.i();
                                if (typeI instanceof Class) {
                                    Class cls = (Class) typeI;
                                    Class<?> componentType = cls.isArray() ? cls.getComponentType() : Object.class;
                                    Intrinsics.e(componentType, "{\n                      …                        }");
                                    return componentType;
                                }
                                boolean z2 = typeI instanceof GenericArrayType;
                                int i4 = i2;
                                if (z2) {
                                    if (i4 == 0) {
                                        Type genericComponentType = ((GenericArrayType) typeI).getGenericComponentType();
                                        Intrinsics.e(genericComponentType, "{\n                      …                        }");
                                        return genericComponentType;
                                    }
                                    throw new KotlinReflectionInternalError("Array type has been queried for a non-0th argument: " + kTypeImpl3);
                                }
                                if (!(typeI instanceof ParameterizedType)) {
                                    throw new KotlinReflectionInternalError("Non-generic type has been queried for arguments: " + kTypeImpl3);
                                }
                                Type type3 = (Type) ((List) lazyA.getX()).get(i4);
                                if (type3 instanceof WildcardType) {
                                    WildcardType wildcardType = (WildcardType) type3;
                                    Type[] lowerBounds = wildcardType.getLowerBounds();
                                    Intrinsics.e(lowerBounds, "argument.lowerBounds");
                                    Type type4 = (Type) ArraysKt.y(lowerBounds);
                                    if (type4 == null) {
                                        Type[] upperBounds = wildcardType.getUpperBounds();
                                        Intrinsics.e(upperBounds, "argument.upperBounds");
                                        type3 = (Type) ArraysKt.x(upperBounds);
                                    } else {
                                        type3 = type4;
                                    }
                                }
                                Intrinsics.e(type3, "{\n                      …                        }");
                                return type3;
                            }
                        } : null);
                        int iOrdinal = typeProjection.b().ordinal();
                        if (iOrdinal == 0) {
                            KTypeProjection kTypeProjection = KTypeProjection.f43351c;
                            kTypeProjectionA = KTypeProjection.Companion.a(kTypeImpl2);
                        } else if (iOrdinal == 1) {
                            kTypeProjectionA = new KTypeProjection(KVariance.f43355Y, kTypeImpl2);
                        } else {
                            if (iOrdinal != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            kTypeProjectionA = new KTypeProjection(KVariance.Z, kTypeImpl2);
                        }
                    }
                    arrayList.add(kTypeProjectionA);
                    i2 = i3;
                }
                return arrayList;
            }
        });
    }

    public final KClassifier a(KotlinType kotlinType) {
        KotlinType type;
        ClassifierDescriptor classifierDescriptorC = kotlinType.H0().c();
        if (classifierDescriptorC instanceof ClassDescriptor) {
            Class clsJ = UtilKt.j((ClassDescriptor) classifierDescriptorC);
            if (clsJ != null) {
                if (!clsJ.isArray()) {
                    if (TypeUtils.e(kotlinType)) {
                        return new KClassImpl(clsJ);
                    }
                    Class cls = (Class) ReflectClassUtilKt.f43694b.get(clsJ);
                    if (cls != null) {
                        clsJ = cls;
                    }
                    return new KClassImpl(clsJ);
                }
                TypeProjection typeProjection = (TypeProjection) CollectionsKt.Y(kotlinType.F0());
                if (typeProjection == null || (type = typeProjection.getType()) == null) {
                    return new KClassImpl(clsJ);
                }
                KClassifier kClassifierA = a(type);
                if (kClassifierA != null) {
                    return new KClassImpl(Array.newInstance((Class<?>) JvmClassMappingKt.b(KTypesJvm.a(kClassifierA)), 0).getClass());
                }
                throw new KotlinReflectionInternalError("Cannot determine classifier for array element type: " + this);
            }
        } else {
            if (classifierDescriptorC instanceof TypeParameterDescriptor) {
                return new KTypeParameterImpl(null, (TypeParameterDescriptor) classifierDescriptorC);
            }
            if (classifierDescriptorC instanceof TypeAliasDescriptor) {
                throw new NotImplementedError("An operation is not implemented: Type alias classifiers are not yet supported");
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof KTypeImpl)) {
            return false;
        }
        KTypeImpl kTypeImpl = (KTypeImpl) obj;
        return Intrinsics.a(this.X, kTypeImpl.X) && Intrinsics.a(getX(), kTypeImpl.getX()) && getF43338Y().equals(kTypeImpl.getF43338Y());
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public final List getAnnotations() {
        return UtilKt.d(this.X);
    }

    @Override // kotlin.reflect.KType
    /* JADX INFO: renamed from: getArguments */
    public final List getF43338Y() {
        KProperty kProperty = f0[1];
        Object objInvoke = this.e0.invoke();
        Intrinsics.e(objInvoke, "<get-arguments>(...)");
        return (List) objInvoke;
    }

    @Override // kotlin.reflect.KType
    /* JADX INFO: renamed from: getClassifier */
    public final KClassifier getX() {
        KProperty kProperty = f0[0];
        return (KClassifier) this.Z.invoke();
    }

    public final int hashCode() {
        int iHashCode = this.X.hashCode() * 31;
        KClassifier classifier = getX();
        return getF43338Y().hashCode() + ((iHashCode + (classifier != null ? classifier.hashCode() : 0)) * 31);
    }

    @Override // kotlin.jvm.internal.KTypeBase
    public final Type i() {
        ReflectProperties.LazySoftVal lazySoftVal = this.f43411Y;
        if (lazySoftVal != null) {
            return (Type) lazySoftVal.invoke();
        }
        return null;
    }

    @Override // kotlin.reflect.KType
    public final boolean isMarkedNullable() {
        return this.X.I0();
    }

    public final String toString() {
        DescriptorRendererImpl descriptorRendererImpl = ReflectionObjectRenderer.f43418a;
        return ReflectionObjectRenderer.d(this.X);
    }
}
