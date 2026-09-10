package com.google.common.util.concurrent;

import com.google.errorprone.annotations.DoNotMock;

/* JADX INFO: loaded from: classes4.dex */
@DoNotMock
@ElementTypesAreNonnullByDefault
public abstract class FluentFuture<V> extends GwtFluentFutureCatchingSpecialization<V> {

    public static abstract class TrustedFuture<V> extends FluentFuture<V> implements AbstractFuture.Trusted<V> {
        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean isCancelled() {
            return this.X instanceof AbstractFuture.Cancellation;
        }
    }
}
