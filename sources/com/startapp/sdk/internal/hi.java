package com.startapp.sdk.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41067a;

    public hi(String code) {
        Intrinsics.f(code, "code");
        this.f41067a = code;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!hi.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.d(obj, "null cannot be cast to non-null type com.startapp.sdk.eventtracer.Traceable");
        return Intrinsics.a(this.f41067a, ((hi) obj).f41067a);
    }

    public final int hashCode() {
        return this.f41067a.hashCode();
    }
}
