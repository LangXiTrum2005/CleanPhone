package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.TypeParameterReference;
import kotlin.reflect.KProperty;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "Lkotlin/reflect/KTypeParameter;", "Lkotlin/reflect/jvm/internal/KClassifierImpl;", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/TypeParameterDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class KTypeParameterImpl implements KTypeParameter, KClassifierImpl {
    public static final /* synthetic */ KProperty[] e0;
    public final TypeParameterDescriptor X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final ReflectProperties.LazySoftVal f43414Y;
    public final KTypeParameterOwnerImpl Z;

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

    static {
        ReflectionFactory reflectionFactory = Reflection.f43333a;
        e0 = new KProperty[]{reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(KTypeParameterImpl.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};
    }

    public KTypeParameterImpl(KTypeParameterOwnerImpl kTypeParameterOwnerImpl, TypeParameterDescriptor descriptor) {
        Class cls;
        KClassImpl kClassImplA;
        Object objV;
        Intrinsics.f(descriptor, "descriptor");
        this.X = descriptor;
        this.f43414Y = ReflectProperties.a(null, new Function0<List<? extends KTypeImpl>>() { // from class: kotlin.reflect.jvm.internal.KTypeParameterImpl$upperBounds$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List upperBounds = this.X.X.getUpperBounds();
                Intrinsics.e(upperBounds, "descriptor.upperBounds");
                List list = upperBounds;
                ArrayList arrayList = new ArrayList(CollectionsKt.n(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new KTypeImpl((KotlinType) it.next(), null));
                }
                return arrayList;
            }
        });
        if (kTypeParameterOwnerImpl == null) {
            DeclarationDescriptor declarationDescriptorD = descriptor.d();
            Intrinsics.e(declarationDescriptorD, "descriptor.containingDeclaration");
            if (declarationDescriptorD instanceof ClassDescriptor) {
                objV = a((ClassDescriptor) declarationDescriptorD);
            } else {
                if (!(declarationDescriptorD instanceof CallableMemberDescriptor)) {
                    throw new KotlinReflectionInternalError("Unknown type parameter container: " + declarationDescriptorD);
                }
                DeclarationDescriptor declarationDescriptorD2 = ((CallableMemberDescriptor) declarationDescriptorD).d();
                Intrinsics.e(declarationDescriptorD2, "declaration.containingDeclaration");
                if (declarationDescriptorD2 instanceof ClassDescriptor) {
                    kClassImplA = a((ClassDescriptor) declarationDescriptorD2);
                } else {
                    DeserializedMemberDescriptor deserializedMemberDescriptor = declarationDescriptorD instanceof DeserializedMemberDescriptor ? (DeserializedMemberDescriptor) declarationDescriptorD : null;
                    if (deserializedMemberDescriptor == null) {
                        throw new KotlinReflectionInternalError("Non-class callable descriptor must be deserialized: " + declarationDescriptorD);
                    }
                    DeserializedContainerSource deserializedContainerSourceE = deserializedMemberDescriptor.E();
                    JvmPackagePartSource jvmPackagePartSource = deserializedContainerSourceE instanceof JvmPackagePartSource ? (JvmPackagePartSource) deserializedContainerSourceE : null;
                    KotlinJvmBinaryClass kotlinJvmBinaryClass = jvmPackagePartSource != null ? jvmPackagePartSource.d : null;
                    ReflectKotlinClass reflectKotlinClass = kotlinJvmBinaryClass instanceof ReflectKotlinClass ? (ReflectKotlinClass) kotlinJvmBinaryClass : null;
                    if (reflectKotlinClass == null || (cls = reflectKotlinClass.f43673a) == null) {
                        throw new KotlinReflectionInternalError("Container of deserialized member is not resolved: " + deserializedMemberDescriptor);
                    }
                    kClassImplA = (KClassImpl) JvmClassMappingKt.e(cls);
                }
                objV = declarationDescriptorD.v(new CreateKCallableVisitor(kClassImplA), Unit.f43263a);
            }
            Intrinsics.e(objV, "when (val declaration = … $declaration\")\n        }");
            kTypeParameterOwnerImpl = (KTypeParameterOwnerImpl) objV;
        }
        this.Z = kTypeParameterOwnerImpl;
    }

    public static KClassImpl a(ClassDescriptor classDescriptor) {
        Class clsJ = UtilKt.j(classDescriptor);
        KClassImpl kClassImpl = (KClassImpl) (clsJ != null ? JvmClassMappingKt.e(clsJ) : null);
        if (kClassImpl != null) {
            return kClassImpl;
        }
        throw new KotlinReflectionInternalError("Type parameter container is not resolved: " + classDescriptor.d());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof KTypeParameterImpl)) {
            return false;
        }
        KTypeParameterImpl kTypeParameterImpl = (KTypeParameterImpl) obj;
        return Intrinsics.a(this.Z, kTypeParameterImpl.Z) && getName().equals(kTypeParameterImpl.getName());
    }

    @Override // kotlin.reflect.jvm.internal.KClassifierImpl
    public final ClassifierDescriptor getDescriptor() {
        return this.X;
    }

    @Override // kotlin.reflect.KTypeParameter
    public final String getName() {
        String strB = this.X.getName().b();
        Intrinsics.e(strB, "descriptor.name.asString()");
        return strB;
    }

    @Override // kotlin.reflect.KTypeParameter
    public final List getUpperBounds() {
        KProperty kProperty = e0[0];
        Object objInvoke = this.f43414Y.invoke();
        Intrinsics.e(objInvoke, "<get-upperBounds>(...)");
        return (List) objInvoke;
    }

    public final int hashCode() {
        return getName().hashCode() + (this.Z.hashCode() * 31);
    }

    @Override // kotlin.reflect.KTypeParameter
    public final KVariance j() {
        int iOrdinal = this.X.j().ordinal();
        if (iOrdinal == 0) {
            return KVariance.X;
        }
        if (iOrdinal == 1) {
            return KVariance.f43355Y;
        }
        if (iOrdinal == 2) {
            return KVariance.Z;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String toString() {
        return TypeParameterReference.Companion.a(this);
    }
}
