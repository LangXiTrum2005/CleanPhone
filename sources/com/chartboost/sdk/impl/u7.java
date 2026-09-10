package com.chartboost.sdk.impl;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class u7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f15256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15257c;

    public u7(String name, Map attributes, String str) {
        Intrinsics.f(name, "name");
        Intrinsics.f(attributes, "attributes");
        this.f15255a = name;
        this.f15256b = attributes;
        this.f15257c = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7)) {
            return false;
        }
        u7 u7Var = (u7) obj;
        return Intrinsics.a(this.f15255a, u7Var.f15255a) && Intrinsics.a(this.f15256b, u7Var.f15256b) && Intrinsics.a(this.f15257c, u7Var.f15257c);
    }

    public int hashCode() {
        int iHashCode = (this.f15256b.hashCode() + (this.f15255a.hashCode() * 31)) * 31;
        String str = this.f15257c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f15255a;
        Map map = this.f15256b;
        String str2 = this.f15257c;
        StringBuilder sb = new StringBuilder("ExtensionChild(name=");
        sb.append(str);
        sb.append(", attributes=");
        sb.append(map);
        sb.append(", content=");
        return android.support.v4.media.a.r(sb, str2, ")");
    }
}
