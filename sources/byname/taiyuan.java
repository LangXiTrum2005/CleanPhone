package byname;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p002kotlin.Pair;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.polder;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.formularize;

/* JADX INFO: compiled from: StandardClassIds.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class taiyuan {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final dern f15341attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final dern f15342saneness;

    static {
        dern dernVar = new dern("java.lang");
        f15341attabal = dernVar;
        dern dernVarDern = dernVar.dern(marial.cutely("annotation"));
        Intrinsics.checkNotNullExpressionValue(dernVarDern, "child(...)");
        f15342saneness = dernVarDern;
    }

    public static final saneness apical(String str) {
        return new saneness(impromptu.f15255attabal.saneness(), marial.cutely(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<V, K> arytenoidectomy(Map<K, ? extends V> map) {
        Set<Map.Entry<K, ? extends V>> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(p002kotlin.ranges.wireman.wireman(polder.marial(dovishness.gintrap(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair pairAttabal = formularize.attabal(entry.getValue(), entry.getKey());
            linkedHashMap.put(pairAttabal.getFirst(), pairAttabal.getSecond());
        }
        return linkedHashMap;
    }

    public static final saneness formularize(String str) {
        return new saneness(impromptu.f15255attabal.beachfront(), marial.cutely(str));
    }

    public static final saneness graveside(saneness sanenessVar) {
        return new saneness(impromptu.f15255attabal.beachfront(), marial.cutely('U' + sanenessVar.cutely().marial()));
    }

    public static final saneness impassible(String str) {
        return new saneness(impromptu.f15255attabal.dern(), marial.cutely(str));
    }

    public static final saneness kowloon(String str) {
        return new saneness(impromptu.f15255attabal.marial(), marial.cutely(str));
    }

    public static final saneness molybdenite(String str) {
        return new saneness(impromptu.f15255attabal.impromptu(), marial.cutely(str));
    }

    public static final saneness monoploid(marial marialVar) {
        impromptu impromptuVar = impromptu.f15255attabal;
        return new saneness(impromptuVar.attabal().impromptu(), marial.cutely(marialVar.marial() + impromptuVar.attabal().cutely().marial()));
    }

    public static final saneness polloi(String str) {
        return new saneness(impromptu.f15255attabal.competently(), marial.cutely(str));
    }

    public static final saneness triweekly(String str) {
        return new saneness(impromptu.f15255attabal.wireman(), marial.cutely(str));
    }
}
