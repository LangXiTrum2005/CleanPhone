package kotlin.reflect.jvm.internal.impl.load.java;

import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes7.dex */
public final class BuiltinSpecialProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f43733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f43734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f43735c;
    public static final Set d;

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, java.util.Map] */
    static {
        FqNameUnsafe fqNameUnsafe = StandardNames.FqNames.j;
        FqName fqNameG = fqNameUnsafe.b(Name.g("name")).g();
        Intrinsics.e(fqNameG, "child(Name.identifier(name)).toSafe()");
        Pair pair = new Pair(fqNameG, Name.g("name"));
        FqName fqNameG2 = fqNameUnsafe.b(Name.g(MediationMetaData.KEY_ORDINAL)).g();
        Intrinsics.e(fqNameG2, "child(Name.identifier(name)).toSafe()");
        Pair pair2 = new Pair(fqNameG2, Name.g(MediationMetaData.KEY_ORDINAL));
        Pair pair3 = new Pair(StandardNames.FqNames.f43482B.c(Name.g("size")), Name.g("size"));
        FqName fqName = StandardNames.FqNames.f43484F;
        Pair pair4 = new Pair(fqName.c(Name.g("size")), Name.g("size"));
        FqName fqNameG3 = StandardNames.FqNames.f43499e.b(Name.g("length")).g();
        Intrinsics.e(fqNameG3, "child(Name.identifier(name)).toSafe()");
        Map mapJ = MapsKt.j(pair, pair2, pair3, pair4, new Pair(fqNameG3, Name.g("length")), new Pair(fqName.c(Name.g("keys")), Name.g("keySet")), new Pair(fqName.c(Name.g("values")), Name.g("values")), new Pair(fqName.c(Name.g("entries")), Name.g("entrySet")));
        f43733a = mapJ;
        Set<Map.Entry> setEntrySet = mapJ.entrySet();
        ArrayList<Pair> arrayList = new ArrayList(CollectionsKt.n(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(new Pair(((FqName) entry.getKey()).f(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair5 : arrayList) {
            Name name = (Name) pair5.f43249Y;
            Object arrayList2 = linkedHashMap.get(name);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(name, arrayList2);
            }
            ((List) arrayList2).add((Name) pair5.X);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.h(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), CollectionsKt.q((Iterable) entry2.getValue()));
        }
        f43734b = linkedHashMap2;
        Set setKeySet = f43733a.keySet();
        f43735c = setKeySet;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.n(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList3.add(((FqName) it.next()).f());
        }
        d = CollectionsKt.l0(arrayList3);
    }
}
