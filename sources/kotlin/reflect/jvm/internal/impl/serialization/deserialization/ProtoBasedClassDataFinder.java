package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolverImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* JADX INFO: loaded from: classes7.dex */
public final class ProtoBasedClassDataFinder implements ClassDataFinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NameResolverImpl f44425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BuiltInsBinaryVersion f44426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f44427c;
    public final LinkedHashMap d;

    public ProtoBasedClassDataFinder(ProtoBuf.PackageFragment packageFragment, NameResolverImpl nameResolverImpl, BuiltInsBinaryVersion builtInsBinaryVersion, Function1 function1) {
        this.f44425a = nameResolverImpl;
        this.f44426b = builtInsBinaryVersion;
        this.f44427c = function1;
        List list = packageFragment.h0;
        Intrinsics.e(list, "proto.class_List");
        List list2 = list;
        int iH = MapsKt.h(CollectionsKt.n(list2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH < 16 ? 16 : iH);
        for (Object obj : list2) {
            linkedHashMap.put(NameResolverUtilKt.a(this.f44425a, ((ProtoBuf.Class) obj).f0), obj);
        }
        this.d = linkedHashMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder
    public final ClassData a(ClassId classId) {
        Intrinsics.f(classId, "classId");
        ProtoBuf.Class r0 = (ProtoBuf.Class) this.d.get(classId);
        if (r0 == null) {
            return null;
        }
        return new ClassData(this.f44425a, r0, this.f44426b, (SourceElement) ((DeserializedPackageFragmentImpl$classDataFinder$1) this.f44427c).invoke(classId));
    }
}
