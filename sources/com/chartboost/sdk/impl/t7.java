package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class t7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f15185c;

    public t7(String str, String str2, List children) {
        Intrinsics.f(children, "children");
        this.f15183a = str;
        this.f15184b = str2;
        this.f15185c = children;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7)) {
            return false;
        }
        t7 t7Var = (t7) obj;
        return Intrinsics.a(this.f15183a, t7Var.f15183a) && Intrinsics.a(this.f15184b, t7Var.f15184b) && Intrinsics.a(this.f15185c, t7Var.f15185c);
    }

    public int hashCode() {
        String str = this.f15183a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f15184b;
        return this.f15185c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.f15183a;
        String str2 = this.f15184b;
        List list = this.f15185c;
        StringBuilder sbQ = androidx.datastore.preferences.protobuf.a.q("Extension(type=", str, ", content=", str2, ", children=");
        sbQ.append(list);
        sbQ.append(")");
        return sbQ.toString();
    }
}
