package com.google.crypto.tink.shaded.protobuf;

import com.ironsource.X3;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: SmallSortedMap.java */
/* JADX INFO: loaded from: classes3.dex */
public class treadless<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public int f22368arytenoidectomy;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public Map<K, V> f22369graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public Object[] f22370kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public volatile treadless<K, V>.beachfront f22371molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public Map<K, V> f22372monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public boolean f22373polloi;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorT] */
    /* JADX INFO: compiled from: SmallSortedMap.java */
    public class attabal<FieldDescriptorT> extends treadless<FieldDescriptorT, Object> {
        public attabal() {
            super(null);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.treadless
        public void molybdenite() {
            if (!polloi()) {
                for (int i = 0; i < triweekly(); i++) {
                    Map.Entry<FieldDescriptorT, Object> entryImpassible = impassible(i);
                    if (((graveside.saneness) entryImpassible.getKey()).isRepeated()) {
                        entryImpassible.setValue(Collections.unmodifiableList((List) entryImpassible.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorT, Object> entry : arytenoidectomy()) {
                    if (((graveside.saneness) entry.getKey()).isRepeated()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.molybdenite();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.adultoid((Comparable) obj, obj2);
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
            treadless.this.adultoid(entry.getKey(), entry.getValue());
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

        @Override // com.google.crypto.tink.shaded.protobuf.treadless.beachfront, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
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
        public final K f22384kowloon;
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
            return dern(this.f22384kowloon, entry.getKey()) && dern(this.value, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.f22384kowloon;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v = this.value;
            return iHashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            treadless.this.taiyuan();
            V v2 = this.value;
            this.value = v;
            return v2;
        }

        public String toString() {
            return this.f22384kowloon + X3.j.b + this.value;
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f22384kowloon;
        }

        public wireman(K k, V v) {
            this.f22384kowloon = k;
            this.value = v;
        }
    }

    public /* synthetic */ treadless(attabal attabalVar) {
        this();
    }

    public static <FieldDescriptorT extends graveside.saneness<FieldDescriptorT>> treadless<FieldDescriptorT, Object> graveside() {
        return new attabal();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V adultoid(K k, V v) {
        taiyuan();
        int iImpromptu = impromptu(k);
        if (iImpromptu >= 0) {
            return (V) ((wireman) this.f22370kowloon[iImpromptu]).setValue(v);
        }
        formularize();
        int i = -(iImpromptu + 1);
        if (i >= 16) {
            return monoploid().put(k, v);
        }
        int i2 = this.f22368arytenoidectomy;
        if (i2 == 16) {
            wireman wiremanVar = (wireman) this.f22370kowloon[15];
            this.f22368arytenoidectomy = i2 - 1;
            monoploid().put(wiremanVar.getKey(), wiremanVar.getValue());
        }
        Object[] objArr = this.f22370kowloon;
        System.arraycopy(objArr, i, objArr, i + 1, (objArr.length - i) - 1);
        this.f22370kowloon[i] = new wireman(k, v);
        this.f22368arytenoidectomy++;
        return null;
    }

    public Iterable<Map.Entry<K, V>> arytenoidectomy() {
        return this.f22372monoploid.isEmpty() ? Collections.EMPTY_SET : this.f22372monoploid.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        taiyuan();
        if (this.f22368arytenoidectomy != 0) {
            this.f22370kowloon = null;
            this.f22368arytenoidectomy = 0;
        }
        if (this.f22372monoploid.isEmpty()) {
            return;
        }
        this.f22372monoploid.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return impromptu(comparable) >= 0 || this.f22372monoploid.containsKey(comparable);
    }

    public Set<Map.Entry<K, V>> cutely() {
        return new dern(this, null);
    }

    public final V dovishness(int i) {
        taiyuan();
        V v = (V) ((wireman) this.f22370kowloon[i]).getValue();
        Object[] objArr = this.f22370kowloon;
        System.arraycopy(objArr, i + 1, objArr, i, (this.f22368arytenoidectomy - i) - 1);
        this.f22368arytenoidectomy--;
        if (!this.f22372monoploid.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = monoploid().entrySet().iterator();
            this.f22370kowloon[this.f22368arytenoidectomy] = new wireman(this, it.next());
            this.f22368arytenoidectomy++;
            it.remove();
        }
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f22371molybdenite == null) {
            this.f22371molybdenite = new beachfront(this, null);
        }
        return this.f22371molybdenite;
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
        int iTriweekly = triweekly();
        if (iTriweekly != treadlessVar.triweekly()) {
            return entrySet().equals(treadlessVar.entrySet());
        }
        for (int i = 0; i < iTriweekly; i++) {
            if (!impassible(i).equals(treadlessVar.impassible(i))) {
                return false;
            }
        }
        if (iTriweekly != size) {
            return this.f22372monoploid.equals(treadlessVar.f22372monoploid);
        }
        return true;
    }

    public final void formularize() {
        taiyuan();
        if (this.f22370kowloon == null) {
            this.f22370kowloon = new Object[16];
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iImpromptu = impromptu(comparable);
        return iImpromptu >= 0 ? (V) ((wireman) this.f22370kowloon[iImpromptu]).getValue() : this.f22372monoploid.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iTriweekly = triweekly();
        int iHashCode = 0;
        for (int i = 0; i < iTriweekly; i++) {
            iHashCode += this.f22370kowloon[i].hashCode();
        }
        return kowloon() > 0 ? iHashCode + this.f22372monoploid.hashCode() : iHashCode;
    }

    public Map.Entry<K, V> impassible(int i) {
        if (i < this.f22368arytenoidectomy) {
            return (wireman) this.f22370kowloon[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0020  */
    /* JADX WARN: Code duplicated, block: B:17:0x003a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x003e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0034 A[SYNTHETIC] */
    public final int impromptu(K k) {
        int i;
        int i2;
        int i3;
        int iCompareTo;
        int i4 = this.f22368arytenoidectomy;
        int i5 = i4 - 1;
        if (i5 < 0) {
            i = 0;
            while (i <= i5) {
                i3 = (i + i5) / 2;
                iCompareTo = k.compareTo(((wireman) this.f22370kowloon[i3]).getKey());
                if (iCompareTo < 0) {
                    i5 = i3 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i3;
                    }
                    i = i3 + 1;
                }
            }
            i2 = i + 1;
        } else {
            int iCompareTo2 = k.compareTo(((wireman) this.f22370kowloon[i5]).getKey());
            if (iCompareTo2 > 0) {
                i2 = i4 + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i5;
                }
                i = 0;
                while (i <= i5) {
                    i3 = (i + i5) / 2;
                    iCompareTo = k.compareTo(((wireman) this.f22370kowloon[i3]).getKey());
                    if (iCompareTo < 0) {
                        i5 = i3 - 1;
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

    public int kowloon() {
        return this.f22372monoploid.size();
    }

    public void molybdenite() {
        if (this.f22373polloi) {
            return;
        }
        this.f22372monoploid = this.f22372monoploid.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f22372monoploid);
        this.f22369graveside = this.f22369graveside.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f22369graveside);
        this.f22373polloi = true;
    }

    public final SortedMap<K, V> monoploid() {
        taiyuan();
        if (this.f22372monoploid.isEmpty() && !(this.f22372monoploid instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f22372monoploid = treeMap;
            this.f22369graveside = treeMap.descendingMap();
        }
        return (SortedMap) this.f22372monoploid;
    }

    public boolean polloi() {
        return this.f22373polloi;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        taiyuan();
        Comparable comparable = (Comparable) obj;
        int iImpromptu = impromptu(comparable);
        if (iImpromptu >= 0) {
            return dovishness(iImpromptu);
        }
        if (this.f22372monoploid.isEmpty()) {
            return null;
        }
        return this.f22372monoploid.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f22368arytenoidectomy + this.f22372monoploid.size();
    }

    public final void taiyuan() {
        if (this.f22373polloi) {
            throw new UnsupportedOperationException();
        }
    }

    public int triweekly() {
        return this.f22368arytenoidectomy;
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    public class marial implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public boolean f22376arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public int f22377kowloon;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f22378monoploid;

        public marial() {
            this.f22377kowloon = -1;
        }

        public final Iterator<Map.Entry<K, V>> attabal() {
            if (this.f22378monoploid == null) {
                this.f22378monoploid = treadless.this.f22372monoploid.entrySet().iterator();
            }
            return this.f22378monoploid;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f22377kowloon + 1 < treadless.this.f22368arytenoidectomy || (!treadless.this.f22372monoploid.isEmpty() && attabal().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f22376arytenoidectomy) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f22376arytenoidectomy = false;
            treadless.this.taiyuan();
            if (this.f22377kowloon >= treadless.this.f22368arytenoidectomy) {
                attabal().remove();
                return;
            }
            treadless treadlessVar = treadless.this;
            int i = this.f22377kowloon;
            this.f22377kowloon = i - 1;
            treadlessVar.dovishness(i);
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f22376arytenoidectomy = true;
            int i = this.f22377kowloon + 1;
            this.f22377kowloon = i;
            return i < treadless.this.f22368arytenoidectomy ? (wireman) treadless.this.f22370kowloon[this.f22377kowloon] : attabal().next();
        }

        public /* synthetic */ marial(treadless treadlessVar, attabal attabalVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    public class saneness implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f22380arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public int f22381kowloon;

        public saneness() {
            this.f22381kowloon = treadless.this.f22368arytenoidectomy;
        }

        public final Iterator<Map.Entry<K, V>> attabal() {
            if (this.f22380arytenoidectomy == null) {
                this.f22380arytenoidectomy = treadless.this.f22369graveside.entrySet().iterator();
            }
            return this.f22380arytenoidectomy;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i = this.f22381kowloon;
            return (i > 0 && i <= treadless.this.f22368arytenoidectomy) || attabal().hasNext();
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
            Object[] objArr = treadless.this.f22370kowloon;
            int i = this.f22381kowloon - 1;
            this.f22381kowloon = i;
            return (wireman) objArr[i];
        }

        public /* synthetic */ saneness(treadless treadlessVar, attabal attabalVar) {
            this();
        }
    }

    public treadless() {
        Map<K, V> map = Collections.EMPTY_MAP;
        this.f22372monoploid = map;
        this.f22369graveside = map;
    }
}
