package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.InitializedLazyImpl;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaPackage;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues;

/* JADX INFO: loaded from: classes7.dex */
public final class LazyJavaPackageFragmentProvider implements PackageFragmentProviderOptimized {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LazyJavaResolverContext f43837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CacheWithNotNullValues f43838b;

    public LazyJavaPackageFragmentProvider(JavaResolverComponents javaResolverComponents) {
        this.f43837a = new LazyJavaResolverContext(javaResolverComponents, TypeParameterResolver.EMPTY.f43849a, new InitializedLazyImpl(null));
        this.f43838b = javaResolverComponents.f43824a.e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public final List a(FqName fqName) {
        Intrinsics.f(fqName, "fqName");
        return CollectionsKt.J(d(fqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public final void b(FqName fqName, ArrayList arrayList) {
        Intrinsics.f(fqName, "fqName");
        kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.a(arrayList, d(fqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public final boolean c(FqName fqName) {
        Intrinsics.f(fqName, "fqName");
        this.f43837a.f43840a.f43825b.getClass();
        new ReflectJavaPackage(fqName);
        return false;
    }

    public final LazyJavaPackageFragment d(FqName fqName) {
        this.f43837a.f43840a.f43825b.getClass();
        Intrinsics.f(fqName, "fqName");
        final ReflectJavaPackage reflectJavaPackage = new ReflectJavaPackage(fqName);
        return (LazyJavaPackageFragment) this.f43838b.a(fqName, new Function0<LazyJavaPackageFragment>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider$getPackageFragment$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new LazyJavaPackageFragment(this.X.f43837a, reflectJavaPackage);
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public final Collection m(FqName fqName, Function1 function1) {
        Intrinsics.f(fqName, "fqName");
        LazyJavaPackageFragment lazyJavaPackageFragmentD = d(fqName);
        List list = lazyJavaPackageFragmentD != null ? (List) lazyJavaPackageFragmentD.m0.invoke() : null;
        if (list == null) {
            list = EmptyList.X;
        }
        return list;
    }

    public final String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.f43837a.f43840a.o;
    }
}
