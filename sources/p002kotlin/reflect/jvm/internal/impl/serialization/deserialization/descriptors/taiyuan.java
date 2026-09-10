package p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import genesis.competently;
import genesis.dern;
import genesis.impromptu;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.molybdenite;
import p002kotlin.reflect.jvm.internal.impl.descriptors.overspeculate;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import p002kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import p002kotlin.reflect.jvm.internal.impl.types.Variance;
import p002kotlin.reflect.jvm.internal.impl.types.coffeecake;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.yemenite;
import yeast.formularize;

/* JADX INFO: compiled from: DeserializedMemberDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class taiyuan extends AbstractTypeAliasDescriptor implements marial {

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public final competently f31558cord;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public final impromptu f31559cuirassed;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    public merc f31560oilcan;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public final dern f31561preprohormone;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public final ProtoBuf$TypeAlias f31562rotuma;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public merc f31563sealless;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public final wireman f31564stratoscope;

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public merc f31565trm;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public List<? extends clubfoot> f31566yemenite;

    /* JADX WARN: Illegal instructions before constructor call */
    public taiyuan(formularize storageManager, apical containingDeclaration, marial annotations, byname.marial name, molybdenite visibility, ProtoBuf$TypeAlias proto, dern nameResolver, competently typeTable, impromptu versionRequirementTable, wireman wiremanVar) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable, "versionRequirementTable");
        walach NO_SOURCE = walach.f30274attabal;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        super(storageManager, containingDeclaration, annotations, name, NO_SOURCE, visibility);
        this.f31562rotuma = proto;
        this.f31561preprohormone = nameResolver;
        this.f31558cord = typeTable;
        this.f31559cuirassed = versionRequirementTable;
        this.f31564stratoscope = wiremanVar;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.overspeculate
    public wireman arytenoidectomy() {
        if (yemenite.attabal(trm())) {
            return null;
        }
        beachfront beachfrontVarWireman = trm().setterwort().wireman();
        if (beachfrontVarWireman instanceof wireman) {
            return (wireman) beachfrontVarWireman;
        }
        return null;
    }

    public ProtoBuf$TypeAlias attendance() {
        return this.f31562rotuma;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.marial
    public competently cuirassed() {
        return this.f31558cord;
    }

    public impromptu homozygous() {
        return this.f31559cuirassed;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront
    public merc impassible() {
        merc mercVar = this.f31563sealless;
        if (mercVar != null) {
            return mercVar;
        }
        Intrinsics.preprohormone("defaultTypeImpl");
        return null;
    }

    public final void lampshade(List<? extends clubfoot> declaredTypeParameters, merc underlyingType, merc expandedType) {
        Intrinsics.checkNotNullParameter(declaredTypeParameters, "declaredTypeParameters");
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        Intrinsics.checkNotNullParameter(expandedType, "expandedType");
        mastfed(declaredTypeParameters);
        this.f31565trm = underlyingType;
        this.f31560oilcan = expandedType;
        this.f31566yemenite = TypeParameterUtilsKt.wireman(this);
        this.f31563sealless = outmarry();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.mathsort
    /* JADX INFO: renamed from: libyan, reason: merged with bridge method [inline-methods] */
    public overspeculate dern(TypeSubstitutor substitutor) {
        Intrinsics.checkNotNullParameter(substitutor, "substitutor");
        if (substitutor.apical()) {
            return this;
        }
        formularize formularizeVarSupplicat = supplicat();
        apical apicalVarSaneness = saneness();
        Intrinsics.checkNotNullExpressionValue(apicalVarSaneness, "getContainingDeclaration(...)");
        marial annotations = getAnnotations();
        Intrinsics.checkNotNullExpressionValue(annotations, "<get-annotations>(...)");
        byname.marial name = getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        taiyuan taiyuanVar = new taiyuan(formularizeVarSupplicat, apicalVarSaneness, annotations, name, getVisibility(), attendance(), oilcan(), cuirassed(), homozygous(), yemenite());
        List<clubfoot> listTriweekly = triweekly();
        merc mercVarUnderbelly = underbelly();
        Variance variance = Variance.INVARIANT;
        oilcan oilcanVarTriweekly = substitutor.triweekly(mercVarUnderbelly, variance);
        Intrinsics.checkNotNullExpressionValue(oilcanVarTriweekly, "safeSubstitute(...)");
        merc mercVarAttabal = coffeecake.attabal(oilcanVarTriweekly);
        oilcan oilcanVarTriweekly2 = substitutor.triweekly(trm(), variance);
        Intrinsics.checkNotNullExpressionValue(oilcanVarTriweekly2, "safeSubstitute(...)");
        taiyuanVar.lampshade(listTriweekly, mercVarAttabal, coffeecake.attabal(oilcanVarTriweekly2));
        return taiyuanVar;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.marial
    public dern oilcan() {
        return this.f31561preprohormone;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor
    public List<clubfoot> setterwort() {
        List list = this.f31566yemenite;
        if (list != null) {
            return list;
        }
        Intrinsics.preprohormone("typeConstructorParameters");
        return null;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.overspeculate
    public merc trm() {
        merc mercVar = this.f31560oilcan;
        if (mercVar != null) {
            return mercVar;
        }
        Intrinsics.preprohormone("expandedType");
        return null;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.overspeculate
    public merc underbelly() {
        merc mercVar = this.f31565trm;
        if (mercVar != null) {
            return mercVar;
        }
        Intrinsics.preprohormone("underlyingType");
        return null;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.marial
    public wireman yemenite() {
        return this.f31564stratoscope;
    }
}
