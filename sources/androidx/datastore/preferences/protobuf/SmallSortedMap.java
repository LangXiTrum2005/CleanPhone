package androidx.datastore.preferences.protobuf;

import com.p004ironsource.d9;
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

/* JADX INFO: loaded from: classes.dex */
class SmallSortedMap<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public static final /* synthetic */ int h0 = 0;
    public List X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Map f4917Y;
    public boolean Z;
    public volatile EntrySet e0;
    public Map f0;
    public volatile DescendingEntrySet g0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.SmallSortedMap$1, reason: invalid class name */
    class AnonymousClass1 extends SmallSortedMap<FieldSet.FieldDescriptorLite<Object>, Object> {
        @Override // androidx.datastore.preferences.protobuf.SmallSortedMap
        public final void f() {
            if (!this.Z) {
                for (int i2 = 0; i2 < this.X.size(); i2++) {
                    Map.Entry entryC = c(i2);
                    if (((FieldSet.FieldDescriptorLite) entryC.getKey()).isRepeated()) {
                        entryC.setValue(Collections.unmodifiableList((List) entryC.getValue()));
                    }
                }
                for (Map.Entry entry : d()) {
                    if (((FieldSet.FieldDescriptorLite) entry.getKey()).isRepeated()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.f();
        }

        @Override // androidx.datastore.preferences.protobuf.SmallSortedMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return put((Comparable) obj, obj2);
        }
    }

    public class DescendingEntryIterator implements Iterator<Map.Entry<K, V>> {
        public int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public Iterator f4918Y;

        public DescendingEntryIterator() {
            this.X = SmallSortedMap.this.X.size();
        }

        public final Iterator a() {
            if (this.f4918Y == null) {
                this.f4918Y = SmallSortedMap.this.f0.entrySet().iterator();
            }
            return this.f4918Y;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i2 = this.X;
            return (i2 > 0 && i2 <= SmallSortedMap.this.X.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (a().hasNext()) {
                return (Map.Entry) a().next();
            }
            List list = SmallSortedMap.this.X;
            int i2 = this.X - 1;
            this.X = i2;
            return (Map.Entry) list.get(i2);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public class DescendingEntrySet extends SmallSortedMap<K, V>.EntrySet {
        public DescendingEntrySet() {
            super();
        }

        @Override // androidx.datastore.preferences.protobuf.SmallSortedMap.EntrySet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new DescendingEntryIterator();
        }
    }

    public class Entry implements Map.Entry<K, V>, Comparable<SmallSortedMap<K, V>.Entry> {
        public final Comparable X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public Object f4920Y;

        public Entry(Comparable comparable, Object obj) {
            this.X = comparable;
            this.f4920Y = obj;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.X.compareTo(((Entry) obj).X);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            boolean zEquals;
            boolean zEquals2;
            if (obj != this) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    Comparable comparable = this.X;
                    if (comparable == null) {
                        zEquals = key == null;
                    } else {
                        zEquals = comparable.equals(key);
                    }
                    if (zEquals) {
                        Object obj2 = this.f4920Y;
                        Object value = entry.getValue();
                        if (obj2 == null) {
                            zEquals2 = value == null;
                        } else {
                            zEquals2 = obj2.equals(value);
                        }
                        if (zEquals2) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.X;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            return this.f4920Y;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            Comparable comparable = this.X;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f4920Y;
            return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            int i2 = SmallSortedMap.h0;
            SmallSortedMap.this.b();
            Object obj2 = this.f4920Y;
            this.f4920Y = obj;
            return obj2;
        }

        public final String toString() {
            return this.X + d9.i.f24747b + this.f4920Y;
        }
    }

    public class EntryIterator implements Iterator<Map.Entry<K, V>> {
        public int X = -1;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public boolean f4921Y;
        public Iterator Z;

        public EntryIterator() {
        }

        public final Iterator a() {
            if (this.Z == null) {
                this.Z = SmallSortedMap.this.f4917Y.entrySet().iterator();
            }
            return this.Z;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i2 = this.X + 1;
            SmallSortedMap smallSortedMap = SmallSortedMap.this;
            return i2 < smallSortedMap.X.size() || (!smallSortedMap.f4917Y.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.f4921Y = true;
            int i2 = this.X + 1;
            this.X = i2;
            SmallSortedMap smallSortedMap = SmallSortedMap.this;
            return i2 < smallSortedMap.X.size() ? (Map.Entry) smallSortedMap.X.get(this.X) : (Map.Entry) a().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f4921Y) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f4921Y = false;
            int i2 = SmallSortedMap.h0;
            SmallSortedMap smallSortedMap = SmallSortedMap.this;
            smallSortedMap.b();
            if (this.X >= smallSortedMap.X.size()) {
                a().remove();
                return;
            }
            int i3 = this.X;
            this.X = i3 - 1;
            smallSortedMap.i(i3);
        }
    }

    public class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        public EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            SmallSortedMap.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            SmallSortedMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = SmallSortedMap.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new EntryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            SmallSortedMap.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return SmallSortedMap.this.size();
        }
    }

    public static AnonymousClass1 g() {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        anonymousClass1.X = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        anonymousClass1.f4917Y = map;
        anonymousClass1.f0 = map;
        return anonymousClass1;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    public final int a(Comparable comparable) {
        int i2;
        int i3;
        int i4;
        int iCompareTo;
        int size = this.X.size();
        int i5 = size - 1;
        if (i5 < 0) {
            i2 = 0;
            while (i2 <= i5) {
                i4 = (i2 + i5) / 2;
                iCompareTo = comparable.compareTo(((Entry) this.X.get(i4)).X);
                if (iCompareTo < 0) {
                    i5 = i4 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i4;
                    }
                    i2 = i4 + 1;
                }
            }
            i3 = i2 + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((Entry) this.X.get(i5)).X);
            if (iCompareTo2 > 0) {
                i3 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i5;
                }
                i2 = 0;
                while (i2 <= i5) {
                    i4 = (i2 + i5) / 2;
                    iCompareTo = comparable.compareTo(((Entry) this.X.get(i4)).X);
                    if (iCompareTo < 0) {
                        i5 = i4 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i4;
                        }
                        i2 = i4 + 1;
                    }
                }
                i3 = i2 + 1;
            }
        }
        return -i3;
    }

    public final void b() {
        if (this.Z) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i2) {
        return (Map.Entry) this.X.get(i2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.X.isEmpty()) {
            this.X.clear();
        }
        if (this.f4917Y.isEmpty()) {
            return;
        }
        this.f4917Y.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f4917Y.containsKey(comparable);
    }

    public final Set d() {
        return this.f4917Y.isEmpty() ? Collections.EMPTY_SET : this.f4917Y.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f4917Y.isEmpty() && !(this.f4917Y instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f4917Y = treeMap;
            this.f0 = treeMap.descendingMap();
        }
        return (SortedMap) this.f4917Y;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.e0 == null) {
            this.e0 = new EntrySet();
        }
        return this.e0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmallSortedMap)) {
            return super.equals(obj);
        }
        SmallSortedMap smallSortedMap = (SmallSortedMap) obj;
        int size = size();
        if (size == smallSortedMap.size()) {
            int size2 = this.X.size();
            if (size2 != smallSortedMap.X.size()) {
                return ((AbstractSet) entrySet()).equals(smallSortedMap.entrySet());
            }
            for (int i2 = 0; i2 < size2; i2++) {
                if (c(i2).equals(smallSortedMap.c(i2))) {
                }
            }
            if (size2 != size) {
                return this.f4917Y.equals(smallSortedMap.f4917Y);
            }
            return true;
        }
        return false;
    }

    public void f() {
        if (this.Z) {
            return;
        }
        this.f4917Y = this.f4917Y.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f4917Y);
        this.f0 = this.f0.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f0);
        this.Z = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((Entry) this.X.get(iA)).f4920Y : this.f4917Y.get(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((Entry) this.X.get(iA)).setValue(obj);
        }
        b();
        if (this.X.isEmpty() && !(this.X instanceof ArrayList)) {
            this.X = new ArrayList(16);
        }
        int i2 = -(iA + 1);
        if (i2 >= 16) {
            return e().put(comparable, obj);
        }
        if (this.X.size() == 16) {
            Entry entry = (Entry) this.X.remove(15);
            e().put(entry.X, entry.f4920Y);
        }
        this.X.add(i2, new Entry(comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.X.size();
        int iHashCode = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iHashCode += ((Entry) this.X.get(i2)).hashCode();
        }
        return this.f4917Y.size() > 0 ? this.f4917Y.hashCode() + iHashCode : iHashCode;
    }

    public final Object i(int i2) {
        b();
        Object obj = ((Entry) this.X.remove(i2)).f4920Y;
        if (!this.f4917Y.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.X;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new Entry((Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return i(iA);
        }
        if (this.f4917Y.isEmpty()) {
            return null;
        }
        return this.f4917Y.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f4917Y.size() + this.X.size();
    }
}
