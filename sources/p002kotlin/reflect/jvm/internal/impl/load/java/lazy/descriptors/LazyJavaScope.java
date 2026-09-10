package p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import byname.marial;
import com.ironsource.C3414a2;
import genesic.preprohormone;
import genesic.stratoscope;
import genesic.triweekly;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kurbash.formularize;
import p002kotlin.Pair;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.IndexedValue;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.polder;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.PropertyReference1Impl;
import p002kotlin.jvm.internal.Ref$ObjectRef;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.attabal;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness;
import p002kotlin.reflect.jvm.internal.impl.descriptors.hydrovane;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.cord;
import p002kotlin.reflect.jvm.internal.impl.descriptors.premeiotic;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;
import p002kotlin.reflect.jvm.internal.impl.descriptors.starveling;
import p002kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import p002kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.dern;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.wireman;
import p002kotlin.reflect.jvm.internal.impl.load.java.rotuma;
import p002kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront;
import p002kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import p002kotlin.reflect.jvm.internal.impl.types.nosophobia;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import yeast.competently;
import yeast.impromptu;
import yeast.taiyuan;

/* JADX INFO: compiled from: LazyJavaScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class LazyJavaScope extends beachfront {

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public static final /* synthetic */ formularize<Object>[] f30545impassible = {polloi.cutely(new PropertyReference1Impl(polloi.saneness(LazyJavaScope.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(LazyJavaScope.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(LazyJavaScope.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final impromptu f30546apical;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final yeast.beachfront<marial, Collection<hydrovane>> f30547beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final competently<marial, saran> f30548competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final impromptu f30549cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final LazyJavaScope f30550dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public final yeast.beachfront<marial, List<saran>> f30551formularize;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final yeast.beachfront<marial, Collection<hydrovane>> f30552impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final impromptu<p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.attabal> f30553marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final wireman f30554saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final impromptu f30555taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final impromptu<Collection<apical>> f30556wireman;

    /* JADX INFO: compiled from: LazyJavaScope.kt */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final oilcan f30557attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final List<String> f30558beachfront;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final List<cultivated> f30559dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final boolean f30560marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final oilcan f30561saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final List<clubfoot> f30562wireman;

        /* JADX WARN: Multi-variable type inference failed */
        public attabal(oilcan returnType, oilcan oilcanVar, List<? extends cultivated> valueParameters, List<? extends clubfoot> typeParameters, boolean z, List<String> errors) {
            Intrinsics.checkNotNullParameter(returnType, "returnType");
            Intrinsics.checkNotNullParameter(valueParameters, "valueParameters");
            Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
            Intrinsics.checkNotNullParameter(errors, "errors");
            this.f30557attabal = returnType;
            this.f30561saneness = oilcanVar;
            this.f30559dern = valueParameters;
            this.f30562wireman = typeParameters;
            this.f30560marial = z;
            this.f30558beachfront = errors;
        }

        public final List<String> attabal() {
            return this.f30558beachfront;
        }

        public final List<cultivated> beachfront() {
            return this.f30559dern;
        }

        public final oilcan dern() {
            return this.f30561saneness;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof attabal)) {
                return false;
            }
            attabal attabalVar = (attabal) obj;
            return Intrinsics.wireman(this.f30557attabal, attabalVar.f30557attabal) && Intrinsics.wireman(this.f30561saneness, attabalVar.f30561saneness) && Intrinsics.wireman(this.f30559dern, attabalVar.f30559dern) && Intrinsics.wireman(this.f30562wireman, attabalVar.f30562wireman) && this.f30560marial == attabalVar.f30560marial && Intrinsics.wireman(this.f30558beachfront, attabalVar.f30558beachfront);
        }

        public int hashCode() {
            int iHashCode = this.f30557attabal.hashCode() * 31;
            oilcan oilcanVar = this.f30561saneness;
            return ((((((((iHashCode + (oilcanVar == null ? 0 : oilcanVar.hashCode())) * 31) + this.f30559dern.hashCode()) * 31) + this.f30562wireman.hashCode()) * 31) + Boolean.hashCode(this.f30560marial)) * 31) + this.f30558beachfront.hashCode();
        }

        public final List<clubfoot> marial() {
            return this.f30562wireman;
        }

        public final boolean saneness() {
            return this.f30560marial;
        }

        public String toString() {
            return "MethodSignatureData(returnType=" + this.f30557attabal + ", receiverType=" + this.f30561saneness + ", valueParameters=" + this.f30559dern + ", typeParameters=" + this.f30562wireman + ", hasStableParameterNames=" + this.f30560marial + ", errors=" + this.f30558beachfront + ')';
        }

        public final oilcan wireman() {
            return this.f30557attabal;
        }
    }

    /* JADX INFO: compiled from: LazyJavaScope.kt */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final List<cultivated> f30563attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final boolean f30564saneness;

        /* JADX WARN: Multi-variable type inference failed */
        public saneness(List<? extends cultivated> descriptors, boolean z) {
            Intrinsics.checkNotNullParameter(descriptors, "descriptors");
            this.f30563attabal = descriptors;
            this.f30564saneness = z;
        }

        public final List<cultivated> attabal() {
            return this.f30563attabal;
        }

        public final boolean saneness() {
            return this.f30564saneness;
        }
    }

    public /* synthetic */ LazyJavaScope(wireman wiremanVar, LazyJavaScope lazyJavaScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wiremanVar, (i & 2) != 0 ? null : lazyJavaScope);
    }

    public final cord adultoid(triweekly triweeklyVar) {
        methylmercury.marial marialVarCig = methylmercury.marial.cig(trm(), dern.attabal(this.f30554saneness, triweeklyVar), Modality.FINAL, rotuma.wireman(triweeklyVar.getVisibility()), !triweeklyVar.isFinal(), triweeklyVar.getName(), this.f30554saneness.attabal().graveside().attabal(triweeklyVar), sealless(triweeklyVar));
        Intrinsics.checkNotNullExpressionValue(marialVarCig, "create(...)");
        return marialVarCig;
    }

    public abstract p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.attabal arytenoidectomy();

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<marial> attabal() {
        return cuirassed();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<marial> beachfront() {
        return rotuma();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.impromptu
    public Collection<apical> competently(p002kotlin.reflect.jvm.internal.impl.resolve.scopes.wireman kindFilter, Function1<? super marial, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return this.f30556wireman.invoke();
    }

    public abstract starveling cord();

    public final Set<marial> cuirassed() {
        return (Set) yeast.apical.attabal(this.f30555taiyuan, this, f30545impassible[0]);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<saran> dern(marial name, discontentedly.saneness location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return !wireman().contains(name) ? adultoid.formularize() : this.f30551formularize.invoke(name);
    }

    public final impromptu<Collection<apical>> dovishness() {
        return this.f30556wireman;
    }

    public abstract Set<marial> formularize(p002kotlin.reflect.jvm.internal.impl.resolve.scopes.wireman wiremanVar, Function1<? super marial, Boolean> function1);

    public final wireman gintrap() {
        return this.f30554saneness;
    }

    public abstract Set<marial> graveside(p002kotlin.reflect.jvm.internal.impl.resolve.scopes.wireman wiremanVar, Function1<? super marial, Boolean> function1);

    public final List<apical> impassible(p002kotlin.reflect.jvm.internal.impl.resolve.scopes.wireman kindFilter, Function1<? super marial, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        NoLookupLocation noLookupLocation = NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (kindFilter.attabal(p002kotlin.reflect.jvm.internal.impl.resolve.scopes.wireman.f31395dern.dern())) {
            for (marial marialVar : formularize(kindFilter, nameFilter)) {
                if (nameFilter.invoke(marialVar).booleanValue()) {
                    lyreflower.attabal.attabal(linkedHashSet, marial(marialVar, noLookupLocation));
                }
            }
        }
        if (kindFilter.attabal(p002kotlin.reflect.jvm.internal.impl.resolve.scopes.wireman.f31395dern.wireman()) && !kindFilter.formularize().contains(kotlin.reflect.jvm.internal.impl.resolve.scopes.dern.attabal.f31381attabal)) {
            for (marial marialVar2 : triweekly(kindFilter, nameFilter)) {
                if (nameFilter.invoke(marialVar2).booleanValue()) {
                    linkedHashSet.addAll(saneness(marialVar2, noLookupLocation));
                }
            }
        }
        if (kindFilter.attabal(p002kotlin.reflect.jvm.internal.impl.resolve.scopes.wireman.f31395dern.taiyuan()) && !kindFilter.formularize().contains(kotlin.reflect.jvm.internal.impl.resolve.scopes.dern.attabal.f31381attabal)) {
            for (marial marialVar3 : graveside(kindFilter, nameFilter)) {
                if (nameFilter.invoke(marialVar3).booleanValue()) {
                    linkedHashSet.addAll(dern(marialVar3, noLookupLocation));
                }
            }
        }
        return CollectionsKt.molet(linkedHashSet);
    }

    public boolean kattegat(JavaMethodDescriptor javaMethodDescriptor) {
        Intrinsics.checkNotNullParameter(javaMethodDescriptor, "<this>");
        return true;
    }

    public void kowloon(Collection<hydrovane> result, marial name) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, kotlin.reflect.jvm.internal.impl.descriptors.impl.cord] */
    /* JADX WARN: Type inference failed for: r1v13, types: [T, kotlin.reflect.jvm.internal.impl.descriptors.impl.cord] */
    public final saran merc(final triweekly triweeklyVar) {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? Adultoid = adultoid(triweeklyVar);
        ref$ObjectRef.element = Adultoid;
        Adultoid.basify(null, null, null, null);
        ((cord) ref$ObjectRef.element).fastrack(yemenite(triweeklyVar), adultoid.formularize(), cord(), null, adultoid.formularize());
        apical apicalVarTrm = trm();
        p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar = apicalVarTrm instanceof p002kotlin.reflect.jvm.internal.impl.descriptors.wireman ? (p002kotlin.reflect.jvm.internal.impl.descriptors.wireman) apicalVarTrm : null;
        if (wiremanVar != null) {
            wireman wiremanVar2 = this.f30554saneness;
            ref$ObjectRef.element = wiremanVar2.attabal().gintrap().impromptu(wiremanVar2, wiremanVar, (cord) ref$ObjectRef.element);
        }
        T t = ref$ObjectRef.element;
        if (p002kotlin.reflect.jvm.internal.impl.resolve.marial.polder((premeiotic) t, ((cord) t).getType())) {
            ((cord) ref$ObjectRef.element).setterwort(new Function0<taiyuan<? extends p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<?>>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$resolveProperty$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p002kotlin.jvm.functions.Function0
                public final taiyuan<? extends p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<?>> invoke() {
                    yeast.formularize formularizeVarMarial = this.this$0.gintrap().marial();
                    final LazyJavaScope lazyJavaScope = this.this$0;
                    final triweekly triweeklyVar2 = triweeklyVar;
                    final Ref$ObjectRef<cord> ref$ObjectRef2 = ref$ObjectRef;
                    return formularizeVarMarial.marial(new Function0<p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<?>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$resolveProperty$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p002kotlin.jvm.functions.Function0
                        public final p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<?> invoke() {
                            return lazyJavaScope.gintrap().attabal().competently().attabal(triweeklyVar2, ref$ObjectRef2.element);
                        }
                    });
                }
            });
        }
        this.f30554saneness.attabal().impromptu().wireman(triweeklyVar, (saran) ref$ObjectRef.element);
        return (saran) ref$ObjectRef.element;
    }

    public abstract void molybdenite(marial marialVar, Collection<saran> collection2);

    public final oilcan monoploid(genesic.polloi method, wireman c) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(c, "c");
        return c.competently().kowloon(method.getReturnType(), p002kotlin.reflect.jvm.internal.impl.load.java.lazy.types.saneness.saneness(TypeUsage.COMMON, method.grimness().kowloon(), false, null, 6, null));
    }

    public final Set<marial> oilcan() {
        return (Set) yeast.apical.attabal(this.f30549cutely, this, f30545impassible[1]);
    }

    public final saneness polder(wireman c, dovishness dovishnessVar, List<? extends stratoscope> jValueParameters) {
        Pair pairAttabal;
        marial name;
        Intrinsics.checkNotNullParameter(c, "c");
        dovishness function = dovishnessVar;
        Intrinsics.checkNotNullParameter(function, "function");
        Intrinsics.checkNotNullParameter(jValueParameters, "jValueParameters");
        Iterable<IndexedValue> iterableLicking = CollectionsKt.licking(jValueParameters);
        ArrayList arrayList = new ArrayList(p002kotlin.collections.dovishness.gintrap(iterableLicking, 10));
        boolean z = false;
        for (IndexedValue indexedValue : iterableLicking) {
            int index = indexedValue.getIndex();
            stratoscope stratoscopeVar = (stratoscope) indexedValue.saneness();
            p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial marialVarAttabal = dern.attabal(c, stratoscopeVar);
            p002kotlin.reflect.jvm.internal.impl.load.java.lazy.types.attabal attabalVarSaneness = p002kotlin.reflect.jvm.internal.impl.load.java.lazy.types.saneness.saneness(TypeUsage.COMMON, false, false, null, 7, null);
            if (stratoscopeVar.saneness()) {
                genesic.rotuma type = stratoscopeVar.getType();
                genesic.beachfront beachfrontVar = type instanceof genesic.beachfront ? (genesic.beachfront) type : null;
                if (beachfrontVar == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + stratoscopeVar);
                }
                oilcan oilcanVarApical = c.competently().apical(beachfrontVar, attabalVarSaneness, true);
                pairAttabal = patroclinal.formularize.attabal(oilcanVarApical, c.wireman().apical().apical(oilcanVarApical));
            } else {
                pairAttabal = patroclinal.formularize.attabal(c.competently().kowloon(stratoscopeVar.getType(), attabalVarSaneness), null);
            }
            oilcan oilcanVar = (oilcan) pairAttabal.component1();
            oilcan oilcanVar2 = (oilcan) pairAttabal.component2();
            if (Intrinsics.wireman(function.getName().dern(), "equals") && jValueParameters.size() == 1 && Intrinsics.wireman(c.wireman().apical().restrictive(), oilcanVar)) {
                name = marial.cutely(C3414a2.d);
            } else {
                name = stratoscopeVar.getName();
                if (name == null) {
                    z = true;
                }
                if (name == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append('p');
                    sb.append(index);
                    name = marial.cutely(sb.toString());
                    Intrinsics.checkNotNullExpressionValue(name, "identifier(...)");
                }
            }
            boolean z2 = z;
            Intrinsics.beachfront(name);
            arrayList.add(new ValueParameterDescriptorImpl(function, null, index, marialVarAttabal, name, oilcanVar, false, false, false, oilcanVar2, c.attabal().graveside().attabal(stratoscopeVar)));
            function = dovishnessVar;
            z = z2;
        }
        return new saneness(CollectionsKt.molet(arrayList), z);
    }

    public abstract void polloi(Collection<hydrovane> collection2, marial marialVar);

    public final impromptu<p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.attabal> preprohormone() {
        return this.f30553marial;
    }

    public final JavaMethodDescriptor restrictive(genesic.polloi method) {
        Intrinsics.checkNotNullParameter(method, "method");
        JavaMethodDescriptor javaMethodDescriptorVir = JavaMethodDescriptor.vir(trm(), dern.attabal(this.f30554saneness, method), method.getName(), this.f30554saneness.attabal().graveside().attabal(method), this.f30553marial.invoke().saneness(method.getName()) != null && method.beachfront().isEmpty());
        Intrinsics.checkNotNullExpressionValue(javaMethodDescriptorVir, "createJavaMethod(...)");
        wireman wiremanVarBeachfront = ContextKt.beachfront(this.f30554saneness, javaMethodDescriptorVir, method, 0, 4, null);
        List<preprohormone> typeParameters = method.getTypeParameters();
        List<? extends clubfoot> arrayList = new ArrayList<>(p002kotlin.collections.dovishness.gintrap(typeParameters, 10));
        Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            clubfoot clubfootVarAttabal = wiremanVarBeachfront.beachfront().attabal((preprohormone) it.next());
            Intrinsics.beachfront(clubfootVarAttabal);
            arrayList.add(clubfootVarAttabal);
        }
        saneness sanenessVarPolder = polder(wiremanVarBeachfront, javaMethodDescriptorVir, method.beachfront());
        attabal attabalVarSupplicat = supplicat(method, arrayList, monoploid(method, wiremanVarBeachfront), sanenessVarPolder.attabal());
        oilcan oilcanVarDern = attabalVarSupplicat.dern();
        javaMethodDescriptorVir.liable(oilcanVarDern != null ? p002kotlin.reflect.jvm.internal.impl.resolve.wireman.taiyuan(javaMethodDescriptorVir, oilcanVarDern, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial.f29950impromptu.saneness()) : null, cord(), adultoid.formularize(), attabalVarSupplicat.marial(), attabalVarSupplicat.beachfront(), attabalVarSupplicat.wireman(), Modality.Companion.attabal(false, method.isAbstract(), !method.isFinal()), rotuma.wireman(method.getVisibility()), attabalVarSupplicat.dern() != null ? polder.beachfront(patroclinal.formularize.attabal(JavaMethodDescriptor.f30405peridotite, CollectionsKt.lerp(sanenessVarPolder.attabal()))) : seminary.taiyuan());
        javaMethodDescriptorVir.incorrectly(attabalVarSupplicat.saneness(), sanenessVarPolder.saneness());
        if (!attabalVarSupplicat.attabal().isEmpty()) {
            wiremanVarBeachfront.attabal().molybdenite().attabal(javaMethodDescriptorVir, attabalVarSupplicat.attabal());
        }
        return javaMethodDescriptorVir;
    }

    public final Set<marial> rotuma() {
        return (Set) yeast.apical.attabal(this.f30546apical, this, f30545impassible[2]);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<hydrovane> saneness(marial name, discontentedly.saneness location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return !attabal().contains(name) ? adultoid.formularize() : this.f30552impromptu.invoke(name);
    }

    public final boolean sealless(triweekly triweeklyVar) {
        return triweeklyVar.isFinal() && triweeklyVar.apical();
    }

    public final void seminary(Set<hydrovane> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : set) {
            String strDern = p002kotlin.reflect.jvm.internal.impl.load.kotlin.dovishness.dern((hydrovane) obj, false, false, 2, null);
            Object arrayList = linkedHashMap.get(strDern);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strDern, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        for (List list : linkedHashMap.values()) {
            if (list.size() != 1) {
                List list2 = list;
                Collection<? extends hydrovane> collectionAttabal = OverridingUtilsKt.attabal(list2, new Function1<hydrovane, p002kotlin.reflect.jvm.internal.impl.descriptors.attabal>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$retainMostSpecificMethods$mostSpecificMethods$1
                    @Override // p002kotlin.jvm.functions.Function1
                    public final attabal invoke(hydrovane selectMostSpecificInEachOverridableGroup) {
                        Intrinsics.checkNotNullParameter(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
                        return selectMostSpecificInEachOverridableGroup;
                    }
                });
                set.removeAll(list2);
                set.addAll(collectionAttabal);
            }
        }
    }

    public final LazyJavaScope stratoscope() {
        return this.f30550dern;
    }

    public abstract attabal supplicat(genesic.polloi polloiVar, List<? extends clubfoot> list, oilcan oilcanVar, List<? extends cultivated> list2);

    public String toString() {
        return "Lazy scope for " + trm();
    }

    public abstract Set<marial> triweekly(p002kotlin.reflect.jvm.internal.impl.resolve.scopes.wireman wiremanVar, Function1<? super marial, Boolean> function1);

    public abstract apical trm();

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<marial> wireman() {
        return oilcan();
    }

    public final oilcan yemenite(triweekly triweeklyVar) {
        oilcan oilcanVarKowloon = this.f30554saneness.competently().kowloon(triweeklyVar.getType(), p002kotlin.reflect.jvm.internal.impl.load.java.lazy.types.saneness.saneness(TypeUsage.COMMON, false, false, null, 7, null));
        if ((!p002kotlin.reflect.jvm.internal.impl.builtins.beachfront.igbo(oilcanVarKowloon) && !p002kotlin.reflect.jvm.internal.impl.builtins.beachfront.palmyra(oilcanVarKowloon)) || !sealless(triweeklyVar) || !triweeklyVar.seminary()) {
            return oilcanVarKowloon;
        }
        oilcan oilcanVarTriweekly = nosophobia.triweekly(oilcanVarKowloon);
        Intrinsics.checkNotNullExpressionValue(oilcanVarTriweekly, "makeNotNullable(...)");
        return oilcanVarTriweekly;
    }

    public LazyJavaScope(wireman c, LazyJavaScope lazyJavaScope) {
        Intrinsics.checkNotNullParameter(c, "c");
        this.f30554saneness = c;
        this.f30550dern = lazyJavaScope;
        this.f30556wireman = c.marial().saneness(new Function0<Collection<? extends apical>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$allDescriptors$1
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final Collection<? extends apical> invoke() {
                return this.this$0.impassible(p002kotlin.reflect.jvm.internal.impl.resolve.scopes.wireman.f31402kowloon, MemberScope.f31364attabal.attabal());
            }
        }, adultoid.formularize());
        this.f30553marial = c.marial().dern(new Function0<p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.attabal>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$declaredMemberIndex$1
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final attabal invoke() {
                return this.this$0.arytenoidectomy();
            }
        });
        this.f30547beachfront = c.marial().taiyuan(new Function1<marial, Collection<? extends hydrovane>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$declaredFunctions$1
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public final Collection<hydrovane> invoke(marial name) {
                Intrinsics.checkNotNullParameter(name, "name");
                if (this.this$0.stratoscope() != null) {
                    return (Collection) this.this$0.stratoscope().f30547beachfront.invoke(name);
                }
                ArrayList arrayList = new ArrayList();
                for (genesic.polloi polloiVar : this.this$0.preprohormone().invoke().dern(name)) {
                    JavaMethodDescriptor javaMethodDescriptorRestrictive = this.this$0.restrictive(polloiVar);
                    if (this.this$0.kattegat(javaMethodDescriptorRestrictive)) {
                        this.this$0.gintrap().attabal().impromptu().attabal(polloiVar, javaMethodDescriptorRestrictive);
                        arrayList.add(javaMethodDescriptorRestrictive);
                    }
                }
                this.this$0.kowloon(arrayList, name);
                return arrayList;
            }
        });
        this.f30548competently = c.marial().competently(new Function1<marial, saran>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$declaredField$1
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public final saran invoke(marial name) {
                Intrinsics.checkNotNullParameter(name, "name");
                if (this.this$0.stratoscope() != null) {
                    return (saran) this.this$0.stratoscope().f30548competently.invoke(name);
                }
                triweekly triweeklyVarBeachfront = this.this$0.preprohormone().invoke().beachfront(name);
                if (triweeklyVarBeachfront == null || triweeklyVarBeachfront.kattegat()) {
                    return null;
                }
                return this.this$0.merc(triweeklyVarBeachfront);
            }
        });
        this.f30552impromptu = c.marial().taiyuan(new Function1<marial, Collection<? extends hydrovane>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$functions$1
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public final Collection<hydrovane> invoke(marial name) {
                Intrinsics.checkNotNullParameter(name, "name");
                LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) this.this$0.f30547beachfront.invoke(name));
                this.this$0.seminary(linkedHashSet);
                this.this$0.polloi(linkedHashSet, name);
                return CollectionsKt.molet(this.this$0.gintrap().attabal().polloi().competently(this.this$0.gintrap(), linkedHashSet));
            }
        });
        this.f30555taiyuan = c.marial().dern(new Function0<Set<? extends marial>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$functionNamesLazy$2
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final Set<? extends marial> invoke() {
                return this.this$0.triweekly(p002kotlin.reflect.jvm.internal.impl.resolve.scopes.wireman.f31396dovishness, null);
            }
        });
        this.f30549cutely = c.marial().dern(new Function0<Set<? extends marial>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$propertyNamesLazy$2
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final Set<? extends marial> invoke() {
                return this.this$0.graveside(p002kotlin.reflect.jvm.internal.impl.resolve.scopes.wireman.f31398gintrap, null);
            }
        });
        this.f30546apical = c.marial().dern(new Function0<Set<? extends marial>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$classNamesLazy$2
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final Set<? extends marial> invoke() {
                return this.this$0.formularize(p002kotlin.reflect.jvm.internal.impl.resolve.scopes.wireman.f31399graveside, null);
            }
        });
        this.f30551formularize = c.marial().taiyuan(new Function1<marial, List<? extends saran>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$properties$1
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public final List<saran> invoke(marial name) {
                Intrinsics.checkNotNullParameter(name, "name");
                ArrayList arrayList = new ArrayList();
                lyreflower.attabal.attabal(arrayList, this.this$0.f30548competently.invoke(name));
                this.this$0.molybdenite(name, arrayList);
                return p002kotlin.reflect.jvm.internal.impl.resolve.marial.graveside(this.this$0.trm()) ? CollectionsKt.molet(arrayList) : CollectionsKt.molet(this.this$0.gintrap().attabal().polloi().competently(this.this$0.gintrap(), arrayList));
            }
        });
    }
}
