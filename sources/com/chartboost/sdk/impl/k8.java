package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k8 implements ji {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14337a;

    public k8(String str) {
        this.f14337a = str;
    }

    public final String a() {
        return this.f14337a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k8) && Intrinsics.a(this.f14337a, ((k8) obj).f14337a);
    }

    public int hashCode() {
        String str = this.f14337a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return android.support.v4.media.a.n("HtmlResource(html=", this.f14337a, ")");
    }
}
