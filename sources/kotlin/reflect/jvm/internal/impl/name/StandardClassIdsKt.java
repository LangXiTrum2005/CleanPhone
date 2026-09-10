package kotlin.reflect.jvm.internal.impl.name;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class StandardClassIdsKt {
    static {
        new FqName("java.lang").c(Name.g("annotation"));
    }

    public static final ClassId a(String str) {
        FqName fqName = StandardClassIds.f44177a;
        return new ClassId(StandardClassIds.f44177a, Name.g(str));
    }

    public static final ClassId b(String str) {
        FqName fqName = StandardClassIds.f44177a;
        return new ClassId(StandardClassIds.f44179c, Name.g(str));
    }

    public static final LinkedHashMap c(LinkedHashMap linkedHashMap) {
        Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
        int iH = MapsKt.h(CollectionsKt.n(setEntrySet, 10));
        if (iH < 16) {
            iH = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iH);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap2.put(entry.getValue(), entry.getKey());
        }
        return linkedHashMap2;
    }

    public static final ClassId d(Name name) {
        FqName fqName = StandardClassIds.f44177a;
        ClassId classId = StandardClassIds.f44181h;
        return new ClassId(classId.g(), Name.g(name.d().concat(classId.i().d())));
    }

    public static final ClassId e(String str) {
        FqName fqName = StandardClassIds.f44177a;
        return new ClassId(StandardClassIds.f44178b, Name.g(str));
    }

    public static final ClassId f(ClassId classId) {
        FqName fqName = StandardClassIds.f44177a;
        return new ClassId(StandardClassIds.f44177a, Name.g("U".concat(classId.i().d())));
    }
}
