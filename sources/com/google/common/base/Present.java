package com.google.common.base;

import android.support.v4.media.a;
import com.google.common.collect.FluentIterable;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class Present<T> extends Optional<T> {
    private static final long serialVersionUID = 0;
    public final Object X;

    public Present(Object obj) {
        this.X = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Present) {
            return this.X.equals(((Present) obj).X);
        }
        return false;
    }

    @Override // com.google.common.base.Optional
    public final Object g() {
        return this.X;
    }

    @Override // com.google.common.base.Optional
    public final boolean h() {
        return true;
    }

    public final int hashCode() {
        return this.X.hashCode() + 1502476572;
    }

    @Override // com.google.common.base.Optional
    public final Object j(FluentIterable fluentIterable) {
        return this.X;
    }

    @Override // com.google.common.base.Optional
    public final Object k() {
        return this.X;
    }

    public final String toString() {
        return a.q(new StringBuilder("Optional.of("), this.X, ")");
    }
}
