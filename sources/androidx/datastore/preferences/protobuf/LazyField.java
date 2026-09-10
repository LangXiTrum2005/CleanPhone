package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class LazyField extends LazyFieldLite {

    public static class LazyEntry<K> implements Map.Entry<K, Object> {
        public Map.Entry X;

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.X.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            LazyField lazyField = (LazyField) this.X.getValue();
            if (lazyField == null) {
                return null;
            }
            return lazyField.a(null);
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (!(obj instanceof MessageLite)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            LazyField lazyField = (LazyField) this.X.getValue();
            MessageLite messageLite = lazyField.f4865a;
            lazyField.f4866b = null;
            lazyField.f4865a = (MessageLite) obj;
            return messageLite;
        }
    }

    public static class LazyIterator<K> implements Iterator<Map.Entry<K, Object>> {
        public final Iterator X;

        public LazyIterator(Iterator it) {
            this.X = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.X.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Map.Entry entry = (Map.Entry) this.X.next();
            if (!(entry.getValue() instanceof LazyField)) {
                return entry;
            }
            LazyEntry lazyEntry = new LazyEntry();
            lazyEntry.X = entry;
            return lazyEntry;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.X.remove();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.LazyFieldLite
    public final boolean equals(Object obj) {
        return a(null).equals(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.LazyFieldLite
    public final int hashCode() {
        return a(null).hashCode();
    }

    public final String toString() {
        return a(null).toString();
    }
}
