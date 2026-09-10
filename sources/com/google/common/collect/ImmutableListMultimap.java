package com.google.common.collect;

import com.p004ironsource.dc;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public class ImmutableListMultimap<K, V> extends ImmutableMultimap<K, V> implements ListMultimap<K, V> {
    private static final long serialVersionUID = 0;

    public static final class Builder<K, V> extends ImmutableMultimap.Builder<K, V> {
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i2 = objectInputStream.readInt();
        if (i2 < 0) {
            throw new InvalidObjectException(android.support.v4.media.a.h(i2, "Invalid key count "));
        }
        ImmutableMap.Builder builderD = ImmutableMap.d();
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            int i5 = objectInputStream.readInt();
            if (i5 <= 0) {
                throw new InvalidObjectException(android.support.v4.media.a.h(i5, "Invalid value count "));
            }
            ImmutableList.Builder builderS = ImmutableList.s();
            for (int i6 = 0; i6 < i5; i6++) {
                Object object2 = objectInputStream.readObject();
                Objects.requireNonNull(object2);
                builderS.h(object2);
            }
            builderD.c(object, builderS.j());
            i3 += i5;
        }
        try {
            ImmutableMultimap.FieldSettersHolder.f19844a.a(this, builderD.a(true));
            Serialization.FieldSetter fieldSetter = ImmutableMultimap.FieldSettersHolder.f19845b;
            fieldSetter.getClass();
            try {
                fieldSetter.f19951a.set(this, Integer.valueOf(i3));
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        } catch (IllegalArgumentException e3) {
            throw ((InvalidObjectException) new InvalidObjectException(e3.getMessage()).initCause(e3));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Serialization.f(this, objectOutputStream);
    }

    public static ImmutableListMultimap x() {
        return EmptyImmutableListMultimap.i0;
    }

    public static ImmutableListMultimap y(String str) {
        Builder builder = new Builder();
        CollectPreconditions.a(dc.M, str);
        CompactHashMap compactHashMap = (CompactHashMap) builder.f19842a;
        Collection arrayList = (Collection) compactHashMap.get(dc.M);
        if (arrayList == null) {
            arrayList = new ArrayList();
            compactHashMap.put(dc.M, arrayList);
        }
        arrayList.add(str);
        Collection collectionEntrySet = compactHashMap.entrySet();
        if (((AbstractCollection) collectionEntrySet).isEmpty()) {
            return EmptyImmutableListMultimap.i0;
        }
        CompactHashMap.EntrySetView<Map.Entry> entrySetView = (CompactHashMap.EntrySetView) collectionEntrySet;
        ImmutableMap.Builder builder2 = new ImmutableMap.Builder(CompactHashMap.this.size());
        int size = 0;
        for (Map.Entry entry : entrySetView) {
            Object key = entry.getKey();
            ImmutableList immutableListU = ImmutableList.u((Collection) entry.getValue());
            if (!immutableListU.isEmpty()) {
                builder2.c(key, immutableListU);
                size = immutableListU.size() + size;
            }
        }
        return new ImmutableListMultimap(builder2.a(true), size);
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final Collection a(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final Collection get(Object obj) {
        ImmutableList immutableList = (ImmutableList) this.g0.get(obj);
        if (immutableList != null) {
            return immutableList;
        }
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f19830Y;
        return RegularImmutableList.f0;
    }

    @Override // com.google.common.collect.ImmutableMultimap
    /* JADX INFO: renamed from: r */
    public final ImmutableCollection get(Object obj) {
        ImmutableList immutableList = (ImmutableList) this.g0.get(obj);
        if (immutableList != null) {
            return immutableList;
        }
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f19830Y;
        return RegularImmutableList.f0;
    }

    @Override // com.google.common.collect.ImmutableMultimap
    public final ImmutableCollection w() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final List a(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final List get(Object obj) {
        ImmutableList immutableList = (ImmutableList) this.g0.get(obj);
        if (immutableList != null) {
            return immutableList;
        }
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f19830Y;
        return RegularImmutableList.f0;
    }
}
