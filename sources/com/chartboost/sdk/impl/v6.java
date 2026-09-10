package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ig f15391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f15392b;

    public v6(ig eventData, List pendingTrackers) {
        Intrinsics.f(eventData, "eventData");
        Intrinsics.f(pendingTrackers, "pendingTrackers");
        this.f15391a = eventData;
        this.f15392b = pendingTrackers;
    }

    public final ig a() {
        return this.f15391a;
    }

    public final List b() {
        return this.f15392b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6)) {
            return false;
        }
        v6 v6Var = (v6) obj;
        return Intrinsics.a(this.f15391a, v6Var.f15391a) && Intrinsics.a(this.f15392b, v6Var.f15392b);
    }

    public int hashCode() {
        return this.f15392b.hashCode() + (this.f15391a.hashCode() * 31);
    }

    public String toString() {
        return "EventProcessingRequest(eventData=" + this.f15391a + ", pendingTrackers=" + this.f15392b + ")";
    }
}
