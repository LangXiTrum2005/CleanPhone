package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class nh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14549b;

    public nh(String str, String str2) {
        this.f14548a = str;
        this.f14549b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nh)) {
            return false;
        }
        nh nhVar = (nh) obj;
        return Intrinsics.a(this.f14548a, nhVar.f14548a) && Intrinsics.a(this.f14549b, nhVar.f14549b);
    }

    public int hashCode() {
        String str = this.f14548a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f14549b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return androidx.datastore.preferences.protobuf.a.n("UniversalAdId(idRegistry=", this.f14548a, ", value=", this.f14549b, ")");
    }
}
