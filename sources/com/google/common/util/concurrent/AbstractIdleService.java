package com.google.common.util.concurrent;

import com.google.common.base.Supplier;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractIdleService implements Service {

    public final class DelegateService extends AbstractService {
        @Override // com.google.common.util.concurrent.AbstractService
        public final String toString() {
            throw null;
        }
    }

    public final class ThreadNameSupplier implements Supplier<String> {
        @Override // com.google.common.base.Supplier
        public final Object get() {
            throw null;
        }
    }

    public final String toString() {
        throw null;
    }
}
