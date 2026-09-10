package com.google.common.collect;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class HashMultiset<E> extends AbstractMapBasedMultiset<E> {
    private static final long serialVersionUID = 0;

    @Override // com.google.common.collect.AbstractMapBasedMultiset
    public final ObjectCountHashMap o(int i2) {
        return new ObjectCountHashMap(i2, 0);
    }
}
