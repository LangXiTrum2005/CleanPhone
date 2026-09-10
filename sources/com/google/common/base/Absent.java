package com.google.common.base;

import com.google.common.collect.FluentIterable;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class Absent<T> extends Optional<T> {
    public static final Absent X = new Absent();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return X;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // com.google.common.base.Optional
    public final Object g() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.common.base.Optional
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return 2040732332;
    }

    @Override // com.google.common.base.Optional
    public final Object k() {
        return null;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    @Override // com.google.common.base.Optional
    public final Object j(FluentIterable fluentIterable) {
        return fluentIterable;
    }
}
