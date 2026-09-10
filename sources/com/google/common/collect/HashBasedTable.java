package com.google.common.collect;

import com.google.common.base.Supplier;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public class HashBasedTable<R, C, V> extends StandardTable<R, C, V> {
    private static final long serialVersionUID = 0;

    public static class Factory<C, V> implements Supplier<Map<C, V>>, Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.Supplier
        public final Object get() {
            return new LinkedHashMap(Maps.c(0));
        }
    }

    @Override // com.google.common.collect.StandardTable
    public final Map p(Object obj) {
        return new StandardTable.Column(obj);
    }

    @Override // com.google.common.collect.StandardTable
    public final Map z(Object obj) {
        return new StandardTable.Row(obj);
    }
}
