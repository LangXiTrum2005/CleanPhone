package p002kotlin.reflect.jvm.internal.impl.load.java;

import byname.marial;
import byname.saneness;
import byname.wireman;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p002kotlin.Pair;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.polder;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.competently;
import patroclinal.formularize;

/* JADX INFO: compiled from: BuiltinSpecialProperties.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final dern f30398attabal = new dern();

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final Set<marial> f30399beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final Map<marial, List<marial>> f30400dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final Set<byname.dern> f30401marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Map<byname.dern, marial> f30402saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final Set<byname.dern> f30403wireman;

    static {
        wireman wiremanVar = competently.attabal.f29739molybdenite;
        Pair pairAttabal = formularize.attabal(wireman.wireman(wiremanVar, "name"), competently.f29661apical);
        Pair pairAttabal2 = formularize.attabal(wireman.wireman(wiremanVar, MediationMetaData.KEY_ORDINAL), marial.cutely(MediationMetaData.KEY_ORDINAL));
        Pair pairAttabal3 = formularize.attabal(wireman.dern(competently.attabal.f29765splinterproof, "size"), marial.cutely("size"));
        byname.dern dernVar = competently.attabal.f29748permissivist;
        Map<byname.dern, marial> mapImpassible = seminary.impassible(pairAttabal, pairAttabal2, pairAttabal3, formularize.attabal(wireman.dern(dernVar, "size"), marial.cutely("size")), formularize.attabal(wireman.wireman(competently.attabal.f29703competently, "length"), marial.cutely("length")), formularize.attabal(wireman.dern(dernVar, "keys"), marial.cutely("keySet")), formularize.attabal(wireman.dern(dernVar, "values"), marial.cutely("values")), formularize.attabal(wireman.dern(dernVar, "entries"), marial.cutely("entrySet")));
        f30402saneness = mapImpassible;
        Set<Map.Entry<byname.dern, marial>> setEntrySet = mapImpassible.entrySet();
        ArrayList<Pair> arrayList = new ArrayList(dovishness.gintrap(setEntrySet, 10));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new Pair(((byname.dern) entry.getKey()).competently(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair : arrayList) {
            marial marialVar = (marial) pair.getSecond();
            Object arrayList2 = linkedHashMap.get(marialVar);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(marialVar, arrayList2);
            }
            ((List) arrayList2).add((marial) pair.getFirst());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(polder.marial(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), CollectionsKt.cultivated((Iterable) entry2.getValue()));
        }
        f30400dern = linkedHashMap2;
        Map<byname.dern, marial> map = f30402saneness;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<byname.dern, marial> entry3 : map.entrySet()) {
            p002kotlin.reflect.jvm.internal.impl.builtins.jvm.dern dernVar2 = p002kotlin.reflect.jvm.internal.impl.builtins.jvm.dern.f29852attabal;
            wireman wiremanVarCutely = entry3.getKey().marial().cutely();
            Intrinsics.checkNotNullExpressionValue(wiremanVarCutely, "toUnsafe(...)");
            saneness sanenessVarTriweekly = dernVar2.triweekly(wiremanVarCutely);
            Intrinsics.beachfront(sanenessVarTriweekly);
            linkedHashSet.add(sanenessVarTriweekly.saneness().dern(entry3.getValue()));
        }
        f30403wireman = linkedHashSet;
        Set<byname.dern> setKeySet = f30402saneness.keySet();
        f30401marial = setKeySet;
        Set<byname.dern> set = setKeySet;
        ArrayList arrayList3 = new ArrayList(dovishness.gintrap(set, 10));
        Iterator<T> it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((byname.dern) it2.next()).competently());
        }
        f30399beachfront = CollectionsKt.prefect(arrayList3);
    }

    public final Map<byname.dern, marial> attabal() {
        return f30402saneness;
    }

    public final Set<byname.dern> dern() {
        return f30401marial;
    }

    public final List<marial> saneness(marial name1) {
        Intrinsics.checkNotNullParameter(name1, "name1");
        List<marial> list = f30400dern.get(name1);
        return list == null ? adultoid.formularize() : list;
    }

    public final Set<marial> wireman() {
        return f30399beachfront;
    }
}
