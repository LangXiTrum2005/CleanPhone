package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class K6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f22923b;

    public K6(int i2) {
        this.f22922a = i2;
        this.f22923b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K6)) {
            return false;
        }
        K6 k6 = (K6) obj;
        return this.f22922a == k6.f22922a && Intrinsics.a(this.f22923b, k6.f22923b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f22922a) * 31;
        Integer num = this.f22923b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "OpenRequestResultData(result=" + this.f22922a + ", errorCode=" + this.f22923b + ')';
    }

    public K6(int i2, Integer num) {
        this.f22922a = i2;
        this.f22923b = num;
    }
}
