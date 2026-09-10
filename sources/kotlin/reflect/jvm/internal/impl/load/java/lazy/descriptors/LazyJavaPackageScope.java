package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectJavaClassFinderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.utils.DeserializationHelpersKt;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class LazyJavaPackageScope extends LazyJavaStaticScope {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final JavaPackage f43872n;
    public final LazyJavaPackageFragment o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final NullableLazyValue f43873p;
    public final MemoizedFunctionToNullable q;

    public static final class FindClassRequest {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Name f43874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final JavaClass f43875b;

        public FindClassRequest(Name name, JavaClass javaClass) {
            Intrinsics.f(name, "name");
            this.f43874a = name;
            this.f43875b = javaClass;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof FindClassRequest) {
                return Intrinsics.a(this.f43874a, ((FindClassRequest) obj).f43874a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f43874a.hashCode();
        }
    }

    public static abstract class KotlinClassLookupResult {

        public static final class Found extends KotlinClassLookupResult {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ClassDescriptor f43876a;

            public Found(ClassDescriptor classDescriptor) {
                this.f43876a = classDescriptor;
            }
        }

        public static final class NotFound extends KotlinClassLookupResult {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final NotFound f43877a = new NotFound();
        }

        public static final class SyntheticClass extends KotlinClassLookupResult {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SyntheticClass f43878a = new SyntheticClass();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageScope(final LazyJavaResolverContext lazyJavaResolverContext, JavaPackage javaPackage, LazyJavaPackageFragment ownerDescriptor) {
        super(lazyJavaResolverContext, null);
        Intrinsics.f(ownerDescriptor, "ownerDescriptor");
        this.f43872n = javaPackage;
        this.o = ownerDescriptor;
        LockBasedStorageManager lockBasedStorageManager = lazyJavaResolverContext.f43840a.f43824a;
        this.f43873p = lockBasedStorageManager.b(new Function0<Set<? extends String>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$knownClassNamesInPackage$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                JavaResolverComponents javaResolverComponents = lazyJavaResolverContext.f43840a;
                FqName packageFqName = this.o.f0;
                javaResolverComponents.f43825b.getClass();
                Intrinsics.f(packageFqName, "packageFqName");
                return null;
            }
        });
        this.q = lockBasedStorageManager.h(new Function1<FindClassRequest, ClassDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$classes$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                KotlinClassFinder.Result.KotlinClass kotlinClassA;
                ClassDescriptor classDescriptorA;
                ReflectKotlinClass reflectKotlinClassA;
                LazyJavaPackageScope.FindClassRequest request = (LazyJavaPackageScope.FindClassRequest) obj;
                Intrinsics.f(request, "request");
                LazyJavaPackageScope lazyJavaPackageScope = this;
                ClassId classId = new ClassId(lazyJavaPackageScope.o.f0, request.f43874a);
                LazyJavaResolverContext lazyJavaResolverContext2 = lazyJavaResolverContext;
                JavaResolverComponents javaResolverComponents = lazyJavaResolverContext2.f43840a;
                JavaClass javaClass = request.f43875b;
                if (javaClass != null) {
                    JvmMetadataVersion jvmMetadataVersion = LazyJavaPackageScope.v(lazyJavaPackageScope);
                    ReflectKotlinClassFinder reflectKotlinClassFinder = javaResolverComponents.f43826c;
                    reflectKotlinClassFinder.getClass();
                    Intrinsics.f(javaClass, "javaClass");
                    Intrinsics.f(jvmMetadataVersion, "jvmMetadataVersion");
                    Class clsA = ReflectJavaClassFinderKt.a(reflectKotlinClassFinder.f43675a, javaClass.c().b());
                    kotlinClassA = (clsA == null || (reflectKotlinClassA = ReflectKotlinClass.Factory.a(clsA)) == null) ? null : new KotlinClassFinder.Result.KotlinClass(reflectKotlinClassA);
                } else {
                    kotlinClassA = javaResolverComponents.f43826c.a(classId, LazyJavaPackageScope.v(lazyJavaPackageScope));
                }
                ReflectKotlinClass reflectKotlinClass = kotlinClassA != null ? kotlinClassA.f44009a : null;
                ClassId classIdA = reflectKotlinClass != null ? ReflectClassUtilKt.a(reflectKotlinClass.f43673a) : null;
                if (classIdA == null || (classIdA.f44162b.e().d() && !classIdA.f44163c)) {
                    Object found = LazyJavaPackageScope.KotlinClassLookupResult.NotFound.f43877a;
                    if (reflectKotlinClass != null) {
                        if (reflectKotlinClass.f43674b.f44021a == KotlinClassHeader.Kind.CLASS) {
                            DeserializedDescriptorResolver deserializedDescriptorResolver = lazyJavaPackageScope.f43881b.f43840a.d;
                            deserializedDescriptorResolver.getClass();
                            ClassData classDataF = deserializedDescriptorResolver.f(reflectKotlinClass);
                            if (classDataF == null) {
                                classDescriptorA = null;
                            } else {
                                classDescriptorA = deserializedDescriptorResolver.c().t.a(ReflectClassUtilKt.a(reflectKotlinClass.f43673a), classDataF);
                            }
                            if (classDescriptorA != null) {
                                found = new LazyJavaPackageScope.KotlinClassLookupResult.Found(classDescriptorA);
                            }
                        } else {
                            found = LazyJavaPackageScope.KotlinClassLookupResult.SyntheticClass.f43878a;
                        }
                    }
                    if (found instanceof LazyJavaPackageScope.KotlinClassLookupResult.Found) {
                        return ((LazyJavaPackageScope.KotlinClassLookupResult.Found) found).f43876a;
                    }
                    if (!(found instanceof LazyJavaPackageScope.KotlinClassLookupResult.SyntheticClass)) {
                        if (!(found instanceof LazyJavaPackageScope.KotlinClassLookupResult.NotFound)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (javaClass == null) {
                            javaClass = javaResolverComponents.f43825b.a(new JavaClassFinder.Request(classId, null, 4));
                        }
                        FqName fqNameC = javaClass != null ? javaClass.c() : null;
                        if (fqNameC != null && !fqNameC.d()) {
                            FqName fqNameE = fqNameC.e();
                            LazyJavaPackageFragment lazyJavaPackageFragment = lazyJavaPackageScope.o;
                            if (Intrinsics.a(fqNameE, lazyJavaPackageFragment.f0)) {
                                LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(lazyJavaResolverContext2, lazyJavaPackageFragment, javaClass, null);
                                javaResolverComponents.s.getClass();
                                return lazyJavaClassDescriptor;
                            }
                        }
                    }
                }
                return null;
            }
        });
    }

    public static final JvmMetadataVersion v(LazyJavaPackageScope lazyJavaPackageScope) {
        return DeserializationHelpersKt.a(lazyJavaPackageScope.f43881b.f43840a.d.c().f44393c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection b(Name name, NoLookupLocation noLookupLocation) {
        Intrinsics.f(name, "name");
        return EmptyList.X;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final ClassifierDescriptor f(Name name, LookupLocation location) {
        Intrinsics.f(name, "name");
        Intrinsics.f(location, "location");
        return w(name, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final Collection g(DescriptorKindFilter kindFilter, Function1 function1) {
        Intrinsics.f(kindFilter, "kindFilter");
        if (!kindFilter.a(DescriptorKindFilter.f44335l | DescriptorKindFilter.f44332e)) {
            return EmptyList.X;
        }
        Iterable iterable = (Iterable) this.d.invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            DeclarationDescriptor declarationDescriptor = (DeclarationDescriptor) obj;
            if (declarationDescriptor instanceof ClassDescriptor) {
                Name name = ((ClassDescriptor) declarationDescriptor).getName();
                Intrinsics.e(name, "it.name");
                if (((Boolean) function1.invoke(name)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final Set h(DescriptorKindFilter kindFilter, Function1 function1) {
        Intrinsics.f(kindFilter, "kindFilter");
        if (!kindFilter.a(DescriptorKindFilter.f44332e)) {
            return EmptySet.X;
        }
        Set set = (Set) this.f43873p.invoke();
        if (set != null) {
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                hashSet.add(Name.g((String) it.next()));
            }
            return hashSet;
        }
        if (function1 == null) {
            function1 = FunctionsKt.a();
        }
        this.f43872n.z(function1);
        EmptyList<JavaClass> emptyList = EmptyList.X;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (JavaClass javaClass : emptyList) {
            javaClass.getClass();
            Name name = javaClass.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final Set i(DescriptorKindFilter kindFilter, Function1 function1) {
        Intrinsics.f(kindFilter, "kindFilter");
        return EmptySet.X;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final DeclaredMemberIndex k() {
        return DeclaredMemberIndex.Empty.f43854a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final void m(LinkedHashSet linkedHashSet, Name name) {
        Intrinsics.f(name, "name");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final Set o(DescriptorKindFilter kindFilter) {
        Intrinsics.f(kindFilter, "kindFilter");
        return EmptySet.X;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final DeclarationDescriptor q() {
        return this.o;
    }

    public final ClassDescriptor w(Name name, JavaClass javaClass) {
        Name name2 = SpecialNames.f44173a;
        Intrinsics.f(name, "name");
        String strB = name.b();
        Intrinsics.e(strB, "name.asString()");
        if (strB.length() <= 0 || name.f44171Y) {
            return null;
        }
        Set set = (Set) this.f43873p.invoke();
        if (javaClass == null && set != null && !set.contains(name.b())) {
            return null;
        }
        return (ClassDescriptor) this.q.invoke(new FindClassRequest(name, javaClass));
    }
}
