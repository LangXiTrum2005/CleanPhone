package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractDeserializedPackageFragmentProvider implements PackageFragmentProviderOptimized {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LockBasedStorageManager f44373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ModuleDescriptorImpl f44374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DeserializationComponents f44375c;
    public final MemoizedFunctionToNullable d;

    public AbstractDeserializedPackageFragmentProvider(LockBasedStorageManager lockBasedStorageManager, ReflectKotlinClassFinder reflectKotlinClassFinder, ModuleDescriptorImpl moduleDescriptorImpl) {
        this.f44373a = lockBasedStorageManager;
        this.f44374b = moduleDescriptorImpl;
        this.d = lockBasedStorageManager.h(new Function1<FqName, PackageFragmentDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractDeserializedPackageFragmentProvider$fragments$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                FqName fqName = (FqName) obj;
                Intrinsics.f(fqName, "fqName");
                AbstractDeserializedPackageFragmentProvider abstractDeserializedPackageFragmentProvider = this.X;
                BuiltInsPackageFragmentImpl builtInsPackageFragmentImplD = abstractDeserializedPackageFragmentProvider.d(fqName);
                if (builtInsPackageFragmentImplD == null) {
                    return null;
                }
                DeserializationComponents deserializationComponents = abstractDeserializedPackageFragmentProvider.f44375c;
                if (deserializationComponents != null) {
                    builtInsPackageFragmentImplD.G0(deserializationComponents);
                    return builtInsPackageFragmentImplD;
                }
                Intrinsics.m("components");
                throw null;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public final List a(FqName fqName) {
        Intrinsics.f(fqName, "fqName");
        return CollectionsKt.J(this.d.invoke(fqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public final void b(FqName fqName, ArrayList arrayList) {
        Intrinsics.f(fqName, "fqName");
        kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.a(arrayList, this.d.invoke(fqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public final boolean c(FqName fqName) {
        Intrinsics.f(fqName, "fqName");
        MemoizedFunctionToNullable memoizedFunctionToNullable = this.d;
        return (memoizedFunctionToNullable.b(fqName) ? (PackageFragmentDescriptor) memoizedFunctionToNullable.invoke(fqName) : d(fqName)) == null;
    }

    public abstract BuiltInsPackageFragmentImpl d(FqName fqName);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public final Collection m(FqName fqName, Function1 function1) {
        Intrinsics.f(fqName, "fqName");
        return EmptySet.X;
    }
}
