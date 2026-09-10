package com.chartboost.sdk.impl;

import com.applovin.impl.Z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class x4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15511c;

    public x4(String str, boolean z2, String webViewVersion) {
        Intrinsics.f(webViewVersion, "webViewVersion");
        this.f15509a = str;
        this.f15510b = z2;
        this.f15511c = webViewVersion;
    }

    public final String a() {
        return this.f15509a;
    }

    public final boolean b() {
        return this.f15510b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4)) {
            return false;
        }
        x4 x4Var = (x4) obj;
        return Intrinsics.a(this.f15509a, x4Var.f15509a) && this.f15510b == x4Var.f15510b && Intrinsics.a(this.f15511c, x4Var.f15511c);
    }

    public int hashCode() {
        String str = this.f15509a;
        return this.f15511c.hashCode() + Z.e(this.f15510b, (str == null ? 0 : str.hashCode()) * 31, 31);
    }

    public String toString() {
        String str = this.f15509a;
        boolean z2 = this.f15510b;
        String str2 = this.f15511c;
        StringBuilder sb = new StringBuilder("ConfigurationBodyFields(configVariant=");
        sb.append(str);
        sb.append(", webViewEnabled=");
        sb.append(z2);
        sb.append(", webViewVersion=");
        return android.support.v4.media.a.r(sb, str2, ")");
    }
}
