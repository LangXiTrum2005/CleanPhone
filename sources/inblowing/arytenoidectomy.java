package inblowing;

import com.google.firebase.components.DependencyCycleException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: CycleDetector.java */
/* JADX INFO: loaded from: classes3.dex */
public class arytenoidectomy {

    /* JADX INFO: compiled from: CycleDetector.java */
    public static class dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final cuirassed<?> f28520attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final boolean f28521saneness;

        public boolean equals(Object obj) {
            if (obj instanceof dern) {
                dern dernVar = (dern) obj;
                if (dernVar.f28520attabal.equals(this.f28520attabal) && dernVar.f28521saneness == this.f28521saneness) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((this.f28520attabal.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f28521saneness).hashCode();
        }

        public dern(cuirassed<?> cuirassedVar, boolean z) {
            this.f28520attabal = cuirassedVar;
            this.f28521saneness = z;
        }
    }

    /* JADX INFO: compiled from: CycleDetector.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final inblowing.dern<?> f28522attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final Set<saneness> f28524saneness = new HashSet();

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final Set<saneness> f28523dern = new HashSet();

        public saneness(inblowing.dern<?> dernVar) {
            this.f28522attabal = dernVar;
        }

        public void attabal(saneness sanenessVar) {
            this.f28524saneness.add(sanenessVar);
        }

        public boolean beachfront() {
            return this.f28523dern.isEmpty();
        }

        public void competently(saneness sanenessVar) {
            this.f28523dern.remove(sanenessVar);
        }

        public inblowing.dern<?> dern() {
            return this.f28522attabal;
        }

        public boolean marial() {
            return this.f28524saneness.isEmpty();
        }

        public void saneness(saneness sanenessVar) {
            this.f28523dern.add(sanenessVar);
        }

        public Set<saneness> wireman() {
            return this.f28524saneness;
        }
    }

    public static void attabal(List<inblowing.dern<?>> list) {
        Set<saneness> setDern = dern(list);
        Set<saneness> setSaneness = saneness(setDern);
        int i = 0;
        while (!setSaneness.isEmpty()) {
            saneness next = setSaneness.iterator().next();
            setSaneness.remove(next);
            i++;
            for (saneness sanenessVar : next.wireman()) {
                sanenessVar.competently(next);
                if (sanenessVar.beachfront()) {
                    setSaneness.add(sanenessVar);
                }
            }
        }
        if (i == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (saneness sanenessVar2 : setDern) {
            if (!sanenessVar2.beachfront() && !sanenessVar2.marial()) {
                arrayList.add(sanenessVar2.dern());
            }
        }
        throw new DependencyCycleException(arrayList);
    }

    public static Set<saneness> dern(List<inblowing.dern<?>> list) {
        Set<saneness> set;
        HashMap map = new HashMap(list.size());
        Iterator<inblowing.dern<?>> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (saneness sanenessVar : (Set) it2.next()) {
                        for (monoploid monoploidVar : sanenessVar.dern().competently()) {
                            if (monoploidVar.marial() && (set = (Set) map.get(new dern(monoploidVar.dern(), monoploidVar.competently()))) != null) {
                                for (saneness sanenessVar2 : set) {
                                    sanenessVar.attabal(sanenessVar2);
                                    sanenessVar2.saneness(sanenessVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            inblowing.dern<?> next = it.next();
            saneness sanenessVar3 = new saneness(next);
            for (cuirassed<? super Object> cuirassedVar : next.cutely()) {
                dern dernVar = new dern(cuirassedVar, !next.arytenoidectomy());
                if (!map.containsKey(dernVar)) {
                    map.put(dernVar, new HashSet());
                }
                Set set2 = (Set) map.get(dernVar);
                if (!set2.isEmpty() && !dernVar.f28521saneness) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", cuirassedVar));
                }
                set2.add(sanenessVar3);
            }
        }
    }

    public static Set<saneness> saneness(Set<saneness> set) {
        HashSet hashSet = new HashSet();
        for (saneness sanenessVar : set) {
            if (sanenessVar.beachfront()) {
                hashSet.add(sanenessVar);
            }
        }
        return hashSet;
    }
}
