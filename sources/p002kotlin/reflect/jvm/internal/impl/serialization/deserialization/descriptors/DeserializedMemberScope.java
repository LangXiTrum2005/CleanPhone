package p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import byname.marial;
import discontentedly.saneness;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kurbash.formularize;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.cord;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.polder;
import p002kotlin.collections.preprohormone;
import p002kotlin.collections.seminary;
import p002kotlin.collections.starveling;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.PropertyReference1Impl;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.ranges.wireman;
import p002kotlin.reflect.jvm.internal.impl.descriptors.hydrovane;
import p002kotlin.reflect.jvm.internal.impl.descriptors.overspeculate;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import p002kotlin.reflect.jvm.internal.impl.protobuf.arytenoidectomy;
import p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.cutely;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.graveside;
import p002kotlin.sequences.SequencesKt___SequencesKt;
import yeast.apical;
import yeast.competently;
import yeast.impromptu;
import yeast.taiyuan;

/* JADX INFO: compiled from: DeserializedMemberScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class DeserializedMemberScope extends beachfront {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final /* synthetic */ formularize<Object>[] f31505beachfront = {polloi.cutely(new PropertyReference1Impl(polloi.saneness(DeserializedMemberScope.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(DeserializedMemberScope.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final attabal f31506dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final taiyuan f31507marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final cutely f31508saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final impromptu f31509wireman;

    /* JADX INFO: compiled from: DeserializedMemberScope.kt */
    public final class NoReorderImplementation implements attabal {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public static final /* synthetic */ formularize<Object>[] f31510kowloon = {polloi.cutely(new PropertyReference1Impl(polloi.saneness(NoReorderImplementation.class), "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(NoReorderImplementation.class), "declaredProperties", "getDeclaredProperties()Ljava/util/List;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(NoReorderImplementation.class), "allTypeAliases", "getAllTypeAliases()Ljava/util/List;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(NoReorderImplementation.class), "allFunctions", "getAllFunctions()Ljava/util/List;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(NoReorderImplementation.class), "allProperties", "getAllProperties()Ljava/util/List;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(NoReorderImplementation.class), "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(NoReorderImplementation.class), "functionsByName", "getFunctionsByName()Ljava/util/Map;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(NoReorderImplementation.class), "propertiesByName", "getPropertiesByName()Ljava/util/Map;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(NoReorderImplementation.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(NoReorderImplementation.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public final impromptu f31511apical;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final List<ProtoBuf$Function> f31512attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final impromptu f31513beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public final impromptu f31514competently;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public final impromptu f31515cutely;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final List<ProtoBuf$TypeAlias> f31516dern;

        /* JADX INFO: renamed from: formularize, reason: collision with root package name */
        public final impromptu f31517formularize;

        /* JADX INFO: renamed from: impassible, reason: collision with root package name */
        public final impromptu f31518impassible;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public final impromptu f31519impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final impromptu f31520marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final List<ProtoBuf$Property> f31521saneness;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public final impromptu f31522taiyuan;

        /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
        public final /* synthetic */ DeserializedMemberScope f31523triweekly;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final impromptu f31524wireman;

        public NoReorderImplementation(final DeserializedMemberScope deserializedMemberScope, List<ProtoBuf$Function> functionList, List<ProtoBuf$Property> propertyList, List<ProtoBuf$TypeAlias> typeAliasList) {
            Intrinsics.checkNotNullParameter(functionList, "functionList");
            Intrinsics.checkNotNullParameter(propertyList, "propertyList");
            Intrinsics.checkNotNullParameter(typeAliasList, "typeAliasList");
            this.f31523triweekly = deserializedMemberScope;
            this.f31512attabal = functionList;
            this.f31521saneness = propertyList;
            this.f31516dern = deserializedMemberScope.arytenoidectomy().dern().competently().wireman() ? typeAliasList : adultoid.formularize();
            this.f31524wireman = deserializedMemberScope.arytenoidectomy().impromptu().dern(new Function0<List<? extends hydrovane>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$declaredFunctions$2
                {
                    super(0);
                }

                @Override // p002kotlin.jvm.functions.Function0
                public final List<? extends hydrovane> invoke() {
                    return this.this$0.dovishness();
                }
            });
            this.f31520marial = deserializedMemberScope.arytenoidectomy().impromptu().dern(new Function0<List<? extends saran>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$declaredProperties$2
                {
                    super(0);
                }

                @Override // p002kotlin.jvm.functions.Function0
                public final List<? extends saran> invoke() {
                    return this.this$0.preprohormone();
                }
            });
            this.f31513beachfront = deserializedMemberScope.arytenoidectomy().impromptu().dern(new Function0<List<? extends overspeculate>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$allTypeAliases$2
                {
                    super(0);
                }

                @Override // p002kotlin.jvm.functions.Function0
                public final List<? extends overspeculate> invoke() {
                    return this.this$0.cord();
                }
            });
            this.f31514competently = deserializedMemberScope.arytenoidectomy().impromptu().dern(new Function0<List<? extends hydrovane>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$allFunctions$2
                {
                    super(0);
                }

                @Override // p002kotlin.jvm.functions.Function0
                public final List<? extends hydrovane> invoke() {
                    return CollectionsKt.unconsolidated(this.this$0.oilcan(), this.this$0.graveside());
                }
            });
            this.f31519impromptu = deserializedMemberScope.arytenoidectomy().impromptu().dern(new Function0<List<? extends saran>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$allProperties$2
                {
                    super(0);
                }

                @Override // p002kotlin.jvm.functions.Function0
                public final List<? extends saran> invoke() {
                    return CollectionsKt.unconsolidated(this.this$0.yemenite(), this.this$0.adultoid());
                }
            });
            this.f31522taiyuan = deserializedMemberScope.arytenoidectomy().impromptu().dern(new Function0<Map<marial, ? extends overspeculate>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$typeAliasesByName$2
                {
                    super(0);
                }

                @Override // p002kotlin.jvm.functions.Function0
                public final Map<marial, ? extends overspeculate> invoke() {
                    List listTrm = this.this$0.trm();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(wireman.wireman(polder.marial(dovishness.gintrap(listTrm, 10)), 16));
                    for (Object obj : listTrm) {
                        marial name = ((overspeculate) obj).getName();
                        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                        linkedHashMap.put(name, obj);
                    }
                    return linkedHashMap;
                }
            });
            this.f31515cutely = deserializedMemberScope.arytenoidectomy().impromptu().dern(new Function0<Map<marial, ? extends List<? extends hydrovane>>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$functionsByName$2
                {
                    super(0);
                }

                @Override // p002kotlin.jvm.functions.Function0
                public final Map<marial, ? extends List<? extends hydrovane>> invoke() {
                    List listCuirassed = this.this$0.cuirassed();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj : listCuirassed) {
                        marial name = ((hydrovane) obj).getName();
                        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                        Object arrayList = linkedHashMap.get(name);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            linkedHashMap.put(name, arrayList);
                        }
                        ((List) arrayList).add(obj);
                    }
                    return linkedHashMap;
                }
            });
            this.f31511apical = deserializedMemberScope.arytenoidectomy().impromptu().dern(new Function0<Map<marial, ? extends List<? extends saran>>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$propertiesByName$2
                {
                    super(0);
                }

                @Override // p002kotlin.jvm.functions.Function0
                public final Map<marial, ? extends List<? extends saran>> invoke() {
                    List listStratoscope = this.this$0.stratoscope();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj : listStratoscope) {
                        marial name = ((saran) obj).getName();
                        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                        Object arrayList = linkedHashMap.get(name);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            linkedHashMap.put(name, arrayList);
                        }
                        ((List) arrayList).add(obj);
                    }
                    return linkedHashMap;
                }
            });
            this.f31517formularize = deserializedMemberScope.arytenoidectomy().impromptu().dern(new Function0<Set<? extends marial>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$functionNames$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p002kotlin.jvm.functions.Function0
                public final Set<? extends marial> invoke() {
                    DeserializedMemberScope.NoReorderImplementation noReorderImplementation = this.this$0;
                    List list = noReorderImplementation.f31512attabal;
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    DeserializedMemberScope deserializedMemberScope2 = noReorderImplementation.f31523triweekly;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        linkedHashSet.add(graveside.saneness(deserializedMemberScope2.arytenoidectomy().competently(), ((ProtoBuf$Function) ((triweekly) it.next())).getName()));
                    }
                    return starveling.apical(linkedHashSet, deserializedMemberScope.graveside());
                }
            });
            this.f31518impassible = deserializedMemberScope.arytenoidectomy().impromptu().dern(new Function0<Set<? extends marial>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$variableNames$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p002kotlin.jvm.functions.Function0
                public final Set<? extends marial> invoke() {
                    DeserializedMemberScope.NoReorderImplementation noReorderImplementation = this.this$0;
                    List list = noReorderImplementation.f31521saneness;
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    DeserializedMemberScope deserializedMemberScope2 = noReorderImplementation.f31523triweekly;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        linkedHashSet.add(graveside.saneness(deserializedMemberScope2.arytenoidectomy().competently(), ((ProtoBuf$Property) ((triweekly) it.next())).getName()));
                    }
                    return starveling.apical(linkedHashSet, deserializedMemberScope.adultoid());
                }
            });
        }

        public final List<saran> adultoid() {
            Set<marial> setAdultoid = this.f31523triweekly.adultoid();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = setAdultoid.iterator();
            while (it.hasNext()) {
                cord.stratoscope(arrayList, rotuma((marial) it.next()));
            }
            return arrayList;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.attabal
        public Set<marial> attabal() {
            return (Set) apical.attabal(this.f31517formularize, this, f31510kowloon[8]);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.attabal
        public void beachfront(Collection<p002kotlin.reflect.jvm.internal.impl.descriptors.apical> result, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.wireman kindFilter, Function1<? super marial, Boolean> nameFilter, saneness location) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
            Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
            Intrinsics.checkNotNullParameter(location, "location");
            if (kindFilter.attabal(p002kotlin.reflect.jvm.internal.impl.resolve.scopes.wireman.f31395dern.taiyuan())) {
                for (Object obj : stratoscope()) {
                    marial name = ((saran) obj).getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    if (nameFilter.invoke(name).booleanValue()) {
                        result.add(obj);
                    }
                }
            }
            if (kindFilter.attabal(p002kotlin.reflect.jvm.internal.impl.resolve.scopes.wireman.f31395dern.wireman())) {
                for (Object obj2 : cuirassed()) {
                    marial name2 = ((hydrovane) obj2).getName();
                    Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                    if (nameFilter.invoke(name2).booleanValue()) {
                        result.add(obj2);
                    }
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.attabal
        public overspeculate competently(marial name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return supplicat().get(name);
        }

        public final List<overspeculate> cord() {
            List<ProtoBuf$TypeAlias> list = this.f31516dern;
            DeserializedMemberScope deserializedMemberScope = this.f31523triweekly;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                overspeculate overspeculateVarImpassible = deserializedMemberScope.arytenoidectomy().beachfront().impassible((ProtoBuf$TypeAlias) ((triweekly) it.next()));
                if (overspeculateVarImpassible != null) {
                    arrayList.add(overspeculateVarImpassible);
                }
            }
            return arrayList;
        }

        public final List<hydrovane> cuirassed() {
            return (List) apical.attabal(this.f31514competently, this, f31510kowloon[3]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.attabal
        public Collection<saran> dern(marial name, saneness location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            if (!wireman().contains(name)) {
                return adultoid.formularize();
            }
            Collection<saran> collection2 = kattegat().get(name);
            return collection2 == null ? adultoid.formularize() : collection2;
        }

        public final List<hydrovane> dovishness() {
            List<ProtoBuf$Function> list = this.f31512attabal;
            DeserializedMemberScope deserializedMemberScope = this.f31523triweekly;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                hydrovane hydrovaneVarCutely = deserializedMemberScope.arytenoidectomy().beachfront().cutely((ProtoBuf$Function) ((triweekly) it.next()));
                if (!deserializedMemberScope.rotuma(hydrovaneVarCutely)) {
                    hydrovaneVarCutely = null;
                }
                if (hydrovaneVarCutely != null) {
                    arrayList.add(hydrovaneVarCutely);
                }
            }
            return arrayList;
        }

        public final List<hydrovane> gintrap(marial marialVar) {
            List<hydrovane> listOilcan = oilcan();
            DeserializedMemberScope deserializedMemberScope = this.f31523triweekly;
            ArrayList arrayList = new ArrayList();
            for (Object obj : listOilcan) {
                if (Intrinsics.wireman(((p002kotlin.reflect.jvm.internal.impl.descriptors.apical) obj).getName(), marialVar)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            deserializedMemberScope.apical(marialVar, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        public final List<hydrovane> graveside() {
            Set<marial> setGraveside = this.f31523triweekly.graveside();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = setGraveside.iterator();
            while (it.hasNext()) {
                cord.stratoscope(arrayList, gintrap((marial) it.next()));
            }
            return arrayList;
        }

        public final Map<marial, Collection<saran>> kattegat() {
            return (Map) apical.attabal(this.f31511apical, this, f31510kowloon[7]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.attabal
        public Set<marial> marial() {
            List<ProtoBuf$TypeAlias> list = this.f31516dern;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            DeserializedMemberScope deserializedMemberScope = this.f31523triweekly;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(graveside.saneness(deserializedMemberScope.arytenoidectomy().competently(), ((ProtoBuf$TypeAlias) ((triweekly) it.next())).getName()));
            }
            return linkedHashSet;
        }

        public final List<hydrovane> oilcan() {
            return (List) apical.attabal(this.f31524wireman, this, f31510kowloon[0]);
        }

        public final List<saran> preprohormone() {
            List<ProtoBuf$Property> list = this.f31521saneness;
            DeserializedMemberScope deserializedMemberScope = this.f31523triweekly;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                saran saranVarFormularize = deserializedMemberScope.arytenoidectomy().beachfront().formularize((ProtoBuf$Property) ((triweekly) it.next()));
                if (saranVarFormularize != null) {
                    arrayList.add(saranVarFormularize);
                }
            }
            return arrayList;
        }

        public final List<saran> rotuma(marial marialVar) {
            List<saran> listYemenite = yemenite();
            DeserializedMemberScope deserializedMemberScope = this.f31523triweekly;
            ArrayList arrayList = new ArrayList();
            for (Object obj : listYemenite) {
                if (Intrinsics.wireman(((p002kotlin.reflect.jvm.internal.impl.descriptors.apical) obj).getName(), marialVar)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            deserializedMemberScope.formularize(marialVar, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.attabal
        public Collection<hydrovane> saneness(marial name, saneness location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            if (!attabal().contains(name)) {
                return adultoid.formularize();
            }
            Collection<hydrovane> collection2 = sealless().get(name);
            return collection2 == null ? adultoid.formularize() : collection2;
        }

        public final Map<marial, Collection<hydrovane>> sealless() {
            return (Map) apical.attabal(this.f31515cutely, this, f31510kowloon[6]);
        }

        public final List<saran> stratoscope() {
            return (List) apical.attabal(this.f31519impromptu, this, f31510kowloon[4]);
        }

        public final Map<marial, overspeculate> supplicat() {
            return (Map) apical.attabal(this.f31522taiyuan, this, f31510kowloon[5]);
        }

        public final List<overspeculate> trm() {
            return (List) apical.attabal(this.f31513beachfront, this, f31510kowloon[2]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.attabal
        public Set<marial> wireman() {
            return (Set) apical.attabal(this.f31518impassible, this, f31510kowloon[9]);
        }

        public final List<saran> yemenite() {
            return (List) apical.attabal(this.f31520marial, this, f31510kowloon[1]);
        }
    }

    /* JADX INFO: compiled from: DeserializedMemberScope.kt */
    public final class OptimizedImplementation implements attabal {

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public static final /* synthetic */ formularize<Object>[] f31525cutely = {polloi.cutely(new PropertyReference1Impl(polloi.saneness(OptimizedImplementation.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(OptimizedImplementation.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Map<marial, byte[]> f31526attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final competently<marial, overspeculate> f31527beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public final impromptu f31528competently;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final Map<marial, byte[]> f31529dern;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public final impromptu f31530impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final yeast.beachfront<marial, Collection<saran>> f31531marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final Map<marial, byte[]> f31532saneness;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public final /* synthetic */ DeserializedMemberScope f31533taiyuan;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final yeast.beachfront<marial, Collection<hydrovane>> f31534wireman;

        public OptimizedImplementation(DeserializedMemberScope deserializedMemberScope, List<ProtoBuf$Function> functionList, List<ProtoBuf$Property> propertyList, List<ProtoBuf$TypeAlias> typeAliasList) throws IOException {
            Map<marial, byte[]> mapTaiyuan;
            Intrinsics.checkNotNullParameter(functionList, "functionList");
            Intrinsics.checkNotNullParameter(propertyList, "propertyList");
            Intrinsics.checkNotNullParameter(typeAliasList, "typeAliasList");
            this.f31533taiyuan = deserializedMemberScope;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : functionList) {
                marial marialVarSaneness = graveside.saneness(deserializedMemberScope.arytenoidectomy().competently(), ((ProtoBuf$Function) ((triweekly) obj)).getName());
                Object arrayList = linkedHashMap.get(marialVarSaneness);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(marialVarSaneness, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            this.f31526attabal = arytenoidectomy(linkedHashMap);
            DeserializedMemberScope deserializedMemberScope2 = this.f31533taiyuan;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj2 : propertyList) {
                marial marialVarSaneness2 = graveside.saneness(deserializedMemberScope2.arytenoidectomy().competently(), ((ProtoBuf$Property) ((triweekly) obj2)).getName());
                Object arrayList2 = linkedHashMap2.get(marialVarSaneness2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap2.put(marialVarSaneness2, arrayList2);
                }
                ((List) arrayList2).add(obj2);
            }
            this.f31532saneness = arytenoidectomy(linkedHashMap2);
            if (this.f31533taiyuan.arytenoidectomy().dern().competently().wireman()) {
                DeserializedMemberScope deserializedMemberScope3 = this.f31533taiyuan;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj3 : typeAliasList) {
                    marial marialVarSaneness3 = graveside.saneness(deserializedMemberScope3.arytenoidectomy().competently(), ((ProtoBuf$TypeAlias) ((triweekly) obj3)).getName());
                    Object arrayList3 = linkedHashMap3.get(marialVarSaneness3);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap3.put(marialVarSaneness3, arrayList3);
                    }
                    ((List) arrayList3).add(obj3);
                }
                mapTaiyuan = arytenoidectomy(linkedHashMap3);
            } else {
                mapTaiyuan = seminary.taiyuan();
            }
            this.f31529dern = mapTaiyuan;
            this.f31534wireman = this.f31533taiyuan.arytenoidectomy().impromptu().taiyuan(new Function1<marial, Collection<? extends hydrovane>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$functions$1
                {
                    super(1);
                }

                @Override // p002kotlin.jvm.functions.Function1
                public final Collection<hydrovane> invoke(marial it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return this.this$0.impassible(it);
                }
            });
            this.f31531marial = this.f31533taiyuan.arytenoidectomy().impromptu().taiyuan(new Function1<marial, Collection<? extends saran>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$properties$1
                {
                    super(1);
                }

                @Override // p002kotlin.jvm.functions.Function1
                public final Collection<saran> invoke(marial it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return this.this$0.triweekly(it);
                }
            });
            this.f31527beachfront = this.f31533taiyuan.arytenoidectomy().impromptu().competently(new Function1<marial, overspeculate>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$typeAliasByName$1
                {
                    super(1);
                }

                @Override // p002kotlin.jvm.functions.Function1
                public final overspeculate invoke(marial it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return this.this$0.kowloon(it);
                }
            });
            yeast.formularize formularizeVarImpromptu = this.f31533taiyuan.arytenoidectomy().impromptu();
            final DeserializedMemberScope deserializedMemberScope4 = this.f31533taiyuan;
            this.f31528competently = formularizeVarImpromptu.dern(new Function0<Set<? extends marial>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$functionNames$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p002kotlin.jvm.functions.Function0
                public final Set<? extends marial> invoke() {
                    return starveling.apical(this.this$0.f31526attabal.keySet(), deserializedMemberScope4.graveside());
                }
            });
            yeast.formularize formularizeVarImpromptu2 = this.f31533taiyuan.arytenoidectomy().impromptu();
            final DeserializedMemberScope deserializedMemberScope5 = this.f31533taiyuan;
            this.f31530impromptu = formularizeVarImpromptu2.dern(new Function0<Set<? extends marial>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$variableNames$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p002kotlin.jvm.functions.Function0
                public final Set<? extends marial> invoke() {
                    return starveling.apical(this.this$0.f31532saneness.keySet(), deserializedMemberScope5.adultoid());
                }
            });
        }

        public final Map<marial, byte[]> arytenoidectomy(Map<marial, ? extends Collection<? extends p002kotlin.reflect.jvm.internal.impl.protobuf.attabal>> map) throws IOException {
            LinkedHashMap linkedHashMap = new LinkedHashMap(polder.marial(map.size()));
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(dovishness.gintrap(iterable, 10));
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    ((p002kotlin.reflect.jvm.internal.impl.protobuf.attabal) it2.next()).writeDelimitedTo(byteArrayOutputStream);
                    arrayList.add(Unit.f29295attabal);
                }
                linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.attabal
        public Set<marial> attabal() {
            return (Set) apical.attabal(this.f31528competently, this, f31525cutely[0]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.attabal
        public void beachfront(Collection<p002kotlin.reflect.jvm.internal.impl.descriptors.apical> result, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.wireman kindFilter, Function1<? super marial, Boolean> nameFilter, saneness location) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
            Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
            Intrinsics.checkNotNullParameter(location, "location");
            if (kindFilter.attabal(p002kotlin.reflect.jvm.internal.impl.resolve.scopes.wireman.f31395dern.taiyuan())) {
                Set<marial> setWireman = wireman();
                ArrayList arrayList = new ArrayList();
                for (marial marialVar : setWireman) {
                    if (nameFilter.invoke(marialVar).booleanValue()) {
                        arrayList.addAll(dern(marialVar, location));
                    }
                }
                p002kotlin.reflect.jvm.internal.impl.resolve.competently INSTANCE = p002kotlin.reflect.jvm.internal.impl.resolve.competently.f31313kowloon;
                Intrinsics.checkNotNullExpressionValue(INSTANCE, "INSTANCE");
                preprohormone.cuirassed(arrayList, INSTANCE);
                result.addAll(arrayList);
            }
            if (kindFilter.attabal(p002kotlin.reflect.jvm.internal.impl.resolve.scopes.wireman.f31395dern.wireman())) {
                Set<marial> setAttabal = attabal();
                ArrayList arrayList2 = new ArrayList();
                for (marial marialVar2 : setAttabal) {
                    if (nameFilter.invoke(marialVar2).booleanValue()) {
                        arrayList2.addAll(saneness(marialVar2, location));
                    }
                }
                p002kotlin.reflect.jvm.internal.impl.resolve.competently INSTANCE2 = p002kotlin.reflect.jvm.internal.impl.resolve.competently.f31313kowloon;
                Intrinsics.checkNotNullExpressionValue(INSTANCE2, "INSTANCE");
                preprohormone.cuirassed(arrayList2, INSTANCE2);
                result.addAll(arrayList2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.attabal
        public overspeculate competently(marial name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return this.f31527beachfront.invoke(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.attabal
        public Collection<saran> dern(marial name, saneness location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            return !wireman().contains(name) ? adultoid.formularize() : this.f31531marial.invoke(name);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x002c  */
        public final Collection<hydrovane> impassible(marial marialVar) {
            List<ProtoBuf$Function> listFormularize;
            Map<marial, byte[]> map = this.f31526attabal;
            arytenoidectomy<ProtoBuf$Function> PARSER = ProtoBuf$Function.PARSER;
            Intrinsics.checkNotNullExpressionValue(PARSER, "PARSER");
            DeserializedMemberScope deserializedMemberScope = this.f31533taiyuan;
            byte[] bArr = map.get(marialVar);
            if (bArr != null) {
                List listHydrovane = SequencesKt___SequencesKt.hydrovane(p002kotlin.sequences.arytenoidectomy.kowloon(new DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1(PARSER, new ByteArrayInputStream(bArr), this.f31533taiyuan)));
                if (listHydrovane != null) {
                    listFormularize = listHydrovane;
                } else {
                    listFormularize = adultoid.formularize();
                }
            } else {
                listFormularize = adultoid.formularize();
            }
            ArrayList arrayList = new ArrayList(listFormularize.size());
            for (ProtoBuf$Function protoBuf$Function : listFormularize) {
                MemberDeserializer memberDeserializerBeachfront = deserializedMemberScope.arytenoidectomy().beachfront();
                Intrinsics.beachfront(protoBuf$Function);
                hydrovane hydrovaneVarCutely = memberDeserializerBeachfront.cutely(protoBuf$Function);
                if (!deserializedMemberScope.rotuma(hydrovaneVarCutely)) {
                    hydrovaneVarCutely = null;
                }
                if (hydrovaneVarCutely != null) {
                    arrayList.add(hydrovaneVarCutely);
                }
            }
            deserializedMemberScope.apical(marialVar, arrayList);
            return lyreflower.attabal.dern(arrayList);
        }

        public final overspeculate kowloon(marial marialVar) {
            ProtoBuf$TypeAlias delimitedFrom;
            byte[] bArr = this.f31529dern.get(marialVar);
            if (bArr == null || (delimitedFrom = ProtoBuf$TypeAlias.parseDelimitedFrom(new ByteArrayInputStream(bArr), this.f31533taiyuan.arytenoidectomy().dern().apical())) == null) {
                return null;
            }
            return this.f31533taiyuan.arytenoidectomy().beachfront().impassible(delimitedFrom);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.attabal
        public Set<marial> marial() {
            return this.f31529dern.keySet();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.attabal
        public Collection<hydrovane> saneness(marial name, saneness location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            return !attabal().contains(name) ? adultoid.formularize() : this.f31534wireman.invoke(name);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x002c  */
        public final Collection<saran> triweekly(marial marialVar) {
            List<ProtoBuf$Property> listFormularize;
            Map<marial, byte[]> map = this.f31532saneness;
            arytenoidectomy<ProtoBuf$Property> PARSER = ProtoBuf$Property.PARSER;
            Intrinsics.checkNotNullExpressionValue(PARSER, "PARSER");
            DeserializedMemberScope deserializedMemberScope = this.f31533taiyuan;
            byte[] bArr = map.get(marialVar);
            if (bArr != null) {
                List listHydrovane = SequencesKt___SequencesKt.hydrovane(p002kotlin.sequences.arytenoidectomy.kowloon(new DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1(PARSER, new ByteArrayInputStream(bArr), this.f31533taiyuan)));
                if (listHydrovane != null) {
                    listFormularize = listHydrovane;
                } else {
                    listFormularize = adultoid.formularize();
                }
            } else {
                listFormularize = adultoid.formularize();
            }
            ArrayList arrayList = new ArrayList(listFormularize.size());
            for (ProtoBuf$Property protoBuf$Property : listFormularize) {
                MemberDeserializer memberDeserializerBeachfront = deserializedMemberScope.arytenoidectomy().beachfront();
                Intrinsics.beachfront(protoBuf$Property);
                saran saranVarFormularize = memberDeserializerBeachfront.formularize(protoBuf$Property);
                if (saranVarFormularize != null) {
                    arrayList.add(saranVarFormularize);
                }
            }
            deserializedMemberScope.formularize(marialVar, arrayList);
            return lyreflower.attabal.dern(arrayList);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.attabal
        public Set<marial> wireman() {
            return (Set) apical.attabal(this.f31530impromptu, this, f31525cutely[1]);
        }
    }

    /* JADX INFO: compiled from: DeserializedMemberScope.kt */
    public interface attabal {
        Set<marial> attabal();

        void beachfront(Collection<p002kotlin.reflect.jvm.internal.impl.descriptors.apical> collection2, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.wireman wiremanVar, Function1<? super marial, Boolean> function1, saneness sanenessVar);

        overspeculate competently(marial marialVar);

        Collection<saran> dern(marial marialVar, saneness sanenessVar);

        Set<marial> marial();

        Collection<hydrovane> saneness(marial marialVar, saneness sanenessVar);

        Set<marial> wireman();
    }

    public DeserializedMemberScope(cutely c, List<ProtoBuf$Function> functionList, List<ProtoBuf$Property> propertyList, List<ProtoBuf$TypeAlias> typeAliasList, final Function0<? extends Collection<marial>> classNames) {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(functionList, "functionList");
        Intrinsics.checkNotNullParameter(propertyList, "propertyList");
        Intrinsics.checkNotNullParameter(typeAliasList, "typeAliasList");
        Intrinsics.checkNotNullParameter(classNames, "classNames");
        this.f31508saneness = c;
        this.f31506dern = triweekly(functionList, propertyList, typeAliasList);
        this.f31509wireman = c.impromptu().dern(new Function0<Set<? extends marial>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$classNames$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final Set<? extends marial> invoke() {
                return CollectionsKt.prefect(classNames.invoke());
            }
        });
        this.f31507marial = c.impromptu().marial(new Function0<Set<? extends marial>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$classifierNamesLazy$2
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final Set<? extends marial> invoke() {
                Set<marial> setMolybdenite = this.this$0.molybdenite();
                if (setMolybdenite == null) {
                    return null;
                }
                return starveling.apical(starveling.apical(this.this$0.monoploid(), this.this$0.f31506dern.marial()), setMolybdenite);
            }
        });
    }

    public abstract Set<marial> adultoid();

    public void apical(marial name, List<hydrovane> functions) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(functions, "functions");
    }

    public final cutely arytenoidectomy() {
        return this.f31508saneness;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<marial> attabal() {
        return this.f31506dern.attabal();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<marial> beachfront() {
        return polloi();
    }

    public final Collection<p002kotlin.reflect.jvm.internal.impl.descriptors.apical> cutely(p002kotlin.reflect.jvm.internal.impl.resolve.scopes.wireman kindFilter, Function1<? super marial, Boolean> nameFilter, saneness location) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        Intrinsics.checkNotNullParameter(location, "location");
        ArrayList arrayList = new ArrayList(0);
        kotlin.reflect.jvm.internal.impl.resolve.scopes.wireman.attabal attabalVar = p002kotlin.reflect.jvm.internal.impl.resolve.scopes.wireman.f31395dern;
        if (kindFilter.attabal(attabalVar.competently())) {
            taiyuan(arrayList, nameFilter);
        }
        this.f31506dern.beachfront(arrayList, kindFilter, nameFilter, location);
        if (kindFilter.attabal(attabalVar.dern())) {
            for (marial marialVar : monoploid()) {
                if (nameFilter.invoke(marialVar).booleanValue()) {
                    lyreflower.attabal.attabal(arrayList, kowloon(marialVar));
                }
            }
        }
        if (kindFilter.attabal(p002kotlin.reflect.jvm.internal.impl.resolve.scopes.wireman.f31395dern.impromptu())) {
            for (marial marialVar2 : this.f31506dern.marial()) {
                if (nameFilter.invoke(marialVar2).booleanValue()) {
                    lyreflower.attabal.attabal(arrayList, this.f31506dern.competently(marialVar2));
                }
            }
        }
        return lyreflower.attabal.dern(arrayList);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<saran> dern(marial name, saneness location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return this.f31506dern.dern(name, location);
    }

    public final overspeculate dovishness(marial marialVar) {
        return this.f31506dern.competently(marialVar);
    }

    public void formularize(marial name, List<saran> descriptors) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(descriptors, "descriptors");
    }

    public boolean gintrap(marial name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return monoploid().contains(name);
    }

    public abstract Set<marial> graveside();

    public abstract byname.saneness impassible(marial marialVar);

    public final p002kotlin.reflect.jvm.internal.impl.descriptors.wireman kowloon(marial marialVar) {
        return this.f31508saneness.dern().saneness(impassible(marialVar));
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.impromptu
    public p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront marial(marial name, saneness location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        if (gintrap(name)) {
            return kowloon(name);
        }
        if (this.f31506dern.marial().contains(name)) {
            return dovishness(name);
        }
        return null;
    }

    public abstract Set<marial> molybdenite();

    public final Set<marial> monoploid() {
        return (Set) apical.attabal(this.f31509wireman, this, f31505beachfront[0]);
    }

    public final Set<marial> polloi() {
        return (Set) apical.saneness(this.f31507marial, this, f31505beachfront[1]);
    }

    public boolean rotuma(hydrovane function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return true;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<hydrovane> saneness(marial name, saneness location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return this.f31506dern.saneness(name, location);
    }

    public abstract void taiyuan(Collection<p002kotlin.reflect.jvm.internal.impl.descriptors.apical> collection2, Function1<? super marial, Boolean> function1);

    public final attabal triweekly(List<ProtoBuf$Function> list, List<ProtoBuf$Property> list2, List<ProtoBuf$TypeAlias> list3) {
        return this.f31508saneness.dern().competently().attabal() ? new NoReorderImplementation(this, list, list2, list3) : new OptimizedImplementation(this, list, list2, list3);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<marial> wireman() {
        return this.f31506dern.wireman();
    }
}
