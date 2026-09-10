package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class ka {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14343c;
    public int d;

    public ka(int i2, int i3, int i4, int i5) {
        this.f14341a = i2;
        this.f14342b = i3;
        this.f14343c = i4;
        this.d = i5;
    }

    public final int a() {
        return this.d;
    }

    public final int b() {
        return this.f14343c;
    }

    public final int c() {
        return this.f14341a;
    }

    public final int d() {
        return this.f14342b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka)) {
            return false;
        }
        ka kaVar = (ka) obj;
        return this.f14341a == kaVar.f14341a && this.f14342b == kaVar.f14342b && this.f14343c == kaVar.f14343c && this.d == kaVar.d;
    }

    public int hashCode() {
        return Integer.hashCode(this.d) + androidx.media3.extractor.text.ttml.a.a(this.f14343c, androidx.media3.extractor.text.ttml.a.a(this.f14342b, Integer.hashCode(this.f14341a) * 31, 31), 31);
    }

    public String toString() {
        int i2 = this.f14341a;
        int i3 = this.f14342b;
        int i4 = this.f14343c;
        int i5 = this.d;
        StringBuilder sbP = androidx.datastore.preferences.protobuf.a.p(i2, i3, "IntRectangle(x=", ", y=", ", width=");
        sbP.append(i4);
        sbP.append(", height=");
        sbP.append(i5);
        sbP.append(")");
        return sbP.toString();
    }

    public final void a(int i2) {
        this.d = i2;
    }

    public final void b(int i2) {
        this.f14343c = i2;
    }

    public final void c(int i2) {
        this.f14341a = i2;
    }

    public final void d(int i2) {
        this.f14342b = i2;
    }

    public /* synthetic */ ka(int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i2, (i6 & 2) != 0 ? 0 : i3, (i6 & 4) != 0 ? 0 : i4, (i6 & 8) != 0 ? 0 : i5);
    }
}
