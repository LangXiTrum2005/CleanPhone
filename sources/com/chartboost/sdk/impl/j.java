package com.chartboost.sdk.impl;

import java.util.Map;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f14204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f14205b;

    public j(r adFormat, Map extras) {
        Intrinsics.f(adFormat, "adFormat");
        Intrinsics.f(extras, "extras");
        this.f14204a = adFormat;
        this.f14205b = extras;
    }

    public final r a() {
        return this.f14204a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f14204a == jVar.f14204a && Intrinsics.a(this.f14205b, jVar.f14205b);
    }

    public int hashCode() {
        return this.f14205b.hashCode() + (this.f14204a.hashCode() * 31);
    }

    public String toString() {
        return "AdConfig(adFormat=" + this.f14204a + ", extras=" + this.f14205b + ")";
    }

    public /* synthetic */ j(r rVar, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(rVar, (i2 & 2) != 0 ? EmptyMap.X : map);
    }
}
