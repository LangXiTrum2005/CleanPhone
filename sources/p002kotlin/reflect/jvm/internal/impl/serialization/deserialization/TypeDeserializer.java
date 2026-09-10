package p002kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import byname.dern;
import byname.saneness;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.competently;
import p002kotlin.reflect.jvm.internal.impl.builtins.marial;
import p002kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.attabal;
import p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor;
import p002kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p002kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import p002kotlin.reflect.jvm.internal.impl.types.Variance;
import p002kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.overspeculate;
import p002kotlin.reflect.jvm.internal.impl.types.permissivist;
import p002kotlin.reflect.jvm.internal.impl.types.privatdozent;
import p002kotlin.reflect.jvm.internal.impl.types.saran;
import p002kotlin.reflect.jvm.internal.impl.types.splinterproof;
import p002kotlin.reflect.jvm.internal.impl.types.timberyard;
import p002kotlin.reflect.jvm.internal.impl.types.treadless;
import p002kotlin.reflect.jvm.internal.impl.types.triweekly;
import p002kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.types.yemenite;
import p002kotlin.sequences.SequencesKt___SequencesKt;
import p002kotlin.sequences.arytenoidectomy;

/* JADX INFO: compiled from: TypeDeserializer.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class TypeDeserializer {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final cutely f31435attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final Function1<Integer, beachfront> f31436beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final Map<Integer, clubfoot> f31437competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final String f31438dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final Function1<Integer, beachfront> f31439marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final TypeDeserializer f31440saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final String f31441wireman;

    public TypeDeserializer(cutely c, TypeDeserializer typeDeserializer, List<ProtoBuf$TypeParameter> typeParameterProtos, String debugName, String containerPresentableName) {
        Map<Integer, clubfoot> linkedHashMap;
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(typeParameterProtos, "typeParameterProtos");
        Intrinsics.checkNotNullParameter(debugName, "debugName");
        Intrinsics.checkNotNullParameter(containerPresentableName, "containerPresentableName");
        this.f31435attabal = c;
        this.f31440saneness = typeDeserializer;
        this.f31438dern = debugName;
        this.f31441wireman = containerPresentableName;
        this.f31439marial = c.impromptu().competently(new Function1<Integer, beachfront>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$classifierDescriptors$1
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ beachfront invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final beachfront invoke(int i) {
                return this.this$0.wireman(i);
            }
        });
        this.f31436beachfront = c.impromptu().competently(new Function1<Integer, beachfront>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$typeAliasDescriptors$1
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ beachfront invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final beachfront invoke(int i) {
                return this.this$0.beachfront(i);
            }
        });
        if (typeParameterProtos.isEmpty()) {
            linkedHashMap = seminary.taiyuan();
        } else {
            linkedHashMap = new LinkedHashMap<>();
            int i = 0;
            for (ProtoBuf$TypeParameter protoBuf$TypeParameter : typeParameterProtos) {
                linkedHashMap.put(Integer.valueOf(protoBuf$TypeParameter.getId()), new DeserializedTypeParameterDescriptor(this.f31435attabal, protoBuf$TypeParameter, i));
                i++;
            }
        }
        this.f31437competently = linkedHashMap;
    }

    public static final wireman graveside(final TypeDeserializer typeDeserializer, ProtoBuf$Type protoBuf$Type, int i) {
        saneness sanenessVarAttabal = graveside.attabal(typeDeserializer.f31435attabal.competently(), i);
        List<Integer> listWalach = SequencesKt___SequencesKt.walach(SequencesKt___SequencesKt.restrictive(arytenoidectomy.triweekly(protoBuf$Type, new Function1<ProtoBuf$Type, ProtoBuf$Type>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$1
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public final ProtoBuf$Type invoke(ProtoBuf$Type it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return genesis.beachfront.cutely(it, this.this$0.f31435attabal.cutely());
            }
        }), new Function1<ProtoBuf$Type, Integer>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$2
            @Override // p002kotlin.jvm.functions.Function1
            public final Integer invoke(ProtoBuf$Type it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Integer.valueOf(it.getArgumentCount());
            }
        }));
        int iGintrap = SequencesKt___SequencesKt.gintrap(arytenoidectomy.triweekly(sanenessVarAttabal, TypeDeserializer$typeConstructor$notFoundClass$classNestingLevel$1.INSTANCE));
        while (listWalach.size() < iGintrap) {
            listWalach.add(0);
        }
        return typeDeserializer.f31435attabal.dern().polloi().wireman(sanenessVarAttabal, listWalach);
    }

    public static final List<ProtoBuf$Type.Argument> impassible(ProtoBuf$Type protoBuf$Type, TypeDeserializer typeDeserializer) {
        List<ProtoBuf$Type.Argument> argumentList = protoBuf$Type.getArgumentList();
        Intrinsics.checkNotNullExpressionValue(argumentList, "getArgumentList(...)");
        List<ProtoBuf$Type.Argument> list = argumentList;
        ProtoBuf$Type protoBuf$TypeCutely = genesis.beachfront.cutely(protoBuf$Type, typeDeserializer.f31435attabal.cutely());
        List<ProtoBuf$Type.Argument> listImpassible = protoBuf$TypeCutely != null ? impassible(protoBuf$TypeCutely, typeDeserializer) : null;
        if (listImpassible == null) {
            listImpassible = adultoid.formularize();
        }
        return CollectionsKt.unconsolidated(list, listImpassible);
    }

    public static /* synthetic */ merc triweekly(TypeDeserializer typeDeserializer, ProtoBuf$Type protoBuf$Type, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return typeDeserializer.formularize(protoBuf$Type, z);
    }

    public final clubfoot apical(int i) {
        clubfoot clubfootVar = this.f31437competently.get(Integer.valueOf(i));
        if (clubfootVar != null) {
            return clubfootVar;
        }
        TypeDeserializer typeDeserializer = this.f31440saneness;
        if (typeDeserializer != null) {
            return typeDeserializer.apical(i);
        }
        return null;
    }

    public final merc arytenoidectomy(oilcan oilcanVar) {
        oilcan type;
        timberyard timberyardVar = (timberyard) CollectionsKt.picketboat(marial.impassible(oilcanVar));
        if (timberyardVar == null || (type = timberyardVar.getType()) == null) {
            return null;
        }
        beachfront beachfrontVarWireman = type.setterwort().wireman();
        dern dernVarFormularize = beachfrontVarWireman != null ? DescriptorUtilsKt.formularize(beachfrontVarWireman) : null;
        if (type.dhss().size() != 1 || (!Intrinsics.wireman(dernVarFormularize, competently.f29673graveside) && !Intrinsics.wireman(dernVarFormularize, cord.f31459attabal))) {
            return (merc) oilcanVar;
        }
        oilcan type2 = ((timberyard) CollectionsKt.herdbook(type.dhss())).getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        apical apicalVarMarial = this.f31435attabal.marial();
        attabal attabalVar = apicalVarMarial instanceof attabal ? (attabal) apicalVarMarial : null;
        return Intrinsics.wireman(attabalVar != null ? DescriptorUtilsKt.impromptu(attabalVar) : null, preprohormone.f31615attabal) ? competently(oilcanVar, type2) : competently(oilcanVar, type2);
    }

    public final beachfront beachfront(int i) {
        saneness sanenessVarAttabal = graveside.attabal(this.f31435attabal.competently(), i);
        if (sanenessVarAttabal.apical()) {
            return null;
        }
        return FindClassInModuleKt.wireman(this.f31435attabal.dern().monoploid(), sanenessVarAttabal);
    }

    public final merc competently(oilcan oilcanVar, oilcan oilcanVar2) {
        p002kotlin.reflect.jvm.internal.impl.builtins.beachfront beachfrontVarTaiyuan = TypeUtilsKt.taiyuan(oilcanVar);
        p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial annotations = oilcanVar.getAnnotations();
        oilcan oilcanVarApical = marial.apical(oilcanVar);
        List<oilcan> listMarial = marial.marial(oilcanVar);
        List listTimberyard = CollectionsKt.timberyard(marial.impassible(oilcanVar), 1);
        ArrayList arrayList = new ArrayList(dovishness.gintrap(listTimberyard, 10));
        Iterator it = listTimberyard.iterator();
        while (it.hasNext()) {
            arrayList.add(((timberyard) it.next()).getType());
        }
        return marial.saneness(beachfrontVarTaiyuan, annotations, oilcanVarApical, listMarial, arrayList, null, oilcanVar2, true).lampshade(oilcanVar.mastfed());
    }

    public final List<clubfoot> cutely() {
        return CollectionsKt.molet(this.f31437competently.values());
    }

    public final merc formularize(final ProtoBuf$Type proto, boolean z) {
        merc mercVarDern;
        merc mercVarCutely;
        Intrinsics.checkNotNullParameter(proto, "proto");
        merc mercVarMarial = proto.hasClassName() ? marial(proto.getClassName()) : proto.hasTypeAliasName() ? marial(proto.getTypeAliasName()) : null;
        if (mercVarMarial != null) {
            return mercVarMarial;
        }
        permissivist permissivistVarMolybdenite = molybdenite(proto);
        if (prescient.competently.impassible(permissivistVarMolybdenite.wireman())) {
            return prescient.competently.f35667attabal.dern(ErrorTypeKind.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, permissivistVarMolybdenite, permissivistVarMolybdenite.toString());
        }
        p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.attabal attabalVar = new p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.attabal(this.f31435attabal.impromptu(), new Function0<List<? extends p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$simpleType$annotations$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final List<? extends p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern> invoke() {
                return this.this$0.f31435attabal.dern().wireman().apical(proto, this.this$0.f31435attabal.competently());
            }
        });
        overspeculate overspeculateVarKowloon = kowloon(this.f31435attabal.dern().dovishness(), attabalVar, permissivistVarMolybdenite, this.f31435attabal.marial());
        List<ProtoBuf$Type.Argument> listImpassible = impassible(proto, this);
        ArrayList arrayList = new ArrayList(dovishness.gintrap(listImpassible, 10));
        int i = 0;
        for (Object obj : listImpassible) {
            int i2 = i + 1;
            if (i < 0) {
                adultoid.dovishness();
            }
            List<clubfoot> parameters = permissivistVarMolybdenite.getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
            arrayList.add(polloi((clubfoot) CollectionsKt.lotta(parameters, i), (ProtoBuf$Type.Argument) obj));
            i = i2;
        }
        List<? extends timberyard> listMolet = CollectionsKt.molet(arrayList);
        beachfront beachfrontVarWireman = permissivistVarMolybdenite.wireman();
        if (z && (beachfrontVarWireman instanceof p002kotlin.reflect.jvm.internal.impl.descriptors.overspeculate)) {
            merc mercVarSaneness = KotlinTypeFactory.saneness((p002kotlin.reflect.jvm.internal.impl.descriptors.overspeculate) beachfrontVarWireman, listMolet);
            mercVarDern = mercVarSaneness.lampshade(yemenite.saneness(mercVarSaneness) || proto.getNullable()).deadwork(kowloon(this.f31435attabal.dern().dovishness(), p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial.f29950impromptu.attabal(CollectionsKt.julian(attabalVar, mercVarSaneness.getAnnotations())), permissivistVarMolybdenite, this.f31435attabal.marial()));
        } else {
            Boolean boolWireman = genesis.saneness.f26675attabal.wireman(proto.getFlags());
            Intrinsics.checkNotNullExpressionValue(boolWireman, "get(...)");
            if (boolWireman.booleanValue()) {
                mercVarDern = impromptu(overspeculateVarKowloon, permissivistVarMolybdenite, listMolet, proto.getNullable());
            } else {
                merc mercVarFormularize = KotlinTypeFactory.formularize(overspeculateVarKowloon, permissivistVarMolybdenite, listMolet, proto.getNullable(), null, 16, null);
                Boolean boolWireman2 = genesis.saneness.f26703saneness.wireman(proto.getFlags());
                Intrinsics.checkNotNullExpressionValue(boolWireman2, "get(...)");
                if (boolWireman2.booleanValue()) {
                    mercVarDern = triweekly.attabal.dern(triweekly.f31815polloi, mercVarFormularize, true, false, 4, null);
                    if (mercVarDern == null) {
                        throw new IllegalStateException(("null DefinitelyNotNullType for '" + mercVarFormularize + '\'').toString());
                    }
                } else {
                    mercVarDern = mercVarFormularize;
                }
            }
        }
        ProtoBuf$Type protoBuf$TypeAttabal = genesis.beachfront.attabal(proto, this.f31435attabal.cutely());
        return (protoBuf$TypeAttabal == null || (mercVarCutely = saran.cutely(mercVarDern, formularize(protoBuf$TypeAttabal, false))) == null) ? mercVarDern : mercVarCutely;
    }

    public final merc impromptu(overspeculate overspeculateVar, permissivist permissivistVar, List<? extends timberyard> list, boolean z) {
        List<? extends timberyard> list2;
        merc mercVarTaiyuan;
        int size;
        int size2 = permissivistVar.getParameters().size() - list.size();
        if (size2 != 0) {
            mercVarTaiyuan = null;
            if (size2 == 1 && (size = list.size() - 1) >= 0) {
                permissivist permissivistVarImpromptu = permissivistVar.apical().clubfoot(size).impromptu();
                Intrinsics.checkNotNullExpressionValue(permissivistVarImpromptu, "getTypeConstructor(...)");
                list2 = list;
                mercVarTaiyuan = KotlinTypeFactory.formularize(overspeculateVar, permissivistVarImpromptu, list2, z, null, 16, null);
            } else {
                list2 = list;
            }
        } else {
            list2 = list;
            mercVarTaiyuan = taiyuan(overspeculateVar, permissivistVar, list2, z);
        }
        return mercVarTaiyuan == null ? prescient.competently.f35667attabal.beachfront(ErrorTypeKind.INCONSISTENT_SUSPEND_FUNCTION, list2, permissivistVar, new String[0]) : mercVarTaiyuan;
    }

    public final overspeculate kowloon(List<? extends splinterproof> list, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial marialVar, permissivist permissivistVar, apical apicalVar) {
        List<? extends splinterproof> list2 = list;
        ArrayList arrayList = new ArrayList(dovishness.gintrap(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((splinterproof) it.next()).attabal(marialVar, permissivistVar, apicalVar));
        }
        return overspeculate.f31797arytenoidectomy.impromptu(dovishness.preprohormone(arrayList));
    }

    public final merc marial(int i) {
        if (graveside.attabal(this.f31435attabal.competently(), i).apical()) {
            return this.f31435attabal.dern().kowloon().attabal();
        }
        return null;
    }

    public final permissivist molybdenite(ProtoBuf$Type protoBuf$Type) {
        beachfront beachfrontVarInvoke;
        Object next;
        if (protoBuf$Type.hasClassName()) {
            beachfrontVarInvoke = this.f31439marial.invoke(Integer.valueOf(protoBuf$Type.getClassName()));
            if (beachfrontVarInvoke == null) {
                beachfrontVarInvoke = graveside(this, protoBuf$Type, protoBuf$Type.getClassName());
            }
        } else if (protoBuf$Type.hasTypeParameter()) {
            beachfrontVarInvoke = apical(protoBuf$Type.getTypeParameter());
            if (beachfrontVarInvoke == null) {
                return prescient.competently.f35667attabal.marial(ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, String.valueOf(protoBuf$Type.getTypeParameter()), this.f31441wireman);
            }
        } else if (protoBuf$Type.hasTypeParameterName()) {
            String string = this.f31435attabal.competently().getString(protoBuf$Type.getTypeParameterName());
            Iterator<T> it = cutely().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.wireman(((clubfoot) next).getName().dern(), string));
            beachfrontVarInvoke = (clubfoot) next;
            if (beachfrontVarInvoke == null) {
                return prescient.competently.f35667attabal.marial(ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, string, this.f31435attabal.marial().toString());
            }
        } else {
            if (!protoBuf$Type.hasTypeAliasName()) {
                return prescient.competently.f35667attabal.marial(ErrorTypeKind.UNKNOWN_TYPE, new String[0]);
            }
            beachfrontVarInvoke = this.f31436beachfront.invoke(Integer.valueOf(protoBuf$Type.getTypeAliasName()));
            if (beachfrontVarInvoke == null) {
                beachfrontVarInvoke = graveside(this, protoBuf$Type, protoBuf$Type.getTypeAliasName());
            }
        }
        permissivist permissivistVarImpromptu = beachfrontVarInvoke.impromptu();
        Intrinsics.checkNotNullExpressionValue(permissivistVarImpromptu, "getTypeConstructor(...)");
        return permissivistVarImpromptu;
    }

    public final oilcan monoploid(ProtoBuf$Type proto) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        if (!proto.hasFlexibleTypeCapabilitiesId()) {
            return formularize(proto, true);
        }
        String string = this.f31435attabal.competently().getString(proto.getFlexibleTypeCapabilitiesId());
        merc mercVarTriweekly = triweekly(this, proto, false, 2, null);
        ProtoBuf$Type protoBuf$TypeBeachfront = genesis.beachfront.beachfront(proto, this.f31435attabal.cutely());
        Intrinsics.beachfront(protoBuf$TypeBeachfront);
        return this.f31435attabal.dern().impassible().attabal(proto, string, mercVarTriweekly, triweekly(this, protoBuf$TypeBeachfront, false, 2, null));
    }

    public final timberyard polloi(clubfoot clubfootVar, ProtoBuf$Type.Argument argument) {
        if (argument.getProjection() == ProtoBuf$Type.Argument.Projection.STAR) {
            return clubfootVar == null ? new privatdozent(this.f31435attabal.dern().monoploid().apical()) : new StarProjectionImpl(clubfootVar);
        }
        gintrap gintrapVar = gintrap.f31577attabal;
        ProtoBuf$Type.Argument.Projection projection = argument.getProjection();
        Intrinsics.checkNotNullExpressionValue(projection, "getProjection(...)");
        Variance varianceDern = gintrapVar.dern(projection);
        ProtoBuf$Type protoBuf$TypeArytenoidectomy = genesis.beachfront.arytenoidectomy(argument, this.f31435attabal.cutely());
        return protoBuf$TypeArytenoidectomy == null ? new treadless(prescient.competently.wireman(ErrorTypeKind.NO_RECORDED_TYPE, argument.toString())) : new treadless(varianceDern, monoploid(protoBuf$TypeArytenoidectomy));
    }

    public final merc taiyuan(overspeculate overspeculateVar, permissivist permissivistVar, List<? extends timberyard> list, boolean z) {
        merc mercVarFormularize = KotlinTypeFactory.formularize(overspeculateVar, permissivistVar, list, z, null, 16, null);
        if (marial.monoploid(mercVarFormularize)) {
            return arytenoidectomy(mercVarFormularize);
        }
        return null;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f31438dern);
        if (this.f31440saneness == null) {
            str = "";
        } else {
            str = ". Child of " + this.f31440saneness.f31438dern;
        }
        sb.append(str);
        return sb.toString();
    }

    public final beachfront wireman(int i) {
        saneness sanenessVarAttabal = graveside.attabal(this.f31435attabal.competently(), i);
        return sanenessVarAttabal.apical() ? this.f31435attabal.dern().saneness(sanenessVarAttabal) : FindClassInModuleKt.saneness(this.f31435attabal.dern().monoploid(), sanenessVarAttabal);
    }
}
