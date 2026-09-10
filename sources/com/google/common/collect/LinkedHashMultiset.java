package com.google.common.collect;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class LinkedHashMultiset<E> extends AbstractMapBasedMultiset<E> {
    @Override // com.google.common.collect.AbstractMapBasedMultiset
    public final ObjectCountHashMap o(int i2) {
        return new ObjectCountLinkedHashMap(i2, 0);
    }
}
