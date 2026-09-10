package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ph {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14861a;

    public ph(String actionName) {
        Intrinsics.f(actionName, "actionName");
        this.f14861a = actionName;
    }

    public final String a() {
        return this.f14861a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ph) && Intrinsics.a(this.f14861a, ((ph) obj).f14861a);
    }

    public int hashCode() {
        return this.f14861a.hashCode();
    }

    public String toString() {
        return android.support.v4.media.a.n("UrlActionResult(actionName=", this.f14861a, ")");
    }
}
