package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes7.dex */
public final class CompositePackageFragmentProvider implements PackageFragmentProviderOptimized {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f43631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43632b;

    public CompositePackageFragmentProvider(List list, String debugName) {
        Intrinsics.f(debugName, "debugName");
        this.f43631a = list;
        this.f43632b = debugName;
        list.size();
        CollectionsKt.l0(list).size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public final List a(FqName fqName) {
        Intrinsics.f(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f43631a.iterator();
        while (it.hasNext()) {
            PackageFragmentProviderKt.a((PackageFragmentProvider) it.next(), fqName, arrayList);
        }
        return CollectionsKt.i0(arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public final void b(FqName fqName, ArrayList arrayList) {
        Intrinsics.f(fqName, "fqName");
        Iterator it = this.f43631a.iterator();
        while (it.hasNext()) {
            PackageFragmentProviderKt.a((PackageFragmentProvider) it.next(), fqName, arrayList);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public final boolean c(FqName fqName) {
        Intrinsics.f(fqName, "fqName");
        List list = this.f43631a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!PackageFragmentProviderKt.b((PackageFragmentProvider) it.next(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public final Collection m(FqName fqName, Function1 function1) {
        Intrinsics.f(fqName, "fqName");
        HashSet hashSet = new HashSet();
        Iterator it = this.f43631a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((PackageFragmentProvider) it.next()).m(fqName, function1));
        }
        return hashSet;
    }

    public final String toString() {
        return this.f43632b;
    }
}
