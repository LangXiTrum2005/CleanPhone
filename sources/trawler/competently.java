package trawler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import trawler.impassible;

/* JADX INFO: compiled from: GroupedLinkedMap.java */
/* JADX INFO: loaded from: classes2.dex */
public class competently<K extends impassible, V> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final attabal<K, V> f38951attabal = new attabal<>();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Map<K, attabal<K, V>> f38952saneness = new HashMap();

    /* JADX INFO: compiled from: GroupedLinkedMap.java */
    public static class attabal<K, V> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final K f38953attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public attabal<K, V> f38954dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public List<V> f38955saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public attabal<K, V> f38956wireman;

        public attabal() {
            this(null);
        }

        public void attabal(V v) {
            if (this.f38955saneness == null) {
                this.f38955saneness = new ArrayList();
            }
            this.f38955saneness.add(v);
        }

        public int dern() {
            List<V> list = this.f38955saneness;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public V saneness() {
            int iDern = dern();
            if (iDern > 0) {
                return this.f38955saneness.remove(iDern - 1);
            }
            return null;
        }

        public attabal(K k) {
            this.f38956wireman = this;
            this.f38954dern = this;
            this.f38953attabal = k;
        }
    }

    public static <K, V> void competently(attabal<K, V> attabalVar) {
        attabalVar.f38954dern.f38956wireman = attabalVar;
        attabalVar.f38956wireman.f38954dern = attabalVar;
    }

    public static <K, V> void marial(attabal<K, V> attabalVar) {
        attabal<K, V> attabalVar2 = attabalVar.f38956wireman;
        attabalVar2.f38954dern = attabalVar.f38954dern;
        attabalVar.f38954dern.f38956wireman = attabalVar2;
    }

    public V attabal(K k) {
        attabal<K, V> attabalVar = this.f38952saneness.get(k);
        if (attabalVar == null) {
            attabalVar = new attabal<>(k);
            this.f38952saneness.put(k, attabalVar);
        } else {
            k.attabal();
        }
        saneness(attabalVar);
        return attabalVar.saneness();
    }

    public V beachfront() {
        for (attabal attabalVar = this.f38951attabal.f38956wireman; !attabalVar.equals(this.f38951attabal); attabalVar = attabalVar.f38956wireman) {
            V v = (V) attabalVar.saneness();
            if (v != null) {
                return v;
            }
            marial(attabalVar);
            this.f38952saneness.remove(attabalVar.f38953attabal);
            ((impassible) attabalVar.f38953attabal).attabal();
        }
        return null;
    }

    public final void dern(attabal<K, V> attabalVar) {
        marial(attabalVar);
        attabal<K, V> attabalVar2 = this.f38951attabal;
        attabalVar.f38956wireman = attabalVar2.f38956wireman;
        attabalVar.f38954dern = attabalVar2;
        competently(attabalVar);
    }

    public final void saneness(attabal<K, V> attabalVar) {
        marial(attabalVar);
        attabal<K, V> attabalVar2 = this.f38951attabal;
        attabalVar.f38956wireman = attabalVar2;
        attabalVar.f38954dern = attabalVar2.f38954dern;
        competently(attabalVar);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        attabal attabalVar = this.f38951attabal.f38954dern;
        boolean z = false;
        while (!attabalVar.equals(this.f38951attabal)) {
            sb.append('{');
            sb.append(attabalVar.f38953attabal);
            sb.append(':');
            sb.append(attabalVar.dern());
            sb.append("}, ");
            attabalVar = attabalVar.f38954dern;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }

    public void wireman(K k, V v) {
        attabal<K, V> attabalVar = this.f38952saneness.get(k);
        if (attabalVar == null) {
            attabalVar = new attabal<>(k);
            dern(attabalVar);
            this.f38952saneness.put(k, attabalVar);
        } else {
            k.attabal();
        }
        attabalVar.attabal(v);
    }
}
