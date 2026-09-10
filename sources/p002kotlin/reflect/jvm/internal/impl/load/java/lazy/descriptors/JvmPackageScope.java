package p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import byname.marial;
import civitan.attabal;
import discontentedly.saneness;
import genesic.adultoid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kurbash.formularize;
import p002kotlin.collections.cord;
import p002kotlin.collections.creditor;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.PropertyReference1Impl;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.hydrovane;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.wireman;
import p002kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.competently;
import yeast.apical;
import yeast.impromptu;

/* JADX INFO: compiled from: JvmPackageScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class JvmPackageScope implements MemberScope {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final /* synthetic */ formularize<Object>[] f30485beachfront = {polloi.cutely(new PropertyReference1Impl(polloi.saneness(JvmPackageScope.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final LazyJavaPackageFragment f30486dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final impromptu f30487marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final wireman f30488saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final LazyJavaPackageScope f30489wireman;

    public JvmPackageScope(wireman c, adultoid jPackage, LazyJavaPackageFragment packageFragment) {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(jPackage, "jPackage");
        Intrinsics.checkNotNullParameter(packageFragment, "packageFragment");
        this.f30488saneness = c;
        this.f30486dern = packageFragment;
        this.f30489wireman = new LazyJavaPackageScope(c, jPackage, packageFragment);
        this.f30487marial = c.marial().dern(new Function0<MemberScope[]>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JvmPackageScope$kotlinScopes$2
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final MemberScope[] invoke() {
                Collection<monoploid> collectionValues = this.this$0.f30486dern.mastfed().values();
                JvmPackageScope jvmPackageScope = this.this$0;
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = collectionValues.iterator();
                while (it.hasNext()) {
                    MemberScope memberScopeSaneness = jvmPackageScope.f30488saneness.attabal().saneness().saneness(jvmPackageScope.f30486dern, (monoploid) it.next());
                    if (memberScopeSaneness != null) {
                        arrayList.add(memberScopeSaneness);
                    }
                }
                return (MemberScope[]) attabal.saneness(arrayList).toArray(new MemberScope[0]);
            }
        });
    }

    public final MemberScope[] apical() {
        return (MemberScope[]) apical.attabal(this.f30487marial, this, f30485beachfront[0]);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<marial> attabal() {
        MemberScope[] memberScopeArrApical = apical();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : memberScopeArrApical) {
            cord.stratoscope(linkedHashSet, memberScope.attabal());
        }
        linkedHashSet.addAll(this.f30489wireman.attabal());
        return linkedHashSet;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<marial> beachfront() {
        Set<marial> setAttabal = competently.attabal(p002kotlin.collections.polloi.yemenite(apical()));
        if (setAttabal == null) {
            return null;
        }
        setAttabal.addAll(this.f30489wireman.beachfront());
        return setAttabal;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.impromptu
    public Collection<p002kotlin.reflect.jvm.internal.impl.descriptors.apical> competently(p002kotlin.reflect.jvm.internal.impl.resolve.scopes.wireman kindFilter, Function1<? super marial, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        LazyJavaPackageScope lazyJavaPackageScope = this.f30489wireman;
        MemberScope[] memberScopeArrApical = apical();
        Collection<p002kotlin.reflect.jvm.internal.impl.descriptors.apical> collectionCompetently = lazyJavaPackageScope.competently(kindFilter, nameFilter);
        for (MemberScope memberScope : memberScopeArrApical) {
            collectionCompetently = attabal.attabal(collectionCompetently, memberScope.competently(kindFilter, nameFilter));
        }
        return collectionCompetently == null ? creditor.marial() : collectionCompetently;
    }

    public final LazyJavaPackageScope cutely() {
        return this.f30489wireman;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<saran> dern(marial name, saneness location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        formularize(name, location);
        LazyJavaPackageScope lazyJavaPackageScope = this.f30489wireman;
        MemberScope[] memberScopeArrApical = apical();
        Collection<? extends saran> collectionDern = lazyJavaPackageScope.dern(name, location);
        int length = memberScopeArrApical.length;
        int i = 0;
        Collection collection2 = collectionDern;
        while (i < length) {
            Collection collectionAttabal = attabal.attabal(collection2, memberScopeArrApical[i].dern(name, location));
            i++;
            collection2 = collectionAttabal;
        }
        return collection2 == null ? creditor.marial() : collection2;
    }

    public void formularize(marial name, saneness location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        needler.attabal.saneness(this.f30488saneness.attabal().formularize(), location, this.f30486dern, name);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.impromptu
    public beachfront marial(marial name, saneness location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        formularize(name, location);
        p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVarStarveling = this.f30489wireman.marial(name, location);
        if (wiremanVarStarveling != null) {
            return wiremanVarStarveling;
        }
        beachfront beachfrontVar = null;
        for (MemberScope memberScope : apical()) {
            beachfront beachfrontVarMarial = memberScope.marial(name, location);
            if (beachfrontVarMarial != null) {
                if (!(beachfrontVarMarial instanceof p002kotlin.reflect.jvm.internal.impl.descriptors.competently) || !((p002kotlin.reflect.jvm.internal.impl.descriptors.competently) beachfrontVarMarial).coffeecake()) {
                    return beachfrontVarMarial;
                }
                if (beachfrontVar == null) {
                    beachfrontVar = beachfrontVarMarial;
                }
            }
        }
        return beachfrontVar;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<hydrovane> saneness(marial name, saneness location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        formularize(name, location);
        LazyJavaPackageScope lazyJavaPackageScope = this.f30489wireman;
        MemberScope[] memberScopeArrApical = apical();
        Collection<? extends hydrovane> collectionSaneness = lazyJavaPackageScope.saneness(name, location);
        int length = memberScopeArrApical.length;
        int i = 0;
        Collection collection2 = collectionSaneness;
        while (i < length) {
            Collection collectionAttabal = attabal.attabal(collection2, memberScopeArrApical[i].saneness(name, location));
            i++;
            collection2 = collectionAttabal;
        }
        return collection2 == null ? creditor.marial() : collection2;
    }

    public String toString() {
        return "scope for " + this.f30486dern;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<marial> wireman() {
        MemberScope[] memberScopeArrApical = apical();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : memberScopeArrApical) {
            cord.stratoscope(linkedHashSet, memberScope.wireman());
        }
        linkedHashSet.addAll(this.f30489wireman.wireman());
        return linkedHashSet;
    }
}
