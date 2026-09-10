package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeErrorReporter;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolverImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeCheckerImpl;
import kotlin.reflect.jvm.internal.impl.types.extensions.TypeAttributeTranslators;

/* JADX INFO: loaded from: classes7.dex */
public final class DeserializationComponentsForJava {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeserializationComponents f43990a;

    public static final class Companion {

        public static final class ModuleData {
        }
    }

    public DeserializationComponentsForJava(LockBasedStorageManager lockBasedStorageManager, ModuleDescriptorImpl moduleDescriptorImpl, JavaClassDataFinder javaClassDataFinder, BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl, LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, NotFoundClasses notFoundClasses, NewKotlinTypeCheckerImpl kotlinTypeChecker, TypeAttributeTranslators typeAttributeTranslators) {
        PlatformDependentDeclarationFilter platformDependentDeclarationFilterK;
        AdditionalClassPartsProvider additionalClassPartsProviderK;
        RuntimeErrorReporter runtimeErrorReporter = RuntimeErrorReporter.f43677b;
        Intrinsics.f(kotlinTypeChecker, "kotlinTypeChecker");
        KotlinBuiltIns kotlinBuiltIns = moduleDescriptorImpl.e0;
        JvmBuiltIns jvmBuiltIns = kotlinBuiltIns instanceof JvmBuiltIns ? (JvmBuiltIns) kotlinBuiltIns : null;
        this.f43990a = new DeserializationComponents(lockBasedStorageManager, moduleDescriptorImpl, javaClassDataFinder, binaryClassAnnotationAndConstantLoaderImpl, lazyJavaPackageFragmentProvider, runtimeErrorReporter, JavaFlexibleTypeDeserializer.f43997a, EmptyList.X, notFoundClasses, (jvmBuiltIns == null || (additionalClassPartsProviderK = jvmBuiltIns.K()) == null) ? AdditionalClassPartsProvider.None.f43621a : additionalClassPartsProviderK, (jvmBuiltIns == null || (platformDependentDeclarationFilterK = jvmBuiltIns.K()) == null) ? PlatformDependentDeclarationFilter.NoPlatformDependent.f43623a : platformDependentDeclarationFilterK, JvmProtoBufUtil.f44158a, kotlinTypeChecker, new SamConversionResolverImpl(lockBasedStorageManager), typeAttributeTranslators.f44594a, 262144);
    }
}
