package com.google.common.collect;

import com.google.errorprone.annotations.DoNotMock;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@DoNotMock
@ElementTypesAreNonnullByDefault
public interface Table<R, C, V> {

    public interface Cell<R, C, V> {
        Object d();

        Object g();

        Object getValue();
    }

    boolean equals(Object obj);

    Map g();

    int hashCode();

    Set o();

    int size();
}
