package p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import genesis.beachfront;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.saneness;
import p002kotlin.reflect.jvm.internal.impl.descriptors.splinterproof;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.cutely;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.gintrap;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.graveside;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import yeast.formularize;

/* JADX INFO: compiled from: DeserializedTypeParameterDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DeserializedTypeParameterDescriptor extends saneness {

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public final attabal f31535cord;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public final ProtoBuf$TypeParameter f31536preprohormone;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public final cutely f31537rotuma;

    /* JADX WARN: Illegal instructions before constructor call */
    public DeserializedTypeParameterDescriptor(cutely c, ProtoBuf$TypeParameter proto, int i) {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(proto, "proto");
        formularize formularizeVarImpromptu = c.impromptu();
        apical apicalVarMarial = c.marial();
        marial marialVarSaneness = marial.f29950impromptu.saneness();
        byname.marial marialVarSaneness2 = graveside.saneness(c.competently(), proto.getName());
        gintrap gintrapVar = gintrap.f31577attabal;
        ProtoBuf$TypeParameter.Variance variance = proto.getVariance();
        Intrinsics.checkNotNullExpressionValue(variance, "getVariance(...)");
        super(formularizeVarImpromptu, apicalVarMarial, marialVarSaneness, marialVarSaneness2, gintrapVar.wireman(variance), proto.getReified(), i, walach.f30274attabal, splinterproof.attabal.f30272attabal);
        this.f31537rotuma = c;
        this.f31536preprohormone = proto;
        this.f31535cord = new attabal(c.impromptu(), new Function0<List<? extends dern>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor$annotations$1
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final List<? extends dern> invoke() {
                return CollectionsKt.molet(this.this$0.f31537rotuma.dern().wireman().dern(this.this$0.attendance(), this.this$0.f31537rotuma.competently()));
            }
        });
    }

    public final ProtoBuf$TypeParameter attendance() {
        return this.f31536preprohormone;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.wireman
    /* JADX INFO: renamed from: homozygous, reason: merged with bridge method [inline-methods] */
    public Void dhss(oilcan type) {
        Intrinsics.checkNotNullParameter(type, "type");
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.saneness, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.attabal
    /* JADX INFO: renamed from: mastfed, reason: merged with bridge method [inline-methods] */
    public attabal getAnnotations() {
        return this.f31535cord;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.wireman
    public List<oilcan> vesuvio() {
        List<ProtoBuf$Type> listMolybdenite = beachfront.molybdenite(this.f31536preprohormone, this.f31537rotuma.cutely());
        if (listMolybdenite.isEmpty()) {
            return p002kotlin.collections.graveside.marial(DescriptorUtilsKt.cutely(this).preprohormone());
        }
        List<ProtoBuf$Type> list = listMolybdenite;
        TypeDeserializer typeDeserializerTaiyuan = this.f31537rotuma.taiyuan();
        ArrayList arrayList = new ArrayList(dovishness.gintrap(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(typeDeserializerTaiyuan.monoploid((ProtoBuf$Type) it.next()));
        }
        return arrayList;
    }
}
