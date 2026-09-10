package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: loaded from: classes7.dex */
public final class JavaDescriptorResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LazyJavaPackageFragmentProvider f44318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JavaResolverCache f44319b;

    public JavaDescriptorResolver(LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider) {
        JavaResolverCache javaResolverCache = JavaResolverCache.f43814a;
        this.f44318a = lazyJavaPackageFragmentProvider;
        this.f44319b = javaResolverCache;
    }

    public final ClassDescriptor a(JavaClass javaClass) {
        FqName fqNameC = javaClass.c();
        ReflectJavaClass reflectJavaClassL = javaClass.l();
        if (reflectJavaClassL != null) {
            ClassDescriptor classDescriptorA = a(reflectJavaClassL);
            MemberScope memberScopeN = classDescriptorA != null ? classDescriptorA.N() : null;
            ClassifierDescriptor classifierDescriptorF = memberScopeN != null ? memberScopeN.f(javaClass.getName(), NoLookupLocation.i0) : null;
            if (classifierDescriptorF instanceof ClassDescriptor) {
                return (ClassDescriptor) classifierDescriptorF;
            }
        } else {
            FqName fqNameE = fqNameC.e();
            Intrinsics.e(fqNameE, "fqName.parent()");
            LazyJavaPackageFragment lazyJavaPackageFragment = (LazyJavaPackageFragment) CollectionsKt.y(this.f44318a.a(fqNameE));
            if (lazyJavaPackageFragment != null) {
                LazyJavaPackageScope lazyJavaPackageScope = lazyJavaPackageFragment.l0.d;
                lazyJavaPackageScope.getClass();
                return lazyJavaPackageScope.w(javaClass.getName(), javaClass);
            }
        }
        return null;
    }
}
