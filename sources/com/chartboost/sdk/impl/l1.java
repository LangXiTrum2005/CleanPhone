package com.chartboost.sdk.impl;

import com.applovin.impl.Z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f14387c;
    public a0 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z f14388e;
    public boolean f;
    public boolean g;

    public l1(int i2, String location, String str, a0 a0Var, z zVar, boolean z2, boolean z3) {
        Intrinsics.f(location, "location");
        this.f14385a = i2;
        this.f14386b = location;
        this.f14387c = str;
        this.d = a0Var;
        this.f14388e = zVar;
        this.f = z2;
        this.g = z3;
    }

    public final z a() {
        return this.f14388e;
    }

    public final a0 b() {
        return this.d;
    }

    public final String c() {
        return this.f14387c;
    }

    public final String d() {
        return this.f14386b;
    }

    public final boolean e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return this.f14385a == l1Var.f14385a && Intrinsics.a(this.f14386b, l1Var.f14386b) && Intrinsics.a(this.f14387c, l1Var.f14387c) && Intrinsics.a(this.d, l1Var.d) && Intrinsics.a(this.f14388e, l1Var.f14388e) && this.f == l1Var.f && this.g == l1Var.g;
    }

    public int hashCode() {
        int iB = androidx.datastore.preferences.protobuf.a.b(this.f14386b, Integer.hashCode(this.f14385a) * 31, 31);
        String str = this.f14387c;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        a0 a0Var = this.d;
        int iHashCode2 = (iHashCode + (a0Var == null ? 0 : a0Var.hashCode())) * 31;
        z zVar = this.f14388e;
        return Boolean.hashCode(this.g) + Z.e(this.f, (iHashCode2 + (zVar != null ? zVar.hashCode() : 0)) * 31, 31);
    }

    public String toString() {
        int i2 = this.f14385a;
        String str = this.f14386b;
        String str2 = this.f14387c;
        a0 a0Var = this.d;
        z zVar = this.f14388e;
        boolean z2 = this.f;
        boolean z3 = this.g;
        StringBuilder sb = new StringBuilder("AppRequest(id=");
        sb.append(i2);
        sb.append(", location=");
        sb.append(str);
        sb.append(", bidResponse=");
        sb.append(str2);
        sb.append(", bannerData=");
        sb.append(a0Var);
        sb.append(", adUnit=");
        sb.append(zVar);
        sb.append(", isTrackedCache=");
        sb.append(z2);
        sb.append(", isTrackedShow=");
        return android.support.v4.media.a.t(sb, z3, ")");
    }

    public final void a(z zVar) {
        this.f14388e = zVar;
    }

    public final void b(boolean z2) {
        this.g = z2;
    }

    public final void a(a0 a0Var) {
        this.d = a0Var;
    }

    public final void a(String str) {
        this.f14387c = str;
    }

    public final void a(boolean z2) {
        this.f = z2;
    }

    public /* synthetic */ l1(int i2, String str, String str2, a0 a0Var, z zVar, boolean z2, boolean z3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, str, str2, (i3 & 8) != 0 ? null : a0Var, (i3 & 16) != 0 ? null : zVar, (i3 & 32) != 0 ? false : z2, (i3 & 64) != 0 ? false : z3);
    }
}
