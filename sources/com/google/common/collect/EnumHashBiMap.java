package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class EnumHashBiMap<K extends Enum<K>, V> extends AbstractBiMap<K, V> {
    private static final long serialVersionUID = 0;
    public transient Class g0;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        Objects.requireNonNull(object);
        this.g0 = (Class) object;
        B(new EnumMap(this.g0), new HashMap());
        Serialization.b(this, objectInputStream, objectInputStream.readInt());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.g0);
        Serialization.e(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.BiMap
    public final BiMap H() {
        return this.f19776Y;
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f19776Y.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        return super.put((Enum) obj, obj2);
    }

    @Override // com.google.common.collect.AbstractBiMap
    public final Object z(Object obj) {
        Enum r1 = (Enum) obj;
        r1.getClass();
        return r1;
    }
}
