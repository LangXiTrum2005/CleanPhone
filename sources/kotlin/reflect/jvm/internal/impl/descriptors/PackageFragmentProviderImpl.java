package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: classes7.dex */
public final class PackageFragmentProviderImpl implements PackageFragmentProviderOptimized {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f43583a;

    public PackageFragmentProviderImpl(ArrayList arrayList) {
        this.f43583a = arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public final List a(FqName fqName) {
        Intrinsics.f(fqName, "fqName");
        ArrayList arrayList = this.f43583a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (Intrinsics.a(((PackageFragmentDescriptor) obj).c(), fqName)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public final void b(FqName fqName, ArrayList arrayList) {
        Intrinsics.f(fqName, "fqName");
        for (Object obj : this.f43583a) {
            if (Intrinsics.a(((PackageFragmentDescriptor) obj).c(), fqName)) {
                arrayList.add(obj);
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public final boolean c(FqName fqName) {
        Intrinsics.f(fqName, "fqName");
        ArrayList arrayList = this.f43583a;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (Intrinsics.a(((PackageFragmentDescriptor) it.next()).c(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public final Collection m(final FqName fqName, Function1 function1) {
        Intrinsics.f(fqName, "fqName");
        return SequencesKt.v(SequencesKt.g(SequencesKt.o(CollectionsKt.k(this.f43583a), PackageFragmentProviderImpl$getSubPackagesOf$1.X), new Function1<FqName, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl$getSubPackagesOf$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                FqName it = (FqName) obj;
                Intrinsics.f(it, "it");
                return Boolean.valueOf(!it.d() && Intrinsics.a(it.e(), fqName));
            }
        }));
    }
}
