package p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import byname.marial;
import discontentedly.saneness;
import genesic.apical;
import genesic.gintrap;
import genesic.monoploid;
import genesic.polloi;
import genesic.preprohormone;
import genesic.triweekly;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lyreflower.attabal;
import p002kotlin.Pair;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.cord;
import p002kotlin.collections.graveside;
import p002kotlin.collections.polder;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cutely;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dern;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness;
import p002kotlin.reflect.jvm.internal.impl.descriptors.hydrovane;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.cuirassed;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.stratoscope;
import p002kotlin.reflect.jvm.internal.impl.descriptors.privatdozent;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;
import p002kotlin.reflect.jvm.internal.impl.descriptors.starveling;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import p002kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName;
import p002kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature;
import p002kotlin.reflect.jvm.internal.impl.load.java.ClassicBuiltinSpecialProperties;
import p002kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import p002kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures;
import p002kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import p002kotlin.reflect.jvm.internal.impl.load.java.impassible;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import p002kotlin.reflect.jvm.internal.impl.load.java.molybdenite;
import p002kotlin.reflect.jvm.internal.impl.load.java.rotuma;
import p002kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import p002kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import p002kotlin.reflect.jvm.internal.impl.types.nosophobia;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import yeast.competently;
import yeast.formularize;
import yeast.impromptu;

