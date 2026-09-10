package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ni {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14552c;

    public ni(String url, String vendor, String params) {
        Intrinsics.f(url, "url");
        Intrinsics.f(vendor, "vendor");
        Intrinsics.f(params, "params");
        this.f14550a = url;
        this.f14551b = vendor;
        this.f14552c = params;
    }

    public final String a() {
        return this.f14552c;
    }

    public final String b() {
        return this.f14550a;
    }

    public final String c() {
        return this.f14551b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni)) {
            return false;
        }
        ni niVar = (ni) obj;
        return Intrinsics.a(this.f14550a, niVar.f14550a) && Intrinsics.a(this.f14551b, niVar.f14551b) && Intrinsics.a(this.f14552c, niVar.f14552c);
    }

    public int hashCode() {
        return this.f14552c.hashCode() + androidx.datastore.preferences.protobuf.a.b(this.f14551b, this.f14550a.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.f14550a;
        String str2 = this.f14551b;
        return android.support.v4.media.a.r(androidx.datastore.preferences.protobuf.a.q("VerificationModel(url=", str, ", vendor=", str2, ", params="), this.f14552c, ")");
    }
}
