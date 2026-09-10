package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class dg implements ji {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13693b;

    public dg(String str, String str2) {
        this.f13692a = str;
        this.f13693b = str2;
    }

    public final String a() {
        return this.f13692a;
    }

    public final String b() {
        return this.f13693b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dg)) {
            return false;
        }
        dg dgVar = (dg) obj;
        return Intrinsics.a(this.f13692a, dgVar.f13692a) && Intrinsics.a(this.f13693b, dgVar.f13693b);
    }

    public int hashCode() {
        String str = this.f13692a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f13693b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return androidx.datastore.preferences.protobuf.a.n("StaticResource(creativeType=", this.f13692a, ", url=", this.f13693b, ")");
    }
}
