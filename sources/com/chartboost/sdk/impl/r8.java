package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r8 implements ji {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15006a;

    public r8(String str) {
        this.f15006a = str;
    }

    public final String a() {
        return this.f15006a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r8) && Intrinsics.a(this.f15006a, ((r8) obj).f15006a);
    }

    public int hashCode() {
        String str = this.f15006a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return android.support.v4.media.a.n("IFrameResource(url=", this.f15006a, ")");
    }
}
