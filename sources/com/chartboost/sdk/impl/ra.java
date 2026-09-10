package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f15012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15013c;

    public ra(String str, Boolean bool, String str2) {
        this.f15011a = str;
        this.f15012b = bool;
        this.f15013c = str2;
    }

    public final String a() {
        return this.f15011a;
    }

    public final String b() {
        return this.f15013c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        return Intrinsics.a(this.f15011a, raVar.f15011a) && Intrinsics.a(this.f15012b, raVar.f15012b) && Intrinsics.a(this.f15013c, raVar.f15013c);
    }

    public int hashCode() {
        String str = this.f15011a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.f15012b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f15013c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f15011a;
        Boolean bool = this.f15012b;
        String str2 = this.f15013c;
        StringBuilder sb = new StringBuilder("JavaScriptResource(apiFramework=");
        sb.append(str);
        sb.append(", browserOptional=");
        sb.append(bool);
        sb.append(", uri=");
        return android.support.v4.media.a.r(sb, str2, ")");
    }
}
