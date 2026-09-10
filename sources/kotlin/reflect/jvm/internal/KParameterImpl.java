package kotlin.reflect.jvm.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/KParameterImpl;", "Lkotlin/reflect/KParameter;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class KParameterImpl implements KParameter {
    public static final /* synthetic */ KProperty[] f0;
    public final KCallableImpl X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f43410Y;
    public final KParameter.Kind Z;
    public final ReflectProperties.LazySoftVal e0;

    static {
        ReflectionFactory reflectionFactory = Reflection.f43333a;
        f0 = new KProperty[]{reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(KParameterImpl.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(KParameterImpl.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    }

    public KParameterImpl(KCallableImpl callable, int i2, KParameter.Kind kind, Function0 function0) {
        Intrinsics.f(callable, "callable");
        this.X = callable;
        this.f43410Y = i2;
        this.Z = kind;
        this.e0 = ReflectProperties.a(null, function0);
        ReflectProperties.a(null, new Function0<List<? extends Annotation>>() { // from class: kotlin.reflect.jvm.internal.KParameterImpl$annotations$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KProperty[] kPropertyArr = KParameterImpl.f0;
                return UtilKt.d(this.X.a());
            }
        });
    }

    public final ParameterDescriptor a() {
        KProperty kProperty = f0[0];
        Object objInvoke = this.e0.invoke();
        Intrinsics.e(objInvoke, "<get-descriptor>(...)");
        return (ParameterDescriptor) objInvoke;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof KParameterImpl)) {
            return false;
        }
        KParameterImpl kParameterImpl = (KParameterImpl) obj;
        if (Intrinsics.a(this.X, kParameterImpl.X)) {
            return this.f43410Y == kParameterImpl.f43410Y;
        }
        return false;
    }

    @Override // kotlin.reflect.KParameter
    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getF43410Y() {
        return this.f43410Y;
    }

    @Override // kotlin.reflect.KParameter
    /* JADX INFO: renamed from: getKind, reason: from getter */
    public final KParameter.Kind getZ() {
        return this.Z;
    }

    @Override // kotlin.reflect.KParameter
    public final String getName() {
        ParameterDescriptor parameterDescriptorA = a();
        ValueParameterDescriptor valueParameterDescriptor = parameterDescriptorA instanceof ValueParameterDescriptor ? (ValueParameterDescriptor) parameterDescriptorA : null;
        if (valueParameterDescriptor != null && !valueParameterDescriptor.d().Y()) {
            Name name = valueParameterDescriptor.getName();
            Intrinsics.e(name, "valueParameter.name");
            if (!name.f44171Y) {
                return name.b();
            }
        }
        return null;
    }

    @Override // kotlin.reflect.KParameter
    public final KTypeImpl getType() {
        KotlinType type = a().getType();
        Intrinsics.e(type, "descriptor.type");
        return new KTypeImpl(type, new Function0<Type>() { // from class: kotlin.reflect.jvm.internal.KParameterImpl$type$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KProperty[] kPropertyArr = KParameterImpl.f0;
                KParameterImpl kParameterImpl = this.X;
                ParameterDescriptor parameterDescriptorA = kParameterImpl.a();
                boolean z2 = parameterDescriptorA instanceof ReceiverParameterDescriptor;
                KCallableImpl kCallableImpl = kParameterImpl.X;
                if (!z2 || !Intrinsics.a(UtilKt.g(kCallableImpl.o()), parameterDescriptorA) || kCallableImpl.o().getKind() != CallableMemberDescriptor.Kind.f43557Y) {
                    return (Type) kCallableImpl.c().getD().get(kParameterImpl.f43410Y);
                }
                DeclarationDescriptor declarationDescriptorD = kCallableImpl.o().d();
                Intrinsics.d(declarationDescriptorD, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                Class clsJ = UtilKt.j((ClassDescriptor) declarationDescriptorD);
                if (clsJ != null) {
                    return clsJ;
                }
                throw new KotlinReflectionInternalError("Cannot determine receiver Java type of inherited declaration: " + parameterDescriptorA);
            }
        });
    }

    @Override // kotlin.reflect.KParameter
    public final boolean h() {
        ParameterDescriptor parameterDescriptorA = a();
        return (parameterDescriptorA instanceof ValueParameterDescriptor) && ((ValueParameterDescriptor) parameterDescriptorA).o0() != null;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f43410Y) + (this.X.hashCode() * 31);
    }

    @Override // kotlin.reflect.KParameter
    public final boolean m() {
        ParameterDescriptor parameterDescriptorA = a();
        ValueParameterDescriptor valueParameterDescriptor = parameterDescriptorA instanceof ValueParameterDescriptor ? (ValueParameterDescriptor) parameterDescriptorA : null;
        if (valueParameterDescriptor != null) {
            return DescriptorUtilsKt.a(valueParameterDescriptor);
        }
        return false;
    }

    public final String toString() {
        String strB;
        DescriptorRendererImpl descriptorRendererImpl = ReflectionObjectRenderer.f43418a;
        StringBuilder sb = new StringBuilder();
        int iOrdinal = this.Z.ordinal();
        if (iOrdinal == 0) {
            sb.append("instance parameter");
        } else if (iOrdinal == 1) {
            sb.append("extension receiver parameter");
        } else if (iOrdinal == 2) {
            sb.append("parameter #" + this.f43410Y + ' ' + getName());
        }
        sb.append(" of ");
        CallableMemberDescriptor callableMemberDescriptorO = this.X.o();
        if (callableMemberDescriptorO instanceof PropertyDescriptor) {
            strB = ReflectionObjectRenderer.c((PropertyDescriptor) callableMemberDescriptorO);
        } else {
            if (!(callableMemberDescriptorO instanceof FunctionDescriptor)) {
                throw new IllegalStateException(("Illegal callable: " + callableMemberDescriptorO).toString());
            }
            strB = ReflectionObjectRenderer.b((FunctionDescriptor) callableMemberDescriptorO);
        }
        sb.append(strB);
        String string = sb.toString();
        Intrinsics.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
