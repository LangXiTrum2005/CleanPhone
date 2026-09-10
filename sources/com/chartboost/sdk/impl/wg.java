package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class wg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15491c;
    public final String d;

    public wg(String url, String method, String str, String str2) {
        Intrinsics.f(url, "url");
        Intrinsics.f(method, "method");
        this.f15489a = url;
        this.f15490b = method;
        this.f15491c = str;
        this.d = str2;
    }

    public final String a() {
        return this.f15491c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f15490b;
    }

    public final String d() {
        return this.f15489a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wg)) {
            return false;
        }
        wg wgVar = (wg) obj;
        return Intrinsics.a(this.f15489a, wgVar.f15489a) && Intrinsics.a(this.f15490b, wgVar.f15490b) && Intrinsics.a(this.f15491c, wgVar.f15491c) && Intrinsics.a(this.d, wgVar.d);
    }

    public int hashCode() {
        int iB = androidx.datastore.preferences.protobuf.a.b(this.f15490b, this.f15489a.hashCode() * 31, 31);
        String str = this.f15491c;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f15489a;
        String str2 = this.f15490b;
        return androidx.media3.extractor.text.ttml.a.q(androidx.datastore.preferences.protobuf.a.q("TrackerConfig(url=", str, ", method=", str2, ", bodyTemplate="), this.f15491c, ", contentType=", this.d, ")");
    }

    public /* synthetic */ wg(String str, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4);
    }
}
