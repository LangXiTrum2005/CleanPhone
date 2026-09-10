package p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import genesis.competently;
import genesis.dern;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness;
import p002kotlin.reflect.jvm.internal.impl.descriptors.hydrovane;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.kowloon;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.oilcan;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;

/* JADX INFO: compiled from: DeserializedMemberDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class impromptu extends oilcan implements saneness {

    /* JADX INFO: renamed from: hydrovane, reason: collision with root package name */
    public final ProtoBuf$Function f31553hydrovane;

    /* JADX INFO: renamed from: mathsort, reason: collision with root package name */
    public final genesis.impromptu f31554mathsort;

    /* JADX INFO: renamed from: peridotite, reason: collision with root package name */
    public final competently f31555peridotite;

    /* JADX INFO: renamed from: splinterproof, reason: collision with root package name */
    public final wireman f31556splinterproof;

    /* JADX INFO: renamed from: walach, reason: collision with root package name */
    public final dern f31557walach;

    public /* synthetic */ impromptu(apical apicalVar, hydrovane hydrovaneVar, marial marialVar, byname.marial marialVar2, CallableMemberDescriptor.Kind kind, ProtoBuf$Function protoBuf$Function, dern dernVar, competently competentlyVar, genesis.impromptu impromptuVar, wireman wiremanVar, walach walachVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(apicalVar, hydrovaneVar, marialVar, marialVar2, kind, protoBuf$Function, dernVar, competentlyVar, impromptuVar, wiremanVar, (i & 1024) != 0 ? null : walachVar);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.marial
    public competently cuirassed() {
        return this.f31555peridotite;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.marial
    public dern oilcan() {
        return this.f31557walach;
    }

    public genesis.impromptu twybill() {
        return this.f31554mathsort;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.oilcan, p002kotlin.reflect.jvm.internal.impl.descriptors.impl.kowloon
    public kowloon vesuvio(apical newOwner, dovishness dovishnessVar, CallableMemberDescriptor.Kind kind, byname.marial marialVar, marial annotations, walach source) {
        byname.marial marialVar2;
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(source, "source");
        hydrovane hydrovaneVar = (hydrovane) dovishnessVar;
        if (marialVar == null) {
            byname.marial name = getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            marialVar2 = name;
        } else {
            marialVar2 = marialVar;
        }
        impromptu impromptuVar = new impromptu(newOwner, hydrovaneVar, annotations, marialVar2, kind, cultivated(), oilcan(), cuirassed(), twybill(), yemenite(), source);
        impromptuVar.prefect(lampshade());
        return impromptuVar;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.marial
    /* JADX INFO: renamed from: vir, reason: merged with bridge method [inline-methods] */
    public ProtoBuf$Function cultivated() {
        return this.f31553hydrovane;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.marial
    public wireman yemenite() {
        return this.f31556splinterproof;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public impromptu(apical containingDeclaration, hydrovane hydrovaneVar, marial annotations, byname.marial name, CallableMemberDescriptor.Kind kind, ProtoBuf$Function proto, dern nameResolver, competently typeTable, genesis.impromptu versionRequirementTable, wireman wiremanVar, walach walachVar) {
        super(containingDeclaration, hydrovaneVar, annotations, name, kind, walachVar == null ? walach.f30274attabal : walachVar);
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable, "versionRequirementTable");
        this.f31553hydrovane = proto;
        this.f31557walach = nameResolver;
        this.f31555peridotite = typeTable;
        this.f31554mathsort = versionRequirementTable;
        this.f31556splinterproof = wiremanVar;
    }
}
