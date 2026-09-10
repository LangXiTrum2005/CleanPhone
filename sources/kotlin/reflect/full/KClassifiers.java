package kotlin.reflect.full;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.KClassifierImpl;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionBase;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-reflection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class KClassifiers {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43362a;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                KVariance kVariance = KVariance.X;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KVariance kVariance2 = KVariance.X;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                KVariance kVariance3 = KVariance.X;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f43362a = iArr;
        }
    }

    public static final KTypeImpl a(KClass kClass, List arguments, boolean z2, List annotations) {
        ClassifierDescriptor descriptor;
        TypeAttributes typeAttributes;
        TypeProjectionBase starProjectionImpl;
        Intrinsics.f(kClass, "<this>");
        Intrinsics.f(arguments, "arguments");
        Intrinsics.f(annotations, "annotations");
        KClassifierImpl kClassifierImpl = kClass instanceof KClassifierImpl ? (KClassifierImpl) kClass : null;
        if (kClassifierImpl == null || (descriptor = kClassifierImpl.getDescriptor()) == null) {
            throw new KotlinReflectionInternalError("Cannot create type for an unsupported classifier: " + kClass + " (" + kClass.getClass() + ')');
        }
        TypeConstructor typeConstructorH = descriptor.h();
        Intrinsics.e(typeConstructorH, "descriptor.typeConstructor");
        List parameters = typeConstructorH.getParameters();
        Intrinsics.e(parameters, "typeConstructor.parameters");
        if (parameters.size() != arguments.size()) {
            throw new IllegalArgumentException("Class declares " + parameters.size() + " type parameters, but " + arguments.size() + " were provided.");
        }
        if (annotations.isEmpty()) {
            TypeAttributes.f44529Y.getClass();
            typeAttributes = TypeAttributes.Z;
        } else {
            TypeAttributes.f44529Y.getClass();
            typeAttributes = TypeAttributes.Z;
        }
        List parameters2 = typeConstructorH.getParameters();
        Intrinsics.e(parameters2, "typeConstructor.parameters");
        List list = arguments;
        ArrayList arrayList = new ArrayList(CollectionsKt.n(list, 10));
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.f0();
                throw null;
            }
            KTypeProjection kTypeProjection = (KTypeProjection) obj;
            KTypeImpl kTypeImpl = (KTypeImpl) kTypeProjection.f43353b;
            KotlinType kotlinType = kTypeImpl != null ? kTypeImpl.X : null;
            KVariance kVariance = kTypeProjection.f43352a;
            int i4 = kVariance == null ? -1 : WhenMappings.f43362a[kVariance.ordinal()];
            if (i4 == -1) {
                Object obj2 = parameters2.get(i2);
                Intrinsics.e(obj2, "parameters[index]");
                starProjectionImpl = new StarProjectionImpl((TypeParameterDescriptor) obj2);
            } else if (i4 == 1) {
                Variance variance = Variance.INVARIANT;
                Intrinsics.c(kotlinType);
                starProjectionImpl = new TypeProjectionImpl(kotlinType, variance);
            } else if (i4 == 2) {
                Variance variance2 = Variance.IN_VARIANCE;
                Intrinsics.c(kotlinType);
                starProjectionImpl = new TypeProjectionImpl(kotlinType, variance2);
            } else {
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Variance variance3 = Variance.OUT_VARIANCE;
                Intrinsics.c(kotlinType);
                starProjectionImpl = new TypeProjectionImpl(kotlinType, variance3);
            }
            arrayList.add(starProjectionImpl);
            i2 = i3;
        }
        return new KTypeImpl(KotlinTypeFactory.d(typeAttributes, typeConstructorH, arrayList, z2, null), null);
    }
}
