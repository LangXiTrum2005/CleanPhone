package kotlin.reflect.jvm.internal;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference2;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference2;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KMutableProperty2;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KProperty2;
import kotlin.reflect.KType;
import kotlin.reflect.full.KClassifiers;
import kotlin.reflect.jvm.ReflectLambdaKt;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

/* JADX INFO: loaded from: classes7.dex */
public class ReflectionFactoryImpl extends ReflectionFactory {
    public static KDeclarationContainerImpl n(CallableReference callableReference) {
        KDeclarationContainer owner = callableReference.getOwner();
        return owner instanceof KDeclarationContainerImpl ? (KDeclarationContainerImpl) owner : EmptyContainerForLocal.f43371Y;
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final KFunction a(FunctionReference functionReference) {
        KDeclarationContainerImpl container = n(functionReference);
        String name = functionReference.getH0();
        String signature = functionReference.getSignature();
        Object boundReceiver = functionReference.getBoundReceiver();
        Intrinsics.f(container, "container");
        Intrinsics.f(name, "name");
        Intrinsics.f(signature, "signature");
        return new KFunctionImpl(container, name, signature, null, boundReceiver);
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final KClass b(Class cls) {
        return CachesKt.a(cls);
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final KDeclarationContainer c(Class jClass, String str) {
        CacheByClass cacheByClass = CachesKt.f43364a;
        Intrinsics.f(jClass, "jClass");
        return (KDeclarationContainer) CachesKt.f43365b.a(jClass);
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final KType d(KType type) {
        Intrinsics.f(type, "type");
        KotlinType kotlinType = ((KTypeImpl) type).X;
        if (!(kotlinType instanceof SimpleType)) {
            throw new IllegalArgumentException(("Non-simple type cannot be a mutable collection type: " + type).toString());
        }
        ClassifierDescriptor classifierDescriptorC = kotlinType.H0().c();
        ClassDescriptor classDescriptor = classifierDescriptorC instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorC : null;
        if (classDescriptor == null) {
            throw new IllegalArgumentException("Non-class type cannot be a mutable collection type: " + type);
        }
        SimpleType simpleType = (SimpleType) kotlinType;
        String str = JavaToKotlinClassMap.f43521a;
        FqName fqName = (FqName) JavaToKotlinClassMap.k.get(DescriptorUtilsKt.h(classDescriptor));
        if (fqName == null) {
            throw new IllegalArgumentException("Not a readonly collection: " + classDescriptor);
        }
        TypeConstructor typeConstructorH = DescriptorUtilsKt.e(classDescriptor).i(fqName).h();
        Intrinsics.e(typeConstructorH, "classifier.readOnlyToMutable().typeConstructor");
        TypeAttributes annotations = simpleType.G0();
        List arguments = simpleType.F0();
        boolean zI0 = simpleType.I0();
        Intrinsics.f(annotations, "annotations");
        Intrinsics.f(arguments, "arguments");
        return new KTypeImpl(KotlinTypeFactory.d(annotations, typeConstructorH, arguments, zI0, null), null);
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final KMutableProperty0 e(MutablePropertyReference0 mutablePropertyReference0) {
        return new KMutableProperty0Impl(n(mutablePropertyReference0), mutablePropertyReference0.getH0(), mutablePropertyReference0.getSignature(), mutablePropertyReference0.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final KMutableProperty1 f(MutablePropertyReference1 mutablePropertyReference1) {
        return new KMutableProperty1Impl(n(mutablePropertyReference1), mutablePropertyReference1.getH0(), mutablePropertyReference1.getSignature(), mutablePropertyReference1.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final KMutableProperty2 g(MutablePropertyReference2 mutablePropertyReference2) {
        return new KMutableProperty2Impl(n(mutablePropertyReference2), mutablePropertyReference2.getH0(), mutablePropertyReference2.getSignature());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final KProperty0 h(PropertyReference0 propertyReference0) {
        return new KProperty0Impl(n(propertyReference0), propertyReference0.getH0(), propertyReference0.getSignature(), propertyReference0.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final KProperty1 i(PropertyReference1 propertyReference1) {
        return new KProperty1Impl(n(propertyReference1), propertyReference1.getH0(), propertyReference1.getSignature(), propertyReference1.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final KProperty2 j(PropertyReference2 propertyReference2) {
        return new KProperty2Impl(n(propertyReference2), propertyReference2.getH0(), propertyReference2.getSignature());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final String k(FunctionBase functionBase) {
        KFunctionImpl kFunctionImplB;
        KFunctionImpl kFunctionImplA = ReflectLambdaKt.a(functionBase);
        if (kFunctionImplA == null || (kFunctionImplB = UtilKt.b(kFunctionImplA)) == null) {
            return super.k(functionBase);
        }
        DescriptorRendererImpl descriptorRendererImpl = ReflectionObjectRenderer.f43418a;
        FunctionDescriptor functionDescriptorS = kFunctionImplB.o();
        StringBuilder sb = new StringBuilder();
        ReflectionObjectRenderer.a(sb, functionDescriptorS);
        List listE = functionDescriptorS.e();
        Intrinsics.e(listE, "invoke.valueParameters");
        CollectionsKt.C(listE, sb, ", ", "(", ")", ReflectionObjectRenderer$renderLambda$1$1.X, 48);
        sb.append(" -> ");
        KotlinType returnType = functionDescriptorS.getReturnType();
        Intrinsics.c(returnType);
        sb.append(ReflectionObjectRenderer.d(returnType));
        String string = sb.toString();
        Intrinsics.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final String l(Lambda lambda) {
        return k(lambda);
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final KType m(KClass kClass, List arguments, boolean z2) {
        if (!(kClass instanceof ClassBasedDeclarationContainer)) {
            return KClassifiers.a(kClass, arguments, z2, Collections.EMPTY_LIST);
        }
        Class jClass = ((ClassBasedDeclarationContainer) kClass).getF43390Y();
        CacheByClass cacheByClass = CachesKt.f43364a;
        Intrinsics.f(jClass, "jClass");
        Intrinsics.f(arguments, "arguments");
        if (arguments.isEmpty()) {
            return z2 ? (KType) CachesKt.d.a(jClass) : (KType) CachesKt.f43366c.a(jClass);
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) CachesKt.f43367e.a(jClass);
        Pair pair = new Pair(arguments, Boolean.valueOf(z2));
        Object obj = concurrentHashMap.get(pair);
        if (obj == null) {
            KTypeImpl kTypeImplA = KClassifiers.a(CachesKt.a(jClass), arguments, z2, EmptyList.X);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(pair, kTypeImplA);
            obj = objPutIfAbsent == null ? kTypeImplA : objPutIfAbsent;
        }
        return (KType) obj;
    }
}
