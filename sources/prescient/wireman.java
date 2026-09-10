package prescient;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.creditor;
import p002kotlin.collections.privatdozent;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.hydrovane;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p002kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity;
import p002kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;

/* JADX INFO: compiled from: ErrorScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public class wireman implements MemberScope {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final String f35683dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ErrorScopeKind f35684saneness;

    public wireman(ErrorScopeKind kind, String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        this.f35684saneness = kind;
        String debugMessage = kind.getDebugMessage();
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        String str = String.format(debugMessage, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        this.f35683dern = str;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<byname.marial> attabal() {
        return creditor.marial();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<byname.marial> beachfront() {
        return creditor.marial();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.impromptu
    public Collection<apical> competently(p002kotlin.reflect.jvm.internal.impl.resolve.scopes.wireman kindFilter, Function1<? super byname.marial, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return adultoid.formularize();
    }

    public final String cutely() {
        return this.f35683dern;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: impromptu, reason: merged with bridge method [inline-methods] */
    public Set<hydrovane> saneness(byname.marial name, discontentedly.saneness location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return privatdozent.wireman(new saneness(competently.f35667attabal.impromptu()));
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.impromptu
    public p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront marial(byname.marial name, discontentedly.saneness location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        String str = String.format(ErrorEntity.ERROR_CLASS.getDebugText(), Arrays.copyOf(new Object[]{name}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        byname.marial marialVarImpassible = byname.marial.impassible(str);
        Intrinsics.checkNotNullExpressionValue(marialVarImpassible, "special(...)");
        return new attabal(marialVarImpassible);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
    public Set<saran> dern(byname.marial name, discontentedly.saneness location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return competently.f35667attabal.cutely();
    }

    public String toString() {
        return "ErrorScope{" + this.f35683dern + '}';
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<byname.marial> wireman() {
        return creditor.marial();
    }
}
