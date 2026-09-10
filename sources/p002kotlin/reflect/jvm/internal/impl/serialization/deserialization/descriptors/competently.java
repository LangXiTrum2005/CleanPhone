package p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import genesis.dern;
import genesis.impromptu;
import genesis.saneness;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.cord;
import p002kotlin.reflect.jvm.internal.impl.descriptors.molybdenite;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;

/* JADX INFO: compiled from: DeserializedMemberDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class competently extends cord implements saneness {

    /* JADX INFO: renamed from: creditor, reason: collision with root package name */
    public final ProtoBuf$Property f31543creditor;

    /* JADX INFO: renamed from: hydrovane, reason: collision with root package name */
    public final genesis.competently f31544hydrovane;

    /* JADX INFO: renamed from: peridotite, reason: collision with root package name */
    public final wireman f31545peridotite;

    /* JADX INFO: renamed from: starveling, reason: collision with root package name */
    public final dern f31546starveling;

    /* JADX INFO: renamed from: walach, reason: collision with root package name */
    public final impromptu f31547walach;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public competently(apical containingDeclaration, saran saranVar, marial annotations, Modality modality, molybdenite visibility, boolean z, byname.marial name, CallableMemberDescriptor.Kind kind, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, ProtoBuf$Property proto, dern nameResolver, genesis.competently typeTable, impromptu versionRequirementTable, wireman wiremanVar) {
        super(containingDeclaration, saranVar, annotations, modality, visibility, z, name, kind, walach.f30274attabal, z2, z3, z6, false, z4, z5);
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(modality, "modality");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable, "versionRequirementTable");
        this.f31543creditor = proto;
        this.f31546starveling = nameResolver;
        this.f31544hydrovane = typeTable;
        this.f31547walach = versionRequirementTable;
        this.f31545peridotite = wiremanVar;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.marial
    /* JADX INFO: renamed from: cig, reason: merged with bridge method [inline-methods] */
    public ProtoBuf$Property cultivated() {
        return this.f31543creditor;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.marial
    public genesis.competently cuirassed() {
        return this.f31544hydrovane;
    }

    public impromptu demilitarize() {
        return this.f31547walach;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.cord, p002kotlin.reflect.jvm.internal.impl.descriptors.cord
    public boolean isExternal() {
        Boolean boolWireman = saneness.f26713yemenite.wireman(cultivated().getFlags());
        Intrinsics.checkNotNullExpressionValue(boolWireman, "get(...)");
        return boolWireman.booleanValue();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.cord
    public cord lampshade(apical newOwner, Modality newModality, molybdenite newVisibility, saran saranVar, CallableMemberDescriptor.Kind kind, byname.marial newName, walach source) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(newModality, "newModality");
        Intrinsics.checkNotNullParameter(newVisibility, "newVisibility");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(newName, "newName");
        Intrinsics.checkNotNullParameter(source, "source");
        return new competently(newOwner, saranVar, getAnnotations(), newModality, newVisibility, restrictive(), newName, kind, picketboat(), isConst(), isExternal(), rotuma(), coffeecake(), cultivated(), oilcan(), cuirassed(), demilitarize(), yemenite());
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.marial
    public dern oilcan() {
        return this.f31546starveling;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.marial
    public wireman yemenite() {
        return this.f31545peridotite;
    }
}
