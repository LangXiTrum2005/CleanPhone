package androidx.arch.core.internal;

import com.p004ironsource.d9;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SafeIterableMap<K, V> implements Iterable<Map.Entry<K, V>> {
    public Entry X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Entry f3680Y;
    public final WeakHashMap Z = new WeakHashMap();
    public int e0 = 0;

    public static class AscendingIterator<K, V> extends ListIterator<K, V> {
        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        public final Entry b(Entry entry) {
            return entry.e0;
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        public final Entry c(Entry entry) {
            return entry.Z;
        }
    }

    public static class DescendingIterator<K, V> extends ListIterator<K, V> {
        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        public final Entry b(Entry entry) {
            return entry.Z;
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        public final Entry c(Entry entry) {
            return entry.e0;
        }
    }

    public static class Entry<K, V> implements Map.Entry<K, V> {
        public final Object X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Object f3681Y;
        public Entry Z;
        public Entry e0;

        public Entry(Object obj, Object obj2) {
            this.X = obj;
            this.f3681Y = obj2;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return this.X.equals(entry.X) && this.f3681Y.equals(entry.f3681Y);
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.X;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            return this.f3681Y;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.X.hashCode() ^ this.f3681Y.hashCode();
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            return this.X + d9.i.f24747b + this.f3681Y;
        }
    }

    public class IteratorWithAdditions extends SupportRemove<K, V> implements Iterator<Map.Entry<K, V>> {
        public Entry X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public boolean f3682Y = true;

        public IteratorWithAdditions() {
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.SupportRemove
        public final void a(Entry entry) {
            Entry entry2 = this.X;
            if (entry == entry2) {
                Entry entry3 = entry2.e0;
                this.X = entry3;
                this.f3682Y = entry3 == null;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f3682Y) {
                return SafeIterableMap.this.X != null;
            }
            Entry entry = this.X;
            return (entry == null || entry.Z == null) ? false : true;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (this.f3682Y) {
                this.f3682Y = false;
                this.X = SafeIterableMap.this.X;
            } else {
                Entry entry = this.X;
                this.X = entry != null ? entry.Z : null;
            }
            return this.X;
        }
    }

    public static abstract class ListIterator<K, V> extends SupportRemove<K, V> implements Iterator<Map.Entry<K, V>> {
        public Entry X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public Entry f3683Y;

        public ListIterator(Entry entry, Entry entry2) {
            this.X = entry2;
            this.f3683Y = entry;
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.SupportRemove
        public final void a(Entry entry) {
            Entry entryC = null;
            if (this.X == entry && entry == this.f3683Y) {
                this.f3683Y = null;
                this.X = null;
            }
            Entry entry2 = this.X;
            if (entry2 == entry) {
                this.X = b(entry2);
            }
            Entry entry3 = this.f3683Y;
            if (entry3 == entry) {
                Entry entry4 = this.X;
                if (entry3 != entry4 && entry4 != null) {
                    entryC = c(entry3);
                }
                this.f3683Y = entryC;
            }
        }

        public abstract Entry b(Entry entry);

        public abstract Entry c(Entry entry);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f3683Y != null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            Entry entry = this.f3683Y;
            Entry entry2 = this.X;
            this.f3683Y = (entry == entry2 || entry2 == null) ? null : c(entry);
            return entry;
        }
    }

    public static abstract class SupportRemove<K, V> {
        public abstract void a(Entry entry);
    }

    public Entry a(Object obj) {
        Entry entry = this.X;
        while (entry != null && !entry.X.equals(obj)) {
            entry = entry.Z;
        }
        return entry;
    }

    public Object c(Object obj, Object obj2) {
        Entry entryA = a(obj);
        if (entryA != null) {
            return entryA.f3681Y;
        }
        Entry entry = new Entry(obj, obj2);
        this.e0++;
        Entry entry2 = this.f3680Y;
        if (entry2 == null) {
            this.X = entry;
            this.f3680Y = entry;
            return null;
        }
        entry2.Z = entry;
        entry.e0 = entry2;
        this.f3680Y = entry;
        return null;
    }

    public Object d(Object obj) {
        Entry entryA = a(obj);
        if (entryA == null) {
            return null;
        }
        this.e0--;
        WeakHashMap weakHashMap = this.Z;
        if (!weakHashMap.isEmpty()) {
            Iterator<K> it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((SupportRemove) it.next()).a(entryA);
            }
        }
        Entry entry = entryA.e0;
        if (entry != null) {
            entry.Z = entryA.Z;
        } else {
            this.X = entryA.Z;
        }
        Entry entry2 = entryA.Z;
        if (entry2 != null) {
            entry2.e0 = entry;
        } else {
            this.f3680Y = entry;
        }
        entryA.Z = null;
        entryA.e0 = null;
        return entryA.f3681Y;
    }

    public final Iterator descendingIterator() {
        DescendingIterator descendingIterator = new DescendingIterator(this.f3680Y, this.X);
        this.Z.put(descendingIterator, Boolean.FALSE);
        return descendingIterator;
    }

    public final boolean equals(Object obj) {
        ListIterator listIterator;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SafeIterableMap)) {
            return false;
        }
        SafeIterableMap safeIterableMap = (SafeIterableMap) obj;
        if (this.e0 != safeIterableMap.e0) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = safeIterableMap.iterator();
        while (true) {
            listIterator = (ListIterator) it;
            if (!listIterator.hasNext()) {
                break;
            }
            ListIterator listIterator2 = (ListIterator) it2;
            if (!listIterator2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) listIterator.next();
            Object next = listIterator2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (listIterator.hasNext() || ((ListIterator) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            ListIterator listIterator = (ListIterator) it;
            if (!listIterator.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) listIterator.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        AscendingIterator ascendingIterator = new AscendingIterator(this.X, this.f3680Y);
        this.Z.put(ascendingIterator, Boolean.FALSE);
        return ascendingIterator;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(d9.i.d);
        Iterator it = iterator();
        while (true) {
            ListIterator listIterator = (ListIterator) it;
            if (!listIterator.hasNext()) {
                sb.append(d9.i.f24752e);
                return sb.toString();
            }
            sb.append(((Map.Entry) listIterator.next()).toString());
            if (listIterator.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
