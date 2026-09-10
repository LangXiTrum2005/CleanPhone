package com.chartboost.sdk.impl;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ie f14018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f14019b;

    public ge(ie target, Function0 onReached) {
        Intrinsics.f(target, "target");
        Intrinsics.f(onReached, "onReached");
        this.f14018a = target;
        this.f14019b = onReached;
    }

    public final Function0 a() {
        return this.f14019b;
    }

    public final ie b() {
        return this.f14018a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge)) {
            return false;
        }
        ge geVar = (ge) obj;
        return Intrinsics.a(this.f14018a, geVar.f14018a) && Intrinsics.a(this.f14019b, geVar.f14019b);
    }

    public int hashCode() {
        return this.f14019b.hashCode() + (this.f14018a.hashCode() * 31);
    }

    public String toString() {
        return "ProgressEvent(target=" + this.f14018a + ", onReached=" + this.f14019b + ")";
    }
}
