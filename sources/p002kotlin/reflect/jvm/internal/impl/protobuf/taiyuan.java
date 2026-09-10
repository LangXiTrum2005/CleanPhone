package p002kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: LazyField.java */
/* JADX INFO: loaded from: classes5.dex */
public class taiyuan extends cutely {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final triweekly f31183wireman;

    /* JADX INFO: compiled from: LazyField.java */
    public static class dern<K> implements Iterator<Map.Entry<K, Object>> {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public Iterator<Map.Entry<K, Object>> f31184kowloon;

        public dern(Iterator<Map.Entry<K, Object>> it) {
            this.f31184kowloon = it;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f31184kowloon.next();
            return next.getValue() instanceof taiyuan ? new saneness(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f31184kowloon.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f31184kowloon.remove();
        }
    }

    /* JADX INFO: compiled from: LazyField.java */
    public static class saneness<K> implements Map.Entry<K, Object> {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public Map.Entry<K, taiyuan> f31185kowloon;

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f31185kowloon.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            taiyuan value = this.f31185kowloon.getValue();
            if (value == null) {
                return null;
            }
            return value.marial();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof triweekly) {
                return this.f31185kowloon.getValue().wireman((triweekly) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        public saneness(Map.Entry<K, taiyuan> entry) {
            this.f31185kowloon = entry;
        }
    }

    public boolean equals(Object obj) {
        return marial().equals(obj);
    }

    public int hashCode() {
        return marial().hashCode();
    }

    public triweekly marial() {
        return dern(this.f31183wireman);
    }

    public String toString() {
        return marial().toString();
    }
}
