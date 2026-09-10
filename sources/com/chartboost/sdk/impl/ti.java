package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ti {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f15235b;

    public ti(String str, List clickTracking) {
        Intrinsics.f(clickTracking, "clickTracking");
        this.f15234a = str;
        this.f15235b = clickTracking;
    }

    public final String a() {
        return this.f15234a;
    }

    public final List b() {
        return this.f15235b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ti)) {
            return false;
        }
        ti tiVar = (ti) obj;
        return Intrinsics.a(this.f15234a, tiVar.f15234a) && Intrinsics.a(this.f15235b, tiVar.f15235b);
    }

    public int hashCode() {
        String str = this.f15234a;
        return this.f15235b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return "VideoClicks(clickThrough=" + this.f15234a + ", clickTracking=" + this.f15235b + ")";
    }
}
