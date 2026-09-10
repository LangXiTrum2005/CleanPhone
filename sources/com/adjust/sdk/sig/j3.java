package com.adjust.sdk.sig;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j3 implements u1, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g0 f6973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f6974b = l3.f6982a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6975c = this;

    public j3(g0 g0Var) {
        this.f6973a = g0Var;
    }

    @Override // com.adjust.sdk.sig.u1
    public final Object getValue() {
        Object objA;
        Object obj = this.f6974b;
        l3 l3Var = l3.f6982a;
        if (obj != l3Var) {
            return obj;
        }
        synchronized (this.f6975c) {
            objA = this.f6974b;
            if (objA == l3Var) {
                objA = this.f6973a.a();
                this.f6974b = objA;
                this.f6973a = null;
            }
        }
        return objA;
    }

    public final String toString() {
        return this.f6974b != l3.f6982a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
