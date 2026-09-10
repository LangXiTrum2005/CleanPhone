package androidx.datastore.preferences.protobuf;

import com.ironsource.X3;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: SmallSortedMap.java */
/* JADX INFO: loaded from: classes.dex */
public class treadless<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public Map<K, V> f9875arytenoidectomy;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public volatile treadless<K, V>.dern f9876graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public List<treadless<K, V>.wireman> f9877kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public Map<K, V> f9878molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public boolean f9879monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public volatile treadless<K, V>.beachfront f9880polloi;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* JADX INFO: compiled from: SmallSortedMap.java */
    public class attabal<FieldDescriptorType> extends treadless<FieldDescriptorType, Object> {
        public attabal() {
            super(null);
        }

        @Override // androidx.datastore.preferences.protobuf.treadless
        public void polloi() {
            if (!monoploid()) {
                for (int i = 0; i < impassible(); i++) {
                    Map.Entry<FieldDescriptorType, Object> entryFormularize = formularize(i);
                    if (((molybdenite.saneness) entryFormularize.getKey()).isRepeated()) {
                        entryFormularize.setValue(Collections.unmodifiableList((List) entryFormularize.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : kowloon()) {
                    if (((molybdenite.saneness) entry.getKey()).isRepeated()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.polloi();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.graveside((Comparable) obj, obj2);
        }
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    public class beachfront extends AbstractSet<Map.Entry<K, V>> {
        public beachfront() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            treadless.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = treadless.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new marial(treadless.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            treadless.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            treadless.this.graveside(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return treadless.this.size();
        }

        public /* synthetic */ beachfront(treadless treadlessVar, attabal attabalVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    public class dern extends treadless<K, V>.beachfront {
        public dern() {
            super(treadless.this, null);
        }

        @Override // androidx.datastore.preferences.protobuf.treadless.beachfront, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new saneness(treadless.this, null);
        }

        public /* synthetic */ dern(treadless treadlessVar, attabal attabalVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    public class wireman implements Map.Entry<K, V>, Comparable<treadless<K, V>.wireman> {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final K f9891kowloon;
        private V value;

        public wireman(treadless treadlessVar, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public int compareTo(treadless<K, V>.wireman wiremanVar) {
            return getKey().compareTo(wiremanVar.getKey());
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
            return dern(this.f9891kowloon, entry.getKey()) && dern(this.value, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.f9891kowloon;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v = this.value;
            return iHashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            treadless.this.impromptu();
            V v2 = this.value;
            this.value = v;
            return v2;
        }

        public String toString() {
            return this.f9891kowloon + X3.j.b + this.value;
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f9891kowloon;
        }

        public wireman(K k, V v) {
            this.f9891kowloon = k;
            this.value = v;
        }
    }

    public /* synthetic */ treadless(attabal attabalVar) {
        this();
    }

    public static <FieldDescriptorType extends molybdenite.saneness<FieldDescriptorType>> treadless<FieldDescriptorType, Object> molybdenite() {
        return new attabal();
    }

    public final V adultoid(int i) {
        impromptu();
        V value = this.f9877kowloon.remove(i).getValue();
        if (!this.f9875arytenoidectomy.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = arytenoidectomy().entrySet().iterator();
            this.f9877kowloon.add(new wireman(this, it.next()));
            it.remove();
        }
        return value;
    }

    public final SortedMap<K, V> arytenoidectomy() {
        impromptu();
        if (this.f9875arytenoidectomy.isEmpty() && !(this.f9875arytenoidectomy instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f9875arytenoidectomy = treeMap;
            this.f9878molybdenite = treeMap.descendingMap();
        }
        return (SortedMap) this.f9875arytenoidectomy;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        impromptu();
        if (!this.f9877kowloon.isEmpty()) {
            this.f9877kowloon.clear();
        }
        if (this.f9875arytenoidectomy.isEmpty()) {
            return;
        }
        this.f9875arytenoidectomy.clear();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c A[SYNTHETIC] */
    public final int competently(K k) {
        int i;
        int i2;
        int i3;
        int iCompareTo;
        int size = this.f9877kowloon.size();
        int i4 = size - 1;
        if (i4 < 0) {
            i = 0;
            while (i <= i4) {
                i3 = (i + i4) / 2;
                iCompareTo = k.compareTo(this.f9877kowloon.get(i3).getKey());
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
            int iCompareTo2 = k.compareTo(this.f9877kowloon.get(i4).getKey());
            if (iCompareTo2 > 0) {
                i2 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i4;
                }
                i = 0;
                while (i <= i4) {
                    i3 = (i + i4) / 2;
                    iCompareTo = k.compareTo(this.f9877kowloon.get(i3).getKey());
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
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return competently(comparable) >= 0 || this.f9875arytenoidectomy.containsKey(comparable);
    }

    public final void cutely() {
        impromptu();
        if (!this.f9877kowloon.isEmpty() || (this.f9877kowloon instanceof ArrayList)) {
            return;
        }
        this.f9877kowloon = new ArrayList(16);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f9880polloi == null) {
            this.f9880polloi = new beachfront(this, null);
        }
        return this.f9880polloi;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof treadless)) {
            return super.equals(obj);
        }
        treadless treadlessVar = (treadless) obj;
        int size = size();
        if (size != treadlessVar.size()) {
            return false;
        }
        int iImpassible = impassible();
        if (iImpassible != treadlessVar.impassible()) {
            return entrySet().equals(treadlessVar.entrySet());
        }
        for (int i = 0; i < iImpassible; i++) {
            if (!formularize(i).equals(treadlessVar.formularize(i))) {
                return false;
            }
        }
        if (iImpassible != size) {
            return this.f9875arytenoidectomy.equals(treadlessVar.f9875arytenoidectomy);
        }
        return true;
    }

    public Map.Entry<K, V> formularize(int i) {
        return this.f9877kowloon.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iCompetently = competently(comparable);
        return iCompetently >= 0 ? this.f9877kowloon.get(iCompetently).getValue() : this.f9875arytenoidectomy.get(comparable);
    }

    public V graveside(K k, V v) {
        impromptu();
        int iCompetently = competently(k);
        if (iCompetently >= 0) {
            return this.f9877kowloon.get(iCompetently).setValue(v);
        }
        cutely();
        int i = -(iCompetently + 1);
        if (i >= 16) {
            return arytenoidectomy().put(k, v);
        }
        if (this.f9877kowloon.size() == 16) {
            treadless<K, V>.wireman wiremanVarRemove = this.f9877kowloon.remove(15);
            arytenoidectomy().put(wiremanVarRemove.getKey(), wiremanVarRemove.getValue());
        }
        this.f9877kowloon.add(i, new wireman(k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iImpassible = impassible();
        int iHashCode = 0;
        for (int i = 0; i < iImpassible; i++) {
            iHashCode += this.f9877kowloon.get(i).hashCode();
        }
        return triweekly() > 0 ? iHashCode + this.f9875arytenoidectomy.hashCode() : iHashCode;
    }

    public int impassible() {
        return this.f9877kowloon.size();
    }

    public final void impromptu() {
        if (this.f9879monoploid) {
            throw new UnsupportedOperationException();
        }
    }

    public Iterable<Map.Entry<K, V>> kowloon() {
        return this.f9875arytenoidectomy.isEmpty() ? Collections.EMPTY_SET : this.f9875arytenoidectomy.entrySet();
    }

    public boolean monoploid() {
        return this.f9879monoploid;
    }

    public void polloi() {
        if (this.f9879monoploid) {
            return;
        }
        this.f9875arytenoidectomy = this.f9875arytenoidectomy.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f9875arytenoidectomy);
        this.f9878molybdenite = this.f9878molybdenite.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f9878molybdenite);
        this.f9879monoploid = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        impromptu();
        Comparable comparable = (Comparable) obj;
        int iCompetently = competently(comparable);
        if (iCompetently >= 0) {
            return adultoid(iCompetently);
        }
        if (this.f9875arytenoidectomy.isEmpty()) {
            return null;
        }
        return this.f9875arytenoidectomy.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f9877kowloon.size() + this.f9875arytenoidectomy.size();
    }

    public Set<Map.Entry<K, V>> taiyuan() {
        if (this.f9876graveside == null) {
            this.f9876graveside = new dern(this, null);
        }
        return this.f9876graveside;
    }

    public int triweekly() {
        return this.f9875arytenoidectomy.size();
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    public class marial implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public boolean f9883arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public int f9884kowloon;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f9885monoploid;

        public marial() {
            this.f9884kowloon = -1;
        }

        public final Iterator<Map.Entry<K, V>> attabal() {
            if (this.f9885monoploid == null) {
                this.f9885monoploid = treadless.this.f9875arytenoidectomy.entrySet().iterator();
            }
            return this.f9885monoploid;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9884kowloon + 1 < treadless.this.f9877kowloon.size() || (!treadless.this.f9875arytenoidectomy.isEmpty() && attabal().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f9883arytenoidectomy) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f9883arytenoidectomy = false;
            treadless.this.impromptu();
            if (this.f9884kowloon >= treadless.this.f9877kowloon.size()) {
                attabal().remove();
                return;
            }
            treadless treadlessVar = treadless.this;
            int i = this.f9884kowloon;
            this.f9884kowloon = i - 1;
            treadlessVar.adultoid(i);
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f9883arytenoidectomy = true;
            int i = this.f9884kowloon + 1;
            this.f9884kowloon = i;
            return i < treadless.this.f9877kowloon.size() ? (Map.Entry) treadless.this.f9877kowloon.get(this.f9884kowloon) : attabal().next();
        }

        public /* synthetic */ marial(treadless treadlessVar, attabal attabalVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    public class saneness implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f9887arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public int f9888kowloon;

        public saneness() {
            this.f9888kowloon = treadless.this.f9877kowloon.size();
        }

        public final Iterator<Map.Entry<K, V>> attabal() {
            if (this.f9887arytenoidectomy == null) {
                this.f9887arytenoidectomy = treadless.this.f9878molybdenite.entrySet().iterator();
            }
            return this.f9887arytenoidectomy;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i = this.f9888kowloon;
            return (i > 0 && i <= treadless.this.f9877kowloon.size()) || attabal().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (attabal().hasNext()) {
                return attabal().next();
            }
            List list = treadless.this.f9877kowloon;
            int i = this.f9888kowloon - 1;
            this.f9888kowloon = i;
            return (Map.Entry) list.get(i);
        }

        public /* synthetic */ saneness(treadless treadlessVar, attabal attabalVar) {
            this();
        }
    }

    public treadless() {
        this.f9877kowloon = Collections.EMPTY_LIST;
        Map<K, V> map = Collections.EMPTY_MAP;
        this.f9875arytenoidectomy = map;
        this.f9878molybdenite = map;
    }
}
