package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: LazyField.java */
/* JADX INFO: loaded from: classes.dex */
public class cord extends cuirassed {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final saran f9698wireman;

    /* JADX INFO: compiled from: LazyField.java */
    public static class dern<K> implements Iterator<Map.Entry<K, Object>> {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public Iterator<Map.Entry<K, Object>> f9699kowloon;

        public dern(Iterator<Map.Entry<K, Object>> it) {
            this.f9699kowloon = it;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f9699kowloon.next();
            return next.getValue() instanceof cord ? new saneness(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9699kowloon.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f9699kowloon.remove();
        }
    }

    /* JADX INFO: compiled from: LazyField.java */
    public static class saneness<K> implements Map.Entry<K, Object> {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public Map.Entry<K, cord> f9700kowloon;

        public cord attabal() {
            return this.f9700kowloon.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f9700kowloon.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            cord value = this.f9700kowloon.getValue();
            if (value == null) {
                return null;
            }
            return value.beachfront();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof saran) {
                return this.f9700kowloon.getValue().wireman((saran) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        public saneness(Map.Entry<K, cord> entry) {
            this.f9700kowloon = entry;
        }
    }

    public saran beachfront() {
        return dern(this.f9698wireman);
    }

    @Override // androidx.datastore.preferences.protobuf.cuirassed
    public boolean equals(Object obj) {
        return beachfront().equals(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.cuirassed
    public int hashCode() {
        return beachfront().hashCode();
    }

    public String toString() {
        return beachfront().toString();
    }
}
