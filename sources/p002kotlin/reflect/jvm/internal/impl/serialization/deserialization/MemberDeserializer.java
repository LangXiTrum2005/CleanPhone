package p002kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import genesis.beachfront;
import genesis.saneness;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p002kotlin.Pair;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.graveside;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import p002kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated;
import p002kotlin.reflect.jvm.internal.impl.descriptors.hydrovane;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.cuirassed;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.stratoscope;
import p002kotlin.reflect.jvm.internal.impl.descriptors.molybdenite;
import p002kotlin.reflect.jvm.internal.impl.descriptors.overspeculate;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;
import p002kotlin.reflect.jvm.internal.impl.descriptors.sealless;
import p002kotlin.reflect.jvm.internal.impl.descriptors.starveling;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility;
import p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.resolve.wireman;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.attabal;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.competently;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.cutely;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.impromptu;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import yeast.formularize;
import yeast.taiyuan;

/* JADX INFO: compiled from: MemberDeserializer.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class MemberDeserializer {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final cutely f31433attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final dern f31434saneness;

    public MemberDeserializer(cutely c) {
        Intrinsics.checkNotNullParameter(c, "c");
        this.f31433attabal = c;
        this.f31434saneness = new dern(c.dern().monoploid(), c.dern().polloi());
    }

    public final int apical(int i) {
        return (i & 63) + ((i >> 8) << 6);
    }

    public final marial beachfront(final ProtoBuf$Property protoBuf$Property, final boolean z) {
        return !saneness.f26682dern.wireman(protoBuf$Property.getFlags()).booleanValue() ? marial.f29950impromptu.saneness() : new cutely(this.f31433attabal.impromptu(), new Function0<List<? extends dern>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$getPropertyFieldAnnotations$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final List<? extends dern> invoke() {
                List<? extends dern> listMolet;
                MemberDeserializer memberDeserializer = this.this$0;
                dovishness dovishnessVarDern = memberDeserializer.dern(memberDeserializer.f31433attabal.marial());
                if (dovishnessVarDern != null) {
                    boolean z2 = z;
                    MemberDeserializer memberDeserializer2 = this.this$0;
                    ProtoBuf$Property protoBuf$Property2 = protoBuf$Property;
                    listMolet = z2 ? CollectionsKt.molet(memberDeserializer2.f31433attabal.dern().wireman().cutely(dovishnessVarDern, protoBuf$Property2)) : CollectionsKt.molet(memberDeserializer2.f31433attabal.dern().wireman().impromptu(dovishnessVarDern, protoBuf$Property2));
                } else {
                    listMolet = null;
                }
                return listMolet == null ? adultoid.formularize() : listMolet;
            }
        });
    }

    public final marial competently(final triweekly triweeklyVar, final AnnotatedCallableKind annotatedCallableKind) {
        return new attabal(this.f31433attabal.impromptu(), new Function0<List<? extends dern>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$getReceiverParameterAnnotations$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final List<? extends dern> invoke() {
                List<dern> listTaiyuan;
                MemberDeserializer memberDeserializer = this.this$0;
                dovishness dovishnessVarDern = memberDeserializer.dern(memberDeserializer.f31433attabal.marial());
                if (dovishnessVarDern != null) {
                    listTaiyuan = this.this$0.f31433attabal.dern().wireman().taiyuan(dovishnessVarDern, triweeklyVar, annotatedCallableKind);
                } else {
                    listTaiyuan = null;
                }
                return listTaiyuan == null ? adultoid.formularize() : listTaiyuan;
            }
        });
    }

    public final hydrovane cutely(ProtoBuf$Function proto) {
        oilcan oilcanVarMonoploid;
        Intrinsics.checkNotNullParameter(proto, "proto");
        int flags = proto.hasFlags() ? proto.getFlags() : apical(proto.getOldFlags());
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        marial marialVarWireman = wireman(proto, flags, annotatedCallableKind);
        marial marialVarCompetently = beachfront.competently(proto) ? competently(proto, annotatedCallableKind) : marial.f29950impromptu.saneness();
        impromptu impromptuVar = new impromptu(this.f31433attabal.marial(), null, marialVarWireman, graveside.saneness(this.f31433attabal.competently(), proto.getName()), rotuma.saneness(gintrap.f31577attabal, saneness.f26674arytenoidectomy.wireman(flags)), proto, this.f31433attabal.competently(), this.f31433attabal.cutely(), Intrinsics.wireman(DescriptorUtilsKt.formularize(this.f31433attabal.marial()).dern(graveside.saneness(this.f31433attabal.competently(), proto.getName())), preprohormone.f31615attabal) ? genesis.impromptu.f26670saneness.saneness() : this.f31433attabal.apical(), this.f31433attabal.wireman(), null, 1024, null);
        cutely cutelyVar = this.f31433attabal;
        List<ProtoBuf$TypeParameter> typeParameterList = proto.getTypeParameterList();
        Intrinsics.checkNotNullExpressionValue(typeParameterList, "getTypeParameterList(...)");
        cutely cutelyVarSaneness = cutely.saneness(cutelyVar, impromptuVar, typeParameterList, null, null, null, null, 60, null);
        ProtoBuf$Type protoBuf$TypeApical = beachfront.apical(proto, this.f31433attabal.cutely());
        starveling starvelingVarTaiyuan = (protoBuf$TypeApical == null || (oilcanVarMonoploid = cutelyVarSaneness.taiyuan().monoploid(protoBuf$TypeApical)) == null) ? null : wireman.taiyuan(impromptuVar, oilcanVarMonoploid, marialVarCompetently);
        starveling starvelingVarMarial = marial();
        List<ProtoBuf$Type> listDern = beachfront.dern(proto, this.f31433attabal.cutely());
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listDern) {
            int i2 = i + 1;
            if (i < 0) {
                adultoid.dovishness();
            }
            starveling starvelingVarTriweekly = triweekly((ProtoBuf$Type) obj, cutelyVarSaneness, impromptuVar, i);
            if (starvelingVarTriweekly != null) {
                arrayList.add(starvelingVarTriweekly);
            }
            i = i2;
        }
        List<clubfoot> listCutely = cutelyVarSaneness.taiyuan().cutely();
        MemberDeserializer memberDeserializerBeachfront = cutelyVarSaneness.beachfront();
        List<ProtoBuf$ValueParameter> valueParameterList = proto.getValueParameterList();
        Intrinsics.checkNotNullExpressionValue(valueParameterList, "getValueParameterList(...)");
        List<cultivated> listKowloon = memberDeserializerBeachfront.kowloon(valueParameterList, proto, AnnotatedCallableKind.FUNCTION);
        oilcan oilcanVarMonoploid2 = cutelyVarSaneness.taiyuan().monoploid(beachfront.impassible(proto, this.f31433attabal.cutely()));
        gintrap gintrapVar = gintrap.f31577attabal;
        impromptu(impromptuVar, starvelingVarTaiyuan, starvelingVarMarial, arrayList, listCutely, listKowloon, oilcanVarMonoploid2, gintrapVar.saneness(saneness.f26692marial.wireman(flags)), rotuma.attabal(gintrapVar, saneness.f26712wireman.wireman(flags)), seminary.taiyuan());
        Boolean boolWireman = saneness.f26695monoploid.wireman(flags);
        Intrinsics.checkNotNullExpressionValue(boolWireman, "get(...)");
        impromptuVar.tarboosh(boolWireman.booleanValue());
        Boolean boolWireman2 = saneness.f26698polloi.wireman(flags);
        Intrinsics.checkNotNullExpressionValue(boolWireman2, "get(...)");
        impromptuVar.fastrack(boolWireman2.booleanValue());
        Boolean boolWireman3 = saneness.f26672adultoid.wireman(flags);
        Intrinsics.checkNotNullExpressionValue(boolWireman3, "get(...)");
        impromptuVar.tectonization(boolWireman3.booleanValue());
        Boolean boolWireman4 = saneness.f26694molybdenite.wireman(flags);
        Intrinsics.checkNotNullExpressionValue(boolWireman4, "get(...)");
        impromptuVar.pruinose(boolWireman4.booleanValue());
        Boolean boolWireman5 = saneness.f26686graveside.wireman(flags);
        Intrinsics.checkNotNullExpressionValue(boolWireman5, "get(...)");
        impromptuVar.sultanate(boolWireman5.booleanValue());
        Boolean boolWireman6 = saneness.f26683dovishness.wireman(flags);
        Intrinsics.checkNotNullExpressionValue(boolWireman6, "get(...)");
        impromptuVar.demilitarize(boolWireman6.booleanValue());
        Boolean boolWireman7 = saneness.f26685gintrap.wireman(flags);
        Intrinsics.checkNotNullExpressionValue(boolWireman7, "get(...)");
        impromptuVar.basify(boolWireman7.booleanValue());
        impromptuVar.prefect(!saneness.f26702rotuma.wireman(flags).booleanValue());
        Pair<p002kotlin.reflect.jvm.internal.impl.descriptors.attabal.InterfaceC0672attabal<?>, Object> pairAttabal = this.f31433attabal.dern().impromptu().attabal(proto, impromptuVar, this.f31433attabal.cutely(), cutelyVarSaneness.taiyuan());
        if (pairAttabal != null) {
            impromptuVar.sakeen(pairAttabal.getFirst(), pairAttabal.getSecond());
        }
        return impromptuVar;
    }

    public final dovishness dern(apical apicalVar) {
        if (apicalVar instanceof sealless) {
            return new dovishness.saneness(((sealless) apicalVar).marial(), this.f31433attabal.competently(), this.f31433attabal.cutely(), this.f31433attabal.wireman());
        }
        if (apicalVar instanceof DeserializedClassDescriptor) {
            return ((DeserializedClassDescriptor) apicalVar).pruinose();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final saran formularize(final ProtoBuf$Property proto) {
        saneness.wireman<ProtoBuf$Modality> wiremanVar;
        cuirassed cuirassedVarWireman;
        cuirassed cuirassedVar;
        stratoscope stratoscopeVar;
        oilcan oilcanVarMonoploid;
        Intrinsics.checkNotNullParameter(proto, "proto");
        int flags = proto.hasFlags() ? proto.getFlags() : apical(proto.getOldFlags());
        apical apicalVarMarial = this.f31433attabal.marial();
        marial marialVarWireman = wireman(proto, flags, AnnotatedCallableKind.PROPERTY);
        gintrap gintrapVar = gintrap.f31577attabal;
        Modality modalitySaneness = gintrapVar.saneness(saneness.f26692marial.wireman(flags));
        molybdenite molybdeniteVarAttabal = rotuma.attabal(gintrapVar, saneness.f26712wireman.wireman(flags));
        Boolean boolWireman = saneness.f26699preprohormone.wireman(flags);
        Intrinsics.checkNotNullExpressionValue(boolWireman, "get(...)");
        boolean zBooleanValue = boolWireman.booleanValue();
        byname.marial marialVarSaneness = graveside.saneness(this.f31433attabal.competently(), proto.getName());
        CallableMemberDescriptor.Kind kindSaneness = rotuma.saneness(gintrapVar, saneness.f26674arytenoidectomy.wireman(flags));
        Boolean boolWireman2 = saneness.f26711trm.wireman(flags);
        Intrinsics.checkNotNullExpressionValue(boolWireman2, "get(...)");
        boolean zBooleanValue2 = boolWireman2.booleanValue();
        Boolean boolWireman3 = saneness.f26707stratoscope.wireman(flags);
        Intrinsics.checkNotNullExpressionValue(boolWireman3, "get(...)");
        boolean zBooleanValue3 = boolWireman3.booleanValue();
        Boolean boolWireman4 = saneness.f26713yemenite.wireman(flags);
        Intrinsics.checkNotNullExpressionValue(boolWireman4, "get(...)");
        boolean zBooleanValue4 = boolWireman4.booleanValue();
        Boolean boolWireman5 = saneness.f26705sealless.wireman(flags);
        Intrinsics.checkNotNullExpressionValue(boolWireman5, "get(...)");
        boolean zBooleanValue5 = boolWireman5.booleanValue();
        Boolean boolWireman6 = saneness.f26690kattegat.wireman(flags);
        Intrinsics.checkNotNullExpressionValue(boolWireman6, "get(...)");
        int i = flags;
        final competently competentlyVar = new competently(apicalVarMarial, null, marialVarWireman, modalitySaneness, molybdeniteVarAttabal, zBooleanValue, marialVarSaneness, kindSaneness, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, boolWireman6.booleanValue(), proto, this.f31433attabal.competently(), this.f31433attabal.cutely(), this.f31433attabal.apical(), this.f31433attabal.wireman());
        cutely cutelyVar = this.f31433attabal;
        List<ProtoBuf$TypeParameter> typeParameterList = proto.getTypeParameterList();
        Intrinsics.checkNotNullExpressionValue(typeParameterList, "getTypeParameterList(...)");
        cutely cutelyVarSaneness = cutely.saneness(cutelyVar, competentlyVar, typeParameterList, null, null, null, null, 60, null);
        Boolean boolWireman7 = saneness.f26678cord.wireman(i);
        Intrinsics.checkNotNullExpressionValue(boolWireman7, "get(...)");
        boolean zBooleanValue6 = boolWireman7.booleanValue();
        marial marialVarCompetently = (zBooleanValue6 && beachfront.impromptu(proto)) ? competently(proto, AnnotatedCallableKind.PROPERTY_GETTER) : marial.f29950impromptu.saneness();
        oilcan oilcanVarMonoploid2 = cutelyVarSaneness.taiyuan().monoploid(beachfront.triweekly(proto, this.f31433attabal.cutely()));
        List<clubfoot> listCutely = cutelyVarSaneness.taiyuan().cutely();
        starveling starvelingVarMarial = marial();
        ProtoBuf$Type protoBuf$TypeFormularize = beachfront.formularize(proto, this.f31433attabal.cutely());
        starveling starvelingVarTaiyuan = (protoBuf$TypeFormularize == null || (oilcanVarMonoploid = cutelyVarSaneness.taiyuan().monoploid(protoBuf$TypeFormularize)) == null) ? null : wireman.taiyuan(competentlyVar, oilcanVarMonoploid, marialVarCompetently);
        List<ProtoBuf$Type> listWireman = beachfront.wireman(proto, this.f31433attabal.cutely());
        ArrayList arrayList = new ArrayList(dovishness.gintrap(listWireman, 10));
        int i2 = 0;
        for (Object obj : listWireman) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                adultoid.dovishness();
            }
            arrayList.add(triweekly((ProtoBuf$Type) obj, cutelyVarSaneness, competentlyVar, i2));
            i2 = i3;
        }
        competentlyVar.fastrack(oilcanVarMonoploid2, listCutely, starvelingVarMarial, starvelingVarTaiyuan, arrayList);
        Boolean boolWireman8 = saneness.f26682dern.wireman(i);
        Intrinsics.checkNotNullExpressionValue(boolWireman8, "get(...)");
        boolean zBooleanValue7 = boolWireman8.booleanValue();
        saneness.wireman<ProtoBuf$Visibility> wiremanVar2 = saneness.f26712wireman;
        ProtoBuf$Visibility protoBuf$VisibilityWireman = wiremanVar2.wireman(i);
        saneness.wireman<ProtoBuf$Modality> wiremanVar3 = saneness.f26692marial;
        int iSaneness = saneness.saneness(zBooleanValue7, protoBuf$VisibilityWireman, wiremanVar3.wireman(i), false, false, false);
        if (zBooleanValue6) {
            int getterFlags = proto.hasGetterFlags() ? proto.getGetterFlags() : iSaneness;
            Boolean boolWireman9 = saneness.f26697polder.wireman(getterFlags);
            Intrinsics.checkNotNullExpressionValue(boolWireman9, "get(...)");
            boolean zBooleanValue8 = boolWireman9.booleanValue();
            Boolean boolWireman10 = saneness.f26706seminary.wireman(getterFlags);
            Intrinsics.checkNotNullExpressionValue(boolWireman10, "get(...)");
            boolean zBooleanValue9 = boolWireman10.booleanValue();
            Boolean boolWireman11 = saneness.f26687grimness.wireman(getterFlags);
            Intrinsics.checkNotNullExpressionValue(boolWireman11, "get(...)");
            boolean zBooleanValue10 = boolWireman11.booleanValue();
            marial marialVarWireman2 = wireman(proto, getterFlags, AnnotatedCallableKind.PROPERTY_GETTER);
            if (zBooleanValue8) {
                gintrap gintrapVar2 = gintrap.f31577attabal;
                wiremanVar = wiremanVar3;
                cuirassedVarWireman = new cuirassed(competentlyVar, marialVarWireman2, gintrapVar2.saneness(wiremanVar3.wireman(getterFlags)), rotuma.attabal(gintrapVar2, wiremanVar2.wireman(getterFlags)), !zBooleanValue8, zBooleanValue9, zBooleanValue10, competentlyVar.getKind(), null, walach.f30274attabal);
            } else {
                wiremanVar = wiremanVar3;
                cuirassedVarWireman = wireman.wireman(competentlyVar, marialVarWireman2);
                Intrinsics.beachfront(cuirassedVarWireman);
            }
            cuirassedVarWireman.lampshade(competentlyVar.getReturnType());
        } else {
            cutelyVarSaneness = cutelyVarSaneness;
            wiremanVar2 = wiremanVar2;
            wiremanVar = wiremanVar3;
            cuirassedVarWireman = null;
        }
        Boolean boolWireman12 = saneness.f26680cuirassed.wireman(i);
        Intrinsics.checkNotNullExpressionValue(boolWireman12, "get(...)");
        if (boolWireman12.booleanValue()) {
            if (proto.hasSetterFlags()) {
                iSaneness = proto.getSetterFlags();
            }
            int i4 = iSaneness;
            Boolean boolWireman13 = saneness.f26697polder.wireman(i4);
            Intrinsics.checkNotNullExpressionValue(boolWireman13, "get(...)");
            boolean zBooleanValue11 = boolWireman13.booleanValue();
            Boolean boolWireman14 = saneness.f26706seminary.wireman(i4);
            Intrinsics.checkNotNullExpressionValue(boolWireman14, "get(...)");
            boolean zBooleanValue12 = boolWireman14.booleanValue();
            Boolean boolWireman15 = saneness.f26687grimness.wireman(i4);
            Intrinsics.checkNotNullExpressionValue(boolWireman15, "get(...)");
            boolean zBooleanValue13 = boolWireman15.booleanValue();
            AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.PROPERTY_SETTER;
            marial marialVarWireman3 = wireman(proto, i4, annotatedCallableKind);
            if (zBooleanValue11) {
                gintrap gintrapVar3 = gintrap.f31577attabal;
                cuirassedVar = cuirassedVarWireman;
                stratoscope stratoscopeVar2 = new stratoscope(competentlyVar, marialVarWireman3, gintrapVar3.saneness(wiremanVar.wireman(i4)), rotuma.attabal(gintrapVar3, wiremanVar2.wireman(i4)), !zBooleanValue11, zBooleanValue12, zBooleanValue13, competentlyVar.getKind(), null, walach.f30274attabal);
                stratoscopeVar = stratoscopeVar2;
                stratoscopeVar.libyan((cultivated) CollectionsKt.herdbook(cutely.saneness(cutelyVarSaneness, stratoscopeVar2, adultoid.formularize(), null, null, null, null, 60, null).beachfront().kowloon(graveside.marial(proto.getSetterValueParameter()), proto, annotatedCallableKind)));
            } else {
                cuirassedVar = cuirassedVarWireman;
                stratoscope stratoscopeVarMarial = wireman.marial(competentlyVar, marialVarWireman3, marial.f29950impromptu.saneness());
                Intrinsics.beachfront(stratoscopeVarMarial);
                stratoscopeVar = stratoscopeVarMarial;
            }
        } else {
            cuirassedVar = cuirassedVarWireman;
            stratoscopeVar = null;
        }
        Boolean boolWireman16 = saneness.f26696oilcan.wireman(i);
        Intrinsics.checkNotNullExpressionValue(boolWireman16, "get(...)");
        if (boolWireman16.booleanValue()) {
            competentlyVar.setterwort(new Function0<taiyuan<? extends p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<?>>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$loadProperty$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p002kotlin.jvm.functions.Function0
                public final taiyuan<? extends p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<?>> invoke() {
                    formularize formularizeVarImpromptu = this.this$0.f31433attabal.impromptu();
                    final MemberDeserializer memberDeserializer = this.this$0;
                    final ProtoBuf$Property protoBuf$Property = proto;
                    final competently competentlyVar2 = competentlyVar;
                    return formularizeVarImpromptu.marial(new Function0<p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<?>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$loadProperty$4.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p002kotlin.jvm.functions.Function0
                        public final p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<?> invoke() {
                            MemberDeserializer memberDeserializer2 = memberDeserializer;
                            dovishness dovishnessVarDern = memberDeserializer2.dern(memberDeserializer2.f31433attabal.marial());
                            Intrinsics.beachfront(dovishnessVarDern);
                            attabal<dern, p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<?>> attabalVarWireman = memberDeserializer.f31433attabal.dern().wireman();
                            ProtoBuf$Property protoBuf$Property2 = protoBuf$Property;
                            oilcan returnType = competentlyVar2.getReturnType();
                            Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
                            return attabalVarWireman.competently(dovishnessVarDern, protoBuf$Property2, returnType);
                        }
                    });
                }
            });
        }
        apical apicalVarMarial2 = this.f31433attabal.marial();
        p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar4 = apicalVarMarial2 instanceof p002kotlin.reflect.jvm.internal.impl.descriptors.wireman ? (p002kotlin.reflect.jvm.internal.impl.descriptors.wireman) apicalVarMarial2 : null;
        if ((wiremanVar4 != null ? wiremanVar4.getKind() : null) == ClassKind.ANNOTATION_CLASS) {
            competentlyVar.setterwort(new Function0<taiyuan<? extends p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<?>>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$loadProperty$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p002kotlin.jvm.functions.Function0
                public final taiyuan<? extends p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<?>> invoke() {
                    formularize formularizeVarImpromptu = this.this$0.f31433attabal.impromptu();
                    final MemberDeserializer memberDeserializer = this.this$0;
                    final ProtoBuf$Property protoBuf$Property = proto;
                    final competently competentlyVar2 = competentlyVar;
                    return formularizeVarImpromptu.marial(new Function0<p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<?>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$loadProperty$5.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p002kotlin.jvm.functions.Function0
                        public final p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<?> invoke() {
                            MemberDeserializer memberDeserializer2 = memberDeserializer;
                            dovishness dovishnessVarDern = memberDeserializer2.dern(memberDeserializer2.f31433attabal.marial());
                            Intrinsics.beachfront(dovishnessVarDern);
                            attabal<dern, p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<?>> attabalVarWireman = memberDeserializer.f31433attabal.dern().wireman();
                            ProtoBuf$Property protoBuf$Property2 = protoBuf$Property;
                            oilcan returnType = competentlyVar2.getReturnType();
                            Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
                            return attabalVarWireman.beachfront(dovishnessVarDern, protoBuf$Property2, returnType);
                        }
                    });
                }
            });
        }
        competentlyVar.basify(cuirassedVar, stratoscopeVar, new p002kotlin.reflect.jvm.internal.impl.descriptors.impl.triweekly(beachfront(proto, false), competentlyVar), new p002kotlin.reflect.jvm.internal.impl.descriptors.impl.triweekly(beachfront(proto, true), competentlyVar));
        return competentlyVar;
    }

    public final overspeculate impassible(ProtoBuf$TypeAlias proto) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        marial.attabal attabalVar = marial.f29950impromptu;
        List<ProtoBuf$Annotation> annotationList = proto.getAnnotationList();
        Intrinsics.checkNotNullExpressionValue(annotationList, "getAnnotationList(...)");
        List<ProtoBuf$Annotation> list = annotationList;
        ArrayList arrayList = new ArrayList(dovishness.gintrap(list, 10));
        for (ProtoBuf$Annotation protoBuf$Annotation : list) {
            dern dernVar = this.f31434saneness;
            Intrinsics.beachfront(protoBuf$Annotation);
            arrayList.add(dernVar.attabal(protoBuf$Annotation, this.f31433attabal.competently()));
        }
        p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.taiyuan taiyuanVar = new p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.taiyuan(this.f31433attabal.impromptu(), this.f31433attabal.marial(), attabalVar.attabal(arrayList), graveside.saneness(this.f31433attabal.competently(), proto.getName()), rotuma.attabal(gintrap.f31577attabal, saneness.f26712wireman.wireman(proto.getFlags())), proto, this.f31433attabal.competently(), this.f31433attabal.cutely(), this.f31433attabal.apical(), this.f31433attabal.wireman());
        cutely cutelyVar = this.f31433attabal;
        List<ProtoBuf$TypeParameter> typeParameterList = proto.getTypeParameterList();
        Intrinsics.checkNotNullExpressionValue(typeParameterList, "getTypeParameterList(...)");
        cutely cutelyVarSaneness = cutely.saneness(cutelyVar, taiyuanVar, typeParameterList, null, null, null, null, 60, null);
        taiyuanVar.lampshade(cutelyVarSaneness.taiyuan().cutely(), cutelyVarSaneness.taiyuan().formularize(beachfront.polloi(proto, this.f31433attabal.cutely()), false), cutelyVarSaneness.taiyuan().formularize(beachfront.marial(proto, this.f31433attabal.cutely()), false));
        return taiyuanVar;
    }

    public final void impromptu(impromptu impromptuVar, starveling starvelingVar, starveling starvelingVar2, List<? extends starveling> list, List<? extends clubfoot> list2, List<? extends cultivated> list3, oilcan oilcanVar, Modality modality, molybdenite molybdeniteVar, Map<? extends p002kotlin.reflect.jvm.internal.impl.descriptors.attabal.InterfaceC0672attabal<?>, ?> map) {
        impromptuVar.liable(starvelingVar, starvelingVar2, list, list2, list3, oilcanVar, modality, molybdeniteVar, map);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x007e  */
    public final List<cultivated> kowloon(List<ProtoBuf$ValueParameter> list, final triweekly triweeklyVar, final AnnotatedCallableKind annotatedCallableKind) {
        marial marialVarSaneness;
        apical apicalVarMarial = this.f31433attabal.marial();
        Intrinsics.competently(apicalVarMarial, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVar = (p002kotlin.reflect.jvm.internal.impl.descriptors.attabal) apicalVarMarial;
        apical apicalVarSaneness = attabalVar.saneness();
        Intrinsics.checkNotNullExpressionValue(apicalVarSaneness, "getContainingDeclaration(...)");
        final dovishness dovishnessVarDern = dern(apicalVarSaneness);
        List<ProtoBuf$ValueParameter> list2 = list;
        ArrayList arrayList = new ArrayList(dovishness.gintrap(list2, 10));
        final int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                adultoid.dovishness();
            }
            final ProtoBuf$ValueParameter protoBuf$ValueParameter = (ProtoBuf$ValueParameter) obj;
            int flags = protoBuf$ValueParameter.hasFlags() ? protoBuf$ValueParameter.getFlags() : 0;
            if (dovishnessVarDern != null) {
                Boolean boolWireman = saneness.f26682dern.wireman(flags);
                Intrinsics.checkNotNullExpressionValue(boolWireman, "get(...)");
                if (boolWireman.booleanValue()) {
                    marialVarSaneness = new cutely(this.f31433attabal.impromptu(), new Function0<List<? extends dern>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$valueParameters$1$annotations$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p002kotlin.jvm.functions.Function0
                        public final List<? extends dern> invoke() {
                            return CollectionsKt.molet(this.this$0.f31433attabal.dern().wireman().attabal(dovishnessVarDern, triweeklyVar, annotatedCallableKind, i, protoBuf$ValueParameter));
                        }
                    });
                } else {
                    marialVarSaneness = marial.f29950impromptu.saneness();
                }
            } else {
                marialVarSaneness = marial.f29950impromptu.saneness();
            }
            byname.marial marialVarSaneness2 = graveside.saneness(this.f31433attabal.competently(), protoBuf$ValueParameter.getName());
            oilcan oilcanVarMonoploid = this.f31433attabal.taiyuan().monoploid(beachfront.monoploid(protoBuf$ValueParameter, this.f31433attabal.cutely()));
            Boolean boolWireman2 = saneness.f26708supplicat.wireman(flags);
            Intrinsics.checkNotNullExpressionValue(boolWireman2, "get(...)");
            boolean zBooleanValue = boolWireman2.booleanValue();
            Boolean boolWireman3 = saneness.f26701restrictive.wireman(flags);
            Intrinsics.checkNotNullExpressionValue(boolWireman3, "get(...)");
            boolean zBooleanValue2 = boolWireman3.booleanValue();
            Boolean boolWireman4 = saneness.f26693merc.wireman(flags);
            Intrinsics.checkNotNullExpressionValue(boolWireman4, "get(...)");
            boolean zBooleanValue3 = boolWireman4.booleanValue();
            ProtoBuf$Type protoBuf$TypeGraveside = beachfront.graveside(protoBuf$ValueParameter, this.f31433attabal.cutely());
            oilcan oilcanVarMonoploid2 = protoBuf$TypeGraveside != null ? this.f31433attabal.taiyuan().monoploid(protoBuf$TypeGraveside) : null;
            walach NO_SOURCE = walach.f30274attabal;
            Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
            p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVar2 = attabalVar;
            arrayList.add(new ValueParameterDescriptorImpl(attabalVar2, null, i, marialVarSaneness, marialVarSaneness2, oilcanVarMonoploid, zBooleanValue, zBooleanValue2, zBooleanValue3, oilcanVarMonoploid2, NO_SOURCE));
            attabalVar = attabalVar2;
            i = i2;
        }
        return CollectionsKt.molet(arrayList);
    }

    public final starveling marial() {
        apical apicalVarMarial = this.f31433attabal.marial();
        p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar = apicalVarMarial instanceof p002kotlin.reflect.jvm.internal.impl.descriptors.wireman ? (p002kotlin.reflect.jvm.internal.impl.descriptors.wireman) apicalVarMarial : null;
        if (wiremanVar != null) {
            return wiremanVar.technofreak();
        }
        return null;
    }

    public final p002kotlin.reflect.jvm.internal.impl.descriptors.dern taiyuan(ProtoBuf$Constructor proto, boolean z) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        apical apicalVarMarial = this.f31433attabal.marial();
        Intrinsics.competently(apicalVarMarial, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar = (p002kotlin.reflect.jvm.internal.impl.descriptors.wireman) apicalVarMarial;
        int flags = proto.getFlags();
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.dern dernVar = new p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.dern(wiremanVar, null, wireman(proto, flags, annotatedCallableKind), z, CallableMemberDescriptor.Kind.DECLARATION, proto, this.f31433attabal.competently(), this.f31433attabal.cutely(), this.f31433attabal.apical(), this.f31433attabal.wireman(), null, 1024, null);
        MemberDeserializer memberDeserializerBeachfront = cutely.saneness(this.f31433attabal, dernVar, adultoid.formularize(), null, null, null, null, 60, null).beachfront();
        List<ProtoBuf$ValueParameter> valueParameterList = proto.getValueParameterList();
        Intrinsics.checkNotNullExpressionValue(valueParameterList, "getValueParameterList(...)");
        dernVar.twybill(memberDeserializerBeachfront.kowloon(valueParameterList, proto, annotatedCallableKind), rotuma.attabal(gintrap.f31577attabal, saneness.f26712wireman.wireman(proto.getFlags())));
        dernVar.cig(wiremanVar.impassible());
        dernVar.basify(wiremanVar.coffeecake());
        dernVar.prefect(!saneness.f26691kowloon.wireman(proto.getFlags()).booleanValue());
        return dernVar;
    }

    public final starveling triweekly(ProtoBuf$Type protoBuf$Type, cutely cutelyVar, p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVar, int i) {
        return wireman.saneness(attabalVar, cutelyVar.taiyuan().monoploid(protoBuf$Type), null, marial.f29950impromptu.saneness(), i);
    }

    public final marial wireman(final triweekly triweeklyVar, int i, final AnnotatedCallableKind annotatedCallableKind) {
        return !saneness.f26682dern.wireman(i).booleanValue() ? marial.f29950impromptu.saneness() : new cutely(this.f31433attabal.impromptu(), new Function0<List<? extends dern>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$getAnnotations$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final List<? extends dern> invoke() {
                List<? extends dern> listMolet;
                MemberDeserializer memberDeserializer = this.this$0;
                dovishness dovishnessVarDern = memberDeserializer.dern(memberDeserializer.f31433attabal.marial());
                if (dovishnessVarDern != null) {
                    listMolet = CollectionsKt.molet(this.this$0.f31433attabal.dern().wireman().marial(dovishnessVarDern, triweeklyVar, annotatedCallableKind));
                } else {
                    listMolet = null;
                }
                return listMolet == null ? adultoid.formularize() : listMolet;
            }
        });
    }
}
