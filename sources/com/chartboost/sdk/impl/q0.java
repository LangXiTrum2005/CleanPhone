package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ra f14867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f14868c;
    public final String d;

    public q0(String str, ra raVar, List trackingEvents, String str2) {
        Intrinsics.f(trackingEvents, "trackingEvents");
        this.f14866a = str;
        this.f14867b = raVar;
        this.f14868c = trackingEvents;
        this.d = str2;
    }

    public final ra a() {
        return this.f14867b;
    }

    public final String b() {
        return this.f14866a;
    }

    public final String c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return Intrinsics.a(this.f14866a, q0Var.f14866a) && Intrinsics.a(this.f14867b, q0Var.f14867b) && Intrinsics.a(this.f14868c, q0Var.f14868c) && Intrinsics.a(this.d, q0Var.d);
    }

    public int hashCode() {
        String str = this.f14866a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ra raVar = this.f14867b;
        int iC = androidx.media3.extractor.text.ttml.a.c((iHashCode + (raVar == null ? 0 : raVar.hashCode())) * 31, 31, this.f14868c);
        String str2 = this.d;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "AdVerification(vendor=" + this.f14866a + ", javaScriptResource=" + this.f14867b + ", trackingEvents=" + this.f14868c + ", verificationParameters=" + this.d + ")";
    }
}
