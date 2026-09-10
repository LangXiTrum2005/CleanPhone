package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;

/* JADX INFO: loaded from: classes7.dex */
public class SubpackagesScope extends MemberScopeImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ModuleDescriptor f43662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FqName f43663c;

    public SubpackagesScope(ModuleDescriptor moduleDescriptor, FqName fqName) {
        Intrinsics.f(moduleDescriptor, "moduleDescriptor");
        Intrinsics.f(fqName, "fqName");
        this.f43662b = moduleDescriptor;
        this.f43663c = fqName;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set e() {
        return EmptySet.X;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r7.f44338a.contains(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude.TopLevelPackages.f44330a) != false) goto L9;
     */
    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Collection g(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter r7, kotlin.jvm.functions.Function1 r8) {
        /*
            r6 = this;
            java.lang.String r0 = "kindFilter"
            kotlin.jvm.internal.Intrinsics.f(r7, r0)
            int r0 = kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.f44333h
            boolean r0 = r7.a(r0)
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.X
            if (r0 != 0) goto L10
            goto L22
        L10:
            kotlin.reflect.jvm.internal.impl.name.FqName r0 = r6.f43663c
            boolean r2 = r0.d()
            if (r2 == 0) goto L23
            kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude$TopLevelPackages r2 = kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude.TopLevelPackages.f44330a
            java.util.List r7 = r7.f44338a
            boolean r7 = r7.contains(r2)
            if (r7 == 0) goto L23
        L22:
            return r1
        L23:
            kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor r7 = r6.f43662b
            java.util.Collection r1 = r7.m(r0, r8)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L36:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L71
            java.lang.Object r3 = r1.next()
            kotlin.reflect.jvm.internal.impl.name.FqName r3 = (kotlin.reflect.jvm.internal.impl.name.FqName) r3
            kotlin.reflect.jvm.internal.impl.name.Name r3 = r3.f()
            java.lang.String r4 = "subFqName.shortName()"
            kotlin.jvm.internal.Intrinsics.e(r3, r4)
            java.lang.Object r4 = r8.invoke(r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L36
            boolean r4 = r3.f44171Y
            r5 = 0
            if (r4 == 0) goto L5d
            goto L6d
        L5d:
            kotlin.reflect.jvm.internal.impl.name.FqName r3 = r0.c(r3)
            kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor r3 = r7.e0(r3)
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L6c
            goto L6d
        L6c:
            r5 = r3
        L6d:
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.a(r2, r5)
            goto L36
        L71:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.SubpackagesScope.g(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter, kotlin.jvm.functions.Function1):java.util.Collection");
    }

    public final String toString() {
        return "subpackages of " + this.f43663c + " from " + this.f43662b;
    }
}
