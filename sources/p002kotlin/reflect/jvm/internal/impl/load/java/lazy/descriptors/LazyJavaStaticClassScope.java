package p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import byname.marial;
import discontentedly.saneness;
import genesic.competently;
import genesic.monoploid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import methylmercury.dern;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.cord;
import p002kotlin.collections.creditor;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.graveside;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.hydrovane;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;
import p002kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.wireman;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: compiled from: LazyJavaStaticClassScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class LazyJavaStaticClassScope extends wireman {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final dern f30565kowloon;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public final competently f30566triweekly;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaStaticClassScope(wireman c, competently jClass, dern ownerDescriptor) {
        super(c);
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(ownerDescriptor, "ownerDescriptor");
        this.f30566triweekly = jClass;
        this.f30565kowloon = ownerDescriptor;
    }

    public static final Iterable creditor(p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar) {
        Collection<oilcan> collectionCutely = wiremanVar.impromptu().cutely();
        Intrinsics.checkNotNullExpressionValue(collectionCutely, "getSupertypes(...)");
        return SequencesKt___SequencesKt.dovishness(SequencesKt___SequencesKt.merc(CollectionsKt.clubfoot(collectionCutely), new Function1<oilcan, p002kotlin.reflect.jvm.internal.impl.descriptors.wireman>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1$1
            @Override // p002kotlin.jvm.functions.Function1
            public final p002kotlin.reflect.jvm.internal.impl.descriptors.wireman invoke(oilcan oilcanVar) {
                beachfront beachfrontVarWireman = oilcanVar.setterwort().wireman();
                if (beachfrontVarWireman instanceof p002kotlin.reflect.jvm.internal.impl.descriptors.wireman) {
                    return (p002kotlin.reflect.jvm.internal.impl.descriptors.wireman) beachfrontVarWireman;
                }
                return null;
            }
        }));
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public Set<marial> formularize(p002kotlin.reflect.jvm.internal.impl.resolve.scopes.wireman kindFilter, Function1<? super marial, Boolean> function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        return creditor.marial();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public Set<marial> graveside(p002kotlin.reflect.jvm.internal.impl.resolve.scopes.wireman kindFilter, Function1<? super marial, Boolean> function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Set<marial> setTectonization = CollectionsKt.tectonization(preprohormone().invoke().marial());
        privatdozent(trm(), setTectonization, new Function1<MemberScope, Collection<? extends marial>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope$computePropertyNames$1$1
            @Override // p002kotlin.jvm.functions.Function1
            public final Collection<marial> invoke(MemberScope it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.wireman();
            }
        });
        if (this.f30566triweekly.dovishness()) {
            setTectonization.add(p002kotlin.reflect.jvm.internal.impl.builtins.competently.f29677marial);
        }
        return setTectonization;
    }

    public final saran hydrovane(saran saranVar) {
        if (saranVar.getKind().isReal()) {
            return saranVar;
        }
        Collection<? extends saran> collectionWireman = saranVar.wireman();
        Intrinsics.checkNotNullExpressionValue(collectionWireman, "getOverriddenDescriptors(...)");
        Collection<? extends saran> collection2 = collectionWireman;
        ArrayList arrayList = new ArrayList(dovishness.gintrap(collection2, 10));
        for (saran saranVar2 : collection2) {
            Intrinsics.beachfront(saranVar2);
            arrayList.add(hydrovane(saranVar2));
        }
        return (saran) CollectionsKt.herdbook(CollectionsKt.cultivated(arrayList));
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public void kowloon(Collection<hydrovane> result, marial name) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
        gintrap().attabal().gintrap().saneness(gintrap(), trm(), name, result);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.impromptu
    public beachfront marial(marial name, saneness location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return null;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.wireman, p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public void molybdenite(final marial name, Collection<saran> result) {
        marial marialVar;
        Collection<saran> collection2;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
        Set setPrivatdozent = privatdozent(trm(), new LinkedHashSet(), new Function1<MemberScope, Collection<? extends saran>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope$computeNonDeclaredProperties$propertiesFromSupertypes$1
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public final Collection<? extends saran> invoke(MemberScope it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.dern(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
            }
        });
        if (result.isEmpty()) {
            marialVar = name;
            collection2 = result;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : setPrivatdozent) {
                saran saranVarHydrovane = hydrovane((saran) obj);
                Object arrayList = linkedHashMap.get(saranVarHydrovane);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(saranVarHydrovane, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collectionMarial = p002kotlin.reflect.jvm.internal.impl.load.java.components.attabal.marial(marialVar, (Collection) ((Map.Entry) it.next()).getValue(), collection2, trm(), gintrap().attabal().dern(), gintrap().attabal().apical().attabal());
                Intrinsics.checkNotNullExpressionValue(collectionMarial, "resolveOverridesForStaticMembers(...)");
                cord.stratoscope(arrayList2, collectionMarial);
            }
            collection2.addAll(arrayList2);
        } else {
            marialVar = name;
            collection2 = result;
            Collection<? extends saran> collectionMarial2 = p002kotlin.reflect.jvm.internal.impl.load.java.components.attabal.marial(marialVar, setPrivatdozent, collection2, trm(), gintrap().attabal().dern(), gintrap().attabal().apical().attabal());
            Intrinsics.checkNotNullExpressionValue(collectionMarial2, "resolveOverridesForStaticMembers(...)");
            collection2.addAll(collectionMarial2);
        }
        if (this.f30566triweekly.dovishness() && Intrinsics.wireman(marialVar, p002kotlin.reflect.jvm.internal.impl.builtins.competently.f29677marial)) {
            lyreflower.attabal.attabal(collection2, p002kotlin.reflect.jvm.internal.impl.resolve.wireman.beachfront(trm()));
        }
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public void polloi(Collection<hydrovane> result, marial name) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
        Collection<? extends hydrovane> collectionMarial = p002kotlin.reflect.jvm.internal.impl.load.java.components.attabal.marial(name, walach(name, trm()), result, trm(), gintrap().attabal().dern(), gintrap().attabal().apical().attabal());
        Intrinsics.checkNotNullExpressionValue(collectionMarial, "resolveOverridesForStaticMembers(...)");
        result.addAll(collectionMarial);
        if (this.f30566triweekly.dovishness()) {
            if (Intrinsics.wireman(name, p002kotlin.reflect.jvm.internal.impl.builtins.competently.f29664beachfront)) {
                hydrovane hydrovaneVarCompetently = p002kotlin.reflect.jvm.internal.impl.resolve.wireman.competently(trm());
                Intrinsics.checkNotNullExpressionValue(hydrovaneVarCompetently, "createEnumValueOfMethod(...)");
                result.add(hydrovaneVarCompetently);
            } else if (Intrinsics.wireman(name, p002kotlin.reflect.jvm.internal.impl.builtins.competently.f29690wireman)) {
                hydrovane hydrovaneVarImpromptu = p002kotlin.reflect.jvm.internal.impl.resolve.wireman.impromptu(trm());
                Intrinsics.checkNotNullExpressionValue(hydrovaneVarImpromptu, "createEnumValuesMethod(...)");
                result.add(hydrovaneVarImpromptu);
            }
        }
    }

    public final <R> Set<R> privatdozent(p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar, Set<R> set, Function1<? super MemberScope, ? extends Collection<? extends R>> function1) {
        lyreflower.saneness.saneness(graveside.marial(wiremanVar), dern.f30571attabal, new attabal(wiremanVar, set, function1));
        return set;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: saran, reason: merged with bridge method [inline-methods] */
    public ClassDeclaredMemberIndex arytenoidectomy() {
        return new ClassDeclaredMemberIndex(this.f30566triweekly, new Function1<monoploid, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope$computeMemberIndex$1
            @Override // p002kotlin.jvm.functions.Function1
            public final Boolean invoke(monoploid it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.apical());
            }
        });
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: starveling, reason: merged with bridge method [inline-methods] */
    public dern trm() {
        return this.f30565kowloon;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public Set<marial> triweekly(p002kotlin.reflect.jvm.internal.impl.resolve.scopes.wireman kindFilter, Function1<? super marial, Boolean> function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Set<marial> setTectonization = CollectionsKt.tectonization(preprohormone().invoke().attabal());
        LazyJavaStaticClassScope lazyJavaStaticClassScopeSaneness = methylmercury.competently.saneness(trm());
        Set<marial> setAttabal = lazyJavaStaticClassScopeSaneness != null ? lazyJavaStaticClassScopeSaneness.attabal() : null;
        if (setAttabal == null) {
            setAttabal = creditor.marial();
        }
        setTectonization.addAll(setAttabal);
        if (this.f30566triweekly.dovishness()) {
            setTectonization.addAll(adultoid.kowloon(p002kotlin.reflect.jvm.internal.impl.builtins.competently.f29664beachfront, p002kotlin.reflect.jvm.internal.impl.builtins.competently.f29690wireman));
        }
        setTectonization.addAll(gintrap().attabal().gintrap().beachfront(gintrap(), trm()));
        return setTectonization;
    }

    public final Set<hydrovane> walach(marial marialVar, p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar) {
        LazyJavaStaticClassScope lazyJavaStaticClassScopeSaneness = methylmercury.competently.saneness(wiremanVar);
        return lazyJavaStaticClassScopeSaneness == null ? creditor.marial() : CollectionsKt.prefect(lazyJavaStaticClassScopeSaneness.saneness(marialVar, NoLookupLocation.WHEN_GET_SUPER_MEMBERS));
    }

    /* JADX INFO: compiled from: LazyJavaStaticClassScope.kt */
    public static final class attabal extends lyreflower.saneness.AbstractC0726saneness<p002kotlin.reflect.jvm.internal.impl.descriptors.wireman, Unit> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ p002kotlin.reflect.jvm.internal.impl.descriptors.wireman f30567attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ Function1<MemberScope, Collection<R>> f30568dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ Set<R> f30569saneness;

        /* JADX WARN: Multi-variable type inference failed */
        public attabal(p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar, Set<R> set, Function1<? super MemberScope, ? extends Collection<? extends R>> function1) {
            this.f30567attabal = wiremanVar;
            this.f30569saneness = set;
            this.f30568dern = function1;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // lyreflower.saneness.wireman
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public boolean saneness(p002kotlin.reflect.jvm.internal.impl.descriptors.wireman current) {
            Intrinsics.checkNotNullParameter(current, "current");
            if (current == this.f30567attabal) {
                return true;
            }
            MemberScope memberScopeLerp = current.lerp();
            Intrinsics.checkNotNullExpressionValue(memberScopeLerp, "getStaticScope(...)");
            if (!(memberScopeLerp instanceof wireman)) {
                return true;
            }
            this.f30569saneness.addAll((Collection<? extends R>) ((Collection) this.f30568dern.invoke(memberScopeLerp)));
            return false;
        }

        @Override // lyreflower.saneness.wireman
        public /* bridge */ /* synthetic */ Object result() {
            wireman();
            return Unit.f29295attabal;
        }

        public void wireman() {
        }
    }
}
