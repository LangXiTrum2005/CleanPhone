package p002kotlin.reflect.jvm.internal.impl.protobuf;

import com.ironsource.X3;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: SmallSortedMap.java */
/* JADX INFO: loaded from: classes5.dex */
public class molybdenite<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public List<molybdenite<K, V>.dern> f31147arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final int f31148kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public volatile molybdenite<K, V>.marial f31149molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public Map<K, V> f31150monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public boolean f31151polloi;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* JADX INFO: compiled from: SmallSortedMap.java */
    public static class attabal<FieldDescriptorType> extends molybdenite<FieldDescriptorType, Object> {
        public attabal(int i) {
            super(i, null);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.molybdenite
        public void kowloon() {
            if (!triweekly()) {
                for (int i = 0; i < cutely(); i++) {
                    Map.Entry<FieldDescriptorType, Object> entryTaiyuan = taiyuan(i);
                    if (((competently.saneness) entryTaiyuan.getKey()).isRepeated()) {
                        entryTaiyuan.setValue(Collections.unmodifiableList((List) entryTaiyuan.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : formularize()) {
                    if (((competently.saneness) entry.getKey()).isRepeated()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.kowloon();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.monoploid((competently.saneness) obj, obj2);
        }
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    public class dern implements Comparable<molybdenite<K, V>.dern>, Map.Entry<K, V> {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final K f31153kowloon;
        private V value;

        public dern(molybdenite molybdeniteVar, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public int compareTo(molybdenite<K, V>.dern dernVar) {
            return getKey().compareTo(dernVar.getKey());
        }

        public final boolean dern(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return dern(this.f31153kowloon, entry.getKey()) && dern(this.value, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.f31153kowloon;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v = this.value;
            return iHashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            molybdenite.this.competently();
            V v2 = this.value;
            this.value = v;
            return v2;
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f31153kowloon);
            String strValueOf2 = String.valueOf(this.value);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
            sb.append(strValueOf);
            sb.append(X3.j.b);
            sb.append(strValueOf2);
            return sb.toString();
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f31153kowloon;
        }

        public dern(K k, V v) {
            this.f31153kowloon = k;
            this.value = v;
        }
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    public class marial extends AbstractSet<Map.Entry<K, V>> {
        public marial() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            molybdenite.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = molybdenite.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new wireman(molybdenite.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            molybdenite.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            molybdenite.this.monoploid(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return molybdenite.this.size();
        }

        public /* synthetic */ marial(molybdenite molybdeniteVar, attabal attabalVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final Iterator<Object> f31155attabal = new attabal();

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final Iterable<Object> f31156saneness = new C0695saneness();

        /* JADX INFO: compiled from: SmallSortedMap.java */
        public static class attabal implements Iterator<Object> {
            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.molybdenite$saneness$saneness, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SmallSortedMap.java */
        public static class C0695saneness implements Iterable<Object> {
            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return saneness.f31155attabal;
            }
        }

        public static <T> Iterable<T> saneness() {
            return (Iterable<T>) f31156saneness;
        }
    }

    public /* synthetic */ molybdenite(int i, attabal attabalVar) {
        this(i);
    }

    public static <FieldDescriptorType extends competently.saneness<FieldDescriptorType>> molybdenite<FieldDescriptorType, Object> arytenoidectomy(int i) {
        return new attabal(i);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c A[SYNTHETIC] */
    public final int beachfront(K k) {
        int i;
        int i2;
        int i3;
        int iCompareTo;
        int size = this.f31147arytenoidectomy.size();
        int i4 = size - 1;
        if (i4 < 0) {
            i = 0;
            while (i <= i4) {
                i3 = (i + i4) / 2;
                iCompareTo = k.compareTo(this.f31147arytenoidectomy.get(i3).getKey());
                if (iCompareTo < 0) {
                    i4 = i3 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i3;
                    }
                    i = i3 + 1;
                }
            }
            i2 = i + 1;
        } else {
            int iCompareTo2 = k.compareTo(this.f31147arytenoidectomy.get(i4).getKey());
            if (iCompareTo2 > 0) {
                i2 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i4;
                }
                i = 0;
                while (i <= i4) {
                    i3 = (i + i4) / 2;
                    iCompareTo = k.compareTo(this.f31147arytenoidectomy.get(i3).getKey());
                    if (iCompareTo < 0) {
                        i4 = i3 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i3;
                        }
                        i = i3 + 1;
                    }
                }
                i2 = i + 1;
            }
        }
        return -i2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        competently();
        if (!this.f31147arytenoidectomy.isEmpty()) {
            this.f31147arytenoidectomy.clear();
        }
        if (this.f31150monoploid.isEmpty()) {
            return;
        }
        this.f31150monoploid.clear();
    }

    public final void competently() {
        if (this.f31151polloi) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return beachfront(comparable) >= 0 || this.f31150monoploid.containsKey(comparable);
    }

    public int cutely() {
        return this.f31147arytenoidectomy.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f31149molybdenite == null) {
            this.f31149molybdenite = new marial(this, null);
        }
        return this.f31149molybdenite;
    }

    public Iterable<Map.Entry<K, V>> formularize() {
        return this.f31150monoploid.isEmpty() ? saneness.saneness() : this.f31150monoploid.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iBeachfront = beachfront(comparable);
        return iBeachfront >= 0 ? this.f31147arytenoidectomy.get(iBeachfront).getValue() : this.f31150monoploid.get(comparable);
    }

    public final SortedMap<K, V> impassible() {
        competently();
        if (this.f31150monoploid.isEmpty() && !(this.f31150monoploid instanceof TreeMap)) {
            this.f31150monoploid = new TreeMap();
        }
        return (SortedMap) this.f31150monoploid;
    }

    public final void impromptu() {
        competently();
        if (!this.f31147arytenoidectomy.isEmpty() || (this.f31147arytenoidectomy instanceof ArrayList)) {
            return;
        }
        this.f31147arytenoidectomy = new ArrayList(this.f31148kowloon);
    }

    public void kowloon() {
        if (this.f31151polloi) {
            return;
        }
        this.f31150monoploid = this.f31150monoploid.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f31150monoploid);
        this.f31151polloi = true;
    }

    public V monoploid(K k, V v) {
        competently();
        int iBeachfront = beachfront(k);
        if (iBeachfront >= 0) {
            return this.f31147arytenoidectomy.get(iBeachfront).setValue(v);
        }
        impromptu();
        int i = -(iBeachfront + 1);
        if (i >= this.f31148kowloon) {
            return impassible().put(k, v);
        }
        int size = this.f31147arytenoidectomy.size();
        int i2 = this.f31148kowloon;
        if (size == i2) {
            molybdenite<K, V>.dern dernVarRemove = this.f31147arytenoidectomy.remove(i2 - 1);
            impassible().put(dernVarRemove.getKey(), dernVarRemove.getValue());
        }
        this.f31147arytenoidectomy.add(i, new dern(k, v));
        return null;
    }

    public final V polloi(int i) {
        competently();
        V value = this.f31147arytenoidectomy.remove(i).getValue();
        if (!this.f31150monoploid.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = impassible().entrySet().iterator();
            this.f31147arytenoidectomy.add(new dern(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        competently();
        Comparable comparable = (Comparable) obj;
        int iBeachfront = beachfront(comparable);
        if (iBeachfront >= 0) {
            return polloi(iBeachfront);
        }
        if (this.f31150monoploid.isEmpty()) {
            return null;
        }
        return this.f31150monoploid.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f31147arytenoidectomy.size() + this.f31150monoploid.size();
    }

    public Map.Entry<K, V> taiyuan(int i) {
        return this.f31147arytenoidectomy.get(i);
    }

    public boolean triweekly() {
        return this.f31151polloi;
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    public class wireman implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public boolean f31157arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public int f31158kowloon;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f31159monoploid;

        public wireman() {
            this.f31158kowloon = -1;
        }

        public final Iterator<Map.Entry<K, V>> attabal() {
            if (this.f31159monoploid == null) {
                this.f31159monoploid = molybdenite.this.f31150monoploid.entrySet().iterator();
            }
            return this.f31159monoploid;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f31158kowloon + 1 < molybdenite.this.f31147arytenoidectomy.size() || attabal().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f31157arytenoidectomy) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f31157arytenoidectomy = false;
            molybdenite.this.competently();
            if (this.f31158kowloon >= molybdenite.this.f31147arytenoidectomy.size()) {
                attabal().remove();
                return;
            }
            molybdenite molybdeniteVar = molybdenite.this;
            int i = this.f31158kowloon;
            this.f31158kowloon = i - 1;
            molybdeniteVar.polloi(i);
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f31157arytenoidectomy = true;
            int i = this.f31158kowloon + 1;
            this.f31158kowloon = i;
            return i < molybdenite.this.f31147arytenoidectomy.size() ? (Map.Entry) molybdenite.this.f31147arytenoidectomy.get(this.f31158kowloon) : attabal().next();
        }

        public /* synthetic */ wireman(molybdenite molybdeniteVar, attabal attabalVar) {
            this();
        }
    }

    public molybdenite(int i) {
        this.f31148kowloon = i;
        this.f31147arytenoidectomy = Collections.EMPTY_LIST;
        this.f31150monoploid = Collections.EMPTY_MAP;
    }
}
