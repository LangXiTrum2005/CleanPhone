package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class HashMultimap<K, V> extends HashMultimapGwtSerializationDependencies<K, V> {
    private static final long serialVersionUID = 0;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i2 = objectInputStream.readInt();
        w(new CompactHashMap(12));
        Serialization.c(this, objectInputStream, i2);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Serialization.f(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    /* JADX INFO: renamed from: A */
    public final Set o() {
        return new CompactHashSet(2);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public final boolean containsKey(Object obj) {
        return this.g0.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public final int size() {
        return this.h0;
    }
}
