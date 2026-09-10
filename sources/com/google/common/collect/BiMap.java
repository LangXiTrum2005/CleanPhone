package com.google.common.collect;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public interface BiMap<K, V> extends Map<K, V> {
    BiMap H();

    @Override // java.util.Map
    Set values();
}
