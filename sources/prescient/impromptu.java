package prescient;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.hydrovane;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;
import p002kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;

/* JADX INFO: compiled from: ThrowingScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class impromptu extends wireman {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public impromptu(ErrorScopeKind kind, String... formatParams) {
        super(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
    }

    @Override // prescient.wireman, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<byname.marial> attabal() {
        throw new IllegalStateException();
    }

    @Override // prescient.wireman, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<byname.marial> beachfront() {
        throw new IllegalStateException();
    }

    @Override // prescient.wireman, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.impromptu
    public Collection<apical> competently(p002kotlin.reflect.jvm.internal.impl.resolve.scopes.wireman kindFilter, Function1<? super byname.marial, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        throw new IllegalStateException(cutely());
    }

    @Override // prescient.wireman, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: impromptu */
    public Set<hydrovane> saneness(byname.marial name, discontentedly.saneness location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        throw new IllegalStateException(cutely() + ", required name: " + name);
    }

    @Override // prescient.wireman, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.impromptu
    public p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront marial(byname.marial name, discontentedly.saneness location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        throw new IllegalStateException(cutely() + ", required name: " + name);
    }

    @Override // prescient.wireman, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: taiyuan */
    public Set<saran> dern(byname.marial name, discontentedly.saneness location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        throw new IllegalStateException(cutely() + ", required name: " + name);
    }

    @Override // prescient.wireman
    public String toString() {
        return "ThrowingScope{" + cutely() + '}';
    }

    @Override // prescient.wireman, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<byname.marial> wireman() {
        throw new IllegalStateException();
    }
}
