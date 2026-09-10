package com.google.protobuf;

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
/* JADX INFO: loaded from: classes3.dex */
public class privatdozent<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private List<privatdozent<K, V>.marial> entryList;
    private boolean isImmutable;
    private volatile privatdozent<K, V>.dern lazyDescendingEntrySet;
    private volatile privatdozent<K, V>.competently lazyEntrySet;
    private final int maxArraySize;
    private Map<K, V> overflowEntries;
    private Map<K, V> overflowEntriesDescending;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* JADX INFO: compiled from: SmallSortedMap.java */
    public class attabal<FieldDescriptorType> extends privatdozent<FieldDescriptorType, Object> {
        public attabal(int i) {
            super(i, null);
        }

        @Override // com.google.protobuf.privatdozent
        public void makeImmutable() {
            if (!isImmutable()) {
                for (int i = 0; i < getNumArrayEntries(); i++) {
                    Map.Entry<FieldDescriptorType, Object> arrayEntryAt = getArrayEntryAt(i);
                    if (((FieldSet.FieldDescriptorLite) arrayEntryAt.getKey()).isRepeated()) {
                        arrayEntryAt.setValue(Collections.unmodifiableList((List) arrayEntryAt.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : getOverflowEntries()) {
                    if (((FieldSet.FieldDescriptorLite) entry.getKey()).isRepeated()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.makeImmutable();
        }

        @Override // com.google.protobuf.privatdozent, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.put((Comparable) obj, obj2);
        }
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    public class beachfront implements Iterator<Map.Entry<K, V>> {
        private Iterator<Map.Entry<K, V>> lazyOverflowIterator;
        private boolean nextCalledBeforeRemove;
        private int pos;

        private beachfront() {
            this.pos = -1;
        }

        private Iterator<Map.Entry<K, V>> getOverflowIterator() {
            if (this.lazyOverflowIterator == null) {
                this.lazyOverflowIterator = privatdozent.this.overflowEntries.entrySet().iterator();
            }
            return this.lazyOverflowIterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.pos + 1 < privatdozent.this.entryList.size() || (!privatdozent.this.overflowEntries.isEmpty() && getOverflowIterator().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.nextCalledBeforeRemove) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.nextCalledBeforeRemove = false;
            privatdozent.this.checkMutable();
            if (this.pos >= privatdozent.this.entryList.size()) {
                getOverflowIterator().remove();
                return;
            }
            privatdozent privatdozentVar = privatdozent.this;
            int i = this.pos;
            this.pos = i - 1;
            privatdozentVar.removeArrayEntryAt(i);
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            this.nextCalledBeforeRemove = true;
            int i = this.pos + 1;
            this.pos = i;
            return i < privatdozent.this.entryList.size() ? (Map.Entry) privatdozent.this.entryList.get(this.pos) : getOverflowIterator().next();
        }

        public /* synthetic */ beachfront(privatdozent privatdozentVar, attabal attabalVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    public class competently extends AbstractSet<Map.Entry<K, V>> {
        private competently() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            privatdozent.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = privatdozent.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new beachfront(privatdozent.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            privatdozent.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return privatdozent.this.size();
        }

        public /* synthetic */ competently(privatdozent privatdozentVar, attabal attabalVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            privatdozent.this.put((Comparable) entry.getKey(), (Object) entry.getValue());
            return true;
        }
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    public class dern extends privatdozent<K, V>.competently {
        private dern() {
            super(privatdozent.this, null);
        }

        @Override // com.google.protobuf.privatdozent.competently, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new saneness(privatdozent.this, null);
        }

        public /* synthetic */ dern(privatdozent privatdozentVar, attabal attabalVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    public class marial implements Map.Entry<K, V>, Comparable<privatdozent<K, V>.marial> {
        private final K key;
        private V value;

        public marial(privatdozent privatdozentVar, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
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
            return equals(this.key, entry.getKey()) && equals(this.value, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.key;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v = this.value;
            return iHashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            privatdozent.this.checkMutable();
            V v2 = this.value;
            this.value = v;
            return v2;
        }

        public String toString() {
            return this.key + X3.j.b + this.value;
        }

        public marial(K k, V v) {
            this.key = k;
            this.value = v;
        }

        @Override // java.lang.Comparable
        public int compareTo(privatdozent<K, V>.marial marialVar) {
            return getKey().compareTo(marialVar.getKey());
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        private boolean equals(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    public class saneness implements Iterator<Map.Entry<K, V>> {
        private Iterator<Map.Entry<K, V>> lazyOverflowIterator;
        private int pos;

        private saneness() {
            this.pos = privatdozent.this.entryList.size();
        }

        private Iterator<Map.Entry<K, V>> getOverflowIterator() {
            if (this.lazyOverflowIterator == null) {
                this.lazyOverflowIterator = privatdozent.this.overflowEntriesDescending.entrySet().iterator();
            }
            return this.lazyOverflowIterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i = this.pos;
            return (i > 0 && i <= privatdozent.this.entryList.size()) || getOverflowIterator().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            if (getOverflowIterator().hasNext()) {
                return getOverflowIterator().next();
            }
            List list = privatdozent.this.entryList;
            int i = this.pos - 1;
            this.pos = i;
            return (Map.Entry) list.get(i);
        }

        public /* synthetic */ saneness(privatdozent privatdozentVar, attabal attabalVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    public static class wireman {
        private static final Iterator<Object> ITERATOR = new attabal();
        private static final Iterable<Object> ITERABLE = new saneness();

        /* JADX INFO: compiled from: SmallSortedMap.java */
        public class attabal implements Iterator<Object> {
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

        /* JADX INFO: compiled from: SmallSortedMap.java */
        public class saneness implements Iterable<Object> {
            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return wireman.ITERATOR;
            }
        }

        private wireman() {
        }

        public static <T> Iterable<T> iterable() {
            return (Iterable<T>) ITERABLE;
        }
    }

    public /* synthetic */ privatdozent(int i, attabal attabalVar) {
        this(i);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c A[SYNTHETIC] */
    private int binarySearchInArray(K k) {
        int i;
        int i2;
        int i3;
        int iCompareTo;
        int size = this.entryList.size();
        int i4 = size - 1;
        if (i4 < 0) {
            i = 0;
            while (i <= i4) {
                i3 = (i + i4) / 2;
                iCompareTo = k.compareTo(this.entryList.get(i3).getKey());
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
            int iCompareTo2 = k.compareTo(this.entryList.get(i4).getKey());
            if (iCompareTo2 > 0) {
                i2 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i4;
                }
                i = 0;
                while (i <= i4) {
                    i3 = (i + i4) / 2;
                    iCompareTo = k.compareTo(this.entryList.get(i3).getKey());
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

    /* JADX INFO: Access modifiers changed from: private */
    public void checkMutable() {
        if (this.isImmutable) {
            throw new UnsupportedOperationException();
        }
    }

    private void ensureEntryArrayMutable() {
        checkMutable();
        if (!this.entryList.isEmpty() || (this.entryList instanceof ArrayList)) {
            return;
        }
        this.entryList = new ArrayList(this.maxArraySize);
    }

    private SortedMap<K, V> getOverflowEntriesMutable() {
        checkMutable();
        if (this.overflowEntries.isEmpty() && !(this.overflowEntries instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.overflowEntries = treeMap;
            this.overflowEntriesDescending = treeMap.descendingMap();
        }
        return (SortedMap) this.overflowEntries;
    }

    public static <FieldDescriptorType extends FieldSet.FieldDescriptorLite<FieldDescriptorType>> privatdozent<FieldDescriptorType, Object> newFieldMap(int i) {
        return new attabal(i);
    }

    public static <K extends Comparable<K>, V> privatdozent<K, V> newInstanceForTest(int i) {
        return new privatdozent<>(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V removeArrayEntryAt(int i) {
        checkMutable();
        V value = this.entryList.remove(i).getValue();
        if (!this.overflowEntries.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = getOverflowEntriesMutable().entrySet().iterator();
            this.entryList.add(new marial(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        checkMutable();
        if (!this.entryList.isEmpty()) {
            this.entryList.clear();
        }
        if (this.overflowEntries.isEmpty()) {
            return;
        }
        this.overflowEntries.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return binarySearchInArray(comparable) >= 0 || this.overflowEntries.containsKey(comparable);
    }

    public Set<Map.Entry<K, V>> descendingEntrySet() {
        if (this.lazyDescendingEntrySet == null) {
            this.lazyDescendingEntrySet = new dern(this, null);
        }
        return this.lazyDescendingEntrySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.lazyEntrySet == null) {
            this.lazyEntrySet = new competently(this, null);
        }
        return this.lazyEntrySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof privatdozent)) {
            return super.equals(obj);
        }
        privatdozent privatdozentVar = (privatdozent) obj;
        int size = size();
        if (size != privatdozentVar.size()) {
            return false;
        }
        int numArrayEntries = getNumArrayEntries();
        if (numArrayEntries != privatdozentVar.getNumArrayEntries()) {
            return entrySet().equals(privatdozentVar.entrySet());
        }
        for (int i = 0; i < numArrayEntries; i++) {
            if (!getArrayEntryAt(i).equals(privatdozentVar.getArrayEntryAt(i))) {
                return false;
            }
        }
        if (numArrayEntries != size) {
            return this.overflowEntries.equals(privatdozentVar.overflowEntries);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iBinarySearchInArray = binarySearchInArray(comparable);
        return iBinarySearchInArray >= 0 ? this.entryList.get(iBinarySearchInArray).getValue() : this.overflowEntries.get(comparable);
    }

    public Map.Entry<K, V> getArrayEntryAt(int i) {
        return this.entryList.get(i);
    }

    public int getNumArrayEntries() {
        return this.entryList.size();
    }

    public int getNumOverflowEntries() {
        return this.overflowEntries.size();
    }

    public Iterable<Map.Entry<K, V>> getOverflowEntries() {
        return this.overflowEntries.isEmpty() ? wireman.iterable() : this.overflowEntries.entrySet();
    }

    public Iterable<Map.Entry<K, V>> getOverflowEntriesDescending() {
        return this.overflowEntriesDescending.isEmpty() ? wireman.iterable() : this.overflowEntriesDescending.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int numArrayEntries = getNumArrayEntries();
        int iHashCode = 0;
        for (int i = 0; i < numArrayEntries; i++) {
            iHashCode += this.entryList.get(i).hashCode();
        }
        return getNumOverflowEntries() > 0 ? iHashCode + this.overflowEntries.hashCode() : iHashCode;
    }

    public boolean isImmutable() {
        return this.isImmutable;
    }

    public void makeImmutable() {
        if (this.isImmutable) {
            return;
        }
        this.overflowEntries = this.overflowEntries.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.overflowEntries);
        this.overflowEntriesDescending = this.overflowEntriesDescending.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.overflowEntriesDescending);
        this.isImmutable = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        checkMutable();
        Comparable comparable = (Comparable) obj;
        int iBinarySearchInArray = binarySearchInArray(comparable);
        if (iBinarySearchInArray >= 0) {
            return removeArrayEntryAt(iBinarySearchInArray);
        }
        if (this.overflowEntries.isEmpty()) {
            return null;
        }
        return this.overflowEntries.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.entryList.size() + this.overflowEntries.size();
    }

    private privatdozent(int i) {
        this.maxArraySize = i;
        this.entryList = Collections.EMPTY_LIST;
        Map<K, V> map = Collections.EMPTY_MAP;
        this.overflowEntries = map;
        this.overflowEntriesDescending = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        checkMutable();
        int iBinarySearchInArray = binarySearchInArray(k);
        if (iBinarySearchInArray >= 0) {
            return this.entryList.get(iBinarySearchInArray).setValue(v);
        }
        ensureEntryArrayMutable();
        int i = -(iBinarySearchInArray + 1);
        if (i >= this.maxArraySize) {
            return getOverflowEntriesMutable().put(k, v);
        }
        int size = this.entryList.size();
        int i2 = this.maxArraySize;
        if (size == i2) {
            privatdozent<K, V>.marial marialVarRemove = this.entryList.remove(i2 - 1);
            getOverflowEntriesMutable().put(marialVarRemove.getKey(), marialVarRemove.getValue());
        }
        this.entryList.add(i, new marial(k, v));
        return null;
    }
}
