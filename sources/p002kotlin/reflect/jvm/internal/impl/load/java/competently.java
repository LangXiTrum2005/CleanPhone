package p002kotlin.reflect.jvm.internal.impl.load.java;

import byname.dern;
import byname.impromptu;
import byname.saneness;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.formularize;

/* JADX INFO: compiled from: FakePureImplementationsProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class competently {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final competently f30359attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final Map<dern, dern> f30360dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Map<saneness, saneness> f30361saneness;

    static {
        competently competentlyVar = new competently();
        f30359attabal = competentlyVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f30361saneness = linkedHashMap;
        impromptu impromptuVar = impromptu.f15255attabal;
        competentlyVar.dern(impromptuVar.formularize(), competentlyVar.attabal("java.util.ArrayList", "java.util.LinkedList"));
        competentlyVar.dern(impromptuVar.triweekly(), competentlyVar.attabal("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        competentlyVar.dern(impromptuVar.impassible(), competentlyVar.attabal("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        saneness sanenessVarImpassible = saneness.impassible(new dern("java.util.function.Function"));
        Intrinsics.checkNotNullExpressionValue(sanenessVarImpassible, "topLevel(...)");
        competentlyVar.dern(sanenessVarImpassible, competentlyVar.attabal("java.util.function.UnaryOperator"));
        saneness sanenessVarImpassible2 = saneness.impassible(new dern("java.util.function.BiFunction"));
        Intrinsics.checkNotNullExpressionValue(sanenessVarImpassible2, "topLevel(...)");
        competentlyVar.dern(sanenessVarImpassible2, competentlyVar.attabal("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(formularize.attabal(((saneness) entry.getKey()).saneness(), ((saneness) entry.getValue()).saneness()));
        }
        f30360dern = seminary.dovishness(arrayList);
    }

    public final List<saneness> attabal(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(saneness.impassible(new dern(str)));
        }
        return arrayList;
    }

    public final void dern(saneness sanenessVar, List<saneness> list) {
        Map<saneness, saneness> map = f30361saneness;
        for (Object obj : list) {
            map.put((saneness) obj, sanenessVar);
        }
    }

    public final dern saneness(dern classFqName) {
        Intrinsics.checkNotNullParameter(classFqName, "classFqName");
        return f30360dern.get(classFqName);
    }
}
