package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* JADX INFO: loaded from: classes7.dex */
public interface PackageViewDescriptorFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Companion f43652a = Companion.f43653a;

    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f43653a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final ModuleCapability f43654b = new ModuleCapability("PackageViewDescriptorFactory");
    }

    public static final class Default implements PackageViewDescriptorFactory {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Default f43655b = new Default();

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageViewDescriptorFactory
        public final LazyPackageViewDescriptorImpl a(ModuleDescriptorImpl module, FqName fqName, LockBasedStorageManager storageManager) {
            Intrinsics.f(module, "module");
            Intrinsics.f(fqName, "fqName");
            Intrinsics.f(storageManager, "storageManager");
            return new LazyPackageViewDescriptorImpl(module, fqName, storageManager);
        }
    }

    LazyPackageViewDescriptorImpl a(ModuleDescriptorImpl moduleDescriptorImpl, FqName fqName, LockBasedStorageManager lockBasedStorageManager);
}
