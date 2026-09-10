package com.google.common.util.concurrent;

import com.google.common.base.Function;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class AtomicLongMap<K> implements Serializable {

    /* JADX INFO: renamed from: com.google.common.util.concurrent.AtomicLongMap$1, reason: invalid class name */
    class AnonymousClass1 implements Function<AtomicLong, Long> {
        @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
        public final Object apply(Object obj) {
            return Long.valueOf(((AtomicLong) obj).get());
        }
    }

    public final String toString() {
        throw null;
    }
}
