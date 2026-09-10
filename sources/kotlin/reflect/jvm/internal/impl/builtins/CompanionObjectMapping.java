package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes7.dex */
public final class CompanionObjectMapping {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashSet f43459a;

    static {
        Set<PrimitiveType> set = PrimitiveType.f0;
        ArrayList arrayList = new ArrayList(CollectionsKt.n(set, 10));
        for (PrimitiveType primitiveType : set) {
            Intrinsics.f(primitiveType, "primitiveType");
            arrayList.add(StandardNames.k.c(primitiveType.X));
        }
        FqName fqNameG = StandardNames.FqNames.f.g();
        Intrinsics.e(fqNameG, "string.toSafe()");
        ArrayList arrayListP = CollectionsKt.P(fqNameG, arrayList);
        FqName fqNameG2 = StandardNames.FqNames.f43500h.g();
        Intrinsics.e(fqNameG2, "_boolean.toSafe()");
        ArrayList arrayListP2 = CollectionsKt.P(fqNameG2, arrayListP);
        FqName fqNameG3 = StandardNames.FqNames.j.g();
        Intrinsics.e(fqNameG3, "_enum.toSafe()");
        ArrayList arrayListP3 = CollectionsKt.P(fqNameG3, arrayListP2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayListP3.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(ClassId.j((FqName) it.next()));
        }
        f43459a = linkedHashSet;
    }
}
