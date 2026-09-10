package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.UtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* JADX INFO: loaded from: classes7.dex */
public final class LazyJavaStaticClassScope extends LazyJavaStaticScope {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f43894p = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final JavaClass f43895n;
    public final LazyJavaClassDescriptor o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaStaticClassScope(LazyJavaResolverContext lazyJavaResolverContext, JavaClass jClass, LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        super(lazyJavaResolverContext, null);
        Intrinsics.f(jClass, "jClass");
        this.f43895n = jClass;
        this.o = lazyJavaClassDescriptor;
    }

    public static PropertyDescriptor v(PropertyDescriptor propertyDescriptor) {
        CallableMemberDescriptor.Kind kind = propertyDescriptor.getKind();
        kind.getClass();
        if (kind != CallableMemberDescriptor.Kind.f43557Y) {
            return propertyDescriptor;
        }
        Collection collectionL = propertyDescriptor.l();
        Intrinsics.e(collectionL, "this.overriddenDescriptors");
        Collection<PropertyDescriptor> collection = collectionL;
        ArrayList arrayList = new ArrayList(CollectionsKt.n(collection, 10));
        for (PropertyDescriptor it : collection) {
            Intrinsics.e(it, "it");
            arrayList.add(v(it));
        }
        return (PropertyDescriptor) CollectionsKt.W(CollectionsKt.q(arrayList));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final ClassifierDescriptor f(Name name, LookupLocation location) {
        Intrinsics.f(name, "name");
        Intrinsics.f(location, "location");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final Set h(DescriptorKindFilter kindFilter, Function1 function1) {
        Intrinsics.f(kindFilter, "kindFilter");
        return EmptySet.X;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final Set i(DescriptorKindFilter kindFilter, Function1 function1) {
        Intrinsics.f(kindFilter, "kindFilter");
        LinkedHashSet linkedHashSetK0 = CollectionsKt.k0(((DeclaredMemberIndex) this.f43883e.invoke()).a());
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this.o;
        LazyJavaStaticClassScope lazyJavaStaticClassScopeB = UtilKt.b(lazyJavaClassDescriptor);
        Set setA = lazyJavaStaticClassScopeB != null ? lazyJavaStaticClassScopeB.a() : null;
        if (setA == null) {
            setA = EmptySet.X;
        }
        linkedHashSetK0.addAll(setA);
        if (this.f43895n.p()) {
            linkedHashSetK0.addAll(CollectionsKt.I(StandardNames.f43474c, StandardNames.f43472a));
        }
        LazyJavaResolverContext lazyJavaResolverContext = this.f43881b;
        linkedHashSetK0.addAll(lazyJavaResolverContext.f43840a.x.b(lazyJavaResolverContext, lazyJavaClassDescriptor));
        return linkedHashSetK0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final void j(ArrayList arrayList, Name name) {
        Intrinsics.f(name, "name");
        LazyJavaResolverContext lazyJavaResolverContext = this.f43881b;
        JavaResolverComponents javaResolverComponents = lazyJavaResolverContext.f43840a;
        javaResolverComponents.x.d(lazyJavaResolverContext, this.o, name, arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final DeclaredMemberIndex k() {
        return new ClassDeclaredMemberIndex(this.f43895n, LazyJavaStaticClassScope$computeMemberIndex$1.X);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final void m(LinkedHashSet linkedHashSet, Name name) {
        Intrinsics.f(name, "name");
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this.o;
        LazyJavaStaticClassScope lazyJavaStaticClassScopeB = UtilKt.b(lazyJavaClassDescriptor);
        Collection collectionL0 = lazyJavaStaticClassScopeB == null ? EmptySet.X : CollectionsKt.l0(lazyJavaStaticClassScopeB.d(name, NoLookupLocation.f0));
        JavaResolverComponents javaResolverComponents = this.f43881b.f43840a;
        linkedHashSet.addAll(DescriptorResolverUtils.e(name, collectionL0, linkedHashSet, this.o, javaResolverComponents.f, javaResolverComponents.f43833u.d));
        if (this.f43895n.p()) {
            if (name.equals(StandardNames.f43474c)) {
                linkedHashSet.add(DescriptorFactory.f(lazyJavaClassDescriptor));
            } else if (name.equals(StandardNames.f43472a)) {
                linkedHashSet.add(DescriptorFactory.g(lazyJavaClassDescriptor));
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticScope, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final void n(ArrayList arrayList, final Name name) {
        Intrinsics.f(name, "name");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Function1<MemberScope, Collection<? extends PropertyDescriptor>> function1 = new Function1<MemberScope, Collection<? extends PropertyDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope$computeNonDeclaredProperties$propertiesFromSupertypes$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                MemberScope it = (MemberScope) obj;
                Intrinsics.f(it, "it");
                return it.b(name, NoLookupLocation.f0);
            }
        };
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this.o;
        DFS.a(CollectionsKt.H(lazyJavaClassDescriptor), LazyJavaStaticClassScope$$Lambda$0.f43896a, new LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$2(lazyJavaClassDescriptor, linkedHashSet, function1));
        boolean zIsEmpty = arrayList.isEmpty();
        LazyJavaResolverContext lazyJavaResolverContext = this.f43881b;
        if (zIsEmpty) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : linkedHashSet) {
                PropertyDescriptor propertyDescriptorV = v((PropertyDescriptor) obj);
                Object arrayList2 = linkedHashMap.get(propertyDescriptorV);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(propertyDescriptorV, arrayList2);
                }
                ((List) arrayList2).add(obj);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collection = (Collection) ((Map.Entry) it.next()).getValue();
                JavaResolverComponents javaResolverComponents = lazyJavaResolverContext.f43840a;
                CollectionsKt.g(DescriptorResolverUtils.e(name, collection, arrayList, this.o, javaResolverComponents.f, javaResolverComponents.f43833u.d), arrayList3);
            }
            arrayList.addAll(arrayList3);
        } else {
            JavaResolverComponents javaResolverComponents2 = lazyJavaResolverContext.f43840a;
            arrayList.addAll(DescriptorResolverUtils.e(name, linkedHashSet, arrayList, this.o, javaResolverComponents2.f, javaResolverComponents2.f43833u.d));
        }
        if (this.f43895n.p() && name.equals(StandardNames.f43473b)) {
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.a(arrayList, DescriptorFactory.e(lazyJavaClassDescriptor));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final Set o(DescriptorKindFilter kindFilter) {
        Intrinsics.f(kindFilter, "kindFilter");
        LinkedHashSet linkedHashSetK0 = CollectionsKt.k0(((DeclaredMemberIndex) this.f43883e.invoke()).c());
        LazyJavaStaticClassScope$computePropertyNames$1$1 lazyJavaStaticClassScope$computePropertyNames$1$1 = LazyJavaStaticClassScope$computePropertyNames$1$1.X;
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this.o;
        DFS.a(CollectionsKt.H(lazyJavaClassDescriptor), LazyJavaStaticClassScope$$Lambda$0.f43896a, new LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$2(lazyJavaClassDescriptor, linkedHashSetK0, lazyJavaStaticClassScope$computePropertyNames$1$1));
        if (this.f43895n.p()) {
            linkedHashSetK0.add(StandardNames.f43473b);
        }
        return linkedHashSetK0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final DeclarationDescriptor q() {
        return this.o;
    }
}
