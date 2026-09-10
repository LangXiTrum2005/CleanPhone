package com.chartboost.sdk.impl;

import com.applovin.impl.Z;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class dd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f13688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13690c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f13691e;
    public int f;
    public List g;

    public dd(boolean z2, boolean z3, int i2, int i3, long j, int i4, List list) {
        this.f13688a = z2;
        this.f13689b = z3;
        this.f13690c = i2;
        this.d = i3;
        this.f13691e = j;
        this.f = i4;
        this.g = list;
    }

    public final int a() {
        return this.f13690c;
    }

    public final int b() {
        return this.d;
    }

    public final int c() {
        return this.f;
    }

    public final boolean d() {
        return this.f13689b;
    }

    public final List e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd)) {
            return false;
        }
        dd ddVar = (dd) obj;
        return this.f13688a == ddVar.f13688a && this.f13689b == ddVar.f13689b && this.f13690c == ddVar.f13690c && this.d == ddVar.d && this.f13691e == ddVar.f13691e && this.f == ddVar.f && Intrinsics.a(this.g, ddVar.g);
    }

    public final long f() {
        return this.f13691e;
    }

    public final boolean g() {
        return this.f13688a;
    }

    public int hashCode() {
        int iA = androidx.media3.extractor.text.ttml.a.a(this.f, androidx.media3.extractor.text.ttml.a.b(androidx.media3.extractor.text.ttml.a.a(this.d, androidx.media3.extractor.text.ttml.a.a(this.f13690c, Z.e(this.f13689b, Boolean.hashCode(this.f13688a) * 31, 31), 31), 31), 31, this.f13691e), 31);
        List list = this.g;
        return iA + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        boolean z2 = this.f13688a;
        boolean z3 = this.f13689b;
        int i2 = this.f13690c;
        int i3 = this.d;
        long j = this.f13691e;
        int i4 = this.f;
        List list = this.g;
        StringBuilder sb = new StringBuilder("OmSdkModel(isEnabled=");
        sb.append(z2);
        sb.append(", verificationEnabled=");
        sb.append(z3);
        sb.append(", minVisibleDips=");
        androidx.datastore.preferences.protobuf.a.y(sb, i2, ", minVisibleDurationMs=", i3, ", visibilityCheckIntervalMs=");
        sb.append(j);
        sb.append(", traversalLimit=");
        sb.append(i4);
        sb.append(", verificationList=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ dd(boolean z2, boolean z3, int i2, int i3, long j, int i4, List list, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? false : z2, (i5 & 2) != 0 ? false : z3, (i5 & 4) != 0 ? 1 : i2, (i5 & 8) != 0 ? 0 : i3, (i5 & 16) != 0 ? 100L : j, (i5 & 32) != 0 ? 25 : i4, (i5 & 64) != 0 ? null : list);
    }
}
