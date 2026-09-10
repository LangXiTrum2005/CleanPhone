package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
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
            return lazyField.a();
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (!(obj instanceof MessageLite)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            LazyField lazyField = (LazyField) this.X.getValue();
            MessageLite messageLite = lazyField.f44217a;
            lazyField.f44217a = (MessageLite) obj;
            return messageLite;
        }
    }

    public static class LazyIterator<K> implements Iterator<Map.Entry<K, Object>> {
        public Iterator X;

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

    public final MessageLite a() {
        if (this.f44217a == null) {
            synchronized (this) {
                if (this.f44217a == null) {
                    try {
                        this.f44217a = null;
                    } catch (IOException unused) {
                    }
                }
            }
        }
        return this.f44217a;
    }

    public final boolean equals(Object obj) {
        return a().equals(obj);
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
