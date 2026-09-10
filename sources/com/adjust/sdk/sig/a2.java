package com.adjust.sdk.sig;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a2 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f6923b;

    public a2(Class cls, Integer num) {
        this.f6922a = cls;
        this.f6923b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return g1.a(this.f6922a, a2Var.f6922a) && this.f6923b.equals(a2Var.f6923b);
    }

    public final int hashCode() {
        Object obj = this.f6922a;
        return this.f6923b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "(" + this.f6922a + ", " + this.f6923b + ')';
    }
}
