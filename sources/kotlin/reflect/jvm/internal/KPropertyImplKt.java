package kotlin.reflect.jvm.internal;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.calls.CallerImpl;
import kotlin.reflect.jvm.internal.calls.InlineClassAwareCallerKt;
import kotlin.reflect.jvm.internal.calls.InternalUnderlyingValOfInlineClass;
import kotlin.reflect.jvm.internal.calls.ThrowingCaller;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-reflection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class KPropertyImplKt {
    /* JADX WARN: Code duplicated, block: B:13:0x0033  */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
    public static final Caller a(KPropertyImpl.Accessor accessor, boolean z2) throws ClassNotFoundException {
        JvmFunctionSignature.KotlinFunction kotlinFunction;
        Method method;
        Caller boundInstance;
        JvmProtoBuf.JvmMethodSignature jvmMethodSignature;
        Caller boundStatic;
        if (KDeclarationContainerImpl.X.b(accessor.s().i0)) {
            return ThrowingCaller.f43452a;
        }
        ClassId classId = RuntimeTypeMapper.f43419a;
        JvmPropertySignature jvmPropertySignatureB = RuntimeTypeMapper.b(accessor.s().o());
        if (jvmPropertySignatureB instanceof JvmPropertySignature.KotlinProperty) {
            JvmPropertySignature.KotlinProperty kotlinProperty = (JvmPropertySignature.KotlinProperty) jvmPropertySignatureB;
            JvmProtoBuf.JvmPropertySignature jvmPropertySignature = kotlinProperty.f43384c;
            Method methodC = null;
            if (z2) {
                if ((jvmPropertySignature.f44140Y & 4) == 4) {
                    jvmMethodSignature = jvmPropertySignature.f0;
                } else {
                    jvmMethodSignature = null;
                }
            } else if ((jvmPropertySignature.f44140Y & 8) == 8) {
                jvmMethodSignature = jvmPropertySignature.g0;
            } else {
                jvmMethodSignature = null;
            }
            if (jvmMethodSignature != null) {
                KDeclarationContainerImpl kDeclarationContainerImpl = accessor.s().g0;
                int i2 = jvmMethodSignature.Z;
                NameResolver nameResolver = kotlinProperty.d;
                methodC = kDeclarationContainerImpl.c(nameResolver.getString(i2), nameResolver.getString(jvmMethodSignature.e0));
            }
            if (methodC != null) {
                if (!Modifier.isStatic(methodC.getModifiers())) {
                    boundStatic = accessor.q() ? new CallerImpl.Method.BoundInstance(d(accessor), methodC) : new CallerImpl.Method.Instance(methodC);
                } else if (accessor.s().o().getAnnotations().E0(UtilKt.f43420a)) {
                    boundStatic = accessor.q() ? new CallerImpl.Method.BoundJvmStaticInObject(methodC) : new CallerImpl.Method.JvmStaticInObject(methodC);
                } else {
                    boundStatic = accessor.q() ? new CallerImpl.Method.BoundStatic(d(accessor), methodC) : new CallerImpl.Method.Static(methodC);
                }
                boundInstance = boundStatic;
            } else if (InlineClassesUtilsKt.d(accessor.s().o()) && Intrinsics.a(accessor.s().o().getVisibility(), DescriptorVisibilities.d)) {
                Class clsE = InlineClassAwareCallerKt.e(accessor.s().o().d());
                if (clsE == null) {
                    throw new KotlinReflectionInternalError("Underlying property of inline class " + accessor.s() + " should have a field");
                }
                Method methodD = InlineClassAwareCallerKt.d(clsE, accessor.s().o());
                boundInstance = accessor.q() ? new InternalUnderlyingValOfInlineClass.Bound(d(accessor), methodD) : new InternalUnderlyingValOfInlineClass.Unbound(methodD, CollectionsKt.H(methodD.getDeclaringClass()));
            } else {
                Field field = (Field) accessor.s().k0.getX();
                if (field == null) {
                    throw new KotlinReflectionInternalError("No accessors or field is found for property " + accessor.s());
                }
                boundInstance = b(accessor, z2, field);
            }
        } else if (jvmPropertySignatureB instanceof JvmPropertySignature.JavaField) {
            boundInstance = b(accessor, z2, ((JvmPropertySignature.JavaField) jvmPropertySignatureB).f43379a);
        } else {
            if (!(jvmPropertySignatureB instanceof JvmPropertySignature.JavaMethodProperty)) {
                if (!(jvmPropertySignatureB instanceof JvmPropertySignature.MappedKotlinProperty)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (z2) {
                    kotlinFunction = ((JvmPropertySignature.MappedKotlinProperty) jvmPropertySignatureB).f43386a;
                } else {
                    kotlinFunction = ((JvmPropertySignature.MappedKotlinProperty) jvmPropertySignatureB).f43387b;
                    if (kotlinFunction == null) {
                        throw new KotlinReflectionInternalError("No setter found for property " + accessor.s());
                    }
                }
                KDeclarationContainerImpl kDeclarationContainerImpl2 = accessor.s().g0;
                JvmMemberSignature.Method method2 = kotlinFunction.f43377a;
                Method methodC2 = kDeclarationContainerImpl2.c(method2.f44152a, method2.f44153b);
                if (methodC2 != null) {
                    Modifier.isStatic(methodC2.getModifiers());
                    return accessor.q() ? new CallerImpl.Method.BoundInstance(d(accessor), methodC2) : new CallerImpl.Method.Instance(methodC2);
                }
                throw new KotlinReflectionInternalError("No accessor found for property " + accessor.s());
            }
            if (z2) {
                method = ((JvmPropertySignature.JavaMethodProperty) jvmPropertySignatureB).f43380a;
            } else {
                JvmPropertySignature.JavaMethodProperty javaMethodProperty = (JvmPropertySignature.JavaMethodProperty) jvmPropertySignatureB;
                method = javaMethodProperty.f43381b;
                if (method == null) {
                    throw new KotlinReflectionInternalError("No source found for setter of Java method property: " + javaMethodProperty.f43380a);
                }
            }
            boundInstance = accessor.q() ? new CallerImpl.Method.BoundInstance(d(accessor), method) : new CallerImpl.Method.Instance(method);
        }
        return InlineClassAwareCallerKt.b(boundInstance, accessor.r(), false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:32:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cf  */
    public static final CallerImpl b(KPropertyImpl.Accessor accessor, boolean z2, Field field) {
        PropertyDescriptor propertyDescriptorO = accessor.s().o();
        DeclarationDescriptor containingDeclaration = propertyDescriptorO.d();
        Intrinsics.e(containingDeclaration, "containingDeclaration");
        if (DescriptorUtils.l(containingDeclaration)) {
            DeclarationDescriptor declarationDescriptorD = containingDeclaration.d();
            if ((DescriptorUtils.n(declarationDescriptorD, ClassKind.f43559Y) || DescriptorUtils.n(declarationDescriptorD, ClassKind.f0)) && (!(propertyDescriptorO instanceof DeserializedPropertyDescriptor) || !JvmProtoBufUtil.d(((DeserializedPropertyDescriptor) propertyDescriptorO).B0))) {
                if (Modifier.isStatic(field.getModifiers())) {
                    if (accessor.s().o().getAnnotations().E0(UtilKt.f43420a)) {
                        if (z2) {
                        }
                    }
                    if (z2) {
                        if (accessor.q()) {
                        }
                    }
                    if (accessor.q()) {
                    }
                }
            }
        } else if (Modifier.isStatic(field.getModifiers())) {
            if (accessor.s().o().getAnnotations().E0(UtilKt.f43420a)) {
                return z2 ? new CallerImpl.FieldGetter.Static(field, false) : new CallerImpl.FieldSetter.Static(field, c(accessor), false);
            }
            if (z2) {
                return accessor.q() ? new CallerImpl.FieldGetter.BoundJvmStaticInObject(field, false) : new CallerImpl.FieldGetter.JvmStaticInObject(field, true);
            }
            return accessor.q() ? new CallerImpl.FieldSetter.BoundJvmStaticInObject(field, c(accessor), false) : new CallerImpl.FieldSetter.JvmStaticInObject(field, c(accessor), true);
        }
        if (z2) {
            if (accessor.q()) {
                return new CallerImpl.FieldGetter.BoundInstance(field, d(accessor));
            }
            Intrinsics.f(field, "field");
            return new CallerImpl.FieldGetter.Instance(field, true);
        }
        if (accessor.q()) {
            return new CallerImpl.FieldSetter.BoundInstance(field, c(accessor), d(accessor));
        }
        boolean zC = c(accessor);
        Intrinsics.f(field, "field");
        return new CallerImpl.FieldSetter.Instance(field, zC, true);
    }

    public static final boolean c(KPropertyImpl.Accessor accessor) {
        return !TypeUtils.e(accessor.s().o().getType());
    }

    public static final Object d(KPropertyImpl.Accessor accessor) {
        Intrinsics.f(accessor, "<this>");
        KPropertyImpl kPropertyImplS = accessor.s();
        return InlineClassAwareCallerKt.a(kPropertyImplS.j0, kPropertyImplS.o());
    }
}
