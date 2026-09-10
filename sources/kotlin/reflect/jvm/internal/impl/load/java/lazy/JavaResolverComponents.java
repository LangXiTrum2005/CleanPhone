package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectJavaClassFinder;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeErrorReporter;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializationComponentsForJavaKt$makeLazyJavaPackageFragmentProvider$javaResolverComponents$1;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.CompositeSyntheticJavaPartsProvider;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider;
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolverImpl;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeCheckerImpl;

/* JADX INFO: loaded from: classes7.dex */
public final class JavaResolverComponents {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LockBasedStorageManager f43824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReflectJavaClassFinder f43825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReflectKotlinClassFinder f43826c;
    public final DeserializedDescriptorResolver d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SignaturePropagator f43827e;
    public final RuntimeErrorReporter f;
    public final JavaResolverCache g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final JavaPropertyInitializerEvaluator.DoNothing f43828h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SamConversionResolverImpl f43829i;
    public final RuntimeSourceElementFactory j;
    public final SingleModuleClassResolver k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PackagePartProvider f43830l;
    public final SupertypeLoopChecker.EMPTY m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LookupTracker.DO_NOTHING f43831n;
    public final ModuleDescriptorImpl o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ReflectionTypes f43832p;
    public final AnnotationTypeQualifierResolver q;
    public final SignatureEnhancement r;
    public final JavaClassesTracker.Default s;
    public final JavaResolverSettings.Default t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final NewKotlinTypeCheckerImpl f43833u;
    public final JavaTypeEnhancementState v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final DeserializationComponentsForJavaKt$makeLazyJavaPackageFragmentProvider$javaResolverComponents$1 f43834w;
    public final SyntheticJavaPartsProvider x;

    public JavaResolverComponents(LockBasedStorageManager storageManager, ReflectJavaClassFinder finder, ReflectKotlinClassFinder kotlinClassFinder, DeserializedDescriptorResolver deserializedDescriptorResolver, SignaturePropagator signaturePropagator, RuntimeErrorReporter errorReporter, JavaPropertyInitializerEvaluator.DoNothing javaPropertyInitializerEvaluator, SamConversionResolverImpl samConversionResolver, RuntimeSourceElementFactory sourceElementFactory, SingleModuleClassResolver moduleClassResolver, PackagePartProvider packagePartProvider, SupertypeLoopChecker.EMPTY supertypeLoopChecker, LookupTracker.DO_NOTHING lookupTracker, ModuleDescriptorImpl module, ReflectionTypes reflectionTypes, AnnotationTypeQualifierResolver annotationTypeQualifierResolver, SignatureEnhancement signatureEnhancement, JavaClassesTracker.Default javaClassesTracker, JavaResolverSettings.Default settings, NewKotlinTypeCheckerImpl kotlinTypeChecker, JavaTypeEnhancementState javaTypeEnhancementState, DeserializationComponentsForJavaKt$makeLazyJavaPackageFragmentProvider$javaResolverComponents$1 javaModuleResolver) {
        JavaResolverCache javaResolverCache = JavaResolverCache.f43814a;
        SyntheticJavaPartsProvider.f44322a.getClass();
        Intrinsics.f(storageManager, "storageManager");
        Intrinsics.f(finder, "finder");
        Intrinsics.f(kotlinClassFinder, "kotlinClassFinder");
        Intrinsics.f(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        Intrinsics.f(signaturePropagator, "signaturePropagator");
        Intrinsics.f(errorReporter, "errorReporter");
        Intrinsics.f(javaPropertyInitializerEvaluator, "javaPropertyInitializerEvaluator");
        Intrinsics.f(samConversionResolver, "samConversionResolver");
        Intrinsics.f(sourceElementFactory, "sourceElementFactory");
        Intrinsics.f(moduleClassResolver, "moduleClassResolver");
        Intrinsics.f(packagePartProvider, "packagePartProvider");
        Intrinsics.f(supertypeLoopChecker, "supertypeLoopChecker");
        Intrinsics.f(lookupTracker, "lookupTracker");
        Intrinsics.f(module, "module");
        Intrinsics.f(reflectionTypes, "reflectionTypes");
        Intrinsics.f(annotationTypeQualifierResolver, "annotationTypeQualifierResolver");
        Intrinsics.f(signatureEnhancement, "signatureEnhancement");
        Intrinsics.f(javaClassesTracker, "javaClassesTracker");
        Intrinsics.f(settings, "settings");
        Intrinsics.f(kotlinTypeChecker, "kotlinTypeChecker");
        Intrinsics.f(javaTypeEnhancementState, "javaTypeEnhancementState");
        Intrinsics.f(javaModuleResolver, "javaModuleResolver");
        CompositeSyntheticJavaPartsProvider syntheticPartsProvider = SyntheticJavaPartsProvider.Companion.f44324b;
        Intrinsics.f(syntheticPartsProvider, "syntheticPartsProvider");
        this.f43824a = storageManager;
        this.f43825b = finder;
        this.f43826c = kotlinClassFinder;
        this.d = deserializedDescriptorResolver;
        this.f43827e = signaturePropagator;
        this.f = errorReporter;
        this.g = javaResolverCache;
        this.f43828h = javaPropertyInitializerEvaluator;
        this.f43829i = samConversionResolver;
        this.j = sourceElementFactory;
        this.k = moduleClassResolver;
        this.f43830l = packagePartProvider;
        this.m = supertypeLoopChecker;
        this.f43831n = lookupTracker;
        this.o = module;
        this.f43832p = reflectionTypes;
        this.q = annotationTypeQualifierResolver;
        this.r = signatureEnhancement;
        this.s = javaClassesTracker;
        this.t = settings;
        this.f43833u = kotlinTypeChecker;
        this.v = javaTypeEnhancementState;
        this.f43834w = javaModuleResolver;
        this.x = syntheticPartsProvider;
    }
}
