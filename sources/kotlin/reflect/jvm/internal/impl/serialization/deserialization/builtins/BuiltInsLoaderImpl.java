package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import android.support.v4.media.a;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolverImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoaderImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedClassDataFinder;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* JADX INFO: loaded from: classes7.dex */
public final class BuiltInsLoaderImpl implements BuiltInsLoader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BuiltInsResourceLoader f44444b = new BuiltInsResourceLoader();

    @Override // kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader
    public final PackageFragmentProviderImpl a(LockBasedStorageManager lockBasedStorageManager, ModuleDescriptor builtInsModule, Iterable classDescriptorFactories, PlatformDependentDeclarationFilter platformDependentDeclarationFilter, AdditionalClassPartsProvider additionalClassPartsProvider, boolean z2) {
        Intrinsics.f(builtInsModule, "builtInsModule");
        Intrinsics.f(classDescriptorFactories, "classDescriptorFactories");
        Intrinsics.f(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        Intrinsics.f(additionalClassPartsProvider, "additionalClassPartsProvider");
        Set<FqName> packageFqNames = StandardNames.f43480p;
        BuiltInsLoaderImpl$createPackageFragmentProvider$1 builtInsLoaderImpl$createPackageFragmentProvider$1 = new BuiltInsLoaderImpl$createPackageFragmentProvider$1(1, this.f44444b);
        Intrinsics.f(packageFqNames, "packageFqNames");
        ArrayList arrayList = new ArrayList(CollectionsKt.n(packageFqNames, 10));
        for (FqName fqName : packageFqNames) {
            BuiltInSerializerProtocol.m.getClass();
            String strA = BuiltInSerializerProtocol.a(fqName);
            InputStream inputStream = (InputStream) builtInsLoaderImpl$createPackageFragmentProvider$1.invoke(strA);
            if (inputStream == null) {
                throw new IllegalStateException(a.C("Resource not found in classpath: ", strA));
            }
            arrayList.add(BuiltInsPackageFragmentImpl.Companion.a(fqName, lockBasedStorageManager, builtInsModule, inputStream));
        }
        PackageFragmentProviderImpl packageFragmentProviderImpl = new PackageFragmentProviderImpl(arrayList);
        NotFoundClasses notFoundClasses = new NotFoundClasses(lockBasedStorageManager, builtInsModule);
        DeserializedClassDataFinder deserializedClassDataFinder = new DeserializedClassDataFinder(packageFragmentProviderImpl);
        BuiltInSerializerProtocol builtInSerializerProtocol = BuiltInSerializerProtocol.m;
        DeserializationComponents deserializationComponents = new DeserializationComponents(lockBasedStorageManager, builtInsModule, deserializedClassDataFinder, new AnnotationAndConstantLoaderImpl(builtInsModule, notFoundClasses, builtInSerializerProtocol), packageFragmentProviderImpl, ErrorReporter.f44408a, FlexibleTypeDeserializer.ThrowException.f44409a, classDescriptorFactories, notFoundClasses, additionalClassPartsProvider, platformDependentDeclarationFilter, builtInSerializerProtocol.f44366a, null, new SamConversionResolverImpl(lockBasedStorageManager), null, 851968);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((BuiltInsPackageFragmentImpl) it.next()).G0(deserializationComponents);
        }
        return packageFragmentProviderImpl;
    }
}
