package p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import byname.dern;
import byname.marial;
import discontentedly.saneness;
import genesis.attabal;
import genesis.competently;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.cord;
import p002kotlin.collections.creditor;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.sealless;
import p002kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.wireman;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.cutely;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.impromptu;

/* JADX INFO: compiled from: DeserializedPackageMemberScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public class beachfront extends DeserializedMemberScope {

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final sealless f31540competently;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final String f31541impromptu;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final dern f31542taiyuan;

    public beachfront(sealless packageDescriptor, ProtoBuf$Package proto, genesis.dern nameResolver, attabal metadataVersion, wireman wiremanVar, impromptu components, String debugName, Function0<? extends Collection<marial>> classNames) {
        Intrinsics.checkNotNullParameter(packageDescriptor, "packageDescriptor");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(debugName, "debugName");
        Intrinsics.checkNotNullParameter(classNames, "classNames");
        ProtoBuf$TypeTable typeTable = proto.getTypeTable();
        Intrinsics.checkNotNullExpressionValue(typeTable, "getTypeTable(...)");
        competently competentlyVar = new competently(typeTable);
        genesis.impromptu.attabal attabalVar = genesis.impromptu.f26670saneness;
        ProtoBuf$VersionRequirementTable versionRequirementTable = proto.getVersionRequirementTable();
        Intrinsics.checkNotNullExpressionValue(versionRequirementTable, "getVersionRequirementTable(...)");
        cutely cutelyVarAttabal = components.attabal(packageDescriptor, nameResolver, competentlyVar, attabalVar.attabal(versionRequirementTable), metadataVersion, wiremanVar);
        List<ProtoBuf$Function> functionList = proto.getFunctionList();
        Intrinsics.checkNotNullExpressionValue(functionList, "getFunctionList(...)");
        List<ProtoBuf$Property> propertyList = proto.getPropertyList();
        Intrinsics.checkNotNullExpressionValue(propertyList, "getPropertyList(...)");
        List<ProtoBuf$TypeAlias> typeAliasList = proto.getTypeAliasList();
        Intrinsics.checkNotNullExpressionValue(typeAliasList, "getTypeAliasList(...)");
        super(cutelyVarAttabal, functionList, propertyList, typeAliasList, classNames);
        this.f31540competently = packageDescriptor;
        this.f31541impromptu = debugName;
        this.f31542taiyuan = packageDescriptor.marial();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public Set<marial> adultoid() {
        return creditor.marial();
    }

    public void cord(marial name, saneness location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        needler.attabal.saneness(arytenoidectomy().dern().arytenoidectomy(), location, this.f31540competently, name);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public boolean gintrap(marial name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (super.gintrap(name)) {
            return true;
        }
        Iterable<discontentedness.saneness> iterableFormularize = arytenoidectomy().dern().formularize();
        if ((iterableFormularize instanceof Collection) && ((Collection) iterableFormularize).isEmpty()) {
            return false;
        }
        Iterator<discontentedness.saneness> it = iterableFormularize.iterator();
        while (it.hasNext()) {
            if (it.next().saneness(this.f31542taiyuan, name)) {
                return true;
            }
        }
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public Set<marial> graveside() {
        return creditor.marial();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public byname.saneness impassible(marial name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new byname.saneness(this.f31542taiyuan, name);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.impromptu
    public p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront marial(marial name, saneness location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        cord(name, location);
        return super.marial(name, location);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public Set<marial> molybdenite() {
        return creditor.marial();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.impromptu
    /* JADX INFO: renamed from: preprohormone, reason: merged with bridge method [inline-methods] */
    public List<apical> competently(wireman kindFilter, Function1<? super marial, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        Collection<apical> collectionCutely = cutely(kindFilter, nameFilter, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
        Iterable<discontentedness.saneness> iterableFormularize = arytenoidectomy().dern().formularize();
        ArrayList arrayList = new ArrayList();
        Iterator<discontentedness.saneness> it = iterableFormularize.iterator();
        while (it.hasNext()) {
            cord.stratoscope(arrayList, it.next().attabal(this.f31542taiyuan));
        }
        return CollectionsKt.unconsolidated(collectionCutely, arrayList);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public void taiyuan(Collection<apical> result, Function1<? super marial, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
    }

    public String toString() {
        return this.f31541impromptu;
    }
}
