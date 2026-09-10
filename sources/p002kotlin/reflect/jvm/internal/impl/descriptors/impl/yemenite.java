package p002kotlin.reflect.jvm.internal.impl.descriptors.impl;

import byname.dern;
import byname.marial;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import lyreflower.attabal;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.creditor;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.merc;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.wireman;

/* JADX INFO: compiled from: SubpackagesScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public class yemenite extends beachfront {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final dern f30183dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final trm f30184saneness;

    public yemenite(trm moduleDescriptor, dern fqName) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.f30184saneness = moduleDescriptor;
        this.f30183dern = fqName;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<marial> beachfront() {
        return creditor.marial();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.impromptu
    public Collection<apical> competently(wireman kindFilter, Function1<? super marial, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        if (!kindFilter.attabal(wireman.f31395dern.beachfront())) {
            return adultoid.formularize();
        }
        if (this.f30183dern.wireman() && kindFilter.formularize().contains(kotlin.reflect.jvm.internal.impl.resolve.scopes.dern.saneness.f31383attabal)) {
            return adultoid.formularize();
        }
        Collection<dern> collectionPolloi = this.f30184saneness.polloi(this.f30183dern, nameFilter);
        ArrayList arrayList = new ArrayList(collectionPolloi.size());
        Iterator<dern> it = collectionPolloi.iterator();
        while (it.hasNext()) {
            marial marialVarCompetently = it.next().competently();
            Intrinsics.checkNotNullExpressionValue(marialVarCompetently, "shortName(...)");
            if (nameFilter.invoke(marialVarCompetently).booleanValue()) {
                attabal.attabal(arrayList, impromptu(marialVarCompetently));
            }
        }
        return arrayList;
    }

    public final merc impromptu(marial name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (name.apical()) {
            return null;
        }
        trm trmVar = this.f30184saneness;
        dern dernVarDern = this.f30183dern.dern(name);
        Intrinsics.checkNotNullExpressionValue(dernVarDern, "child(...)");
        merc mercVarHydrovane = trmVar.hydrovane(dernVarDern);
        if (mercVarHydrovane.isEmpty()) {
            return null;
        }
        return mercVarHydrovane;
    }

    public String toString() {
        return "subpackages of " + this.f30183dern + " from " + this.f30184saneness;
    }
}
