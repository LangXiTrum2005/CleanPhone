package kotlin.reflect.jvm.internal;

import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.CompositePackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependenciesImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.PackagePartScopeCache;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectJavaClassFinder;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeErrorReporter;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator;
import kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.SingleModuleClassResolver;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializationComponentsForJava;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializationComponentsForJavaKt$makeLazyJavaPackageFragmentProvider$javaResolverComponents$1;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JavaClassDataFinder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JavaDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolverImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoaderImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedClassDataFinder;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInSerializerProtocol;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.DefaultTypeAttributeTranslator;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeCheckerImpl;
import kotlin.reflect.jvm.internal.impl.types.extensions.TypeAttributeTranslators;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-reflection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ModuleByClassLoaderKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f43415a = new ConcurrentHashMap();

    public static final RuntimeModuleData a(Class cls) {
        Intrinsics.f(cls, "<this>");
        ClassLoader classLoaderD = ReflectClassUtilKt.d(cls);
        WeakClassLoaderBox weakClassLoaderBox = new WeakClassLoaderBox(classLoaderD);
        ConcurrentHashMap concurrentHashMap = f43415a;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(weakClassLoaderBox);
        if (weakReference != null) {
            RuntimeModuleData runtimeModuleData = (RuntimeModuleData) weakReference.get();
            if (runtimeModuleData != null) {
                return runtimeModuleData;
            }
            concurrentHashMap.remove(weakClassLoaderBox, weakReference);
        }
        ReflectKotlinClassFinder reflectKotlinClassFinder = new ReflectKotlinClassFinder(classLoaderD);
        ClassLoader classLoader = Unit.class.getClassLoader();
        Intrinsics.e(classLoader, "Unit::class.java.classLoader");
        ReflectKotlinClassFinder reflectKotlinClassFinder2 = new ReflectKotlinClassFinder(classLoader);
        ReflectJavaClassFinder reflectJavaClassFinder = new ReflectJavaClassFinder(classLoaderD);
        String moduleName = "runtime module for " + classLoaderD;
        RuntimeErrorReporter runtimeErrorReporter = RuntimeErrorReporter.f43677b;
        RuntimeSourceElementFactory runtimeSourceElementFactory = RuntimeSourceElementFactory.f43680a;
        Intrinsics.f(moduleName, "moduleName");
        LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("DeserializationComponentsForJava.ModuleData");
        JvmBuiltIns jvmBuiltIns = new JvmBuiltIns(lockBasedStorageManager);
        ModuleDescriptorImpl moduleDescriptorImpl = new ModuleDescriptorImpl(Name.i("<" + moduleName + '>'), lockBasedStorageManager, jvmBuiltIns, 56);
        jvmBuiltIns.J(moduleDescriptorImpl);
        jvmBuiltIns.L(moduleDescriptorImpl);
        DeserializedDescriptorResolver deserializedDescriptorResolver = new DeserializedDescriptorResolver();
        SingleModuleClassResolver singleModuleClassResolver = new SingleModuleClassResolver();
        NotFoundClasses notFoundClasses = new NotFoundClasses(lockBasedStorageManager, moduleDescriptorImpl);
        PackagePartProvider.Empty empty = PackagePartProvider.Empty.f44013a;
        SignaturePropagator signaturePropagator = SignaturePropagator.f43817a;
        JavaPropertyInitializerEvaluator.DoNothing doNothing = JavaPropertyInitializerEvaluator.DoNothing.f43813a;
        SamConversionResolverImpl samConversionResolverImpl = new SamConversionResolverImpl(lockBasedStorageManager);
        SupertypeLoopChecker.EMPTY empty2 = SupertypeLoopChecker.EMPTY.f43593a;
        LookupTracker.DO_NOTHING do_nothing = LookupTracker.DO_NOTHING.f43720a;
        ReflectionTypes reflectionTypes = new ReflectionTypes(moduleDescriptorImpl, notFoundClasses);
        JavaTypeEnhancementState javaTypeEnhancementState = JavaTypeEnhancementState.d;
        Intrinsics.f(javaTypeEnhancementState, "javaTypeEnhancementState");
        AnnotationTypeQualifierResolver annotationTypeQualifierResolver = new AnnotationTypeQualifierResolver(javaTypeEnhancementState);
        JavaResolverSettings.Default r27 = JavaResolverSettings.Default.f43835a;
        SignatureEnhancement signatureEnhancement = new SignatureEnhancement(new JavaTypeEnhancement());
        JavaClassesTracker.Default r26 = JavaClassesTracker.Default.f43742a;
        NewKotlinTypeChecker.f44572b.getClass();
        NewKotlinTypeCheckerImpl newKotlinTypeCheckerImpl = NewKotlinTypeChecker.Companion.f44574b;
        LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider = new LazyJavaPackageFragmentProvider(new JavaResolverComponents(lockBasedStorageManager, reflectJavaClassFinder, reflectKotlinClassFinder, deserializedDescriptorResolver, signaturePropagator, runtimeErrorReporter, doNothing, samConversionResolverImpl, runtimeSourceElementFactory, singleModuleClassResolver, empty, empty2, do_nothing, moduleDescriptorImpl, reflectionTypes, annotationTypeQualifierResolver, signatureEnhancement, r26, r27, newKotlinTypeCheckerImpl, javaTypeEnhancementState, new DeserializationComponentsForJavaKt$makeLazyJavaPackageFragmentProvider$javaResolverComponents$1()));
        JvmMetadataVersion jvmMetadataVersion = JvmMetadataVersion.g;
        Intrinsics.f(jvmMetadataVersion, "jvmMetadataVersion");
        JavaClassDataFinder javaClassDataFinder = new JavaClassDataFinder(reflectKotlinClassFinder, deserializedDescriptorResolver);
        BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl = new BinaryClassAnnotationAndConstantLoaderImpl(moduleDescriptorImpl, notFoundClasses, lockBasedStorageManager, reflectKotlinClassFinder);
        binaryClassAnnotationAndConstantLoaderImpl.f = jvmMetadataVersion;
        DeserializationComponents deserializationComponents = new DeserializationComponentsForJava(lockBasedStorageManager, moduleDescriptorImpl, javaClassDataFinder, binaryClassAnnotationAndConstantLoaderImpl, lazyJavaPackageFragmentProvider, notFoundClasses, newKotlinTypeCheckerImpl, new TypeAttributeTranslators(CollectionsKt.H(DefaultTypeAttributeTranslator.f44500a))).f43990a;
        Intrinsics.f(deserializationComponents, "<set-?>");
        deserializedDescriptorResolver.f43994a = deserializationComponents;
        singleModuleClassResolver.f43848a = new JavaDescriptorResolver(lazyJavaPackageFragmentProvider);
        JvmBuiltInsCustomizer additionalClassPartsProvider = jvmBuiltIns.K();
        JvmBuiltInsCustomizer platformDependentDeclarationFilter = jvmBuiltIns.K();
        SamConversionResolverImpl samConversionResolverImpl2 = new SamConversionResolverImpl(lockBasedStorageManager);
        Intrinsics.f(additionalClassPartsProvider, "additionalClassPartsProvider");
        Intrinsics.f(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        JvmBuiltInsPackageFragmentProvider jvmBuiltInsPackageFragmentProvider = new JvmBuiltInsPackageFragmentProvider(lockBasedStorageManager, reflectKotlinClassFinder2, moduleDescriptorImpl);
        DeserializedClassDataFinder deserializedClassDataFinder = new DeserializedClassDataFinder(jvmBuiltInsPackageFragmentProvider);
        BuiltInSerializerProtocol builtInSerializerProtocol = BuiltInSerializerProtocol.m;
        jvmBuiltInsPackageFragmentProvider.f44375c = new DeserializationComponents(lockBasedStorageManager, moduleDescriptorImpl, deserializedClassDataFinder, new AnnotationAndConstantLoaderImpl(moduleDescriptorImpl, notFoundClasses, builtInSerializerProtocol), jvmBuiltInsPackageFragmentProvider, ErrorReporter.f44408a, FlexibleTypeDeserializer.ThrowException.f44409a, CollectionsKt.I(new BuiltInFictitiousFunctionClassFactory(lockBasedStorageManager, moduleDescriptorImpl), new JvmBuiltInClassDescriptorFactory(lockBasedStorageManager, moduleDescriptorImpl)), notFoundClasses, additionalClassPartsProvider, platformDependentDeclarationFilter, builtInSerializerProtocol.f44366a, newKotlinTypeCheckerImpl, samConversionResolverImpl2, null, 786432);
        moduleDescriptorImpl.h0 = new ModuleDependenciesImpl(ArraysKt.M(new ModuleDescriptorImpl[]{moduleDescriptorImpl}));
        moduleDescriptorImpl.i0 = new CompositePackageFragmentProvider(CollectionsKt.I(lazyJavaPackageFragmentProvider, jvmBuiltInsPackageFragmentProvider), "CompositeProvider@RuntimeModuleData for " + moduleDescriptorImpl);
        RuntimeModuleData runtimeModuleData2 = new RuntimeModuleData(deserializationComponents, new PackagePartScopeCache(reflectKotlinClassFinder, deserializedDescriptorResolver));
        while (true) {
            WeakReference weakReference2 = (WeakReference) concurrentHashMap.putIfAbsent(weakClassLoaderBox, new WeakReference(runtimeModuleData2));
            if (weakReference2 == null) {
                return runtimeModuleData2;
            }
            RuntimeModuleData runtimeModuleData3 = (RuntimeModuleData) weakReference2.get();
            if (runtimeModuleData3 != null) {
                return runtimeModuleData3;
            }
            concurrentHashMap.remove(weakClassLoaderBox, weakReference2);
        }
    }
}
