package p002kotlin.reflect.jvm.internal.impl.descriptors.impl;

import byname.dern;
import byname.marial;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.kattegat;
import p002kotlin.reflect.jvm.internal.impl.descriptors.restrictive;
import p002kotlin.reflect.jvm.internal.impl.descriptors.sealless;
import p002kotlin.reflect.jvm.internal.impl.descriptors.supplicat;
import patroclinal.wireman;

/* JADX INFO: compiled from: CompositePackageFragmentProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class impromptu implements restrictive {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final List<kattegat> f30082attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f30083saneness;

    /* JADX WARN: Multi-variable type inference failed */
    public impromptu(List<? extends kattegat> providers, String debugName) {
        Intrinsics.checkNotNullParameter(providers, "providers");
        Intrinsics.checkNotNullParameter(debugName, "debugName");
        this.f30082attabal = providers;
        this.f30083saneness = debugName;
        providers.size();
        CollectionsKt.prefect(providers).size();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.restrictive
    public boolean attabal(dern fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        List<kattegat> list = this.f30082attabal;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!supplicat.saneness((kattegat) it.next(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.kattegat
    @wireman
    public List<sealless> dern(dern fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        Iterator<kattegat> it = this.f30082attabal.iterator();
        while (it.hasNext()) {
            supplicat.attabal(it.next(), fqName, arrayList);
        }
        return CollectionsKt.molet(arrayList);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.kattegat
    public Collection<dern> polloi(dern fqName, Function1<? super marial, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        HashSet hashSet = new HashSet();
        Iterator<kattegat> it = this.f30082attabal.iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().polloi(fqName, nameFilter));
        }
        return hashSet;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.restrictive
    public void saneness(dern fqName, Collection<sealless> packageFragments) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        Iterator<kattegat> it = this.f30082attabal.iterator();
        while (it.hasNext()) {
            supplicat.attabal(it.next(), fqName, packageFragments);
        }
    }

    public String toString() {
        return this.f30083saneness;
    }
}
