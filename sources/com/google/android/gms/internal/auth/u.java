package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f22908a = new u();

    @Override // com.google.android.gms.internal.auth.v
    public final Object d() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // com.google.android.gms.internal.auth.v
    public final boolean g() {
        return false;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
