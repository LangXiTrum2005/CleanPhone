package com.google.common.collect;

import com.google.common.primitives.Primitives;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class MutableClassToInstanceMap<B> extends ForwardingMap<Class<? extends B>, B> implements ClassToInstanceMap<B>, Serializable {

    public static final class SerializedForm<B> implements Serializable {
        private static final long serialVersionUID = 0;

        public Object readResolve() {
            throw null;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    private Object writeReplace() {
        throw null;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public final Set entrySet() {
        return new ForwardingSet<Map.Entry<Class<Object>, Object>>() { // from class: com.google.common.collect.MutableClassToInstanceMap.2

            /* JADX INFO: renamed from: com.google.common.collect.MutableClassToInstanceMap$2$1, reason: invalid class name */
            class AnonymousClass1 extends TransformedIterator<Map.Entry<Class<Object>, Object>, Map.Entry<Class<Object>, Object>> {
                @Override // com.google.common.collect.TransformedIterator
                public final Object a(Object obj) {
                    final Map.Entry entry = (Map.Entry) obj;
                    return new ForwardingMapEntry<Class<Object>, Object>() { // from class: com.google.common.collect.MutableClassToInstanceMap.1
                        @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
                        public final Object setValue(Object obj2) {
                            Class cls = (Class) getKey();
                            Map map = Primitives.f20062a;
                            cls.getClass();
                            Class cls2 = (Class) Primitives.f20062a.get(cls);
                            if (cls2 != null) {
                                cls = cls2;
                            }
                            cls.cast(obj2);
                            return super.setValue(obj2);
                        }

                        @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
                        /* JADX INFO: renamed from: w */
                        public final Object x() {
                            return entry;
                        }

                        @Override // com.google.common.collect.ForwardingMapEntry
                        /* JADX INFO: renamed from: x */
                        public final Map.Entry w() {
                            return entry;
                        }
                    };
                }
            }

            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
            /* JADX INFO: renamed from: A */
            public final Set x() {
                throw null;
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator iterator() {
                return new AnonymousClass1(x().iterator());
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
            public final Object[] toArray() {
                return y();
            }

            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
            /* JADX INFO: renamed from: w */
            public final Object x() {
                throw null;
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
            public final Object[] toArray(Object[] objArr) {
                return ObjectArrays.c(this, objArr);
            }
        };
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        Class cls = (Class) obj;
        Map map = Primitives.f20062a;
        cls.getClass();
        Class cls2 = (Class) Primitives.f20062a.get(cls);
        if (cls2 == null) {
            cls2 = cls;
        }
        cls2.cast(obj2);
        return super.put(cls, obj2);
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public final void putAll(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Class cls = (Class) entry.getKey();
            Object value = entry.getValue();
            Map map2 = Primitives.f20062a;
            cls.getClass();
            Class cls2 = (Class) Primitives.f20062a.get(cls);
            if (cls2 != null) {
                cls = cls2;
            }
            cls.cast(value);
        }
        super.putAll(linkedHashMap);
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    /* JADX INFO: renamed from: w */
    public final Object x() {
        throw null;
    }

    @Override // com.google.common.collect.ForwardingMap
    /* JADX INFO: renamed from: x */
    public final Map w() {
        throw null;
    }
}
