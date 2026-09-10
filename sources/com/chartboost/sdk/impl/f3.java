package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f13856b;

    public f3(String url, Boolean bool) {
        Intrinsics.f(url, "url");
        this.f13855a = url;
        this.f13856b = bool;
    }

    public final Boolean a() {
        return this.f13856b;
    }

    public final String b() {
        return this.f13855a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3)) {
            return false;
        }
        f3 f3Var = (f3) obj;
        return Intrinsics.a(this.f13855a, f3Var.f13855a) && Intrinsics.a(this.f13856b, f3Var.f13856b);
    }

    public int hashCode() {
        int iHashCode = this.f13855a.hashCode() * 31;
        Boolean bool = this.f13856b;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        return "CBUrl(url=" + this.f13855a + ", shouldDismiss=" + this.f13856b + ")";
    }
}
