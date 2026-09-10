package com.chartboost.sdk.impl;

import com.applovin.impl.Z;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ah {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f13462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13463c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13464e;
    public final boolean f;
    public final int g;

    public ah(boolean z2, List blackList, String endpoint, int i2, int i3, boolean z3, int i4) {
        Intrinsics.f(blackList, "blackList");
        Intrinsics.f(endpoint, "endpoint");
        this.f13461a = z2;
        this.f13462b = blackList;
        this.f13463c = endpoint;
        this.d = i2;
        this.f13464e = i3;
        this.f = z3;
        this.g = i4;
    }

    public final List a() {
        return this.f13462b;
    }

    public final String b() {
        return this.f13463c;
    }

    public final int c() {
        return this.d;
    }

    public final boolean d() {
        return this.f;
    }

    public final int e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ah)) {
            return false;
        }
        ah ahVar = (ah) obj;
        return this.f13461a == ahVar.f13461a && Intrinsics.a(this.f13462b, ahVar.f13462b) && Intrinsics.a(this.f13463c, ahVar.f13463c) && this.d == ahVar.d && this.f13464e == ahVar.f13464e && this.f == ahVar.f && this.g == ahVar.g;
    }

    public final int f() {
        return this.f13464e;
    }

    public final boolean g() {
        return this.f13461a;
    }

    public int hashCode() {
        return Integer.hashCode(this.g) + Z.e(this.f, androidx.media3.extractor.text.ttml.a.a(this.f13464e, androidx.media3.extractor.text.ttml.a.a(this.d, androidx.datastore.preferences.protobuf.a.b(this.f13463c, androidx.media3.extractor.text.ttml.a.c(Boolean.hashCode(this.f13461a) * 31, 31, this.f13462b), 31), 31), 31), 31);
    }

    public String toString() {
        boolean z2 = this.f13461a;
        List list = this.f13462b;
        String str = this.f13463c;
        int i2 = this.d;
        int i3 = this.f13464e;
        boolean z3 = this.f;
        int i4 = this.g;
        StringBuilder sb = new StringBuilder("TrackingConfig(isEnabled=");
        sb.append(z2);
        sb.append(", blackList=");
        sb.append(list);
        sb.append(", endpoint=");
        sb.append(str);
        sb.append(", eventLimit=");
        sb.append(i2);
        sb.append(", windowDuration=");
        sb.append(i3);
        sb.append(", persistenceEnabled=");
        sb.append(z3);
        sb.append(", persistenceMaxEvents=");
        return android.support.v4.media.a.i(i4, ")", sb);
    }

    public /* synthetic */ ah(boolean z2, List list, String str, int i2, int i3, boolean z3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? false : z2, (i5 & 2) != 0 ? bh.a() : list, (i5 & 4) != 0 ? "https://ssp-events.chartboost.com/track/sdk" : str, (i5 & 8) != 0 ? 10 : i2, (i5 & 16) != 0 ? 60 : i3, (i5 & 32) != 0 ? true : z3, (i5 & 64) != 0 ? 100 : i4);
    }
}
