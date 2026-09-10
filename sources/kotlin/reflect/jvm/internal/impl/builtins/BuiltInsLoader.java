package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* JADX INFO: loaded from: classes7.dex */
public interface BuiltInsLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Companion f43456a = Companion.f43457a;

    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f43457a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Object f43458b = LazyKt.a(LazyThreadSafetyMode.f43248Y, BuiltInsLoader$Companion$Instance$2.X);
    }

    PackageFragmentProviderImpl a(LockBasedStorageManager lockBasedStorageManager, ModuleDescriptor moduleDescriptor, Iterable iterable, PlatformDependentDeclarationFilter platformDependentDeclarationFilter, AdditionalClassPartsProvider additionalClassPartsProvider, boolean z2);
}
