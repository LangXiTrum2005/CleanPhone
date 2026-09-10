package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: LazyField.java */
/* JADX INFO: loaded from: classes3.dex */
public class cuirassed extends stratoscope {

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final privatdozent f22181marial;

    /* JADX INFO: compiled from: LazyField.java */
    public static class dern<K> implements Iterator<Map.Entry<K, Object>> {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public Iterator<Map.Entry<K, Object>> f22182kowloon;

        public dern(Iterator<Map.Entry<K, Object>> it) {
            this.f22182kowloon = it;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f22182kowloon.next();
            return next.getValue() instanceof cuirassed ? new saneness(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f22182kowloon.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f22182kowloon.remove();
        }
    }

    /* JADX INFO: compiled from: LazyField.java */
    public static class saneness<K> implements Map.Entry<K, Object> {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public Map.Entry<K, cuirassed> f22183kowloon;

        public cuirassed attabal() {
            return this.f22183kowloon.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f22183kowloon.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            cuirassed value = this.f22183kowloon.getValue();
            if (value == null) {
                return null;
            }
            return value.beachfront();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof privatdozent) {
                return this.f22183kowloon.getValue().wireman((privatdozent) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        public saneness(Map.Entry<K, cuirassed> entry) {
            this.f22183kowloon = entry;
        }
    }

    public privatdozent beachfront() {
        return dern(this.f22181marial);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.stratoscope
    public boolean equals(Object obj) {
        return beachfront().equals(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.stratoscope
    public int hashCode() {
        return beachfront().hashCode();
    }

    public String toString() {
        return beachfront().toString();
    }
}
