package p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import genesis.competently;
import genesis.impromptu;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cutely;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.marial;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;

/* JADX INFO: compiled from: DeserializedMemberDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class dern extends marial implements saneness {

    /* JADX INFO: renamed from: mathsort, reason: collision with root package name */
    public final competently f31548mathsort;

    /* JADX INFO: renamed from: overspeculate, reason: collision with root package name */
    public final wireman f31549overspeculate;

    /* JADX INFO: renamed from: peridotite, reason: collision with root package name */
    public final genesis.dern f31550peridotite;

    /* JADX INFO: renamed from: splinterproof, reason: collision with root package name */
    public final impromptu f31551splinterproof;

    /* JADX INFO: renamed from: walach, reason: collision with root package name */
    public final ProtoBuf$Constructor f31552walach;

    public /* synthetic */ dern(wireman wiremanVar, cutely cutelyVar, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial marialVar, boolean z, CallableMemberDescriptor.Kind kind, ProtoBuf$Constructor protoBuf$Constructor, genesis.dern dernVar, competently competentlyVar, impromptu impromptuVar, wireman wiremanVar2, walach walachVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wiremanVar, cutelyVar, marialVar, z, kind, protoBuf$Constructor, dernVar, competentlyVar, impromptuVar, wiremanVar2, (i & 1024) != 0 ? null : walachVar);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.marial
    public competently cuirassed() {
        return this.f31548mathsort;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.marial
    /* JADX INFO: renamed from: hyalinization, reason: merged with bridge method [inline-methods] */
    public ProtoBuf$Constructor cultivated() {
        return this.f31552walach;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.marial, p002kotlin.reflect.jvm.internal.impl.descriptors.impl.kowloon
    /* JADX INFO: renamed from: incorrectly, reason: merged with bridge method [inline-methods] */
    public dern vesuvio(apical newOwner, dovishness dovishnessVar, CallableMemberDescriptor.Kind kind, byname.marial marialVar, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial annotations, walach source) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(source, "source");
        dern dernVar = new dern((wireman) newOwner, (cutely) dovishnessVar, annotations, this.f30139hydrovane, kind, cultivated(), oilcan(), cuirassed(), puffin(), yemenite(), source);
        dernVar.prefect(lampshade());
        return dernVar;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.kowloon, p002kotlin.reflect.jvm.internal.impl.descriptors.cord
    public boolean isExternal() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.kowloon, p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness
    public boolean isInline() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.kowloon, p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness
    public boolean isSuspend() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.marial
    public genesis.dern oilcan() {
        return this.f31550peridotite;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.kowloon, p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness
    public boolean preprohormone() {
        return false;
    }

    public impromptu puffin() {
        return this.f31551splinterproof;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.marial
    public wireman yemenite() {
        return this.f31549overspeculate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dern(wireman containingDeclaration, cutely cutelyVar, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial annotations, boolean z, CallableMemberDescriptor.Kind kind, ProtoBuf$Constructor proto, genesis.dern nameResolver, competently typeTable, impromptu versionRequirementTable, wireman wiremanVar, walach walachVar) {
        super(containingDeclaration, cutelyVar, annotations, z, kind, walachVar == null ? walach.f30274attabal : walachVar);
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable, "versionRequirementTable");
        this.f31552walach = proto;
        this.f31550peridotite = nameResolver;
        this.f31548mathsort = typeTable;
        this.f31551splinterproof = versionRequirementTable;
        this.f31549overspeculate = wiremanVar;
    }
}
