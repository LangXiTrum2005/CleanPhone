package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class qh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c4 f14963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14964c;

    public qh(String url, c4 clickPreference, boolean z2) {
        Intrinsics.f(url, "url");
        Intrinsics.f(clickPreference, "clickPreference");
        this.f14962a = url;
        this.f14963b = clickPreference;
        this.f14964c = z2;
    }

    public final qh a(String url, c4 clickPreference, boolean z2) {
        Intrinsics.f(url, "url");
        Intrinsics.f(clickPreference, "clickPreference");
        return new qh(url, clickPreference, z2);
    }

    public final String b() {
        return this.f14962a;
    }

    public final boolean c() {
        return this.f14964c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh)) {
            return false;
        }
        qh qhVar = (qh) obj;
        return Intrinsics.a(this.f14962a, qhVar.f14962a) && this.f14963b == qhVar.f14963b && this.f14964c == qhVar.f14964c;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f14964c) + ((this.f14963b.hashCode() + (this.f14962a.hashCode() * 31)) * 31);
    }

    public String toString() {
        String str = this.f14962a;
        c4 c4Var = this.f14963b;
        boolean z2 = this.f14964c;
        StringBuilder sb = new StringBuilder("UrlArgs(url=");
        sb.append(str);
        sb.append(", clickPreference=");
        sb.append(c4Var);
        sb.append(", userGesture=");
        return android.support.v4.media.a.t(sb, z2, ")");
    }

    public static /* synthetic */ qh a(qh qhVar, String str, c4 c4Var, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = qhVar.f14962a;
        }
        if ((i2 & 2) != 0) {
            c4Var = qhVar.f14963b;
        }
        if ((i2 & 4) != 0) {
            z2 = qhVar.f14964c;
        }
        return qhVar.a(str, c4Var, z2);
    }

    public final c4 a() {
        return this.f14963b;
    }
}
