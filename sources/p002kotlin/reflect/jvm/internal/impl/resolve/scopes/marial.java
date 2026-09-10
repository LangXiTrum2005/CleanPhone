package p002kotlin.reflect.jvm.internal.impl.resolve.scopes;

import discontentedly.saneness;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.competently;
import p002kotlin.reflect.jvm.internal.impl.descriptors.overspeculate;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;

/* JADX INFO: compiled from: InnerClassesScopeWrapper.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class marial extends beachfront {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final MemberScope f31384saneness;

    public marial(MemberScope workerScope) {
        Intrinsics.checkNotNullParameter(workerScope, "workerScope");
        this.f31384saneness = workerScope;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<byname.marial> attabal() {
        return this.f31384saneness.attabal();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<byname.marial> beachfront() {
        return this.f31384saneness.beachfront();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.impromptu
    /* JADX INFO: renamed from: impromptu, reason: merged with bridge method [inline-methods] */
    public List<beachfront> competently(wireman kindFilter, Function1<? super byname.marial, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        wireman wiremanVarTriweekly = kindFilter.triweekly(wireman.f31395dern.dern());
        if (wiremanVarTriweekly == null) {
            return adultoid.formularize();
        }
        Collection<apical> collectionCompetently = this.f31384saneness.competently(wiremanVarTriweekly, nameFilter);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionCompetently) {
            if (obj instanceof competently) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.impromptu
    public beachfront marial(byname.marial name, saneness location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        beachfront beachfrontVarMarial = this.f31384saneness.marial(name, location);
        if (beachfrontVarMarial != null) {
            wireman wiremanVar = beachfrontVarMarial instanceof wireman ? (wireman) beachfrontVarMarial : null;
            if (wiremanVar != null) {
                return wiremanVar;
            }
            if (beachfrontVarMarial instanceof overspeculate) {
                return (overspeculate) beachfrontVarMarial;
            }
        }
        return null;
    }

    public String toString() {
        return "Classes from " + this.f31384saneness;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<byname.marial> wireman() {
        return this.f31384saneness.wireman();
    }
}
