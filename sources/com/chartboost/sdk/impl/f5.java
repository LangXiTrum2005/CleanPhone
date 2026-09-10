package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nh f13858b;

    public f5(String str, nh nhVar) {
        this.f13857a = str;
        this.f13858b = nhVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5)) {
            return false;
        }
        f5 f5Var = (f5) obj;
        return Intrinsics.a(this.f13857a, f5Var.f13857a) && Intrinsics.a(this.f13858b, f5Var.f13858b);
    }

    public int hashCode() {
        String str = this.f13857a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        nh nhVar = this.f13858b;
        return iHashCode + (nhVar != null ? nhVar.hashCode() : 0);
    }

    public String toString() {
        return "CreativeExtension(type=" + this.f13857a + ", universalAdId=" + this.f13858b + ")";
    }
}