/* JADX INFO: compiled from: LazyJavaClassMemberScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class LazyJavaClassMemberScope extends LazyJavaScope {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public final competently<marial, wireman> f30519adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final boolean f30520arytenoidectomy;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final impromptu<Map<marial, triweekly>> f30521graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final genesic.competently f30522kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final impromptu<Set<marial>> f30523molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final impromptu<List<dern>> f30524monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final impromptu<Set<marial>> f30525polloi;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public final wireman f30526triweekly;

    public /* synthetic */ LazyJavaClassMemberScope(p002kotlin.reflect.jvm.internal.impl.load.java.lazy.wireman wiremanVar, wireman wiremanVar2, genesic.competently competentlyVar, boolean z, LazyJavaClassMemberScope lazyJavaClassMemberScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wiremanVar, wiremanVar2, competentlyVar, z, (i & 16) != 0 ? null : lazyJavaClassMemberScope);
    }

    public static /* synthetic */ methylmercury.marial sayid(LazyJavaClassMemberScope lazyJavaClassMemberScope, polloi polloiVar, oilcan oilcanVar, Modality modality, int i, Object obj) {
        if ((i & 2) != 0) {
            oilcanVar = null;
        }
        return lazyJavaClassMemberScope.lotta(polloiVar, oilcanVar, modality);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: achondroplasia, reason: merged with bridge method [inline-methods] */
    public wireman trm() {
        return this.f30526triweekly;
    }

    public final Collection<hydrovane> attendance(marial marialVar) {
        Set<hydrovane> setJulian = julian(marialVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : setJulian) {
            hydrovane hydrovaneVar = (hydrovane) obj;
            if (!SpecialBuiltinMembers.attabal(hydrovaneVar) && BuiltinMethodsWithSpecialGenericSignature.apical(hydrovaneVar) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final boolean claque(hydrovane hydrovaneVar, dovishness dovishnessVar) {
        String strDern = p002kotlin.reflect.jvm.internal.impl.load.kotlin.dovishness.dern(hydrovaneVar, false, false, 2, null);
        dovishness dovishnessVarAttabal = dovishnessVar.attabal();
        Intrinsics.checkNotNullExpressionValue(dovishnessVarAttabal, "getOriginal(...)");
        return Intrinsics.wireman(strDern, p002kotlin.reflect.jvm.internal.impl.load.kotlin.dovishness.dern(dovishnessVarAttabal, false, false, 2, null)) && !underbelly(hydrovaneVar, dovishnessVar);
    }

    public final void clubfoot(marial marialVar, Collection<? extends hydrovane> collection2, Collection<? extends hydrovane> collection3, Collection<hydrovane> collection4, Function1<? super marial, ? extends Collection<? extends hydrovane>> function1) {
        for (hydrovane hydrovaneVar : collection3) {
            attabal.attabal(collection4, technofreak(hydrovaneVar, function1, marialVar, collection2));
            attabal.attabal(collection4, herdbook(hydrovaneVar, function1, collection2));
            attabal.attabal(collection4, outmarry(hydrovaneVar, function1));
        }
    }

    public final hydrovane coffeecake(hydrovane hydrovaneVar, p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVar, Collection<? extends hydrovane> collection2) {
        Collection<? extends hydrovane> collection3 = collection2;
        if ((collection3 instanceof Collection) && collection3.isEmpty()) {
            return hydrovaneVar;
        }
        for (hydrovane hydrovaneVar2 : collection3) {
            if (!Intrinsics.wireman(hydrovaneVar, hydrovaneVar2) && hydrovaneVar2.sensatory() == null && underbelly(hydrovaneVar2, attabalVar)) {
                dovishness dovishnessVarBuild = hydrovaneVar.monoploid().taiyuan().build();
                Intrinsics.beachfront(dovishnessVarBuild);
                return (hydrovane) dovishnessVarBuild;
            }
        }
        return hydrovaneVar;
    }

    public final hydrovane coi(hydrovane hydrovaneVar, marial marialVar) {
        dovishness.attabal<? extends hydrovane> attabalVarMonoploid = hydrovaneVar.monoploid();
        attabalVarMonoploid.arytenoidectomy(marialVar);
        attabalVarMonoploid.graveside();
        attabalVarMonoploid.apical();
        dovishness dovishnessVarBuild = attabalVarMonoploid.build();
        Intrinsics.beachfront(dovishnessVarBuild);
        return (hydrovane) dovishnessVarBuild;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public starveling cord() {
        return p002kotlin.reflect.jvm.internal.impl.resolve.marial.formularize(trm());
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: cultivated, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet<marial> triweekly(p002kotlin.reflect.jvm.internal.impl.resolve.scopes.wireman kindFilter, Function1<? super marial, Boolean> function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Collection<oilcan> collectionCutely = trm().impromptu().cutely();
        Intrinsics.checkNotNullExpressionValue(collectionCutely, "getSupertypes(...)");
        LinkedHashSet<marial> linkedHashSet = new LinkedHashSet<>();
        Iterator<T> it = collectionCutely.iterator();
        while (it.hasNext()) {
            cord.stratoscope(linkedHashSet, ((oilcan) it.next()).formularize().attabal());
        }
        linkedHashSet.addAll(preprohormone().invoke().attabal());
        linkedHashSet.addAll(preprohormone().invoke().wireman());
        linkedHashSet.addAll(formularize(kindFilter, function1));
        linkedHashSet.addAll(gintrap().attabal().gintrap().wireman(gintrap(), trm()));
        return linkedHashSet;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    public final hydrovane czestochowa(hydrovane hydrovaneVar) {
        byname.dern dernVarFormularize;
        byname.wireman wiremanVarImpassible;
        List<cultivated> listBeachfront = hydrovaneVar.beachfront();
        Intrinsics.checkNotNullExpressionValue(listBeachfront, "getValueParameters(...)");
        cultivated cultivatedVar = (cultivated) CollectionsKt.picketboat(listBeachfront);
        if (cultivatedVar != null) {
            beachfront beachfrontVarWireman = cultivatedVar.getType().setterwort().wireman();
            if (beachfrontVarWireman == null || (wiremanVarImpassible = DescriptorUtilsKt.impassible(beachfrontVarWireman)) == null) {
                dernVarFormularize = null;
            } else {
                if (!wiremanVarImpassible.beachfront()) {
                    wiremanVarImpassible = null;
                }
                if (wiremanVarImpassible != null) {
                    dernVarFormularize = wiremanVarImpassible.formularize();
                } else {
                    dernVarFormularize = null;
                }
            }
            if (!Intrinsics.wireman(dernVarFormularize, p002kotlin.reflect.jvm.internal.impl.builtins.competently.f29673graveside)) {
                cultivatedVar = null;
            }
            if (cultivatedVar != null) {
                dovishness.attabal<? extends hydrovane> attabalVarMonoploid = hydrovaneVar.monoploid();
                List<cultivated> listBeachfront2 = hydrovaneVar.beachfront();
                Intrinsics.checkNotNullExpressionValue(listBeachfront2, "getValueParameters(...)");
                hydrovane hydrovaneVar2 = (hydrovane) attabalVarMonoploid.saneness(CollectionsKt.timberyard(listBeachfront2, 1)).formularize(cultivatedVar.getType().dhss().get(0).getType()).build();
                p002kotlin.reflect.jvm.internal.impl.descriptors.impl.oilcan oilcanVar = (p002kotlin.reflect.jvm.internal.impl.descriptors.impl.oilcan) hydrovaneVar2;
                if (oilcanVar == null) {
                    return hydrovaneVar2;
                }
                oilcanVar.demilitarize(true);
                return hydrovaneVar2;
            }
        }
        return null;
    }

    public final void dent(Set<? extends saran> set, Collection<saran> collection2, Set<saran> set2, Function1<? super marial, ? extends Collection<? extends hydrovane>> function1) {
        for (saran saranVar : set) {
            methylmercury.marial marialVarNosophobia = nosophobia(saranVar, function1);
            if (marialVarNosophobia != null) {
                collection2.add(marialVarNosophobia);
                if (set2 != null) {
                    set2.add(saranVar);
                    return;
                }
                return;
            }
        }
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<saran> dern(marial name, saneness location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        dhss(name, location);
        return super.dern(name, location);
    }

    public void dhss(marial name, saneness location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        needler.attabal.attabal(gintrap().attabal().formularize(), location, trm(), name);
    }

    public final List<cultivated> empress(p002kotlin.reflect.jvm.internal.impl.descriptors.impl.marial marialVar) {
        Collection<gintrap> collectionImpassible = this.f30522kowloon.impassible();
        ArrayList arrayList = new ArrayList(collectionImpassible.size());
        p002kotlin.reflect.jvm.internal.impl.load.java.lazy.types.attabal attabalVarSaneness = p002kotlin.reflect.jvm.internal.impl.load.java.lazy.types.saneness.saneness(TypeUsage.COMMON, false, false, null, 6, null);
        Iterator<gintrap> it = collectionImpassible.iterator();
        int i = 0;
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return arrayList;
            }
            i = i2 + 1;
            gintrap next = it.next();
            oilcan oilcanVarKowloon = gintrap().competently().kowloon(next.getType(), attabalVarSaneness);
            arrayList.add(new ValueParameterDescriptorImpl(marialVar, null, i2, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial.f29950impromptu.saneness(), next.getName(), oilcanVarKowloon, false, false, false, next.saneness() ? gintrap().attabal().impassible().apical().apical(oilcanVarKowloon) : null, gintrap().attabal().graveside().attabal(next)));
        }
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public Set<marial> formularize(p002kotlin.reflect.jvm.internal.impl.resolve.scopes.wireman kindFilter, Function1<? super marial, Boolean> function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        return p002kotlin.collections.starveling.apical(this.f30525polloi.invoke(), this.f30521graveside.invoke().keySet());
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public Set<marial> graveside(p002kotlin.reflect.jvm.internal.impl.resolve.scopes.wireman kindFilter, Function1<? super marial, Boolean> function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        if (this.f30522kowloon.kowloon()) {
            return attabal();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(preprohormone().invoke().marial());
        Collection<oilcan> collectionCutely = trm().impromptu().cutely();
        Intrinsics.checkNotNullExpressionValue(collectionCutely, "getSupertypes(...)");
        Iterator<T> it = collectionCutely.iterator();
        while (it.hasNext()) {
            cord.stratoscope(linkedHashSet, ((oilcan) it.next()).formularize().wireman());
        }
        return linkedHashSet;
    }

    public final hydrovane gusty(saran saranVar, String str, Function1<? super marial, ? extends Collection<? extends hydrovane>> function1) {
        hydrovane hydrovaneVar;
        marial marialVarCutely = marial.cutely(str);
        Intrinsics.checkNotNullExpressionValue(marialVarCutely, "identifier(...)");
        Iterator<T> it = function1.invoke(marialVarCutely).iterator();
        do {
            hydrovaneVar = null;
            if (!it.hasNext()) {
                break;
            }
            hydrovane hydrovaneVar2 = (hydrovane) it.next();
            if (hydrovaneVar2.beachfront().size() == 0) {
                p002kotlin.reflect.jvm.internal.impl.types.checker.marial marialVar = p002kotlin.reflect.jvm.internal.impl.types.checker.marial.f31734attabal;
                oilcan returnType = hydrovaneVar2.getReturnType();
                if (returnType == null ? false : marialVar.wireman(returnType, saranVar.getType())) {
                    hydrovaneVar = hydrovaneVar2;
                }
            }
        } while (hydrovaneVar == null);
        return hydrovaneVar;
    }

    public final boolean hardpan(final hydrovane hydrovaneVar) {
        marial name = hydrovaneVar.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        List<marial> listAttabal = p002kotlin.reflect.jvm.internal.impl.load.java.gintrap.attabal(name);
        if (!(listAttabal instanceof Collection) || !listAttabal.isEmpty()) {
            Iterator<T> it = listAttabal.iterator();
            while (it.hasNext()) {
                Set<saran> setUnconsolidated = unconsolidated((marial) it.next());
                if (!(setUnconsolidated instanceof Collection) || !setUnconsolidated.isEmpty()) {
                    for (saran saranVar : setUnconsolidated) {
                        if (sensatory(saranVar, new Function1<marial, Collection<? extends hydrovane>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$isVisibleAsFunctionInCurrentClass$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p002kotlin.jvm.functions.Function1
                            public final Collection<hydrovane> invoke(marial accessorName) {
                                Intrinsics.checkNotNullParameter(accessorName, "accessorName");
                                return Intrinsics.wireman(hydrovaneVar.getName(), accessorName) ? graveside.marial(hydrovaneVar) : CollectionsKt.unconsolidated(this.mastfed(accessorName), this.attendance(accessorName));
                            }
                        })) {
                            if (!saranVar.restrictive()) {
                                String strDern = hydrovaneVar.getName().dern();
                                Intrinsics.checkNotNullExpressionValue(strDern, "asString(...)");
                                if (!molybdenite.wireman(strDern)) {
                                }
                            }
                            return false;
                        }
                    }
                }
            }
        }
        return (preterite(hydrovaneVar) || homozygous(hydrovaneVar) || igbo(hydrovaneVar)) ? false : true;
    }

    public final hydrovane herdbook(hydrovane hydrovaneVar, Function1<? super marial, ? extends Collection<? extends hydrovane>> function1, Collection<? extends hydrovane> collection2) {
        hydrovane hydrovaneVarLerp;
        dovishness dovishnessVarApical = BuiltinMethodsWithSpecialGenericSignature.apical(hydrovaneVar);
        if (dovishnessVarApical != null && (hydrovaneVarLerp = lerp(dovishnessVarApical, function1)) != null) {
            if (!hardpan(hydrovaneVarLerp)) {
                hydrovaneVarLerp = null;
            }
            if (hydrovaneVarLerp != null) {
                return coffeecake(hydrovaneVarLerp, dovishnessVarApical, collection2);
            }
        }
        return null;
    }

    public final boolean homozygous(hydrovane hydrovaneVar) {
        BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.f30284kowloon;
        marial name = hydrovaneVar.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (!builtinMethodsWithSpecialGenericSignature.formularize(name)) {
            return false;
        }
        marial name2 = hydrovaneVar.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
        Set<hydrovane> setJulian = julian(name2);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setJulian.iterator();
        while (it.hasNext()) {
            dovishness dovishnessVarApical = BuiltinMethodsWithSpecialGenericSignature.apical((hydrovane) it.next());
            if (dovishnessVarApical != null) {
                arrayList.add(dovishnessVarApical);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (claque(hydrovaneVar, (dovishness) it2.next())) {
                return true;
            }
        }
        return false;
    }

    public final boolean igbo(hydrovane hydrovaneVar) {
        hydrovane hydrovaneVarCzestochowa = czestochowa(hydrovaneVar);
        if (hydrovaneVarCzestochowa == null) {
            return false;
        }
        marial name = hydrovaneVar.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Set<hydrovane> setJulian = julian(name);
        if ((setJulian instanceof Collection) && setJulian.isEmpty()) {
            return false;
        }
        for (hydrovane hydrovaneVar2 : setJulian) {
            if (hydrovaneVar2.isSuspend() && underbelly(hydrovaneVarCzestochowa, hydrovaneVar2)) {
                return true;
            }
        }
        return false;
    }

    public final dern itchy() {
        wireman wiremanVarTrm = trm();
        methylmercury.saneness sanenessVarHyalinization = methylmercury.saneness.hyalinization(wiremanVarTrm, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial.f29950impromptu.saneness(), true, gintrap().attabal().graveside().attabal(this.f30522kowloon));
        Intrinsics.checkNotNullExpressionValue(sanenessVarHyalinization, "createJavaConstructor(...)");
        List<cultivated> listEmpress = empress(sanenessVarHyalinization);
        sanenessVarHyalinization.osteal(false);
        sanenessVarHyalinization.twybill(listEmpress, lightstruck(wiremanVarTrm));
        sanenessVarHyalinization.prefect(false);
        sanenessVarHyalinization.cig(wiremanVarTrm.impassible());
        return sanenessVarHyalinization;
    }

    public final Set<hydrovane> julian(marial marialVar) {
        Collection<oilcan> collectionTimberyard = timberyard();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = collectionTimberyard.iterator();
        while (it.hasNext()) {
            cord.stratoscope(linkedHashSet, ((oilcan) it.next()).formularize().saneness(marialVar, NoLookupLocation.WHEN_GET_SUPER_MEMBERS));
        }
        return linkedHashSet;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public boolean kattegat(JavaMethodDescriptor javaMethodDescriptor) {
        Intrinsics.checkNotNullParameter(javaMethodDescriptor, "<this>");
        if (this.f30522kowloon.kowloon()) {
            return false;
        }
        return hardpan(javaMethodDescriptor);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public void kowloon(Collection<hydrovane> result, marial name) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
        if (this.f30522kowloon.monoploid() && preprohormone().invoke().saneness(name) != null) {
            Collection<hydrovane> collection2 = result;
            if (collection2.isEmpty()) {
                gintrap gintrapVarSaneness = preprohormone().invoke().saneness(name);
                Intrinsics.beachfront(gintrapVarSaneness);
                result.add(setterwort(gintrapVarSaneness));
            } else {
                Iterator<T> it = collection2.iterator();
                while (it.hasNext()) {
                    if (((hydrovane) it.next()).beachfront().isEmpty()) {
                    }
                }
                gintrap gintrapVarSaneness2 = preprohormone().invoke().saneness(name);
                Intrinsics.beachfront(gintrapVarSaneness2);
                result.add(setterwort(gintrapVarSaneness2));
            }
        }
        gintrap().attabal().gintrap().marial(gintrap(), trm(), name, result);
    }

    public final hydrovane lerp(dovishness dovishnessVar, Function1<? super marial, ? extends Collection<? extends hydrovane>> function1) {
        Object next;
        marial name = dovishnessVar.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Iterator<T> it = function1.invoke(name).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!claque((hydrovane) next, dovishnessVar));
        hydrovane hydrovaneVar = (hydrovane) next;
        if (hydrovaneVar == null) {
            return null;
        }
        dovishness.attabal<? extends hydrovane> attabalVarMonoploid = hydrovaneVar.monoploid();
        List<cultivated> listBeachfront = dovishnessVar.beachfront();
        Intrinsics.checkNotNullExpressionValue(listBeachfront, "getValueParameters(...)");
        List<cultivated> list = listBeachfront;
        ArrayList arrayList = new ArrayList(p002kotlin.collections.dovishness.gintrap(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((cultivated) it2.next()).getType());
        }
        List<cultivated> listBeachfront2 = hydrovaneVar.beachfront();
        Intrinsics.checkNotNullExpressionValue(listBeachfront2, "getValueParameters(...)");
        attabalVarMonoploid.saneness(methylmercury.competently.attabal(arrayList, listBeachfront2, dovishnessVar));
        attabalVarMonoploid.graveside();
        attabalVarMonoploid.apical();
        attabalVarMonoploid.competently(JavaMethodDescriptor.f30404mathsort, Boolean.TRUE);
        return (hydrovane) attabalVarMonoploid.build();
    }

    public final p002kotlin.reflect.jvm.internal.impl.descriptors.molybdenite lightstruck(wireman wiremanVar) {
        p002kotlin.reflect.jvm.internal.impl.descriptors.molybdenite visibility = wiremanVar.getVisibility();
        Intrinsics.checkNotNullExpressionValue(visibility, "getVisibility(...)");
        if (!Intrinsics.wireman(visibility, impassible.f30440saneness)) {
            return visibility;
        }
        p002kotlin.reflect.jvm.internal.impl.descriptors.molybdenite PROTECTED_AND_PACKAGE = impassible.f30439dern;
        Intrinsics.checkNotNullExpressionValue(PROTECTED_AND_PACKAGE, "PROTECTED_AND_PACKAGE");
        return PROTECTED_AND_PACKAGE;
    }

    public final methylmercury.marial lotta(polloi polloiVar, oilcan oilcanVar, Modality modality) {
        LazyJavaClassMemberScope lazyJavaClassMemberScope;
        oilcan oilcanVarMonoploid;
        methylmercury.marial marialVarCig = methylmercury.marial.cig(trm(), p002kotlin.reflect.jvm.internal.impl.load.java.lazy.dern.attabal(gintrap(), polloiVar), modality, rotuma.wireman(polloiVar.getVisibility()), false, polloiVar.getName(), gintrap().attabal().graveside().attabal(polloiVar), false);
        Intrinsics.checkNotNullExpressionValue(marialVarCig, "create(...)");
        cuirassed cuirassedVarWireman = p002kotlin.reflect.jvm.internal.impl.resolve.wireman.wireman(marialVarCig, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial.f29950impromptu.saneness());
        Intrinsics.checkNotNullExpressionValue(cuirassedVarWireman, "createDefaultGetter(...)");
        marialVarCig.immediately(cuirassedVarWireman, null);
        if (oilcanVar == null) {
            p002kotlin.reflect.jvm.internal.impl.load.java.lazy.wireman wiremanVarBeachfront = ContextKt.beachfront(gintrap(), marialVarCig, polloiVar, 0, 4, null);
            lazyJavaClassMemberScope = this;
            oilcanVarMonoploid = lazyJavaClassMemberScope.monoploid(polloiVar, wiremanVarBeachfront);
        } else {
            lazyJavaClassMemberScope = this;
            oilcanVarMonoploid = oilcanVar;
        }
        marialVarCig.fastrack(oilcanVarMonoploid, adultoid.formularize(), lazyJavaClassMemberScope.cord(), null, adultoid.formularize());
        cuirassedVarWireman.lampshade(oilcanVarMonoploid);
        return marialVarCig;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.impromptu
    public beachfront marial(marial name, saneness location) {
        competently<marial, wireman> competentlyVar;
        wireman wiremanVarInvoke;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        dhss(name, location);
        LazyJavaClassMemberScope lazyJavaClassMemberScope = (LazyJavaClassMemberScope) stratoscope();
        return (lazyJavaClassMemberScope == null || (competentlyVar = lazyJavaClassMemberScope.f30519adultoid) == null || (wiremanVarInvoke = competentlyVar.invoke(name)) == null) ? this.f30519adultoid.invoke(name) : wiremanVarInvoke;
    }

    public final Collection<hydrovane> mastfed(marial marialVar) {
        Collection<polloi> collectionDern = preprohormone().invoke().dern(marialVar);
        ArrayList arrayList = new ArrayList(p002kotlin.collections.dovishness.gintrap(collectionDern, 10));
        Iterator<T> it = collectionDern.iterator();
        while (it.hasNext()) {
            arrayList.add(restrictive((polloi) it.next()));
        }
        return arrayList;
    }

    public final List<cultivated> milliradian(p002kotlin.reflect.jvm.internal.impl.descriptors.impl.marial marialVar) {
        p002kotlin.reflect.jvm.internal.impl.descriptors.impl.marial marialVar2;
        Pair pair;
        Collection<polloi> methods = this.f30522kowloon.getMethods();
        ArrayList arrayList = new ArrayList(methods.size());
        p002kotlin.reflect.jvm.internal.impl.load.java.lazy.types.attabal attabalVarSaneness = p002kotlin.reflect.jvm.internal.impl.load.java.lazy.types.saneness.saneness(TypeUsage.COMMON, true, false, null, 6, null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : methods) {
            if (Intrinsics.wireman(((polloi) obj).getName(), p002kotlin.reflect.jvm.internal.impl.load.java.graveside.f30422dern)) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        Pair pair2 = new Pair(arrayList2, arrayList3);
        List list = (List) pair2.component1();
        List<polloi> list2 = (List) pair2.component2();
        list.size();
        polloi polloiVar = (polloi) CollectionsKt.firstOrNull(list);
        if (polloiVar != null) {
            genesic.rotuma returnType = polloiVar.getReturnType();
            if (returnType instanceof genesic.beachfront) {
                genesic.beachfront beachfrontVar = (genesic.beachfront) returnType;
                pair = new Pair(gintrap().competently().apical(beachfrontVar, attabalVarSaneness, true), gintrap().competently().kowloon(beachfrontVar.triweekly(), attabalVarSaneness));
            } else {
                pair = new Pair(gintrap().competently().kowloon(returnType, attabalVarSaneness), null);
            }
            oilcan oilcanVar = (oilcan) pair.component1();
            oilcan oilcanVar2 = (oilcan) pair.component2();
            marialVar2 = marialVar;
            splinterproof(arrayList, marialVar2, 0, polloiVar, oilcanVar, oilcanVar2);
        } else {
            marialVar2 = marialVar;
        }
        int i = 0;
        int i2 = polloiVar == null ? 0 : 1;
        for (polloi polloiVar2 : list2) {
            splinterproof(arrayList, marialVar2, i + i2, polloiVar2, gintrap().competently().kowloon(polloiVar2.getReturnType(), attabalVarSaneness), null);
            i++;
        }
        return arrayList;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public void molybdenite(marial name, Collection<saran> result) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
        if (this.f30522kowloon.kowloon()) {
            permissivist(name, result);
        }
        Set<saran> setUnconsolidated = unconsolidated(name);
        if (setUnconsolidated.isEmpty()) {
            return;
        }
        lyreflower.beachfront.saneness sanenessVar = lyreflower.beachfront.f33195monoploid;
        lyreflower.beachfront beachfrontVarAttabal = sanenessVar.attabal();
        lyreflower.beachfront beachfrontVarAttabal2 = sanenessVar.attabal();
        dent(setUnconsolidated, result, beachfrontVarAttabal, new Function1<marial, Collection<? extends hydrovane>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$computeNonDeclaredProperties$1
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public final Collection<hydrovane> invoke(marial it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.this$0.mastfed(it);
            }
        });
        dent(p002kotlin.collections.starveling.taiyuan(setUnconsolidated, beachfrontVarAttabal), beachfrontVarAttabal2, null, new Function1<marial, Collection<? extends hydrovane>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$computeNonDeclaredProperties$2
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public final Collection<hydrovane> invoke(marial it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.this$0.attendance(it);
            }
        });
        Collection<? extends saran> collectionWireman = p002kotlin.reflect.jvm.internal.impl.load.java.components.attabal.wireman(name, p002kotlin.collections.starveling.apical(setUnconsolidated, beachfrontVarAttabal2), result, trm(), gintrap().attabal().dern(), gintrap().attabal().apical().attabal());
        Intrinsics.checkNotNullExpressionValue(collectionWireman, "resolveOverridesForNonStaticMembers(...)");
        result.addAll(collectionWireman);
    }

    public final impromptu<List<dern>> monroe() {
        return this.f30524monoploid;
    }

    public final methylmercury.marial nosophobia(saran saranVar, Function1<? super marial, ? extends Collection<? extends hydrovane>> function1) {
        hydrovane hydrovaneVarPalmyra;
        stratoscope stratoscopeVarImpassible = null;
        if (!sensatory(saranVar, function1)) {
            return null;
        }
        hydrovane hydrovaneVarPicketboat = picketboat(saranVar, function1);
        Intrinsics.beachfront(hydrovaneVarPicketboat);
        if (saranVar.restrictive()) {
            hydrovaneVarPalmyra = palmyra(saranVar, function1);
            Intrinsics.beachfront(hydrovaneVarPalmyra);
        } else {
            hydrovaneVarPalmyra = null;
        }
        if (hydrovaneVarPalmyra != null) {
            hydrovaneVarPalmyra.kowloon();
            hydrovaneVarPicketboat.kowloon();
        }
        methylmercury.wireman wiremanVar = new methylmercury.wireman(trm(), hydrovaneVarPicketboat, hydrovaneVarPalmyra, saranVar);
        oilcan returnType = hydrovaneVarPicketboat.getReturnType();
        Intrinsics.beachfront(returnType);
        wiremanVar.fastrack(returnType, adultoid.formularize(), cord(), null, adultoid.formularize());
        cuirassed cuirassedVarApical = p002kotlin.reflect.jvm.internal.impl.resolve.wireman.apical(wiremanVar, hydrovaneVarPicketboat.getAnnotations(), false, false, false, hydrovaneVarPicketboat.competently());
        cuirassedVarApical.mastfed(hydrovaneVarPicketboat);
        cuirassedVarApical.lampshade(wiremanVar.getType());
        Intrinsics.checkNotNullExpressionValue(cuirassedVarApical, "apply(...)");
        if (hydrovaneVarPalmyra != null) {
            List<cultivated> listBeachfront = hydrovaneVarPalmyra.beachfront();
            Intrinsics.checkNotNullExpressionValue(listBeachfront, "getValueParameters(...)");
            cultivated cultivatedVar = (cultivated) CollectionsKt.firstOrNull(listBeachfront);
            if (cultivatedVar == null) {
                throw new AssertionError("No parameter found for " + hydrovaneVarPalmyra);
            }
            stratoscopeVarImpassible = p002kotlin.reflect.jvm.internal.impl.resolve.wireman.impassible(wiremanVar, hydrovaneVarPalmyra.getAnnotations(), cultivatedVar.getAnnotations(), false, false, false, hydrovaneVarPalmyra.getVisibility(), hydrovaneVarPalmyra.competently());
            stratoscopeVarImpassible.mastfed(hydrovaneVarPalmyra);
        }
        wiremanVar.immediately(cuirassedVarApical, stratoscopeVarImpassible);
        return wiremanVar;
    }

    public final hydrovane outmarry(hydrovane hydrovaneVar, Function1<? super marial, ? extends Collection<? extends hydrovane>> function1) {
        if (!hydrovaneVar.isSuspend()) {
            return null;
        }
        marial name = hydrovaneVar.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Iterator<T> it = function1.invoke(name).iterator();
        while (it.hasNext()) {
            hydrovane hydrovaneVarCzestochowa = czestochowa((hydrovane) it.next());
            if (hydrovaneVarCzestochowa == null || !underbelly(hydrovaneVarCzestochowa, hydrovaneVar)) {
                hydrovaneVarCzestochowa = null;
            }
            if (hydrovaneVarCzestochowa != null) {
                return hydrovaneVarCzestochowa;
            }
        }
        return null;
    }

    public final void overspeculate(Collection<hydrovane> collection2, marial marialVar, Collection<? extends hydrovane> collection3, boolean z) {
        Collection<? extends hydrovane> collectionWireman = p002kotlin.reflect.jvm.internal.impl.load.java.components.attabal.wireman(marialVar, collection3, collection2, trm(), gintrap().attabal().dern(), gintrap().attabal().apical().attabal());
        Intrinsics.checkNotNullExpressionValue(collectionWireman, "resolveOverridesForNonStaticMembers(...)");
        if (!z) {
            collection2.addAll(collectionWireman);
            return;
        }
        Collection<? extends hydrovane> collection4 = collectionWireman;
        List listUnconsolidated = CollectionsKt.unconsolidated(collection2, collection4);
        ArrayList arrayList = new ArrayList(p002kotlin.collections.dovishness.gintrap(collection4, 10));
        for (hydrovane hydrovaneVarCoffeecake : collection4) {
            hydrovane hydrovaneVar = (hydrovane) SpecialBuiltinMembers.marial(hydrovaneVarCoffeecake);
            if (hydrovaneVar == null) {
                Intrinsics.beachfront(hydrovaneVarCoffeecake);
            } else {
                Intrinsics.beachfront(hydrovaneVarCoffeecake);
                hydrovaneVarCoffeecake = coffeecake(hydrovaneVarCoffeecake, hydrovaneVar, listUnconsolidated);
            }
            arrayList.add(hydrovaneVarCoffeecake);
        }
        collection2.addAll(arrayList);
    }

    public final hydrovane palmyra(saran saranVar, Function1<? super marial, ? extends Collection<? extends hydrovane>> function1) {
        hydrovane hydrovaneVar;
        oilcan returnType;
        String strDern = saranVar.getName().dern();
        Intrinsics.checkNotNullExpressionValue(strDern, "asString(...)");
        marial marialVarCutely = marial.cutely(molybdenite.marial(strDern));
        Intrinsics.checkNotNullExpressionValue(marialVarCutely, "identifier(...)");
        Iterator<T> it = function1.invoke(marialVarCutely).iterator();
        do {
            hydrovaneVar = null;
            if (!it.hasNext()) {
                break;
            }
            hydrovane hydrovaneVar2 = (hydrovane) it.next();
            if (hydrovaneVar2.beachfront().size() == 1 && (returnType = hydrovaneVar2.getReturnType()) != null && p002kotlin.reflect.jvm.internal.impl.builtins.beachfront.hardpan(returnType)) {
                p002kotlin.reflect.jvm.internal.impl.types.checker.marial marialVar = p002kotlin.reflect.jvm.internal.impl.types.checker.marial.f31734attabal;
                List<cultivated> listBeachfront = hydrovaneVar2.beachfront();
                Intrinsics.checkNotNullExpressionValue(listBeachfront, "getValueParameters(...)");
                if (marialVar.saneness(((cultivated) CollectionsKt.herdbook(listBeachfront)).getType(), saranVar.getType())) {
                    hydrovaneVar = hydrovaneVar2;
                }
            }
        } while (hydrovaneVar == null);
        return hydrovaneVar;
    }

    public final void permissivist(marial marialVar, Collection<saran> collection2) {
        polloi polloiVar = (polloi) CollectionsKt.technofreak(preprohormone().invoke().dern(marialVar));
        if (polloiVar == null) {
            return;
        }
        collection2.add(sayid(this, polloiVar, null, Modality.FINAL, 2, null));
    }

    public final hydrovane picketboat(saran saranVar, Function1<? super marial, ? extends Collection<? extends hydrovane>> function1) {
        privatdozent getter = saranVar.getGetter();
        privatdozent privatdozentVar = getter != null ? (privatdozent) SpecialBuiltinMembers.wireman(getter) : null;
        String strAttabal = privatdozentVar != null ? ClassicBuiltinSpecialProperties.f30285attabal.attabal(privatdozentVar) : null;
        if (strAttabal != null && !SpecialBuiltinMembers.beachfront(trm(), privatdozentVar)) {
            return gusty(saranVar, strAttabal, function1);
        }
        String strDern = saranVar.getName().dern();
        Intrinsics.checkNotNullExpressionValue(strDern, "asString(...)");
        return gusty(saranVar, molybdenite.saneness(strDern), function1);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public void polloi(Collection<hydrovane> result, marial name) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
        Set<hydrovane> setJulian = julian(name);
        if (!SpecialGenericSignatures.f30303attabal.apical(name) && !BuiltinMethodsWithSpecialGenericSignature.f30284kowloon.formularize(name)) {
            Set<hydrovane> set = setJulian;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((dovishness) it.next()).isSuspend()) {
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : set) {
                if (hardpan((hydrovane) obj)) {
                    arrayList.add(obj);
                }
            }
            overspeculate(result, name, arrayList, false);
            return;
        }
        lyreflower.beachfront beachfrontVarAttabal = lyreflower.beachfront.f33195monoploid.attabal();
        Collection<? extends hydrovane> collectionWireman = p002kotlin.reflect.jvm.internal.impl.load.java.components.attabal.wireman(name, setJulian, adultoid.formularize(), trm(), p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.triweekly.f31624attabal, gintrap().attabal().apical().attabal());
        Intrinsics.checkNotNullExpressionValue(collectionWireman, "resolveOverridesForNonStaticMembers(...)");
        clubfoot(name, result, collectionWireman, result, new LazyJavaClassMemberScope$computeNonDeclaredFunctions$3(this));
        clubfoot(name, result, collectionWireman, beachfrontVarAttabal, new LazyJavaClassMemberScope$computeNonDeclaredFunctions$4(this));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : setJulian) {
            if (hardpan((hydrovane) obj2)) {
                arrayList2.add(obj2);
            }
        }
        overspeculate(result, name, CollectionsKt.unconsolidated(arrayList2, beachfrontVarAttabal), true);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: premeiotic, reason: merged with bridge method [inline-methods] */
    public ClassDeclaredMemberIndex arytenoidectomy() {
        return new ClassDeclaredMemberIndex(this.f30522kowloon, new Function1<monoploid, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$computeMemberIndex$1
            @Override // p002kotlin.jvm.functions.Function1
            public final Boolean invoke(monoploid it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!it.apical());
            }
        });
    }

    public final boolean preterite(hydrovane hydrovaneVar) {
        SpecialGenericSignatures.attabal attabalVar = SpecialGenericSignatures.f30303attabal;
        marial name = hydrovaneVar.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        marial marialVarSaneness = attabalVar.saneness(name);
        if (marialVarSaneness == null) {
            return false;
        }
        Set<hydrovane> setJulian = julian(marialVarSaneness);
        ArrayList arrayList = new ArrayList();
        for (Object obj : setJulian) {
            if (SpecialBuiltinMembers.attabal((hydrovane) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        hydrovane hydrovaneVarCoi = coi(hydrovaneVar, marialVarSaneness);
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (wostteth((hydrovane) it.next(), hydrovaneVarCoi)) {
                return true;
            }
        }
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<hydrovane> saneness(marial name, saneness location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        dhss(name, location);
        return super.saneness(name, location);
    }

    public final boolean sensatory(saran saranVar, Function1<? super marial, ? extends Collection<? extends hydrovane>> function1) {
        if (saneness.attabal(saranVar)) {
            return false;
        }
        hydrovane hydrovaneVarPicketboat = picketboat(saranVar, function1);
        hydrovane hydrovaneVarPalmyra = palmyra(saranVar, function1);
        if (hydrovaneVarPicketboat == null) {
            return false;
        }
        if (saranVar.restrictive()) {
            return hydrovaneVarPalmyra != null && hydrovaneVarPalmyra.kowloon() == hydrovaneVarPicketboat.kowloon();
        }
        return true;
    }

    public final JavaMethodDescriptor setterwort(gintrap gintrapVar) {
        JavaMethodDescriptor javaMethodDescriptorVir = JavaMethodDescriptor.vir(trm(), p002kotlin.reflect.jvm.internal.impl.load.java.lazy.dern.attabal(gintrap(), gintrapVar), gintrapVar.getName(), gintrap().attabal().graveside().attabal(gintrapVar), true);
        Intrinsics.checkNotNullExpressionValue(javaMethodDescriptorVir, "createJavaMethod(...)");
        javaMethodDescriptorVir.liable(null, cord(), adultoid.formularize(), adultoid.formularize(), adultoid.formularize(), gintrap().competently().kowloon(gintrapVar.getType(), p002kotlin.reflect.jvm.internal.impl.load.java.lazy.types.saneness.saneness(TypeUsage.COMMON, false, false, null, 6, null)), Modality.Companion.attabal(false, false, true), p002kotlin.reflect.jvm.internal.impl.descriptors.polloi.f30212marial, null);
        javaMethodDescriptorVir.incorrectly(false, false);
        gintrap().attabal().impromptu().attabal(gintrapVar, javaMethodDescriptorVir);
        return javaMethodDescriptorVir;
    }

    public final void splinterproof(List<cultivated> list, cutely cutelyVar, int i, polloi polloiVar, oilcan oilcanVar, oilcan oilcanVar2) {
        p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial marialVarSaneness = p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial.f29950impromptu.saneness();
        marial name = polloiVar.getName();
        oilcan oilcanVarTriweekly = nosophobia.triweekly(oilcanVar);
        Intrinsics.checkNotNullExpressionValue(oilcanVarTriweekly, "makeNotNullable(...)");
        list.add(new ValueParameterDescriptorImpl(cutelyVar, null, i, marialVarSaneness, name, oilcanVarTriweekly, polloiVar.polder(), false, false, oilcanVar2 != null ? nosophobia.triweekly(oilcanVar2) : null, gintrap().attabal().graveside().attabal(polloiVar)));
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public LazyJavaScope.attabal supplicat(polloi method, List<? extends clubfoot> methodTypeParameters, oilcan returnType, List<? extends cultivated> valueParameters) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(methodTypeParameters, "methodTypeParameters");
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(valueParameters, "valueParameters");
        kotlin.reflect.jvm.internal.impl.load.java.components.marial.saneness sanenessVarSaneness = gintrap().attabal().molybdenite().saneness(method, trm(), returnType, null, valueParameters, methodTypeParameters);
        Intrinsics.checkNotNullExpressionValue(sanenessVarSaneness, "resolvePropagatedSignature(...)");
        oilcan oilcanVarWireman = sanenessVarSaneness.wireman();
        Intrinsics.checkNotNullExpressionValue(oilcanVarWireman, "getReturnType(...)");
        oilcan oilcanVarDern = sanenessVarSaneness.dern();
        List<cultivated> listBeachfront = sanenessVarSaneness.beachfront();
        Intrinsics.checkNotNullExpressionValue(listBeachfront, "getValueParameters(...)");
        List<clubfoot> listMarial = sanenessVarSaneness.marial();
        Intrinsics.checkNotNullExpressionValue(listMarial, "getTypeParameters(...)");
        boolean zCompetently = sanenessVarSaneness.competently();
        List<String> listSaneness = sanenessVarSaneness.saneness();
        Intrinsics.checkNotNullExpressionValue(listSaneness, "getErrors(...)");
        return new LazyJavaScope.attabal(oilcanVarWireman, oilcanVarDern, listBeachfront, listMarial, zCompetently, listSaneness);
    }

    public final hydrovane technofreak(hydrovane hydrovaneVar, Function1<? super marial, ? extends Collection<? extends hydrovane>> function1, marial marialVar, Collection<? extends hydrovane> collection2) {
        hydrovane hydrovaneVar2 = (hydrovane) SpecialBuiltinMembers.wireman(hydrovaneVar);
        if (hydrovaneVar2 == null) {
            return null;
        }
        String strSaneness = SpecialBuiltinMembers.saneness(hydrovaneVar2);
        Intrinsics.beachfront(strSaneness);
        marial marialVarCutely = marial.cutely(strSaneness);
        Intrinsics.checkNotNullExpressionValue(marialVarCutely, "identifier(...)");
        Iterator<? extends hydrovane> it = function1.invoke(marialVarCutely).iterator();
        while (it.hasNext()) {
            hydrovane hydrovaneVarCoi = coi(it.next(), marialVar);
            if (wostteth(hydrovaneVar2, hydrovaneVarCoi)) {
                return coffeecake(hydrovaneVarCoi, hydrovaneVar2, collection2);
            }
        }
        return null;
    }

    public final Collection<oilcan> timberyard() {
        if (!this.f30520arytenoidectomy) {
            return gintrap().attabal().apical().dern().competently(trm());
        }
        Collection<oilcan> collectionCutely = trm().impromptu().cutely();
        Intrinsics.checkNotNullExpressionValue(collectionCutely, "getSupertypes(...)");
        return collectionCutely;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public String toString() {
        return "Lazy Java member scope for " + this.f30522kowloon.marial();
    }

    public final dern treadless() {
        boolean zKowloon = this.f30522kowloon.kowloon();
        if ((this.f30522kowloon.supplicat() || !this.f30522kowloon.polloi()) && !zKowloon) {
            return null;
        }
        wireman wiremanVarTrm = trm();
        methylmercury.saneness sanenessVarHyalinization = methylmercury.saneness.hyalinization(wiremanVarTrm, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial.f29950impromptu.saneness(), true, gintrap().attabal().graveside().attabal(this.f30522kowloon));
        Intrinsics.checkNotNullExpressionValue(sanenessVarHyalinization, "createJavaConstructor(...)");
        List<cultivated> listMilliradian = zKowloon ? milliradian(sanenessVarHyalinization) : Collections.EMPTY_LIST;
        sanenessVarHyalinization.osteal(false);
        sanenessVarHyalinization.twybill(listMilliradian, lightstruck(wiremanVarTrm));
        sanenessVarHyalinization.prefect(true);
        sanenessVarHyalinization.cig(wiremanVarTrm.impassible());
        gintrap().attabal().impromptu().saneness(this.f30522kowloon, sanenessVarHyalinization);
        return sanenessVarHyalinization;
    }

    public final Set<saran> unconsolidated(marial marialVar) {
        Collection<oilcan> collectionTimberyard = timberyard();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionTimberyard.iterator();
        while (it.hasNext()) {
            Collection<? extends saran> collectionDern = ((oilcan) it.next()).formularize().dern(marialVar, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
            ArrayList arrayList2 = new ArrayList(p002kotlin.collections.dovishness.gintrap(collectionDern, 10));
            Iterator<T> it2 = collectionDern.iterator();
            while (it2.hasNext()) {
                arrayList2.add((saran) it2.next());
            }
            cord.stratoscope(arrayList, arrayList2);
        }
        return CollectionsKt.prefect(arrayList);
    }

    public final boolean underbelly(p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVar, p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVar2) {
        OverridingUtil.OverrideCompatibilityInfo.Result resultDern = OverridingUtil.f31285beachfront.sealless(attabalVar2, attabalVar, true).dern();
        Intrinsics.checkNotNullExpressionValue(resultDern, "getResult(...)");
        return resultDern == OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE && !p002kotlin.reflect.jvm.internal.impl.load.java.triweekly.f30613attabal.attabal(attabalVar2, attabalVar);
    }

    public final methylmercury.saneness vesuvio(apical apicalVar) {
        wireman wiremanVarTrm = trm();
        methylmercury.saneness sanenessVarHyalinization = methylmercury.saneness.hyalinization(wiremanVarTrm, p002kotlin.reflect.jvm.internal.impl.load.java.lazy.dern.attabal(gintrap(), apicalVar), false, gintrap().attabal().graveside().attabal(apicalVar));
        Intrinsics.checkNotNullExpressionValue(sanenessVarHyalinization, "createJavaConstructor(...)");
        p002kotlin.reflect.jvm.internal.impl.load.java.lazy.wireman wiremanVarMarial = ContextKt.marial(gintrap(), sanenessVarHyalinization, apicalVar, wiremanVarTrm.triweekly().size());
        LazyJavaScope.saneness sanenessVarPolder = polder(wiremanVarMarial, sanenessVarHyalinization, apicalVar.beachfront());
        List<clubfoot> listTriweekly = wiremanVarTrm.triweekly();
        Intrinsics.checkNotNullExpressionValue(listTriweekly, "getDeclaredTypeParameters(...)");
        List<clubfoot> list = listTriweekly;
        List<preprohormone> typeParameters = apicalVar.getTypeParameters();
        ArrayList arrayList = new ArrayList(p002kotlin.collections.dovishness.gintrap(typeParameters, 10));
        Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            clubfoot clubfootVarAttabal = wiremanVarMarial.beachfront().attabal((preprohormone) it.next());
            Intrinsics.beachfront(clubfootVarAttabal);
            arrayList.add(clubfootVarAttabal);
        }
        sanenessVarHyalinization.miliaria(sanenessVarPolder.attabal(), rotuma.wireman(apicalVar.getVisibility()), CollectionsKt.unconsolidated(list, arrayList));
        sanenessVarHyalinization.prefect(false);
        sanenessVarHyalinization.osteal(sanenessVarPolder.saneness());
        sanenessVarHyalinization.cig(wiremanVarTrm.impassible());
        wiremanVarMarial.attabal().impromptu().saneness(apicalVar, sanenessVarHyalinization);
        return sanenessVarHyalinization;
    }

    public final boolean wostteth(hydrovane hydrovaneVar, dovishness dovishnessVar) {
        if (BuiltinMethodsWithDifferentJvmName.f30283kowloon.apical(hydrovaneVar)) {
            dovishnessVar = dovishnessVar.attabal();
        }
        Intrinsics.beachfront(dovishnessVar);
        return underbelly(dovishnessVar, hydrovaneVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope(final p002kotlin.reflect.jvm.internal.impl.load.java.lazy.wireman c, wireman ownerDescriptor, genesic.competently jClass, boolean z, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(c, lazyJavaClassMemberScope);
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(ownerDescriptor, "ownerDescriptor");
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.f30526triweekly = ownerDescriptor;
        this.f30522kowloon = jClass;
        this.f30520arytenoidectomy = z;
        this.f30524monoploid = c.marial().dern(new Function0<List<? extends dern>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$constructors$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final List<? extends dern> invoke() {
                Collection<apical> collectionTaiyuan = this.this$0.f30522kowloon.taiyuan();
                ArrayList arrayList = new ArrayList(collectionTaiyuan.size());
                Iterator<apical> it = collectionTaiyuan.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.this$0.vesuvio(it.next()));
                }
                if (this.this$0.f30522kowloon.monoploid()) {
                    dern dernVarItchy = this.this$0.itchy();
                    String strDern = p002kotlin.reflect.jvm.internal.impl.load.kotlin.dovishness.dern(dernVarItchy, false, false, 2, null);
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        do {
                            if (!it2.hasNext()) {
                                arrayList.add(dernVarItchy);
                                c.attabal().impromptu().saneness(this.this$0.f30522kowloon, dernVarItchy);
                                break;
                            }
                        } while (!Intrinsics.wireman(p002kotlin.reflect.jvm.internal.impl.load.kotlin.dovishness.dern((dern) it2.next(), false, false, 2, null), strDern));
                    } else {
                        arrayList.add(dernVarItchy);
                        c.attabal().impromptu().saneness(this.this$0.f30522kowloon, dernVarItchy);
                        break;
                    }
                }
                p002kotlin.reflect.jvm.internal.impl.load.java.lazy.wireman wiremanVar = c;
                wiremanVar.attabal().gintrap().attabal(wiremanVar, this.this$0.trm(), arrayList);
                SignatureEnhancement signatureEnhancementPolloi = c.attabal().polloi();
                p002kotlin.reflect.jvm.internal.impl.load.java.lazy.wireman wiremanVar2 = c;
                LazyJavaClassMemberScope lazyJavaClassMemberScope2 = this.this$0;
                boolean zIsEmpty = arrayList.isEmpty();
                List listArytenoidectomy = arrayList;
                if (zIsEmpty) {
                    listArytenoidectomy = adultoid.arytenoidectomy(lazyJavaClassMemberScope2.treadless());
                }
                return CollectionsKt.molet(signatureEnhancementPolloi.competently(wiremanVar2, listArytenoidectomy));
            }
        });
        this.f30525polloi = c.marial().dern(new Function0<Set<? extends marial>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$nestedClassIndex$1
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final Set<? extends marial> invoke() {
                return CollectionsKt.prefect(this.this$0.f30522kowloon.cord());
            }
        });
        this.f30523molybdenite = c.marial().dern(new Function0<Set<? extends marial>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$generatedNestedClassNames$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final Set<? extends marial> invoke() {
                p002kotlin.reflect.jvm.internal.impl.load.java.lazy.wireman wiremanVar = c;
                return CollectionsKt.prefect(wiremanVar.attabal().gintrap().competently(wiremanVar, this.trm()));
            }
        });
        this.f30521graveside = c.marial().dern(new Function0<Map<marial, ? extends triweekly>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$enumEntryIndex$1
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final Map<marial, ? extends triweekly> invoke() {
                Collection<triweekly> fields = this.this$0.f30522kowloon.getFields();
                ArrayList arrayList = new ArrayList();
                for (Object obj : fields) {
                    if (((triweekly) obj).kattegat()) {
                        arrayList.add(obj);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(p002kotlin.ranges.wireman.wireman(polder.marial(p002kotlin.collections.dovishness.gintrap(arrayList, 10)), 16));
                for (Object obj2 : arrayList) {
                    linkedHashMap.put(((triweekly) obj2).getName(), obj2);
                }
                return linkedHashMap;
            }
        });
        this.f30519adultoid = c.marial().competently(new Function1<marial, wireman>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$nestedClasses$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public final wireman invoke(marial name) {
                Intrinsics.checkNotNullParameter(name, "name");
                if (((Set) this.this$0.f30525polloi.invoke()).contains(name)) {
                    p002kotlin.reflect.jvm.internal.impl.load.java.cutely cutelyVarWireman = c.attabal().wireman();
                    byname.saneness sanenessVarApical = DescriptorUtilsKt.apical(this.this$0.trm());
                    Intrinsics.beachfront(sanenessVarApical);
                    byname.saneness sanenessVarWireman = sanenessVarApical.wireman(name);
                    Intrinsics.checkNotNullExpressionValue(sanenessVarWireman, "createNestedClassId(...)");
                    genesic.competently competentlyVarAttabal = cutelyVarWireman.attabal(new kotlin.reflect.jvm.internal.impl.load.java.cutely.attabal(sanenessVarWireman, null, this.this$0.f30522kowloon, 2, null));
                    if (competentlyVarAttabal == null) {
                        return null;
                    }
                    p002kotlin.reflect.jvm.internal.impl.load.java.lazy.wireman wiremanVar = c;
                    LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(wiremanVar, this.this$0.trm(), competentlyVarAttabal, null, 8, null);
                    wiremanVar.attabal().marial().attabal(lazyJavaClassDescriptor);
                    return lazyJavaClassDescriptor;
                }
                if (!((Set) this.this$0.f30523molybdenite.invoke()).contains(name)) {
                    triweekly triweeklyVar = (triweekly) ((Map) this.this$0.f30521graveside.invoke()).get(name);
                    if (triweeklyVar == null) {
                        return null;
                    }
                    formularize formularizeVarMarial = c.marial();
                    final LazyJavaClassMemberScope lazyJavaClassMemberScope2 = this.this$0;
                    return p002kotlin.reflect.jvm.internal.impl.descriptors.impl.impassible.vesuvio(c.marial(), this.this$0.trm(), name, formularizeVarMarial.dern(new Function0<Set<? extends marial>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$nestedClasses$1$enumMemberNames$1
                        {
                            super(0);
                        }

                        @Override // p002kotlin.jvm.functions.Function0
                        public final Set<? extends marial> invoke() {
                            return p002kotlin.collections.starveling.apical(lazyJavaClassMemberScope2.attabal(), lazyJavaClassMemberScope2.wireman());
                        }
                    }), p002kotlin.reflect.jvm.internal.impl.load.java.lazy.dern.attabal(c, triweeklyVar), c.attabal().graveside().attabal(triweeklyVar));
                }
                p002kotlin.reflect.jvm.internal.impl.load.java.lazy.wireman wiremanVar2 = c;
                LazyJavaClassMemberScope lazyJavaClassMemberScope3 = this.this$0;
                List<wireman> listDern = graveside.dern();
                wiremanVar2.attabal().gintrap().dern(wiremanVar2, lazyJavaClassMemberScope3.trm(), name, listDern);
                List listAttabal = graveside.attabal(listDern);
                int size = listAttabal.size();
                if (size == 0) {
                    return null;
                }
                if (size == 1) {
                    return (wireman) CollectionsKt.herdbook(listAttabal);
                }
                throw new IllegalStateException(("Multiple classes with same name are generated: " + listAttabal).toString());
            }
        });
    }
}
