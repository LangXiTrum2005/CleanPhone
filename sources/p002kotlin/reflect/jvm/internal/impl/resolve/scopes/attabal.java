package p002kotlin.reflect.jvm.internal.impl.resolve.scopes;

import byname.marial;
import discontentedly.saneness;
import java.util.Collection;
import java.util.Set;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.hydrovane;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;

/* JADX INFO: compiled from: AbstractScopeAdapter.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class attabal implements MemberScope {
    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<marial> attabal() {
        return taiyuan().attabal();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<marial> beachfront() {
        return taiyuan().beachfront();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.impromptu
    public Collection<apical> competently(wireman kindFilter, Function1<? super marial, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return taiyuan().competently(kindFilter, nameFilter);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<saran> dern(marial name, saneness location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return taiyuan().dern(name, location);
    }

    public final MemberScope impromptu() {
        if (!(taiyuan() instanceof attabal)) {
            return taiyuan();
        }
        MemberScope memberScopeTaiyuan = taiyuan();
        Intrinsics.competently(memberScopeTaiyuan, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
        return ((attabal) memberScopeTaiyuan).impromptu();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.impromptu
    public beachfront marial(marial name, saneness location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return taiyuan().marial(name, location);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<hydrovane> saneness(marial name, saneness location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return taiyuan().saneness(name, location);
    }

    public abstract MemberScope taiyuan();

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<marial> wireman() {
        return taiyuan().wireman();
    }
}
