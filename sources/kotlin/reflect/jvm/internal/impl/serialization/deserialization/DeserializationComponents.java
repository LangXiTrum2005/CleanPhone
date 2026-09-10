package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentTypeTransformer;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolverImpl;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.DefaultTypeAttributeTranslator;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeCheckerImpl;

/* JADX INFO: loaded from: classes7.dex */
public final class DeserializationComponents {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LockBasedStorageManager f44391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ModuleDescriptor f44392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DeserializationConfiguration.Default f44393c;
    public final ClassDataFinder d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AnnotationAndConstantLoader f44394e;
    public final PackageFragmentProviderOptimized f;
    public final LocalClassifierTypeSettings.Default g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ErrorReporter f44395h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LookupTracker.DO_NOTHING f44396i;
    public final FlexibleTypeDeserializer j;
    public final Iterable k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final NotFoundClasses f44397l;
    public final ContractDeserializer$Companion$DEFAULT$1 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AdditionalClassPartsProvider f44398n;
    public final PlatformDependentDeclarationFilter o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ExtensionRegistryLite f44399p;
    public final NewKotlinTypeChecker q;
    public final PlatformDependentTypeTransformer r;
    public final List s;
    public final ClassDeserializer t;

    public DeserializationComponents(LockBasedStorageManager lockBasedStorageManager, ModuleDescriptor moduleDescriptor, ClassDataFinder classDataFinder, AnnotationAndConstantLoader annotationAndConstantLoader, PackageFragmentProviderOptimized packageFragmentProviderOptimized, ErrorReporter errorReporter, FlexibleTypeDeserializer flexibleTypeDeserializer, Iterable fictitiousClassDescriptorFactories, NotFoundClasses notFoundClasses, AdditionalClassPartsProvider additionalClassPartsProvider, PlatformDependentDeclarationFilter platformDependentDeclarationFilter, ExtensionRegistryLite extensionRegistryLite, NewKotlinTypeCheckerImpl newKotlinTypeCheckerImpl, SamConversionResolverImpl samConversionResolverImpl, List list, int i2) {
        NewKotlinTypeCheckerImpl kotlinTypeChecker;
        DeserializationConfiguration.Default r4 = DeserializationConfiguration.Default.f44400a;
        LocalClassifierTypeSettings.Default r5 = LocalClassifierTypeSettings.Default.f44414a;
        LookupTracker.DO_NOTHING do_nothing = LookupTracker.DO_NOTHING.f43720a;
        ContractDeserializer$Companion$DEFAULT$1 contractDeserializer$Companion$DEFAULT$1 = ContractDeserializer.Companion.f44390a;
        if ((i2 & 65536) != 0) {
            NewKotlinTypeChecker.f44572b.getClass();
            kotlinTypeChecker = NewKotlinTypeChecker.Companion.f44574b;
        } else {
            kotlinTypeChecker = newKotlinTypeCheckerImpl;
        }
        PlatformDependentTypeTransformer.None none = PlatformDependentTypeTransformer.None.f43625a;
        List listH = (i2 & 524288) != 0 ? CollectionsKt.H(DefaultTypeAttributeTranslator.f44500a) : list;
        Intrinsics.f(moduleDescriptor, "moduleDescriptor");
        Intrinsics.f(fictitiousClassDescriptorFactories, "fictitiousClassDescriptorFactories");
        Intrinsics.f(additionalClassPartsProvider, "additionalClassPartsProvider");
        Intrinsics.f(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        Intrinsics.f(extensionRegistryLite, "extensionRegistryLite");
        Intrinsics.f(kotlinTypeChecker, "kotlinTypeChecker");
        this.f44391a = lockBasedStorageManager;
        this.f44392b = moduleDescriptor;
        this.f44393c = r4;
        this.d = classDataFinder;
        this.f44394e = annotationAndConstantLoader;
        this.f = packageFragmentProviderOptimized;
        this.g = r5;
        this.f44395h = errorReporter;
        this.f44396i = do_nothing;
        this.j = flexibleTypeDeserializer;
        this.k = fictitiousClassDescriptorFactories;
        this.f44397l = notFoundClasses;
        this.m = contractDeserializer$Companion$DEFAULT$1;
        this.f44398n = additionalClassPartsProvider;
        this.o = platformDependentDeclarationFilter;
        this.f44399p = extensionRegistryLite;
        this.q = kotlinTypeChecker;
        this.r = none;
        this.s = listH;
        this.t = new ClassDeserializer(this);
    }

    public final DeserializationContext a(PackageFragmentDescriptor descriptor, NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, BinaryVersion metadataVersion, JvmPackagePartSource jvmPackagePartSource) {
        Intrinsics.f(descriptor, "descriptor");
        Intrinsics.f(nameResolver, "nameResolver");
        Intrinsics.f(metadataVersion, "metadataVersion");
        return new DeserializationContext(this, nameResolver, descriptor, typeTable, versionRequirementTable, metadataVersion, jvmPackagePartSource, null, EmptyList.X);
    }

    public final ClassDescriptor b(ClassId classId) {
        Intrinsics.f(classId, "classId");
        Set set = ClassDeserializer.f44385c;
        return this.t.a(classId, null);
    }
}
