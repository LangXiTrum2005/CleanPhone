package com.google.common.cache;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public enum RemovalCause {
    X { // from class: com.google.common.cache.RemovalCause.1
        @Override // com.google.common.cache.RemovalCause
        public final boolean d() {
            return false;
        }
    },
    f19771Y { // from class: com.google.common.cache.RemovalCause.2
        @Override // com.google.common.cache.RemovalCause
        public final boolean d() {
            return false;
        }
    },
    Z { // from class: com.google.common.cache.RemovalCause.3
        @Override // com.google.common.cache.RemovalCause
        public final boolean d() {
            return true;
        }
    },
    e0 { // from class: com.google.common.cache.RemovalCause.4
        @Override // com.google.common.cache.RemovalCause
        public final boolean d() {
            return true;
        }
    },
    f0 { // from class: com.google.common.cache.RemovalCause.5
        @Override // com.google.common.cache.RemovalCause
        public final boolean d() {
            return true;
        }
    };

    public abstract boolean d();
}
