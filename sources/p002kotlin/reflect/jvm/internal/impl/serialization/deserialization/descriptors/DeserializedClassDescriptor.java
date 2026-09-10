package p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import byname.saneness;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.cord;
import p002kotlin.collections.polder;
import p002kotlin.collections.starveling;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import p002kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p002kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import p002kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import p002kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dent;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dern;
import p002kotlin.reflect.jvm.internal.impl.descriptors.graveside;
import p002kotlin.reflect.jvm.internal.impl.descriptors.hydrovane;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.attabal;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.impassible;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.kowloon;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.trm;
import p002kotlin.reflect.jvm.internal.impl.descriptors.molybdenite;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;
import p002kotlin.reflect.jvm.internal.impl.descriptors.splinterproof;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable;
import p002kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.cuirassed;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.cutely;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.dovishness;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.gintrap;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.rotuma;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.triweekly;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.permissivist;
import yeast.competently;
import yeast.formularize;
import yeast.impromptu;
import yeast.taiyuan;

/* JADX INFO: compiled from: DeserializedClassDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DeserializedClassDescriptor extends attabal implements apical {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public final walach f31472adultoid;

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public final cutely f31473cord;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public final beachfront f31474cuirassed;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public final saneness f31475dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public final Modality f31476gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final genesis.attabal f31477graveside;

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name */
    public final impromptu<Collection<dern>> f31478kattegat;

    /* JADX INFO: renamed from: merc, reason: collision with root package name */
    public final taiyuan<dent<merc>> f31479merc;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final ProtoBuf$Class f31480molybdenite;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    public final EnumEntryClassDescriptors f31481oilcan;

    /* JADX INFO: renamed from: polder, reason: collision with root package name */
    public final dovishness.attabal f31482polder;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public final ClassKind f31483preprohormone;

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name */
    public final impromptu<Collection<wireman>> f31484restrictive;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public final molybdenite f31485rotuma;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public final taiyuan<dern> f31486sealless;

    /* JADX INFO: renamed from: seminary, reason: collision with root package name */
    public final marial f31487seminary;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public final DeserializedClassTypeConstructor f31488stratoscope;

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name */
    public final taiyuan<wireman> f31489supplicat;

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public final ScopesHolderForClass<DeserializedClassMemberScope> f31490trm;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public final apical f31491yemenite;

    /* JADX INFO: compiled from: DeserializedClassDescriptor.kt */
    public final class DeserializedClassMemberScope extends DeserializedMemberScope {

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public final p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront f31492competently;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public final /* synthetic */ DeserializedClassDescriptor f31493cutely;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public final impromptu<Collection<apical>> f31494impromptu;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public final impromptu<Collection<oilcan>> f31495taiyuan;

        /* JADX INFO: compiled from: DeserializedClassDescriptor.kt */
        public static final class attabal extends p002kotlin.reflect.jvm.internal.impl.resolve.impromptu {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public final /* synthetic */ List<D> f31496attabal;

            public attabal(List<D> list) {
                this.f31496attabal = list;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // p002kotlin.reflect.jvm.internal.impl.resolve.taiyuan
            public void attabal(CallableMemberDescriptor fakeOverride) {
                Intrinsics.checkNotNullParameter(fakeOverride, "fakeOverride");
                OverridingUtil.polder(fakeOverride, null);
                this.f31496attabal.add((D) fakeOverride);
            }

            @Override // p002kotlin.reflect.jvm.internal.impl.resolve.impromptu
            public void marial(CallableMemberDescriptor fromSuper, CallableMemberDescriptor fromCurrent) {
                Intrinsics.checkNotNullParameter(fromSuper, "fromSuper");
                Intrinsics.checkNotNullParameter(fromCurrent, "fromCurrent");
                if (fromCurrent instanceof kowloon) {
                    ((kowloon) fromCurrent).sakeen(graveside.f29960attabal, fromSuper);
                }
            }
        }

        public DeserializedClassMemberScope(DeserializedClassDescriptor deserializedClassDescriptor, p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront kotlinTypeRefiner) {
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
            this.f31493cutely = deserializedClassDescriptor;
            cutely cutelyVarOsteal = deserializedClassDescriptor.osteal();
            List<ProtoBuf$Function> functionList = deserializedClassDescriptor.licking().getFunctionList();
            Intrinsics.checkNotNullExpressionValue(functionList, "getFunctionList(...)");
            List<ProtoBuf$Property> propertyList = deserializedClassDescriptor.licking().getPropertyList();
            Intrinsics.checkNotNullExpressionValue(propertyList, "getPropertyList(...)");
            List<ProtoBuf$TypeAlias> typeAliasList = deserializedClassDescriptor.licking().getTypeAliasList();
            Intrinsics.checkNotNullExpressionValue(typeAliasList, "getTypeAliasList(...)");
            List<Integer> nestedClassNameList = deserializedClassDescriptor.licking().getNestedClassNameList();
            Intrinsics.checkNotNullExpressionValue(nestedClassNameList, "getNestedClassNameList(...)");
            List<Integer> list = nestedClassNameList;
            genesis.dern dernVarCompetently = deserializedClassDescriptor.osteal().competently();
            final ArrayList arrayList = new ArrayList(p002kotlin.collections.dovishness.gintrap(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.graveside.saneness(dernVarCompetently, ((Number) it.next()).intValue()));
            }
            super(cutelyVarOsteal, functionList, propertyList, typeAliasList, new Function0<List<? extends byname.marial>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p002kotlin.jvm.functions.Function0
                public final List<? extends byname.marial> invoke() {
                    return arrayList;
                }
            });
            this.f31492competently = kotlinTypeRefiner;
            this.f31494impromptu = arytenoidectomy().impromptu().dern(new Function0<Collection<? extends apical>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$allDescriptors$1
                {
                    super(0);
                }

                @Override // p002kotlin.jvm.functions.Function0
                public final Collection<? extends apical> invoke() {
                    return this.this$0.cutely(p002kotlin.reflect.jvm.internal.impl.resolve.scopes.wireman.f31402kowloon, MemberScope.f31364attabal.attabal(), NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
                }
            });
            this.f31495taiyuan = arytenoidectomy().impromptu().dern(new Function0<Collection<? extends oilcan>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$refinedSupertypes$1
                {
                    super(0);
                }

                @Override // p002kotlin.jvm.functions.Function0
                public final Collection<? extends oilcan> invoke() {
                    return this.this$0.f31492competently.competently(this.this$0.stratoscope());
                }
            });
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public Set<byname.marial> adultoid() {
            List<oilcan> listCutely = stratoscope().f31488stratoscope.cutely();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = listCutely.iterator();
            while (it.hasNext()) {
                cord.stratoscope(linkedHashSet, ((oilcan) it.next()).formularize().wireman());
            }
            return linkedHashSet;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public void apical(byname.marial name, List<hydrovane> functions) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(functions, "functions");
            ArrayList arrayList = new ArrayList();
            Iterator<oilcan> it = this.f31495taiyuan.invoke().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().formularize().saneness(name, NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            functions.addAll(arytenoidectomy().dern().dern().marial(name, this.f31493cutely));
            cuirassed(name, arrayList, functions);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.impromptu
        public Collection<apical> competently(p002kotlin.reflect.jvm.internal.impl.resolve.scopes.wireman kindFilter, Function1<? super byname.marial, Boolean> nameFilter) {
            Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
            Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
            return this.f31494impromptu.invoke();
        }

        public final <D extends CallableMemberDescriptor> void cuirassed(byname.marial marialVar, Collection<? extends D> collection2, List<D> list) {
            arytenoidectomy().dern().triweekly().attabal().dovishness(marialVar, collection2, new ArrayList(list), stratoscope(), new attabal(list));
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public Collection<saran> dern(byname.marial name, discontentedly.saneness location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            trm(name, location);
            return super.dern(name, location);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public void formularize(byname.marial name, List<saran> descriptors) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(descriptors, "descriptors");
            ArrayList arrayList = new ArrayList();
            Iterator<oilcan> it = this.f31495taiyuan.invoke().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().formularize().dern(name, NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            cuirassed(name, arrayList, descriptors);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public Set<byname.marial> graveside() {
            List<oilcan> listCutely = stratoscope().f31488stratoscope.cutely();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = listCutely.iterator();
            while (it.hasNext()) {
                cord.stratoscope(linkedHashSet, ((oilcan) it.next()).formularize().attabal());
            }
            linkedHashSet.addAll(arytenoidectomy().dern().dern().wireman(this.f31493cutely));
            return linkedHashSet;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public saneness impassible(byname.marial name) {
            Intrinsics.checkNotNullParameter(name, "name");
            saneness sanenessVarWireman = this.f31493cutely.f31475dovishness.wireman(name);
            Intrinsics.checkNotNullExpressionValue(sanenessVarWireman, "createNestedClassId(...)");
            return sanenessVarWireman;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.impromptu
        public p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront marial(byname.marial name, discontentedly.saneness location) {
            wireman wiremanVarBeachfront;
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            trm(name, location);
            EnumEntryClassDescriptors enumEntryClassDescriptors = stratoscope().f31481oilcan;
            return (enumEntryClassDescriptors == null || (wiremanVarBeachfront = enumEntryClassDescriptors.beachfront(name)) == null) ? super.marial(name, location) : wiremanVarBeachfront;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public Set<byname.marial> molybdenite() {
            List<oilcan> listCutely = stratoscope().f31488stratoscope.cutely();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = listCutely.iterator();
            while (it.hasNext()) {
                Set<byname.marial> setBeachfront = ((oilcan) it.next()).formularize().beachfront();
                if (setBeachfront == null) {
                    return null;
                }
                cord.stratoscope(linkedHashSet, setBeachfront);
            }
            return linkedHashSet;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public boolean rotuma(hydrovane function) {
            Intrinsics.checkNotNullParameter(function, "function");
            return arytenoidectomy().dern().graveside().attabal(this.f31493cutely, function);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public Collection<hydrovane> saneness(byname.marial name, discontentedly.saneness location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            trm(name, location);
            return super.saneness(name, location);
        }

        public final DeserializedClassDescriptor stratoscope() {
            return this.f31493cutely;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public void taiyuan(Collection<apical> result, Function1<? super byname.marial, Boolean> nameFilter) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
            EnumEntryClassDescriptors enumEntryClassDescriptors = stratoscope().f31481oilcan;
            List listWireman = enumEntryClassDescriptors != null ? enumEntryClassDescriptors.wireman() : null;
            if (listWireman == null) {
                listWireman = adultoid.formularize();
            }
            result.addAll(listWireman);
        }

        public void trm(byname.marial name, discontentedly.saneness location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            needler.attabal.attabal(arytenoidectomy().dern().arytenoidectomy(), location, stratoscope(), name);
        }
    }

    /* JADX INFO: compiled from: DeserializedClassDescriptor.kt */
    public final class DeserializedClassTypeConstructor extends p002kotlin.reflect.jvm.internal.impl.types.saneness {

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final impromptu<List<clubfoot>> f31498wireman;

        public DeserializedClassTypeConstructor() {
            super(DeserializedClassDescriptor.this.osteal().impromptu());
            this.f31498wireman = DeserializedClassDescriptor.this.osteal().impromptu().dern(new Function0<List<? extends clubfoot>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassTypeConstructor$parameters$1
                {
                    super(0);
                }

                @Override // p002kotlin.jvm.functions.Function0
                public final List<? extends clubfoot> invoke() {
                    return TypeParameterUtilsKt.wireman(deserializedClassDescriptor);
                }
            });
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
        public List<clubfoot> getParameters() {
            return this.f31498wireman.invoke();
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public Collection<oilcan> impassible() {
            String strDern;
            byname.dern dernVarSaneness;
            List<ProtoBuf$Type> listKowloon = genesis.beachfront.kowloon(DeserializedClassDescriptor.this.licking(), DeserializedClassDescriptor.this.osteal().cutely());
            DeserializedClassDescriptor deserializedClassDescriptor = DeserializedClassDescriptor.this;
            ArrayList arrayList = new ArrayList(p002kotlin.collections.dovishness.gintrap(listKowloon, 10));
            Iterator<T> it = listKowloon.iterator();
            while (it.hasNext()) {
                arrayList.add(deserializedClassDescriptor.osteal().taiyuan().monoploid((ProtoBuf$Type) it.next()));
            }
            List listUnconsolidated = CollectionsKt.unconsolidated(arrayList, DeserializedClassDescriptor.this.osteal().dern().dern().dern(DeserializedClassDescriptor.this));
            ArrayList<NotFoundClasses.saneness> arrayList2 = new ArrayList();
            Iterator it2 = listUnconsolidated.iterator();
            while (it2.hasNext()) {
                p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarWireman = ((oilcan) it2.next()).setterwort().wireman();
                NotFoundClasses.saneness sanenessVar = beachfrontVarWireman instanceof NotFoundClasses.saneness ? (NotFoundClasses.saneness) beachfrontVarWireman : null;
                if (sanenessVar != null) {
                    arrayList2.add(sanenessVar);
                }
            }
            if (!arrayList2.isEmpty()) {
                triweekly triweeklyVarCutely = DeserializedClassDescriptor.this.osteal().dern().cutely();
                DeserializedClassDescriptor deserializedClassDescriptor2 = DeserializedClassDescriptor.this;
                ArrayList arrayList3 = new ArrayList(p002kotlin.collections.dovishness.gintrap(arrayList2, 10));
                for (NotFoundClasses.saneness sanenessVar2 : arrayList2) {
                    saneness sanenessVarApical = DescriptorUtilsKt.apical(sanenessVar2);
                    if (sanenessVarApical == null || (dernVarSaneness = sanenessVarApical.saneness()) == null || (strDern = dernVarSaneness.saneness()) == null) {
                        strDern = sanenessVar2.getName().dern();
                    }
                    arrayList3.add(strDern);
                }
                triweeklyVarCutely.saneness(deserializedClassDescriptor2, arrayList3);
            }
            return CollectionsKt.molet(listUnconsolidated);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
        public boolean marial() {
            return true;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public splinterproof monoploid() {
            return splinterproof.attabal.f30272attabal;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.apical, p002kotlin.reflect.jvm.internal.impl.types.permissivist
        /* JADX INFO: renamed from: rotuma, reason: merged with bridge method [inline-methods] */
        public DeserializedClassDescriptor wireman() {
            return DeserializedClassDescriptor.this;
        }

        public String toString() {
            String string = DeserializedClassDescriptor.this.getName().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
    }

    /* JADX INFO: compiled from: DeserializedClassDescriptor.kt */
    public final class EnumEntryClassDescriptors {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Map<byname.marial, ProtoBuf$EnumEntry> f31499attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final impromptu<Set<byname.marial>> f31500dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final competently<byname.marial, wireman> f31501saneness;

        public EnumEntryClassDescriptors() {
            List<ProtoBuf$EnumEntry> enumEntryList = DeserializedClassDescriptor.this.licking().getEnumEntryList();
            Intrinsics.checkNotNullExpressionValue(enumEntryList, "getEnumEntryList(...)");
            List<ProtoBuf$EnumEntry> list = enumEntryList;
            LinkedHashMap linkedHashMap = new LinkedHashMap(p002kotlin.ranges.wireman.wireman(polder.marial(p002kotlin.collections.dovishness.gintrap(list, 10)), 16));
            for (Object obj : list) {
                linkedHashMap.put(p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.graveside.saneness(DeserializedClassDescriptor.this.osteal().competently(), ((ProtoBuf$EnumEntry) obj).getName()), obj);
            }
            this.f31499attabal = linkedHashMap;
            formularize formularizeVarImpromptu = DeserializedClassDescriptor.this.osteal().impromptu();
            final DeserializedClassDescriptor deserializedClassDescriptor = DeserializedClassDescriptor.this;
            this.f31501saneness = formularizeVarImpromptu.competently(new Function1<byname.marial, wireman>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$EnumEntryClassDescriptors$enumEntryByName$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p002kotlin.jvm.functions.Function1
                public final wireman invoke(byname.marial name) {
                    Intrinsics.checkNotNullParameter(name, "name");
                    final ProtoBuf$EnumEntry protoBuf$EnumEntry = (ProtoBuf$EnumEntry) this.this$0.f31499attabal.get(name);
                    if (protoBuf$EnumEntry == null) {
                        return null;
                    }
                    final DeserializedClassDescriptor deserializedClassDescriptor2 = deserializedClassDescriptor;
                    return impassible.vesuvio(deserializedClassDescriptor2.osteal().impromptu(), deserializedClassDescriptor2, name, this.this$0.f31500dern, new attabal(deserializedClassDescriptor2.osteal().impromptu(), new Function0<List<? extends p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$EnumEntryClassDescriptors$enumEntryByName$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p002kotlin.jvm.functions.Function0
                        public final List<? extends p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern> invoke() {
                            return CollectionsKt.molet(deserializedClassDescriptor2.osteal().dern().wireman().wireman(deserializedClassDescriptor2.pruinose(), protoBuf$EnumEntry));
                        }
                    }), walach.f30274attabal);
                }
            });
            this.f31500dern = DeserializedClassDescriptor.this.osteal().impromptu().dern(new Function0<Set<? extends byname.marial>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$EnumEntryClassDescriptors$enumMemberNames$1
                {
                    super(0);
                }

                @Override // p002kotlin.jvm.functions.Function0
                public final Set<? extends byname.marial> invoke() {
                    return this.this$0.marial();
                }
            });
        }

        public final wireman beachfront(byname.marial name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return this.f31501saneness.invoke(name);
        }

        public final Set<byname.marial> marial() {
            HashSet hashSet = new HashSet();
            Iterator<oilcan> it = DeserializedClassDescriptor.this.impromptu().cutely().iterator();
            while (it.hasNext()) {
                for (apical apicalVar : kotlin.reflect.jvm.internal.impl.resolve.scopes.impromptu.attabal.attabal(it.next().formularize(), null, null, 3, null)) {
                    if ((apicalVar instanceof hydrovane) || (apicalVar instanceof saran)) {
                        hashSet.add(apicalVar.getName());
                    }
                }
            }
            List<ProtoBuf$Function> functionList = DeserializedClassDescriptor.this.licking().getFunctionList();
            Intrinsics.checkNotNullExpressionValue(functionList, "getFunctionList(...)");
            DeserializedClassDescriptor deserializedClassDescriptor = DeserializedClassDescriptor.this;
            Iterator<T> it2 = functionList.iterator();
            while (it2.hasNext()) {
                hashSet.add(p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.graveside.saneness(deserializedClassDescriptor.osteal().competently(), ((ProtoBuf$Function) it2.next()).getName()));
            }
            List<ProtoBuf$Property> propertyList = DeserializedClassDescriptor.this.licking().getPropertyList();
            Intrinsics.checkNotNullExpressionValue(propertyList, "getPropertyList(...)");
            DeserializedClassDescriptor deserializedClassDescriptor2 = DeserializedClassDescriptor.this;
            Iterator<T> it3 = propertyList.iterator();
            while (it3.hasNext()) {
                hashSet.add(p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.graveside.saneness(deserializedClassDescriptor2.osteal().competently(), ((ProtoBuf$Property) it3.next()).getName()));
            }
            return starveling.apical(hashSet, hashSet);
        }

        public final Collection<wireman> wireman() {
            Set<byname.marial> setKeySet = this.f31499attabal.keySet();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                wireman wiremanVarBeachfront = beachfront((byname.marial) it.next());
                if (wiremanVarBeachfront != null) {
                    arrayList.add(wiremanVarBeachfront);
                }
            }
            return arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor(cutely outerContext, ProtoBuf$Class classProto, genesis.dern nameResolver, genesis.attabal metadataVersion, walach sourceElement) {
        beachfront staticScopeForKotlinEnum;
        super(outerContext.impromptu(), p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.graveside.attabal(nameResolver, classProto.getFqName()).cutely());
        Intrinsics.checkNotNullParameter(outerContext, "outerContext");
        Intrinsics.checkNotNullParameter(classProto, "classProto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(sourceElement, "sourceElement");
        this.f31480molybdenite = classProto;
        this.f31477graveside = metadataVersion;
        this.f31472adultoid = sourceElement;
        this.f31475dovishness = p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.graveside.attabal(nameResolver, classProto.getFqName());
        gintrap gintrapVar = gintrap.f31577attabal;
        this.f31476gintrap = gintrapVar.saneness(genesis.saneness.f26692marial.wireman(classProto.getFlags()));
        this.f31485rotuma = rotuma.attabal(gintrapVar, genesis.saneness.f26712wireman.wireman(classProto.getFlags()));
        ClassKind classKindAttabal = gintrapVar.attabal(genesis.saneness.f26676beachfront.wireman(classProto.getFlags()));
        this.f31483preprohormone = classKindAttabal;
        List<ProtoBuf$TypeParameter> typeParameterList = classProto.getTypeParameterList();
        Intrinsics.checkNotNullExpressionValue(typeParameterList, "getTypeParameterList(...)");
        ProtoBuf$TypeTable typeTable = classProto.getTypeTable();
        Intrinsics.checkNotNullExpressionValue(typeTable, "getTypeTable(...)");
        genesis.competently competentlyVar = new genesis.competently(typeTable);
        genesis.impromptu.attabal attabalVar = genesis.impromptu.f26670saneness;
        ProtoBuf$VersionRequirementTable versionRequirementTable = classProto.getVersionRequirementTable();
        Intrinsics.checkNotNullExpressionValue(versionRequirementTable, "getVersionRequirementTable(...)");
        cutely cutelyVarAttabal = outerContext.attabal(this, typeParameterList, nameResolver, competentlyVar, attabalVar.attabal(versionRequirementTable), metadataVersion);
        this.f31473cord = cutelyVarAttabal;
        ClassKind classKind = ClassKind.ENUM_CLASS;
        if (classKindAttabal == classKind) {
            Boolean boolWireman = genesis.saneness.f26688impassible.wireman(classProto.getFlags());
            Intrinsics.checkNotNullExpressionValue(boolWireman, "get(...)");
            staticScopeForKotlinEnum = new StaticScopeForKotlinEnum(cutelyVarAttabal.impromptu(), this, boolWireman.booleanValue() || Intrinsics.wireman(cutelyVarAttabal.dern().taiyuan().attabal(), Boolean.TRUE));
        } else {
            staticScopeForKotlinEnum = MemberScope.attabal.f31367saneness;
        }
        this.f31474cuirassed = staticScopeForKotlinEnum;
        this.f31488stratoscope = new DeserializedClassTypeConstructor();
        this.f31490trm = ScopesHolderForClass.f29908marial.attabal(this, cutelyVarAttabal.impromptu(), cutelyVarAttabal.dern().triweekly().dern(), new DeserializedClassDescriptor$memberScopeHolder$1(this));
        this.f31481oilcan = classKindAttabal == classKind ? new EnumEntryClassDescriptors() : null;
        apical apicalVarMarial = outerContext.marial();
        this.f31491yemenite = apicalVarMarial;
        this.f31486sealless = cutelyVarAttabal.impromptu().marial(new Function0<dern>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$primaryConstructor$1
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final dern invoke() {
                return this.this$0.immediately();
            }
        });
        this.f31478kattegat = cutelyVarAttabal.impromptu().dern(new Function0<Collection<? extends dern>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$constructors$1
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final Collection<? extends dern> invoke() {
                return this.this$0.sakeen();
            }
        });
        this.f31489supplicat = cutelyVarAttabal.impromptu().marial(new Function0<wireman>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$companionObjectDescriptor$1
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final wireman invoke() {
                return this.this$0.molet();
            }
        });
        this.f31484restrictive = cutelyVarAttabal.impromptu().dern(new Function0<Collection<? extends wireman>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$sealedSubclasses$1
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final Collection<? extends wireman> invoke() {
                return this.this$0.tectonization();
            }
        });
        this.f31479merc = cutelyVarAttabal.impromptu().marial(new Function0<dent<merc>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$valueClassRepresentation$1
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final dent<merc> invoke() {
                return this.this$0.prefect();
            }
        });
        genesis.dern dernVarCompetently = cutelyVarAttabal.competently();
        genesis.competently competentlyVarCutely = cutelyVarAttabal.cutely();
        DeserializedClassDescriptor deserializedClassDescriptor = apicalVarMarial instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) apicalVarMarial : null;
        this.f31482polder = new dovishness.attabal(classProto, dernVarCompetently, competentlyVarCutely, sourceElement, deserializedClassDescriptor != null ? deserializedClassDescriptor.f31482polder : null);
        this.f31487seminary = !genesis.saneness.f26682dern.wireman(classProto.getFlags()).booleanValue() ? marial.f29950impromptu.saneness() : new cutely(cutelyVarAttabal.impromptu(), new Function0<List<? extends p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$annotations$1
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final List<? extends p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern> invoke() {
                return CollectionsKt.molet(this.this$0.osteal().dern().wireman().saneness(this.this$0.pruinose()));
            }
        });
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public Collection<wireman> adultoid() {
        return this.f31484restrictive.invoke();
    }

    public final List<dern> basify() {
        List<ProtoBuf$Constructor> constructorList = this.f31480molybdenite.getConstructorList();
        Intrinsics.checkNotNullExpressionValue(constructorList, "getConstructorList(...)");
        ArrayList<ProtoBuf$Constructor> arrayList = new ArrayList();
        for (Object obj : constructorList) {
            Boolean boolWireman = genesis.saneness.f26710triweekly.wireman(((ProtoBuf$Constructor) obj).getFlags());
            Intrinsics.checkNotNullExpressionValue(boolWireman, "get(...)");
            if (boolWireman.booleanValue()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(p002kotlin.collections.dovishness.gintrap(arrayList, 10));
        for (ProtoBuf$Constructor protoBuf$Constructor : arrayList) {
            MemberDeserializer memberDeserializerBeachfront = this.f31473cord.beachfront();
            Intrinsics.beachfront(protoBuf$Constructor);
            arrayList2.add(memberDeserializerBeachfront.taiyuan(protoBuf$Constructor, false));
        }
        return arrayList2;
    }

    public final boolean cig(byname.marial name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return microchemistry().monoploid().contains(name);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.cord
    public boolean coffeecake() {
        Boolean boolWireman = genesis.saneness.f26681cutely.wireman(this.f31480molybdenite.getFlags());
        Intrinsics.checkNotNullExpressionValue(boolWireman, "get(...)");
        return boolWireman.booleanValue();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.triweekly
    public walach competently() {
        return this.f31472adultoid;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public dern cord() {
        return this.f31486sealless.invoke();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    /* JADX INFO: renamed from: cosy, reason: merged with bridge method [inline-methods] */
    public beachfront lerp() {
        return this.f31474cuirassed;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public dent<merc> creditor() {
        return this.f31479merc.invoke();
    }

    public final genesis.attabal fastrack() {
        return this.f31477graveside;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.attabal
    public marial getAnnotations() {
        return this.f31487seminary;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public ClassKind getKind() {
        return this.f31483preprohormone;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman, p002kotlin.reflect.jvm.internal.impl.descriptors.kowloon, p002kotlin.reflect.jvm.internal.impl.descriptors.cord
    public molybdenite getVisibility() {
        return this.f31485rotuma;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.competently
    public boolean gintrap() {
        Boolean boolWireman = genesis.saneness.f26677competently.wireman(this.f31480molybdenite.getFlags());
        Intrinsics.checkNotNullExpressionValue(boolWireman, "get(...)");
        return boolWireman.booleanValue();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public boolean herdbook() {
        Boolean boolWireman = genesis.saneness.f26689impromptu.wireman(this.f31480molybdenite.getFlags());
        Intrinsics.checkNotNullExpressionValue(boolWireman, "get(...)");
        return boolWireman.booleanValue();
    }

    public final dern immediately() {
        Object next;
        if (this.f31483preprohormone.isSingleton()) {
            p002kotlin.reflect.jvm.internal.impl.descriptors.impl.marial marialVarFormularize = p002kotlin.reflect.jvm.internal.impl.resolve.wireman.formularize(this, walach.f30274attabal);
            marialVarFormularize.cig(impassible());
            return marialVarFormularize;
        }
        List<ProtoBuf$Constructor> constructorList = this.f31480molybdenite.getConstructorList();
        Intrinsics.checkNotNullExpressionValue(constructorList, "getConstructorList(...)");
        Iterator<T> it = constructorList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (genesis.saneness.f26710triweekly.wireman(((ProtoBuf$Constructor) next).getFlags()).booleanValue());
        ProtoBuf$Constructor protoBuf$Constructor = (ProtoBuf$Constructor) next;
        if (protoBuf$Constructor != null) {
            return this.f31473cord.beachfront().taiyuan(protoBuf$Constructor, true);
        }
        return null;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront
    public permissivist impromptu() {
        return this.f31488stratoscope;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.cord
    public boolean isExternal() {
        Boolean boolWireman = genesis.saneness.f26709taiyuan.wireman(this.f31480molybdenite.getFlags());
        Intrinsics.checkNotNullExpressionValue(boolWireman, "get(...)");
        return boolWireman.booleanValue();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public boolean isInline() {
        Boolean boolWireman = genesis.saneness.f26673apical.wireman(this.f31480molybdenite.getFlags());
        Intrinsics.checkNotNullExpressionValue(boolWireman, "get(...)");
        return boolWireman.booleanValue() && this.f31477graveside.marial(1, 4, 1);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.polloi
    public MemberScope itchy(p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.f31490trm.dern(kotlinTypeRefiner);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman, p002kotlin.reflect.jvm.internal.impl.descriptors.cord
    public Modality kowloon() {
        return this.f31476gintrap;
    }

    public final ProtoBuf$Class licking() {
        return this.f31480molybdenite;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.attabal, p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public List<p002kotlin.reflect.jvm.internal.impl.descriptors.starveling> mathsort() {
        List<ProtoBuf$Type> listSaneness = genesis.beachfront.saneness(this.f31480molybdenite, this.f31473cord.cutely());
        ArrayList arrayList = new ArrayList(p002kotlin.collections.dovishness.gintrap(listSaneness, 10));
        Iterator<T> it = listSaneness.iterator();
        while (it.hasNext()) {
            arrayList.add(new trm(technofreak(), new snook.saneness(this, this.f31473cord.taiyuan().monoploid((ProtoBuf$Type) it.next()), null, null), marial.f29950impromptu.saneness()));
        }
        return arrayList;
    }

    public final DeserializedClassMemberScope microchemistry() {
        return (DeserializedClassMemberScope) this.f31490trm.dern(this.f31473cord.dern().triweekly().dern());
    }

    public final wireman molet() {
        if (!this.f31480molybdenite.hasCompanionObjectName()) {
            return null;
        }
        p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarMarial = microchemistry().marial(p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.graveside.saneness(this.f31473cord.competently(), this.f31480molybdenite.getCompanionObjectName()), NoLookupLocation.FROM_DESERIALIZATION);
        if (beachfrontVarMarial instanceof wireman) {
            return (wireman) beachfrontVarMarial;
        }
        return null;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public wireman nosophobia() {
        return this.f31489supplicat.invoke();
    }

    public final cutely osteal() {
        return this.f31473cord;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public boolean overspeculate() {
        return genesis.saneness.f26676beachfront.wireman(this.f31480molybdenite.getFlags()) == ProtoBuf$Class.Kind.COMPANION_OBJECT;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.cord
    public boolean peridotite() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public boolean permissivist() {
        Boolean boolWireman = genesis.saneness.f26684formularize.wireman(this.f31480molybdenite.getFlags());
        Intrinsics.checkNotNullExpressionValue(boolWireman, "get(...)");
        return boolWireman.booleanValue();
    }

    public final dent<merc> prefect() {
        if (!isInline() && !treadless()) {
            return null;
        }
        dent<merc> dentVarAttabal = cuirassed.attabal(this.f31480molybdenite, this.f31473cord.competently(), this.f31473cord.cutely(), new DeserializedClassDescriptor$computeValueClassRepresentation$1(this.f31473cord.taiyuan()), new DeserializedClassDescriptor$computeValueClassRepresentation$2(this));
        if (dentVarAttabal != null) {
            return dentVarAttabal;
        }
        if (this.f31477graveside.dern(1, 5, 1)) {
            return null;
        }
        dern dernVarCord = cord();
        if (dernVarCord == null) {
            throw new IllegalStateException(("Inline class has no primary constructor: " + this).toString());
        }
        List<cultivated> listBeachfront = dernVarCord.beachfront();
        Intrinsics.checkNotNullExpressionValue(listBeachfront, "getValueParameters(...)");
        byname.marial name = ((cultivated) CollectionsKt.lerp(listBeachfront)).getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        merc mercVarTarboosh = tarboosh(name);
        if (mercVarTarboosh != null) {
            return new p002kotlin.reflect.jvm.internal.impl.descriptors.gintrap(name, mercVarTarboosh);
        }
        throw new IllegalStateException(("Value class has no underlying property: " + this).toString());
    }

    public final dovishness.attabal pruinose() {
        return this.f31482polder;
    }

    public final Collection<dern> sakeen() {
        return CollectionsKt.unconsolidated(CollectionsKt.unconsolidated(basify(), adultoid.arytenoidectomy(cord())), this.f31473cord.dern().dern().saneness(this));
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman, p002kotlin.reflect.jvm.internal.impl.descriptors.formularize, p002kotlin.reflect.jvm.internal.impl.descriptors.apical
    public apical saneness() {
        return this.f31491yemenite;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public Collection<dern> taiyuan() {
        return this.f31478kattegat.invoke();
    }

    public final merc tarboosh(byname.marial marialVar) {
        Iterator<T> it = microchemistry().dern(marialVar, NoLookupLocation.FROM_DESERIALIZATION).iterator();
        boolean z = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z) {
                    break;
                }
                break;
            }
            Object next = it.next();
            if (((saran) next).polder() == null) {
                if (!z) {
                    z = true;
                    obj = next;
                }
            }
            obj = null;
            break;
        }
        saran saranVar = (saran) obj;
        return (merc) (saranVar != null ? saranVar.getType() : null);
    }

    public final Collection<wireman> tectonization() {
        if (this.f31476gintrap != Modality.SEALED) {
            return adultoid.formularize();
        }
        List<Integer> sealedSubclassFqNameList = this.f31480molybdenite.getSealedSubclassFqNameList();
        Intrinsics.beachfront(sealedSubclassFqNameList);
        if (sealedSubclassFqNameList.isEmpty()) {
            return p002kotlin.reflect.jvm.internal.impl.resolve.attabal.f31303attabal.attabal(this, false);
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : sealedSubclassFqNameList) {
            p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.impromptu impromptuVarDern = this.f31473cord.dern();
            genesis.dern dernVarCompetently = this.f31473cord.competently();
            Intrinsics.beachfront(num);
            wireman wiremanVarSaneness = impromptuVarDern.saneness(p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.graveside.attabal(dernVarCompetently, num.intValue()));
            if (wiremanVarSaneness != null) {
                arrayList.add(wiremanVarSaneness);
            }
        }
        return arrayList;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("deserialized ");
        sb.append(coffeecake() ? "expect " : "");
        sb.append("class ");
        sb.append(getName());
        return sb.toString();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
    public boolean treadless() {
        Boolean boolWireman = genesis.saneness.f26673apical.wireman(this.f31480molybdenite.getFlags());
        Intrinsics.checkNotNullExpressionValue(boolWireman, "get(...)");
        return boolWireman.booleanValue() && this.f31477graveside.dern(1, 4, 2);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman, p002kotlin.reflect.jvm.internal.impl.descriptors.competently
    public List<clubfoot> triweekly() {
        return this.f31473cord.taiyuan().cutely();
    }
}
