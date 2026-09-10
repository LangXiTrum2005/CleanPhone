package p002kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import lyreflower.marial;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.cord;
import p002kotlin.collections.creditor;
import p002kotlin.collections.polloi;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.competently;
import p002kotlin.reflect.jvm.internal.impl.descriptors.hydrovane;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;

/* JADX INFO: compiled from: ChainedMemberScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class saneness implements MemberScope {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final attabal f31385wireman = new attabal(null);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final MemberScope[] f31386dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f31387saneness;

    /* JADX INFO: compiled from: ChainedMemberScope.kt */
    public static final class attabal {
        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MemberScope attabal(String debugName, Iterable<? extends MemberScope> scopes) {
            Intrinsics.checkNotNullParameter(debugName, "debugName");
            Intrinsics.checkNotNullParameter(scopes, "scopes");
            marial marialVar = new marial();
            for (MemberScope memberScope : scopes) {
                if (memberScope != MemberScope.attabal.f31367saneness) {
                    if (memberScope instanceof saneness) {
                        cord.trm(marialVar, ((saneness) memberScope).f31386dern);
                    } else {
                        marialVar.add(memberScope);
                    }
                }
            }
            return saneness(debugName, marialVar);
        }

        public final MemberScope saneness(String debugName, List<? extends MemberScope> scopes) {
            Intrinsics.checkNotNullParameter(debugName, "debugName");
            Intrinsics.checkNotNullParameter(scopes, "scopes");
            int size = scopes.size();
            if (size != 0) {
                return size != 1 ? new saneness(debugName, (MemberScope[]) scopes.toArray(new MemberScope[0]), null) : scopes.get(0);
            }
            return MemberScope.attabal.f31367saneness;
        }

        public attabal() {
        }
    }

    public /* synthetic */ saneness(String str, MemberScope[] memberScopeArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, memberScopeArr);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<byname.marial> attabal() {
        MemberScope[] memberScopeArr = this.f31386dern;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : memberScopeArr) {
            cord.stratoscope(linkedHashSet, memberScope.attabal());
        }
        return linkedHashSet;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<byname.marial> beachfront() {
        return competently.attabal(polloi.yemenite(this.f31386dern));
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.impromptu
    public Collection<apical> competently(wireman kindFilter, Function1<? super byname.marial, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        MemberScope[] memberScopeArr = this.f31386dern;
        int length = memberScopeArr.length;
        if (length == 0) {
            return adultoid.formularize();
        }
        if (length == 1) {
            return memberScopeArr[0].competently(kindFilter, nameFilter);
        }
        Collection<apical> collectionAttabal = null;
        for (MemberScope memberScope : memberScopeArr) {
            collectionAttabal = civitan.attabal.attabal(collectionAttabal, memberScope.competently(kindFilter, nameFilter));
        }
        return collectionAttabal == null ? creditor.marial() : collectionAttabal;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<saran> dern(byname.marial name, discontentedly.saneness location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        MemberScope[] memberScopeArr = this.f31386dern;
        int length = memberScopeArr.length;
        if (length == 0) {
            return adultoid.formularize();
        }
        if (length == 1) {
            return memberScopeArr[0].dern(name, location);
        }
        Collection<saran> collectionAttabal = null;
        for (MemberScope memberScope : memberScopeArr) {
            collectionAttabal = civitan.attabal.attabal(collectionAttabal, memberScope.dern(name, location));
        }
        return collectionAttabal == null ? creditor.marial() : collectionAttabal;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.impromptu
    public beachfront marial(byname.marial name, discontentedly.saneness location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        beachfront beachfrontVar = null;
        for (MemberScope memberScope : this.f31386dern) {
            beachfront beachfrontVarMarial = memberScope.marial(name, location);
            if (beachfrontVarMarial != null) {
                if (!(beachfrontVarMarial instanceof competently) || !((competently) beachfrontVarMarial).coffeecake()) {
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
    public Collection<hydrovane> saneness(byname.marial name, discontentedly.saneness location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        MemberScope[] memberScopeArr = this.f31386dern;
        int length = memberScopeArr.length;
        if (length == 0) {
            return adultoid.formularize();
        }
        if (length == 1) {
            return memberScopeArr[0].saneness(name, location);
        }
        Collection<hydrovane> collectionAttabal = null;
        for (MemberScope memberScope : memberScopeArr) {
            collectionAttabal = civitan.attabal.attabal(collectionAttabal, memberScope.saneness(name, location));
        }
        return collectionAttabal == null ? creditor.marial() : collectionAttabal;
    }

    public String toString() {
        return this.f31387saneness;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<byname.marial> wireman() {
        MemberScope[] memberScopeArr = this.f31386dern;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : memberScopeArr) {
            cord.stratoscope(linkedHashSet, memberScope.wireman());
        }
        return linkedHashSet;
    }

    public saneness(String str, MemberScope[] memberScopeArr) {
        this.f31387saneness = str;
        this.f31386dern = memberScopeArr;
    }
}
