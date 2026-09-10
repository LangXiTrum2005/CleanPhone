package p002kotlin.reflect.jvm.internal.impl.resolve.scopes;

import byname.marial;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import lyreflower.attabal;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.hydrovane;
import p002kotlin.reflect.jvm.internal.impl.descriptors.mathsort;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;
import p002kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import p002kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import p002kotlin.reflect.jvm.internal.impl.types.itchy;
import p002kotlin.saneness;
import patroclinal.taiyuan;

/* JADX INFO: compiled from: SubstitutingScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class SubstitutingScope implements MemberScope {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final taiyuan f31373beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final taiyuan f31374dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public Map<apical, apical> f31375marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final MemberScope f31376saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final TypeSubstitutor f31377wireman;

    public SubstitutingScope(MemberScope workerScope, final TypeSubstitutor givenSubstitutor) {
        Intrinsics.checkNotNullParameter(workerScope, "workerScope");
        Intrinsics.checkNotNullParameter(givenSubstitutor, "givenSubstitutor");
        this.f31376saneness = workerScope;
        this.f31374dern = saneness.saneness(new Function0<TypeSubstitutor>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope$substitutor$2
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final TypeSubstitutor invoke() {
                return givenSubstitutor.cutely().dern();
            }
        });
        itchy itchyVarCutely = givenSubstitutor.cutely();
        Intrinsics.checkNotNullExpressionValue(itchyVarCutely, "getSubstitution(...)");
        this.f31377wireman = CapturedTypeConstructorKt.beachfront(itchyVarCutely, false, 1, null).dern();
        this.f31373beachfront = saneness.saneness(new Function0<Collection<? extends apical>>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope$_allDescriptors$2
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final Collection<? extends apical> invoke() {
                SubstitutingScope substitutingScope = this.this$0;
                return substitutingScope.apical(impromptu.attabal.attabal(substitutingScope.f31376saneness, null, null, 3, null));
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends apical> Collection<D> apical(Collection<? extends D> collection2) {
        if (this.f31377wireman.apical() || collection2.isEmpty()) {
            return collection2;
        }
        LinkedHashSet linkedHashSetCompetently = attabal.competently(collection2.size());
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            linkedHashSetCompetently.add(formularize((apical) it.next()));
        }
        return linkedHashSetCompetently;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<marial> attabal() {
        return this.f31376saneness.attabal();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<marial> beachfront() {
        return this.f31376saneness.beachfront();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.impromptu
    public Collection<apical> competently(wireman kindFilter, Function1<? super marial, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return cutely();
    }

    public final Collection<apical> cutely() {
        return (Collection) this.f31373beachfront.getValue();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<? extends saran> dern(marial name, discontentedly.saneness location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return apical(this.f31376saneness.dern(name, location));
    }

    public final <D extends apical> D formularize(D d) {
        if (this.f31377wireman.apical()) {
            return d;
        }
        if (this.f31375marial == null) {
            this.f31375marial = new HashMap();
        }
        Map<apical, apical> map = this.f31375marial;
        Intrinsics.beachfront(map);
        apical apicalVarDern = map.get(d);
        if (apicalVarDern == null) {
            if (!(d instanceof mathsort)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + d).toString());
            }
            apicalVarDern = ((mathsort) d).dern(this.f31377wireman);
            if (apicalVarDern == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + d + " substitution fails");
            }
            map.put(d, apicalVarDern);
        }
        D d2 = (D) apicalVarDern;
        Intrinsics.competently(d2, "null cannot be cast to non-null type D of org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute");
        return d2;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.impromptu
    public beachfront marial(marial name, discontentedly.saneness location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        beachfront beachfrontVarMarial = this.f31376saneness.marial(name, location);
        if (beachfrontVarMarial != null) {
            return (beachfront) formularize(beachfrontVarMarial);
        }
        return null;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<? extends hydrovane> saneness(marial name, discontentedly.saneness location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return apical(this.f31376saneness.saneness(name, location));
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<marial> wireman() {
        return this.f31376saneness.wireman();
    }
}
