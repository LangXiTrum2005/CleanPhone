package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPackageMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class JvmPackageScope implements MemberScope {
    public static final /* synthetic */ KProperty[] f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LazyJavaResolverContext f43855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LazyJavaPackageFragment f43856c;
    public final LazyJavaPackageScope d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final NotNullLazyValue f43857e;

    static {
        ReflectionFactory reflectionFactory = Reflection.f43333a;
        f = new KProperty[]{reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(JvmPackageScope.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};
    }

    public JvmPackageScope(LazyJavaResolverContext lazyJavaResolverContext, JavaPackage javaPackage, LazyJavaPackageFragment packageFragment) {
        Intrinsics.f(packageFragment, "packageFragment");
        this.f43855b = lazyJavaResolverContext;
        this.f43856c = packageFragment;
        this.d = new LazyJavaPackageScope(lazyJavaResolverContext, javaPackage, packageFragment);
        this.f43857e = lazyJavaResolverContext.f43840a.f43824a.a(new Function0<MemberScope[]>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JvmPackageScope$kotlinScopes$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                JvmPackageScope jvmPackageScope = this.X;
                LazyJavaPackageFragment lazyJavaPackageFragment = jvmPackageScope.f43856c;
                lazyJavaPackageFragment.getClass();
                Collection<KotlinJvmBinaryClass> collectionValues = ((Map) StorageKt.a(lazyJavaPackageFragment.k0, LazyJavaPackageFragment.p0[0])).values();
                ArrayList arrayList = new ArrayList();
                for (KotlinJvmBinaryClass kotlinJvmBinaryClass : collectionValues) {
                    JavaResolverComponents javaResolverComponents = jvmPackageScope.f43855b.f43840a;
                    DeserializedPackageMemberScope deserializedPackageMemberScopeA = javaResolverComponents.d.a(jvmPackageScope.f43856c, kotlinJvmBinaryClass);
                    if (deserializedPackageMemberScopeA != null) {
                        arrayList.add(deserializedPackageMemberScopeA);
                    }
                }
                return (MemberScope[]) ScopeUtilsKt.b(arrayList).toArray(new MemberScope[0]);
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set a() {
        MemberScope[] memberScopeArrH = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : memberScopeArrH) {
            CollectionsKt.g(memberScope.a(), linkedHashSet);
        }
        linkedHashSet.addAll(this.d.a());
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection b(Name name, NoLookupLocation noLookupLocation) {
        Intrinsics.f(name, "name");
        i(name, noLookupLocation);
        MemberScope[] memberScopeArrH = h();
        this.d.getClass();
        Collection collectionA = EmptyList.X;
        for (MemberScope memberScope : memberScopeArrH) {
            collectionA = ScopeUtilsKt.a(collectionA, memberScope.b(name, noLookupLocation));
        }
        return collectionA == null ? EmptySet.X : collectionA;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set c() {
        MemberScope[] memberScopeArrH = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : memberScopeArrH) {
            CollectionsKt.g(memberScope.c(), linkedHashSet);
        }
        linkedHashSet.addAll(this.d.c());
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection d(Name name, LookupLocation lookupLocation) {
        Intrinsics.f(name, "name");
        i(name, lookupLocation);
        MemberScope[] memberScopeArrH = h();
        Collection collectionD = this.d.d(name, lookupLocation);
        for (MemberScope memberScope : memberScopeArrH) {
            collectionD = ScopeUtilsKt.a(collectionD, memberScope.d(name, lookupLocation));
        }
        return collectionD == null ? EmptySet.X : collectionD;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set e() {
        HashSet hashSetA = MemberScopeKt.a(ArraysKt.d(h()));
        if (hashSetA == null) {
            return null;
        }
        hashSetA.addAll(this.d.e());
        return hashSetA;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final ClassifierDescriptor f(Name name, LookupLocation location) {
        Intrinsics.f(name, "name");
        Intrinsics.f(location, "location");
        i(name, location);
        LazyJavaPackageScope lazyJavaPackageScope = this.d;
        lazyJavaPackageScope.getClass();
        ClassifierDescriptor classifierDescriptor = null;
        ClassDescriptor classDescriptorW = lazyJavaPackageScope.w(name, null);
        if (classDescriptorW != null) {
            return classDescriptorW;
        }
        for (MemberScope memberScope : h()) {
            ClassifierDescriptor classifierDescriptorF = memberScope.f(name, location);
            if (classifierDescriptorF != null) {
                if (!(classifierDescriptorF instanceof ClassifierDescriptorWithTypeParameters) || !((ClassifierDescriptorWithTypeParameters) classifierDescriptorF).d0()) {
                    return classifierDescriptorF;
                }
                if (classifierDescriptor == null) {
                    classifierDescriptor = classifierDescriptorF;
                }
            }
        }
        return classifierDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final Collection g(DescriptorKindFilter kindFilter, Function1 function1) {
        Intrinsics.f(kindFilter, "kindFilter");
        MemberScope[] memberScopeArrH = h();
        Collection collectionG = this.d.g(kindFilter, function1);
        for (MemberScope memberScope : memberScopeArrH) {
            collectionG = ScopeUtilsKt.a(collectionG, memberScope.g(kindFilter, function1));
        }
        return collectionG == null ? EmptySet.X : collectionG;
    }

    public final MemberScope[] h() {
        return (MemberScope[]) StorageKt.a(this.f43857e, f[0]);
    }

    public final void i(Name name, LookupLocation location) {
        Intrinsics.f(name, "name");
        Intrinsics.f(location, "location");
        JavaResolverComponents javaResolverComponents = this.f43855b.f43840a;
        UtilsKt.b(javaResolverComponents.f43831n, location, this.f43856c, name);
    }

    public final String toString() {
        return "scope for " + this.f43856c;
    }
}
