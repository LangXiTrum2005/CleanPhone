package com.adjust.sdk.sig;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j2 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f6972a;

    public j2(Throwable th2) {
        this.f6972a = th2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof j2) && this.f6972a.equals(((j2) obj).f6972a);
    }

    public final int hashCode() {
        return this.f6972a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f6972a + ')';
    }
}
