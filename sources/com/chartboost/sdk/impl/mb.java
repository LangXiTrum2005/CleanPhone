package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class mb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14475c;

    public mb(String mediationName, String libraryVersion, String adapterVersion) {
        Intrinsics.f(mediationName, "mediationName");
        Intrinsics.f(libraryVersion, "libraryVersion");
        Intrinsics.f(adapterVersion, "adapterVersion");
        this.f14473a = mediationName;
        this.f14474b = libraryVersion;
        this.f14475c = adapterVersion;
    }

    public final String a() {
        return this.f14475c;
    }

    public final String b() {
        return this.f14474b;
    }

    public final String c() {
        return this.f14473a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb)) {
            return false;
        }
        mb mbVar = (mb) obj;
        return Intrinsics.a(this.f14473a, mbVar.f14473a) && Intrinsics.a(this.f14474b, mbVar.f14474b) && Intrinsics.a(this.f14475c, mbVar.f14475c);
    }

    public int hashCode() {
        return this.f14475c.hashCode() + androidx.datastore.preferences.protobuf.a.b(this.f14474b, this.f14473a.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.f14473a;
        String str2 = this.f14474b;
        return android.support.v4.media.a.r(androidx.datastore.preferences.protobuf.a.q("MediationBodyFields(mediationName=", str, ", libraryVersion=", str2, ", adapterVersion="), this.f14475c, ")");
    }
}
