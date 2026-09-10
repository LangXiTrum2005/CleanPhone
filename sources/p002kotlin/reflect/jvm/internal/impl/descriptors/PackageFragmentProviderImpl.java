package p002kotlin.reflect.jvm.internal.impl.descriptors;

import byname.dern;
import byname.marial;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.sequences.SequencesKt___SequencesKt;
import patroclinal.wireman;

/* JADX INFO: compiled from: PackageFragmentProviderImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class PackageFragmentProviderImpl implements restrictive {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Collection<sealless> f29906attabal;

    /* JADX WARN: Multi-variable type inference failed */
    public PackageFragmentProviderImpl(Collection<? extends sealless> packageFragments) {
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        this.f29906attabal = packageFragments;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.restrictive
    public boolean attabal(dern fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Collection<sealless> collection2 = this.f29906attabal;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (Intrinsics.wireman(((sealless) it.next()).marial(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.kattegat
    @wireman
    public List<sealless> dern(dern fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Collection<sealless> collection2 = this.f29906attabal;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection2) {
            if (Intrinsics.wireman(((sealless) obj).marial(), fqName)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.kattegat
    public Collection<dern> polloi(final dern fqName, Function1<? super marial, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return SequencesKt___SequencesKt.hydrovane(SequencesKt___SequencesKt.preprohormone(SequencesKt___SequencesKt.restrictive(CollectionsKt.clubfoot(this.f29906attabal), new Function1<sealless, dern>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl$getSubPackagesOf$1
            @Override // p002kotlin.jvm.functions.Function1
            public final dern invoke(sealless it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.marial();
            }
        }), new Function1<dern, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl$getSubPackagesOf$2
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public final Boolean invoke(dern it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!it.wireman() && Intrinsics.wireman(it.marial(), fqName));
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.restrictive
    public void saneness(dern fqName, Collection<sealless> packageFragments) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        for (Object obj : this.f29906attabal) {
            if (Intrinsics.wireman(((sealless) obj).marial(), fqName)) {
                packageFragments.add(obj);
            }
        }
    }
}
