package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolverImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPackageMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* JADX INFO: loaded from: classes7.dex */
public abstract class DeserializedPackageFragmentImpl extends DeserializedPackageFragment {
    public final BuiltInsBinaryVersion h0;
    public final NameResolverImpl i0;
    public final ProtoBasedClassDataFinder j0;
    public ProtoBuf.PackageFragment k0;
    public DeserializedPackageMemberScope l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedPackageFragmentImpl(FqName fqName, LockBasedStorageManager lockBasedStorageManager, ModuleDescriptor module, ProtoBuf.PackageFragment packageFragment, BuiltInsBinaryVersion builtInsBinaryVersion) {
        super(module, fqName);
        Intrinsics.f(fqName, "fqName");
        Intrinsics.f(module, "module");
        Intrinsics.f(fqName, "fqName");
        Intrinsics.f(module, "module");
        this.h0 = builtInsBinaryVersion;
        ProtoBuf.StringTable stringTable = packageFragment.e0;
        Intrinsics.e(stringTable, "proto.strings");
        ProtoBuf.QualifiedNameTable qualifiedNameTable = packageFragment.f0;
        Intrinsics.e(qualifiedNameTable, "proto.qualifiedNames");
        NameResolverImpl nameResolverImpl = new NameResolverImpl(stringTable, qualifiedNameTable);
        this.i0 = nameResolverImpl;
        this.j0 = new ProtoBasedClassDataFinder(packageFragment, nameResolverImpl, builtInsBinaryVersion, new DeserializedPackageFragmentImpl$classDataFinder$1(this));
        this.k0 = packageFragment;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment
    public final ProtoBasedClassDataFinder F0() {
        return this.j0;
    }

    public final void G0(DeserializationComponents components) {
        Intrinsics.f(components, "components");
        ProtoBuf.PackageFragment packageFragment = this.k0;
        if (packageFragment == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
        }
        this.k0 = null;
        ProtoBuf.Package r4 = packageFragment.g0;
        Intrinsics.e(r4, "proto.`package`");
        this.l0 = new DeserializedPackageMemberScope(this, r4, this.i0, this.h0, null, components, "scope of " + this, new Function0<Collection<? extends Name>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl$initialize$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Set setKeySet = this.X.j0.d.keySet();
                ArrayList arrayList = new ArrayList();
                for (Object obj : setKeySet) {
                    ClassId classId = (ClassId) obj;
                    if (classId.f44162b.e().d() && !ClassDeserializer.f44385c.contains(classId)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.n(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((ClassId) it.next()).i());
                }
                return arrayList2;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
    public final MemberScope n() {
        DeserializedPackageMemberScope deserializedPackageMemberScope = this.l0;
        if (deserializedPackageMemberScope != null) {
            return deserializedPackageMemberScope;
        }
        Intrinsics.m("_memberScope");
        throw null;
    }
}
