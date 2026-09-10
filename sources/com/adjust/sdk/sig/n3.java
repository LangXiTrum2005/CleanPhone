package com.adjust.sdk.sig;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n3 implements u1, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g0 f6991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f6992b = l3.f6982a;

    public n3(g0 g0Var) {
        this.f6991a = g0Var;
    }

    @Override // com.adjust.sdk.sig.u1
    public final Object getValue() {
        if (this.f6992b == l3.f6982a) {
            this.f6992b = this.f6991a.a();
            this.f6991a = null;
        }
        return this.f6992b;
    }

    public final String toString() {
        return this.f6992b != l3.f6982a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
