package kotlin.reflect.jvm.internal;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.CloneableClassScope;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaConstructor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaElement;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaField;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedCallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u0006\u0012\u0002\b\u00030\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;", "", "Ljava/lang/Class;", "Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;", "getPrimitiveType", "(Ljava/lang/Class;)Lorg/jetbrains/kotlin/builtins/PrimitiveType;", "primitiveType", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RuntimeTypeMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ClassId f43419a = ClassId.j(new FqName("java.lang.Void"));

    public static JvmFunctionSignature.KotlinFunction a(FunctionDescriptor functionDescriptor) {
        String strA = SpecialBuiltinMembers.a(functionDescriptor);
        if (strA == null) {
            if (functionDescriptor instanceof PropertyGetterDescriptor) {
                String strB = DescriptorUtilsKt.l(functionDescriptor).getName().b();
                Intrinsics.e(strB, "descriptor.propertyIfAccessor.name.asString()");
                strA = JvmAbi.a(strB);
            } else if (functionDescriptor instanceof PropertySetterDescriptor) {
                String strB2 = DescriptorUtilsKt.l(functionDescriptor).getName().b();
                Intrinsics.e(strB2, "descriptor.propertyIfAccessor.name.asString()");
                strA = JvmAbi.b(strB2);
            } else {
                strA = functionDescriptor.getName().b();
                Intrinsics.e(strA, "descriptor.name.asString()");
            }
        }
        return new JvmFunctionSignature.KotlinFunction(new JvmMemberSignature.Method(strA, MethodSignatureMappingKt.a(functionDescriptor, 1)));
    }

    public static JvmPropertySignature b(PropertyDescriptor possiblyOverriddenProperty) {
        Intrinsics.f(possiblyOverriddenProperty, "possiblyOverriddenProperty");
        PropertyDescriptor propertyDescriptorY0 = ((PropertyDescriptor) DescriptorUtils.t(possiblyOverriddenProperty)).y0();
        Intrinsics.e(propertyDescriptorY0, "unwrapFakeOverride(possi…rriddenProperty).original");
        if (propertyDescriptorY0 instanceof DeserializedPropertyDescriptor) {
            DeserializedPropertyDescriptor deserializedPropertyDescriptor = (DeserializedPropertyDescriptor) propertyDescriptorY0;
            GeneratedMessageLite.GeneratedExtension propertySignature = JvmProtoBuf.d;
            Intrinsics.e(propertySignature, "propertySignature");
            ProtoBuf.Property property = deserializedPropertyDescriptor.B0;
            JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) ProtoBufUtilKt.a(property, propertySignature);
            if (jvmPropertySignature != null) {
                return new JvmPropertySignature.KotlinProperty(propertyDescriptorY0, property, jvmPropertySignature, deserializedPropertyDescriptor.C0, deserializedPropertyDescriptor.D0);
            }
        } else if (propertyDescriptorY0 instanceof JavaPropertyDescriptor) {
            SourceElement sourceElementF = ((JavaPropertyDescriptor) propertyDescriptorY0).f();
            JavaSourceElement javaSourceElement = sourceElementF instanceof JavaSourceElement ? (JavaSourceElement) sourceElementF : null;
            ReflectJavaElement reflectJavaElementA = javaSourceElement != null ? javaSourceElement.a() : null;
            if (reflectJavaElementA instanceof ReflectJavaField) {
                return new JvmPropertySignature.JavaField(((ReflectJavaField) reflectJavaElementA).f43709a);
            }
            if (!(reflectJavaElementA instanceof ReflectJavaMethod)) {
                throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java field " + propertyDescriptorY0 + " (source = " + reflectJavaElementA + ')');
            }
            Method method = ((ReflectJavaMethod) reflectJavaElementA).f43711a;
            PropertySetterDescriptor setter = propertyDescriptorY0.getSetter();
            SourceElement sourceElementF2 = setter != null ? setter.f() : null;
            JavaSourceElement javaSourceElement2 = sourceElementF2 instanceof JavaSourceElement ? (JavaSourceElement) sourceElementF2 : null;
            ReflectJavaElement reflectJavaElementA2 = javaSourceElement2 != null ? javaSourceElement2.a() : null;
            ReflectJavaMethod reflectJavaMethod = reflectJavaElementA2 instanceof ReflectJavaMethod ? (ReflectJavaMethod) reflectJavaElementA2 : null;
            return new JvmPropertySignature.JavaMethodProperty(method, reflectJavaMethod != null ? reflectJavaMethod.f43711a : null);
        }
        PropertyGetterDescriptorImpl getter = propertyDescriptorY0.getGetter();
        Intrinsics.c(getter);
        JvmFunctionSignature.KotlinFunction kotlinFunctionA = a(getter);
        PropertySetterDescriptor setter2 = propertyDescriptorY0.getSetter();
        return new JvmPropertySignature.MappedKotlinProperty(kotlinFunctionA, setter2 != null ? a(setter2) : null);
    }

    public static JvmFunctionSignature c(FunctionDescriptor possiblySubstitutedFunction) {
        Method method;
        Intrinsics.f(possiblySubstitutedFunction, "possiblySubstitutedFunction");
        FunctionDescriptor functionDescriptorY0 = ((FunctionDescriptor) DescriptorUtils.t(possiblySubstitutedFunction)).y0();
        Intrinsics.e(functionDescriptorY0, "unwrapFakeOverride(possi…titutedFunction).original");
        if (functionDescriptorY0 instanceof DeserializedCallableMemberDescriptor) {
            DeserializedCallableMemberDescriptor deserializedCallableMemberDescriptor = (DeserializedCallableMemberDescriptor) functionDescriptorY0;
            MessageLite messageLiteX = deserializedCallableMemberDescriptor.X();
            if (messageLiteX instanceof ProtoBuf.Function) {
                ExtensionRegistryLite extensionRegistryLite = JvmProtoBufUtil.f44158a;
                JvmMemberSignature.Method methodC = JvmProtoBufUtil.c((ProtoBuf.Function) messageLiteX, deserializedCallableMemberDescriptor.D(), deserializedCallableMemberDescriptor.A());
                if (methodC != null) {
                    return new JvmFunctionSignature.KotlinFunction(methodC);
                }
            }
            if (messageLiteX instanceof ProtoBuf.Constructor) {
                ExtensionRegistryLite extensionRegistryLite2 = JvmProtoBufUtil.f44158a;
                JvmMemberSignature.Method methodA = JvmProtoBufUtil.a((ProtoBuf.Constructor) messageLiteX, deserializedCallableMemberDescriptor.D(), deserializedCallableMemberDescriptor.A());
                if (methodA != null) {
                    DeclarationDescriptor declarationDescriptorD = possiblySubstitutedFunction.d();
                    Intrinsics.e(declarationDescriptorD, "possiblySubstitutedFunction.containingDeclaration");
                    return InlineClassesUtilsKt.b(declarationDescriptorD) ? new JvmFunctionSignature.KotlinFunction(methodA) : new JvmFunctionSignature.KotlinConstructor(methodA);
                }
            }
            return a(functionDescriptorY0);
        }
        if (functionDescriptorY0 instanceof JavaMethodDescriptor) {
            SourceElement sourceElementF = ((JavaMethodDescriptor) functionDescriptorY0).f();
            JavaSourceElement javaSourceElement = sourceElementF instanceof JavaSourceElement ? (JavaSourceElement) sourceElementF : null;
            ReflectJavaElement reflectJavaElementA = javaSourceElement != null ? javaSourceElement.a() : null;
            ReflectJavaMethod reflectJavaMethod = reflectJavaElementA instanceof ReflectJavaMethod ? (ReflectJavaMethod) reflectJavaElementA : null;
            if (reflectJavaMethod != null && (method = reflectJavaMethod.f43711a) != null) {
                return new JvmFunctionSignature.JavaMethod(method);
            }
            throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java method " + functionDescriptorY0);
        }
        if (!(functionDescriptorY0 instanceof JavaClassConstructorDescriptor)) {
            if ((functionDescriptorY0.getName().equals(StandardNames.f43474c) && DescriptorFactory.l(functionDescriptorY0)) || ((functionDescriptorY0.getName().equals(StandardNames.f43472a) && DescriptorFactory.l(functionDescriptorY0)) || (Intrinsics.a(functionDescriptorY0.getName(), CloneableClassScope.f43520e) && functionDescriptorY0.e().isEmpty()))) {
                return a(functionDescriptorY0);
            }
            throw new KotlinReflectionInternalError("Unknown origin of " + functionDescriptorY0 + " (" + functionDescriptorY0.getClass() + ')');
        }
        SourceElement sourceElementF2 = ((JavaClassConstructorDescriptor) functionDescriptorY0).f();
        JavaSourceElement javaSourceElement2 = sourceElementF2 instanceof JavaSourceElement ? (JavaSourceElement) sourceElementF2 : null;
        ReflectJavaElement reflectJavaElementA2 = javaSourceElement2 != null ? javaSourceElement2.a() : null;
        if (reflectJavaElementA2 instanceof ReflectJavaConstructor) {
            return new JvmFunctionSignature.JavaConstructor(((ReflectJavaConstructor) reflectJavaElementA2).f43707a);
        }
        if (reflectJavaElementA2 instanceof ReflectJavaClass) {
            ReflectJavaClass reflectJavaClass = (ReflectJavaClass) reflectJavaElementA2;
            if (reflectJavaClass.f43703a.isAnnotation()) {
                return new JvmFunctionSignature.FakeJavaAnnotationConstructor(reflectJavaClass.f43703a);
            }
        }
        throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java constructor " + functionDescriptorY0 + " (" + reflectJavaElementA2 + ')');
    }
}
