package com.google.common.collect;

import java.util.SortedMap;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public interface RowSortedTable<R, C, V> extends Table<R, C, V> {
    @Override // com.google.common.collect.Table
    SortedMap g();
}
