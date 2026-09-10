package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class n9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14540c;
    public int d;

    public n9(int i2, int i3, int i4, int i5) {
        this.f14538a = i2;
        this.f14539b = i3;
        this.f14540c = i4;
        this.d = i5;
    }

    public final int a() {
        return this.f14540c;
    }

    public final int b() {
        return this.d;
    }

    public final int c() {
        return this.f14539b;
    }

    public final int d() {
        return this.f14538a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9)) {
            return false;
        }
        n9 n9Var = (n9) obj;
        return this.f14538a == n9Var.f14538a && this.f14539b == n9Var.f14539b && this.f14540c == n9Var.f14540c && this.d == n9Var.d;
    }

    public int hashCode() {
        return Integer.hashCode(this.d) + androidx.media3.extractor.text.ttml.a.a(this.f14540c, androidx.media3.extractor.text.ttml.a.a(this.f14539b, Integer.hashCode(this.f14538a) * 31, 31), 31);
    }

    public String toString() {
        int i2 = this.f14538a;
        int i3 = this.f14539b;
        int i4 = this.f14540c;
        int i5 = this.d;
        StringBuilder sbP = androidx.datastore.preferences.protobuf.a.p(i2, i3, "ImpressionCounter(onVideoCompletedPlayCount=", ", onRewardedVideoCompletedPlayCount=", ", impressionNotifyDidCompleteAdPlayCount=");
        sbP.append(i4);
        sbP.append(", impressionSendVideoCompleteRequestPlayCount=");
        sbP.append(i5);
        sbP.append(")");
        return sbP.toString();
    }

    public final void a(int i2) {
        this.f14540c = i2;
    }

    public final void b(int i2) {
        this.d = i2;
    }

    public final void c(int i2) {
        this.f14539b = i2;
    }

    public final void d(int i2) {
        this.f14538a = i2;
    }

    public /* synthetic */ n9(int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 1 : i2, (i6 & 2) != 0 ? 1 : i3, (i6 & 4) != 0 ? 1 : i4, (i6 & 8) != 0 ? 1 : i5);
    }
}
