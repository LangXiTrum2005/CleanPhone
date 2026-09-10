package com.chartboost.sdk.impl;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f15602b;

    public y2(int i2, byte[] data) {
        Intrinsics.f(data, "data");
        this.f15601a = i2;
        this.f15602b = data;
    }

    public final byte[] a() {
        return this.f15602b;
    }

    public final int b() {
        return this.f15601a;
    }

    public final boolean c() {
        int i2 = this.f15601a;
        return i2 >= 200 && i2 < 300;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2)) {
            return false;
        }
        y2 y2Var = (y2) obj;
        return this.f15601a == y2Var.f15601a && Intrinsics.a(this.f15602b, y2Var.f15602b);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f15602b) + (Integer.hashCode(this.f15601a) * 31);
    }

    public String toString() {
        return "CBNetworkServerResponse(statusCode=" + this.f15601a + ", data=" + Arrays.toString(this.f15602b) + ")";
    }
}
