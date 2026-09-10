package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f22911a;

    public w(Object obj) {
        this.f22911a = obj;
    }

    @Override // com.google.android.gms.internal.auth.v
    public final Object d() {
        return this.f22911a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            return this.f22911a.equals(((w) obj).f22911a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.auth.v
    public final boolean g() {
        return true;
    }

    public final int hashCode() {
        return this.f22911a.hashCode() + 1502476572;
    }

    public final String toString() {
        return defpackage.e.o("Optional.of(", this.f22911a.toString(), ")");
    }
}
