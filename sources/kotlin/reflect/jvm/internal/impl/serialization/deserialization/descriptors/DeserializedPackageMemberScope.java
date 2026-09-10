package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;

/* JADX INFO: loaded from: classes7.dex */
public class DeserializedPackageMemberScope extends DeserializedMemberScope {
    public final PackageFragmentDescriptor g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f44469h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final FqName f44470i;

    public DeserializedPackageMemberScope(PackageFragmentDescriptor packageDescriptor, ProtoBuf.Package proto, NameResolver nameResolver, BinaryVersion metadataVersion, JvmPackagePartSource jvmPackagePartSource, DeserializationComponents components, String debugName, Function0 function0) {
        Intrinsics.f(packageDescriptor, "packageDescriptor");
        Intrinsics.f(proto, "proto");
        Intrinsics.f(nameResolver, "nameResolver");
        Intrinsics.f(metadataVersion, "metadataVersion");
        Intrinsics.f(components, "components");
        Intrinsics.f(debugName, "debugName");
        ProtoBuf.TypeTable typeTable = proto.h0;
        Intrinsics.e(typeTable, "proto.typeTable");
        TypeTable typeTable2 = new TypeTable(typeTable);
        VersionRequirementTable versionRequirementTable = VersionRequirementTable.f44126b;
        ProtoBuf.VersionRequirementTable versionRequirementTable2 = proto.i0;
        Intrinsics.e(versionRequirementTable2, "proto.versionRequirementTable");
        DeserializationContext deserializationContextA = components.a(packageDescriptor, nameResolver, typeTable2, VersionRequirementTable.Companion.a(versionRequirementTable2), metadataVersion, jvmPackagePartSource);
        List list = proto.e0;
        Intrinsics.e(list, "proto.functionList");
        List list2 = proto.f0;
        Intrinsics.e(list2, "proto.propertyList");
        List list3 = proto.g0;
        Intrinsics.e(list3, "proto.typeAliasList");
        super(deserializationContextA, list, list2, list3, function0);
        this.g = packageDescriptor;
        this.f44469h = debugName;
        this.f44470i = packageDescriptor.c();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final ClassifierDescriptor f(Name name, LookupLocation location) {
        Intrinsics.f(name, "name");
        Intrinsics.f(location, "location");
        UtilsKt.b(this.f44456b.f44401a.f44396i, location, this.g, name);
        return super.f(name, location);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final Collection g(DescriptorKindFilter kindFilter, Function1 function1) {
        Intrinsics.f(kindFilter, "kindFilter");
        Collection collectionI = i(kindFilter, function1);
        Iterable iterable = this.f44456b.f44401a.k;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            CollectionsKt.g(((ClassDescriptorFactory) it.next()).a(this.f44470i), arrayList);
        }
        return CollectionsKt.O(arrayList, collectionI);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final ClassId l(Name name) {
        Intrinsics.f(name, "name");
        return new ClassId(this.f44470i, name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final Set n() {
        return EmptySet.X;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final Set o() {
        return EmptySet.X;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final Set p() {
        return EmptySet.X;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final boolean q(Name name) {
        Intrinsics.f(name, "name");
        if (super.q(name)) {
            return true;
        }
        Iterable iterable = this.f44456b.f44401a.k;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (((ClassDescriptorFactory) it.next()).b(this.f44470i, name)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.f44469h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final void h(ArrayList arrayList, Function1 function1) {
    }
}
