package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;

/* JADX INFO: loaded from: classes7.dex */
public final class ChainedMemberScope implements MemberScope {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MemberScope[] f44327c;

    public static final class Companion {
        public static MemberScope a(Iterable iterable, String debugName) {
            Intrinsics.f(debugName, "debugName");
            SmartList smartList = new SmartList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                MemberScope memberScope = (MemberScope) it.next();
                if (memberScope != MemberScope.Empty.f44351b) {
                    if (memberScope instanceof ChainedMemberScope) {
                        CollectionsKt.h(smartList, ((ChainedMemberScope) memberScope).f44327c);
                    } else {
                        smartList.add(memberScope);
                    }
                }
            }
            return b(debugName, smartList);
        }

        public static MemberScope b(String debugName, SmartList smartList) {
            Intrinsics.f(debugName, "debugName");
            int i2 = smartList.X;
            if (i2 != 0) {
                return i2 != 1 ? new ChainedMemberScope(debugName, (MemberScope[]) smartList.toArray(new MemberScope[0])) : (MemberScope) smartList.get(0);
            }
            return MemberScope.Empty.f44351b;
        }
    }

    public ChainedMemberScope(String str, MemberScope[] memberScopeArr) {
        this.f44326b = str;
        this.f44327c = memberScopeArr;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set a() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : this.f44327c) {
            CollectionsKt.g(memberScope.a(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection b(Name name, NoLookupLocation noLookupLocation) {
        Intrinsics.f(name, "name");
        MemberScope[] memberScopeArr = this.f44327c;
        int length = memberScopeArr.length;
        if (length == 0) {
            return EmptyList.X;
        }
        if (length == 1) {
            return memberScopeArr[0].b(name, noLookupLocation);
        }
        Collection collectionA = null;
        for (MemberScope memberScope : memberScopeArr) {
            collectionA = ScopeUtilsKt.a(collectionA, memberScope.b(name, noLookupLocation));
        }
        return collectionA == null ? EmptySet.X : collectionA;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set c() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : this.f44327c) {
            CollectionsKt.g(memberScope.c(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection d(Name name, LookupLocation lookupLocation) {
        Intrinsics.f(name, "name");
        MemberScope[] memberScopeArr = this.f44327c;
        int length = memberScopeArr.length;
        if (length == 0) {
            return EmptyList.X;
        }
        if (length == 1) {
            return memberScopeArr[0].d(name, lookupLocation);
        }
        Collection collectionA = null;
        for (MemberScope memberScope : memberScopeArr) {
            collectionA = ScopeUtilsKt.a(collectionA, memberScope.d(name, lookupLocation));
        }
        return collectionA == null ? EmptySet.X : collectionA;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set e() {
        return MemberScopeKt.a(ArraysKt.d(this.f44327c));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final ClassifierDescriptor f(Name name, LookupLocation location) {
        Intrinsics.f(name, "name");
        Intrinsics.f(location, "location");
        ClassifierDescriptor classifierDescriptor = null;
        for (MemberScope memberScope : this.f44327c) {
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
        MemberScope[] memberScopeArr = this.f44327c;
        int length = memberScopeArr.length;
        if (length == 0) {
            return EmptyList.X;
        }
        if (length == 1) {
            return memberScopeArr[0].g(kindFilter, function1);
        }
        Collection collectionA = null;
        for (MemberScope memberScope : memberScopeArr) {
            collectionA = ScopeUtilsKt.a(collectionA, memberScope.g(kindFilter, function1));
        }
        return collectionA == null ? EmptySet.X : collectionA;
    }

    public final String toString() {
        return this.f44326b;
    }
}
