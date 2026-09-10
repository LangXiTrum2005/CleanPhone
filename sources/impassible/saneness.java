package impassible;

import com.ironsource.X3;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: SafeIterableMap.java */
/* JADX INFO: loaded from: classes.dex */
public class saneness<K, V> implements Iterable<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public dern<K, V> f28464arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public dern<K, V> f28465kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final WeakHashMap<beachfront<K, V>, Boolean> f28466monoploid = new WeakHashMap<>();

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public int f28467polloi = 0;

    /* JADX INFO: compiled from: SafeIterableMap.java */
    public static class attabal<K, V> extends marial<K, V> {
        public attabal(dern<K, V> dernVar, dern<K, V> dernVar2) {
            super(dernVar, dernVar2);
        }

        @Override // impassible.saneness.marial
        public dern<K, V> dern(dern<K, V> dernVar) {
            return dernVar.f28470monoploid;
        }

        @Override // impassible.saneness.marial
        public dern<K, V> saneness(dern<K, V> dernVar) {
            return dernVar.f28471polloi;
        }
    }

    /* JADX INFO: compiled from: SafeIterableMap.java */
    public static abstract class beachfront<K, V> {
        public abstract void attabal(dern<K, V> dernVar);
    }

    /* JADX INFO: compiled from: SafeIterableMap.java */
    public static class dern<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final V f28468arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final K f28469kowloon;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public dern<K, V> f28470monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public dern<K, V> f28471polloi;

        public dern(K k, V v) {
            this.f28469kowloon = k;
            this.f28468arytenoidectomy = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof dern)) {
                return false;
            }
            dern dernVar = (dern) obj;
            return this.f28469kowloon.equals(dernVar.f28469kowloon) && this.f28468arytenoidectomy.equals(dernVar.f28468arytenoidectomy);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f28469kowloon;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f28468arytenoidectomy;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f28469kowloon.hashCode() ^ this.f28468arytenoidectomy.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f28469kowloon + X3.j.b + this.f28468arytenoidectomy;
        }
    }

    /* JADX INFO: compiled from: SafeIterableMap.java */
    public static abstract class marial<K, V> extends beachfront<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public dern<K, V> f28472arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public dern<K, V> f28473kowloon;

        public marial(dern<K, V> dernVar, dern<K, V> dernVar2) {
            this.f28473kowloon = dernVar2;
            this.f28472arytenoidectomy = dernVar;
        }

        @Override // impassible.saneness.beachfront
        public void attabal(dern<K, V> dernVar) {
            if (this.f28473kowloon == dernVar && dernVar == this.f28472arytenoidectomy) {
                this.f28472arytenoidectomy = null;
                this.f28473kowloon = null;
            }
            dern<K, V> dernVar2 = this.f28473kowloon;
            if (dernVar2 == dernVar) {
                this.f28473kowloon = saneness(dernVar2);
            }
            if (this.f28472arytenoidectomy == dernVar) {
                this.f28472arytenoidectomy = marial();
            }
        }

        public abstract dern<K, V> dern(dern<K, V> dernVar);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f28472arytenoidectomy != null;
        }

        public final dern<K, V> marial() {
            dern<K, V> dernVar = this.f28472arytenoidectomy;
            dern<K, V> dernVar2 = this.f28473kowloon;
            if (dernVar == dernVar2 || dernVar2 == null) {
                return null;
            }
            return dern(dernVar);
        }

        public abstract dern<K, V> saneness(dern<K, V> dernVar);

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            dern<K, V> dernVar = this.f28472arytenoidectomy;
            this.f28472arytenoidectomy = marial();
            return dernVar;
        }
    }

    /* JADX INFO: renamed from: impassible.saneness$saneness, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SafeIterableMap.java */
    public static class C0648saneness<K, V> extends marial<K, V> {
        public C0648saneness(dern<K, V> dernVar, dern<K, V> dernVar2) {
            super(dernVar, dernVar2);
        }

        @Override // impassible.saneness.marial
        public dern<K, V> dern(dern<K, V> dernVar) {
            return dernVar.f28471polloi;
        }

        @Override // impassible.saneness.marial
        public dern<K, V> saneness(dern<K, V> dernVar) {
            return dernVar.f28470monoploid;
        }
    }

    /* JADX INFO: compiled from: SafeIterableMap.java */
    public class wireman extends beachfront<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public boolean f28474arytenoidectomy = true;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public dern<K, V> f28475kowloon;

        public wireman() {
        }

        @Override // impassible.saneness.beachfront
        public void attabal(dern<K, V> dernVar) {
            dern<K, V> dernVar2 = this.f28475kowloon;
            if (dernVar == dernVar2) {
                dern<K, V> dernVar3 = dernVar2.f28471polloi;
                this.f28475kowloon = dernVar3;
                this.f28474arytenoidectomy = dernVar3 == null;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f28474arytenoidectomy) {
                return saneness.this.f28465kowloon != null;
            }
            dern<K, V> dernVar = this.f28475kowloon;
            return (dernVar == null || dernVar.f28470monoploid == null) ? false : true;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (this.f28474arytenoidectomy) {
                this.f28474arytenoidectomy = false;
                this.f28475kowloon = saneness.this.f28465kowloon;
            } else {
                dern<K, V> dernVar = this.f28475kowloon;
                this.f28475kowloon = dernVar != null ? dernVar.f28470monoploid : null;
            }
            return this.f28475kowloon;
        }
    }

    public dern<K, V> beachfront(K k, V v) {
        dern<K, V> dernVar = new dern<>(k, v);
        this.f28467polloi++;
        dern<K, V> dernVar2 = this.f28464arytenoidectomy;
        if (dernVar2 == null) {
            this.f28465kowloon = dernVar;
            this.f28464arytenoidectomy = dernVar;
            return dernVar;
        }
        dernVar2.f28470monoploid = dernVar;
        dernVar.f28471polloi = dernVar2;
        this.f28464arytenoidectomy = dernVar;
        return dernVar;
    }

    public V competently(K k, V v) {
        dern<K, V> dernVarDern = dern(k);
        if (dernVarDern != null) {
            return dernVarDern.f28468arytenoidectomy;
        }
        beachfront(k, v);
        return null;
    }

    public dern<K, V> dern(K k) {
        dern<K, V> dernVar = this.f28465kowloon;
        while (dernVar != null && !dernVar.f28469kowloon.equals(k)) {
            dernVar = dernVar.f28470monoploid;
        }
        return dernVar;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C0648saneness c0648saneness = new C0648saneness(this.f28464arytenoidectomy, this.f28465kowloon);
        this.f28466monoploid.put(c0648saneness, Boolean.FALSE);
        return c0648saneness;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof saneness)) {
            return false;
        }
        saneness sanenessVar = (saneness) obj;
        if (size() != sanenessVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = sanenessVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += it.next().hashCode();
        }
        return iHashCode;
    }

    public V impromptu(K k) {
        dern<K, V> dernVarDern = dern(k);
        if (dernVarDern == null) {
            return null;
        }
        this.f28467polloi--;
        if (!this.f28466monoploid.isEmpty()) {
            Iterator<beachfront<K, V>> it = this.f28466monoploid.keySet().iterator();
            while (it.hasNext()) {
                it.next().attabal(dernVarDern);
            }
        }
        dern<K, V> dernVar = dernVarDern.f28471polloi;
        if (dernVar != null) {
            dernVar.f28470monoploid = dernVarDern.f28470monoploid;
        } else {
            this.f28465kowloon = dernVarDern.f28470monoploid;
        }
        dern<K, V> dernVar2 = dernVarDern.f28470monoploid;
        if (dernVar2 != null) {
            dernVar2.f28471polloi = dernVar;
        } else {
            this.f28464arytenoidectomy = dernVar;
        }
        dernVarDern.f28470monoploid = null;
        dernVarDern.f28471polloi = null;
        return dernVarDern.f28468arytenoidectomy;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        attabal attabalVar = new attabal(this.f28465kowloon, this.f28464arytenoidectomy);
        this.f28466monoploid.put(attabalVar, Boolean.FALSE);
        return attabalVar;
    }

    public Map.Entry<K, V> marial() {
        return this.f28464arytenoidectomy;
    }

    public Map.Entry<K, V> saneness() {
        return this.f28465kowloon;
    }

    public int size() {
        return this.f28467polloi;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(X3.j.d);
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(X3.j.e);
        return sb.toString();
    }

    public saneness<K, V>.wireman wireman() {
        saneness<K, V>.wireman wiremanVar = new wireman();
        this.f28466monoploid.put(wiremanVar, Boolean.FALSE);
        return wiremanVar;
    }
}
