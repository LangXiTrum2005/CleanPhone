package com.google.gson;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ae.q f24754a = new ae.q(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof j) && ((j) obj).f24754a.equals(this.f24754a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f24754a.hashCode();
    }
}
