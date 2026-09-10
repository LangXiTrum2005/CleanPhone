package kotlin.reflect.jvm.internal.impl.protobuf;

import android.support.v4.media.a;
import com.p004ironsource.d9;
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

/* JADX INFO: loaded from: classes7.dex */
class SmallSortedMap<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public static final /* synthetic */ int g0 = 0;
    public final int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public List f44226Y = Collections.EMPTY_LIST;
    public Map Z = Collections.EMPTY_MAP;
    public boolean e0;
    public volatile EntrySet f0;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap$1, reason: invalid class name */
    final class AnonymousClass1 extends SmallSortedMap<FieldSet.FieldDescriptorLite<Object>, Object> {
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap
        public final void e() {
            if (!this.e0) {
                for (int i2 = 0; i2 < this.f44226Y.size(); i2++) {
                    Map.Entry entry = (Map.Entry) this.f44226Y.get(i2);
                    if (((FieldSet.FieldDescriptorLite) entry.getKey()).isRepeated()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
                for (Map.Entry entry2 : c()) {
                    if (((FieldSet.FieldDescriptorLite) entry2.getKey()).isRepeated()) {
                        entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                    }
                }
            }
            super.e();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return put((FieldSet.FieldDescriptorLite) obj, obj2);
        }
    }

    public static class EmptySet {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Iterator f44227a = new AnonymousClass1();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Iterable f44228b = new AnonymousClass2();

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap$EmptySet$1, reason: invalid class name */
        public static class AnonymousClass1 implements Iterator<Object> {
            @Override // java.util.Iterator
            public final boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public final Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap$EmptySet$2, reason: invalid class name */
        public static class AnonymousClass2 implements Iterable<Object> {
            @Override // java.lang.Iterable
            public final Iterator<Object> iterator() {
                return EmptySet.f44227a;
            }
        }
    }

    public class Entry implements Comparable<SmallSortedMap<K, V>.Entry>, Map.Entry<K, V> {
        public final Comparable X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public Object f44229Y;

        public Entry(Comparable comparable, Object obj) {
            this.X = comparable;
            this.f44229Y = obj;
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
                        Object obj2 = this.f44229Y;
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
            return this.f44229Y;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            Comparable comparable = this.X;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f44229Y;
            return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            int i2 = SmallSortedMap.g0;
            SmallSortedMap.this.b();
            Object obj2 = this.f44229Y;
            this.f44229Y = obj;
            return obj2;
        }

        public final String toString() {
            String strValueOf = String.valueOf(this.X);
            String strValueOf2 = String.valueOf(this.f44229Y);
            return a.s(new StringBuilder(strValueOf2.length() + strValueOf.length() + 1), strValueOf, d9.i.f24747b, strValueOf2);
        }
    }

    public class EntryIterator implements Iterator<Map.Entry<K, V>> {
        public int X = -1;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public boolean f44230Y;
        public Iterator Z;

        public EntryIterator() {
        }

        public final Iterator a() {
            if (this.Z == null) {
                this.Z = SmallSortedMap.this.Z.entrySet().iterator();
            }
            return this.Z;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.X + 1 < SmallSortedMap.this.f44226Y.size() || a().hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.f44230Y = true;
            int i2 = this.X + 1;
            this.X = i2;
            SmallSortedMap smallSortedMap = SmallSortedMap.this;
            return i2 < smallSortedMap.f44226Y.size() ? (Map.Entry) smallSortedMap.f44226Y.get(this.X) : (Map.Entry) a().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f44230Y) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f44230Y = false;
            int i2 = SmallSortedMap.g0;
            SmallSortedMap smallSortedMap = SmallSortedMap.this;
            smallSortedMap.b();
            if (this.X >= smallSortedMap.f44226Y.size()) {
                a().remove();
                return;
            }
            int i3 = this.X;
            this.X = i3 - 1;
            smallSortedMap.g(i3);
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
        public final Iterator iterator() {
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

    public SmallSortedMap(int i2) {
        this.X = i2;
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
        int size = this.f44226Y.size();
        int i5 = size - 1;
        if (i5 < 0) {
            i2 = 0;
            while (i2 <= i5) {
                i4 = (i2 + i5) / 2;
                iCompareTo = comparable.compareTo(((Entry) this.f44226Y.get(i4)).X);
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
            int iCompareTo2 = comparable.compareTo(((Entry) this.f44226Y.get(i5)).X);
            if (iCompareTo2 > 0) {
                i3 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i5;
                }
                i2 = 0;
                while (i2 <= i5) {
                    i4 = (i2 + i5) / 2;
                    iCompareTo = comparable.compareTo(((Entry) this.f44226Y.get(i4)).X);
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
        if (this.e0) {
            throw new UnsupportedOperationException();
        }
    }

    public final Iterable c() {
        return this.Z.isEmpty() ? EmptySet.f44228b : this.Z.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f44226Y.isEmpty()) {
            this.f44226Y.clear();
        }
        if (this.Z.isEmpty()) {
            return;
        }
        this.Z.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.Z.containsKey(comparable);
    }

    public final SortedMap d() {
        b();
        if (this.Z.isEmpty() && !(this.Z instanceof TreeMap)) {
            this.Z = new TreeMap();
        }
        return (SortedMap) this.Z;
    }

    public void e() {
        if (this.e0) {
            return;
        }
        this.Z = this.Z.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.Z);
        this.e0 = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f0 == null) {
            this.f0 = new EntrySet();
        }
        return this.f0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((Entry) this.f44226Y.get(iA)).setValue(obj);
        }
        b();
        boolean zIsEmpty = this.f44226Y.isEmpty();
        int i2 = this.X;
        if (zIsEmpty && !(this.f44226Y instanceof ArrayList)) {
            this.f44226Y = new ArrayList(i2);
        }
        int i3 = -(iA + 1);
        if (i3 >= i2) {
            return d().put(comparable, obj);
        }
        if (this.f44226Y.size() == i2) {
            Entry entry = (Entry) this.f44226Y.remove(i2 - 1);
            d().put(entry.X, entry.f44229Y);
        }
        this.f44226Y.add(i3, new Entry(comparable, obj));
        return null;
    }

    public final Object g(int i2) {
        b();
        Object obj = ((Entry) this.f44226Y.remove(i2)).f44229Y;
        if (!this.Z.isEmpty()) {
            Iterator it = d().entrySet().iterator();
            List list = this.f44226Y;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new Entry((Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((Entry) this.f44226Y.get(iA)).f44229Y : this.Z.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return g(iA);
        }
        if (this.Z.isEmpty()) {
            return null;
        }
        return this.Z.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.Z.size() + this.f44226Y.size();
    }
}
